//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.zsoft.finance.CompareAccountingBalance;

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
class Result5E2426B9F4C744488DBCFC3FE2EADF49Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Result5E2426B9F4C744488DBCFC3FE2EADF49Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zsfiSusadatevId;
  public String zsfiSusadatevIdr;
  public String cElementvalueId;
  public String cElementvalueIdr;
  public String name;
  public String beginningbalance;
  public String credit;
  public String debit;
  public String endingbalance;
  public String beginningbalancedatev;
  public String creditdatev;
  public String debitdatev;
  public String endingbalancedatev;
  public String difference;
  public String isdifference;
  public String adClientId;
  public String zsfiSusadatevaccountsId;
  public String adOrgId;
  public String isactive;
  public String rowcolor;
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
    else if (fieldName.equalsIgnoreCase("zsfi_susadatev_id") || fieldName.equals("zsfiSusadatevId"))
      return zsfiSusadatevId;
    else if (fieldName.equalsIgnoreCase("zsfi_susadatev_idr") || fieldName.equals("zsfiSusadatevIdr"))
      return zsfiSusadatevIdr;
    else if (fieldName.equalsIgnoreCase("c_elementvalue_id") || fieldName.equals("cElementvalueId"))
      return cElementvalueId;
    else if (fieldName.equalsIgnoreCase("c_elementvalue_idr") || fieldName.equals("cElementvalueIdr"))
      return cElementvalueIdr;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("beginningbalance"))
      return beginningbalance;
    else if (fieldName.equalsIgnoreCase("credit"))
      return credit;
    else if (fieldName.equalsIgnoreCase("debit"))
      return debit;
    else if (fieldName.equalsIgnoreCase("endingbalance"))
      return endingbalance;
    else if (fieldName.equalsIgnoreCase("beginningbalancedatev"))
      return beginningbalancedatev;
    else if (fieldName.equalsIgnoreCase("creditdatev"))
      return creditdatev;
    else if (fieldName.equalsIgnoreCase("debitdatev"))
      return debitdatev;
    else if (fieldName.equalsIgnoreCase("endingbalancedatev"))
      return endingbalancedatev;
    else if (fieldName.equalsIgnoreCase("difference"))
      return difference;
    else if (fieldName.equalsIgnoreCase("isdifference"))
      return isdifference;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("zsfi_susadatevaccounts_id") || fieldName.equals("zsfiSusadatevaccountsId"))
      return zsfiSusadatevaccountsId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("rowcolor"))
      return rowcolor;
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
  public static Result5E2426B9F4C744488DBCFC3FE2EADF49Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zsfiSusadatevId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zsfiSusadatevId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Result5E2426B9F4C744488DBCFC3FE2EADF49Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zsfiSusadatevId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zsfi_susadatevaccounts.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zsfi_susadatevaccounts.CreatedBy) as CreatedByR, " +
      "        to_char(zsfi_susadatevaccounts.Updated, ?) as updated, " +
      "        to_char(zsfi_susadatevaccounts.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zsfi_susadatevaccounts.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zsfi_susadatevaccounts.UpdatedBy) as UpdatedByR," +
      "        zsfi_susadatevaccounts.Zsfi_Susadatev_ID, " +
      "(CASE WHEN zsfi_susadatevaccounts.Zsfi_Susadatev_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS Zsfi_Susadatev_IDR, " +
      "zsfi_susadatevaccounts.C_Elementvalue_ID, " +
      "(CASE WHEN zsfi_susadatevaccounts.C_Elementvalue_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_Elementvalue_IDR, " +
      "zsfi_susadatevaccounts.Name, " +
      "zsfi_susadatevaccounts.Beginningbalance, " +
      "zsfi_susadatevaccounts.Credit, " +
      "zsfi_susadatevaccounts.Debit, " +
      "zsfi_susadatevaccounts.Endingbalance, " +
      "zsfi_susadatevaccounts.Beginningbalancedatev, " +
      "zsfi_susadatevaccounts.Creditdatev, " +
      "zsfi_susadatevaccounts.Debitdatev, " +
      "zsfi_susadatevaccounts.Endingbalancedatev, " +
      "zsfi_susadatevaccounts.Difference, " +
      "COALESCE(zsfi_susadatevaccounts.Isdifference, 'N') AS Isdifference, " +
      "zsfi_susadatevaccounts.AD_Client_ID, " +
      "zsfi_susadatevaccounts.Zsfi_Susadatevaccounts_ID, " +
      "zsfi_susadatevaccounts.AD_Org_ID, " +
      "COALESCE(zsfi_susadatevaccounts.Isactive, 'N') AS Isactive, " +
      "zsfi_susadatevaccounts.rowcolor, " +
      "        ? AS LANGUAGE " +
      "        FROM zsfi_susadatevaccounts left join (select Zsfi_Susadatev_ID, Name from Zsfi_Susadatev) table1 on (zsfi_susadatevaccounts.Zsfi_Susadatev_ID = table1.Zsfi_Susadatev_ID) left join (select C_Elementvalue_ID, Value, Name from C_Elementvalue) table2 on (zsfi_susadatevaccounts.C_Elementvalue_ID = table2.C_Elementvalue_ID) left join (select C_ElementValue_ID,AD_Language, Name from C_ElementValue_TRL) tableTRL2 on (table2.C_ElementValue_ID = tableTRL2.C_ElementValue_ID and tableTRL2.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zsfiSusadatevId==null || zsfiSusadatevId.equals(""))?"":"  AND zsfi_susadatevaccounts.Zsfi_Susadatev_ID = ?  ");
    strSql = strSql + 
      "        AND zsfi_susadatevaccounts.Zsfi_Susadatevaccounts_ID = ? " +
      "        AND zsfi_susadatevaccounts.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zsfi_susadatevaccounts.AD_Org_ID IN (";
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
      if (zsfiSusadatevId != null && !(zsfiSusadatevId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);
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
        Result5E2426B9F4C744488DBCFC3FE2EADF49Data objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data = new Result5E2426B9F4C744488DBCFC3FE2EADF49Data();
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.created = UtilSql.getValue(result, "created");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.updated = UtilSql.getValue(result, "updated");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.zsfiSusadatevId = UtilSql.getValue(result, "zsfi_susadatev_id");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.zsfiSusadatevIdr = UtilSql.getValue(result, "zsfi_susadatev_idr");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.cElementvalueId = UtilSql.getValue(result, "c_elementvalue_id");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.cElementvalueIdr = UtilSql.getValue(result, "c_elementvalue_idr");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.name = UtilSql.getValue(result, "name");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.beginningbalance = UtilSql.getValue(result, "beginningbalance");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.credit = UtilSql.getValue(result, "credit");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.debit = UtilSql.getValue(result, "debit");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.endingbalance = UtilSql.getValue(result, "endingbalance");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.beginningbalancedatev = UtilSql.getValue(result, "beginningbalancedatev");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.creditdatev = UtilSql.getValue(result, "creditdatev");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.debitdatev = UtilSql.getValue(result, "debitdatev");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.endingbalancedatev = UtilSql.getValue(result, "endingbalancedatev");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.difference = UtilSql.getValue(result, "difference");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.isdifference = UtilSql.getValue(result, "isdifference");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.zsfiSusadatevaccountsId = UtilSql.getValue(result, "zsfi_susadatevaccounts_id");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.isactive = UtilSql.getValue(result, "isactive");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.rowcolor = UtilSql.getValue(result, "rowcolor");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.language = UtilSql.getValue(result, "language");
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.adUserClient = "";
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.adOrgClient = "";
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.createdby = "";
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.trBgcolor = "";
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.totalCount = "";
        objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data);
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
    Result5E2426B9F4C744488DBCFC3FE2EADF49Data objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[] = new Result5E2426B9F4C744488DBCFC3FE2EADF49Data[vector.size()];
    vector.copyInto(objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data);
    return(objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data);
  }

