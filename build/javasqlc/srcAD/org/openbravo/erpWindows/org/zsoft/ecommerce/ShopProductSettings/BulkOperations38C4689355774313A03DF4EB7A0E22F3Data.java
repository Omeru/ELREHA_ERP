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
class BulkOperations38C4689355774313A03DF4EB7A0E22F3Data implements FieldProvider {
static Logger log4j = Logger.getLogger(BulkOperations38C4689355774313A03DF4EB7A0E22F3Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String content;
  public String ismaster;
  public String mProductId;
  public String mProductIdr;
  public String zseShopId;
  public String zseShopIdr;
  public String isorderable;
  public String hideonnostock;
  public String allworderonnostock;
  public String maxorderqty;
  public String minorderqty;
  public String maxstockshown;
  public String title;
  public String fulltitle;
  public String description;
  public String externalid;
  public String adClientId;
  public String adOrgId;
  public String deliverytimePromised;
  public String zseProductShopId;
  public String ecpriority;
  public String externalid2;
  public String eccategory;
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
    else if (fieldName.equalsIgnoreCase("content"))
      return content;
    else if (fieldName.equalsIgnoreCase("ismaster"))
      return ismaster;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("zse_shop_id") || fieldName.equals("zseShopId"))
      return zseShopId;
    else if (fieldName.equalsIgnoreCase("zse_shop_idr") || fieldName.equals("zseShopIdr"))
      return zseShopIdr;
    else if (fieldName.equalsIgnoreCase("isorderable"))
      return isorderable;
    else if (fieldName.equalsIgnoreCase("hideonnostock"))
      return hideonnostock;
    else if (fieldName.equalsIgnoreCase("allworderonnostock"))
      return allworderonnostock;
    else if (fieldName.equalsIgnoreCase("maxorderqty"))
      return maxorderqty;
    else if (fieldName.equalsIgnoreCase("minorderqty"))
      return minorderqty;
    else if (fieldName.equalsIgnoreCase("maxstockshown"))
      return maxstockshown;
    else if (fieldName.equalsIgnoreCase("title"))
      return title;
    else if (fieldName.equalsIgnoreCase("fulltitle"))
      return fulltitle;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("deliverytime_promised") || fieldName.equals("deliverytimePromised"))
      return deliverytimePromised;
    else if (fieldName.equalsIgnoreCase("zse_product_shop_id") || fieldName.equals("zseProductShopId"))
      return zseProductShopId;
    else if (fieldName.equalsIgnoreCase("ecpriority"))
      return ecpriority;
    else if (fieldName.equalsIgnoreCase("externalid2"))
      return externalid2;
    else if (fieldName.equalsIgnoreCase("eccategory"))
      return eccategory;
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
  public static BulkOperations38C4689355774313A03DF4EB7A0E22F3Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseProductShopId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseProductShopId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static BulkOperations38C4689355774313A03DF4EB7A0E22F3Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseProductShopId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_product_shop.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_product_shop.CreatedBy) as CreatedByR, " +
      "        to_char(zse_product_shop.Updated, ?) as updated, " +
      "        to_char(zse_product_shop.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_product_shop.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_product_shop.UpdatedBy) as UpdatedByR," +
      "        zse_product_shop.Content, " +
      "COALESCE(zse_product_shop.Ismaster, 'N') AS Ismaster, " +
      "zse_product_shop.M_Product_ID, " +
      "(CASE WHEN zse_product_shop.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "zse_product_shop.ZSE_Shop_ID, " +
      "(CASE WHEN zse_product_shop.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "COALESCE(zse_product_shop.Isorderable, 'N') AS Isorderable, " +
      "COALESCE(zse_product_shop.Hideonnostock, 'N') AS Hideonnostock, " +
      "COALESCE(zse_product_shop.Allworderonnostock, 'N') AS Allworderonnostock, " +
      "zse_product_shop.Maxorderqty, " +
      "zse_product_shop.Minorderqty, " +
      "zse_product_shop.Maxstockshown, " +
      "zse_product_shop.Title, " +
      "zse_product_shop.Fulltitle, " +
      "zse_product_shop.Description, " +
      "zse_product_shop.Externalid, " +
      "zse_product_shop.AD_Client_ID, " +
      "zse_product_shop.AD_Org_ID, " +
      "zse_product_shop.Deliverytime_Promised, " +
      "zse_product_shop.ZSE_Product_Shop_ID, " +
      "zse_product_shop.Ecpriority, " +
      "zse_product_shop.Externalid2, " +
      "zse_product_shop.Eccategory, " +
      "COALESCE(zse_product_shop.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_product_shop left join (select M_Product_ID, Value, Name from M_Product) table1 on (zse_product_shop.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (zse_product_shop.ZSE_Shop_ID = table2.ZSE_Shop_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseProductShopId==null || zseProductShopId.equals(""))?"":"  AND zse_product_shop.ZSE_Product_Shop_ID = ?  ");
    strSql = strSql + 
      "        AND zse_product_shop.ZSE_Product_Shop_ID = ? " +
      "        AND zse_product_shop.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_product_shop.AD_Org_ID IN (";
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
        BulkOperations38C4689355774313A03DF4EB7A0E22F3Data objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data = new BulkOperations38C4689355774313A03DF4EB7A0E22F3Data();
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.created = UtilSql.getValue(result, "created");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.updated = UtilSql.getValue(result, "updated");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.content = UtilSql.getValue(result, "content");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.ismaster = UtilSql.getValue(result, "ismaster");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.isorderable = UtilSql.getValue(result, "isorderable");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.hideonnostock = UtilSql.getValue(result, "hideonnostock");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.allworderonnostock = UtilSql.getValue(result, "allworderonnostock");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.maxorderqty = UtilSql.getValue(result, "maxorderqty");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.minorderqty = UtilSql.getValue(result, "minorderqty");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.maxstockshown = UtilSql.getValue(result, "maxstockshown");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.title = UtilSql.getValue(result, "title");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.fulltitle = UtilSql.getValue(result, "fulltitle");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.description = UtilSql.getValue(result, "description");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.externalid = UtilSql.getValue(result, "externalid");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.deliverytimePromised = UtilSql.getValue(result, "deliverytime_promised");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.zseProductShopId = UtilSql.getValue(result, "zse_product_shop_id");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.ecpriority = UtilSql.getValue(result, "ecpriority");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.externalid2 = UtilSql.getValue(result, "externalid2");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.eccategory = UtilSql.getValue(result, "eccategory");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.isactive = UtilSql.getValue(result, "isactive");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.language = UtilSql.getValue(result, "language");
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.adUserClient = "";
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.adOrgClient = "";
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.createdby = "";
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.trBgcolor = "";
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.totalCount = "";
        objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data);
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
    BulkOperations38C4689355774313A03DF4EB7A0E22F3Data objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[] = new BulkOperations38C4689355774313A03DF4EB7A0E22F3Data[vector.size()];
    vector.copyInto(objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data);
    return(objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data);
  }

