select zsse_DropView ('i_pricelist_v');
CREATE OR REPLACE VIeW i_pricelist_v as
select M_PRICELIST_VERSION_ID||M_PRODUCT_ID as i_pricelist_v_id,
 M_PRICELIST_VERSION_ID,
 M_PRODUCT_ID,
 AD_CLIENT_ID,
 AD_ORG_ID,
 CREATEDBY,
 created,
 UPDATEDBY,
 updated,
 isactive,
 PRICELIST,
 PRICESTD,
 PRICELIMIT from m_productprice;


CREATE or replace FUNCTION  i_import_pricelist(p_filename varchar,p_user varchar) RETURNS varchar
AS $_$
DECLARE

ad_client character varying:='C726FEC915A54A0995C568555DA5BB3C';
v_org character varying;
v_pversion character varying;
v_productid varchar;
v_cur2 RECORD;
v_cmd varchar;
v_i numeric:=0;
BEGIN
 if p_filename is null then return 'ERROR'; end if;
  delete from i_productpriceimport;
  -- Datei in Tabelle
  v_cmd := 'COPY i_productpriceimport  FROM ''' || p_filename ||''' CSV DELIMITER as '||chr(39)||','||chr(39)||' HEADER ;';
  RAISE notice '%', v_cmd;
  EXECUTE(v_cmd);
 
    
    
    for v_cur2 in (select * from i_productpriceimport)
    LOOP
        select m_product_id into v_productid from m_product where value||' - '||name=v_cur2.productvalue_key;
        select m_pricelist_version_id,ad_org_id into v_pversion,v_org from m_pricelist_version where name=v_cur2.pricelistversion_key;
        if v_pversion is null  or v_productid is null then
            raise exception '%', 'No Data Found for Pricelist:'||coalesce(v_cur2.pricelistversion_key,'NULL')||' and Product:'||coalesce(v_cur2.productvalue_key,'NULL');
        end if;
        delete from m_productprice where m_product_id=v_productid and m_pricelist_version_id=v_pversion;
        insert into m_productprice (m_productprice_id,AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY,m_product_ID,m_pricelist_version_id,
                               isactive,pricelist,pricestd ,pricelimit)
               values(get_uuid(),ad_client,v_org,now(),p_user,now(),p_user,v_productid,v_pversion,
                      'Y',to_number(v_cur2.pricelist),to_number(v_cur2.pricestd) ,to_number(v_cur2.pricelimit));
        v_i:=v_i+1;
    END LOOP;
    return v_i||'Positionen in Preisliste importiert';  
END;
$_$  LANGUAGE 'plpgsql';



select zsse_DropView ('i_product_v');
CREATE OR REPLACE VIeW i_product_v as
select M_PRODUCT_ID as i_product_v_id,
 AD_CLIENT_ID,
 AD_ORG_ID,
 CREATEDBY,
 created,
 UPDATEDBY,
 updated,
 isactive,
 imageurl ,
 value ,
 name ,
  descriptionurl ,
   upc ,
 description ,
 documentnote ,
 c_uom_id ,
 isstocked ,
 m_product_category_id ,
 volume ,
 weight ,
 shelfwidth ,
 shelfheight ,
 shelfdepth ,
 unitsperpallet ,
 discontinued ,
 discontinuedby ,
 producttype ,
 m_attributeset_id ,
 m_locator_id ,
  ispurchased ,
 issold ,
 isbom ,
 calculated ,
 production ,
 c_tax_id ,
 typeofproduct ,
 isserviceitem ,
 isconsumable ,
 issparepart ,
 isfreightproduct ,
 issetitem ,
 isserialtracking ,
 isbatchtracking ,
 cusomstarifno ,
 c_country_id ,
 basepriceunit ,
 basepricemultiplicator,
 manufacturer,
 manufacturernumber
 from m_product;

 
CREATE or replace FUNCTION  i_import_product(p_filename varchar,p_user varchar) RETURNS varchar
AS $_$
DECLARE

v_client character varying:='C726FEC915A54A0995C568555DA5BB3C';
v_org character varying;
v_pversion character varying;
v_productid varchar;
v_pcat varchar;
v_cur2 RECORD;
v_cmd varchar;
v_i numeric:=0;
v_ii numeric:=0;
v_uom varchar;
v_type varchar;
v_ptype varchar;
v_locat varchar;
v_country varchar;
v_tax varchar;
v_bpuom varchar;
v_lang varchar;
BEGIN
 if p_filename is null then return 'ERROR'; end if;
  delete from i_productimport;
  -- Datei in Tabelle
  v_cmd := 'COPY i_productimport  FROM ''' || p_filename ||''' CSV DELIMITER as '||chr(39)||','||chr(39)||' HEADER ;';
  RAISE notice '%', v_cmd;
  EXECUTE(v_cmd);
 
    select ad_language into v_lang from ad_client  where ad_client_id=v_client;
    
    for v_cur2 in (select * from i_productimport)
    LOOP
        select m_product_id into v_productid from m_product where value=v_cur2.value;
        select m_product_category_id into v_pcat from m_product_category where name=v_cur2.m_product_category_id;
    --    if  v_pcat is null then
    --        select m_product_category_id into v_pcat from m_product_category_trl where ad_language = 'en_US' and  name=v_cur2.m_product_category_id;
    --    end if;
    --    if  v_pcat is null then
    --        select m_product_category_id into v_pcat from m_product_category_trl where ad_language = v_lang and  name=v_cur2.m_product_category_id;
    --    end if;
        if v_pcat is null then
            raise exception '%', 'Product Category not Found:'||v_cur2.m_product_category_id;
        end if;
        select ad_org_id into v_org from ad_org where name=v_cur2.ad_org_id;
        if v_cur2.ad_org_id='*' then v_org:='0'; end if;
        if v_org is null then
            raise exception '%', 'Organization not Found:'||v_cur2.ad_org_id;
        end if;
        select value into v_type from ad_ref_list where ad_reference_id='D3CE5ED8E56C43E19FA09D10B616BCAA' and name=v_cur2.typeofproduct;
        if  v_type is null then
            select a.value into v_type from ad_ref_list_trl t, ad_ref_list a where t.ad_language = 'en_US' and a.ad_reference_id='D3CE5ED8E56C43E19FA09D10B616BCAA' and t.name=v_cur2.typeofproduct and t.ad_ref_list_id = a.ad_ref_list_id;
        end if;
        if  v_type is null then
            select a.value into v_type from ad_ref_list_trl t, ad_ref_list a where t.ad_language = v_lang and a.ad_reference_id='D3CE5ED8E56C43E19FA09D10B616BCAA' and t.name=v_cur2.typeofproduct and t.ad_ref_list_id = a.ad_ref_list_id;
        end if;
        if  v_type is null then
            raise exception '%', 'Product Type not Found:'||v_cur2.typeofproduct;
        end if;
        select c_uom_id into v_uom from c_uom where name=v_cur2.c_uom_id;
        if  v_uom is null then
            select c_uom_id into v_uom from c_uom_trl where ad_language = 'en_US' and name=v_cur2.c_uom_id; 
        end if;
        if  v_uom is null then
            select c_uom_id into v_uom from c_uom_trl where ad_language = v_lang and name=v_cur2.c_uom_id; 
        end if;
        if  v_uom is null then
            raise exception '%', 'Unit of Measure not Found:'||v_cur2.c_uom_id;
        end if;
        select value into v_ptype from ad_ref_list where ad_reference_id='270' and name=v_cur2.producttype;
        if  v_ptype is null then
            select a.value into v_ptype from ad_ref_list_trl t, ad_ref_list a where t.ad_language = 'en_US' and a.ad_reference_id='270' and t.name=v_cur2.producttype and t.ad_ref_list_id = a.ad_ref_list_id;
        end if;
        if  v_ptype is null then
           select a.value into v_ptype from ad_ref_list_trl t, ad_ref_list a where t.ad_language = v_lang and a.ad_reference_id='270' and t.name=v_cur2.producttype and t.ad_ref_list_id = a.ad_ref_list_id;
        end if;
        if  v_ptype is null then
            raise exception '%', 'Type of Product not Found:'||v_cur2.typeofproduct;
        end if;
        select m_locator_id into v_locat from m_locator where value=v_cur2.m_locator_id limit 1;
        /*
        if  v_locat is null then
            raise exception '%', 'Stock Locator not Found:'||v_cur2.m_locator_id;
        end if;       
        */
        select c_country_id into v_country from c_country where name=v_cur2.c_country_id;
       -- if  v_country is null then
       --     raise exception '%', 'Country not Found:'||v_cur2.m_locator_id;
       -- end if;
       if v_cur2.c_tax_id is not null then
        select c_tax_id into v_tax from c_tax where name=v_cur2.c_tax_id;
        if  v_tax is null then
            select c_tax_id into v_tax from c_tax_trl where ad_language = 'en_US' and name=v_cur2.c_tax_id;
        end if;
        if  v_tax is null then
            select c_tax_id into v_tax from c_tax_trl where ad_language = v_lang and name=v_cur2.c_tax_id;
        end if;
       end if;
        --if  v_tax is null then
        --    raise exception '%', 'Tax not Found:'||v_cur2.m_locator_id;
        --end if;
        if v_cur2.basepriceunit is not null then
            select c_uom_id into v_bpuom from c_uom where name=v_cur2.basepriceunit;
            if  v_uom is null then
                select c_uom_id into v_bpuom from c_uom where ad_language = 'en_US' and name=v_cur2.basepriceunit;
            end if;
            if  v_uom is null then
                select c_uom_id into v_bpuom from c_uom where ad_language = v_lang and name=v_cur2.basepriceunit;
            end if;
        end if;
        --if  v_bpuom is null then
        --    raise exception '%', 'Base Price Unit not Found:'||v_cur2.basepriceunit;
        --end if;
        v_i:=v_i+1;
        if v_productid is null then
            insert into m_product(ad_org_id , imageurl , value ,   upc , name ,  descriptionurl , description, documentnote , m_product_category_id ,
                                  typeofproduct , c_uom_id ,  producttype , isstocked ,  m_locator_id ,   isserialtracking , isbatchtracking , weight ,
                                  volume , shelfwidth , shelfheight , shelfdepth , unitsperpallet ,  isconsumable , issparepart , issetitem , isfreightproduct ,
                                  production ,isbom ,  ispurchased ,   manufacturer , manufacturernumber ,  cusomstarifno , c_country_id ,  calculated ,
                                  issold ,  c_tax_id , basepriceunit , basepricemultiplicator , discontinued , discontinuedby ,  isactive ,
                                  CREATED, CREATEDBY, UPDATED, UPDATEDBY,m_product_ID,ad_client_id)
                        values   (v_org,v_cur2.imageurl , v_cur2.value ,   v_cur2.upc , v_cur2.name ,  v_cur2.descriptionurl , v_cur2.description, v_cur2.documentnote,v_pcat,
                                  v_type,v_uom,v_ptype,v_cur2.isstocked ,v_locat,v_cur2.isserialtracking , v_cur2.isbatchtracking ,to_number(v_cur2.weight),
                                  to_number(v_cur2.volume) , to_number(v_cur2.shelfwidth) , to_number(v_cur2.shelfheight) , to_number(v_cur2.shelfdepth) , to_number(v_cur2.unitsperpallet),v_cur2.isconsumable , v_cur2.issparepart , v_cur2.issetitem , v_cur2.isfreightproduct ,
                                  v_cur2.production ,v_cur2.isbom ,  v_cur2.ispurchased ,   v_cur2.manufacturer , v_cur2.manufacturernumber ,  v_cur2.cusomstarifno , v_country ,  v_cur2.calculated ,
                                  v_cur2.issold ,  v_tax , v_bpuom , to_number(v_cur2.basepricemultiplicator) , v_cur2.discontinued , to_date(v_cur2.discontinuedby) ,  v_cur2.isactive,
                                  now(),p_user,now(),p_user,get_uuid(),v_client);
            v_ii:=v_ii+1;
        else
            update m_product set ad_org_id=v_org , imageurl=v_cur2.imageurl , value =v_cur2.value,   upc =v_cur2.upc, name =v_cur2.name,  descriptionurl= v_cur2.descriptionurl, description=v_cur2.description, documentnote =v_cur2.documentnote, m_product_category_id =v_pcat,
                                  typeofproduct=v_type ,   producttype=v_ptype , isstocked =v_cur2.isstocked,  m_locator_id= v_locat,   isserialtracking =v_cur2.isserialtracking, isbatchtracking=v_cur2.isbatchtracking , weight= to_number(v_cur2.weight),
                                  volume =to_number(v_cur2.volume), shelfwidth=to_number(v_cur2.shelfwidth) , shelfheight=to_number(v_cur2.shelfheight) , shelfdepth =to_number(v_cur2.shelfdepth), unitsperpallet=to_number(v_cur2.unitsperpallet) ,  isconsumable =v_cur2.isconsumable, issparepart =v_cur2.issparepart, issetitem =v_cur2.issetitem, isfreightproduct =v_cur2.isfreightproduct,
                                  production= v_cur2.production ,isbom=v_cur2.isbom ,  ispurchased =v_cur2.ispurchased,   manufacturer= v_cur2.manufacturer, manufacturernumber =v_cur2.manufacturernumber,  cusomstarifno =v_cur2.cusomstarifno, c_country_id =v_country,  calculated=v_cur2.calculated  ,
                                  issold =v_cur2.issold ,  c_tax_id=v_tax , basepriceunit =v_bpuom, basepricemultiplicator=to_number(v_cur2.basepricemultiplicator) , discontinued=v_cur2.discontinued , discontinuedby =to_date(v_cur2.discontinuedby),  isactive=v_cur2.isactive,
                                  UPDATEDBY=p_user,updated=now() where m_product_id=v_productid;
        end if;
    END LOOP;
    return v_i||'Artikel importiert, davon'||v_ii||' neu angelegt';  
END;
$_$  LANGUAGE 'plpgsql';



select zsse_DropView ('i_product_po_v');
CREATE OR REPLACE VIeW i_product_po_v as
select po.M_PRODUCT_ID||po.c_bpartner_id||coalesce(po.c_uom_id,'')||coalesce(po.m_manufacturer_id,'') as i_product_po_v_id,
po.AD_CLIENT_ID,
 po.AD_ORG_ID,
 po.CREATEDBY,
 po.created,
 po.UPDATEDBY,
 po.updated,
 po.isactive,
 p.value,
 p.name,
 po.c_bpartner_id,
 po.qualityrating,
 po.iscurrentvendor,
  po.upc,
   po.c_currency_id,
 po.c_uom_id,
 po.pricelist,
 po.pricepo,
 po.pricelastpo,
 po.pricelastinv,
  po.deliverytime_promised,
 po.vendorproductno,
 po.vendorcategory,
  po.m_manufacturer_id,
   po.manufacturernumber,
 po.discontinued,
 po.discontinuedby,
  po.qtystd,
 po.order_min,
 po.ismultipleofminimumqty from m_product_po po,m_product p where p.m_product_id=po.m_product_id;
 
 

 
CREATE or replace FUNCTION  i_import_product_po(p_filename varchar,p_user varchar) RETURNS varchar
AS $_$
DECLARE

v_client character varying:='C726FEC915A54A0995C568555DA5BB3C';
v_org character varying;
v_pversion character varying;
v_productid varchar;
v_productpoid  varchar;
v_bpartner varchar;
v_cur2 RECORD;
v_cmd varchar;
v_i numeric:=0;
v_ii numeric:=0;
v_uom varchar;
v_currency varchar;
v_manufacturer varchar;
v_locat varchar;
v_country varchar;
v_tax varchar;
v_bpuom varchar;
v_lang varchar;
BEGIN
 if p_filename is null then return 'ERROR'; end if;
  delete from i_product_poimport;
  -- Datei in Tabelle
  v_cmd := 'COPY i_product_poimport  FROM ''' || p_filename ||''' CSV DELIMITER as '||chr(39)||','||chr(39)||' HEADER ;';
  RAISE notice '%', v_cmd;
  EXECUTE(v_cmd);
 
    select ad_language into v_lang from ad_client  where ad_client_id=v_client;
    
    for v_cur2 in (select * from i_product_poimport)
    LOOP
        select m_product_id into v_productid from m_product where value=v_cur2.m_product_id;
        
        if v_productid is null then
            raise exception '%', 'Product not Found:'||v_cur2.m_product_id;
        end if;
        select c_bpartner_id into v_bpartner from c_bpartner where name=v_cur2.c_bpartner_id limit 1;
        if v_bpartner is null then
            raise exception '%', 'Business partner not Found:'||v_cur2.c_bpartner_id;
        end if;
        select ad_org_id into v_org from m_product where  m_product_id=v_productid;
       -- if v_cur2.ad_org_id='*' then v_org:='0'; end if;
        if v_org is null then
            raise exception '%', 'Organization not Found:';
        end if;

        --if  v_currency is null then
        --    raise exception '%', 'Product Type not Found:'||v_cur2.typeofproduct;
        --end if;
        if v_cur2.c_uom_id is not null then 
            select c_uom_id into v_uom from c_uom where name=v_cur2.c_uom_id;
            if  v_uom is null then
               select c_uom_id into v_uom from c_uom where ad_language = 'en_US' and name=v_cur2.c_uom_id; 
            end if;
            if  v_uom is null then
               select c_uom_id into v_uom from c_uom where ad_language = v_lang and name=v_cur2.c_uom_id; 
            end if;
        end if;
        --    raise exception '%', 'Unit of Measure not Found:'||v_cur2.c_uom_id;
        --end if;
        select m_manufacturer_id into v_manufacturer from m_manufacturer where  name=v_cur2.m_manufacturer_id;
        --if  v_manufacturer is null then
        --    raise exception '%', 'Type of Product not Found:'||v_cur2.typeofproduct;
        --end if;
        select c_currency_id into v_currency from c_currency where iso_code=v_cur2.c_currency_id;
        
        select m_product_po_id into v_productpoid from m_product_po where m_product_id=v_productid and c_bpartner_id= v_bpartner
                                    and case when v_uom is not null then c_uom_id=v_uom else 1=1 end 
                                    and case when v_manufacturer is not null then m_manufacturer_id=v_manufacturer else 1=1 end; 
        
        v_i:=v_i+1;
        if v_productpoid is null then
            insert into m_product_po (ad_org_id, m_product_id, c_bpartner_id, qualityrating, iscurrentvendor,  upc,   c_currency_id, c_uom_id, pricelist,
                                      pricepo,   deliverytime_promised, vendorproductno, vendorcategory,  m_manufacturer_id,
                                      manufacturernumber, discontinued, discontinuedby,  qtystd, order_min, ismultipleofminimumqty,
                                      CREATED, CREATEDBY, UPDATED, UPDATEDBY,m_product_po_id,ad_client_id)
                             values  (v_org, v_productid, v_bpartner, to_number(v_cur2.qualityrating), v_cur2.iscurrentvendor,  v_cur2.upc,  v_currency,v_uom, to_number(v_cur2.pricelist),
                                      to_number(v_cur2.pricepo),   to_number(v_cur2.deliverytime_promised), v_cur2.vendorproductno, v_cur2.vendorcategory,  v_manufacturer,
                                      v_cur2.manufacturernumber, v_cur2.discontinued, to_date(v_cur2.discontinuedby),  to_number(v_cur2.qtystd), to_number(v_cur2.order_min), v_cur2.ismultipleofminimumqty,
                                      now(),p_user,now(),p_user,get_uuid(),v_client);
            v_ii:=v_ii+1;
        else
            update m_product_po set ad_org_id=v_org,qualityrating=to_number(v_cur2.qualityrating), iscurrentvendor=v_cur2.iscurrentvendor,  upc=v_cur2.upc,   c_currency_id=v_currency, pricelist=to_number(v_cur2.pricelist),
                                      pricepo=to_number(v_cur2.pricepo),   deliverytime_promised=to_number(v_cur2.deliverytime_promised), vendorproductno=v_cur2.vendorproductno, vendorcategory=v_cur2.vendorcategory,  
                                      manufacturernumber=v_cur2.manufacturernumber, discontinued=v_cur2.discontinued, discontinuedby=to_date(v_cur2.discontinuedby),  qtystd=to_number(v_cur2.qtystd), order_min=to_number(v_cur2.order_min), ismultipleofminimumqty=v_cur2.ismultipleofminimumqty,
                                      UPDATEDBY=p_user,updated=now() 
                                where m_product_po_id=v_productpoid;
        end if;
        if v_uom is not null then
            if (select count(*) from m_product_uom where m_product_id=v_productpoid and c_uom_id= v_uom)=0 then
                insert into m_product_uom (ad_org_id, m_product_id,c_uom_id,m_product_uom_id,CREATED, CREATEDBY, UPDATED, UPDATEDBY,ad_client_id)
                       values(v_org, v_productid, v_uom,get_uuid(),now(),p_user,now(),p_user,v_client);
            end if;
        end if;
    END LOOP;
    return v_i||'Lieferanten-Artikel importiert, davon'||v_ii||' Datensätze neu angelegt';  
END;
$_$  LANGUAGE 'plpgsql';

