//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openz.modules.multilevelmarketing.EmployeeMLM;

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
class EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data implements FieldProvider {
static Logger log4j = Logger.getLogger(EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adClientId;
  public String adClientIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String value;
  public String name;
  public String description;
  public String isactive;
  public String issummary;
  public String isprospect;
  public String issalesrep;
  public String isprocurementmanager;
  public String referenceno;
  public String cBpGroupId;
  public String cBpGroupIdr;
  public String adLanguage;
  public String adLanguager;
  public String cLocationId;
  public String cLocationIdr;
  public String country;
  public String zipcode;
  public String city;
  public String url;
  public String salesvolume;
  public String autocreatecommission;
  public String isprojectmanager;
  public String isworker;
  public String isemployee;
  public String approvalamt;
  public String cGreetingId;
  public String ispaymentapprover;
  public String rating;
  public String isapprover;
  public String taxid;
  public String cBpartnerId;
  public String isprapprover;
  public String cSalaryCategoryId;
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
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_client_idr") || fieldName.equals("adClientIdr"))
      return adClientIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("issummary"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("isprospect"))
      return isprospect;
    else if (fieldName.equalsIgnoreCase("issalesrep"))
      return issalesrep;
    else if (fieldName.equalsIgnoreCase("isprocurementmanager"))
      return isprocurementmanager;
    else if (fieldName.equalsIgnoreCase("referenceno"))
      return referenceno;
    else if (fieldName.equalsIgnoreCase("c_bp_group_id") || fieldName.equals("cBpGroupId"))
      return cBpGroupId;
    else if (fieldName.equalsIgnoreCase("c_bp_group_idr") || fieldName.equals("cBpGroupIdr"))
      return cBpGroupIdr;
    else if (fieldName.equalsIgnoreCase("ad_language") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("ad_languager") || fieldName.equals("adLanguager"))
      return adLanguager;
    else if (fieldName.equalsIgnoreCase("c_location_id") || fieldName.equals("cLocationId"))
      return cLocationId;
    else if (fieldName.equalsIgnoreCase("c_location_idr") || fieldName.equals("cLocationIdr"))
      return cLocationIdr;
    else if (fieldName.equalsIgnoreCase("country"))
      return country;
    else if (fieldName.equalsIgnoreCase("zipcode"))
      return zipcode;
    else if (fieldName.equalsIgnoreCase("city"))
      return city;
    else if (fieldName.equalsIgnoreCase("url"))
      return url;
    else if (fieldName.equalsIgnoreCase("salesvolume"))
      return salesvolume;
    else if (fieldName.equalsIgnoreCase("autocreatecommission"))
      return autocreatecommission;
    else if (fieldName.equalsIgnoreCase("isprojectmanager"))
      return isprojectmanager;
    else if (fieldName.equalsIgnoreCase("isworker"))
      return isworker;
    else if (fieldName.equalsIgnoreCase("isemployee"))
      return isemployee;
    else if (fieldName.equalsIgnoreCase("approvalamt"))
      return approvalamt;
    else if (fieldName.equalsIgnoreCase("c_greeting_id") || fieldName.equals("cGreetingId"))
      return cGreetingId;
    else if (fieldName.equalsIgnoreCase("ispaymentapprover"))
      return ispaymentapprover;
    else if (fieldName.equalsIgnoreCase("rating"))
      return rating;
    else if (fieldName.equalsIgnoreCase("isapprover"))
      return isapprover;
    else if (fieldName.equalsIgnoreCase("taxid"))
      return taxid;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("isprapprover"))
      return isprapprover;
    else if (fieldName.equalsIgnoreCase("c_salary_category_id") || fieldName.equals("cSalaryCategoryId"))
      return cSalaryCategoryId;
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
  public static EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_BPartner.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BPartner.CreatedBy) as CreatedByR, " +
      "        to_char(C_BPartner.Updated, ?) as updated, " +
      "        to_char(C_BPartner.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_BPartner.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BPartner.UpdatedBy) as UpdatedByR," +
      "        C_BPartner.AD_Client_ID, " +
      "(CASE WHEN C_BPartner.AD_Client_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Client_IDR, " +
      "C_BPartner.AD_Org_ID, " +
      "(CASE WHEN C_BPartner.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_BPartner.Value, " +
      "C_BPartner.Name, " +
      "C_BPartner.Description, " +
      "COALESCE(C_BPartner.IsActive, 'N') AS IsActive, " +
      "COALESCE(C_BPartner.IsSummary, 'N') AS IsSummary, " +
      "COALESCE(C_BPartner.IsProspect, 'N') AS IsProspect, " +
      "COALESCE(C_BPartner.IsSalesRep, 'N') AS IsSalesRep, " +
      "COALESCE(C_BPartner.IsProcurementManager, 'N') AS IsProcurementManager, " +
      "C_BPartner.ReferenceNo, " +
      "C_BPartner.C_BP_Group_ID, " +
      "(CASE WHEN C_BPartner.C_BP_Group_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_BP_Group_IDR, " +
      "C_BPartner.AD_Language, " +
      "(CASE WHEN C_BPartner.AD_Language IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS AD_LanguageR, " +
      "C_BPartner.C_Location_ID, " +
      "(CASE WHEN C_BPartner.C_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Address1), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Address2), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Postal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.City), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS C_Location_IDR, " +
      "C_BPartner.Country, " +
      "C_BPartner.Zipcode, " +
      "C_BPartner.City, " +
      "C_BPartner.URL, " +
      "C_BPartner.SalesVolume, " +
      "C_BPartner.Autocreatecommission, " +
      "COALESCE(C_BPartner.Isprojectmanager, 'N') AS Isprojectmanager, " +
      "COALESCE(C_BPartner.Isworker, 'N') AS Isworker, " +
      "COALESCE(C_BPartner.IsEmployee, 'N') AS IsEmployee, " +
      "C_BPartner.Approvalamt, " +
      "C_BPartner.C_Greeting_ID, " +
      "COALESCE(C_BPartner.Ispaymentapprover, 'N') AS Ispaymentapprover, " +
      "C_BPartner.Rating, " +
      "COALESCE(C_BPartner.IsApprover, 'N') AS IsApprover, " +
      "C_BPartner.TaxID, " +
      "C_BPartner.C_BPartner_ID, " +
      "COALESCE(C_BPartner.Isprapprover, 'N') AS Isprapprover, " +
      "C_BPartner.C_Salary_Category_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_BPartner left join (select AD_Client_ID, Name from AD_Client) table1 on (C_BPartner.AD_Client_ID = table1.AD_Client_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (C_BPartner.AD_Org_ID = table2.AD_Org_ID) left join (select C_BP_Group_ID, Name from C_BP_Group) table3 on (C_BPartner.C_BP_Group_ID = table3.C_BP_Group_ID) left join (select AD_Language, Name from AD_Language) table4 on (C_BPartner.AD_Language =  table4.AD_Language) left join (select C_Location_ID, Address1, Address2, Postal, City, C_Region_ID, C_Country_ID from C_Location) table5 on (C_BPartner.C_Location_ID = table5.C_Location_ID) left join (select C_Region_ID, Name from C_Region) table6 on (table5.C_Region_ID = table6.C_Region_ID) left join (select C_Country_ID, Name from C_Country) table7 on (table5.C_Country_ID = table7.C_Country_ID) left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL7 on (table7.C_Country_ID = tableTRL7.C_Country_ID and tableTRL7.AD_Language = ?) " +
      "        WHERE 2=2 " +
      " AND c_bpartner.isemployee='Y'" +
      "        AND 1=1 " +
      "        AND C_BPartner.C_BPartner_ID = ? " +
      "        AND C_BPartner.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_BPartner.AD_Org_ID IN (";
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
        EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data = new EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data();
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.created = UtilSql.getValue(result, "created");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.updated = UtilSql.getValue(result, "updated");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.adClientIdr = UtilSql.getValue(result, "ad_client_idr");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.value = UtilSql.getValue(result, "value");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.name = UtilSql.getValue(result, "name");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.description = UtilSql.getValue(result, "description");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.isactive = UtilSql.getValue(result, "isactive");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.issummary = UtilSql.getValue(result, "issummary");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.isprospect = UtilSql.getValue(result, "isprospect");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.issalesrep = UtilSql.getValue(result, "issalesrep");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.isprocurementmanager = UtilSql.getValue(result, "isprocurementmanager");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.referenceno = UtilSql.getValue(result, "referenceno");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.cBpGroupId = UtilSql.getValue(result, "c_bp_group_id");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.cBpGroupIdr = UtilSql.getValue(result, "c_bp_group_idr");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.adLanguage = UtilSql.getValue(result, "ad_language");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.adLanguager = UtilSql.getValue(result, "ad_languager");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.cLocationId = UtilSql.getValue(result, "c_location_id");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.cLocationIdr = UtilSql.getValue(result, "c_location_idr");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.country = UtilSql.getValue(result, "country");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.zipcode = UtilSql.getValue(result, "zipcode");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.city = UtilSql.getValue(result, "city");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.url = UtilSql.getValue(result, "url");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.salesvolume = UtilSql.getValue(result, "salesvolume");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.autocreatecommission = UtilSql.getValue(result, "autocreatecommission");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.isprojectmanager = UtilSql.getValue(result, "isprojectmanager");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.isworker = UtilSql.getValue(result, "isworker");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.isemployee = UtilSql.getValue(result, "isemployee");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.approvalamt = UtilSql.getValue(result, "approvalamt");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.cGreetingId = UtilSql.getValue(result, "c_greeting_id");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.ispaymentapprover = UtilSql.getValue(result, "ispaymentapprover");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.rating = UtilSql.getValue(result, "rating");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.isapprover = UtilSql.getValue(result, "isapprover");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.taxid = UtilSql.getValue(result, "taxid");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.isprapprover = UtilSql.getValue(result, "isprapprover");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.cSalaryCategoryId = UtilSql.getValue(result, "c_salary_category_id");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.language = UtilSql.getValue(result, "language");
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.adUserClient = "";
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.adOrgClient = "";
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.createdby = "";
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.trBgcolor = "";
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.totalCount = "";
        objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data);
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
    EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[] = new EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[vector.size()];
    vector.copyInto(objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data);
    return(objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data);
  }

