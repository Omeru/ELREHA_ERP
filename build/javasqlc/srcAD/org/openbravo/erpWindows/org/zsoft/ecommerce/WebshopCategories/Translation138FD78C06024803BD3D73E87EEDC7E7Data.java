//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.ecommerce.WebshopCategories;

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
class Translation138FD78C06024803BD3D73E87EEDC7E7Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Translation138FD78C06024803BD3D73E87EEDC7E7Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseWebshopcategoryId;
  public String zseWebshopcategoryIdr;
  public String adLanguage;
  public String adLanguager;
  public String content;
  public String title;
  public String fulltitle;
  public String description;
  public String isactive;
  public String zseWebshopcategoryTrlId;
  public String adOrgId;
  public String adClientId;
  public String istranslated;
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
    else if (fieldName.equalsIgnoreCase("zse_webshopcategory_id") || fieldName.equals("zseWebshopcategoryId"))
      return zseWebshopcategoryId;
    else if (fieldName.equalsIgnoreCase("zse_webshopcategory_idr") || fieldName.equals("zseWebshopcategoryIdr"))
      return zseWebshopcategoryIdr;
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
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("zse_webshopcategory_trl_id") || fieldName.equals("zseWebshopcategoryTrlId"))
      return zseWebshopcategoryTrlId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("istranslated"))
      return istranslated;
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
  public static Translation138FD78C06024803BD3D73E87EEDC7E7Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseWebshopcategoryId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseWebshopcategoryId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Translation138FD78C06024803BD3D73E87EEDC7E7Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseWebshopcategoryId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_webshopcategory_trl.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_webshopcategory_trl.CreatedBy) as CreatedByR, " +
      "        to_char(zse_webshopcategory_trl.Updated, ?) as updated, " +
      "        to_char(zse_webshopcategory_trl.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_webshopcategory_trl.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_webshopcategory_trl.UpdatedBy) as UpdatedByR," +
      "        zse_webshopcategory_trl.ZSE_Webshopcategory_ID, " +
      "(CASE WHEN zse_webshopcategory_trl.ZSE_Webshopcategory_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Title IS NULL THEN TO_CHAR(table1.Title) ELSE TO_CHAR(tableTRL2.Title) END)), ''))),'') ) END) AS ZSE_Webshopcategory_IDR, " +
      "zse_webshopcategory_trl.AD_Language, " +
      "(CASE WHEN zse_webshopcategory_trl.AD_Language IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS AD_LanguageR, " +
      "zse_webshopcategory_trl.Content, " +
      "zse_webshopcategory_trl.Title, " +
      "zse_webshopcategory_trl.Fulltitle, " +
      "zse_webshopcategory_trl.Description, " +
      "COALESCE(zse_webshopcategory_trl.Isactive, 'N') AS Isactive, " +
      "zse_webshopcategory_trl.ZSE_Webshopcategory_Trl_ID, " +
      "zse_webshopcategory_trl.AD_Org_ID, " +
      "zse_webshopcategory_trl.AD_Client_ID, " +
      "COALESCE(zse_webshopcategory_trl.Istranslated, 'N') AS Istranslated, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_webshopcategory_trl left join (select ZSE_Webshopcategory_ID, ZSE_Shop_ID, Title from ZSE_Webshopcategory) table1 on (zse_webshopcategory_trl.ZSE_Webshopcategory_ID = table1.ZSE_Webshopcategory_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join (select ZSE_Webshopcategory_ID,AD_Language, Title from zse_webshopcategory_TRL) tableTRL2 on (table1.ZSE_Webshopcategory_ID = tableTRL2.ZSE_Webshopcategory_ID and tableTRL2.AD_Language = ?)  left join (select AD_Language, Name from AD_Language) table3 on (zse_webshopcategory_trl.AD_Language =  table3.AD_Language)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseWebshopcategoryId==null || zseWebshopcategoryId.equals(""))?"":"  AND zse_webshopcategory_trl.ZSE_Webshopcategory_ID = ?  ");
    strSql = strSql + 
      "        AND zse_webshopcategory_trl.ZSE_Webshopcategory_Trl_ID = ? " +
      "        AND zse_webshopcategory_trl.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_webshopcategory_trl.AD_Org_ID IN (";
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
      if (zseWebshopcategoryId != null && !(zseWebshopcategoryId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);
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
        Translation138FD78C06024803BD3D73E87EEDC7E7Data objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data = new Translation138FD78C06024803BD3D73E87EEDC7E7Data();
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.created = UtilSql.getValue(result, "created");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.updated = UtilSql.getValue(result, "updated");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.zseWebshopcategoryId = UtilSql.getValue(result, "zse_webshopcategory_id");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.zseWebshopcategoryIdr = UtilSql.getValue(result, "zse_webshopcategory_idr");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.adLanguage = UtilSql.getValue(result, "ad_language");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.adLanguager = UtilSql.getValue(result, "ad_languager");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.content = UtilSql.getValue(result, "content");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.title = UtilSql.getValue(result, "title");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.fulltitle = UtilSql.getValue(result, "fulltitle");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.description = UtilSql.getValue(result, "description");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.isactive = UtilSql.getValue(result, "isactive");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.zseWebshopcategoryTrlId = UtilSql.getValue(result, "zse_webshopcategory_trl_id");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.istranslated = UtilSql.getValue(result, "istranslated");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.language = UtilSql.getValue(result, "language");
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.adUserClient = "";
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.adOrgClient = "";
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.createdby = "";
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.trBgcolor = "";
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.totalCount = "";
        objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data);
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
    Translation138FD78C06024803BD3D73E87EEDC7E7Data objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[] = new Translation138FD78C06024803BD3D73E87EEDC7E7Data[vector.size()];
    vector.copyInto(objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data);
    return(objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data);
  }

