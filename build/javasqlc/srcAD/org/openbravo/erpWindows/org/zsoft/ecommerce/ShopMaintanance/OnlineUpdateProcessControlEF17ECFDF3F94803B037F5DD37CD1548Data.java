//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.ecommerce.ShopMaintanance;

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
class OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data implements FieldProvider {
static Logger log4j = Logger.getLogger(OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseShopId;
  public String zseShopIdr;
  public String item;
  public String adOrgId;
  public String zseShopupdatelogId;
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
    else if (fieldName.equalsIgnoreCase("zse_shop_id") || fieldName.equals("zseShopId"))
      return zseShopId;
    else if (fieldName.equalsIgnoreCase("zse_shop_idr") || fieldName.equals("zseShopIdr"))
      return zseShopIdr;
    else if (fieldName.equalsIgnoreCase("item"))
      return item;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("zse_shopupdatelog_id") || fieldName.equals("zseShopupdatelogId"))
      return zseShopupdatelogId;
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
  public static OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseShopId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseShopId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseShopId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_shopupdatelog.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shopupdatelog.CreatedBy) as CreatedByR, " +
      "        to_char(zse_shopupdatelog.Updated, ?) as updated, " +
      "        to_char(zse_shopupdatelog.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_shopupdatelog.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shopupdatelog.UpdatedBy) as UpdatedByR," +
      "        zse_shopupdatelog.ZSE_Shop_ID, " +
      "(CASE WHEN zse_shopupdatelog.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "zse_shopupdatelog.Item, " +
      "zse_shopupdatelog.AD_Org_ID, " +
      "zse_shopupdatelog.ZSE_Shopupdatelog_ID, " +
      "zse_shopupdatelog.AD_Client_ID, " +
      "COALESCE(zse_shopupdatelog.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_shopupdatelog left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shopupdatelog.ZSE_Shop_ID = table1.ZSE_Shop_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseShopId==null || zseShopId.equals(""))?"":"  AND zse_shopupdatelog.ZSE_Shop_ID = ?  ");
    strSql = strSql + 
      "        AND zse_shopupdatelog.ZSE_Shopupdatelog_ID = ? " +
      "        AND zse_shopupdatelog.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_shopupdatelog.AD_Org_ID IN (";
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
      if (zseShopId != null && !(zseShopId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
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
        OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data = new OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data();
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.created = UtilSql.getValue(result, "created");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.updated = UtilSql.getValue(result, "updated");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.item = UtilSql.getValue(result, "item");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.zseShopupdatelogId = UtilSql.getValue(result, "zse_shopupdatelog_id");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.isactive = UtilSql.getValue(result, "isactive");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.language = UtilSql.getValue(result, "language");
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.adUserClient = "";
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.adOrgClient = "";
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.createdby = "";
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.trBgcolor = "";
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.totalCount = "";
        objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data);
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
    OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[] = new OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[vector.size()];
    vector.copyInto(objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data);
    return(objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data);
  }

/**
Create a registry
 */
  public static OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[] set(String zseShopId, String zseShopupdatelogId, String adClientId, String adOrgId, String isactive, String item, String updatedby, String updatedbyr, String createdby, String createdbyr)    throws ServletException {
    OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[] = new OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[1];
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0] = new OnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data();
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].created = "";
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].createdbyr = createdbyr;
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].updated = "";
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].updatedTimeStamp = "";
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].updatedby = updatedby;
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].updatedbyr = updatedbyr;
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].zseShopId = zseShopId;
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].zseShopIdr = "";
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].item = item;
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].adOrgId = adOrgId;
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].zseShopupdatelogId = zseShopupdatelogId;
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].adClientId = adClientId;
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].isactive = isactive;
    objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data[0].language = "";
    return objectOnlineUpdateProcessControlEF17ECFDF3F94803B037F5DD37CD1548Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef63611546C494428B9CF158F0CC31677D_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef49D70873E2414A199BD43ADE10226DB4_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        SELECT zse_shopupdatelog.ZSE_Shop_ID AS NAME" +
      "        FROM zse_shopupdatelog" +
      "        WHERE zse_shopupdatelog.ZSE_Shopupdatelog_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String zseShopId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))) AS NAME FROM zse_shop left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shop.ZSE_Shop_ID = table1.ZSE_Shop_ID) WHERE zse_shop.ZSE_Shop_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String zseShopId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))) AS NAME FROM zse_shop left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shop.ZSE_Shop_ID = table1.ZSE_Shop_ID) WHERE zse_shop.ZSE_Shop_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);

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
      "        UPDATE zse_shopupdatelog" +
      "        SET ZSE_Shop_ID = (?) , Item = (?) , AD_Org_ID = (?) , ZSE_Shopupdatelog_ID = (?) , AD_Client_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_shopupdatelog.ZSE_Shopupdatelog_ID = ? " +
      "                 AND zse_shopupdatelog.ZSE_Shop_ID = ? " +
      "        AND zse_shopupdatelog.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shopupdatelog.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, item);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopupdatelogId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopupdatelogId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
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
      "        INSERT INTO zse_shopupdatelog " +
      "        (ZSE_Shop_ID, Item, AD_Org_ID, ZSE_Shopupdatelog_ID, AD_Client_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, item);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopupdatelogId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String zseShopId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_shopupdatelog" +
      "        WHERE zse_shopupdatelog.ZSE_Shopupdatelog_ID = ? " +
      "                 AND zse_shopupdatelog.ZSE_Shop_ID = ? " +
      "        AND zse_shopupdatelog.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shopupdatelog.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String zseShopId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_shopupdatelog" +
      "        WHERE zse_shopupdatelog.ZSE_Shopupdatelog_ID = ? " +
      "                 AND zse_shopupdatelog.ZSE_Shop_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);

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
      "          FROM zse_shopupdatelog" +
      "         WHERE zse_shopupdatelog.ZSE_Shopupdatelog_ID = ? ";

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
      "          FROM zse_shopupdatelog" +
      "         WHERE zse_shopupdatelog.ZSE_Shopupdatelog_ID = ? ";

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
