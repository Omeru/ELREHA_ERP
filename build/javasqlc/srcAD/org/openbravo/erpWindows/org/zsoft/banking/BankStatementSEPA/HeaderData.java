//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.banking.BankStatementSEPA;

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
class HeaderData implements FieldProvider {
static Logger log4j = Logger.getLogger(HeaderData.class);
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
  public String cBankaccountId;
  public String cBankaccountIdr;
  public String sepapaintype;
  public String sepapaintyper;
  public String name;
  public String sepabankdate;
  public String createfrom;
  public String endingbalance;
  public String statementdate;
  public String sepaexport;
  public String processed;
  public String processedBtn;
  public String sepacollectsetprocessed;
  public String posted;
  public String postedBtn;
  public String sepacollectsetreversed;
  public String isactive;
  public String cBankstatementId;
  public String processing;
  public String description;
  public String separeqcolldate;
  public String beginningbalance;
  public String sepacollectioniscreated;
  public String docstatus;
  public String ismanual;
  public String statementdifference;
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
    else if (fieldName.equalsIgnoreCase("c_bankaccount_id") || fieldName.equals("cBankaccountId"))
      return cBankaccountId;
    else if (fieldName.equalsIgnoreCase("c_bankaccount_idr") || fieldName.equals("cBankaccountIdr"))
      return cBankaccountIdr;
    else if (fieldName.equalsIgnoreCase("sepapaintype"))
      return sepapaintype;
    else if (fieldName.equalsIgnoreCase("sepapaintyper"))
      return sepapaintyper;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("sepabankdate"))
      return sepabankdate;
    else if (fieldName.equalsIgnoreCase("createfrom"))
      return createfrom;
    else if (fieldName.equalsIgnoreCase("endingbalance"))
      return endingbalance;
    else if (fieldName.equalsIgnoreCase("statementdate"))
      return statementdate;
    else if (fieldName.equalsIgnoreCase("sepaexport"))
      return sepaexport;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("processed_btn") || fieldName.equals("processedBtn"))
      return processedBtn;
    else if (fieldName.equalsIgnoreCase("sepacollectsetprocessed"))
      return sepacollectsetprocessed;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("posted_btn") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("sepacollectsetreversed"))
      return sepacollectsetreversed;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("c_bankstatement_id") || fieldName.equals("cBankstatementId"))
      return cBankstatementId;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("separeqcolldate"))
      return separeqcolldate;
    else if (fieldName.equalsIgnoreCase("beginningbalance"))
      return beginningbalance;
    else if (fieldName.equalsIgnoreCase("sepacollectioniscreated"))
      return sepacollectioniscreated;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("ismanual"))
      return ismanual;
    else if (fieldName.equalsIgnoreCase("statementdifference"))
      return statementdifference;
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
  public static HeaderData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static HeaderData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_BankStatement.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BankStatement.CreatedBy) as CreatedByR, " +
      "        to_char(C_BankStatement.Updated, ?) as updated, " +
      "        to_char(C_BankStatement.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_BankStatement.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BankStatement.UpdatedBy) as UpdatedByR," +
      "        C_BankStatement.AD_Client_ID, " +
      "(CASE WHEN C_BankStatement.AD_Client_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Client_IDR, " +
      "C_BankStatement.AD_Org_ID, " +
      "(CASE WHEN C_BankStatement.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_BankStatement.C_BankAccount_ID, " +
      "(CASE WHEN C_BankStatement.C_BankAccount_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DisplayedAccount), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.ISO_Code), ''))),'') ) END) AS C_BankAccount_IDR, " +
      "C_BankStatement.SepaPainType, " +
      "(CASE WHEN C_BankStatement.SepaPainType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS SepaPainTypeR, " +
      "C_BankStatement.Name, " +
      "C_BankStatement.Sepabankdate, " +
      "C_BankStatement.CreateFrom, " +
      "C_BankStatement.EndingBalance, " +
      "C_BankStatement.StatementDate, " +
      "C_BankStatement.SepaExport, " +
      "C_BankStatement.Processed, " +
      "list2.name as Processed_BTN, " +
      "C_BankStatement.SepaCollectSetProcessed, " +
      "C_BankStatement.Posted, " +
      "list3.name as Posted_BTN, " +
      "C_BankStatement.SepaCollectSetReversed, " +
      "COALESCE(C_BankStatement.IsActive, 'N') AS IsActive, " +
      "C_BankStatement.C_BankStatement_ID, " +
      "COALESCE(C_BankStatement.Processing, 'N') AS Processing, " +
      "C_BankStatement.Description, " +
      "C_BankStatement.SepaReqCollDate, " +
      "C_BankStatement.BeginningBalance, " +
      "COALESCE(C_BankStatement.SepaCollectionIsCreated, 'N') AS SepaCollectionIsCreated, " +
      "C_BankStatement.Docstatus, " +
      "COALESCE(C_BankStatement.IsManual, 'N') AS IsManual, " +
      "C_BankStatement.StatementDifference, " +
      "        ? AS LANGUAGE " +
      "        FROM C_BankStatement left join (select AD_Client_ID, Name from AD_Client) table1 on (C_BankStatement.AD_Client_ID = table1.AD_Client_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (C_BankStatement.AD_Org_ID = table2.AD_Org_ID) left join (select C_BankAccount_ID, DisplayedAccount, C_Currency_ID from C_BankAccount) table3 on (C_BankStatement.C_BankAccount_ID = table3.C_BankAccount_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table4 on (table3.C_Currency_ID = table4.C_Currency_ID) left join ad_ref_list_v list1 on (C_BankStatement.SepaPainType = list1.value and list1.ad_reference_id = '882DF06516274574954CC06A08317B13' and list1.ad_language = ?)  left join ad_ref_list_v list2 on (list2.ad_reference_id = '800024' and list2.ad_language = ?  AND C_BankStatement.Processed = TO_CHAR(list2.value)) left join ad_ref_list_v list3 on (list3.ad_reference_id = '234' and list3.ad_language = ?  AND C_BankStatement.Posted = TO_CHAR(list3.value))" +
      "        WHERE 2=2 " +
      " AND SepaPainType IS NOT NULL" +
      "        AND 1=1 " +
      "        AND C_BankStatement.C_BankStatement_ID = ? " +
      "        AND C_BankStatement.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_BankStatement.AD_Org_ID IN (";
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
        HeaderData objectHeaderData = new HeaderData();
        objectHeaderData.created = UtilSql.getValue(result, "created");
        objectHeaderData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectHeaderData.updated = UtilSql.getValue(result, "updated");
        objectHeaderData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectHeaderData.updatedby = UtilSql.getValue(result, "updatedby");
        objectHeaderData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectHeaderData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectHeaderData.adClientIdr = UtilSql.getValue(result, "ad_client_idr");
        objectHeaderData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectHeaderData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectHeaderData.cBankaccountId = UtilSql.getValue(result, "c_bankaccount_id");
        objectHeaderData.cBankaccountIdr = UtilSql.getValue(result, "c_bankaccount_idr");
        objectHeaderData.sepapaintype = UtilSql.getValue(result, "sepapaintype");
        objectHeaderData.sepapaintyper = UtilSql.getValue(result, "sepapaintyper");
        objectHeaderData.name = UtilSql.getValue(result, "name");
        objectHeaderData.sepabankdate = UtilSql.getDateValue(result, "sepabankdate", "dd-MM-yyyy");
        objectHeaderData.createfrom = UtilSql.getValue(result, "createfrom");
        objectHeaderData.endingbalance = UtilSql.getValue(result, "endingbalance");
        objectHeaderData.statementdate = UtilSql.getDateValue(result, "statementdate", "dd-MM-yyyy");
        objectHeaderData.sepaexport = UtilSql.getValue(result, "sepaexport");
        objectHeaderData.processed = UtilSql.getValue(result, "processed");
        objectHeaderData.processedBtn = UtilSql.getValue(result, "processed_btn");
        objectHeaderData.sepacollectsetprocessed = UtilSql.getValue(result, "sepacollectsetprocessed");
        objectHeaderData.posted = UtilSql.getValue(result, "posted");
        objectHeaderData.postedBtn = UtilSql.getValue(result, "posted_btn");
        objectHeaderData.sepacollectsetreversed = UtilSql.getValue(result, "sepacollectsetreversed");
        objectHeaderData.isactive = UtilSql.getValue(result, "isactive");
        objectHeaderData.cBankstatementId = UtilSql.getValue(result, "c_bankstatement_id");
        objectHeaderData.processing = UtilSql.getValue(result, "processing");
        objectHeaderData.description = UtilSql.getValue(result, "description");
        objectHeaderData.separeqcolldate = UtilSql.getDateValue(result, "separeqcolldate", "dd-MM-yyyy");
        objectHeaderData.beginningbalance = UtilSql.getValue(result, "beginningbalance");
        objectHeaderData.sepacollectioniscreated = UtilSql.getValue(result, "sepacollectioniscreated");
        objectHeaderData.docstatus = UtilSql.getValue(result, "docstatus");
        objectHeaderData.ismanual = UtilSql.getValue(result, "ismanual");
        objectHeaderData.statementdifference = UtilSql.getValue(result, "statementdifference");
        objectHeaderData.language = UtilSql.getValue(result, "language");
        objectHeaderData.adUserClient = "";
        objectHeaderData.adOrgClient = "";
        objectHeaderData.createdby = "";
        objectHeaderData.trBgcolor = "";
        objectHeaderData.totalCount = "";
        objectHeaderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectHeaderData);
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
    HeaderData objectHeaderData[] = new HeaderData[vector.size()];
    vector.copyInto(objectHeaderData);
    return(objectHeaderData);
  }

