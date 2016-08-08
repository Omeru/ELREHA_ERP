SELECT zsse_dropview('m_offer_v');
CREATE VIEW m_offer_v
AS
SELECT
  mo.m_offer_id AS m_offer_v_id,
  mo.m_offer_id,
  mo.m_product_po_id,
  mo.ad_client_id,
  mo.ad_org_id,
  mo.isactive,
  mo.created,
  mo.createdby,
  mo.updated,
  mo.updatedby,
  mo.name,
  mo.priority,
  mo.addamt,
  mo.discount,
  mo.fixed,
  mo.datefrom,
  mo.dateto,
  mo.bpartner_selection,
  mo.bp_group_selection,
  mo.product_selection,
  mo.prod_cat_selection,
  mo.description,
  mo.pricelist_selection,
  mo.qty_from,
  mo.qty_to,
  mo.issalesoffer,
  mo.directpurchasecalc,
  mob.c_bpartner_id,
  mop.m_product_id,
  mop.c_uom_id,
  mop.m_manufacturer_id
FROM m_offer mo
   LEFT JOIN m_offer_bpartner mob ON mob.m_offer_id = mo.m_offer_id
   LEFT JOIN m_offer_product mop ON mop.m_offer_id = mo.m_offer_id;

CREATE RULE m_offer_v_delete AS ON DELETE TO public.m_offer_v
DO INSTEAD (
DELETE FROM m_offer
  WHERE m_offer.m_offer_id = old.m_offer_id;
);

CREATE RULE m_offer_v_insert AS ON INSERT TO public.m_offer_v
DO INSTEAD (
 INSERT INTO m_offer (
   m_offer_id, m_product_po_id,ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   name, priority, addamt, discount,
   fixed, datefrom, dateto,
   bpartner_selection, bp_group_selection, product_selection, prod_cat_selection,
   description, pricelist_selection, qty_from, qty_to, issalesoffer, directpurchasecalc)
  VALUES (
   new.m_offer_id, new.m_product_po_id,new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   new.name,
   COALESCE(new.priority, 0), COALESCE(new.addamt, 0), COALESCE(new.discount, 0),
   new.fixed, trunc(COALESCE(new.datefrom, now())), trunc(new.dateto),
   'N', 'Y', 'N', 'Y',
   new.description, 'Y', new.qty_from, new.qty_to, 'N', new.directpurchasecalc);
 INSERT INTO m_offer_bpartner (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   m_offer_bpartner_id, c_bpartner_id)
  VALUES (
   new.m_offer_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   get_uuid(), new.c_bpartner_id);
 INSERT INTO m_offer_product (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   m_offer_product_id, m_product_id,c_uom_id,m_manufacturer_id)
  VALUES (
   new.m_offer_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   get_uuid(), new.m_product_id,new.c_uom_id,new.m_manufacturer_id);
);

CREATE RULE m_offer_v_update AS ON UPDATE TO public.m_offer_v
DO INSTEAD (
 UPDATE m_offer SET
   m_offer_id = new.m_offer_id, m_product_po_id=new.m_product_po_id,ad_client_id = new.ad_client_id, ad_org_id = new.ad_org_id,
   isactive = new.isactive, created = new.created, createdby = new.createdby, updated = new.updated, updatedby = new.updatedby,
   name = new.name, priority = new.priority, addamt = new.addamt, discount = new.discount,
   fixed = NEW.fixed, datefrom = trunc(new.datefrom), dateto = trunc(new.dateto),
   bpartner_selection = 'N', bp_group_selection = 'Y', product_selection = 'N', prod_cat_selection = 'Y',
   description = new.description, pricelist_selection = 'Y', qty_from = new.qty_from, qty_to = new.qty_to,
   issalesoffer = 'N', directpurchasecalc = new.directpurchasecalc
  WHERE m_offer.m_offer_id = new.m_offer_id;
 UPDATE m_offer_product SET
   m_offer_id = new.m_offer_id, ad_client_id = new.ad_client_id, ad_org_id = new.ad_org_id,
   isactive = new.isactive, created = new.created, createdby = new.createdby, updated = new.updated, updatedby = new.updatedby,
   m_product_id = new.m_product_id,c_uom_id=new.c_uom_id,m_manufacturer_id=new.m_manufacturer_id
  WHERE m_offer_product.m_offer_id = new.m_offer_id AND m_offer_product.m_product_id = new.m_product_id;
 UPDATE m_offer_bpartner SET m_offer_id = new.m_offer_id, ad_client_id = new.ad_client_id, ad_org_id = new.ad_org_id,
   isactive = new.isactive, created = new.created, createdby = new.createdby, updated = new.updated, updatedby = new.updatedby,
   c_bpartner_id = new.c_bpartner_id
  WHERE m_offer_bpartner.m_offer_id = new.m_offer_id AND m_offer_bpartner.c_bpartner_id = new.c_bpartner_id;
);


