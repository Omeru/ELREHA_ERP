//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.ecommerce.ShopProductSettings;

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
class TranslationA633941E42A74889BCF38403E7EB5889Data implements FieldProvider {
static Logger log4j = Logger.getLogger(TranslationA633941E42A74889BCF38403E7EB5889Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseProductShopId;
  public String zseProductShopIdr;
  public String adLanguage;
  public String adLanguager;
  public String content;
  public String title;
  public String fulltitle;
  public String description;
  public String adOrgId;
  public String istranslated;
  public String zseProductShopTrlId;
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
    else if (fieldName.equalsIgnoreCase("zse_product_shop_id") || fieldName.equals("zseProductShopId"))
      return zseProductShopId;
    else if (fieldName.equalsIgnoreCase("zse_product_shop_idr") || fieldName.equals("zseProductShopIdr"))
      return zseProductShopIdr;
    else if (fieldName.equalsIgnoreCase("ad_language") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("ad_languager") || fieldName.equals("adLanguager"))
      return adLanguager;
    else if (fieldName.equalsIgnoreCase("content"))
      return content;
    else if (fieldName.equalsIgnoreCase("title"))
      return title;
    else if (fieldName.equalsIgnoreCase("fulltitle"))
      return fulltitle;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("istranslated"))
      return istranslated;
    else if (fieldName.equalsIgnoreCase("zse_product_shop_trl_id") || fieldName.equals("zseProductShopTrlId"))
      return zseProductShopTrlId;
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
  public static TranslationA633941E42A74889BCF38403E7EB5889Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseProductShopId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseProductShopId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static TranslationA633941E42A74889BCF38403E7EB5889Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseProductShopId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_product_shop_trl.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_product_shop_trl.CreatedBy) as CreatedByR, " +
      "        to_char(zse_product_shop_trl.Updated, ?) as updated, " +
      "        to_char(zse_product_shop_trl.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_product_shop_trl.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_product_shop_trl.UpdatedBy) as UpdatedByR," +
      "        zse_product_shop_trl.ZSE_Product_Shop_ID, " +
      "(CASE WHEN zse_product_shop_trl.ZSE_Product_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS ZSE_Product_Shop_IDR, " +
      "zse_product_shop_trl.AD_Language, " +
      "(CASE WHEN zse_product_shop_trl.AD_Language IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS AD_LanguageR, " +
      "zse_product_shop_trl.Content, " +
      "zse_product_shop_trl.Title, " +
      "zse_product_shop_trl.Fulltitle, " +
      "zse_product_shop_trl.Description, " +
      "zse_product_shop_trl.AD_Org_ID, " +
      "COALESCE(zse_product_shop_trl.Istranslated, 'N') AS Istranslated, " +
      "zse_product_shop_trl.ZSE_Product_Shop_Trl_ID, " +
      "zse_product_shop_trl.AD_Client_ID, " +
      "COALESCE(zse_product_shop_trl.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_product_shop_trl left join (select ZSE_Product_Shop_ID, ZSE_Shop_ID, M_Product_ID from ZSE_Product_Shop) table1 on (zse_product_shop_trl.ZSE_Product_Shop_ID = table1.ZSE_Product_Shop_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select AD_Language, Name from AD_Language) table4 on (zse_product_shop_trl.AD_Language =  table4.AD_Language)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseProductShopId==null || zseProductShopId.equals(""))?"":"  AND zse_product_shop_trl.ZSE_Product_Shop_ID = ?  ");
    strSql = strSql + 
      "        AND zse_product_shop_trl.ZSE_Product_Shop_Trl_ID = ? " +
      "        AND zse_product_shop_trl.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_product_shop_trl.AD_Org_ID IN (";
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
      if (zseProductShopId != null && !(zseProductShopId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
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
        TranslationA633941E42A74889BCF38403E7EB5889Data objectTranslationA633941E42A74889BCF38403E7EB5889Data = new TranslationA633941E42A74889BCF38403E7EB5889Data();
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.created = UtilSql.getValue(result, "created");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.updated = UtilSql.getValue(result, "updated");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.zseProductShopId = UtilSql.getValue(result, "zse_product_shop_id");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.zseProductShopIdr = UtilSql.getValue(result, "zse_product_shop_idr");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.adLanguage = UtilSql.getValue(result, "ad_language");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.adLanguager = UtilSql.getValue(result, "ad_languager");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.content = UtilSql.getValue(result, "content");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.title = UtilSql.getValue(result, "title");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.fulltitle = UtilSql.getValue(result, "fulltitle");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.description = UtilSql.getValue(result, "description");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.istranslated = UtilSql.getValue(result, "istranslated");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.zseProductShopTrlId = UtilSql.getValue(result, "zse_product_shop_trl_id");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.isactive = UtilSql.getValue(result, "isactive");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.language = UtilSql.getValue(result, "language");
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.adUserClient = "";
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.adOrgClient = "";
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.createdby = "";
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.trBgcolor = "";
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.totalCount = "";
        objectTranslationA633941E42A74889BCF38403E7EB5889Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTranslationA633941E42A74889BCF38403E7EB5889Data);
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
    TranslationA633941E42A74889BCF38403E7EB5889Data objectTranslationA633941E42A74889BCF38403E7EB5889Data[] = new TranslationA633941E42A74889BCF38403E7EB5889Data[vector.size()];
    vector.copyInto(objectTranslationA633941E42A74889BCF38403E7EB5889Data);
    return(objectTranslationA633941E42A74889BCF38403E7EB5889Data);
  }

