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
class ImportLogF916CA81AE464532B2298E4E68DA2389Data implements FieldProvider {
static Logger log4j = Logger.getLogger(ImportLogF916CA81AE464532B2298E4E68DA2389Data.class);
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
  public String qty;
  public String executionstatus;
  public String adClientId;
  public String seqno;
  public String zseShopimportlogId;
  public String adOrgId;
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
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("executionstatus"))
      return executionstatus;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("seqno"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("zse_shopimportlog_id") || fieldName.equals("zseShopimportlogId"))
      return zseShopimportlogId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
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
  public static ImportLogF916CA81AE464532B2298E4E68DA2389Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseShopId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseShopId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ImportLogF916CA81AE464532B2298E4E68DA2389Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseShopId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_shopimportlog.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shopimportlog.CreatedBy) as CreatedByR, " +
      "        to_char(zse_shopimportlog.Updated, ?) as updated, " +
      "        to_char(zse_shopimportlog.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_shopimportlog.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shopimportlog.UpdatedBy) as UpdatedByR," +
      "        zse_shopimportlog.ZSE_Shop_ID, " +
      "(CASE WHEN zse_shopimportlog.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "zse_shopimportlog.Item, " +
      "zse_shopimportlog.Qty, " +
      "zse_shopimportlog.Executionstatus, " +
      "zse_shopimportlog.AD_Client_ID, " +
      "zse_shopimportlog.Seqno, " +
      "zse_shopimportlog.ZSE_Shopimportlog_ID, " +
      "zse_shopimportlog.AD_Org_ID, " +
      "COALESCE(zse_shopimportlog.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_shopimportlog left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shopimportlog.ZSE_Shop_ID = table1.ZSE_Shop_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseShopId==null || zseShopId.equals(""))?"":"  AND zse_shopimportlog.ZSE_Shop_ID = ?  ");
    strSql = strSql + 
      "        AND zse_shopimportlog.ZSE_Shopimportlog_ID = ? " +
      "        AND zse_shopimportlog.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_shopimportlog.AD_Org_ID IN (";
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
        ImportLogF916CA81AE464532B2298E4E68DA2389Data objectImportLogF916CA81AE464532B2298E4E68DA2389Data = new ImportLogF916CA81AE464532B2298E4E68DA2389Data();
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.created = UtilSql.getValue(result, "created");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.updated = UtilSql.getValue(result, "updated");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.item = UtilSql.getValue(result, "item");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.qty = UtilSql.getValue(result, "qty");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.executionstatus = UtilSql.getValue(result, "executionstatus");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.seqno = UtilSql.getValue(result, "seqno");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.zseShopimportlogId = UtilSql.getValue(result, "zse_shopimportlog_id");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.isactive = UtilSql.getValue(result, "isactive");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.language = UtilSql.getValue(result, "language");
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.adUserClient = "";
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.adOrgClient = "";
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.createdby = "";
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.trBgcolor = "";
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.totalCount = "";
        objectImportLogF916CA81AE464532B2298E4E68DA2389Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectImportLogF916CA81AE464532B2298E4E68DA2389Data);
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
    ImportLogF916CA81AE464532B2298E4E68DA2389Data objectImportLogF916CA81AE464532B2298E4E68DA2389Data[] = new ImportLogF916CA81AE464532B2298E4E68DA2389Data[vector.size()];
    vector.copyInto(objectImportLogF916CA81AE464532B2298E4E68DA2389Data);
    return(objectImportLogF916CA81AE464532B2298E4E68DA2389Data);
  }

/**
Create a registry
 */
  public static ImportLogF916CA81AE464532B2298E4E68DA2389Data[] set(String zseShopId, String executionstatus, String adClientId, String seqno, String qty, String adOrgId, String zseShopimportlogId, String updatedby, String updatedbyr, String item, String createdby, String createdbyr, String isactive)    throws ServletException {
    ImportLogF916CA81AE464532B2298E4E68DA2389Data objectImportLogF916CA81AE464532B2298E4E68DA2389Data[] = new ImportLogF916CA81AE464532B2298E4E68DA2389Data[1];
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0] = new ImportLogF916CA81AE464532B2298E4E68DA2389Data();
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].created = "";
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].createdbyr = createdbyr;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].updated = "";
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].updatedTimeStamp = "";
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].updatedby = updatedby;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].updatedbyr = updatedbyr;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].zseShopId = zseShopId;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].zseShopIdr = "";
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].item = item;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].qty = qty;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].executionstatus = executionstatus;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].adClientId = adClientId;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].seqno = seqno;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].zseShopimportlogId = zseShopimportlogId;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].adOrgId = adOrgId;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].isactive = isactive;
    objectImportLogF916CA81AE464532B2298E4E68DA2389Data[0].language = "";
    return objectImportLogF916CA81AE464532B2298E4E68DA2389Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefB53EA5DC8F474774A0D4C9871B7C789B_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDefDF140411DE454983A0E9D98D84E3332B_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        SELECT zse_shopimportlog.ZSE_Shop_ID AS NAME" +
      "        FROM zse_shopimportlog" +
      "        WHERE zse_shopimportlog.ZSE_Shopimportlog_ID = ?";

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
      "        UPDATE zse_shopimportlog" +
      "        SET ZSE_Shop_ID = (?) , Item = (?) , Qty = TO_NUMBER(?) , Executionstatus = (?) , AD_Client_ID = (?) , Seqno = TO_NUMBER(?) , ZSE_Shopimportlog_ID = (?) , AD_Org_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_shopimportlog.ZSE_Shopimportlog_ID = ? " +
      "                 AND zse_shopimportlog.ZSE_Shop_ID = ? " +
      "        AND zse_shopimportlog.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shopimportlog.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, executionstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopimportlogId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopimportlogId);
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
      "        INSERT INTO zse_shopimportlog " +
      "        (ZSE_Shop_ID, Item, Qty, Executionstatus, AD_Client_ID, Seqno, ZSE_Shopimportlog_ID, AD_Org_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, item);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, executionstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopimportlogId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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
      "        DELETE FROM zse_shopimportlog" +
      "        WHERE zse_shopimportlog.ZSE_Shopimportlog_ID = ? " +
      "                 AND zse_shopimportlog.ZSE_Shop_ID = ? " +
      "        AND zse_shopimportlog.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shopimportlog.AD_Org_ID IN (";
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
      "        DELETE FROM zse_shopimportlog" +
      "        WHERE zse_shopimportlog.ZSE_Shopimportlog_ID = ? " +
      "                 AND zse_shopimportlog.ZSE_Shop_ID = ? ";

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
      "          FROM zse_shopimportlog" +
      "         WHERE zse_shopimportlog.ZSE_Shopimportlog_ID = ? ";

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
      "          FROM zse_shopimportlog" +
      "         WHERE zse_shopimportlog.ZSE_Shopimportlog_ID = ? ";

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