SELECT zsse_dropview('m_offerplist_v');
CREATE VIEW m_offerplist_v
AS
SELECT
  mo.m_offer_id AS m_offerplist_v_id,
  mo.m_offer_id,
  mo.m_productprice_id,
  mo.ad_client_id,
  mo.ad_org_id,
  mo.isactive,
  mo.created,
  mo.createdby,
  mo.updated,
  mo.updatedby,
  mo.name,
  mo.priority,
  mo.addamt,
  mo.discount,
  mo.fixed,
  mo.datefrom,
  mo.dateto,
  mo.bpartner_selection,
  mo.bp_group_selection,
  mo.product_selection,
  mo.prod_cat_selection,
  mo.description,
  mo.pricelist_selection,
  mo.qty_from,
  mo.qty_to,
  mo.issalesoffer,
  mo.directpurchasecalc,
  mob.m_pricelist_id,
  mop.m_product_id,
  mop.c_uom_id
FROM m_offer mo
   LEFT JOIN m_offer_pricelist mob ON mob.m_offer_id = mo.m_offer_id
   LEFT JOIN m_offer_product mop ON mop.m_offer_id = mo.m_offer_id;

CREATE RULE m_offerplist_v_delete AS ON DELETE TO public.m_offerplist_v
DO INSTEAD (
DELETE FROM m_offer
  WHERE m_offer.m_offer_id = old.m_offer_id;
);

CREATE RULE m_offerplist_v_insert AS ON INSERT TO public.m_offerplist_v
DO INSTEAD (
 INSERT INTO m_offer (
   m_offer_id, m_productprice_id,ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   name, priority, addamt, discount,
   fixed, datefrom, dateto,
   bpartner_selection, bp_group_selection, product_selection, prod_cat_selection,
   description, pricelist_selection, qty_from, qty_to, issalesoffer, directpurchasecalc)
  VALUES (
   new.m_offerplist_v_id,new.m_productprice_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   new.name,
   COALESCE(new.priority, 0), COALESCE(new.addamt, 0), COALESCE(new.discount, 0),
   new.fixed, trunc(COALESCE(new.datefrom, now())), trunc(new.dateto),
   'Y', 'Y', 'N', 'Y',
   new.description, 'N', new.qty_from, new.qty_to, 'Y', new.directpurchasecalc);
 INSERT INTO m_offer_pricelist (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   m_offer_pricelist_id, m_pricelist_id)
  VALUES (
   new.m_offerplist_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   get_uuid(), new.m_pricelist_id);
 INSERT INTO m_offer_product (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   m_offer_product_id, m_product_id,c_uom_id)
  VALUES (
   new.m_offerplist_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   get_uuid(), new.m_product_id,new.c_uom_id);
);

