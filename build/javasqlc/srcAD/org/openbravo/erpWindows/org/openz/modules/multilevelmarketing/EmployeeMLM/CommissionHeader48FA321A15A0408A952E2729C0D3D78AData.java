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
class CommissionHeader48FA321A15A0408A952E2729C0D3D78AData implements FieldProvider {
static Logger log4j = Logger.getLogger(CommissionHeader48FA321A15A0408A952E2729C0D3D78AData.class);
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
  public String name;
  public String isactive;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String mProductId;
  public String mProductIdr;
  public String docbasistype;
  public String docbasistyper;
  public String frequencytype;
  public String frequencytyper;
  public String shareofturnoverpartner;
  public String shareofturnoverpartnerr;
  public String shareofturnoverpercent;
  public String datelastrun;
  public String processing;
  public String createfrom;
  public String listdetails;
  public String adClientId;
  public String description;
  public String cCommissionId;
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
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("docbasistype"))
      return docbasistype;
    else if (fieldName.equalsIgnoreCase("docbasistyper"))
      return docbasistyper;
    else if (fieldName.equalsIgnoreCase("frequencytype"))
      return frequencytype;
    else if (fieldName.equalsIgnoreCase("frequencytyper"))
      return frequencytyper;
    else if (fieldName.equalsIgnoreCase("shareofturnoverpartner"))
      return shareofturnoverpartner;
    else if (fieldName.equalsIgnoreCase("shareofturnoverpartnerr"))
      return shareofturnoverpartnerr;
    else if (fieldName.equalsIgnoreCase("shareofturnoverpercent"))
      return shareofturnoverpercent;
    else if (fieldName.equalsIgnoreCase("datelastrun"))
      return datelastrun;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("createfrom"))
      return createfrom;
    else if (fieldName.equalsIgnoreCase("listdetails"))
      return listdetails;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_commission_id") || fieldName.equals("cCommissionId"))
      return cCommissionId;
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
  public static CommissionHeader48FA321A15A0408A952E2729C0D3D78AData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPartner_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, C_BPartner_ID, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static CommissionHeader48FA321A15A0408A952E2729C0D3D78AData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPartner_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_Commission.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Commission.CreatedBy) as CreatedByR, " +
      "        to_char(C_Commission.Updated, ?) as updated, " +
      "        to_char(C_Commission.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Commission.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Commission.UpdatedBy) as UpdatedByR," +
      "        C_Commission.AD_Org_ID, " +
      "(CASE WHEN C_Commission.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_Commission.C_BPartner_ID, " +
      "(CASE WHEN C_Commission.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_Commission.Name, " +
      "COALESCE(C_Commission.IsActive, 'N') AS IsActive, " +
      "C_Commission.C_Currency_ID, " +
      "(CASE WHEN C_Commission.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "C_Commission.M_Product_ID, " +
      "(CASE WHEN C_Commission.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "C_Commission.DocBasisType, " +
      "(CASE WHEN C_Commission.DocBasisType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS DocBasisTypeR, " +
      "C_Commission.FrequencyType, " +
      "(CASE WHEN C_Commission.FrequencyType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS FrequencyTypeR, " +
      "C_Commission.Shareofturnoverpartner, " +
      "(CASE WHEN C_Commission.Shareofturnoverpartner IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS ShareofturnoverpartnerR, " +
      "C_Commission.Shareofturnoverpercent, " +
      "C_Commission.DateLastRun, " +
      "C_Commission.Processing, " +
      "C_Commission.CreateFrom, " +
      "COALESCE(C_Commission.ListDetails, 'N') AS ListDetails, " +
      "C_Commission.AD_Client_ID, " +
      "C_Commission.Description, " +
      "C_Commission.C_Commission_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Commission left join (select AD_Org_ID, Name from AD_Org) table1 on (C_Commission.AD_Org_ID = table1.AD_Org_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_Commission.C_BPartner_ID = table2.C_BPartner_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table3 on (C_Commission.C_Currency_ID = table3.C_Currency_ID) left join (select M_Product_ID, Value, Name from M_Product) table4 on (C_Commission.M_Product_ID = table4.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  left join ad_ref_list_v list1 on (C_Commission.DocBasisType = list1.value and list1.ad_reference_id = '224' and list1.ad_language = ?)  left join ad_ref_list_v list2 on (C_Commission.FrequencyType = list2.value and list2.ad_reference_id = '225' and list2.ad_language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table5 on (C_Commission.Shareofturnoverpartner =  table5.C_BPartner_ID)" +
      "        WHERE 2=2 " +
      " AND c_commission.C_BPartner_ID = ?" +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND C_Commission.C_BPartner_ID = ?  ");
    strSql = strSql + 
      "        AND C_Commission.C_Commission_ID = ? " +
      "        AND C_Commission.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_Commission.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_ID);
      if (cBpartnerId != null && !(cBpartnerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      }
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
        CommissionHeader48FA321A15A0408A952E2729C0D3D78AData objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData = new CommissionHeader48FA321A15A0408A952E2729C0D3D78AData();
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.created = UtilSql.getValue(result, "created");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.updated = UtilSql.getValue(result, "updated");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.updatedby = UtilSql.getValue(result, "updatedby");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.name = UtilSql.getValue(result, "name");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.isactive = UtilSql.getValue(result, "isactive");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.docbasistype = UtilSql.getValue(result, "docbasistype");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.docbasistyper = UtilSql.getValue(result, "docbasistyper");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.frequencytype = UtilSql.getValue(result, "frequencytype");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.frequencytyper = UtilSql.getValue(result, "frequencytyper");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.shareofturnoverpartner = UtilSql.getValue(result, "shareofturnoverpartner");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.shareofturnoverpartnerr = UtilSql.getValue(result, "shareofturnoverpartnerr");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.shareofturnoverpercent = UtilSql.getValue(result, "shareofturnoverpercent");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.datelastrun = UtilSql.getDateValue(result, "datelastrun", "dd-MM-yyyy");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.processing = UtilSql.getValue(result, "processing");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.createfrom = UtilSql.getValue(result, "createfrom");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.listdetails = UtilSql.getValue(result, "listdetails");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.description = UtilSql.getValue(result, "description");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.cCommissionId = UtilSql.getValue(result, "c_commission_id");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.language = UtilSql.getValue(result, "language");
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.adUserClient = "";
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.adOrgClient = "";
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.createdby = "";
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.trBgcolor = "";
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.totalCount = "";
        objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData);
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
    CommissionHeader48FA321A15A0408A952E2729C0D3D78AData objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[] = new CommissionHeader48FA321A15A0408A952E2729C0D3D78AData[vector.size()];
    vector.copyInto(objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData);
    return(objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData);
  }