/**
Create a registry
 */
  public static EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[] set(String cGreetingId, String referenceno, String name, String isactive, String isprocurementmanager, String updatedby, String updatedbyr, String issummary, String taxid, String description, String autocreatecommission, String cBpartnerId, String country, String approvalamt, String city, String rating, String adLanguage, String isemployee, String zipcode, String value, String adOrgId, String isprojectmanager, String ispaymentapprover, String isapprover, String createdby, String createdbyr, String salesvolume, String adClientId, String url, String cSalaryCategoryId, String cBpGroupId, String isprapprover, String cLocationId, String cLocationIdr, String isworker, String issalesrep, String isprospect)    throws ServletException {
    EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[] = new EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[1];
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0] = new EmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data();
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].created = "";
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].createdbyr = createdbyr;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].updated = "";
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].updatedTimeStamp = "";
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].updatedby = updatedby;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].updatedbyr = updatedbyr;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].adClientId = adClientId;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].adClientIdr = "";
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].adOrgId = adOrgId;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].adOrgIdr = "";
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].value = value;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].name = name;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].description = description;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].isactive = isactive;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].issummary = issummary;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].isprospect = isprospect;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].issalesrep = issalesrep;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].isprocurementmanager = isprocurementmanager;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].referenceno = referenceno;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].cBpGroupId = cBpGroupId;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].cBpGroupIdr = "";
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].adLanguage = adLanguage;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].adLanguager = "";
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].cLocationId = cLocationId;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].cLocationIdr = cLocationIdr;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].country = country;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].zipcode = zipcode;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].city = city;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].url = url;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].salesvolume = salesvolume;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].autocreatecommission = autocreatecommission;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].isprojectmanager = isprojectmanager;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].isworker = isworker;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].isemployee = isemployee;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].approvalamt = approvalamt;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].cGreetingId = cGreetingId;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].ispaymentapprover = ispaymentapprover;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].rating = rating;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].isapprover = isapprover;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].taxid = taxid;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].cBpartnerId = cBpartnerId;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].isprapprover = isprapprover;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].cSalaryCategoryId = cSalaryCategoryId;
    objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data[0].language = "";
    return objectEmployeeMLM925B546B0D884EBBA23FEAE1741DC0F2Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2900_0(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as UpdatedBy FROM AD_User table1 WHERE table1.isActive='Y' AND table1.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedByR);

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

