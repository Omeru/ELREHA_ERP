//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openz.timeservice.EmployeeWorktimeAccount;

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
class WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data implements FieldProvider {
static Logger log4j = Logger.getLogger(WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String value;
  public String adUserId;
  public String adUserIdr;
  public String wmonth;
  public String wyear;
  public String targethours;
  public String workhours;
  public String balance;
  public String holidayEntitlement;
  public String adClientId;
  public String cEmpworktimeaccountId;
  public String isactive;
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
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("ad_user_idr") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("wmonth"))
      return wmonth;
    else if (fieldName.equalsIgnoreCase("wyear"))
      return wyear;
    else if (fieldName.equalsIgnoreCase("targethours"))
      return targethours;
    else if (fieldName.equalsIgnoreCase("workhours"))
      return workhours;
    else if (fieldName.equalsIgnoreCase("balance"))
      return balance;
    else if (fieldName.equalsIgnoreCase("holiday_entitlement") || fieldName.equals("holidayEntitlement"))
      return holidayEntitlement;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("c_empworktimeaccount_id") || fieldName.equals("cEmpworktimeaccountId"))
      return cEmpworktimeaccountId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
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
  public static WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(c_empworktimeaccount.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_empworktimeaccount.CreatedBy) as CreatedByR, " +
      "        to_char(c_empworktimeaccount.Updated, ?) as updated, " +
      "        to_char(c_empworktimeaccount.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        c_empworktimeaccount.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_empworktimeaccount.UpdatedBy) as UpdatedByR," +
      "        c_empworktimeaccount.AD_Org_ID, " +
      "(CASE WHEN c_empworktimeaccount.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "c_empworktimeaccount.Value, " +
      "c_empworktimeaccount.ad_user_ID, " +
      "(CASE WHEN c_empworktimeaccount.ad_user_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS ad_user_IDR, " +
      "c_empworktimeaccount.Wmonth, " +
      "c_empworktimeaccount.Wyear, " +
      "c_empworktimeaccount.Targethours, " +
      "c_empworktimeaccount.Workhours, " +
      "c_empworktimeaccount.Balance, " +
      "c_empworktimeaccount.Holiday_Entitlement, " +
      "c_empworktimeaccount.AD_Client_ID, " +
      "c_empworktimeaccount.C_Empworktimeaccount_ID, " +
      "COALESCE(c_empworktimeaccount.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM c_empworktimeaccount left join (select AD_Org_ID, Name from AD_Org) table1 on (c_empworktimeaccount.AD_Org_ID = table1.AD_Org_ID) left join (select AD_User_ID, Name from AD_User) table2 on (c_empworktimeaccount.ad_user_ID = table2.AD_User_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND c_empworktimeaccount.C_Empworktimeaccount_ID = ? " +
      "        AND c_empworktimeaccount.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND c_empworktimeaccount.AD_Org_ID IN (";
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
        WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data = new WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data();
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.created = UtilSql.getValue(result, "created");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.updated = UtilSql.getValue(result, "updated");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.value = UtilSql.getValue(result, "value");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.adUserIdr = UtilSql.getValue(result, "ad_user_idr");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.wmonth = UtilSql.getValue(result, "wmonth");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.wyear = UtilSql.getValue(result, "wyear");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.targethours = UtilSql.getValue(result, "targethours");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.workhours = UtilSql.getValue(result, "workhours");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.balance = UtilSql.getValue(result, "balance");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.holidayEntitlement = UtilSql.getValue(result, "holiday_entitlement");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.cEmpworktimeaccountId = UtilSql.getValue(result, "c_empworktimeaccount_id");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.isactive = UtilSql.getValue(result, "isactive");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.language = UtilSql.getValue(result, "language");
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.adUserClient = "";
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.adOrgClient = "";
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.createdby = "";
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.trBgcolor = "";
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.totalCount = "";
        objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data);
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
    WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[] = new WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[vector.size()];
    vector.copyInto(objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data);
    return(objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data);
  }

/**
Create a registry
 */
  public static WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[] set(String adUserId, String adUserIdr, String wyear, String cEmpworktimeaccountId, String createdby, String createdbyr, String updatedby, String updatedbyr, String holidayEntitlement, String targethours, String value, String isactive, String workhours, String adClientId, String wmonth, String balance, String adOrgId)    throws ServletException {
    WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[] = new WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[1];
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0] = new WorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data();
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].created = "";
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].createdbyr = createdbyr;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].updated = "";
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].updatedTimeStamp = "";
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].updatedby = updatedby;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].updatedbyr = updatedbyr;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].adOrgId = adOrgId;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].adOrgIdr = "";
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].value = value;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].adUserId = adUserId;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].adUserIdr = adUserIdr;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].wmonth = wmonth;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].wyear = wyear;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].targethours = targethours;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].workhours = workhours;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].balance = balance;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].holidayEntitlement = holidayEntitlement;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].adClientId = adClientId;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].cEmpworktimeaccountId = cEmpworktimeaccountId;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].isactive = isactive;
    objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data[0].language = "";
    return objectWorktimeAccount7D13783F51684D14A6C4C77D3AFF7828Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefB75D76653C794688AAA3DE493FE83799_0(ConnectionProvider connectionProvider, String ad_user_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as ad_user_ID FROM AD_User table1 WHERE table1.isActive='Y' AND table1.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ad_user_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_user_id");
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
  public static String selectDefD4D08B1F077243D8AA6B62E2CE199B5C_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef4E2C5D44ABB04ADF9DC5A64B85C301F2_2(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE c_empworktimeaccount" +
      "        SET AD_Org_ID = (?) , Value = (?) , ad_user_ID = (?) , Wmonth = TO_NUMBER(?) , Wyear = TO_NUMBER(?) , Targethours = TO_NUMBER(?) , Workhours = TO_NUMBER(?) , Balance = TO_NUMBER(?) , Holiday_Entitlement = TO_NUMBER(?) , AD_Client_ID = (?) , C_Empworktimeaccount_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE c_empworktimeaccount.C_Empworktimeaccount_ID = ? " +
      "        AND c_empworktimeaccount.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_empworktimeaccount.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wmonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wyear);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, targethours);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, workhours);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, balance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, holidayEntitlement);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cEmpworktimeaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cEmpworktimeaccountId);
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
      "        INSERT INTO c_empworktimeaccount " +
      "        (AD_Org_ID, Value, ad_user_ID, Wmonth, Wyear, Targethours, Workhours, Balance, Holiday_Entitlement, AD_Client_ID, C_Empworktimeaccount_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wmonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wyear);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, targethours);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, workhours);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, balance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, holidayEntitlement);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cEmpworktimeaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
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
      "        DELETE FROM c_empworktimeaccount" +
      "        WHERE c_empworktimeaccount.C_Empworktimeaccount_ID = ? " +
      "        AND c_empworktimeaccount.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_empworktimeaccount.AD_Org_ID IN (";
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
      "        DELETE FROM c_empworktimeaccount" +
      "        WHERE c_empworktimeaccount.C_Empworktimeaccount_ID = ? ";

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
      "          FROM c_empworktimeaccount" +
      "         WHERE c_empworktimeaccount.C_Empworktimeaccount_ID = ? ";

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
      "          FROM c_empworktimeaccount" +
      "         WHERE c_empworktimeaccount.C_Empworktimeaccount_ID = ? ";

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
