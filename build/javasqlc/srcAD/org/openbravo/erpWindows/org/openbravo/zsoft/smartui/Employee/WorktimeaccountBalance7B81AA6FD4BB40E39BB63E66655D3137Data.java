//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.zsoft.smartui.Employee;

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
class WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data implements FieldProvider {
static Logger log4j = Logger.getLogger(WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String wmonth;
  public String wyear;
  public String newbalance;
  public String description;
  public String cEmpworktimeaccountbalanceId;
  public String adOrgId;
  public String adClientId;
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
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("wmonth"))
      return wmonth;
    else if (fieldName.equalsIgnoreCase("wyear"))
      return wyear;
    else if (fieldName.equalsIgnoreCase("newbalance"))
      return newbalance;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_empworktimeaccountbalance_id") || fieldName.equals("cEmpworktimeaccountbalanceId"))
      return cEmpworktimeaccountbalanceId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
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
  public static WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(c_empworktimeaccountbalance.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_empworktimeaccountbalance.CreatedBy) as CreatedByR, " +
      "        to_char(c_empworktimeaccountbalance.Updated, ?) as updated, " +
      "        to_char(c_empworktimeaccountbalance.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        c_empworktimeaccountbalance.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_empworktimeaccountbalance.UpdatedBy) as UpdatedByR," +
      "        c_empworktimeaccountbalance.C_Bpartner_ID, " +
      "(CASE WHEN c_empworktimeaccountbalance.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "c_empworktimeaccountbalance.Wmonth, " +
      "c_empworktimeaccountbalance.Wyear, " +
      "c_empworktimeaccountbalance.Newbalance, " +
      "c_empworktimeaccountbalance.Description, " +
      "c_empworktimeaccountbalance.C_Empworktimeaccountbalance_ID, " +
      "c_empworktimeaccountbalance.AD_Org_ID, " +
      "c_empworktimeaccountbalance.AD_Client_ID, " +
      "COALESCE(c_empworktimeaccountbalance.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM c_empworktimeaccountbalance left join (select C_Bpartner_ID, Name from C_Bpartner) table1 on (c_empworktimeaccountbalance.C_Bpartner_ID = table1.C_Bpartner_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND c_empworktimeaccountbalance.C_Bpartner_ID = ?  ");
    strSql = strSql + 
      "        AND c_empworktimeaccountbalance.C_Empworktimeaccountbalance_ID = ? " +
      "        AND c_empworktimeaccountbalance.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND c_empworktimeaccountbalance.AD_Org_ID IN (";
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
        WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data = new WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data();
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.created = UtilSql.getValue(result, "created");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.updated = UtilSql.getValue(result, "updated");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.wmonth = UtilSql.getValue(result, "wmonth");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.wyear = UtilSql.getValue(result, "wyear");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.newbalance = UtilSql.getValue(result, "newbalance");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.description = UtilSql.getValue(result, "description");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.cEmpworktimeaccountbalanceId = UtilSql.getValue(result, "c_empworktimeaccountbalance_id");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.isactive = UtilSql.getValue(result, "isactive");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.language = UtilSql.getValue(result, "language");
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.adUserClient = "";
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.adOrgClient = "";
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.createdby = "";
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.trBgcolor = "";
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.totalCount = "";
        objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data);
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
    WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[] = new WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[vector.size()];
    vector.copyInto(objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data);
    return(objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data);
  }

/**
Create a registry
 */
  public static WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[] set(String cBpartnerId, String wmonth, String cEmpworktimeaccountbalanceId, String newbalance, String wyear, String adClientId, String description, String adOrgId, String updatedby, String updatedbyr, String isactive, String createdby, String createdbyr)    throws ServletException {
    WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[] = new WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[1];
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0] = new WorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data();
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].created = "";
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].createdbyr = createdbyr;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].updated = "";
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].updatedTimeStamp = "";
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].updatedby = updatedby;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].updatedbyr = updatedbyr;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].cBpartnerId = cBpartnerId;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].cBpartnerIdr = "";
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].wmonth = wmonth;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].wyear = wyear;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].newbalance = newbalance;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].description = description;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].cEmpworktimeaccountbalanceId = cEmpworktimeaccountbalanceId;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].adOrgId = adOrgId;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].adClientId = adClientId;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].isactive = isactive;
    objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data[0].language = "";
    return objectWorktimeaccountBalance7B81AA6FD4BB40E39BB63E66655D3137Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2290C5D1CCC74C218134115B1D4D1617_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef21D940C779184D79B9387790BA2D7A61_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        SELECT c_empworktimeaccountbalance.C_Bpartner_ID AS NAME" +
      "        FROM c_empworktimeaccountbalance" +
      "        WHERE c_empworktimeaccountbalance.C_Empworktimeaccountbalance_ID = ?";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM c_bpartneremployee_view left join (select C_Bpartner_ID, Name from C_Bpartner) table1 on (c_bpartneremployee_view.C_Bpartner_ID = table1.C_Bpartner_ID) WHERE c_bpartneremployee_view.C_Bpartner_ID = ?  ";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM c_bpartneremployee_view left join (select C_Bpartner_ID, Name from C_Bpartner) table1 on (c_bpartneremployee_view.C_Bpartner_ID = table1.C_Bpartner_ID) WHERE c_bpartneremployee_view.C_Bpartner_ID = ?  ";

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
      "        UPDATE c_empworktimeaccountbalance" +
      "        SET C_Bpartner_ID = (?) , Wmonth = (?) , Wyear = TO_NUMBER(?) , Newbalance = TO_NUMBER(?) , Description = (?) , C_Empworktimeaccountbalance_ID = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE c_empworktimeaccountbalance.C_Empworktimeaccountbalance_ID = ? " +
      "                 AND c_empworktimeaccountbalance.C_Bpartner_ID = ? " +
      "        AND c_empworktimeaccountbalance.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_empworktimeaccountbalance.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wmonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wyear);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, newbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cEmpworktimeaccountbalanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cEmpworktimeaccountbalanceId);
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
      "        INSERT INTO c_empworktimeaccountbalance " +
      "        (C_Bpartner_ID, Wmonth, Wyear, Newbalance, Description, C_Empworktimeaccountbalance_ID, AD_Org_ID, AD_Client_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wmonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wyear);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, newbalance);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cEmpworktimeaccountbalanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cBpartnerId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM c_empworktimeaccountbalance" +
      "        WHERE c_empworktimeaccountbalance.C_Empworktimeaccountbalance_ID = ? " +
      "                 AND c_empworktimeaccountbalance.C_Bpartner_ID = ? " +
      "        AND c_empworktimeaccountbalance.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_empworktimeaccountbalance.AD_Org_ID IN (";
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
      "        DELETE FROM c_empworktimeaccountbalance" +
      "        WHERE c_empworktimeaccountbalance.C_Empworktimeaccountbalance_ID = ? " +
      "                 AND c_empworktimeaccountbalance.C_Bpartner_ID = ? ";

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
      "          FROM c_empworktimeaccountbalance" +
      "         WHERE c_empworktimeaccountbalance.C_Empworktimeaccountbalance_ID = ? ";

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
      "          FROM c_empworktimeaccountbalance" +
      "         WHERE c_empworktimeaccountbalance.C_Empworktimeaccountbalance_ID = ? ";

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
