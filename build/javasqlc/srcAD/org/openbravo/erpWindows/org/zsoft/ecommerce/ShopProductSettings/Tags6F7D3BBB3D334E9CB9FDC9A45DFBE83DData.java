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
class Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData implements FieldProvider {
static Logger log4j = Logger.getLogger(Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseProductShopId;
  public String zseProductShopIdr;
  public String zseTagId;
  public String zseTagIdr;
  public String externalid;
  public String adOrgId;
  public String zseTagProductId;
  public String isactive;
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
    else if (fieldName.equalsIgnoreCase("zse_product_shop_id") || fieldName.equals("zseProductShopId"))
      return zseProductShopId;
    else if (fieldName.equalsIgnoreCase("zse_product_shop_idr") || fieldName.equals("zseProductShopIdr"))
      return zseProductShopIdr;
    else if (fieldName.equalsIgnoreCase("zse_tag_id") || fieldName.equals("zseTagId"))
      return zseTagId;
    else if (fieldName.equalsIgnoreCase("zse_tag_idr") || fieldName.equals("zseTagIdr"))
      return zseTagIdr;
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("zse_tag_product_id") || fieldName.equals("zseTagProductId"))
      return zseTagProductId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
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
  public static Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseProductShopId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseProductShopId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseProductShopId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_tag_product.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_tag_product.CreatedBy) as CreatedByR, " +
      "        to_char(zse_tag_product.Updated, ?) as updated, " +
      "        to_char(zse_tag_product.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_tag_product.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_tag_product.UpdatedBy) as UpdatedByR," +
      "        zse_tag_product.ZSE_Product_Shop_ID, " +
      "(CASE WHEN zse_tag_product.ZSE_Product_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS ZSE_Product_Shop_IDR, " +
      "zse_tag_product.ZSE_Tag_ID, " +
      "(CASE WHEN zse_tag_product.ZSE_Tag_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Title), ''))),'') ) END) AS ZSE_Tag_IDR, " +
      "zse_tag_product.Externalid, " +
      "zse_tag_product.AD_Org_ID, " +
      "zse_tag_product.ZSE_Tag_Product_ID, " +
      "COALESCE(zse_tag_product.Isactive, 'N') AS Isactive, " +
      "zse_tag_product.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_tag_product left join (select ZSE_Product_Shop_ID, ZSE_Shop_ID, M_Product_ID from ZSE_Product_Shop) table1 on (zse_tag_product.ZSE_Product_Shop_ID = table1.ZSE_Product_Shop_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select ZSE_Tag_ID, ZSE_Shop_ID, Title from ZSE_Tag) table4 on (zse_tag_product.ZSE_Tag_ID = table4.ZSE_Tag_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table5 on (table4.ZSE_Shop_ID = table5.ZSE_Shop_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseProductShopId==null || zseProductShopId.equals(""))?"":"  AND zse_tag_product.ZSE_Product_Shop_ID = ?  ");
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
        Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData = new Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData();
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.created = UtilSql.getValue(result, "created");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.updated = UtilSql.getValue(result, "updated");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.updatedby = UtilSql.getValue(result, "updatedby");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.zseProductShopId = UtilSql.getValue(result, "zse_product_shop_id");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.zseProductShopIdr = UtilSql.getValue(result, "zse_product_shop_idr");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.zseTagId = UtilSql.getValue(result, "zse_tag_id");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.zseTagIdr = UtilSql.getValue(result, "zse_tag_idr");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.externalid = UtilSql.getValue(result, "externalid");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.zseTagProductId = UtilSql.getValue(result, "zse_tag_product_id");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.isactive = UtilSql.getValue(result, "isactive");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.language = UtilSql.getValue(result, "language");
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.adUserClient = "";
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.adOrgClient = "";
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.createdby = "";
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.trBgcolor = "";
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.totalCount = "";
        objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData);
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
    Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[] = new Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[vector.size()];
    vector.copyInto(objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData);
    return(objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData);
  }

/**
Create a registry
 */
  public static Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[] set(String zseProductShopId, String zseTagProductId, String isactive, String adOrgId, String zseTagId, String createdby, String createdbyr, String externalid, String updatedby, String updatedbyr, String adClientId)    throws ServletException {
    Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[] = new Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[1];
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0] = new Tags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData();
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].created = "";
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].createdbyr = createdbyr;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].updated = "";
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].updatedTimeStamp = "";
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].updatedby = updatedby;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].updatedbyr = updatedbyr;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].zseProductShopId = zseProductShopId;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].zseProductShopIdr = "";
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].zseTagId = zseTagId;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].zseTagIdr = "";
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].externalid = externalid;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].adOrgId = adOrgId;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].zseTagProductId = zseTagProductId;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].isactive = isactive;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].adClientId = adClientId;
    objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData[0].language = "";
    return objectTags6F7D3BBB3D334E9CB9FDC9A45DFBE83DData;
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
      "        SELECT zse_tag_product.ZSE_Product_Shop_ID AS NAME" +
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
      "        UPDATE zse_tag_product" +
      "        SET ZSE_Product_Shop_ID = (?) , ZSE_Tag_ID = (?) , Externalid = (?) , AD_Org_ID = (?) , ZSE_Tag_Product_ID = (?) , Isactive = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_tag_product.ZSE_Tag_Product_ID = ? " +
      "                 AND zse_tag_product.ZSE_Product_Shop_ID = ? " +
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagProductId);
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
      "        INSERT INTO zse_tag_product " +
      "        (ZSE_Product_Shop_ID, ZSE_Tag_ID, Externalid, AD_Org_ID, ZSE_Tag_Product_ID, Isactive, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseTagProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String zseProductShopId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_tag_product" +
      "        WHERE zse_tag_product.ZSE_Tag_Product_ID = ? " +
      "                 AND zse_tag_product.ZSE_Product_Shop_ID = ? " +
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
      "        DELETE FROM zse_tag_product" +
      "        WHERE zse_tag_product.ZSE_Tag_Product_ID = ? " +
      "                 AND zse_tag_product.ZSE_Product_Shop_ID = ? ";

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