/**
Create a registry
 */
  public static CommissionHeader48FA321A15A0408A952E2729C0D3D78AData[] set(String cBpartnerId, String shareofturnoverpartner, String adClientId, String cCommissionId, String description, String listdetails, String updatedby, String updatedbyr, String isactive, String datelastrun, String shareofturnoverpercent, String mProductId, String mProductIdr, String name, String processing, String createdby, String createdbyr, String docbasistype, String cBpartnerIdr, String frequencytype, String createfrom, String adOrgId, String cCurrencyId)    throws ServletException {
    CommissionHeader48FA321A15A0408A952E2729C0D3D78AData objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[] = new CommissionHeader48FA321A15A0408A952E2729C0D3D78AData[1];
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0] = new CommissionHeader48FA321A15A0408A952E2729C0D3D78AData();
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].created = "";
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].createdbyr = createdbyr;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].updated = "";
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].updatedTimeStamp = "";
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].updatedby = updatedby;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].updatedbyr = updatedbyr;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].adOrgId = adOrgId;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].adOrgIdr = "";
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].cBpartnerId = cBpartnerId;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].cBpartnerIdr = cBpartnerIdr;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].name = name;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].isactive = isactive;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].cCurrencyId = cCurrencyId;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].cCurrencyIdr = "";
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].mProductId = mProductId;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].mProductIdr = mProductIdr;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].docbasistype = docbasistype;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].docbasistyper = "";
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].frequencytype = frequencytype;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].frequencytyper = "";
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].shareofturnoverpartner = shareofturnoverpartner;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].shareofturnoverpartnerr = "";
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].shareofturnoverpercent = shareofturnoverpercent;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].datelastrun = datelastrun;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].processing = processing;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].createfrom = createfrom;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].listdetails = listdetails;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].adClientId = adClientId;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].description = description;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].cCommissionId = cCommissionId;
    objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData[0].language = "";
    return objectCommissionHeader48FA321A15A0408A952E2729C0D3D78AData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef5674_0(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef802829_1(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Value), '')  || ' - ' || COALESCE(TO_CHAR(table1.Name), '') ) as M_Product_ID FROM M_Product table1 WHERE table1.isActive='Y' AND table1.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_product_id");
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
  public static String selectDef5672_2(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef5677_3(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as C_BPartner_ID FROM C_BPartner table1 WHERE table1.isActive='Y' AND table1.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_IDR);

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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_Commission.C_BPartner_ID AS NAME" +
      "        FROM C_Commission" +
      "        WHERE C_Commission.C_Commission_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
Select for parent field
 */
  public static String selectParent(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table1 on (C_BPartner.C_BPartner_ID = table1.C_BPartner_ID) WHERE C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
Select for parent field
 */
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table1 on (C_BPartner.C_BPartner_ID = table1.C_BPartner_ID) WHERE C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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
      "        UPDATE C_Commission" +
      "        SET AD_Org_ID = (?) , C_BPartner_ID = (?) , Name = (?) , IsActive = (?) , C_Currency_ID = (?) , M_Product_ID = (?) , DocBasisType = (?) , FrequencyType = (?) , Shareofturnoverpartner = (?) , Shareofturnoverpercent = TO_NUMBER(?) , DateLastRun = TO_DATE(?) , Processing = (?) , CreateFrom = (?) , ListDetails = (?) , AD_Client_ID = (?) , Description = (?) , C_Commission_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_Commission.C_Commission_ID = ? " +
      "                 AND C_Commission.C_BPartner_ID = ? " +
      "        AND C_Commission.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Commission.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docbasistype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, frequencytype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shareofturnoverpartner);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shareofturnoverpercent);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datelastrun);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, listdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
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
      "        INSERT INTO C_Commission " +
      "        (AD_Org_ID, C_BPartner_ID, Name, IsActive, C_Currency_ID, M_Product_ID, DocBasisType, FrequencyType, Shareofturnoverpartner, Shareofturnoverpercent, DateLastRun, Processing, CreateFrom, ListDetails, AD_Client_ID, Description, C_Commission_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docbasistype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, frequencytype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shareofturnoverpartner);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shareofturnoverpercent);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datelastrun);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, listdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cBpartnerId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_Commission" +
      "        WHERE C_Commission.C_Commission_ID = ? " +
      "                 AND C_Commission.C_BPartner_ID = ? " +
      "        AND C_Commission.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Commission.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
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
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_Commission" +
      "        WHERE C_Commission.C_Commission_ID = ? " +
      "                 AND C_Commission.C_BPartner_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
      "          FROM C_Commission" +
      "         WHERE C_Commission.C_Commission_ID = ? ";

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
      "          FROM C_Commission" +
      "         WHERE C_Commission.C_Commission_ID = ? ";

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
