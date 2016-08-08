/**************************************************************************************************************************************+



CRM





***************************************************************************************************************************************/
DROP VIEW zssi_crm_todos;
CREATE VIEW zssi_crm_todos AS
  SELECT nc.zssi_notes4customer_id AS zssi_crm_todos_id, nc.zssi_notes4customer_id, c_b.c_bpartner_id, nc.followup_by AS emp, crma.name AS typeofcontact, nc.dateofcontact, nc.description, nc.followup, 
         zssi_getusernamecomplete(nc.ad_userid_next,'') as contactto,
         nc.ad_client_id, nc.ad_org_id, nc.isactive, nc.created, nc.updated, nc.createdby, nc.updatedby, nc.c_project_id,nc.followup_done
   FROM c_bpartner c_b, zssi_crmactions crma, zssi_notes4customer nc 
   LEFT JOIN ad_user au ON  au.ad_user_id=nc.ad_user_id
  WHERE nc.zssi_crmactions_id::text = crma.zssi_crmactions_id::text AND c_b.c_bpartner_id::text = nc.c_bpartner_id::text AND  nc.isactive = 'Y'::bpchar;
 

                                  
select zsse_dropfunction('zssi_crm_getinterests'); 
CREATE or replace FUNCTION zssi_crm_getinterests(v_user_id character varying ) RETURNS character varying
AS $_$
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
Localozation in Database - The better way 
Looks Like--> - interest A - interest B - etc.
*****************************************************/
DECLARE
v_line character varying;
v_cur record;
v_interest character varying;
BEGIN
  FOR v_cur in (select r_interestarea.name as v_interest from  r_interestarea left join r_contactinterest on r_contactinterest.r_interestarea_id=r_interestarea.r_interestarea_id where ad_user_id=v_user_id)
  LOOP
  --v_line:=coalesce(v_line,'-')||v_cur.v_bomqty||' '||zssi_getproductname(v_cur.v_bomproduct,v_lang)||' '||coalesce(v_cur.v_bomdescription,(select m_product.description from m_product where m_product_id=v_bomproduct))||'<br/>-';
  v_line:=coalesce(v_line,'')||chr(32)||'- '||coalesce(v_cur.v_interest,'');
  END LOOP;
return v_line;
  END;
$_$
  LANGUAGE plpgsql VOLATILE
  COST 100;
  
  
 
 
 
 SELECT zsse_DropView ('zssi_crm_bpartner_v');

 
 CREATE OR REPLACE VIEW zssi_crm_bpartner_v AS
			   SELECT bp.C_BPartner_ID ||  COALESCE(TO_CHAR(c.ad_user_id), '') || COALESCE(TO_CHAR(l.c_location_id),'')  AS zssi_crm_bpartner_v_id,
			   --Standards
				  bp.ad_client_id,
				  bp.ad_org_id,
				  bp.created,
				  bp.updated,
				  bp.createdby,
				  bp.updatedby,
				  bp.c_bpartner_id,
				  bp.isactive,
				  bp.name as name, 
				  bp.value, 
				  bp.name2,
				  bp.c_bp_group_id,
				  bp.url,
				  coalesce(coalesce((select a.c_location_id from c_bpartner_location a where a.c_bpartner_location_id=c.c_bpartner_location_id and a.c_bpartner_id=bp.c_bpartner_id),(select part.c_location_id from c_bpartner_location part where part.c_bpartner_id=bp.c_bpartner_id and part.isheadquarter='Y')),bp.c_location_id) as C_BPartner_Location_ID, 	--Anschrift
				  c.name AS Contact, 				      		--Ansprechpartner	
				  c.ad_user_id,
				  c.email,	
				  c.c_greeting_id,
				  c.firstname,
				  c.lastname,
				  c.birthday,
				  c.description,
				  coalesce(c.phone,bpl.Phone) as phone,		      		--A Telefon
				  c.fax,
				  c.comments,
				  coalesce(zssi_crm_getinterests(c.ad_user_id),'') as interests,
				  bp.iscustomer,
				  bp.isvendor,
				  l.address1,
				  l.address2,
				  l.city,
				  l.postal,
				  l.c_country_id
				  
			  FROM 	C_BPARTNER_LOCATION bpl,C_LOCATION l ,
				C_BPARTNER bp 
				left join AD_USER c on bp.c_bpartner_id = c.c_bpartner_id 
				AND c.IsActive ='Y'
			  WHERE bp.c_bpartner_id = bpl.c_bpartner_id and 
				bpl.IsActive = 'Y' and 
				case when bp.isemployee='Y' then (bp.iscustomer='Y' or bp.isvendor='Y') else 1=1 end and
				bpl.c_location_id=l.C_Location_ID and 
                                  case when c.ad_user_id is not null then case when c.c_bpartner_location_id is not null then c.c_bpartner_location_id=bpl.c_bpartner_location_id else bpl.isheadquarter='Y' end else 1=1 end ;

                                  
