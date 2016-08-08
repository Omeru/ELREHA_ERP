//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.serial.BatchNumberTracking;

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
class BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData implements FieldProvider {
static Logger log4j = Logger.getLogger(BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String snrBatchmasterdataId;
  public String snrBatchmasterdataIdr;
  public String mLocatorId;
  public String mLocatorIdr;
  public String qtyonhand;
  public String adOrgId;
  public String snrBatchlocatorId;
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
    else if (fieldName.equalsIgnoreCase("snr_batchmasterdata_id") || fieldName.equals("snrBatchmasterdataId"))
      return snrBatchmasterdataId;
    else if (fieldName.equalsIgnoreCase("snr_batchmasterdata_idr") || fieldName.equals("snrBatchmasterdataIdr"))
      return snrBatchmasterdataIdr;
    else if (fieldName.equalsIgnoreCase("m_locator_id") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("m_locator_idr") || fieldName.equals("mLocatorIdr"))
      return mLocatorIdr;
    else if (fieldName.equalsIgnoreCase("qtyonhand"))
      return qtyonhand;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("snr_batchlocator_id") || fieldName.equals("snrBatchlocatorId"))
      return snrBatchlocatorId;
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
  public static BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String snrBatchmasterdataId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, snrBatchmasterdataId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String snrBatchmasterdataId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(snr_batchlocator.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = snr_batchlocator.CreatedBy) as CreatedByR, " +
      "        to_char(snr_batchlocator.Updated, ?) as updated, " +
      "        to_char(snr_batchlocator.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        snr_batchlocator.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = snr_batchlocator.UpdatedBy) as UpdatedByR," +
      "        snr_batchlocator.SNR_Batchmasterdata_ID, " +
      "(CASE WHEN snr_batchlocator.SNR_Batchmasterdata_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Batchnumber), ''))),'') ) END) AS SNR_Batchmasterdata_IDR, " +
      "snr_batchlocator.M_Locator_ID, " +
      "(CASE WHEN snr_batchlocator.M_Locator_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'') ) END) AS M_Locator_IDR, " +
      "snr_batchlocator.Qtyonhand, " +
      "snr_batchlocator.AD_Org_ID, " +
      "snr_batchlocator.SNR_Batchlocator_ID, " +
      "snr_batchlocator.AD_Client_ID, " +
      "COALESCE(snr_batchlocator.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM snr_batchlocator left join (select SNR_Batchmasterdata_ID, Batchnumber from SNR_Batchmasterdata) table1 on (snr_batchlocator.SNR_Batchmasterdata_ID = table1.SNR_Batchmasterdata_ID) left join (select M_Locator_ID, Value from M_Locator) table2 on (snr_batchlocator.M_Locator_ID = table2.M_Locator_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((snrBatchmasterdataId==null || snrBatchmasterdataId.equals(""))?"":"  AND snr_batchlocator.SNR_Batchmasterdata_ID = ?  ");
    strSql = strSql + 
      "        AND snr_batchlocator.SNR_Batchlocator_ID = ? " +
      "        AND snr_batchlocator.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND snr_batchlocator.AD_Org_ID IN (";
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
      if (snrBatchmasterdataId != null && !(snrBatchmasterdataId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchmasterdataId);
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
        BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData = new BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData();
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.created = UtilSql.getValue(result, "created");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.updated = UtilSql.getValue(result, "updated");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.updatedby = UtilSql.getValue(result, "updatedby");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.snrBatchmasterdataId = UtilSql.getValue(result, "snr_batchmasterdata_id");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.snrBatchmasterdataIdr = UtilSql.getValue(result, "snr_batchmasterdata_idr");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.mLocatorId = UtilSql.getValue(result, "m_locator_id");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.mLocatorIdr = UtilSql.getValue(result, "m_locator_idr");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.qtyonhand = UtilSql.getValue(result, "qtyonhand");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.snrBatchlocatorId = UtilSql.getValue(result, "snr_batchlocator_id");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.isactive = UtilSql.getValue(result, "isactive");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.language = UtilSql.getValue(result, "language");
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.adUserClient = "";
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.adOrgClient = "";
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.createdby = "";
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.trBgcolor = "";
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.totalCount = "";
        objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData);
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
    BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[] = new BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[vector.size()];
    vector.copyInto(objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData);
    return(objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData);
  }

