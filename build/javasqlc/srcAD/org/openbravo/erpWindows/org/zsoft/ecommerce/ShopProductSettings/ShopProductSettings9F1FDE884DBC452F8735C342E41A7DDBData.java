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
class ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData implements FieldProvider {
static Logger log4j = Logger.getLogger(ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.class);
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
  public String ecpriority;
  public String adOrgId;
  public String adClientId;
  public String deliverytimePromised;
  public String zseProductShopId;
  public String isactive;
  public String externalid2;
  public String eccategory;
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
    else if (fieldName.equalsIgnoreCase("ecpriority"))
      return ecpriority;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("deliverytime_promised") || fieldName.equals("deliverytimePromised"))
      return deliverytimePromised;
    else if (fieldName.equalsIgnoreCase("zse_product_shop_id") || fieldName.equals("zseProductShopId"))
      return zseProductShopId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("externalid2"))
      return externalid2;
    else if (fieldName.equalsIgnoreCase("eccategory"))
      return eccategory;
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
  public static ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
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
      "zse_product_shop.Ecpriority, " +
      "zse_product_shop.AD_Org_ID, " +
      "zse_product_shop.AD_Client_ID, " +
      "zse_product_shop.Deliverytime_Promised, " +
      "zse_product_shop.ZSE_Product_Shop_ID, " +
      "COALESCE(zse_product_shop.Isactive, 'N') AS Isactive, " +
      "zse_product_shop.Externalid2, " +
      "zse_product_shop.Eccategory, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_product_shop left join (select M_Product_ID, Value, Name from M_Product) table1 on (zse_product_shop.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (zse_product_shop.ZSE_Shop_ID = table2.ZSE_Shop_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
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
        ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData = new ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData();
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.created = UtilSql.getValue(result, "created");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.updated = UtilSql.getValue(result, "updated");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.updatedby = UtilSql.getValue(result, "updatedby");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.content = UtilSql.getValue(result, "content");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.ismaster = UtilSql.getValue(result, "ismaster");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.isorderable = UtilSql.getValue(result, "isorderable");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.hideonnostock = UtilSql.getValue(result, "hideonnostock");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.allworderonnostock = UtilSql.getValue(result, "allworderonnostock");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.maxorderqty = UtilSql.getValue(result, "maxorderqty");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.minorderqty = UtilSql.getValue(result, "minorderqty");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.maxstockshown = UtilSql.getValue(result, "maxstockshown");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.title = UtilSql.getValue(result, "title");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.fulltitle = UtilSql.getValue(result, "fulltitle");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.description = UtilSql.getValue(result, "description");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.externalid = UtilSql.getValue(result, "externalid");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.ecpriority = UtilSql.getValue(result, "ecpriority");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.deliverytimePromised = UtilSql.getValue(result, "deliverytime_promised");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.zseProductShopId = UtilSql.getValue(result, "zse_product_shop_id");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.isactive = UtilSql.getValue(result, "isactive");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.externalid2 = UtilSql.getValue(result, "externalid2");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.eccategory = UtilSql.getValue(result, "eccategory");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.language = UtilSql.getValue(result, "language");
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.adUserClient = "";
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.adOrgClient = "";
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.createdby = "";
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.trBgcolor = "";
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.totalCount = "";
        objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData);
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
    ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[] = new ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[vector.size()];
    vector.copyInto(objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData);
    return(objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData);
  }

/**
Create a registry
 */
  public static ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[] set(String createdby, String createdbyr, String ismaster, String externalid, String deliverytimePromised, String eccategory, String content, String adOrgId, String allworderonnostock, String updatedby, String updatedbyr, String description, String isactive, String ecpriority, String zseProductShopId, String externalid2, String minorderqty, String hideonnostock, String fulltitle, String maxorderqty, String adClientId, String zseShopId, String isorderable, String title, String mProductId, String maxstockshown)    throws ServletException {
    ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[] = new ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[1];
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0] = new ShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData();
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].created = "";
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].createdbyr = createdbyr;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].updated = "";
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].updatedTimeStamp = "";
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].updatedby = updatedby;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].updatedbyr = updatedbyr;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].content = content;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].ismaster = ismaster;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].mProductId = mProductId;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].mProductIdr = "";
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].zseShopId = zseShopId;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].zseShopIdr = "";
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].isorderable = isorderable;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].hideonnostock = hideonnostock;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].allworderonnostock = allworderonnostock;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].maxorderqty = maxorderqty;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].minorderqty = minorderqty;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].maxstockshown = maxstockshown;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].title = title;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].fulltitle = fulltitle;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].description = description;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].externalid = externalid;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].ecpriority = ecpriority;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].adOrgId = adOrgId;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].adClientId = adClientId;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].deliverytimePromised = deliverytimePromised;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].zseProductShopId = zseProductShopId;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].isactive = isactive;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].externalid2 = externalid2;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].eccategory = eccategory;
    objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData[0].language = "";
    return objectShopProductSettings9F1FDE884DBC452F8735C342E41A7DDBData;
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE zse_product_shop" +
      "        SET Content = (?) , Ismaster = (?) , M_Product_ID = (?) , ZSE_Shop_ID = (?) , Isorderable = (?) , Hideonnostock = (?) , Allworderonnostock = (?) , Maxorderqty = TO_NUMBER(?) , Minorderqty = TO_NUMBER(?) , Maxstockshown = TO_NUMBER(?) , Title = (?) , Fulltitle = (?) , Description = (?) , Externalid = (?) , Ecpriority = TO_NUMBER(?) , AD_Org_ID = (?) , AD_Client_ID = (?) , Deliverytime_Promised = TO_NUMBER(?) , ZSE_Product_Shop_ID = (?) , Isactive = (?) , Externalid2 = (?) , Eccategory = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_product_shop.ZSE_Product_Shop_ID = ? " +
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ecpriority);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimePromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, eccategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
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
      "        (Content, Ismaster, M_Product_ID, ZSE_Shop_ID, Isorderable, Hideonnostock, Allworderonnostock, Maxorderqty, Minorderqty, Maxstockshown, Title, Fulltitle, Description, Externalid, Ecpriority, AD_Org_ID, AD_Client_ID, Deliverytime_Promised, ZSE_Product_Shop_ID, Isactive, Externalid2, Eccategory, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), now(), ?, now(), ?)";

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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ecpriority);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimePromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, eccategory);
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
      "        DELETE FROM zse_product_shop" +
      "        WHERE zse_product_shop.ZSE_Product_Shop_ID = ? " +
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
      "        DELETE FROM zse_product_shop" +
      "        WHERE zse_product_shop.ZSE_Product_Shop_ID = ? ";

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