/**
Create a registry
 */
  public static Result5E2426B9F4C744488DBCFC3FE2EADF49Data[] set(String zsfiSusadatevId, String cElementvalueId, String zsfiSusadatevaccountsId, String adClientId, String endingbalance, String creditdatev, String isactive, String isdifference, String credit, String updatedby, String updatedbyr, String rowcolor, String adOrgId, String beginningbalance, String debitdatev, String debit, String beginningbalancedatev, String createdby, String createdbyr, String endingbalancedatev, String name, String difference)    throws ServletException {
    Result5E2426B9F4C744488DBCFC3FE2EADF49Data objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[] = new Result5E2426B9F4C744488DBCFC3FE2EADF49Data[1];
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0] = new Result5E2426B9F4C744488DBCFC3FE2EADF49Data();
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].created = "";
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].createdbyr = createdbyr;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].updated = "";
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].updatedTimeStamp = "";
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].updatedby = updatedby;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].updatedbyr = updatedbyr;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].zsfiSusadatevId = zsfiSusadatevId;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].zsfiSusadatevIdr = "";
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].cElementvalueId = cElementvalueId;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].cElementvalueIdr = "";
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].name = name;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].beginningbalance = beginningbalance;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].credit = credit;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].debit = debit;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].endingbalance = endingbalance;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].beginningbalancedatev = beginningbalancedatev;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].creditdatev = creditdatev;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].debitdatev = debitdatev;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].endingbalancedatev = endingbalancedatev;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].difference = difference;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].isdifference = isdifference;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].adClientId = adClientId;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].zsfiSusadatevaccountsId = zsfiSusadatevaccountsId;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].adOrgId = adOrgId;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].isactive = isactive;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].rowcolor = rowcolor;
    objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data[0].language = "";
    return objectResult5E2426B9F4C744488DBCFC3FE2EADF49Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef87125342A48344D4A15ED37E881C9170_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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