CREATE RULE m_offerplist_v_update AS ON UPDATE TO public.m_offerplist_v
DO INSTEAD (
 UPDATE m_offer SET
   m_offer_id = new.m_offer_id,m_productprice_id=new.m_productprice_id, ad_client_id = new.ad_client_id, ad_org_id = new.ad_org_id,
   isactive = new.isactive, created = new.created, createdby = new.createdby, updated = new.updated, updatedby = new.updatedby,
   name = new.name, priority = new.priority, addamt = new.addamt, discount = new.discount,
   fixed = NEW.fixed, datefrom = trunc(new.datefrom), dateto = trunc(new.dateto),
   bpartner_selection = 'Y', bp_group_selection = 'Y', product_selection = 'N', prod_cat_selection = 'Y',
   description = new.description, pricelist_selection = 'N', qty_from = new.qty_from, qty_to = new.qty_to,
   issalesoffer = 'Y', directpurchasecalc = new.directpurchasecalc
  WHERE m_offer.m_offer_id = new.m_offer_id;
  UPDATE  m_offer_product set c_uom_id=new.c_uom_id WHERE m_offer_id = new.m_offer_id and m_product_id=new.m_product_id;
);





SELECT zsse_dropview('m_offerbpartner_v');
CREATE VIEW m_offerbpartner_v
AS
SELECT
  mo.m_offer_id AS m_offerbpartner_v_id,
  mo.m_offer_id,
  mo.ad_client_id,
  mo.ad_org_id,
  mo.isactive,
  mo.created,
  mo.createdby,
  mo.updated,
  mo.updatedby,
  mo.name,
  mo.priority,
  mo.addamt,
  mo.discount,
  mo.fixed,
  mo.datefrom,
  mo.dateto,
  mo.bpartner_selection,
  mo.bp_group_selection,
  mo.product_selection,
  mo.prod_cat_selection,
  mo.description,
  mo.pricelist_selection,
  mo.qty_from,
  mo.qty_to,
  mob.c_bpartner_id,
  mop.m_product_id,
  mop.c_uom_id,
  mop.m_manufacturer_id,
  mopp.m_pricelist_id,
  cat.m_product_category_id
FROM m_offer_bpartner mob,m_offer mo
   LEFT JOIN m_offer_prod_cat cat ON cat.m_offer_id = mo.m_offer_id
   LEFT JOIN m_offer_product mop ON mop.m_offer_id = mo.m_offer_id
   LEFT JOIN m_offer_pricelist mopp ON mopp.m_offer_id = mo.m_offer_id
WHERE  mob.m_offer_id = mo.m_offer_id;

CREATE RULE m_offerbpartner_v_delete AS ON DELETE TO public.m_offerbpartner_v
DO INSTEAD (
DELETE FROM m_offer
  WHERE m_offer.m_offer_id = old.m_offer_id;
);

CREATE RULE m_offerbpartner_v_insert AS ON INSERT TO public.m_offerbpartner_v
DO INSTEAD (
 INSERT INTO m_offer (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   name, priority, addamt, discount,
   fixed, datefrom, dateto,
   bpartner_selection, bp_group_selection, product_selection, prod_cat_selection,
    pricelist_selection,description, qty_from, qty_to, issalesoffer, directpurchasecalc)
  VALUES (
   new.m_offerbpartner_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   new.name,
   COALESCE(new.priority, 0), COALESCE(new.addamt, 0), COALESCE(new.discount, 0),
   new.fixed, trunc(COALESCE(new.datefrom, now())), trunc(new.dateto),
   'N', 'Y', 
   case when new.m_product_id is not null then 'N' else 'Y' end, 
   case when new.m_product_category_id is not null then 'N' else 'Y' end, 
   case when new.m_pricelist_id is not null then 'N' else 'Y' end, 
   new.description, new.qty_from, new.qty_to, 'Y','N');
 INSERT INTO m_offer_bpartner (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   m_offer_bpartner_id, c_bpartner_id)
  VALUES (
   new.m_offerbpartner_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   get_uuid(), new.c_bpartner_id);
);
CREATE RULE m_offerbpartner_v_insertpl AS ON INSERT TO public.m_offerbpartner_v where new.m_pricelist_id is not null
DO ALSO (
    INSERT INTO m_offer_pricelist (
    m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
    m_offer_pricelist_id, m_pricelist_id)
    VALUES (
    new.m_offerbpartner_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
    get_uuid(), new.m_pricelist_id);
);

