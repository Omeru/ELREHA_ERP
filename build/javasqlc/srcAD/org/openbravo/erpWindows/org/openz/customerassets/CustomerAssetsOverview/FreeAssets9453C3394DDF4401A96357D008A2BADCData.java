//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openz.customerassets.CustomerAssetsOverview;

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
class FreeAssets9453C3394DDF4401A96357D008A2BADCData implements FieldProvider {
static Logger log4j = Logger.getLogger(FreeAssets9453C3394DDF4401A96357D008A2BADCData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String mProductId;
  public String mProductIdr;
  public String serialnumber;
  public String mLocatorId;
  public String mLocatorIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String isactive;
  public String caFreeassetsVId;
  public String adClientId;
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
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("serialnumber"))
      return serialnumber;
    else if (fieldName.equalsIgnoreCase("m_locator_id") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("m_locator_idr") || fieldName.equals("mLocatorIdr"))
      return mLocatorIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ca_freeassets_v_id") || fieldName.equals("caFreeassetsVId"))
      return caFreeassetsVId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
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
  public static FreeAssets9453C3394DDF4401A96357D008A2BADCData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static FreeAssets9453C3394DDF4401A96357D008A2BADCData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(ca_freeassets_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ca_freeassets_v.CreatedBy) as CreatedByR, " +
      "        to_char(ca_freeassets_v.Updated, ?) as updated, " +
      "        to_char(ca_freeassets_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        ca_freeassets_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ca_freeassets_v.UpdatedBy) as UpdatedByR," +
      "        ca_freeassets_v.M_Product_ID, " +
      "(CASE WHEN ca_freeassets_v.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "ca_freeassets_v.Serialnumber, " +
      "ca_freeassets_v.M_Locator_ID, " +
      "(CASE WHEN ca_freeassets_v.M_Locator_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'') ) END) AS M_Locator_IDR, " +
      "ca_freeassets_v.AD_Org_ID, " +
      "(CASE WHEN ca_freeassets_v.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "COALESCE(ca_freeassets_v.Isactive, 'N') AS Isactive, " +
      "ca_freeassets_v.CA_Freeassets_V_ID, " +
      "ca_freeassets_v.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM ca_freeassets_v left join (select M_Product_ID, Value, Name from M_Product) table1 on (ca_freeassets_v.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select M_Locator_ID, Value from M_Locator) table2 on (ca_freeassets_v.M_Locator_ID = table2.M_Locator_ID) left join (select AD_Org_ID, Name from AD_Org) table3 on (ca_freeassets_v.AD_Org_ID = table3.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND ca_freeassets_v.CA_Freeassets_V_ID = ? " +
      "        AND ca_freeassets_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND ca_freeassets_v.AD_Org_ID IN (";
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
        FreeAssets9453C3394DDF4401A96357D008A2BADCData objectFreeAssets9453C3394DDF4401A96357D008A2BADCData = new FreeAssets9453C3394DDF4401A96357D008A2BADCData();
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.created = UtilSql.getValue(result, "created");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.updated = UtilSql.getValue(result, "updated");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.updatedby = UtilSql.getValue(result, "updatedby");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.serialnumber = UtilSql.getValue(result, "serialnumber");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.mLocatorId = UtilSql.getValue(result, "m_locator_id");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.mLocatorIdr = UtilSql.getValue(result, "m_locator_idr");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.isactive = UtilSql.getValue(result, "isactive");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.caFreeassetsVId = UtilSql.getValue(result, "ca_freeassets_v_id");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.language = UtilSql.getValue(result, "language");
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.adUserClient = "";
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.adOrgClient = "";
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.createdby = "";
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.trBgcolor = "";
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.totalCount = "";
        objectFreeAssets9453C3394DDF4401A96357D008A2BADCData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFreeAssets9453C3394DDF4401A96357D008A2BADCData);
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
    FreeAssets9453C3394DDF4401A96357D008A2BADCData objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[] = new FreeAssets9453C3394DDF4401A96357D008A2BADCData[vector.size()];
    vector.copyInto(objectFreeAssets9453C3394DDF4401A96357D008A2BADCData);
    return(objectFreeAssets9453C3394DDF4401A96357D008A2BADCData);
  }

/**
Create a registry
 */
  public static FreeAssets9453C3394DDF4401A96357D008A2BADCData[] set(String isactive, String createdby, String createdbyr, String adOrgId, String mProductId, String mProductIdr, String adClientId, String caFreeassetsVId, String mLocatorId, String mLocatorIdr, String serialnumber, String updatedby, String updatedbyr)    throws ServletException {
    FreeAssets9453C3394DDF4401A96357D008A2BADCData objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[] = new FreeAssets9453C3394DDF4401A96357D008A2BADCData[1];
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0] = new FreeAssets9453C3394DDF4401A96357D008A2BADCData();
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].created = "";
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].createdbyr = createdbyr;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].updated = "";
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].updatedTimeStamp = "";
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].updatedby = updatedby;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].updatedbyr = updatedbyr;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].mProductId = mProductId;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].mProductIdr = mProductIdr;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].serialnumber = serialnumber;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].mLocatorId = mLocatorId;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].mLocatorIdr = mLocatorIdr;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].adOrgId = adOrgId;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].adOrgIdr = "";
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].isactive = isactive;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].caFreeassetsVId = caFreeassetsVId;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].adClientId = adClientId;
    objectFreeAssets9453C3394DDF4401A96357D008A2BADCData[0].language = "";
    return objectFreeAssets9453C3394DDF4401A96357D008A2BADCData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef040D2FAB13E8407588564FB0D90C33D0_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefF62A07D952A24FC5AFE5E415DFA856D3_1(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef83868AB2B1784EBCA51877582048776B_2(ConnectionProvider connectionProvider, String M_Locator_IDR)    throws ServletException {
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
  public static String selectDefB525E149AFCF49C19F00E797B4AA7CEC_3(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE ca_freeassets_v" +
      "        SET M_Product_ID = (?) , Serialnumber = (?) , M_Locator_ID = (?) , AD_Org_ID = (?) , Isactive = (?) , CA_Freeassets_V_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE ca_freeassets_v.CA_Freeassets_V_ID = ? " +
      "        AND ca_freeassets_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ca_freeassets_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serialnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caFreeassetsVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caFreeassetsVId);
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
      "        INSERT INTO ca_freeassets_v " +
      "        (M_Product_ID, Serialnumber, M_Locator_ID, AD_Org_ID, Isactive, CA_Freeassets_V_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serialnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caFreeassetsVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
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
      "        DELETE FROM ca_freeassets_v" +
      "        WHERE ca_freeassets_v.CA_Freeassets_V_ID = ? " +
      "        AND ca_freeassets_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ca_freeassets_v.AD_Org_ID IN (";
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
      "        DELETE FROM ca_freeassets_v" +
      "        WHERE ca_freeassets_v.CA_Freeassets_V_ID = ? ";

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
      "          FROM ca_freeassets_v" +
      "         WHERE ca_freeassets_v.CA_Freeassets_V_ID = ? ";

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
      "          FROM ca_freeassets_v" +
      "         WHERE ca_freeassets_v.CA_Freeassets_V_ID = ? ";

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
