//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.ecommerce.OnlineShopAPIStatus;

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
class ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData implements FieldProvider {
static Logger log4j = Logger.getLogger(ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adProcessId;
  public String adProcessIdr;
  public String status;
  public String statusr;
  public String startTime;
  public String endTime;
  public String runtime;
  public String channel;
  public String log;
  public String result;
  public String adProcessRunId;
  public String isactive;
  public String adOrgId;
  public String params;
  public String adClientId;
  public String isrolesecurity;
  public String adUserId;
  public String adProcessOnlineapistatusVId;
  public String report;
  public String adProcessRequestId;
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
    else if (fieldName.equalsIgnoreCase("ad_process_id") || fieldName.equals("adProcessId"))
      return adProcessId;
    else if (fieldName.equalsIgnoreCase("ad_process_idr") || fieldName.equals("adProcessIdr"))
      return adProcessIdr;
    else if (fieldName.equalsIgnoreCase("status"))
      return status;
    else if (fieldName.equalsIgnoreCase("statusr"))
      return statusr;
    else if (fieldName.equalsIgnoreCase("start_time") || fieldName.equals("startTime"))
      return startTime;
    else if (fieldName.equalsIgnoreCase("end_time") || fieldName.equals("endTime"))
      return endTime;
    else if (fieldName.equalsIgnoreCase("runtime"))
      return runtime;
    else if (fieldName.equalsIgnoreCase("channel"))
      return channel;
    else if (fieldName.equalsIgnoreCase("log"))
      return log;
    else if (fieldName.equalsIgnoreCase("result"))
      return result;
    else if (fieldName.equalsIgnoreCase("ad_process_run_id") || fieldName.equals("adProcessRunId"))
      return adProcessRunId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("params"))
      return params;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isrolesecurity"))
      return isrolesecurity;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("ad_process_onlineapistatus_v_id") || fieldName.equals("adProcessOnlineapistatusVId"))
      return adProcessOnlineapistatusVId;
    else if (fieldName.equalsIgnoreCase("report"))
      return report;
    else if (fieldName.equalsIgnoreCase("ad_process_request_id") || fieldName.equals("adProcessRequestId"))
      return adProcessRequestId;
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
  public static ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(ad_process_onlineapistatus_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ad_process_onlineapistatus_v.CreatedBy) as CreatedByR, " +
      "        to_char(ad_process_onlineapistatus_v.Updated, ?) as updated, " +
      "        to_char(ad_process_onlineapistatus_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        ad_process_onlineapistatus_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ad_process_onlineapistatus_v.UpdatedBy) as UpdatedByR," +
      "        ad_process_onlineapistatus_v.AD_Process_ID, " +
      "(CASE WHEN ad_process_onlineapistatus_v.AD_Process_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS AD_Process_IDR, " +
      "ad_process_onlineapistatus_v.Status, " +
      "(CASE WHEN ad_process_onlineapistatus_v.Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS StatusR, " +
      "ad_process_onlineapistatus_v.start_time, " +
      "ad_process_onlineapistatus_v.end_time, " +
      "ad_process_onlineapistatus_v.Runtime, " +
      "ad_process_onlineapistatus_v.Channel, " +
      "ad_process_onlineapistatus_v.Log, " +
      "COALESCE(ad_process_onlineapistatus_v.Result, 'N') AS Result, " +
      "ad_process_onlineapistatus_v.AD_Process_Run_ID, " +
      "COALESCE(ad_process_onlineapistatus_v.Isactive, 'N') AS Isactive, " +
      "ad_process_onlineapistatus_v.AD_Org_ID, " +
      "ad_process_onlineapistatus_v.Params, " +
      "ad_process_onlineapistatus_v.AD_Client_ID, " +
      "COALESCE(ad_process_onlineapistatus_v.Isrolesecurity, 'N') AS Isrolesecurity, " +
      "ad_process_onlineapistatus_v.AD_User_ID, " +
      "ad_process_onlineapistatus_v.AD_Process_Onlineapistatus_V_ID, " +
      "ad_process_onlineapistatus_v.Report, " +
      "ad_process_onlineapistatus_v.AD_Process_Request_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM ad_process_onlineapistatus_v left join (select AD_Process_ID, Name from AD_Process) table1 on (ad_process_onlineapistatus_v.AD_Process_ID = table1.AD_Process_ID) left join (select AD_Process_ID,AD_Language, Name from AD_Process_TRL) tableTRL1 on (table1.AD_Process_ID = tableTRL1.AD_Process_ID and tableTRL1.AD_Language = ?)  left join ad_ref_list_v list1 on (ad_process_onlineapistatus_v.Status = list1.value and list1.ad_reference_id = '7DB6D4792CDC4ED297C70A4F4282A52E' and list1.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND ad_process_onlineapistatus_v.AD_Process_Onlineapistatus_V_ID = ? " +
      "        AND ad_process_onlineapistatus_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND ad_process_onlineapistatus_v.AD_Org_ID IN (";
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
        ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData = new ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData();
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.created = UtilSql.getValue(result, "created");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.updated = UtilSql.getValue(result, "updated");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.updatedby = UtilSql.getValue(result, "updatedby");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adProcessId = UtilSql.getValue(result, "ad_process_id");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adProcessIdr = UtilSql.getValue(result, "ad_process_idr");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.status = UtilSql.getValue(result, "status");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.statusr = UtilSql.getValue(result, "statusr");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.startTime = UtilSql.getValue(result, "start_time");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.endTime = UtilSql.getValue(result, "end_time");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.runtime = UtilSql.getValue(result, "runtime");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.channel = UtilSql.getValue(result, "channel");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.log = UtilSql.getValue(result, "log");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.result = UtilSql.getValue(result, "result");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adProcessRunId = UtilSql.getValue(result, "ad_process_run_id");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.isactive = UtilSql.getValue(result, "isactive");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.params = UtilSql.getValue(result, "params");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.isrolesecurity = UtilSql.getValue(result, "isrolesecurity");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adProcessOnlineapistatusVId = UtilSql.getValue(result, "ad_process_onlineapistatus_v_id");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.report = UtilSql.getValue(result, "report");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adProcessRequestId = UtilSql.getValue(result, "ad_process_request_id");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.language = UtilSql.getValue(result, "language");
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adUserClient = "";
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.adOrgClient = "";
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.createdby = "";
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.trBgcolor = "";
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.totalCount = "";
        objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData);
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
    ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[] = new ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[vector.size()];
    vector.copyInto(objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData);
    return(objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData);
  }