/**
Select for auxiliar field
 */
  public static String selectDef2901(ConnectionProvider connectionProvider, String AD_ORG_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT zssi_getNewBPartnerValue(?) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zssi_getnewbpartnervalue");
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
  public static String selectDef2898_1(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as CreatedBy FROM AD_User table1 WHERE table1.isActive='Y' AND table1.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedByR);

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
  public static String selectDef73EBFF6996AF4894B91D7FFC4EF44D27_2(ConnectionProvider connectionProvider, String C_Location_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Address1), '')  || ' - ' || COALESCE(TO_CHAR(table1.Address2), '')  || ' - ' || COALESCE(TO_CHAR(table1.Postal), '')  || ' - ' || COALESCE(TO_CHAR(table1.City), '')  || ' - ' || COALESCE(TO_CHAR(table1.C_Region_ID), '')  || ' - ' || COALESCE(TO_CHAR(table1.C_Country_ID), '') ) as C_Location_ID FROM C_Location table1 WHERE table1.isActive='Y' AND table1.C_Location_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Location_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_location_id");
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
      "        UPDATE C_BPartner" +
      "        SET AD_Client_ID = (?) , AD_Org_ID = (?) , Value = (?) , Name = (?) , Description = (?) , IsActive = (?) , IsSummary = (?) , IsProspect = (?) , IsSalesRep = (?) , IsProcurementManager = (?) , ReferenceNo = (?) , C_BP_Group_ID = (?) , AD_Language = (?) , C_Location_ID = (?) , Country = (?) , Zipcode = (?) , City = (?) , URL = (?) , SalesVolume = TO_NUMBER(?) , Autocreatecommission = (?) , Isprojectmanager = (?) , Isworker = (?) , IsEmployee = (?) , Approvalamt = TO_NUMBER(?) , C_Greeting_ID = (?) , Ispaymentapprover = (?) , Rating = (?) , IsApprover = (?) , TaxID = (?) , C_BPartner_ID = (?) , Isprapprover = (?) , C_Salary_Category_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_BPartner.C_BPartner_ID = ? " +
      "        AND C_BPartner.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BPartner.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprospect);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issalesrep);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprocurementmanager);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, referenceno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, country);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zipcode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, city);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesvolume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, autocreatecommission);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprojectmanager);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isworker);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isemployee);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, approvalamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGreetingId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispaymentapprover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rating);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isapprover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprapprover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cSalaryCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
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
      "        INSERT INTO C_BPartner " +
      "        (AD_Client_ID, AD_Org_ID, Value, Name, Description, IsActive, IsSummary, IsProspect, IsSalesRep, IsProcurementManager, ReferenceNo, C_BP_Group_ID, AD_Language, C_Location_ID, Country, Zipcode, City, URL, SalesVolume, Autocreatecommission, Isprojectmanager, Isworker, IsEmployee, Approvalamt, C_Greeting_ID, Ispaymentapprover, Rating, IsApprover, TaxID, C_BPartner_ID, Isprapprover, C_Salary_Category_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprospect);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issalesrep);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprocurementmanager);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, referenceno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpGroupId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, country);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zipcode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, city);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesvolume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, autocreatecommission);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprojectmanager);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isworker);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isemployee);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, approvalamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGreetingId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispaymentapprover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rating);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isapprover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, taxid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprapprover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cSalaryCategoryId);
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
      "        DELETE FROM C_BPartner" +
      "        WHERE C_BPartner.C_BPartner_ID = ? " +
      "        AND C_BPartner.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BPartner.AD_Org_ID IN (";
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
      "        DELETE FROM C_BPartner" +
      "        WHERE C_BPartner.C_BPartner_ID = ? ";

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
      "          FROM C_BPartner" +
      "         WHERE C_BPartner.C_BPartner_ID = ? ";

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
      "          FROM C_BPartner" +
      "         WHERE C_BPartner.C_BPartner_ID = ? ";

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