/**
Create a registry
 */
  public static TranslationA633941E42A74889BCF38403E7EB5889Data[] set(String zseProductShopId, String adLanguage, String fulltitle, String isactive, String istranslated, String content, String adClientId, String description, String title, String adOrgId, String zseProductShopTrlId, String updatedby, String updatedbyr, String createdby, String createdbyr)    throws ServletException {
    TranslationA633941E42A74889BCF38403E7EB5889Data objectTranslationA633941E42A74889BCF38403E7EB5889Data[] = new TranslationA633941E42A74889BCF38403E7EB5889Data[1];
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0] = new TranslationA633941E42A74889BCF38403E7EB5889Data();
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].created = "";
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].createdbyr = createdbyr;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].updated = "";
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].updatedTimeStamp = "";
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].updatedby = updatedby;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].updatedbyr = updatedbyr;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].zseProductShopId = zseProductShopId;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].zseProductShopIdr = "";
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].adLanguage = adLanguage;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].adLanguager = "";
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].content = content;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].title = title;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].fulltitle = fulltitle;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].description = description;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].adOrgId = adOrgId;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].istranslated = istranslated;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].zseProductShopTrlId = zseProductShopTrlId;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].adClientId = adClientId;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].isactive = isactive;
    objectTranslationA633941E42A74889BCF38403E7EB5889Data[0].language = "";
    return objectTranslationA633941E42A74889BCF38403E7EB5889Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefB033F92AB65A498EB34CBBA53BD35B2E_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDefE08105C3FCFB46C2BDC73C7DE952B6E3_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        SELECT zse_product_shop_trl.ZSE_Product_Shop_ID AS NAME" +
      "        FROM zse_product_shop_trl" +
      "        WHERE zse_product_shop_trl.ZSE_Product_Shop_Trl_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String paramLanguage, String zseProductShopId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table3.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))) AS NAME FROM zse_product_shop left join (select ZSE_Product_Shop_ID, ZSE_Shop_ID, M_Product_ID from ZSE_Product_Shop) table1 on (zse_product_shop.ZSE_Product_Shop_ID = table1.ZSE_Product_Shop_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  WHERE zse_product_shop.ZSE_Product_Shop_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String paramLanguage, String zseProductShopId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table3.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))) AS NAME FROM zse_product_shop left join (select ZSE_Product_Shop_ID, ZSE_Shop_ID, M_Product_ID from ZSE_Product_Shop) table1 on (zse_product_shop.ZSE_Product_Shop_ID = table1.ZSE_Product_Shop_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  WHERE zse_product_shop.ZSE_Product_Shop_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);

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
      "        UPDATE zse_product_shop_trl" +
      "        SET ZSE_Product_Shop_ID = (?) , AD_Language = (?) , Content = (?) , Title = (?) , Fulltitle = (?) , Description = (?) , AD_Org_ID = (?) , Istranslated = (?) , ZSE_Product_Shop_Trl_ID = (?) , AD_Client_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_product_shop_trl.ZSE_Product_Shop_Trl_ID = ? " +
      "                 AND zse_product_shop_trl.ZSE_Product_Shop_ID = ? " +
      "        AND zse_product_shop_trl.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_product_shop_trl.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, content);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fulltitle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istranslated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopTrlId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopTrlId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
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
      "        INSERT INTO zse_product_shop_trl " +
      "        (ZSE_Product_Shop_ID, AD_Language, Content, Title, Fulltitle, Description, AD_Org_ID, Istranslated, ZSE_Product_Shop_Trl_ID, AD_Client_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, content);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fulltitle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istranslated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopTrlId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String zseProductShopId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_product_shop_trl" +
      "        WHERE zse_product_shop_trl.ZSE_Product_Shop_Trl_ID = ? " +
      "                 AND zse_product_shop_trl.ZSE_Product_Shop_ID = ? " +
      "        AND zse_product_shop_trl.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_product_shop_trl.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String zseProductShopId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_product_shop_trl" +
      "        WHERE zse_product_shop_trl.ZSE_Product_Shop_Trl_ID = ? " +
      "                 AND zse_product_shop_trl.ZSE_Product_Shop_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);

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
      "          FROM zse_product_shop_trl" +
      "         WHERE zse_product_shop_trl.ZSE_Product_Shop_Trl_ID = ? ";

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
      "          FROM zse_product_shop_trl" +
      "         WHERE zse_product_shop_trl.ZSE_Product_Shop_Trl_ID = ? ";

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