/**
Select for auxiliar field
 */
  public static String selectDef028CCE67C1AB497AA1EA0E96A800BAD4_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT zsfi_susadatevaccounts.Zsfi_Susadatev_ID AS NAME" +
      "        FROM zsfi_susadatevaccounts" +
      "        WHERE zsfi_susadatevaccounts.Zsfi_Susadatevaccounts_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String zsfiSusadatevId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM zsfi_susadatev left join (select Zsfi_Susadatev_ID, Name from Zsfi_Susadatev) table1 on (zsfi_susadatev.Zsfi_Susadatev_ID = table1.Zsfi_Susadatev_ID) WHERE zsfi_susadatev.Zsfi_Susadatev_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String zsfiSusadatevId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM zsfi_susadatev left join (select Zsfi_Susadatev_ID, Name from Zsfi_Susadatev) table1 on (zsfi_susadatev.Zsfi_Susadatev_ID = table1.Zsfi_Susadatev_ID) WHERE zsfi_susadatev.Zsfi_Susadatev_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);

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
      "        UPDATE zsfi_susadatevaccounts" +
      "        SET Zsfi_Susadatev_ID = (?) , C_Elementvalue_ID = (?) , Name = (?) , Beginningbalance = TO_NUMBER(?) , Credit = TO_NUMBER(?) , Debit = TO_NUMBER(?) , Endingbalance = TO_NUMBER(?) , Beginningbalancedatev = TO_NUMBER(?) , Creditdatev = TO_NUMBER(?) , Debitdatev = TO_NUMBER(?) , Endingbalancedatev = TO_NUMBER(?) , Difference = TO_NUMBER(?) , Isdifference = (?) , AD_Client_ID = (?) , Zsfi_Susadatevaccounts_ID = (?) , AD_Org_ID = (?) , Isactive = (?) , rowcolor = (?) , updated = now(), updatedby = ? " +
      "        WHERE zsfi_susadatevaccounts.Zsfi_Susadatevaccounts_ID = ? " +
      "                 AND zsfi_susadatevaccounts.Zsfi_Susadatev_ID = ? " +
      "        AND zsfi_susadatevaccounts.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zsfi_susadatevaccounts.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cElementvalueId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, beginningbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, credit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, debit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endingbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, beginningbalancedatev);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditdatev);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, debitdatev);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endingbalancedatev);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, difference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdifference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevaccountsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rowcolor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevaccountsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);
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
      "        INSERT INTO zsfi_susadatevaccounts " +
      "        (Zsfi_Susadatev_ID, C_Elementvalue_ID, Name, Beginningbalance, Credit, Debit, Endingbalance, Beginningbalancedatev, Creditdatev, Debitdatev, Endingbalancedatev, Difference, Isdifference, AD_Client_ID, Zsfi_Susadatevaccounts_ID, AD_Org_ID, Isactive, rowcolor, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cElementvalueId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, beginningbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, credit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, debit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endingbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, beginningbalancedatev);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditdatev);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, debitdatev);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endingbalancedatev);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, difference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdifference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevaccountsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rowcolor);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String zsfiSusadatevId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zsfi_susadatevaccounts" +
      "        WHERE zsfi_susadatevaccounts.Zsfi_Susadatevaccounts_ID = ? " +
      "                 AND zsfi_susadatevaccounts.Zsfi_Susadatev_ID = ? " +
      "        AND zsfi_susadatevaccounts.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zsfi_susadatevaccounts.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String zsfiSusadatevId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zsfi_susadatevaccounts" +
      "        WHERE zsfi_susadatevaccounts.Zsfi_Susadatevaccounts_ID = ? " +
      "                 AND zsfi_susadatevaccounts.Zsfi_Susadatev_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);

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
      "          FROM zsfi_susadatevaccounts" +
      "         WHERE zsfi_susadatevaccounts.Zsfi_Susadatevaccounts_ID = ? ";

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
      "          FROM zsfi_susadatevaccounts" +
      "         WHERE zsfi_susadatevaccounts.Zsfi_Susadatevaccounts_ID = ? ";

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