/**
Create a registry
 */
  public static Translation138FD78C06024803BD3D73E87EEDC7E7Data[] set(String zseWebshopcategoryId, String fulltitle, String createdby, String createdbyr, String adOrgId, String updatedby, String updatedbyr, String isactive, String description, String title, String content, String zseWebshopcategoryTrlId, String istranslated, String adLanguage, String adClientId)    throws ServletException {
    Translation138FD78C06024803BD3D73E87EEDC7E7Data objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[] = new Translation138FD78C06024803BD3D73E87EEDC7E7Data[1];
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0] = new Translation138FD78C06024803BD3D73E87EEDC7E7Data();
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].created = "";
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].createdbyr = createdbyr;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].updated = "";
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].updatedTimeStamp = "";
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].updatedby = updatedby;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].updatedbyr = updatedbyr;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].zseWebshopcategoryId = zseWebshopcategoryId;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].zseWebshopcategoryIdr = "";
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].adLanguage = adLanguage;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].adLanguager = "";
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].content = content;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].title = title;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].fulltitle = fulltitle;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].description = description;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].isactive = isactive;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].zseWebshopcategoryTrlId = zseWebshopcategoryTrlId;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].adOrgId = adOrgId;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].adClientId = adClientId;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].istranslated = istranslated;
    objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data[0].language = "";
    return objectTranslation138FD78C06024803BD3D73E87EEDC7E7Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef3625CBD07FE6465F812677C899C10D1D_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef3F173ED4508946788D0BAD7F5F916330_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        SELECT zse_webshopcategory_trl.ZSE_Webshopcategory_ID AS NAME" +
      "        FROM zse_webshopcategory_trl" +
      "        WHERE zse_webshopcategory_trl.ZSE_Webshopcategory_Trl_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String paramLanguage, String zseWebshopcategoryId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Title IS NULL THEN TO_CHAR(table1.Title) ELSE TO_CHAR(tableTRL2.Title) END)), ''))) AS NAME FROM zse_webshopcategory left join (select ZSE_Webshopcategory_ID, ZSE_Shop_ID, Title from ZSE_Webshopcategory) table1 on (zse_webshopcategory.ZSE_Webshopcategory_ID = table1.ZSE_Webshopcategory_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join (select ZSE_Webshopcategory_ID,AD_Language, Title from zse_webshopcategory_TRL) tableTRL2 on (table1.ZSE_Webshopcategory_ID = tableTRL2.ZSE_Webshopcategory_ID and tableTRL2.AD_Language = ?)  WHERE zse_webshopcategory.ZSE_Webshopcategory_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String paramLanguage, String zseWebshopcategoryId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Title IS NULL THEN TO_CHAR(table1.Title) ELSE TO_CHAR(tableTRL2.Title) END)), ''))) AS NAME FROM zse_webshopcategory left join (select ZSE_Webshopcategory_ID, ZSE_Shop_ID, Title from ZSE_Webshopcategory) table1 on (zse_webshopcategory.ZSE_Webshopcategory_ID = table1.ZSE_Webshopcategory_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join (select ZSE_Webshopcategory_ID,AD_Language, Title from zse_webshopcategory_TRL) tableTRL2 on (table1.ZSE_Webshopcategory_ID = tableTRL2.ZSE_Webshopcategory_ID and tableTRL2.AD_Language = ?)  WHERE zse_webshopcategory.ZSE_Webshopcategory_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);

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
      "        UPDATE zse_webshopcategory_trl" +
      "        SET ZSE_Webshopcategory_ID = (?) , AD_Language = (?) , Content = (?) , Title = (?) , Fulltitle = (?) , Description = (?) , Isactive = (?) , ZSE_Webshopcategory_Trl_ID = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , Istranslated = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_webshopcategory_trl.ZSE_Webshopcategory_Trl_ID = ? " +
      "                 AND zse_webshopcategory_trl.ZSE_Webshopcategory_ID = ? " +
      "        AND zse_webshopcategory_trl.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_webshopcategory_trl.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, content);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fulltitle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryTrlId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istranslated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryTrlId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);
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
      "        INSERT INTO zse_webshopcategory_trl " +
      "        (ZSE_Webshopcategory_ID, AD_Language, Content, Title, Fulltitle, Description, Isactive, ZSE_Webshopcategory_Trl_ID, AD_Org_ID, AD_Client_ID, Istranslated, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, content);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fulltitle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryTrlId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istranslated);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String zseWebshopcategoryId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_webshopcategory_trl" +
      "        WHERE zse_webshopcategory_trl.ZSE_Webshopcategory_Trl_ID = ? " +
      "                 AND zse_webshopcategory_trl.ZSE_Webshopcategory_ID = ? " +
      "        AND zse_webshopcategory_trl.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_webshopcategory_trl.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String zseWebshopcategoryId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_webshopcategory_trl" +
      "        WHERE zse_webshopcategory_trl.ZSE_Webshopcategory_Trl_ID = ? " +
      "                 AND zse_webshopcategory_trl.ZSE_Webshopcategory_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);

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
      "          FROM zse_webshopcategory_trl" +
      "         WHERE zse_webshopcategory_trl.ZSE_Webshopcategory_Trl_ID = ? ";

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
      "          FROM zse_webshopcategory_trl" +
      "         WHERE zse_webshopcategory_trl.ZSE_Webshopcategory_Trl_ID = ? ";

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
