select zsse_DropView ('c_bpartneremployee_view');

CREATE OR REPLACE VIEW c_bpartneremployee_view AS 
            select c_bpartner.C_BPARTNER_ID as c_bpartneremployee_view_id,c_bpartner.C_BPARTNER_ID as C_BPARTNER_ID, AD_CLIENT_ID, AD_ORG_ID, CREATED,ISACTIVE,UPDATED,CREATEDBY, UPDATEDBY, VALUE, NAME, DESCRIPTION, C_BP_GROUP_ID, ISEMPLOYEE, ISSALESREP, REFERENCENO, AD_LANGUAGE,
                   TAXID, ISTAXEXEMPT, C_GREETING_ID, ISWORKER, COUNTRY, CITY, ZIPCODE, ISPROJECTMANAGER, ISPROCUREMENTMANAGER, APPROVALAMT, ISAPPROVER, ISPRAPPROVER, ISPAYMENTAPPROVER,c_salary_category_id,rating,c_bp_employee.a_asset_id,
                   isinresourceplan, 'N'::character(1) as isSummary
            from   c_bpartner left join c_bp_employee on c_bpartner.c_bpartner_id = c_bp_employee.c_bpartner_id
            where ISEMPLOYEE='Y';

CREATE OR REPLACE RULE c_bpartneremployee_view_insert AS
        ON INSERT TO c_bpartneremployee_view DO INSTEAD 
        (INSERT INTO c_bpartner (C_BPARTNER_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, VALUE, NAME, DESCRIPTION, C_BP_GROUP_ID, ISEMPLOYEE, ISSALESREP, REFERENCENO, AD_LANGUAGE, TAXID, ISTAXEXEMPT, C_GREETING_ID, ISWORKER,isinresourceplan,
                   COUNTRY, CITY, ZIPCODE, ISPROJECTMANAGER, ISPROCUREMENTMANAGER, APPROVALAMT, ISAPPROVER, ISPRAPPROVER, ISPAYMENTAPPROVER,c_salary_category_id,rating)
        VALUES (new.C_BPARTNER_ID, new.AD_CLIENT_ID, new.AD_ORG_ID, new.CREATEDBY, new.UPDATEDBY, new.VALUE, new.NAME, new.DESCRIPTION, new.C_BP_GROUP_ID, 'Y', new.ISSALESREP, 
                   new.REFERENCENO, new.AD_LANGUAGE, new.TAXID, new.ISTAXEXEMPT, new.C_GREETING_ID, new.ISWORKER,new.isinresourceplan,
                   new.COUNTRY, new.CITY, new.ZIPCODE, new.ISPROJECTMANAGER, new.ISPROCUREMENTMANAGER, new.APPROVALAMT, new.ISAPPROVER, new.ISPRAPPROVER, new.ISPAYMENTAPPROVER,new.c_salary_category_id,new.rating);    
        INSERT INTO c_bp_employee(c_bpartner_id, a_asset_id)
        VALUES (new.C_BPARTNER_ID, new.a_asset_id));

CREATE OR REPLACE RULE c_bpartneremployee_view_update AS
        ON UPDATE TO c_bpartneremployee_view DO INSTEAD 
        (UPDATE c_bpartner SET 
                AD_CLIENT_ID=new.AD_CLIENT_ID, 
                AD_ORG_ID=new.AD_ORG_ID,
                UPDATEDBY=new.UPDATEDBY, 
                VALUE=new.VALUE, 
                NAME=new.NAME, 
                DESCRIPTION=new.DESCRIPTION, C_BP_GROUP_ID=new.C_BP_GROUP_ID, isinresourceplan=new.isinresourceplan,
                ISSALESREP=new.ISSALESREP, REFERENCENO=new.REFERENCENO, AD_LANGUAGE=new.AD_LANGUAGE, TAXID=new.TAXID, ISTAXEXEMPT=new.ISTAXEXEMPT,ISWORKER=new.ISWORKER,
                COUNTRY=new.COUNTRY, CITY=new.CITY, ZIPCODE=new.ZIPCODE, ISPROJECTMANAGER=new.ISPROJECTMANAGER, ISPROCUREMENTMANAGER=new.ISPROCUREMENTMANAGER, APPROVALAMT=new.APPROVALAMT, ISAPPROVER=new.ISAPPROVER,
                ISPRAPPROVER=new.ISPRAPPROVER,ISPAYMENTAPPROVER= new.ISPAYMENTAPPROVER,c_salary_category_id=new.c_salary_category_id,rating=new.rating,
                isactive=new.isactive
               where C_BPARTNER_ID=new.C_BPARTNER_ID;
        UPDATE c_bp_employee SET
        A_ASSET_ID=new.A_ASSET_ID 
        where C_BPARTNER_ID=new.C_BPARTNER_ID);

CREATE OR REPLACE RULE c_bpartneremployee_view_delete AS
        ON DELETE TO c_bpartneremployee_view DO INSTEAD 
        (DELETE FROM c_bp_employee
		  WHERE c_bpartner_id = old.C_BPARTNER_ID;
        DELETE FROM c_bpartner
        WHERE c_bpartner_id = old.C_BPARTNER_ID);


CREATE OR REPLACE FUNCTION zssi_getNewProductEan(p_org character varying)
  RETURNS character varying AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2012 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Default-Product EAN
*****************************************************/
v_return               character varying:='';
BEGIN
  if c_getconfigoption('autoproducteansequence', p_org)='Y' then
     select Ad_Sequence_Doc('Product EAN', p_org, 'Y') into v_return;
  end if;
RETURN v_return;

END;
$BODY$ LANGUAGE 'plpgsql' VOLATILE  COST 100;


CREATE OR REPLACE FUNCTION zssi_getNewBPartnerValue(p_org character varying)
  RETURNS character varying AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2012 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Default-Product Value
*****************************************************/
v_return               character varying:='';
BEGIN
  if c_getconfigoption('autobpartnervaluesequence', p_org)='Y' then
     select Ad_Sequence_Doc('BPartner Value', p_org, 'Y') into v_return;
  end if;
RETURN v_return;

END;
$BODY$ LANGUAGE 'plpgsql' VOLATILE  COST 100;


CREATE OR REPLACE FUNCTION zssi_product_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Default-Price (and Costs) for Items
*****************************************************/
v_prlist_id               character varying;
v_version_id              character varying;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; 
  END IF;
  IF (TG_OP = 'INSERT') THEN
    -- Sandard-Cost =0     
      insert into m_costing (M_COSTING_ID, AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY,  M_PRODUCT_ID, DATEFROM, DATETO, ISMANUAL, PRICE,  COSTTYPE,  COST)
             values(get_uuid(),new.AD_Client_ID, new.AD_Org_ID, now(), new.CREATEDBY, now(), new.UPDATEDBY, new.M_PRODUCT_ID,now(),to_date('01.01.9999','dd.mm.yyyy'),'N',0,'ST',0);
  END IF; 
  IF (TG_OP = 'UPDATE') THEN
    IF (new.value!=old.value) THEN
      UPDATE zssm_workstep_prp_v set value=new.value where value=old.value;
    END IF;
    IF (new.name!=old.name) then
	UPDATE zssm_workstep_prp_v set name=new.name where name=old.name;
    END IF;
    IF (coalesce(new.imageurl,'')!=coalesce(old.imageurl,'') or coalesce(new.ad_image_id,'')!=coalesce(old.ad_image_id,'')) then
        update zse_image_product set url=new.imageurl,ad_image_id=new.ad_image_id,updated=now() where zse_product_shop_id in 
               (select zse_product_shop_id from zse_product_shop  where m_product_id=new.m_product_id) and  
               coalesce(url,'')=coalesce(old.imageurl,'') and
               coalesce(ad_image_id,'')=coalesce(old.ad_image_id,'');
    end if;
    IF (new.name!=old.name or coalesce(new.description,'')!=coalesce(old.description,'') or coalesce(new.documentnote,'')!=coalesce(old.documentnote,'')) then
        update zse_product_shop set updated=now(),TITLE=new.name,  fullTITLE=new.name,content=new.description,description=new.documentnote where
               m_product_id=new.m_product_id and ismaster='Y' and 
               coalesce(TITLE,'')=coalesce(old.name,'') and
               coalesce(fullTITLE,'')=coalesce(old.name,'') and
               coalesce(content,'')=coalesce(old.description,'') and
               coalesce(description,'')=coalesce(old.documentnote,'');
    end if;
 END IF;
  -- Auto generate Base Assembly
  if new.typeofproduct in ('AS','UA' ,'CD')  and new.isactive='Y' and 
     new.discontinued='N' and new.isstocked='Y' and new.production='Y' then
         if (select count(*) from zssm_workstep_prp_v where value=new.value)=0 then
            insert into zssm_workstep_prp_v(zssm_workstep_v_id,  ad_client_id,  
                        ad_org_id,   
                        created,  createdby,  updated,  updatedby,  seqno,  value,  name,  description,  m_product_id,  assembly,
                        qty,  issuing_locator,  receiving_locator,  setuptime,  timeperpiece,  isautotriggered,  isautogeneratedplan, startonlywithcompletematerial,  forcematerialscan)
            values (get_uuid(),new.ad_client_id,  
                    coalesce((select ad_org_id from m_locator where m_locator_id=new.m_locator_id),(select ad_org_id from ad_org where ad_org_id!='0' order by created limit 1)),
                    now(),new.createdby,now(),new.updatedby,10,new.value,new.name,substr(new.description,1,254),new.m_product_id,'Y',
                    1,new.m_locator_id,new.m_locator_id,0,1,'N','Y','N','N');
         end if;
  end if;
