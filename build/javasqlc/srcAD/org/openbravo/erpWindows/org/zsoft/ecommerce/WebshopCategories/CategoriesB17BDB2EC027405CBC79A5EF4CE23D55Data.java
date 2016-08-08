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
class CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data implements FieldProvider {
static Logger log4j = Logger.getLogger(CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String zseShopId;
  public String zseShopIdr;
  public String isactive;
  public String commonname;
  public String title;
  public String fulltitle;
  public String description;
  public String content;
  public String typ;
  public String sortorder;
  public String externalid;
  public String url;
  public String zseWebshopcategoryId;
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
    else if (fieldName.equalsIgnoreCase("zse_shop_id") || fieldName.equals("zseShopId"))
      return zseShopId;
    else if (fieldName.equalsIgnoreCase("zse_shop_idr") || fieldName.equals("zseShopIdr"))
      return zseShopIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("commonname"))
      return commonname;
    else if (fieldName.equalsIgnoreCase("title"))
      return title;
    else if (fieldName.equalsIgnoreCase("fulltitle"))
      return fulltitle;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("content"))
      return content;
    else if (fieldName.equalsIgnoreCase("typ"))
      return typ;
    else if (fieldName.equalsIgnoreCase("sortorder"))
      return sortorder;
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("url"))
      return url;
    else if (fieldName.equalsIgnoreCase("zse_webshopcategory_id") || fieldName.equals("zseWebshopcategoryId"))
      return zseWebshopcategoryId;
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
  public static CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_webshopcategory.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_webshopcategory.CreatedBy) as CreatedByR, " +
      "        to_char(zse_webshopcategory.Updated, ?) as updated, " +
      "        to_char(zse_webshopcategory.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_webshopcategory.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_webshopcategory.UpdatedBy) as UpdatedByR," +
      "        zse_webshopcategory.AD_Org_ID, " +
      "(CASE WHEN zse_webshopcategory.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "zse_webshopcategory.ZSE_Shop_ID, " +
      "(CASE WHEN zse_webshopcategory.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "COALESCE(zse_webshopcategory.Isactive, 'N') AS Isactive, " +
      "zse_webshopcategory.Commonname, " +
      "zse_webshopcategory.Title, " +
      "zse_webshopcategory.Fulltitle, " +
      "zse_webshopcategory.Description, " +
      "zse_webshopcategory.Content, " +
      "zse_webshopcategory.Typ, " +
      "zse_webshopcategory.Sortorder, " +
      "zse_webshopcategory.Externalid, " +
      "zse_webshopcategory.Url, " +
      "zse_webshopcategory.ZSE_Webshopcategory_ID, " +
      "zse_webshopcategory.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_webshopcategory left join (select AD_Org_ID, Name from AD_Org) table1 on (zse_webshopcategory.AD_Org_ID = table1.AD_Org_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (zse_webshopcategory.ZSE_Shop_ID = table2.ZSE_Shop_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND zse_webshopcategory.ZSE_Webshopcategory_ID = ? " +
      "        AND zse_webshopcategory.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_webshopcategory.AD_Org_ID IN (";
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
        CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data = new CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data();
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.created = UtilSql.getValue(result, "created");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.updated = UtilSql.getValue(result, "updated");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.isactive = UtilSql.getValue(result, "isactive");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.commonname = UtilSql.getValue(result, "commonname");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.title = UtilSql.getValue(result, "title");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.fulltitle = UtilSql.getValue(result, "fulltitle");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.description = UtilSql.getValue(result, "description");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.content = UtilSql.getValue(result, "content");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.typ = UtilSql.getValue(result, "typ");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.sortorder = UtilSql.getValue(result, "sortorder");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.externalid = UtilSql.getValue(result, "externalid");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.url = UtilSql.getValue(result, "url");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.zseWebshopcategoryId = UtilSql.getValue(result, "zse_webshopcategory_id");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.language = UtilSql.getValue(result, "language");
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.adUserClient = "";
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.adOrgClient = "";
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.createdby = "";
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.trBgcolor = "";
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.totalCount = "";
        objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data);
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
    CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[] = new CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[vector.size()];
    vector.copyInto(objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data);
    return(objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data);
  }

/**
Create a registry
 */
  public static CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[] set(String adClientId, String zseShopId, String description, String createdby, String createdbyr, String commonname, String zseWebshopcategoryId, String isactive, String title, String externalid, String url, String content, String updatedby, String updatedbyr, String sortorder, String typ, String adOrgId, String fulltitle)    throws ServletException {
    CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[] = new CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[1];
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0] = new CategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data();
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].created = "";
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].createdbyr = createdbyr;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].updated = "";
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].updatedTimeStamp = "";
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].updatedby = updatedby;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].updatedbyr = updatedbyr;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].adOrgId = adOrgId;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].adOrgIdr = "";
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].zseShopId = zseShopId;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].zseShopIdr = "";
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].isactive = isactive;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].commonname = commonname;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].title = title;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].fulltitle = fulltitle;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].description = description;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].content = content;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].typ = typ;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].sortorder = sortorder;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].externalid = externalid;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].url = url;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].zseWebshopcategoryId = zseWebshopcategoryId;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].adClientId = adClientId;
    objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data[0].language = "";
    return objectCategoriesB17BDB2EC027405CBC79A5EF4CE23D55Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefBAF4938AA9894C1596514393585C1B4D_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefBAA4B0704AC24D89A09528A10FF9F84E_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE zse_webshopcategory" +
      "        SET AD_Org_ID = (?) , ZSE_Shop_ID = (?) , Isactive = (?) , Commonname = (?) , Title = (?) , Fulltitle = (?) , Description = (?) , Content = (?) , Typ = (?) , Sortorder = TO_NUMBER(?) , Externalid = (?) , Url = (?) , ZSE_Webshopcategory_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_webshopcategory.ZSE_Webshopcategory_ID = ? " +
      "        AND zse_webshopcategory.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_webshopcategory.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, commonname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fulltitle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, content);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, typ);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sortorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
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
      "        INSERT INTO zse_webshopcategory " +
      "        (AD_Org_ID, ZSE_Shop_ID, Isactive, Commonname, Title, Fulltitle, Description, Content, Typ, Sortorder, Externalid, Url, ZSE_Webshopcategory_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, commonname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fulltitle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, content);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, typ);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sortorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseWebshopcategoryId);
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
      "        DELETE FROM zse_webshopcategory" +
      "        WHERE zse_webshopcategory.ZSE_Webshopcategory_ID = ? " +
      "        AND zse_webshopcategory.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_webshopcategory.AD_Org_ID IN (";
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
      "        DELETE FROM zse_webshopcategory" +
      "        WHERE zse_webshopcategory.ZSE_Webshopcategory_ID = ? ";

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
      "          FROM zse_webshopcategory" +
      "         WHERE zse_webshopcategory.ZSE_Webshopcategory_ID = ? ";

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
      "          FROM zse_webshopcategory" +
      "         WHERE zse_webshopcategory.ZSE_Webshopcategory_ID = ? ";

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
