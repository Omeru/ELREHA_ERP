//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.ecommerce.ECommerceErrors;

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
class ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data implements FieldProvider {
static Logger log4j = Logger.getLogger(ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseShopId;
  public String zseShopIdr;
  public String shopoderno;
  public String externalid;
  public String message;
  public String isactive;
  public String adOrgId;
  public String zseShopordererrorId;
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
    else if (fieldName.equalsIgnoreCase("zse_shop_id") || fieldName.equals("zseShopId"))
      return zseShopId;
    else if (fieldName.equalsIgnoreCase("zse_shop_idr") || fieldName.equals("zseShopIdr"))
      return zseShopIdr;
    else if (fieldName.equalsIgnoreCase("shopoderno"))
      return shopoderno;
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("message"))
      return message;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("zse_shopordererror_id") || fieldName.equals("zseShopordererrorId"))
      return zseShopordererrorId;
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
  public static ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_shopordererror.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shopordererror.CreatedBy) as CreatedByR, " +
      "        to_char(zse_shopordererror.Updated, ?) as updated, " +
      "        to_char(zse_shopordererror.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_shopordererror.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shopordererror.UpdatedBy) as UpdatedByR," +
      "        zse_shopordererror.ZSE_Shop_ID, " +
      "(CASE WHEN zse_shopordererror.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "zse_shopordererror.Shopoderno, " +
      "zse_shopordererror.Externalid, " +
      "zse_shopordererror.Message, " +
      "COALESCE(zse_shopordererror.Isactive, 'N') AS Isactive, " +
      "zse_shopordererror.AD_Org_ID, " +
      "zse_shopordererror.ZSE_Shopordererror_ID, " +
      "zse_shopordererror.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_shopordererror left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shopordererror.ZSE_Shop_ID = table1.ZSE_Shop_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND zse_shopordererror.ZSE_Shopordererror_ID = ? " +
      "        AND zse_shopordererror.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_shopordererror.AD_Org_ID IN (";
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
        ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data = new ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data();
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.created = UtilSql.getValue(result, "created");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.updated = UtilSql.getValue(result, "updated");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.shopoderno = UtilSql.getValue(result, "shopoderno");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.externalid = UtilSql.getValue(result, "externalid");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.message = UtilSql.getValue(result, "message");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.isactive = UtilSql.getValue(result, "isactive");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.zseShopordererrorId = UtilSql.getValue(result, "zse_shopordererror_id");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.language = UtilSql.getValue(result, "language");
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.adUserClient = "";
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.adOrgClient = "";
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.createdby = "";
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.trBgcolor = "";
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.totalCount = "";
        objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data);
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
    ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[] = new ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[vector.size()];
    vector.copyInto(objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data);
    return(objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data);
  }

/**
Create a registry
 */
  public static ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[] set(String zseShopordererrorId, String shopoderno, String zseShopId, String isactive, String adClientId, String externalid, String message, String updatedby, String updatedbyr, String createdby, String createdbyr, String adOrgId)    throws ServletException {
    ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[] = new ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[1];
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0] = new ECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data();
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].created = "";
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].createdbyr = createdbyr;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].updated = "";
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].updatedTimeStamp = "";
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].updatedby = updatedby;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].updatedbyr = updatedbyr;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].zseShopId = zseShopId;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].zseShopIdr = "";
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].shopoderno = shopoderno;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].externalid = externalid;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].message = message;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].isactive = isactive;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].adOrgId = adOrgId;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].zseShopordererrorId = zseShopordererrorId;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].adClientId = adClientId;
    objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data[0].language = "";
    return objectECommerceErrors5CD0E9CDE5904F9CBECB37606B78AB01Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef562EE2FCBB78498DB84A7158795D9E30_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef2BC668E8C7BA401F98716EF39E59DDE6_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE zse_shopordererror" +
      "        SET ZSE_Shop_ID = (?) , Shopoderno = (?) , Externalid = (?) , Message = (?) , Isactive = (?) , AD_Org_ID = (?) , ZSE_Shopordererror_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_shopordererror.ZSE_Shopordererror_ID = ? " +
      "        AND zse_shopordererror.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shopordererror.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopoderno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, message);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopordererrorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopordererrorId);
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
      "        INSERT INTO zse_shopordererror " +
      "        (ZSE_Shop_ID, Shopoderno, Externalid, Message, Isactive, AD_Org_ID, ZSE_Shopordererror_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopoderno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, message);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopordererrorId);
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
      "        DELETE FROM zse_shopordererror" +
      "        WHERE zse_shopordererror.ZSE_Shopordererror_ID = ? " +
      "        AND zse_shopordererror.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shopordererror.AD_Org_ID IN (";
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
      "        DELETE FROM zse_shopordererror" +
      "        WHERE zse_shopordererror.ZSE_Shopordererror_ID = ? ";

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
      "          FROM zse_shopordererror" +
      "         WHERE zse_shopordererror.ZSE_Shopordererror_ID = ? ";

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
      "          FROM zse_shopordererror" +
      "         WHERE zse_shopordererror.ZSE_Shopordererror_ID = ? ";

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