RETURN NEW;
EXCEPTION
WHEN NO_DATA_FOUND THEN
  RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;

  
select zsse_droptrigger('zssi_product_trg','m_product');

CREATE TRIGGER zssi_product_trg
  AFTER INSERT OR UPDATE 
  ON m_product
  FOR EACH ROW
  EXECUTE PROCEDURE zssi_product_trg();

CREATE OR REPLACE FUNCTION zssi_product_uom_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Second UOM must differ from 1st UOM
*****************************************************/
v_count                   numeric;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; 
  END IF;
  select count(*) into v_count from m_product where m_product_id=new.m_product_id and c_uom_id=new.c_uom_id;
  if v_count>0 then
    RAISE EXCEPTION '%', '@SecondUomNotFirstUOM@';
  END IF; 
RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
ALTER FUNCTION zssi_product_uom_trg() OWNER TO tad;

CREATE OR REPLACE FUNCTION zssi_bpartner_trg2()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
2.nd Trigger: Before Insert
Defaults for : c_paymentterm_id,c_invoiceschedule_id,po_pricelist_id,m_pricelist_id
*****************************************************/
v_payterm                  character varying;
v_isched                   character varying;
v_poplist                  character varying;
v_plist                    character varying;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; 
  END IF;
  IF (TG_OP = 'INSERT') THEN
          -- Set defaults
          select c_paymentterm_id into v_payterm from c_paymentterm where isdefault='Y' and isactive='Y' and ad_org_id in ('0',new.ad_org_id) order by ad_org_id desc limit 1;
          select c_invoiceschedule_id into v_isched from c_invoiceschedule where isdefault='Y' and isactive='Y' and ad_org_id in ('0',new.ad_org_id) order by ad_org_id desc limit 1;
          select m_pricelist_id into v_plist from m_pricelist where isdefault='Y' and isactive='Y' and issopricelist='Y' and ad_org_id in ('0',new.ad_org_id) order by ad_org_id desc limit 1;
          select m_pricelist_id into v_poplist from m_pricelist where isactive='Y' and isdefault='Y' and issopricelist='N' and ad_org_id in ('0',new.ad_org_id) order by ad_org_id desc limit 1;
          new.c_paymentterm_id:=v_payterm;
          new.PO_PaymentTerm_ID:=v_payterm;
          new.c_invoiceschedule_id:=v_isched;
          new.m_pricelist_id:=v_plist;
          new.PO_PriceList_ID:=v_poplist;
          new.PaymentRule:='R';
          new.InvoiceRule:='I';
          new.PaymentRulePO:='R';
          new.Invoicegrouping:='000000000000000';
          new.DeliveryRule:='A';
          new.DeliveryViaRule:='D';
  END IF; 
  IF (TG_OP='UPDATE') THEN
    if new.iscustomer!=old.iscustomer and new.iscustomer='Y' then
        IF ((select count(*) from c_bp_vendor_acct where c_bpartner_id=new.c_bpartner_id)=0) THEN
            IF ((select count(*) from c_bp_customer_acct where c_bpartner_id=new.c_bpartner_id)=0) THEN
                if c_getconfigoption('createdatevaccount',new.ad_org_id)='Y' then
                    new.value:=zsfi_createaccounts(new.C_BPARTNER_ID , new.ad_org_id, 'C');
                END IF;
            END IF;
        END IF;
    END IF;
    IF new.isvendor!=old.isvendor and new.isvendor='Y' THEN
        IF ((select count(*) from c_bp_customer_acct where c_bpartner_id=new.c_bpartner_id)=0) THEN
            IF ((select count(*) from c_bp_vendor_acct where c_bpartner_id=new.c_bpartner_id)=0) THEN
                if c_getconfigoption('createdatevaccount',new.ad_org_id)='Y' then
                    new.value:=zsfi_createaccounts(new.C_BPARTNER_ID ,new.ad_org_id, 'V');
                END IF;
            END IF;
        END IF;   
    END IF;
   END IF;
RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;

select zsse_DropTrigger ('zssi_bpartner_trg2','c_bpartner');

CREATE TRIGGER zssi_bpartner_trg2
  BEFORE INSERT OR UPDATE 
  ON c_bpartner
  FOR EACH ROW
  EXECUTE PROCEDURE zssi_bpartner_trg2();

CREATE OR REPLACE FUNCTION zssi_bpartner_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
After insert or update
Default-Address for Business partners (Standard/Germany)
If EMPLOYEE- Only one userin ad-User is allowed
*****************************************************/
v_location_id              character varying;
v_count                    numeric;
v_shop                     character varying;
v_product varchar;
v_org varchar;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; 
  END IF;
  IF (TG_OP = 'INSERT') THEN
      -- Create Default Location
      select get_uuid() into v_location_id from dual;
      insert into c_location(c_location_id, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY, ADDRESS1, C_COUNTRY_ID)
        values (v_location_id,new.AD_Client_ID, new.AD_Org_ID, 'Y', now(), new.CREATEDBY, now(), new.UPDATEDBY, 'Standard','101');
      insert into c_bpartner_location (C_BPARTNER_LOCATION_ID, AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, UPDATED, UPDATEDBY, NAME, ISBILLTO, ISSHIPTO, ISPAYFROM, ISREMITTO,isheadquarter,  C_BPARTNER_ID, C_LOCATION_ID, ISTAXLOCATION)
            values (get_uuid(),new.AD_Client_ID, new.AD_Org_ID, 'Y', now(), new.CREATEDBY, now(), new.UPDATEDBY, 'Standard','Y','Y','Y','Y','Y',new.C_BPARTNER_ID,v_location_id,'Y');
      -- If Employee
      if new.isemployee='Y' then
        select count(*) into v_count from ad_user,c_bpartner where ad_user.c_bpartner_id=c_bpartner.c_bpartner_id and ad_user.c_bpartner_id=new.c_bpartner_id;
         if v_count=0 then
            -- Create default-Entry in ad_user
            insert into ad_user(AD_USER_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, NAME, C_BPARTNER_ID)
                    values(get_uuid(),new.AD_CLIENT_ID,new.AD_ORG_ID,new.CREATEDBY,new.UPDATEDBY,new.name,new.C_BPARTNER_ID);
         end if;
      end if;
      if new.autocreatecommission!='N' then
            select m_product_id into v_product from m_product where name='Provision';
            if v_product is null then 
                RAISE EXCEPTION '%','Sie müssen einen Artikel mit dem Namen Provision anlegen, wenn sie Mitarbeiter in der Vertriebsstruktur anlegen wollen.';  
            end if;
            if new.ad_org_id='0' then
                select ad_org_id into v_org from c_orgconfiguration where isstandard='Y';
            else
                v_org:=new.ad_org_id;
            end if;
            -- Create default-Entry in commission
            insert into c_commission(c_commission_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, NAME, C_BPARTNER_ID,c_currency_id,frequencytype,docbasistype,m_product_id,listdetails)
                   values(get_uuid(),new.AD_CLIENT_ID,v_org,new.CREATEDBY,new.UPDATEDBY,'Provision',new.C_BPARTNER_ID,'102','M',new.autocreatecommission,v_product,'Y');
      end if;
      -- Load ECommerce Preferences
      select count(*) into v_count from ad_module where name='ECommerce' and isactive='Y';
      if v_count=1 then
          select ZSE_SHOP_ID into v_shop from ZSE_SHOP where AD_ORG_ID in ('0',new.ad_org_id) and isactive='Y' order by ad_org_id desc limit 1;
          if v_shop is not null then
              insert into ZSE_ECOMMERCEGRANT (ZSE_ECOMMERCEGRANT_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, ZSE_SHOP_ID, C_BPARTNER_ID, PAYMENTMETHOD)
                select get_uuid(),new.AD_CLIENT_ID,new.AD_ORG_ID,new.CREATEDBY,new.UPDATEDBY,v_shop,new.C_BPARTNER_ID,PAYMENTMETHOD from zse_shop_defaultpaymethod where ZSE_SHOP_ID=v_shop and isactive='Y';
          end if;
      end if;
  END IF; 
  IF (TG_OP = 'UPDATE') THEN
      if new.isemployee='Y' then
         select count(*) into v_count from ad_user,c_bpartner where ad_user.c_bpartner_id=c_bpartner.c_bpartner_id and ad_user.c_bpartner_id=new.c_bpartner_id;
         if v_count>1 then
            RAISE EXCEPTION '%', '@zssi_OnlyOneUserOnEmp@';
            return old;
         end if;
         if v_count=0 then
            -- Create default-Entry in ad_user
            insert into ad_user(AD_USER_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, NAME, C_BPARTNER_ID)
                   values(get_uuid(),new.AD_CLIENT_ID,new.AD_ORG_ID,new.CREATEDBY,new.UPDATEDBY,new.name,new.C_BPARTNER_ID);
         end if;
      end if;
      -- Propagate ORG-Changes to Subsequent entities
      if new.ad_org_id!=old.ad_org_id then
        update c_bp_bankaccount set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id;
        update c_bp_customer_acct set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id;
        update c_bp_employee_acct set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id;
        update c_bp_salcategory set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id;
        update c_bpartner_location set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id;
        update c_bpartneremployeecalendarsettings set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id;
        update c_bpartneremployeeevent set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id;
        update c_bp_vendor_acct set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id;
        update c_bp_salcategory set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id;
        update ad_user set ad_org_id=new.ad_org_id where c_bpartner_id = new.c_bpartner_id and ad_org_id=old.ad_org_id;
        -- Trigger RE-Computation of Resource Plan
        update c_project_processstatus set resourceplanrequested='Y';
      end if;
  END IF;