CREATE RULE m_offerbpartner_v_insertpc AS ON INSERT TO public.m_offerbpartner_v where new.m_product_category_id is not null
DO ALSO (
    INSERT INTO m_offer_prod_cat (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   m_offer_prod_cat_id,m_product_category_id)
  VALUES (
   new.m_offerbpartner_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   get_uuid(), new.m_product_category_id);
);
CREATE RULE m_offerbpartner_v_insertprod AS ON INSERT TO public.m_offerbpartner_v where new.m_product_id is not null
DO ALSO (
   INSERT INTO m_offer_product (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   m_offer_product_id, m_product_id,c_uom_id)
  VALUES (
   new.m_offerbpartner_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   get_uuid(), new.m_product_id,new.c_uom_id);
);


CREATE RULE m_offerbpartner_v_update AS ON UPDATE TO public.m_offerbpartner_v
DO INSTEAD (
 UPDATE m_offer SET
   m_offer_id = new.m_offer_id, ad_client_id = new.ad_client_id, ad_org_id = new.ad_org_id,
   isactive = new.isactive, created = new.created, createdby = new.createdby, updated = new.updated, updatedby = new.updatedby,
   name = new.name, priority = new.priority, addamt = new.addamt, discount = new.discount,
   fixed = NEW.fixed, datefrom = trunc(new.datefrom), dateto = trunc(new.dateto),
   bpartner_selection = 'N', 
   bp_group_selection = 'Y', 
   product_selection = case when new.m_product_id is not null then 'N' else 'Y' end,
   prod_cat_selection = case when new.m_product_category_id is not null then 'N' else 'Y' end, 
   pricelist_selection = case when new.m_pricelist_id is not null then 'N' else 'Y' end, 
   description = new.description, qty_from = new.qty_from, qty_to = new.qty_to,
   issalesoffer = 'Y'
  WHERE m_offer.m_offer_id = new.m_offer_id;
 UPDATE m_offer_bpartner SET m_offer_id = new.m_offer_id, ad_client_id = new.ad_client_id, ad_org_id = new.ad_org_id,
   isactive = new.isactive, created = new.created, createdby = new.createdby, updated = new.updated, updatedby = new.updatedby,
   c_bpartner_id = new.c_bpartner_id
  WHERE m_offer_bpartner.m_offer_id = new.m_offer_id AND m_offer_bpartner.c_bpartner_id = new.c_bpartner_id;
  -- - Pricelist
  delete from m_offer_pricelist  WHERE m_offer_pricelist.m_offer_id = new.m_offer_id AND m_offer_pricelist.m_pricelist_id = old.m_pricelist_id;
  -- Product
  delete from m_offer_product  WHERE m_offer_product.m_offer_id = new.m_offer_id AND m_offer_product.m_product_id = old.m_product_id;
  -- Category
  delete from m_offer_prod_cat  WHERE m_offer_prod_cat.m_offer_id = new.m_offer_id AND m_offer_prod_cat.m_product_category_id=old.m_product_category_id;
  
);



CREATE RULE m_offerbpartner_v_updatepl AS ON UPDATE TO public.m_offerbpartner_v where new.m_pricelist_id is not null
DO ALSO (
    INSERT INTO m_offer_pricelist (
    m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
    m_offer_pricelist_id, m_pricelist_id)
    VALUES (
    new.m_offerbpartner_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
    get_uuid(), new.m_pricelist_id);
);

