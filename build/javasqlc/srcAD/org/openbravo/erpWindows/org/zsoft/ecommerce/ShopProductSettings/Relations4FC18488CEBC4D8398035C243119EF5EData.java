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
class Relations4FC18488CEBC4D8398035C243119EF5EData implements FieldProvider {
static Logger log4j = Logger.getLogger(Relations4FC18488CEBC4D8398035C243119EF5EData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseProductShopId;
  public String zseProductShopIdr;
  public String mProductId;
  public String mProductIdr;
  public String externalidrelatedproduct;
  public String externalidrelation;
  public String adOrgId;
  public String adClientId;
  public String isactive;
  public String zseShopId;
  public String zseRelationProductId;
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
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("externalidrelatedproduct"))
      return externalidrelatedproduct;
    else if (fieldName.equalsIgnoreCase("externalidrelation"))
      return externalidrelation;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("zse_shop_id") || fieldName.equals("zseShopId"))
      return zseShopId;
    else if (fieldName.equalsIgnoreCase("zse_relation_product_id") || fieldName.equals("zseRelationProductId"))
      return zseRelationProductId;
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
  public static Relations4FC18488CEBC4D8398035C243119EF5EData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseProductShopId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseProductShopId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Relations4FC18488CEBC4D8398035C243119EF5EData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseProductShopId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_relation_product.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_relation_product.CreatedBy) as CreatedByR, " +
      "        to_char(zse_relation_product.Updated, ?) as updated, " +
      "        to_char(zse_relation_product.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_relation_product.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_relation_product.UpdatedBy) as UpdatedByR," +
      "        zse_relation_product.ZSE_Product_Shop_ID, " +
      "(CASE WHEN zse_relation_product.ZSE_Product_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS ZSE_Product_Shop_IDR, " +
      "zse_relation_product.M_Product_ID, " +
      "(CASE WHEN zse_relation_product.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "zse_relation_product.Externalidrelatedproduct, " +
      "zse_relation_product.Externalidrelation, " +
      "zse_relation_product.AD_Org_ID, " +
      "zse_relation_product.AD_Client_ID, " +
      "COALESCE(zse_relation_product.Isactive, 'N') AS Isactive, " +
      "zse_relation_product.ZSE_Shop_ID, " +
      "zse_relation_product.ZSE_Relation_Product_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_relation_product left join (select ZSE_Product_Shop_ID, ZSE_Shop_ID, M_Product_ID from ZSE_Product_Shop) table1 on (zse_relation_product.ZSE_Product_Shop_ID = table1.ZSE_Product_Shop_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (table1.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select M_Product_ID, Value, Name from M_Product) table4 on (zse_relation_product.M_Product_ID = table4.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseProductShopId==null || zseProductShopId.equals(""))?"":"  AND zse_relation_product.ZSE_Product_Shop_ID = ?  ");
    strSql = strSql + 
      "        AND zse_relation_product.ZSE_Relation_Product_ID = ? " +
      "        AND zse_relation_product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_relation_product.AD_Org_ID IN (";
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
        Relations4FC18488CEBC4D8398035C243119EF5EData objectRelations4FC18488CEBC4D8398035C243119EF5EData = new Relations4FC18488CEBC4D8398035C243119EF5EData();
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.created = UtilSql.getValue(result, "created");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.updated = UtilSql.getValue(result, "updated");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.updatedby = UtilSql.getValue(result, "updatedby");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.zseProductShopId = UtilSql.getValue(result, "zse_product_shop_id");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.zseProductShopIdr = UtilSql.getValue(result, "zse_product_shop_idr");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.externalidrelatedproduct = UtilSql.getValue(result, "externalidrelatedproduct");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.externalidrelation = UtilSql.getValue(result, "externalidrelation");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.isactive = UtilSql.getValue(result, "isactive");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.zseRelationProductId = UtilSql.getValue(result, "zse_relation_product_id");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.language = UtilSql.getValue(result, "language");
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.adUserClient = "";
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.adOrgClient = "";
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.createdby = "";
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.trBgcolor = "";
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.totalCount = "";
        objectRelations4FC18488CEBC4D8398035C243119EF5EData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectRelations4FC18488CEBC4D8398035C243119EF5EData);
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
    Relations4FC18488CEBC4D8398035C243119EF5EData objectRelations4FC18488CEBC4D8398035C243119EF5EData[] = new Relations4FC18488CEBC4D8398035C243119EF5EData[vector.size()];
    vector.copyInto(objectRelations4FC18488CEBC4D8398035C243119EF5EData);
    return(objectRelations4FC18488CEBC4D8398035C243119EF5EData);
  }