/**
Create a registry
 */
  public static BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[] set(String snrBatchmasterdataId, String isactive, String mLocatorId, String mLocatorIdr, String createdby, String createdbyr, String adOrgId, String updatedby, String updatedbyr, String adClientId, String snrBatchlocatorId, String qtyonhand)    throws ServletException {
    BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[] = new BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[1];
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0] = new BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData();
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].created = "";
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].createdbyr = createdbyr;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].updated = "";
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].updatedTimeStamp = "";
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].updatedby = updatedby;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].updatedbyr = updatedbyr;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].snrBatchmasterdataId = snrBatchmasterdataId;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].snrBatchmasterdataIdr = "";
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].mLocatorId = mLocatorId;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].mLocatorIdr = mLocatorIdr;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].qtyonhand = qtyonhand;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].adOrgId = adOrgId;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].snrBatchlocatorId = snrBatchlocatorId;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].adClientId = adClientId;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].isactive = isactive;
    objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0].language = "";
    return objectBatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef0ED5EDD107464B148E95A0B2CC383146_0(ConnectionProvider connectionProvider, String M_Locator_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Value), '') ) as M_Locator_ID FROM M_Locator table1 WHERE table1.isActive='Y' AND table1.M_Locator_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Locator_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_locator_id");
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
  public static String selectDef102E7DE30D8549CDB90095EE84360888_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefF82ABA00D7DA4886AF996BEE8F698643_2(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT snr_batchlocator.SNR_Batchmasterdata_ID AS NAME" +
      "        FROM snr_batchlocator" +
      "        WHERE snr_batchlocator.SNR_Batchlocator_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String snrBatchmasterdataId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Batchnumber), ''))) AS NAME FROM snr_batchmasterdata left join (select SNR_Batchmasterdata_ID, Batchnumber from SNR_Batchmasterdata) table1 on (snr_batchmasterdata.SNR_Batchmasterdata_ID = table1.SNR_Batchmasterdata_ID) WHERE snr_batchmasterdata.SNR_Batchmasterdata_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchmasterdataId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String snrBatchmasterdataId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Batchnumber), ''))) AS NAME FROM snr_batchmasterdata left join (select SNR_Batchmasterdata_ID, Batchnumber from SNR_Batchmasterdata) table1 on (snr_batchmasterdata.SNR_Batchmasterdata_ID = table1.SNR_Batchmasterdata_ID) WHERE snr_batchmasterdata.SNR_Batchmasterdata_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchmasterdataId);

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
      "        UPDATE snr_batchlocator" +
      "        SET SNR_Batchmasterdata_ID = (?) , M_Locator_ID = (?) , Qtyonhand = TO_NUMBER(?) , AD_Org_ID = (?) , SNR_Batchlocator_ID = (?) , AD_Client_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE snr_batchlocator.SNR_Batchlocator_ID = ? " +
      "                 AND snr_batchlocator.SNR_Batchmasterdata_ID = ? " +
      "        AND snr_batchlocator.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND snr_batchlocator.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchmasterdataId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyonhand);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchlocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchlocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchmasterdataId);
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
      "        INSERT INTO snr_batchlocator " +
      "        (SNR_Batchmasterdata_ID, M_Locator_ID, Qtyonhand, AD_Org_ID, SNR_Batchlocator_ID, AD_Client_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_NUMBER(?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchmasterdataId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyonhand);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchlocatorId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String snrBatchmasterdataId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM snr_batchlocator" +
      "        WHERE snr_batchlocator.SNR_Batchlocator_ID = ? " +
      "                 AND snr_batchlocator.SNR_Batchmasterdata_ID = ? " +
      "        AND snr_batchlocator.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND snr_batchlocator.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchmasterdataId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String snrBatchmasterdataId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM snr_batchlocator" +
      "        WHERE snr_batchlocator.SNR_Batchlocator_ID = ? " +
      "                 AND snr_batchlocator.SNR_Batchmasterdata_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrBatchmasterdataId);

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
      "          FROM snr_batchlocator" +
      "         WHERE snr_batchlocator.SNR_Batchlocator_ID = ? ";

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
      "          FROM snr_batchlocator" +
      "         WHERE snr_batchlocator.SNR_Batchlocator_ID = ? ";

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