CREATE RULE m_offerbpartner_v_updatepc AS ON UPDATE TO public.m_offerbpartner_v where new.m_product_category_id is not null
DO ALSO (
    INSERT INTO m_offer_prod_cat (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   m_offer_prod_cat_id,m_product_category_id)
  VALUES (
   new.m_offerbpartner_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   get_uuid(), new.m_product_category_id);
);
CREATE RULE m_offerbpartner_v_updateprod AS ON UPDATE TO public.m_offerbpartner_v where new.m_product_id is not null
DO ALSO (
   INSERT INTO m_offer_product (
   m_offer_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby,
   m_offer_product_id, m_product_id,c_uom_id)
  VALUES (
   new.m_offerbpartner_v_id, new.ad_client_id, new.ad_org_id, new.isactive, new.created, new.createdby, new.updated, new.updatedby,
   get_uuid(), new.m_product_id,new.c_uom_id);
);




create or replace function m_offer_restrictions_trg()
  returns trigger as
$BODY$ declare
/***************************************************************************************************************************************************
* The contents of this file are subject to the Openbravo  Public  License Version  1.0  (the  "License"),  being   the  Mozilla   Public  License
* Version 1.1  with a permitted attribution clause; you may not  use this file except in compliance with the License. You  may  obtain  a copy of
* the License at http://www.openbravo.com/legal/license.html. Software distributed under the License  is  distributed  on  an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the specific  language  governing  rights  and  limitations
* under the License. The Original Code is Openbravo ERP.
* The Initial Developer of the Original Code is Openbravo SL. Parts created by Openbravo are Copyright (C) 2001-2009 Openbravo SL
* All Rights Reserved.
* Contributor(s): Stefan Zimmermann, Danny Heuduk 02/2011, sz@zimmermann-software.de (SZ) Contributions are Copyright (C) 2011 Stefan Zimmermann
* 
****************************************************************************************************************************************************/

BEGIN
  IF (TG_OP = 'INSERT' or TG_OP = 'UPDATE') THEN
    IF (new.qty_to < new.qty_from) THEN
      RAISE EXCEPTION '%', '@MSGErrorOnQty@';
    END IF;
IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF;
  END IF;
END; $BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;
ALTER FUNCTION m_offer_restrictions_trg() OWNER TO TAD;

select zsse_droptrigger('m_offer_restrictions_trg','m_offer');

CREATE TRIGGER m_offer_restrictions_trg
  BEFORE INSERT OR UPDATE 
  ON m_offer
  FOR EACH ROW
  EXECUTE PROCEDURE m_offer_restrictions_trg();

 
/* 2012-12-04 MaHinrichs */
CREATE OR REPLACE FUNCTION  m_offer_dependent_delete_trg ()
RETURNS trigger AS
$body$
DECLARE
BEGIN
  IF (TG_OP = 'DELETE') THEN
    IF (SELECT COUNT(*) FROM c_orderline_offer olo WHERE olo.m_offer_id = OLD.m_offer_id) > 0 THEN 
      RAISE EXCEPTION '%.  (%)', '@DeleteErrorDependent@', 'Linked Items';
    END IF;
  END IF;
  
  IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF;
  END;
$body$
LANGUAGE 'plpgsql';

SELECT zsse_droptrigger('m_offer_dependent_delete_trg', 'm_offer');
CREATE TRIGGER m_offer_dependent_delete_trg
  BEFORE DELETE
  ON m_offer FOR EACH ROW 
  EXECUTE PROCEDURE  m_offer_dependent_delete_trg();
  
 


CREATE OR REPLACE FUNCTION m_offerpartnerproducts(i_bpartner_id varchar,i_pricelistversion varchar,OUT p_Product_ID VARCHAR,
  OUT p_PriceList numeric, OUT p_PriceStd NUMERIC,OUT p_PriceLimit numeric) RETURNS SETOF RECORD 
AS $_$
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2015 Stefan Zimmermann All Rights Reserved.
Contributor(s):
***************************************************************************************************************************************************/
DECLARE
v_cur  RECORD;
v_cur2  RECORD;
v_count numeric;