RETURN NEW;
EXCEPTION
WHEN NO_DATA_FOUND THEN
  RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;


CREATE OR REPLACE FUNCTION c_bpartner_tree_trg() RETURNS trigger
AS $BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Matserdata
Imlements Business Partner Tree 
Used in Multi Level Marketing
*****************************************************/
v_Tree_ID              character varying;
v_Parent_ID            character varying;
v_exists               numeric;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF;  END IF;
  select ad_tree_id into v_Tree_ID from ad_tree where treetype='BP' and isactive='Y';
  select ad_treenode_id into v_Parent_ID from ad_treenode where ad_tree_id=v_Tree_ID and parent_id is null;
  -- only if tree exists
  if v_Tree_ID is not null and v_Parent_ID is not null then
       IF TG_OP in ('INSERT','UPDATE') then
            select count(*) into v_exists from AD_TreeNode where AD_Tree_ID=v_Tree_ID and Node_ID=new.c_bpartner_ID;
            if v_exists =0 and new.isemployee='Y' THEN    
                --  Insert into TreeNode
                INSERT INTO AD_TreeNode
                  (AD_TreeNode_ID, AD_Client_ID, AD_Org_ID,
                  IsActive, Created, CreatedBy, Updated, UpdatedBy,
                  AD_Tree_ID, Node_ID,
                  Parent_ID, SeqNo)
                VALUES
                  (get_uuid(), new.AD_Client_ID, new.AD_Org_ID,
                  new.IsActive, new.Created, new.CreatedBy, new.Updated, new.UpdatedBy,
                  v_Tree_ID, new.c_bpartner_ID,
                  '0', (CASE new.IsSummary WHEN 'Y' THEN 100 ELSE 999 END));    -- Summary Nodes first
            end if;
            if new.isactive='N' then 
                delete from AD_TreeNode where AD_Tree_ID=v_Tree_ID and Node_ID=new.c_bpartner_ID;
            end if;
       else --delete
            delete from AD_TreeNode where AD_Tree_ID=v_Tree_ID and Node_ID=old.c_bpartner_ID;
       end if;
  end if;
  IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; 
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
 
select zsse_DropTrigger ('c_bpartner_tree_trg','c_bpartner');

CREATE TRIGGER c_bpartner_tree_trg
  AFTER INSERT OR UPDATE OR DELETE
  ON c_bpartner
  FOR EACH ROW
  EXECUTE PROCEDURE c_bpartner_tree_trg();

  
CREATE OR REPLACE FUNCTION zssi_aduser_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Business Partner - On Insert. Only one user on employees and undefined partner
*****************************************************/
v_count          numeric;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN  RETURN NEW; END IF; 
  select count(*) into v_count from ad_user,c_bpartner where ad_user.c_bpartner_id=c_bpartner.c_bpartner_id and ad_user.c_bpartner_id=new.c_bpartner_id 
  and (c_bpartner.isemployee='Y') and ad_user.ad_user_id!=new.ad_user_id;
  if v_count > 0  then
      RAISE EXCEPTION '%', '@zssi_OnlyOneUserOnEmp@';
  end if;
  RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
  
select zsse_DropTrigger ('zssi_aduser_trg','ad_user');

CREATE TRIGGER zssi_aduser_trg
  BEFORE INSERT or UPDATE
  ON ad_user FOR EACH ROW
  EXECUTE PROCEDURE zssi_aduser_trg();




CREATE OR REPLACE FUNCTION zssi_mproductprice_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2015 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
**************************************************************************************************************************************************/
v_plv varchar;
v_pl  varchar;
v_valid timestamp;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; END IF; 

       if (TG_OP ='UPDATE') then
        if coalesce(old.c_uom_id,'')!=coalesce(new.c_uom_id,'') or coalesce(old.m_manufacturer_id,'')!=coalesce(new.m_manufacturer_id,'') then
            update m_offerplist_v set c_uom_id=new.c_uom_id, updated=now(),updatedby=new.updatedby
            where issalesoffer='Y' and m_pricelist_id=(select m_pricelist_id from m_pricelist_version where m_pricelist_version_id=new.m_pricelist_version_id)
            and m_product_id=new.m_product_id
            and case when old.c_uom_id is not null then c_uom_id=old.c_uom_id else c_uom_id is null end;
        end if;
       end if;
       SELECT pv.M_PRICELIST_VERSION_ID,pv.m_pricelist_id,pv.validfrom  into v_plv,v_pl,v_valid FROM M_PRICELIST_VERSION pv,m_pricelist p
                    WHERE p.m_pricelist_id = pv.m_pricelist_id 
                       and p.m_pricelist_id = (select m_pricelist_id from M_PRICELIST_VERSION where M_PRICELIST_VERSION_id=new.M_PRICELIST_VERSION_id) and
                           pv.VALIDFROM =    (SELECT max(VALIDFROM)    FROM M_PRICELIST_VERSION   WHERE M_PRICELIST_ID=(select m_pricelist_id from M_PRICELIST_VERSION where M_PRICELIST_VERSION_id=new.M_PRICELIST_VERSION_id))
                    LIMIT 1;
       -- If a Product is in the new PL-Version, update all Offers to that new version
       -- raise notice '%',v_plv||'#'||new.M_PRICELIST_VERSION_ID;
       if v_plv=new.M_PRICELIST_VERSION_ID then
            update m_offer set m_productprice_id=new.m_productprice_id where m_productprice_id in 
                    (select p.m_productprice_id from m_productprice p,M_PRICELIST_VERSION v,m_pricelist pl where p.M_PRICELIST_VERSION_id=v.M_PRICELIST_VERSION_id
                     and v.M_PRICELIST_id=pl.M_PRICELIST_id and pl.M_PRICELIST_id=v_pl and v.M_PRICELIST_VERSION_id!=new.M_PRICELIST_VERSION_ID)
                     and  coalesce(v_valid,trunc(now()))<=coalesce(dateto,trunc(now()));
       end if;
  IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; 
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;

select zsse_DropTrigger ('zssi_mproductprice_trg','m_productprice');

CREATE TRIGGER zssi_mproductprice_trg
  AFTER UPDATE OR INSERT
  ON m_productprice
  FOR EACH ROW
  EXECUTE PROCEDURE zssi_mproductprice_trg();

  