/**
Create a registry
 */
  public static ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[] set(String runtime, String adClientId, String isrolesecurity, String adUserId, String endTime, String adProcessId, String report, String status, String log, String params, String adOrgId, String adProcessOnlineapistatusVId, String isactive, String startTime, String adProcessRunId, String adProcessRequestId, String createdby, String createdbyr, String result, String channel, String updatedby, String updatedbyr)    throws ServletException {
    ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[] = new ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[1];
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0] = new ShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData();
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].created = "";
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].createdbyr = createdbyr;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].updated = "";
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].updatedTimeStamp = "";
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].updatedby = updatedby;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].updatedbyr = updatedbyr;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].adProcessId = adProcessId;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].adProcessIdr = "";
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].status = status;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].statusr = "";
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].startTime = startTime;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].endTime = endTime;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].runtime = runtime;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].channel = channel;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].log = log;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].result = result;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].adProcessRunId = adProcessRunId;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].isactive = isactive;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].adOrgId = adOrgId;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].params = params;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].adClientId = adClientId;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].isrolesecurity = isrolesecurity;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].adUserId = adUserId;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].adProcessOnlineapistatusVId = adProcessOnlineapistatusVId;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].report = report;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].adProcessRequestId = adProcessRequestId;
    objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData[0].language = "";
    return objectShopAPIStatus439B11D8DB194881A4E889BA9B25F6DAData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef8477E19FE8684EE9A60AEB079591D957_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef45895FDA79524B82915C817E208D5EE0_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE ad_process_onlineapistatus_v" +
      "        SET AD_Process_ID = (?) , Status = (?) , start_time = (?) , end_time = (?) , Runtime = (?) , Channel = (?) , Log = (?) , Result = (?) , AD_Process_Run_ID = (?) , Isactive = (?) , AD_Org_ID = (?) , Params = (?) , AD_Client_ID = (?) , Isrolesecurity = (?) , AD_User_ID = (?) , AD_Process_Onlineapistatus_V_ID = (?) , Report = (?) , AD_Process_Request_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE ad_process_onlineapistatus_v.AD_Process_Onlineapistatus_V_ID = ? " +
      "        AND ad_process_onlineapistatus_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ad_process_onlineapistatus_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, startTime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endTime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, runtime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, channel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, log);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, result);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessRunId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, params);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isrolesecurity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessOnlineapistatusVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, report);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessRequestId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessOnlineapistatusVId);
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
      "        INSERT INTO ad_process_onlineapistatus_v " +
      "        (AD_Process_ID, Status, start_time, end_time, Runtime, Channel, Log, Result, AD_Process_Run_ID, Isactive, AD_Org_ID, Params, AD_Client_ID, Isrolesecurity, AD_User_ID, AD_Process_Onlineapistatus_V_ID, Report, AD_Process_Request_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, startTime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, endTime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, runtime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, channel);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, log);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, result);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessRunId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, params);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isrolesecurity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessOnlineapistatusVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, report);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adProcessRequestId);
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
      "        DELETE FROM ad_process_onlineapistatus_v" +
      "        WHERE ad_process_onlineapistatus_v.AD_Process_Onlineapistatus_V_ID = ? " +
      "        AND ad_process_onlineapistatus_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ad_process_onlineapistatus_v.AD_Org_ID IN (";
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
      "        DELETE FROM ad_process_onlineapistatus_v" +
      "        WHERE ad_process_onlineapistatus_v.AD_Process_Onlineapistatus_V_ID = ? ";

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
      "          FROM ad_process_onlineapistatus_v" +
      "         WHERE ad_process_onlineapistatus_v.AD_Process_Onlineapistatus_V_ID = ? ";

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
      "          FROM ad_process_onlineapistatus_v" +
      "         WHERE ad_process_onlineapistatus_v.AD_Process_Onlineapistatus_V_ID = ? ";

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
