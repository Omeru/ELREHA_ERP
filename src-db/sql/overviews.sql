/* ---------------------------------------------------------------------------------------




Read Only Views representing data for anylysis Purposes







--------------------------------------------------------------------------------------------*/

select zsse_DropView ('c_project_invoice_overview');
create or replace view c_project_invoice_overview as
select
  c_invoice_id as c_project_invoice_overview_id,
  c_invoice_id,
  zsfi_macctline_id::text,
  c_bpartner_id,
  c_bpartner_location_id,
  m_pricelist_id,
  ispaid,
  c_doctype_id,
  issotrx,
  case when issotrx='Y' then totallines else 0 end as salestotallines,
  case when issotrx='N' then totallines else 0 end as purchasetotallines,
  case when issotrx='Y' then totalpaid  else 0 end as salestotalpaid,
  case when issotrx='N' then totalpaid  else 0 end as purchasetotalpaid,
  description,
  ad_org_id,
  ad_client_id,
  isactive,
  created,
  createdby,
  updated,
  updatedby,
  c_project_id,
  (select name from c_bpartner where c_bpartner_id=b.c_bpartner_id) as bpname,
  documentnote::varchar(2000)
  from  (select ad_client_id,issotrx,c_invoice_id,null as zsfi_macctline_id,c_bpartner_id,c_bpartner_location_id,m_pricelist_id,ispaid,c_doctype_id,
                sum(totallines) as totallines,isactive,totalpaid,description,ad_org_id,created,createdby,updated,updatedby,c_project_id,
                (select ix.documentno||(case when ilx.description is not null then '-'||ilx.description when ilx.description is null and ix.description is not null then '-'||ix.description else '' end) from c_invoice ix,c_invoiceline ilx where 
                 ix.c_invoice_id=ilx.c_invoice_id and ilx.line=10 and ix.c_invoice_id=a.c_invoice_id limit 1) as documentnote
        from
            (select i.ad_client_id,i.issotrx,i.c_invoice_id,i.c_bpartner_id,i.c_bpartner_location_id,i.m_pricelist_id,i.ispaid,i.c_doctype_id,
                    case when i.isgrossinvoice='Y' then 
                                sum(case when (select rate from c_tax where c_tax_id=il.c_tax_id)>0 then
                                    round(il.linegrossamt - il.linegrossamt/(1+100/(select rate from c_tax where c_tax_id=il.c_tax_id)),2) else
                                    il.linegrossamt end) else
                                sum(il.linenetamt) end as totallines,
                    i.isactive,i.totalpaid,
                    i.description,i.ad_org_id,i.created,
                    i.createdby,i.updated,i.updatedby,il.c_project_id
            from c_invoice i,c_invoiceline il
            where i.c_invoice_id=il.c_invoice_id and
                    il.c_project_id is not null and
                    i.docstatus='CO' group by il.c_project_id,il.c_tax_id,
                    i.ad_client_id,i.issotrx,i.c_invoice_id,i.c_bpartner_id,i.c_bpartner_location_id,i.m_pricelist_id,i.ispaid,i.c_doctype_id,i.isgrossinvoice,
                    i.isactive,i.description,i.ad_org_id,i.created,i.createdby,i.updated,i.updatedby,i.totalpaid) a
        group by a.ad_client_id,a.issotrx,a.c_invoice_id,a.c_bpartner_id,a.c_bpartner_location_id,a.m_pricelist_id,a.ispaid,a.c_doctype_id,
                 a.isactive,a.totalpaid,a.description,a.ad_org_id,a.created,a.createdby,a.updated,a.updatedby,a.c_project_id) b
UNION
select
  ml.zsfi_macctline_id as c_project_invoice_overview_id,
  null as c_invoice_id,
  ml.zsfi_macctline_id,
  null as c_bpartner_id,
  null as c_bpartner_location_id,
  null as m_pricelist_id,
  'Y' as ispaid,
  '8345D47F584B4C50A9CBC46B20E4C73A' as c_doctype_id,
  'N' as issotrx,
  0  as salestotallines,
  coalesce(round(case when ml.isgross='N' or t.rate=0 then ml.amt*case when ml.isdr2cr='Y' then 1 else -1 end else 
                   case when ml.isdr2cr='Y' then 1 else -1 end * ml.amt-ml.amt/(1+100/t.rate) end,2),0)  purchasetotallines,
  0 salestotalpaid,
  coalesce(round(case when ml.isgross='N' or t.rate=0 then ml.amt*case when ml.isdr2cr='Y' then 1 else -1 end else 
                   case when ml.isdr2cr='Y' then 1 else -1 end * ml.amt-ml.amt/(1+100/t.rate) end,2),0)  purchasetotalpaid,
  ml.description,
  ml.ad_org_id,
  ml.ad_client_id,
  ml.isactive,
  ml.created,
  ml.createdby,
  ml.updated,
  ml.updatedby,
  ml.c_project_id,
  null as bpname,
  mic.documentno||'-'||ml.line||'-'||ml.description as documentnote
from zsfi_macctline ml, zsfi_manualacct mic,c_tax t,c_project p
where ml.c_project_id=p.c_project_id and t.c_tax_id=ml.c_tax_id and mic.zsfi_manualacct_id=ml.zsfi_manualacct_id and mic.glstatus='PO' ;     
       
       
select zsse_DropView ('m_product_not_puchaseble_overview');
create or replace view m_product_not_puchaseble_overview as     
select 
m.m_product_id as m_product_not_puchaseble_overview_id,
m.m_product_id ,
m.m_product_category_id,
ad_org_id,
 m.ad_client_id,
 m.isactive,
 m.created,
 m.createdby,
 m.updated,
 m.updatedby
from m_product m 
where m.ispurchased='Y' and m.production='N' and m.isactive='Y' and
not exists (select 0 from m_product_po po where po.m_product_id=m.m_product_id and po.isactive='Y' and po.iscurrentvendor='Y');





select zsse_DropView ('m_pricelist_overview');

create or replace view m_pricelist_overview as     
select
    p.m_productprice_id as m_pricelist_overview_id,
    pv.validfrom,
    pl.m_pricelist_id,
    p.m_product_id ,
    p.ad_client_id  ,
    p.ad_org_id   ,
    p.isactive       ,
    p.created       ,
    p.createdby   ,
    p.updated      ,
    p.updatedby      ,
    p.pricelist      ,
    p.pricestd        ,
    p.pricelimit  
from m_pricelist pl,m_pricelist_version pv,m_productprice p where
     pl.m_pricelist_id=pv.m_pricelist_id and pv.m_pricelist_version_id=p.m_pricelist_version_id ;