CREATE OR REPLACE FUNCTION zssi_mproductpo_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
On Insert or Update. Set the Latest Vendor and Vendor-Productno. Update Price History
In M_product
*****************************************************/
v_vendor character varying;
v_vproductno character varying;
v_productid character varying;
v_org character varying;
v_youngest timestamp;
v_manufacturer varchar;
v_manuno varchar;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; END IF; 
   if (TG_OP in ('INSERT','UPDATE')) then
      v_productid:=new.m_product_id;
      v_org:=new.ad_org_id;
      select max(validfrom) into v_youngest from m_product_po_history where 
             case when new.priceeffective is not null then validfrom<=new.priceeffective else 1=1 end 
             and m_product_po_id=new.m_product_po_id;
      if trunc(coalesce(new.priceeffective,now()))>coalesce(v_youngest,now()-1) then
        insert into m_product_po_history (M_PRODUCT_PO_HISTORY_ID,M_PRODUCT_PO_ID, M_PRODUCT_ID, C_BPARTNER_ID, AD_CLIENT_ID, AD_ORG_ID, 
                                          CREATEDBY, UPDATEDBY, PRICELIST, PRICEPO, VALIDFROM) 
        VALUES (get_uuid(),new.M_PRODUCT_PO_ID, new.M_PRODUCT_ID, new.C_BPARTNER_ID, new.AD_CLIENT_ID, new.AD_ORG_ID, 
                                          new.CREATEDBY, new.UPDATEDBY, new.PRICELIST, new.PRICEPO, trunc(coalesce(new.priceeffective,now())));

      else
        update m_product_po_history set updated=now(),updatedby=new.updatedby,PRICELIST=new.PRICELIST,PRICEPO=new.PRICEPO
        where m_product_po_id=new.m_product_po_id and validfrom=v_youngest;
      end if;
       if (TG_OP ='UPDATE') then
        if coalesce(old.c_uom_id,'')!=coalesce(new.c_uom_id,'') or coalesce(old.m_manufacturer_id,'')!=coalesce(new.m_manufacturer_id,'') then
            update m_offer_v set c_uom_id=new.c_uom_id, m_manufacturer_id=new.m_manufacturer_id, updated=now(),updatedby=new.updatedby
            where issalesoffer='N' and c_bpartner_id=new.c_bpartner_id and m_product_id=new.m_product_id
            and case when old.c_uom_id is not null then c_uom_id=old.c_uom_id else c_uom_id is null end
            and case when old.m_manufacturer_id is not null then m_manufacturer_id=old.m_manufacturer_id else m_manufacturer_id is null end;
        end if;
       end if;
   else
      v_productid:=old.m_product_id;
      v_org:=old.ad_org_id;
   end if;
   -- Select current Vendor
   select PO.C_BPARTNER_ID,po.vendorproductno,m.name,po.manufacturernumber into v_vendor ,v_vproductno,v_manufacturer,v_manuno
                   from M_PRODUCT_PO po left join  m_manufacturer m on m.m_manufacturer_id=po.m_manufacturer_id
                   where po.m_product_id=v_productid and PO.iscurrentvendor='Y' and PO.AD_ORG_ID in ('0',v_org) order by coalesce(po.qualityrating,0) desc,po.updated desc limit 1;
  -- Do the Update
  update m_product set c_bpartner_id=v_vendor, vendorproductno=v_vproductno,
         manufacturer=v_manufacturer,
         manufacturernumber=v_manuno 
  where m_product_id=v_productid;
  IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; 
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;


drop trigger zssi_mproductpo_trg on m_product_po;

CREATE TRIGGER zssi_mproductpo_trg
  AFTER INSERT OR UPDATE OR DELETE
  ON m_product_po
  FOR EACH ROW
  EXECUTE PROCEDURE zssi_mproductpo_trg();

/**************************************************************************************************************************************+

IMPROVEMENTS - Master-DATA

Database Functions

Reactivate Deactivated Products







***************************************************************************************************************************************/


CREATE OR REPLACE FUNCTION zssi_reactivateitem(p_PInstance_ID character varying) RETURNS void 
AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************

Process: Reactivate an Item
*****************************************************/
v_message character varying:='Success';
v_Record_ID  character varying;
v_User    character varying;
v_count numeric;
BEGIN
    --  Update AD_PInstance
    PERFORM AD_UPDATE_PINSTANCE(p_PInstance_ID, NULL, 'Y', NULL, NULL) ;
    SELECT i.Record_ID, i.AD_User_ID into v_Record_ID, v_User from AD_PINSTANCE i WHERE i.AD_PInstance_ID=p_PInstance_ID;
    if v_Record_ID is null then
       RAISE NOTICE '%','Pinstance not found-Using as RecordID ' || p_PInstance_ID;
       v_Record_ID:=p_PInstance_ID;
       v_User:='0';
    else
      -- Select Product-ID from parameters
      select P_String into v_Record_ID from AD_PINSTANCE_PARA where ParameterName='m_product_id' and AD_PInstance_ID=p_PInstance_ID;
    end if;--  Update AD_PInstance
    if v_Record_ID is null then
        v_message:='Record not found';
    end if;
    update m_product set isactive='Y',updated=now(),updatedby= v_User where m_product_id=v_Record_ID;
 
    PERFORM AD_UPDATE_PINSTANCE(p_PInstance_ID, NULL, 'N', 1, v_message);
    return;
EXCEPTION
    WHEN OTHERS then
       v_message:= '@ERROR=' || SQLERRM;   
       --ROLLBACK;
       -- 0=failed
       PERFORM AD_UPDATE_PINSTANCE(p_PInstance_ID, NULL, 'N', 0, v_message);
       return;
END ; $BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
ALTER FUNCTION zssi_reactivateitem(p_PInstance_ID character varying) OWNER TO tad; 




CREATE OR REPLACE FUNCTION zssi_bplocation_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Business Partner - Add main Address Searchable to c_bpartner
*****************************************************/
v_count          numeric;
v_country        character varying;
v_countryID      character varying;
v_zip            character varying;
v_city           character varying;
v_adr1           character varying;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN RETURN NEW; END IF; 
  select count(*) into v_count from c_bpartner_location where c_bpartner_id=new.c_bpartner_id and isheadquarter='Y';
  -- Do only allow one heaquarter per business partner
  if (TG_OP = 'INSERT' and v_count>0 and new.isheadquarter='Y') then
      RAISE EXCEPTION '%', '@zssi_OnlyOneHeadinBP@';
  end if; 
  if TG_OP = 'UPDATE' then
      if (v_count>0 and old.isheadquarter='N' and new.isheadquarter='Y') then
         RAISE EXCEPTION '%', '@zssi_OnlyOneHeadinBP@';
      end if;
  end if;
  -- Update the name of the location
  If (new.c_location_id is not null) then    
     select c_country_id,city,postal,address1 into v_countryID,v_city,v_zip,v_adr1 from c_location where c_location_id=new.c_location_id;
     select name into v_country from c_country where c_country_id=v_countryID;
     new.name:=substr(coalesce(v_country,' ')||', '||coalesce(v_city,' ')||', '||coalesce(v_adr1,' '),1,60);
     if (new.isheadquarter='Y') then 
          -- support redundant columns in filter dialog
          update c_bpartner set
            country=v_country,
            city=v_city,
            zipcode=v_zip,
            c_location_id = new.c_location_id
          where c_bpartner_id=new.c_bpartner_id;
     end if;
  end if;
RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
ALTER FUNCTION zssi_bplocation_trg() OWNER TO tad;


CREATE OR REPLACE FUNCTION m_product_trg()
  RETURNS trigger AS
$BODY$ DECLARE 

/***************************************************************************************************************************************************
* The contents of this file are subject to the Openbravo  Public  License Version  1.0  (the  "License"),  being   the  Mozilla   Public  License
* Version 1.1  with a permitted attribution clause; you may not  use this file except in compliance with the License. You  may  obtain  a copy of
* the License at http://www.openbravo.com/legal/license.html. Software distributed under the License  is  distributed  on  an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the specific  language  governing  rights  and  limitations
* under the License. The Original Code is Openbravo ERP.
* The Initial Developer of the Original Code is Openbravo SL. Parts created by Openbravo are Copyright (C) 2001-2009 Openbravo SL
* All Rights Reserved.
* Contributor(s): Stefan Zimmermann, 02/2011, sz@zimmermann-software.de (SZ) Contributions are Copyright (C) 2011 Stefan Zimmermann
* 
****************************************************************************************************************************************************/

