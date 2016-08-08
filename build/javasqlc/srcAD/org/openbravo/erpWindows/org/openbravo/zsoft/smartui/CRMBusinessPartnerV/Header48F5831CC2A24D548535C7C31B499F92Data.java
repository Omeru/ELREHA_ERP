//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.zsoft.smartui.CRMBusinessPartnerV;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

/**
WAD Generated class
 */
class Header48F5831CC2A24D548535C7C31B499F92Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Header48F5831CC2A24D548535C7C31B499F92Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String value;
  public String name;
  public String name2;
  public String url;
  public String cBpGroupId;
  public String cBpGroupIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String address1;
  public String address2;
  public String postal;
  public String city;
  public String cCountryId;
  public String cCountryIdr;
  public String adUserId;
  public String adUserIdr;
  public String cGreetingId;
  public String cGreetingIdr;
  public String firstname;
  public String lastname;
  public String email;
  public String phone;
  public String fax;
  public String birthday;
  public String description;
  public String comments;
  public String interests;
  public String iscustomer;
  public String isvendor;
  public String isactive;
  public String adClientId;
  public String zssiCrmBpartnerVId;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("created"))
      return created;
    else if (fieldName.equalsIgnoreCase("createdbyr"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("updated"))
      return updated;
    else if (fieldName.equalsIgnoreCase("updated_time_stamp") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("updatedby"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("updatedbyr"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("name2"))
      return name2;
    else if (fieldName.equalsIgnoreCase("url"))
      return url;
    else if (fieldName.equalsIgnoreCase("c_bp_group_id") || fieldName.equals("cBpGroupId"))
      return cBpGroupId;
    else if (fieldName.equalsIgnoreCase("c_bp_group_idr") || fieldName.equals("cBpGroupIdr"))
      return cBpGroupIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_idr") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("address1"))
      return address1;
    else if (fieldName.equalsIgnoreCase("address2"))
      return address2;
    else if (fieldName.equalsIgnoreCase("postal"))
      return postal;
    else if (fieldName.equalsIgnoreCase("city"))
      return city;
    else if (fieldName.equalsIgnoreCase("c_country_id") || fieldName.equals("cCountryId"))
      return cCountryId;
    else if (fieldName.equalsIgnoreCase("c_country_idr") || fieldName.equals("cCountryIdr"))
      return cCountryIdr;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("ad_user_idr") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("c_greeting_id") || fieldName.equals("cGreetingId"))
      return cGreetingId;
    else if (fieldName.equalsIgnoreCase("c_greeting_idr") || fieldName.equals("cGreetingIdr"))
      return cGreetingIdr;
    else if (fieldName.equalsIgnoreCase("firstname"))
      return firstname;
    else if (fieldName.equalsIgnoreCase("lastname"))
      return lastname;
    else if (fieldName.equalsIgnoreCase("email"))
      return email;
    else if (fieldName.equalsIgnoreCase("phone"))
      return phone;
    else if (fieldName.equalsIgnoreCase("fax"))
      return fax;
    else if (fieldName.equalsIgnoreCase("birthday"))
      return birthday;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("comments"))
      return comments;
    else if (fieldName.equalsIgnoreCase("interests"))
      return interests;
    else if (fieldName.equalsIgnoreCase("iscustomer"))
      return iscustomer;
    else if (fieldName.equalsIgnoreCase("isvendor"))
      return isvendor;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("zssi_crm_bpartner_v_id") || fieldName.equals("zssiCrmBpartnerVId"))
      return zssiCrmBpartnerVId;
    else if (fieldName.equalsIgnoreCase("language"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static Header48F5831CC2A24D548535C7C31B499F92Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Header48F5831CC2A24D548535C7C31B499F92Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zssi_crm_bpartner_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zssi_crm_bpartner_v.CreatedBy) as CreatedByR, " +
      "        to_char(zssi_crm_bpartner_v.Updated, ?) as updated, " +
      "        to_char(zssi_crm_bpartner_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zssi_crm_bpartner_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zssi_crm_bpartner_v.UpdatedBy) as UpdatedByR," +
      "        zssi_crm_bpartner_v.AD_Org_ID, " +
      "(CASE WHEN zssi_crm_bpartner_v.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "zssi_crm_bpartner_v.C_Bpartner_ID, " +
      "(CASE WHEN zssi_crm_bpartner_v.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "zssi_crm_bpartner_v.Value, " +
      "zssi_crm_bpartner_v.Name, " +
      "zssi_crm_bpartner_v.Name2, " +
      "zssi_crm_bpartner_v.Url, " +
      "zssi_crm_bpartner_v.C_Bp_Group_ID, " +
      "(CASE WHEN zssi_crm_bpartner_v.C_Bp_Group_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_Bp_Group_IDR, " +
      "zssi_crm_bpartner_v.C_Bpartner_Location_ID, " +
      "(CASE WHEN zssi_crm_bpartner_v.C_Bpartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Address1), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Address2), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Postal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.City), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS C_Bpartner_Location_IDR, " +
      "zssi_crm_bpartner_v.Address1, " +
      "zssi_crm_bpartner_v.Address2, " +
      "zssi_crm_bpartner_v.Postal, " +
      "zssi_crm_bpartner_v.City, " +
      "zssi_crm_bpartner_v.C_Country_ID, " +
      "(CASE WHEN zssi_crm_bpartner_v.C_Country_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS C_Country_IDR, " +
      "zssi_crm_bpartner_v.AD_User_ID, " +
      "(CASE WHEN zssi_crm_bpartner_v.AD_User_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "zssi_crm_bpartner_v.C_Greeting_ID, " +
      "(CASE WHEN zssi_crm_bpartner_v.C_Greeting_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL9.Name IS NULL THEN TO_CHAR(table9.Name) ELSE TO_CHAR(tableTRL9.Name) END)), ''))),'') ) END) AS C_Greeting_IDR, " +
      "zssi_crm_bpartner_v.Firstname, " +
      "zssi_crm_bpartner_v.Lastname, " +
      "zssi_crm_bpartner_v.Email, " +
      "zssi_crm_bpartner_v.Phone, " +
      "zssi_crm_bpartner_v.Fax, " +
      "zssi_crm_bpartner_v.Birthday, " +
      "zssi_crm_bpartner_v.Description, " +
      "zssi_crm_bpartner_v.Comments, " +
      "zssi_crm_bpartner_v.Interests, " +
      "COALESCE(zssi_crm_bpartner_v.Iscustomer, 'N') AS Iscustomer, " +
      "COALESCE(zssi_crm_bpartner_v.Isvendor, 'N') AS Isvendor, " +
      "COALESCE(zssi_crm_bpartner_v.Isactive, 'N') AS Isactive, " +
      "zssi_crm_bpartner_v.AD_Client_ID, " +
      "zssi_crm_bpartner_v.Zssi_Crm_Bpartner_V_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zssi_crm_bpartner_v left join (select AD_Org_ID, Name from AD_Org) table1 on (zssi_crm_bpartner_v.AD_Org_ID = table1.AD_Org_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (zssi_crm_bpartner_v.C_Bpartner_ID = table2.C_BPartner_ID) left join (select C_Bp_Group_ID, Name from C_Bp_Group) table3 on (zssi_crm_bpartner_v.C_Bp_Group_ID = table3.C_Bp_Group_ID) left join (select C_Location_ID, Address1, Address2, Postal, City, C_Region_ID, C_Country_ID from C_Location) table4 on (zssi_crm_bpartner_v.C_Bpartner_Location_ID = table4.C_Location_ID) left join (select C_Region_ID, Name from C_Region) table5 on (table4.C_Region_ID = table5.C_Region_ID) left join (select C_Country_ID, Name from C_Country) table6 on (table4.C_Country_ID = table6.C_Country_ID) left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL6 on (table6.C_Country_ID = tableTRL6.C_Country_ID and tableTRL6.AD_Language = ?)  left join (select C_Country_ID, Name from C_Country) table7 on (zssi_crm_bpartner_v.C_Country_ID = table7.C_Country_ID) left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL7 on (table7.C_Country_ID = tableTRL7.C_Country_ID and tableTRL7.AD_Language = ?)  left join (select AD_User_ID, Name from AD_User) table8 on (zssi_crm_bpartner_v.AD_User_ID = table8.AD_User_ID) left join (select C_Greeting_ID, Name from C_Greeting) table9 on (zssi_crm_bpartner_v.C_Greeting_ID = table9.C_Greeting_ID) left join (select C_Greeting_ID,AD_Language, Name from C_Greeting_TRL) tableTRL9 on (table9.C_Greeting_ID = tableTRL9.C_Greeting_ID and tableTRL9.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND zssi_crm_bpartner_v.Zssi_Crm_Bpartner_V_ID = ? " +
      "        AND zssi_crm_bpartner_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zssi_crm_bpartner_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        Header48F5831CC2A24D548535C7C31B499F92Data objectHeader48F5831CC2A24D548535C7C31B499F92Data = new Header48F5831CC2A24D548535C7C31B499F92Data();
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.created = UtilSql.getValue(result, "created");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.updated = UtilSql.getValue(result, "updated");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.value = UtilSql.getValue(result, "value");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.name = UtilSql.getValue(result, "name");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.name2 = UtilSql.getValue(result, "name2");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.url = UtilSql.getValue(result, "url");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cBpGroupId = UtilSql.getValue(result, "c_bp_group_id");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cBpGroupIdr = UtilSql.getValue(result, "c_bp_group_idr");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cBpartnerLocationIdr = UtilSql.getValue(result, "c_bpartner_location_idr");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.address1 = UtilSql.getValue(result, "address1");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.address2 = UtilSql.getValue(result, "address2");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.postal = UtilSql.getValue(result, "postal");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.city = UtilSql.getValue(result, "city");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cCountryId = UtilSql.getValue(result, "c_country_id");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cCountryIdr = UtilSql.getValue(result, "c_country_idr");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.adUserIdr = UtilSql.getValue(result, "ad_user_idr");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cGreetingId = UtilSql.getValue(result, "c_greeting_id");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.cGreetingIdr = UtilSql.getValue(result, "c_greeting_idr");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.firstname = UtilSql.getValue(result, "firstname");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.lastname = UtilSql.getValue(result, "lastname");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.email = UtilSql.getValue(result, "email");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.phone = UtilSql.getValue(result, "phone");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.fax = UtilSql.getValue(result, "fax");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.birthday = UtilSql.getDateValue(result, "birthday", "dd-MM-yyyy");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.description = UtilSql.getValue(result, "description");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.comments = UtilSql.getValue(result, "comments");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.interests = UtilSql.getValue(result, "interests");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.iscustomer = UtilSql.getValue(result, "iscustomer");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.isvendor = UtilSql.getValue(result, "isvendor");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.isactive = UtilSql.getValue(result, "isactive");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.zssiCrmBpartnerVId = UtilSql.getValue(result, "zssi_crm_bpartner_v_id");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.language = UtilSql.getValue(result, "language");
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.adUserClient = "";
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.adOrgClient = "";
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.createdby = "";
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.trBgcolor = "";
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.totalCount = "";
        objectHeader48F5831CC2A24D548535C7C31B499F92Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectHeader48F5831CC2A24D548535C7C31B499F92Data);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    Header48F5831CC2A24D548535C7C31B499F92Data objectHeader48F5831CC2A24D548535C7C31B499F92Data[] = new Header48F5831CC2A24D548535C7C31B499F92Data[vector.size()];
    vector.copyInto(objectHeader48F5831CC2A24D548535C7C31B499F92Data);
    return(objectHeader48F5831CC2A24D548535C7C31B499F92Data);
  }