/**
Create a registry
 */
  public static BulkOperations38C4689355774313A03DF4EB7A0E22F3Data[] set(String zseProductShopId, String createdby, String createdbyr, String externalid, String ismaster, String eccategory, String deliverytimePromised, String content, String adOrgId, String allworderonnostock, String updatedby, String updatedbyr, String isactive, String description, String ecpriority, String externalid2, String hideonnostock, String minorderqty, String fulltitle, String maxorderqty, String adClientId, String zseShopId, String isorderable, String title, String mProductId, String maxstockshown)    throws ServletException {
    BulkOperations38C4689355774313A03DF4EB7A0E22F3Data objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[] = new BulkOperations38C4689355774313A03DF4EB7A0E22F3Data[1];
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0] = new BulkOperations38C4689355774313A03DF4EB7A0E22F3Data();
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].created = "";
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].createdbyr = createdbyr;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].updated = "";
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].updatedTimeStamp = "";
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].updatedby = updatedby;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].updatedbyr = updatedbyr;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].content = content;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].ismaster = ismaster;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].mProductId = mProductId;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].mProductIdr = "";
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].zseShopId = zseShopId;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].zseShopIdr = "";
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].isorderable = isorderable;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].hideonnostock = hideonnostock;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].allworderonnostock = allworderonnostock;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].maxorderqty = maxorderqty;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].minorderqty = minorderqty;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].maxstockshown = maxstockshown;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].title = title;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].fulltitle = fulltitle;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].description = description;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].externalid = externalid;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].adClientId = adClientId;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].adOrgId = adOrgId;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].deliverytimePromised = deliverytimePromised;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].zseProductShopId = zseProductShopId;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].ecpriority = ecpriority;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].externalid2 = externalid2;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].eccategory = eccategory;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].isactive = isactive;
    objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data[0].language = "";
    return objectBulkOperations38C4689355774313A03DF4EB7A0E22F3Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef746B8B38DC0F4B2392F1EE8995493A59_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefA36EF117A57545A48185C1536003E5AA_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        SELECT zse_product_shop.ZSE_Product_Shop_ID AS NAME" +
      "        FROM zse_product_shop" +
      "        WHERE zse_product_shop.ZSE_Product_Shop_ID = ?";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table2.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))) AS NAME FROM zse_product_shop left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_product_shop.ZSE_Shop_ID = table1.ZSE_Shop_ID) left join (select M_Product_ID, Value, Name from M_Product) table2 on (zse_product_shop.M_Product_ID = table2.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  WHERE zse_product_shop.ZSE_Product_Shop_ID = ?  ";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table2.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))) AS NAME FROM zse_product_shop left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_product_shop.ZSE_Shop_ID = table1.ZSE_Shop_ID) left join (select M_Product_ID, Value, Name from M_Product) table2 on (zse_product_shop.M_Product_ID = table2.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  WHERE zse_product_shop.ZSE_Product_Shop_ID = ?  ";

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
      "        UPDATE zse_product_shop" +
      "        SET Content = (?) , Ismaster = (?) , M_Product_ID = (?) , ZSE_Shop_ID = (?) , Isorderable = (?) , Hideonnostock = (?) , Allworderonnostock = (?) , Maxorderqty = TO_NUMBER(?) , Minorderqty = TO_NUMBER(?) , Maxstockshown = TO_NUMBER(?) , Title = (?) , Fulltitle = (?) , Description = (?) , Externalid = (?) , AD_Client_ID = (?) , AD_Org_ID = (?) , Deliverytime_Promised = TO_NUMBER(?) , ZSE_Product_Shop_ID = (?) , Ecpriority = TO_NUMBER(?) , Externalid2 = (?) , Eccategory = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_product_shop.ZSE_Product_Shop_ID = ? " +
      "                 AND zse_product_shop.ZSE_Product_Shop_ID = ? " +
      "        AND zse_product_shop.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_product_shop.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, content);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ismaster);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isorderable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hideonnostock);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allworderonnostock);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maxorderqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, minorderqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maxstockshown);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fulltitle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimePromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ecpriority);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, eccategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
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
      "        INSERT INTO zse_product_shop " +
      "        (Content, Ismaster, M_Product_ID, ZSE_Shop_ID, Isorderable, Hideonnostock, Allworderonnostock, Maxorderqty, Minorderqty, Maxstockshown, Title, Fulltitle, Description, Externalid, AD_Client_ID, AD_Org_ID, Deliverytime_Promised, ZSE_Product_Shop_ID, Ecpriority, Externalid2, Eccategory, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, content);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ismaster);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isorderable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hideonnostock);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allworderonnostock);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maxorderqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, minorderqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maxstockshown);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fulltitle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimePromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ecpriority);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, eccategory);
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
      "        DELETE FROM zse_product_shop" +
      "        WHERE zse_product_shop.ZSE_Product_Shop_ID = ? " +
      "                 AND zse_product_shop.ZSE_Product_Shop_ID = ? " +
      "        AND zse_product_shop.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_product_shop.AD_Org_ID IN (";
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
      "        DELETE FROM zse_product_shop" +
      "        WHERE zse_product_shop.ZSE_Product_Shop_ID = ? " +
      "                 AND zse_product_shop.ZSE_Product_Shop_ID = ? ";

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
      "          FROM zse_product_shop" +
      "         WHERE zse_product_shop.ZSE_Product_Shop_ID = ? ";

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
      "          FROM zse_product_shop" +
      "         WHERE zse_product_shop.ZSE_Product_Shop_ID = ? ";

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