/*
 Contributions: Modified wuth new accounting rules. Accounts are not copied anymore 
                Added Freight Products must not be Items 
******************************************************************************************************************************/
    v_xTree_ID                                     VARCHAR(32); --OBTG:varchar2--
    v_xParent_ID                                   VARCHAR(32); --OBTG:varchar2--
    v_ControlNo                                NUMERIC;
BEGIN
    IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; 
    END IF;

 IF (TG_OP = 'UPDATE') THEN
    -- Do not allow to de-activate products with OnHand Qty
      IF ((new.IsActive='N' AND old.IsActive='Y') or (new.producttype='S' and old.producttype='I')
           or new.isserialtracking!=old.isserialtracking or new.isbatchtracking!=old.isbatchtracking) THEN
      SELECT  COALESCE(SUM(QtyOnHand)+SUM(QtyReserved)*.111+SUM(QtyOrdered)*999, 0) INTO v_ControlNo
      FROM (SELECT QtyOnHand, 0 AS QtyReserved, 0 AS QtyOrdered
      FROM M_Storage_Detail s
      WHERE s.M_Product_ID=new.M_Product_ID
      UNION
      SELECT 0 AS QtyOnHand, QtyReserved, QtyOrdered
      FROM M_Storage_Pending s
      WHERE s.M_Product_ID=new.M_Product_ID) A;
        IF (v_ControlNo <> 0) THEN
          RAISE EXCEPTION '%', '@CannotChangeStockedProduct@'; --OBTG:-20400--
        END IF;
      END IF;
 END IF;
 -- Restriction on Freight Products and Sets
 IF (TG_OP = 'INSERT' or TG_OP = 'UPDATE') THEN
     if new.isfreightproduct='Y' and (new.producttype!='S' or new.isstocked!='N') then
        RAISE EXCEPTION '%', '@zssi_FreightMustbeserviceandnotstocked@'; --OBTG:-20400--
     END IF;
     if new.issetitem='Y' and (new.producttype!='I' or new.typeofproduct!='ST' or new.isstocked!='N' or new.isbom!='Y' or new.ispurchased!='N') then
        RAISE EXCEPTION '%', '@SetmustbeBomButnotbeStocked@'; --OBTG:-20400--
     END IF;
 END IF;
 -- Translations
 IF (TG_OP = 'INSERT') THEN
     --  Create Translation Row
     INSERT INTO M_Product_Trl
         (M_Product_Trl_ID, M_Product_ID, AD_Language, AD_Client_ID, AD_Org_ID,
         IsActive, Created, CreatedBy, Updated, UpdatedBy,
         Name, DocumentNote,description, IsTranslated)
     SELECT get_uuid(), new.M_Product_ID, AD_Language, new.AD_Client_ID, new.AD_Org_ID,
         new.IsActive, new.Created, new.CreatedBy, new.Updated, new.UpdatedBy,
         new.Name, new.DocumentNote,new.description, 'N' FROM  AD_Language
     WHERE IsActive = 'Y' AND IsSystemLanguage = 'Y';
   -- AND EXISTS (SELECT * FROM AD_Client
   --  WHERE AD_Client_ID=new.AD_Client_ID AND IsMultiLingualDocument='Y');
 ELSEIF (TG_OP = 'UPDATE') THEN
   UPDATE m_product_trl
   SET name = new.name, description = new.description, documentnote = new.documentnote,
       Updated=new.Updated, updatedBy=new.UpdatedBy
   WHERE
         m_product_id = new.m_product_id
     AND ad_language = (SELECT ad_language FROM AD_Client
                        WHERE AD_Client_ID=new.AD_Client_ID);
END IF;
RETURN NEW;
END; $BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;

  
CREATE OR REPLACE FUNCTION zspm_productbom_post_trg()
RETURNS trigger AS
$body$
 -- Synchronize all BASE-Worksteps producing this ITEM
DECLARE
 v_cur RECORD;
 v_count numeric;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF;  END IF;

  IF (TG_OP <> 'DELETE') then
    if c_getconfigoption('synchronizeworkstepboms',new.ad_org_id)='Y' then
        IF (TG_OP = 'INSERT') THEN
            -- All BASE-Worksteps producing this Item
            for v_cur in (select * from c_projecttask where assembly='Y' and c_project_id is null and m_product_id=new.m_product_id)
            LOOP   
            INSERT INTO zspm_projecttaskbom (zspm_projecttaskbom_id,isactive, c_projecttask_id, ad_client_id, ad_org_id, createdby, updatedby, m_product_id, quantity,issuing_locator,receiving_locator,line,description)
            VALUES (get_uuid(), new.isactive,v_cur.c_projecttask_id, v_cur.ad_client_id, v_cur.ad_org_id, new.createdby, NEW.updatedby, new.m_productbom_id, new.bomqty,v_cur.issuing_locator,v_cur.receiving_locator,new.line,new.description);
            END LOOP;
        END IF; -- TG_OP = 'INSERT'
        IF (TG_OP = 'UPDATE') THEN
            for v_cur in (select * from c_projecttask where assembly='Y' and c_project_id is null and m_product_id=new.m_product_id)
            LOOP 
            select count(*) into v_count from zspm_projecttaskbom where c_projecttask_id=v_cur.c_projecttask_id and m_product_id=old.m_productbom_id and line=old.line;
            if v_count=1 then
                UPDATE zspm_projecttaskbom set isactive=new.isactive, updatedby=NEW.updatedby,updated=now(), m_product_id=new.m_productbom_id, quantity=new.bomqty,description=new.description
                where c_projecttask_id=v_cur.c_projecttask_id and m_product_id=old.m_productbom_id and line=old.line;
            else
                INSERT INTO zspm_projecttaskbom (zspm_projecttaskbom_id,isactive, c_projecttask_id, ad_client_id, ad_org_id, createdby, updatedby, m_product_id, quantity,issuing_locator,receiving_locator,line,description)
                VALUES (get_uuid(), new.isactive,v_cur.c_projecttask_id, v_cur.ad_client_id, v_cur.ad_org_id, new.createdby, NEW.updatedby, new.m_productbom_id, new.bomqty,v_cur.issuing_locator,v_cur.receiving_locator,new.line,new.description);
            end if;
            END LOOP;
        END IF; -- TG_OP = 'UPDATE'
    END IF; -- Config Option
    RETURN NEW;
  ELSE -- TG_OP = 'DELETE'
      if c_getconfigoption('synchronizeworkstepboms',old.ad_org_id)='Y' then
        -- All BASE-Worksteps producing this Item
        for v_cur in (select * from c_projecttask where assembly='Y' and c_project_id is null and m_product_id=old.m_product_id)
        LOOP   
           DELETE FROM  zspm_projecttaskbom where c_projecttask_id=v_cur.c_projecttask_id and m_product_id=old.m_productbom_id and line=old.line;
        END LOOP;
      end if;
      RETURN OLD;
  END IF;
END;
$body$
LANGUAGE 'plpgsql';

SELECT zsse_droptrigger('zspm_productbom_post_trg', 'm_product_bom');
CREATE TRIGGER zspm_productbom_post_trg
  AFTER INSERT OR UPDATE OR DELETE
  ON m_product_bom FOR EACH ROW
  EXECUTE PROCEDURE zspm_productbom_post_trg();

 
  
  
CREATE OR REPLACE FUNCTION zssi_getNewProductValue(p_org character varying)
  RETURNS character varying AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2012 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************

Ohne hochdrehen der Sequenz - Default Wert auf der Oberfläche

*****************************************************/
v_return               character varying:='';
BEGIN
  if c_getconfigoption('autoproductvaluesequence', p_org)='Y' then
     select Ad_Sequence_Doc('Product Value', p_org, 'N') into v_return;
  end if;
  RETURN v_return;
END;
$BODY$ LANGUAGE 'plpgsql' VOLATILE  COST 100;
  
  
  
CREATE OR REPLACE FUNCTION m_product_value_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2013 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************

Hochdrehen der Sequenz -Erst bei echtem Abspeichen

*****************************************************/
v_isincremented BOOLEAN:=false;
BEGIN
    IF AD_isTriggerEnabled()='N' THEN IF TG_OP = 'DELETE' THEN RETURN OLD; ELSE RETURN NEW; END IF; 
    END IF; 
    -- Find a free Product Value if Option Configured and a double value was entered
    IF (TG_OP = 'INSERT' or TG_OP = 'UPDATE') THEN
        IF c_getconfigoption('autoproductvaluesequence',new.ad_org_id)='Y' then
            IF (TG_OP = 'INSERT' and new.value is null) THEN
                select p_documentno into new.value from ad_sequence_doc('Product Value',new.ad_org_id,'N');
            END IF;
            WHILE (select count(*) from m_product where value=new.value and m_product_id!=new.m_product_id)>0 
            LOOP
                select p_documentno into new.value from ad_sequence_doc('Product Value',new.ad_org_id,'Y');
                v_isincremented:=true;
            END LOOP;
            IF (TG_OP = 'INSERT' and v_isincremented=false and  ad_sequence_doc('Product Value',new.ad_org_id,'N')=new.value) THEN
                perform ad_sequence_doc('Product Value',new.ad_org_id,'Y');
            END IF;
        end if;
        if instr(new.value,'|')>0 and c_getconfigoption('kombibarcode','0')='Y' then
            raise exception '%', '@invalidcharacter@'||': |';
        end if;
   END IF;
