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
class ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data implements FieldProvider {
static Logger log4j = Logger.getLogger(ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.class);
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
  public String url;
  public String api;
  public String apir;
  public String apikey;
  public String secret;
  public String adUserId;
  public String adUserIdr;
  public String adLanguage;
  public String adLanguager;
  public String isactive;
  public String isoderactive;
  public String initorderdays;
  public String deletesecurity;
  public String isstockactive;
  public String zseShopId;
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
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("url"))
      return url;
    else if (fieldName.equalsIgnoreCase("api"))
      return api;
    else if (fieldName.equalsIgnoreCase("apir"))
      return apir;
    else if (fieldName.equalsIgnoreCase("apikey"))
      return apikey;
    else if (fieldName.equalsIgnoreCase("secret"))
      return secret;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("ad_user_idr") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("ad_language") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("ad_languager") || fieldName.equals("adLanguager"))
      return adLanguager;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("isoderactive"))
      return isoderactive;
    else if (fieldName.equalsIgnoreCase("initorderdays"))
      return initorderdays;
    else if (fieldName.equalsIgnoreCase("deletesecurity"))
      return deletesecurity;
    else if (fieldName.equalsIgnoreCase("isstockactive"))
      return isstockactive;
    else if (fieldName.equalsIgnoreCase("zse_shop_id") || fieldName.equals("zseShopId"))
      return zseShopId;
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
  public static ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_shop.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shop.CreatedBy) as CreatedByR, " +
      "        to_char(zse_shop.Updated, ?) as updated, " +
      "        to_char(zse_shop.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_shop.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shop.UpdatedBy) as UpdatedByR," +
      "        zse_shop.AD_Org_ID, " +
      "(CASE WHEN zse_shop.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "zse_shop.Value, " +
      "zse_shop.Url, " +
      "zse_shop.Api, " +
      "(CASE WHEN zse_shop.Api IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS ApiR, " +
      "zse_shop.Apikey, " +
      "zse_shop.Secret, " +
      "zse_shop.AD_User_ID, " +
      "(CASE WHEN zse_shop.AD_User_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "zse_shop.AD_Language, " +
      "(CASE WHEN zse_shop.AD_Language IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS AD_LanguageR, " +
      "COALESCE(zse_shop.Isactive, 'N') AS Isactive, " +
      "COALESCE(zse_shop.Isoderactive, 'N') AS Isoderactive, " +
      "zse_shop.Initorderdays, " +
      "zse_shop.Deletesecurity, " +
      "COALESCE(zse_shop.Isstockactive, 'N') AS Isstockactive, " +
      "zse_shop.ZSE_Shop_ID, " +
      "zse_shop.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_shop left join (select AD_Org_ID, Name from AD_Org) table1 on (zse_shop.AD_Org_ID = table1.AD_Org_ID) left join ad_ref_list_v list1 on (zse_shop.Api = list1.value and list1.ad_reference_id = '13AAD31150034E92B64D3CD86D25440C' and list1.ad_language = ?)  left join (select AD_User_ID, Name from AD_User) table2 on (zse_shop.AD_User_ID =  table2.AD_User_ID) left join (select AD_Language, Name from AD_Language) table3 on (zse_shop.AD_Language =  table3.AD_Language)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND zse_shop.ZSE_Shop_ID = ? " +
      "        AND zse_shop.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_shop.AD_Org_ID IN (";
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
        ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data = new ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data();
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.created = UtilSql.getValue(result, "created");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.updated = UtilSql.getValue(result, "updated");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.value = UtilSql.getValue(result, "value");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.url = UtilSql.getValue(result, "url");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.api = UtilSql.getValue(result, "api");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.apir = UtilSql.getValue(result, "apir");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.apikey = UtilSql.getValue(result, "apikey");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.secret = UtilSql.getValue(result, "secret");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.adUserIdr = UtilSql.getValue(result, "ad_user_idr");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.adLanguage = UtilSql.getValue(result, "ad_language");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.adLanguager = UtilSql.getValue(result, "ad_languager");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.isactive = UtilSql.getValue(result, "isactive");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.isoderactive = UtilSql.getValue(result, "isoderactive");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.initorderdays = UtilSql.getValue(result, "initorderdays");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.deletesecurity = UtilSql.getValue(result, "deletesecurity");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.isstockactive = UtilSql.getValue(result, "isstockactive");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.language = UtilSql.getValue(result, "language");
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.adUserClient = "";
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.adOrgClient = "";
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.createdby = "";
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.trBgcolor = "";
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.totalCount = "";
        objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data);
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
    ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[] = new ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[vector.size()];
    vector.copyInto(objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data);
    return(objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data);
  }

/**
Create a registry
 */
  public static ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[] set(String api, String adOrgId, String isstockactive, String apikey, String initorderdays, String updatedby, String updatedbyr, String adUserId, String zseShopId, String isoderactive, String isactive, String url, String adClientId, String adLanguage, String createdby, String createdbyr, String secret, String deletesecurity, String value)    throws ServletException {
    ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[] = new ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[1];
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0] = new ShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data();
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].created = "";
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].createdbyr = createdbyr;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].updated = "";
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].updatedTimeStamp = "";
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].updatedby = updatedby;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].updatedbyr = updatedbyr;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].adOrgId = adOrgId;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].adOrgIdr = "";
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].value = value;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].url = url;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].api = api;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].apir = "";
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].apikey = apikey;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].secret = secret;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].adUserId = adUserId;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].adUserIdr = "";
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].adLanguage = adLanguage;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].adLanguager = "";
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].isactive = isactive;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].isoderactive = isoderactive;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].initorderdays = initorderdays;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].deletesecurity = deletesecurity;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].isstockactive = isstockactive;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].zseShopId = zseShopId;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].adClientId = adClientId;
    objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data[0].language = "";
    return objectShopSystems41A4B02E63A24CADAB580ECEE223D4F6Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefE9C9937F834F43F18BB8C5227E96A3F2_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef4CE9B88A981845ABA18D64FAF89633F1_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        UPDATE zse_shop" +
      "        SET AD_Org_ID = (?) , Value = (?) , Url = (?) , Api = (?) , Apikey = (?) , Secret = (?) , AD_User_ID = (?) , AD_Language = (?) , Isactive = (?) , Isoderactive = (?) , Initorderdays = TO_NUMBER(?) , Deletesecurity = TO_NUMBER(?) , Isstockactive = (?) , ZSE_Shop_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_shop.ZSE_Shop_ID = ? " +
      "        AND zse_shop.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shop.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, api);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, apikey);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, secret);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isoderactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, initorderdays);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deletesecurity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstockactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
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
      "        INSERT INTO zse_shop " +
      "        (AD_Org_ID, Value, Url, Api, Apikey, Secret, AD_User_ID, AD_Language, Isactive, Isoderactive, Initorderdays, Deletesecurity, Isstockactive, ZSE_Shop_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, api);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, apikey);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, secret);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isoderactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, initorderdays);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deletesecurity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstockactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
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
      "        DELETE FROM zse_shop" +
      "        WHERE zse_shop.ZSE_Shop_ID = ? " +
      "        AND zse_shop.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shop.AD_Org_ID IN (";
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
      "        DELETE FROM zse_shop" +
      "        WHERE zse_shop.ZSE_Shop_ID = ? ";

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
      "          FROM zse_shop" +
      "         WHERE zse_shop.ZSE_Shop_ID = ? ";

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
      "          FROM zse_shop" +
      "         WHERE zse_shop.ZSE_Shop_ID = ? ";

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