/**
Create a registry
 */
  public static Header48F5831CC2A24D548535C7C31B499F92Data[] set(String firstname, String url, String fax, String cBpartnerId, String cBpartnerIdr, String city, String interests, String iscustomer, String postal, String lastname, String adUserId, String createdby, String createdbyr, String comments, String birthday, String address1, String adOrgId, String email, String name, String phone, String value, String description, String isvendor, String cBpartnerLocationId, String cBpartnerLocationIdr, String zssiCrmBpartnerVId, String updatedby, String updatedbyr, String adClientId, String cGreetingId, String cBpGroupId, String name2, String address2, String cCountryId, String isactive)    throws ServletException {
    Header48F5831CC2A24D548535C7C31B499F92Data objectHeader48F5831CC2A24D548535C7C31B499F92Data[] = new Header48F5831CC2A24D548535C7C31B499F92Data[1];
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0] = new Header48F5831CC2A24D548535C7C31B499F92Data();
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].created = "";
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].createdbyr = createdbyr;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].updated = "";
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].updatedTimeStamp = "";
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].updatedby = updatedby;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].updatedbyr = updatedbyr;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].adOrgId = adOrgId;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].adOrgIdr = "";
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cBpartnerId = cBpartnerId;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cBpartnerIdr = cBpartnerIdr;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].value = value;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].name = name;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].name2 = name2;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].url = url;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cBpGroupId = cBpGroupId;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cBpGroupIdr = "";
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cBpartnerLocationId = cBpartnerLocationId;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cBpartnerLocationIdr = cBpartnerLocationIdr;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].address1 = address1;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].address2 = address2;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].postal = postal;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].city = city;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cCountryId = cCountryId;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cCountryIdr = "";
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].adUserId = adUserId;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].adUserIdr = "";
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cGreetingId = cGreetingId;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].cGreetingIdr = "";
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].firstname = firstname;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].lastname = lastname;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].email = email;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].phone = phone;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].fax = fax;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].birthday = birthday;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].description = description;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].comments = comments;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].interests = interests;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].iscustomer = iscustomer;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].isvendor = isvendor;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].isactive = isactive;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].adClientId = adClientId;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].zssiCrmBpartnerVId = zssiCrmBpartnerVId;
    objectHeader48F5831CC2A24D548535C7C31B499F92Data[0].language = "";
    return objectHeader48F5831CC2A24D548535C7C31B499F92Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef3F0571221AF3459886D095523394B2EB_0(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as C_Bpartner_ID FROM C_BPartner table1 WHERE table1.isActive='Y' AND table1.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Bpartner_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_bpartner_id");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef6A1F15EE209248E4BB17A475459D8B9F_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as Createdby FROM AD_User table1 WHERE table1.isActive='Y' AND table1.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedbyR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "createdby");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef1028B6FF6E2F48F9924C3664CF65AEDE_2(ConnectionProvider connectionProvider, String C_Bpartner_Location_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Address1), '')  || ' - ' || COALESCE(TO_CHAR(table1.Address2), '')  || ' - ' || COALESCE(TO_CHAR(table1.Postal), '')  || ' - ' || COALESCE(TO_CHAR(table1.City), '')  || ' - ' || COALESCE(TO_CHAR(table1.C_Region_ID), '')  || ' - ' || COALESCE(TO_CHAR(table1.C_Country_ID), '') ) as C_Bpartner_Location_ID FROM C_Location table1 WHERE table1.isActive='Y' AND table1.C_Location_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Bpartner_Location_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_bpartner_location_id");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDefADEBD01B98BC4CAE906F348029B46331_3(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as Updatedby FROM AD_User table1 WHERE table1.isActive='Y' AND table1.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedbyR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updatedby");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE zssi_crm_bpartner_v" +
      "        SET AD_Org_ID = (?) , C_Bpartner_ID = (?) , Value = (?) , Name = (?) , Name2 = (?) , Url = (?) , C_Bp_Group_ID = (?) , C_Bpartner_Location_ID = (?) , Address1 = (?) , Address2 = (?) , Postal = (?) , City = (?) , C_Country_ID = (?) , AD_User_ID = (?) , C_Greeting_ID = (?) , Firstname = (?) , Lastname = (?) , Email = (?) , Phone = (?) , Fax = (?) , Birthday = TO_DATE(?) , Description = (?) , Comments = (?) , Interests = (?) , Iscustomer = (?) , Isvendor = (?) , Isactive = (?) , AD_Client_ID = (?) , Zssi_Crm_Bpartner_V_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zssi_crm_bpartner_v.Zssi_Crm_Bpartner_V_ID = ? " +
      "        AND zssi_crm_bpartner_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zssi_crm_bpartner_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, address1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, address2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, postal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, city);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCountryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGreetingId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, firstname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, email);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, phone);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, birthday);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, comments);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, interests);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscustomer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isvendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zssiCrmBpartnerVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zssiCrmBpartnerVId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO zssi_crm_bpartner_v " +
      "        (AD_Org_ID, C_Bpartner_ID, Value, Name, Name2, Url, C_Bp_Group_ID, C_Bpartner_Location_ID, Address1, Address2, Postal, City, C_Country_ID, AD_User_ID, C_Greeting_ID, Firstname, Lastname, Email, Phone, Fax, Birthday, Description, Comments, Interests, Iscustomer, Isvendor, Isactive, AD_Client_ID, Zssi_Crm_Bpartner_V_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, address1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, address2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, postal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, city);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCountryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGreetingId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, firstname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, email);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, phone);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, birthday);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, comments);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, interests);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscustomer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isvendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zssiCrmBpartnerVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zssi_crm_bpartner_v" +
      "        WHERE zssi_crm_bpartner_v.Zssi_Crm_Bpartner_V_ID = ? " +
      "        AND zssi_crm_bpartner_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zssi_crm_bpartner_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zssi_crm_bpartner_v" +
      "        WHERE zssi_crm_bpartner_v.Zssi_Crm_Bpartner_V_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM zssi_crm_bpartner_v" +
      "         WHERE zssi_crm_bpartner_v.Zssi_Crm_Bpartner_V_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_org_id");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM zssi_crm_bpartner_v" +
      "         WHERE zssi_crm_bpartner_v.Zssi_Crm_Bpartner_V_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updated_time_stamp");
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }
}