RETURN NEW;
END; $BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
 
select zsse_droptrigger('m_product_value_trg','m_product');

CREATE TRIGGER m_product_value_trg
  BEFORE INSERT OR UPDATE 
  ON m_product
  FOR EACH ROW
  EXECUTE PROCEDURE m_product_value_trg();


CREATE OR REPLACE VIEW c_bpartner_v AS 
 SELECT p.ad_client_id, p.ad_org_id, p.c_bpartner_id, p.value, p.name, p.referenceno, p.so_creditlimit - p.so_creditused AS so_creditavailable, p.so_creditlimit, p.so_creditused, p.iscustomer, p.isvendor, p.actuallifetimevalue AS revenue, c.name AS contact, c.phone, a.postal, a.city, c.email
   FROM c_bpartner p
   LEFT JOIN ad_user c ON p.c_bpartner_id::text = c.c_bpartner_id::text
   LEFT JOIN c_bpartner_location l ON p.c_bpartner_id::text = l.c_bpartner_id::text
   LEFT JOIN c_location a ON l.c_location_id::text = a.c_location_id::text;

   
CREATE OR REPLACE FUNCTION c_uom_conversion_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Second UOM must differ from 1st UOM
*****************************************************/
v_count                   numeric;
BEGIN
    if new.multiplyrate>0 then
        new.dividerate:=1/new.multiplyrate;
    end if;
RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;

SELECT zsse_droptrigger('c_uom_conversion_trg', 'c_uom_conversion');

CREATE TRIGGER c_uom_conversion_trg
  BEFORE INSERT OR UPDATE 
  ON c_uom_conversion FOR EACH ROW
  EXECUTE PROCEDURE c_uom_conversion_trg();
  
   
CREATE OR REPLACE FUNCTION m_product_po_uom_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Second UOM must differ from 1st UOM


TODO: Remove Trigger - Only temporyry deactivated field.

*****************************************************/
v_count                   numeric;
BEGIN
   if new.c_uom_id is not null then  
    select count(*) into v_count from m_product where m_product_id=new.m_product_id and c_uom_id=new.c_uom_id;
    if v_count>0 then
        RAISE EXCEPTION '%', '@SecondUomNotFirstUOM@';
    END IF; 
    select count(*) into v_count from m_product_uom where m_product_id=new.m_product_id and c_uom_id=new.c_uom_id;
    if v_count=0 then
        RAISE EXCEPTION '%', '@SecondUomMustExistUOM@';
    END IF; 
   end if;
RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;

SELECT zsse_droptrigger('m_product_po_uom_trg', 'm_product_po');
SELECT zsse_droptrigger('m_product_po_uom_trg', 'm_productprice');
SELECT zsse_droptrigger('m_product_po_uom_trg', 'm_offer_product');

CREATE TRIGGER  m_product_po_uom_trg
  BEFORE INSERT OR UPDATE 
  ON  m_product_po FOR EACH ROW
  EXECUTE PROCEDURE  m_product_po_uom_trg();
  
CREATE TRIGGER  m_product_po_uom_trg
  BEFORE INSERT OR UPDATE 
  ON  m_productprice FOR EACH ROW
  EXECUTE PROCEDURE  m_product_po_uom_trg();
  
CREATE TRIGGER  m_product_po_uom_trg
  BEFORE INSERT OR UPDATE 
  ON  m_offer_product FOR EACH ROW
  EXECUTE PROCEDURE  m_product_po_uom_trg();
  
  
CREATE OR REPLACE FUNCTION m_product_po_chk_restrictions_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
v_count                   numeric;
BEGIN

    select count(*) into v_count from m_product_po where m_product_id=new.m_product_id and c_bpartner_id=new.c_bpartner_id and
           case when new.c_uom_id is not null then c_uom_id=new.c_uom_id else c_uom_id is null end
           and  case when new.m_manufacturer_id is not null then m_manufacturer_id=new.m_manufacturer_id else m_manufacturer_id is null end
           and m_product_po_id!=new.m_product_po_id;
    if v_count>0 then
        RAISE EXCEPTION '%', '@ProductUOMManufacturerUnique@';
    END IF; 
    
RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
  
SELECT zsse_droptrigger('m_product_po_chk_restrictions_trg', 'm_product_po');  

CREATE TRIGGER  m_product_po_chk_restrictions_trg
  BEFORE INSERT OR UPDATE 
  ON  m_product_po FOR EACH ROW
  EXECUTE PROCEDURE  m_product_po_chk_restrictions_trg();  
  
  
CREATE OR REPLACE FUNCTION m_productprice_chk_restrictions_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
v_count                   numeric;
BEGIN

    select count(*) into v_count from m_productprice where m_product_id=new.m_product_id and m_pricelist_version_id=new.m_pricelist_version_id and
           case when new.c_uom_id is not null then c_uom_id=new.c_uom_id else c_uom_id is null end
           and  case when new.m_manufacturer_id is not null then m_manufacturer_id=new.m_manufacturer_id else m_manufacturer_id is null end
           and m_productprice_id!=new.m_productprice_id;
    if v_count>0 then
        RAISE EXCEPTION '%', '@ProductUOMUnique@';
    END IF; 
    
RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;

SELECT zsse_droptrigger('m_productprice_chk_restrictions_trg', 'm_productprice');
  
CREATE TRIGGER  m_productprice_chk_restrictions_trg
  BEFORE INSERT OR UPDATE 
  ON  m_productprice FOR EACH ROW
  EXECUTE PROCEDURE  m_productprice_chk_restrictions_trg();  
  
CREATE OR REPLACE FUNCTION m_offer_product_chk_restrictions_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
v_count                   numeric;
BEGIN

    select count(*) into v_count from m_offer_product where m_product_id=new.m_product_id and m_offer_id=new.m_offer_id and
           case when new.c_uom_id is not null then c_uom_id=new.c_uom_id else c_uom_id is null end 
           and  case when new.m_manufacturer_id is not null then m_manufacturer_id=new.m_manufacturer_id else m_manufacturer_id is null end
           and m_offer_product_id!=new.m_offer_product_id;
    if v_count>0 then
        RAISE EXCEPTION '%', '@ProductUOMUnique@';
    END IF; 
    
RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;

SELECT zsse_droptrigger('m_offer_product_chk_restrictions_trg', 'm_offer_product');
  
CREATE TRIGGER  m_offer_product_chk_restrictions_trg
  BEFORE INSERT OR UPDATE 
  ON  m_offer_product FOR EACH ROW
  EXECUTE PROCEDURE  m_offer_product_chk_restrictions_trg();  
  
  
  
  
CREATE OR REPLACE FUNCTION ma_machine_type_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Business Partner - On Insert. Only one user on employees and undefined partner
*****************************************************/
v_count          numeric;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN  RETURN NEW; END IF; 
  IF (TG_OP = 'UPDATE' ) THEN
    if new.name!=old.name then
        update ma_machine set machinetypename=new.name where ma_machine_type_id=new.ma_machine_type_id;
    end if;
  END IF;
  RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
  
select zsse_DropTrigger ('ma_machine_type_trg','ma_machine_type');

CREATE TRIGGER ma_machine_type_trg
  after UPDATE
  ON ma_machine_type FOR EACH ROW
  EXECUTE PROCEDURE ma_machine_type_trg();

CREATE OR REPLACE FUNCTION ma_machine_trg()
  RETURNS trigger AS
$BODY$ DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Smartprefs
Business Partner - On Insert. Only one user on employees and undefined partner
*****************************************************/
v_count          numeric;
BEGIN
  IF AD_isTriggerEnabled()='N' THEN  RETURN NEW; END IF; 
  IF (TG_OP != 'DELETE' ) THEN
    new.machinetypename=(select name from ma_machine_type where ma_machine_type_id=new.ma_machine_type_id);   
  END IF;
  RETURN NEW;
END;
$BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
  