BEGIN
     for v_cur2 in (select o.m_offer_id from m_offer o,m_offer_bpartner bp where o.issalesoffer='Y' and bp.m_offer_id=o.m_offer_id and 
                                                                             bp.c_bpartner_id=i_bpartner_id)
     LOOP
      for v_cur in (select op.m_product_id, null as m_pricelist_version_id from m_offer_product op where op.m_offer_id=v_cur2.m_offer_id
                    UNION
                    select m_product_id, null as m_pricelist_version_id from m_product where issold='Y' and m_product_category_id in (select m_product_category_id from m_offer_prod_cat where  m_offer_prod_cat.m_offer_id=v_cur2.m_offer_id)
                    UNION
                    select pp.m_product_id,pv.m_pricelist_version_id from m_productprice pp,m_pricelist_version pv ,m_offer_pricelist op
                                        where pp.m_pricelist_version_id = pv.m_pricelist_version_id 
                                        and pv.m_pricelist_id=op.m_pricelist_id and op.m_offer_id=v_cur2.m_offer_id
                                        and  pv.VALIDFROM =    (SELECT max(VALIDFROM) FROM M_PRICELIST_VERSION   WHERE M_PRICELIST_ID=pv.m_pricelist_id and VALIDFROM<=TO_DATE(now()))
                   )
                      
      LOOP
        -- m_get_offers_price(trunc(now()),i_bpartner_id,v_cur.m_product_id,1,i_pricelistversion)
        select v_cur.m_product_id,m_bom_pricestd(v_cur.m_product_id,coalesce(v_cur.m_pricelist_version_id,i_pricelistversion)),
               m_bom_pricelist(v_cur.m_product_id,coalesce(v_cur.m_pricelist_version_id,i_pricelistversion)),
               m_bom_pricelimit(v_cur.m_product_id,coalesce(v_cur.m_pricelist_version_id,i_pricelistversion))
        into p_Product_ID,p_PriceStd,p_PriceList,p_PriceLimit
        from dual;
        return next;
      END LOOP; -- Alle selektierten Projekte
    END LOOP;
END;
$_$ LANGUAGE plpgsql VOLATILE COST 100;


CREATE OR REPLACE FUNCTION m_offerpartnerpricelist(i_order_id varchar,i_productId varchar) RETURNS VARCHAR
AS $_$
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2015 Stefan Zimmermann All Rights Reserved.
Contributor(s):
***************************************************************************************************************************************************/
DECLARE

v_return varchar;
v_custom varchar;
BEGIN
     SELECT pv.M_PRICELIST_VERSION_ID  into v_return FROM M_PRICELIST_VERSION pv,c_order o 
                    WHERE o.m_pricelist_id = pv.m_pricelist_id and
                    o.c_order_id=i_order_id and  pv.VALIDFROM =    (SELECT max(VALIDFROM)    FROM M_PRICELIST_VERSION   WHERE M_PRICELIST_ID=o.m_pricelist_id and VALIDFROM<=o.dateordered)
                    LIMIT 1;
     -- Test if Custom Pricelist
     select pv.m_pricelist_version_id into v_custom from m_productprice pp,m_pricelist_version pv ,m_offer_pricelist op,m_offer o,m_offer_bpartner bp
                                        where pp.m_pricelist_version_id = pv.m_pricelist_version_id 
                                        and pv.m_pricelist_id=op.m_pricelist_id and 
                                        o.m_offer_id=op.m_offer_id and
                                        o.issalesoffer='Y' and bp.m_offer_id=o.m_offer_id
                                        and pp.m_product_id=i_productId
                                        and bp.c_bpartner_id=(select c_bpartner_id from c_order where c_order_id=i_order_id and issotrx='Y')
                                        and  pv.VALIDFROM =    (SELECT max(VALIDFROM) FROM M_PRICELIST_VERSION   WHERE M_PRICELIST_ID=pv.m_pricelist_id and VALIDFROM<=TO_DATE(now()))
                                        LIMIT 1;
                      
     if v_custom is not null then
        return v_custom;
     else
        return v_return;
     end if;
END;
$_$ LANGUAGE plpgsql VOLATILE COST 100;