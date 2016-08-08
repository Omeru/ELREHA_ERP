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
class Products8062148B6E5F402698945645E73A9F91Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Products8062148B6E5F402698945645E73A9F91Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseTagId;
  public String zseTagIdr;
  public String zseProductShopId;
  public String zseProductShopIdr;
  public String externalid;
  public String zseTagProductId;
  public String adClientId;
  public String isactive;
  public String adOrgId;
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
    else if (fieldName.equalsIgnoreCase("zse_tag_id") || fieldName.equals("zseTagId"))
      return zseTagId;
    else if (fieldName.equalsIgnoreCase("zse_tag_idr") || fieldName.equals("zseTagIdr"))
      return zseTagIdr;
    else if (fieldName.equalsIgnoreCase("zse_product_shop_id") || fieldName.equals("zseProductShopId"))
      return zseProductShopId;
    else if (fieldName.equalsIgnoreCase("zse_product_shop_idr") || fieldName.equals("zseProductShopIdr"))
      return zseProductShopIdr;
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("zse_tag_product_id") || fieldName.equals("zseTagProductId"))
      return zseTagProductId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
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
  public static Products8062148B6E5F402698945645E73A9F91Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseTagId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseTagId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Products8062148B6E5F402698945645E73A9F91Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseTagId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_tag_product.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_tag_product.CreatedBy) as CreatedByR, " +
      "        to_char(zse_tag_product.Updated, ?) as updated, " +
      "        to_char(zse_tag_product.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_tag_product.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_tag_product.UpdatedBy) as UpdatedByR," +
      "        zse_tag_product.ZSE_Tag_ID, " +
      "(CASE WHEN zse_tag_product.ZSE_Tag_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Title), ''))),'') ) END) AS ZSE_Tag_IDR, " +
      "zse_tag_product.ZSE_Product_Shop_ID, " +
      "(CASE WHEN zse_tag_product.ZSE_Product_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'') ) END) AS ZSE_Product_Shop_IDR, " +
      "zse_tag_product.Externalid, " +
      "zse_tag_product.ZSE_Tag_Product_ID, " +
      "zse_tag_product.AD_Client_ID, " +
      "COALESCE(zse_tag_product.Isactive, 'N') AS Isactive, " +
      "zse_tag_product.AD_Org_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_tag_product left join (select ZSE_Tag_ID, ZSE_Shop_ID, Title from ZSE_Tag) table1 on (zse_tag_product.ZSE_Tag_ID = table1.ZSE_Tag_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join (select ZSE_Product_Shop_ID, ZSE_Shop_ID, M_Product_ID from ZSE_Product_Shop) table3 on (zse_tag_product.ZSE_Product_Shop_ID = table3.ZSE_Product_Shop_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table4 on (table3.ZSE_Shop_ID = table4.ZSE_Shop_ID) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table3.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseTagId==null || zseTagId.equals(""))?"":"  AND zse_tag_product.ZSE_Tag_ID = ?  ");
    strSql = strSql + 
      "        AND zse_tag_product.ZSE_Tag_Product_ID = ? " +
      "        AND zse_tag_product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_tag_product.AD_Org_ID IN (";
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
      if (zseTagId != null && !(zseTagId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);
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
        Products8062148B6E5F402698945645E73A9F91Data objectProducts8062148B6E5F402698945645E73A9F91Data = new Products8062148B6E5F402698945645E73A9F91Data();
        objectProducts8062148B6E5F402698945645E73A9F91Data.created = UtilSql.getValue(result, "created");
        objectProducts8062148B6E5F402698945645E73A9F91Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectProducts8062148B6E5F402698945645E73A9F91Data.updated = UtilSql.getValue(result, "updated");
        objectProducts8062148B6E5F402698945645E73A9F91Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectProducts8062148B6E5F402698945645E73A9F91Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectProducts8062148B6E5F402698945645E73A9F91Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectProducts8062148B6E5F402698945645E73A9F91Data.zseTagId = UtilSql.getValue(result, "zse_tag_id");
        objectProducts8062148B6E5F402698945645E73A9F91Data.zseTagIdr = UtilSql.getValue(result, "zse_tag_idr");
        objectProducts8062148B6E5F402698945645E73A9F91Data.zseProductShopId = UtilSql.getValue(result, "zse_product_shop_id");
        objectProducts8062148B6E5F402698945645E73A9F91Data.zseProductShopIdr = UtilSql.getValue(result, "zse_product_shop_idr");
        objectProducts8062148B6E5F402698945645E73A9F91Data.externalid = UtilSql.getValue(result, "externalid");
        objectProducts8062148B6E5F402698945645E73A9F91Data.zseTagProductId = UtilSql.getValue(result, "zse_tag_product_id");
        objectProducts8062148B6E5F402698945645E73A9F91Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectProducts8062148B6E5F402698945645E73A9F91Data.isactive = UtilSql.getValue(result, "isactive");
        objectProducts8062148B6E5F402698945645E73A9F91Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectProducts8062148B6E5F402698945645E73A9F91Data.language = UtilSql.getValue(result, "language");
        objectProducts8062148B6E5F402698945645E73A9F91Data.adUserClient = "";
        objectProducts8062148B6E5F402698945645E73A9F91Data.adOrgClient = "";
        objectProducts8062148B6E5F402698945645E73A9F91Data.createdby = "";
        objectProducts8062148B6E5F402698945645E73A9F91Data.trBgcolor = "";
        objectProducts8062148B6E5F402698945645E73A9F91Data.totalCount = "";
        objectProducts8062148B6E5F402698945645E73A9F91Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectProducts8062148B6E5F402698945645E73A9F91Data);
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
    Products8062148B6E5F402698945645E73A9F91Data objectProducts8062148B6E5F402698945645E73A9F91Data[] = new Products8062148B6E5F402698945645E73A9F91Data[vector.size()];
    vector.copyInto(objectProducts8062148B6E5F402698945645E73A9F91Data);
    return(objectProducts8062148B6E5F402698945645E73A9F91Data);
  }