select zsse_DropTrigger ('ma_machine_trg','ma_machine');

CREATE TRIGGER ma_machine_trg
  before UPDATE or INSERT
  ON ma_machine FOR EACH ROW
  EXECUTE PROCEDURE ma_machine_trg();  
  
  
CREATE OR REPLACE FUNCTION zssi_isProductSelectableinWindow(p_windowID character varying,p_productID varchar)
  RETURNS character varying AS
$BODY$ DECLARE 
v_test varchar;
BEGIN
  -- Test SElecrtable for Production in PCategory
  select c.isselectableinproduction into v_test from m_product_category c,m_product p where c.m_product_category_id=p.m_product_category_id and p.m_product_id=p_productID;
  if coalesce(v_test,'Y')='N' then
    if p_windowID in (select ad_window_id from ad_window where ad_module_id in (select ad_module_id from ad_module where name in ('Projects','Serial Production'))) then
        return 'N';
    end if;
  end if;
  RETURN 'Y';
END;
$BODY$ LANGUAGE 'plpgsql' VOLATILE  COST 100;
    
 
CREATE OR REPLACE FUNCTION zssi_isCategorySelectableinWindow(p_windowID character varying,p_categoryID varchar)
  RETURNS character varying AS
$BODY$ DECLARE 
v_test varchar;
BEGIN
  -- Test SElecrtable for Production in PCategory
  select c.isselectableinproduction into v_test from m_product_category c where c.m_product_category_id=p_categoryID;
  if coalesce(v_test,'Y')='N' then
    if p_windowID in (select ad_window_id from ad_window where ad_module_id in (select ad_module_id from ad_module where name in ('Projects','Serial Production'))) then
        return 'N';
    end if;
  end if;
  RETURN 'Y';
END;
$BODY$ LANGUAGE 'plpgsql' VOLATILE  COST 100;
     
CREATE OR REPLACE FUNCTION m_manufacturerleadtime_process (p_pinstance_id varchar)  RETURNS void AS
$BODY$ 
DECLARE 
/***************************************************************************************************************************************************
The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations under the License.
The Original Code is OpenZ. The Initial Developer of the Original Code is Stefan Zimmermann (sz@zimmermann-software.de)
Copyright (C) 2011 Stefan Zimmermann All Rights Reserved.
Contributor(s): ______________________________________.
***************************************************************************************************************************************************
Part of Projects, 
Updates Projects, Tasks with actual 
Costs and Schedule Status
Direct call variant (overloaded)
*****************************************************/
v_message character varying:='OK - Process finished';
Cur_Parameter record;
v_manufacturer_id varchar;
v_leadtime numeric;
v_rating numeric;
BEGIN
    --  Update AD_PInstance
    PERFORM AD_UPDATE_PINSTANCE(p_PInstance_ID, NULL, 'Y', NULL, NULL) ;
    -- Call the Proc
     FOR Cur_Parameter IN
          (SELECT para.*
           FROM ad_pinstance pi, ad_pinstance_Para para
           WHERE 1=1
            AND pi.ad_pinstance_ID = para.ad_pinstance_ID
            AND pi.ad_pinstance_ID = p_pinstance_ID
           ORDER BY para.SeqNo
          )
        LOOP        
          IF ( UPPER(Cur_Parameter.parametername) = UPPER('m_manufacturer_id') ) THEN
            v_manufacturer_id := Cur_Parameter.p_string;
          END IF;
          IF ( UPPER(Cur_Parameter.parametername) = UPPER('deliverytimePromised') ) THEN
            v_leadtime := Cur_Parameter.p_number;
          END IF;
          IF ( UPPER(Cur_Parameter.parametername) = UPPER('qualityrating') ) THEN
            v_rating := Cur_Parameter.p_number;
          END IF;
        END LOOP; -- Get Parameter
        update m_product_po set deliverytime_Promised=coalesce(v_leadtime,deliverytime_Promised),qualityrating=coalesce(v_rating,qualityrating) where m_manufacturer_id=v_manufacturer_id;       
    PERFORM AD_UPDATE_PINSTANCE(p_PInstance_ID, NULL, 'N', 1, v_Message) ;
    RETURN;
EXCEPTION
WHEN OTHERS THEN
  v_message:= '@ERROR=' || SQLERRM;
  RAISE NOTICE '%',v_message ;
  PERFORM AD_UPDATE_PINSTANCE(p_PInstance_ID, NULL, 'N', 0, v_message) ;
  RETURN;
END ; $BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;




select zsse_DropFunction ('c_Bpartner_getFastEntryData');

CREATE OR REPLACE FUNCTION c_Bpartner_getFastEntryData(i_bpartner_id varchar,OUT p_org_id VARCHAR,
  OUT p_value VARCHAR, OUT p_name VARCHAR, OUT p_bp_group_id VARCHAR, OUT p_url VARCHAR, OUT p_salesrep_id VARCHAR,
  OUT p_LOCATION_ID varchar,OUT p_ADDRESS1 VARCHAR, OUT p_ADDRESS2 VARCHAR,OUT p_CITY varchar,OUT p_POSTAL varchar,OUT P_COUNTRY_ID varchar,OUT p_uidnumber varchar,OUT P_TAX_ID varchar,
  OUT p_LOCATION_ID2 varchar,OUT p_ADDRESS12 VARCHAR, OUT p_ADDRESS22 VARCHAR,OUT p_CITY2 varchar,OUT p_POSTAL2 varchar, OUT P_COUNTRY_ID2 varchar,
  OUT p_FIRSTNAME varchar,OUT p_LASTNAME VARCHAR, OUT p_TITLE VARCHAR,OUT p_GREETING_ID varchar,OUT p_EMAIL varchar,OUT p_PHONE varchar,OUT p_PHONE2 VARCHAR,
  OUT p_BANK_NAME varchar,OUT p_IBAN VARCHAR, OUT p_SWIFTCODE VARCHAR, OUT p_iscustomer VARCHAR,
  OUT p_isvendor VARCHAR,OUT p_isemployee VARCHAR, OUT p_paymentrule  VARCHAR,OUT p_payterm  VARCHAR
  ) RETURNS SETOF RECORD 
AS $BODY$

DECLARE


v_bplocid varchar;
v_bplocid2  varchar;
v_user varchar;
v_bank varchar;
BEGIN
 select ad_org_id,value,name,c_bp_group_id,url,salesrep_id,case when name='n/a' then 'Y' else iscustomer end as iscustomer,
        isvendor,isemployee,paymentrule,c_paymentterm_id
        into p_org_id,p_value,p_name , p_bp_group_id, p_url, p_salesrep_id,p_iscustomer,p_isvendor,p_isemployee,p_paymentrule,p_payterm
 from c_bpartner where c_bpartner_id=i_bpartner_id;
 select c_location_id,c_bpartner_location_id,uidnumber,c_tax_id into  p_LOCATION_ID,v_bplocid,p_uidnumber,P_TAX_ID from c_bpartner_location where c_bpartner_id=i_bpartner_id
        and isheadquarter='Y' limit 1;
        
 select ADDRESS1, ADDRESS2, CITY, POSTAL, C_COUNTRY_ID into p_ADDRESS1 , p_ADDRESS2 ,p_CITY,p_POSTAL , P_COUNTRY_ID   
        from c_location where c_location_id=p_LOCATION_ID;
        
 select c_location_id,c_bpartner_location_id into  p_LOCATION_ID2,v_bplocid2 from c_bpartner_location where c_bpartner_id=i_bpartner_id
        and isheadquarter='N' and isshipto='Y'  and isactive='Y' order by created limit 1;
 
 select ADDRESS1, ADDRESS2, CITY, POSTAL, C_COUNTRY_ID into p_ADDRESS12 , p_ADDRESS22 ,p_CITY2,p_POSTAL2 , P_COUNTRY_ID2   
        from c_location where c_location_id=p_LOCATION_ID2;
 
 select ad_user_id into v_user from ad_user where c_bpartner_id=i_bpartner_id order by created limit 1;
 select FIRSTNAME ,LASTNAME , TITLE, c_GREETING_ID ,EMAIL ,PHONE, PHONE2 into p_FIRSTNAME ,p_LASTNAME , p_TITLE, p_GREETING_ID ,p_EMAIL ,p_PHONE, p_PHONE2
        from ad_user where ad_user_id=v_user;
        
 select C_BP_BANKACCOUNT_ID into v_bank from C_BP_BANKACCOUNT where c_bpartner_id=i_bpartner_id order by created limit 1;
 select BANK_NAME,IBAN , SWIFTCODE  into p_BANK_NAME,p_IBAN , p_SWIFTCODE from C_BP_BANKACCOUNT where C_BP_BANKACCOUNT_ID=v_bank;
 
 
 RETURN NEXT;