/**
Create a registry
 */
  public static HeaderData[] set(String posted, String postedBtn, String adClientId, String processed, String processedBtn, String cBankaccountId, String endingbalance, String statementdifference, String sepacollectsetreversed, String adOrgId, String separeqcolldate, String description, String sepacollectioniscreated, String ismanual, String sepacollectsetprocessed, String beginningbalance, String createfrom, String docstatus, String statementdate, String isactive, String updatedby, String updatedbyr, String sepaexport, String processing, String name, String createdby, String createdbyr, String cBankstatementId, String sepabankdate, String sepapaintype)    throws ServletException {
    HeaderData objectHeaderData[] = new HeaderData[1];
    objectHeaderData[0] = new HeaderData();
    objectHeaderData[0].created = "";
    objectHeaderData[0].createdbyr = createdbyr;
    objectHeaderData[0].updated = "";
    objectHeaderData[0].updatedTimeStamp = "";
    objectHeaderData[0].updatedby = updatedby;
    objectHeaderData[0].updatedbyr = updatedbyr;
    objectHeaderData[0].adClientId = adClientId;
    objectHeaderData[0].adClientIdr = "";
    objectHeaderData[0].adOrgId = adOrgId;
    objectHeaderData[0].adOrgIdr = "";
    objectHeaderData[0].cBankaccountId = cBankaccountId;
    objectHeaderData[0].cBankaccountIdr = "";
    objectHeaderData[0].sepapaintype = sepapaintype;
    objectHeaderData[0].sepapaintyper = "";
    objectHeaderData[0].name = name;
    objectHeaderData[0].sepabankdate = sepabankdate;
    objectHeaderData[0].createfrom = createfrom;
    objectHeaderData[0].endingbalance = endingbalance;
    objectHeaderData[0].statementdate = statementdate;
    objectHeaderData[0].sepaexport = sepaexport;
    objectHeaderData[0].processed = processed;
    objectHeaderData[0].processedBtn = processedBtn;
    objectHeaderData[0].sepacollectsetprocessed = sepacollectsetprocessed;
    objectHeaderData[0].posted = posted;
    objectHeaderData[0].postedBtn = postedBtn;
    objectHeaderData[0].sepacollectsetreversed = sepacollectsetreversed;
    objectHeaderData[0].isactive = isactive;
    objectHeaderData[0].cBankstatementId = cBankstatementId;
    objectHeaderData[0].processing = processing;
    objectHeaderData[0].description = description;
    objectHeaderData[0].separeqcolldate = separeqcolldate;
    objectHeaderData[0].beginningbalance = beginningbalance;
    objectHeaderData[0].sepacollectioniscreated = sepacollectioniscreated;
    objectHeaderData[0].docstatus = docstatus;
    objectHeaderData[0].ismanual = ismanual;
    objectHeaderData[0].statementdifference = statementdifference;
    objectHeaderData[0].language = "";
    return objectHeaderData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef4916_0(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef5214(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select to_char(now(),'YYYY-MM-DD')||'-'||count(*)+1 as retval from c_bankstatement where statementdate=trunc(now()); ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "retval");
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
  public static String selectDef4914_1(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_BankStatement" +
      "        SET AD_Client_ID = (?) , AD_Org_ID = (?) , C_BankAccount_ID = (?) , SepaPainType = (?) , Name = (?) , Sepabankdate = TO_DATE(?) , CreateFrom = (?) , EndingBalance = TO_NUMBER(?) , StatementDate = TO_DATE(?) , SepaExport = (?) , Processed = (?) , SepaCollectSetProcessed = (?) , Posted = (?) , SepaCollectSetReversed = (?) , IsActive = (?) , C_BankStatement_ID = (?) , Processing = (?) , Description = (?) , SepaReqCollDate = TO_DATE(?) , BeginningBalance = TO_NUMBER(?) , SepaCollectionIsCreated = (?) , Docstatus = (?) , IsManual = (?) , StatementDifference = TO_NUMBER(?) , updated = now(), updatedby = ? " +
      "        WHERE C_BankStatement.C_BankStatement_ID = ? " +
      "        AND C_BankStatement.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BankStatement.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepapaintype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepabankdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endingbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepaexport);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepacollectsetprocessed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepacollectsetreversed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankstatementId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, separeqcolldate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, beginningbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepacollectioniscreated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ismanual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdifference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankstatementId);
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
      "        INSERT INTO C_BankStatement " +
      "        (AD_Client_ID, AD_Org_ID, C_BankAccount_ID, SepaPainType, Name, Sepabankdate, CreateFrom, EndingBalance, StatementDate, SepaExport, Processed, SepaCollectSetProcessed, Posted, SepaCollectSetReversed, IsActive, C_BankStatement_ID, Processing, Description, SepaReqCollDate, BeginningBalance, SepaCollectionIsCreated, Docstatus, IsManual, StatementDifference, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), TO_DATE(?), (?), TO_NUMBER(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepapaintype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepabankdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endingbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepaexport);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepacollectsetprocessed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepacollectsetreversed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankstatementId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, separeqcolldate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, beginningbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepacollectioniscreated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ismanual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdifference);
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
      "        DELETE FROM C_BankStatement" +
      "        WHERE C_BankStatement.C_BankStatement_ID = ? " +
      "        AND C_BankStatement.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BankStatement.AD_Org_ID IN (";
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
      "        DELETE FROM C_BankStatement" +
      "        WHERE C_BankStatement.C_BankStatement_ID = ? ";

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
      "          FROM C_BankStatement" +
      "         WHERE C_BankStatement.C_BankStatement_ID = ? ";

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
      "          FROM C_BankStatement" +
      "         WHERE C_BankStatement.C_BankStatement_ID = ? ";

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