/**
Create a registry
 */
  public static Products8062148B6E5F402698945645E73A9F91Data[] set(String zseTagId, String zseTagProductId, String isactive, String adOrgId, String zseProductShopId, String createdby, String createdbyr, String externalid, String updatedby, String updatedbyr, String adClientId)    throws ServletException {
    Products8062148B6E5F402698945645E73A9F91Data objectProducts8062148B6E5F402698945645E73A9F91Data[] = new Products8062148B6E5F402698945645E73A9F91Data[1];
    objectProducts8062148B6E5F402698945645E73A9F91Data[0] = new Products8062148B6E5F402698945645E73A9F91Data();
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].created = "";
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].createdbyr = createdbyr;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].updated = "";
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].updatedTimeStamp = "";
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].updatedby = updatedby;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].updatedbyr = updatedbyr;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].zseTagId = zseTagId;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].zseTagIdr = "";
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].zseProductShopId = zseProductShopId;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].zseProductShopIdr = "";
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].externalid = externalid;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].zseTagProductId = zseTagProductId;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].adClientId = adClientId;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].isactive = isactive;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].adOrgId = adOrgId;
    objectProducts8062148B6E5F402698945645E73A9F91Data[0].language = "";
    return objectProducts8062148B6E5F402698945645E73A9F91Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2A774A67C1BA49E98B57F96A4F89E8BD_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef119980883DF94E959421B30D6A5BAA17_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        SELECT zse_tag_product.ZSE_Tag_ID AS NAME" +
      "        FROM zse_tag_product" +
      "        WHERE zse_tag_product.ZSE_Tag_Product_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String zseTagId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Title), ''))) AS NAME FROM zse_tag left join (select ZSE_Tag_ID, ZSE_Shop_ID, Title from ZSE_Tag) table1 on (zse_tag.ZSE_Tag_ID = table1.ZSE_Tag_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) WHERE zse_tag.ZSE_Tag_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String zseTagId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Title), ''))) AS NAME FROM zse_tag left join (select ZSE_Tag_ID, ZSE_Shop_ID, Title from ZSE_Tag) table1 on (zse_tag.ZSE_Tag_ID = table1.ZSE_Tag_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) WHERE zse_tag.ZSE_Tag_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);

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
      "        UPDATE zse_tag_product" +
      "        SET ZSE_Tag_ID = (?) , ZSE_Product_Shop_ID = (?) , Externalid = (?) , ZSE_Tag_Product_ID = (?) , AD_Client_ID = (?) , Isactive = (?) , AD_Org_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_tag_product.ZSE_Tag_Product_ID = ? " +
      "                 AND zse_tag_product.ZSE_Tag_ID = ? " +
      "        AND zse_tag_product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_tag_product.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagProductId);
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
      "        INSERT INTO zse_tag_product " +
      "        (ZSE_Tag_ID, ZSE_Product_Shop_ID, Externalid, ZSE_Tag_Product_ID, AD_Client_ID, Isactive, AD_Org_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String zseTagId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_tag_product" +
      "        WHERE zse_tag_product.ZSE_Tag_Product_ID = ? " +
      "                 AND zse_tag_product.ZSE_Tag_ID = ? " +
      "        AND zse_tag_product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_tag_product.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
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
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String zseTagId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_tag_product" +
      "        WHERE zse_tag_product.ZSE_Tag_Product_ID = ? " +
      "                 AND zse_tag_product.ZSE_Tag_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);

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
      "          FROM zse_tag_product" +
      "         WHERE zse_tag_product.ZSE_Tag_Product_ID = ? ";

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
      "          FROM zse_tag_product" +
      "         WHERE zse_tag_product.ZSE_Tag_Product_ID = ? ";

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