END ; $BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
  
select zsse_DropFunction ('c_Bpartner_updateFastEntryData');  
CREATE OR REPLACE FUNCTION c_Bpartner_updateFastEntryData(i_bpartner_id varchar,i_userid varchar,
  p_value VARCHAR, p_name VARCHAR, p_bp_group_id VARCHAR, p_url VARCHAR, p_salesrep_id VARCHAR,
  p_ADDRESS1 VARCHAR, p_ADDRESS2 VARCHAR,p_CITY varchar,p_POSTAL varchar,P_COUNTRY_ID varchar,p_uidnumber varchar,p_TAX_ID varchar,
  p_ADDRESS12 VARCHAR, p_ADDRESS22 VARCHAR,p_CITY2 varchar,p_POSTAL2 varchar, P_COUNTRY_ID2 varchar,
  p_FIRSTNAME varchar,p_LASTNAME VARCHAR, p_TITLE VARCHAR,p_GREETING_ID varchar,p_EMAIL varchar,p_PHONE varchar,p_PHONE2 VARCHAR,
  p_iscustomer VARCHAR, p_isvendor VARCHAR,p_isemployee VARCHAR, p_paymentrule  VARCHAR,p_payterm  VARCHAR
  ) RETURNS VARCHAR
AS $BODY$

DECLARE
v_locid varchar;
v_locid2 varchar;
v_bplocid varchar;
v_bplocid2  varchar;
v_user varchar;
v_bank varchar;
v_org varchar;
v_client varchar;
v_ic varchar;
v_country varchar;
BEGIN
 
 select ad_org_id,ad_client_id into v_org,v_client from c_bpartner where c_bpartner_id=i_bpartner_id;
 if v_org is null then
    return 'NULL';
 end if;
 select c_location_id,c_bpartner_location_id into  v_locid,v_bplocid from c_bpartner_location where c_bpartner_id=i_bpartner_id and isheadquarter='Y' limit 1;
 select c_location_id,c_bpartner_location_id into  v_locid2,v_bplocid2 from c_bpartner_location where c_bpartner_id=i_bpartner_id 
        and isheadquarter='N' and isshipto='Y' order by created limit 1;
 select ad_user_id into v_user from ad_user where c_bpartner_id=i_bpartner_id order by created limit 1;

 
 -- Inserts where nothing exists
 if v_bplocid is null then
    v_bplocid:=get_uuid();
    insert into c_bpartner_location(C_BPARTNER_LOCATION_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, C_BPARTNER_ID)
    values (v_bplocid,v_client,v_org,i_userid,i_userid,i_bpartner_id);
 end if;
 if v_locid is null then
    v_locid:=get_uuid();
    insert into c_location(C_LOCATION_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, C_COUNTRY_ID)
    values (v_locid,v_client,v_org,i_userid,i_userid,P_COUNTRY_ID);
 end if;
 if v_bplocid2 is null and P_COUNTRY_ID2 is not null then
    v_bplocid2:=get_uuid();
    insert into c_bpartner_location(C_BPARTNER_LOCATION_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, C_BPARTNER_ID,name)
    values (v_bplocid2,v_client,v_org,i_userid,i_userid,i_bpartner_id,'n/a');
 end if;
 if v_locid2 is null and P_COUNTRY_ID2 is not null then
    v_locid2:=get_uuid();
    insert into c_location(C_LOCATION_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, C_COUNTRY_ID)
    values (v_locid2,v_client,v_org,i_userid,i_userid,P_COUNTRY_ID2);
 end if;
 if v_user is null and (p_FIRSTNAME is not null or p_LASTNAME is not null) then
    v_user:=get_uuid();
    insert into AD_USER(AD_USER_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, NAME, C_BPARTNER_ID)
    values (v_user,v_client,v_org,i_userid,i_userid,'N/A',i_bpartner_id);
 end if;
 
 -- Updates
 update c_bpartner set value=p_value,
        name=case when p_name='n/a' then coalesce(p_FIRSTNAME||' ','')||coalesce(p_LASTNAME,'') else p_name end,
        c_bp_group_id=p_bp_group_id, url=p_url,salesrep_id = p_salesrep_id, updated=now(),updatedby=i_userid,iscustomer=p_iscustomer,
        isemployee=p_isemployee,
        issalesrep = case when p_isemployee='Y' then 'Y' else 'N' end,
        isvendor=p_isvendor,
        paymentrule=p_paymentrule,
        c_paymentterm_id=p_payterm
        where c_bpartner_id=i_bpartner_id ;
 update c_bpartner_location set  c_location_id=v_locid,uidnumber=p_uidnumber, c_tax_id=p_TAX_ID,isbillto='Y',
                                 isshipto=case when v_bplocid2 is not null then 'N' else 'Y' end,updated=now(),updatedby=i_userid where  c_bpartner_location_id=v_bplocid;
 update c_bpartner_location set  c_location_id=v_locid2,isshipto='Y',isbillto='N',updated=now(),updatedby=i_userid where  c_bpartner_location_id=v_bplocid2;
 update c_location set ADDRESS1=p_ADDRESS1,ADDRESS2= p_ADDRESS2 ,CITY=p_CITY,POSTAL=p_POSTAL ,c_COUNTRY_ID=P_COUNTRY_ID ,updated=now(),updatedby=i_userid 
        where c_location_id=v_locid;
 update c_location set ADDRESS1=p_ADDRESS12,ADDRESS2= p_ADDRESS22 ,CITY=p_CITY2,POSTAL=p_POSTAL2 ,c_COUNTRY_ID=P_COUNTRY_ID2 ,updated=now(),updatedby=i_userid 
        where c_location_id=v_locid2;
 if (p_FIRSTNAME is not null or p_LASTNAME is not null) then 
    update ad_user set isactive='Y',FIRSTNAME=p_FIRSTNAME,LASTNAME=p_LASTNAME, name=coalesce(p_FIRSTNAME||' ','')||coalesce(p_LASTNAME,''),TITLE=p_TITLE ,c_GREETING_ID=p_GREETING_ID,EMAIL=p_EMAIL,PHONE=p_PHONE ,
                    PHONE2=p_PHONE2,updated=now(),updatedby=i_userid 
        where ad_user_id=v_user;
 end if;
 
 RETURN 'OK';
END ; $BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;
  
  
select zsse_DropFunction ('c_Bpartner_updateFastEntryDataBank');  
CREATE OR REPLACE FUNCTION c_Bpartner_updateFastEntryDataBank(i_bpartner_id varchar,i_userid varchar,
  p_BANK_NAME varchar,p_IBAN VARCHAR, p_SWIFTCODE VARCHAR
  ) RETURNS VARCHAR
AS $BODY$

DECLARE

v_bank varchar;
v_org varchar;
v_client varchar;
v_ic varchar;
v_country varchar;
BEGIN
 
 select ad_org_id,ad_client_id into v_org,v_client from c_bpartner where c_bpartner_id=i_bpartner_id;
 if v_org is null then
    return 'NULL';
 end if;
 
 select C_BP_BANKACCOUNT_ID into v_bank from C_BP_BANKACCOUNT where c_bpartner_id=i_bpartner_id order by created limit 1;
 v_ic=substr(p_IBAN,1,2);
 select c_country_id into v_country from c_country where countrycode=v_ic;
 
 
 if v_bank is null and (p_IBAN is not null or p_BANK_NAME is not null or p_SWIFTCODE is not null) then
    v_bank:=get_uuid();
    insert into C_BP_BANKACCOUNT(C_BP_BANKACCOUNT_ID, AD_CLIENT_ID, AD_ORG_ID, CREATEDBY, UPDATEDBY, C_BPARTNER_ID,BANK_NAME, IBAN, SHOWIBAN, SWIFTCODE,c_country_id)
    values (v_bank,v_client,v_org,i_userid,i_userid,i_bpartner_id,p_BANK_NAME,p_IBAN,'Y',p_SWIFTCODE,v_country);
 end if;
 
 -- Updates

 update c_bp_bankaccount set BANK_NAME=p_BANK_NAME,IBAN=p_IBAN , SWIFTCODE=p_SWIFTCODE,updated=now(),updatedby=i_userid,c_country_id=v_country
        where c_bp_bankaccount_id=v_bank;
 RETURN 'OK';
END ; $BODY$
  LANGUAGE 'plpgsql' VOLATILE
  COST 100;