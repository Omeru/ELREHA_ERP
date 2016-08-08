//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.ecommerce.WebshopTags;

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
class Tags3C8390F6219F47A682E39E7B6BA48113Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Tags3C8390F6219F47A682E39E7B6BA48113Data.class);
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
  public String externalid;
  public String zseTagId;
  public String adClientId;
  public String url;
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
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("zse_tag_id") || fieldName.equals("zseTagId"))
      return zseTagId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("url"))
      return url;
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
  public static Tags3C8390F6219F47A682E39E7B6BA48113Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Tags3C8390F6219F47A682E39E7B6BA48113Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_tag.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_tag.CreatedBy) as CreatedByR, " +
      "        to_char(zse_tag.Updated, ?) as updated, " +
      "        to_char(zse_tag.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_tag.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_tag.UpdatedBy) as UpdatedByR," +
      "        zse_tag.AD_Org_ID, " +
      "(CASE WHEN zse_tag.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "zse_tag.ZSE_Shop_ID, " +
      "(CASE WHEN zse_tag.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "COALESCE(zse_tag.Isactive, 'N') AS Isactive, " +
      "zse_tag.Commonname, " +
      "zse_tag.Title, " +
      "zse_tag.Externalid, " +
      "zse_tag.ZSE_Tag_ID, " +
      "zse_tag.AD_Client_ID, " +
      "zse_tag.Url, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_tag left join (select AD_Org_ID, Name from AD_Org) table1 on (zse_tag.AD_Org_ID = table1.AD_Org_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (zse_tag.ZSE_Shop_ID = table2.ZSE_Shop_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND zse_tag.ZSE_Tag_ID = ? " +
      "        AND zse_tag.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_tag.AD_Org_ID IN (";
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
        Tags3C8390F6219F47A682E39E7B6BA48113Data objectTags3C8390F6219F47A682E39E7B6BA48113Data = new Tags3C8390F6219F47A682E39E7B6BA48113Data();
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.created = UtilSql.getValue(result, "created");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.updated = UtilSql.getValue(result, "updated");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.isactive = UtilSql.getValue(result, "isactive");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.commonname = UtilSql.getValue(result, "commonname");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.title = UtilSql.getValue(result, "title");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.externalid = UtilSql.getValue(result, "externalid");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.zseTagId = UtilSql.getValue(result, "zse_tag_id");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.url = UtilSql.getValue(result, "url");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.language = UtilSql.getValue(result, "language");
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.adUserClient = "";
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.adOrgClient = "";
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.createdby = "";
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.trBgcolor = "";
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.totalCount = "";
        objectTags3C8390F6219F47A682E39E7B6BA48113Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTags3C8390F6219F47A682E39E7B6BA48113Data);
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
    Tags3C8390F6219F47A682E39E7B6BA48113Data objectTags3C8390F6219F47A682E39E7B6BA48113Data[] = new Tags3C8390F6219F47A682E39E7B6BA48113Data[vector.size()];
    vector.copyInto(objectTags3C8390F6219F47A682E39E7B6BA48113Data);
    return(objectTags3C8390F6219F47A682E39E7B6BA48113Data);
  }

/**
Create a registry
 */
  public static Tags3C8390F6219F47A682E39E7B6BA48113Data[] set(String externalid, String isactive, String createdby, String createdbyr, String zseShopId, String adClientId, String adOrgId, String commonname, String url, String zseTagId, String updatedby, String updatedbyr, String title)    throws ServletException {
    Tags3C8390F6219F47A682E39E7B6BA48113Data objectTags3C8390F6219F47A682E39E7B6BA48113Data[] = new Tags3C8390F6219F47A682E39E7B6BA48113Data[1];
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0] = new Tags3C8390F6219F47A682E39E7B6BA48113Data();
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].created = "";
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].createdbyr = createdbyr;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].updated = "";
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].updatedTimeStamp = "";
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].updatedby = updatedby;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].updatedbyr = updatedbyr;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].adOrgId = adOrgId;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].adOrgIdr = "";
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].zseShopId = zseShopId;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].zseShopIdr = "";
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].isactive = isactive;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].commonname = commonname;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].title = title;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].externalid = externalid;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].zseTagId = zseTagId;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].adClientId = adClientId;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].url = url;
    objectTags3C8390F6219F47A682E39E7B6BA48113Data[0].language = "";
    return objectTags3C8390F6219F47A682E39E7B6BA48113Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef530589DDDF464D779BB977DE8D5580FD_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef504D7144308344BDB8F9A510236C1478_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE zse_tag" +
      "        SET AD_Org_ID = (?) , ZSE_Shop_ID = (?) , Isactive = (?) , Commonname = (?) , Title = (?) , Externalid = (?) , ZSE_Tag_ID = (?) , AD_Client_ID = (?) , Url = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_tag.ZSE_Tag_ID = ? " +
      "        AND zse_tag.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_tag.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);
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
      "        INSERT INTO zse_tag " +
      "        (AD_Org_ID, ZSE_Shop_ID, Isactive, Commonname, Title, Externalid, ZSE_Tag_ID, AD_Client_ID, Url, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
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
      "        DELETE FROM zse_tag" +
      "        WHERE zse_tag.ZSE_Tag_ID = ? " +
      "        AND zse_tag.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_tag.AD_Org_ID IN (";
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
      "        DELETE FROM zse_tag" +
      "        WHERE zse_tag.ZSE_Tag_ID = ? ";

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
      "          FROM zse_tag" +
      "         WHERE zse_tag.ZSE_Tag_ID = ? ";

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
      "          FROM zse_tag" +
      "         WHERE zse_tag.ZSE_Tag_ID = ? ";

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