/**
Create a registry
 */
  public static Relations4FC18488CEBC4D8398035C243119EF5EData[] set(String zseProductShopId, String zseRelationProductId, String adClientId, String isactive, String mProductId, String mProductIdr, String updatedby, String updatedbyr, String externalidrelation, String createdby, String createdbyr, String zseShopId, String adOrgId, String externalidrelatedproduct)    throws ServletException {
    Relations4FC18488CEBC4D8398035C243119EF5EData objectRelations4FC18488CEBC4D8398035C243119EF5EData[] = new Relations4FC18488CEBC4D8398035C243119EF5EData[1];
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0] = new Relations4FC18488CEBC4D8398035C243119EF5EData();
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].created = "";
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].createdbyr = createdbyr;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].updated = "";
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].updatedTimeStamp = "";
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].updatedby = updatedby;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].updatedbyr = updatedbyr;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].zseProductShopId = zseProductShopId;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].zseProductShopIdr = "";
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].mProductId = mProductId;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].mProductIdr = mProductIdr;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].externalidrelatedproduct = externalidrelatedproduct;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].externalidrelation = externalidrelation;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].adOrgId = adOrgId;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].adClientId = adClientId;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].isactive = isactive;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].zseShopId = zseShopId;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].zseRelationProductId = zseRelationProductId;
    objectRelations4FC18488CEBC4D8398035C243119EF5EData[0].language = "";
    return objectRelations4FC18488CEBC4D8398035C243119EF5EData;
  }

/**
Select for auxiliar field
 */
  public static String selectDefA34FD2B2606A49B3B3176301C3A2C8D7_0(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Value), '')  || ' - ' || COALESCE(TO_CHAR(table1.Name), '') ) as M_Product_ID FROM M_Product table1 WHERE table1.isActive='Y' AND table1.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_product_id");
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
  public static String selectDef2DA13231ACE2434DBB5DE810682272BC_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef7D61B9466EB54CBE94CE5E8CC2E08E5B_2(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        SELECT zse_relation_product.ZSE_Product_Shop_ID AS NAME" +
      "        FROM zse_relation_product" +
      "        WHERE zse_relation_product.ZSE_Relation_Product_ID = ?";

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
      "        UPDATE zse_relation_product" +
      "        SET ZSE_Product_Shop_ID = (?) , M_Product_ID = (?) , Externalidrelatedproduct = (?) , Externalidrelation = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , Isactive = (?) , ZSE_Shop_ID = (?) , ZSE_Relation_Product_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_relation_product.ZSE_Relation_Product_ID = ? " +
      "                 AND zse_relation_product.ZSE_Product_Shop_ID = ? " +
      "        AND zse_relation_product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_relation_product.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalidrelatedproduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalidrelation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseRelationProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseRelationProductId);
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
      "        INSERT INTO zse_relation_product " +
      "        (ZSE_Product_Shop_ID, M_Product_ID, Externalidrelatedproduct, Externalidrelation, AD_Org_ID, AD_Client_ID, Isactive, ZSE_Shop_ID, ZSE_Relation_Product_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseProductShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalidrelatedproduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalidrelation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseRelationProductId);
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
      "        DELETE FROM zse_relation_product" +
      "        WHERE zse_relation_product.ZSE_Relation_Product_ID = ? " +
      "                 AND zse_relation_product.ZSE_Product_Shop_ID = ? " +
      "        AND zse_relation_product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_relation_product.AD_Org_ID IN (";
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
      "        DELETE FROM zse_relation_product" +
      "        WHERE zse_relation_product.ZSE_Relation_Product_ID = ? " +
      "                 AND zse_relation_product.ZSE_Product_Shop_ID = ? ";

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
      "          FROM zse_relation_product" +
      "         WHERE zse_relation_product.ZSE_Relation_Product_ID = ? ";

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
      "          FROM zse_relation_product" +
      "         WHERE zse_relation_product.ZSE_Relation_Product_ID = ? ";

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
