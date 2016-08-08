//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.ecommerce.ShopTaxrates;

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
class TaxAssignment13182CCD78064F2280545870960704F5Data implements FieldProvider {
static Logger log4j = Logger.getLogger(TaxAssignment13182CCD78064F2280545870960704F5Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseShopId;
  public String zseShopIdr;
  public String cTaxId;
  public String cTaxIdr;
  public String title;
  public String rate;
  public String externalid;
  public String zseShoptaxId;
  public String url;
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
    else if (fieldName.equalsIgnoreCase("zse_shop_id") || fieldName.equals("zseShopId"))
      return zseShopId;
    else if (fieldName.equalsIgnoreCase("zse_shop_idr") || fieldName.equals("zseShopIdr"))
      return zseShopIdr;
    else if (fieldName.equalsIgnoreCase("c_tax_id") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("c_tax_idr") || fieldName.equals("cTaxIdr"))
      return cTaxIdr;
    else if (fieldName.equalsIgnoreCase("title"))
      return title;
    else if (fieldName.equalsIgnoreCase("rate"))
      return rate;
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("zse_shoptax_id") || fieldName.equals("zseShoptaxId"))
      return zseShoptaxId;
    else if (fieldName.equalsIgnoreCase("url"))
      return url;
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
  public static TaxAssignment13182CCD78064F2280545870960704F5Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static TaxAssignment13182CCD78064F2280545870960704F5Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_shoptax.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shoptax.CreatedBy) as CreatedByR, " +
      "        to_char(zse_shoptax.Updated, ?) as updated, " +
      "        to_char(zse_shoptax.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_shoptax.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shoptax.UpdatedBy) as UpdatedByR," +
      "        zse_shoptax.ZSE_Shop_ID, " +
      "(CASE WHEN zse_shoptax.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "zse_shoptax.C_Tax_ID, " +
      "(CASE WHEN zse_shoptax.C_Tax_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "zse_shoptax.Title, " +
      "zse_shoptax.Rate, " +
      "zse_shoptax.Externalid, " +
      "zse_shoptax.ZSE_Shoptax_ID, " +
      "zse_shoptax.Url, " +
      "zse_shoptax.AD_Client_ID, " +
      "COALESCE(zse_shoptax.Isactive, 'N') AS Isactive, " +
      "zse_shoptax.AD_Org_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_shoptax left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shoptax.ZSE_Shop_ID = table1.ZSE_Shop_ID) left join (select C_Tax_ID, Name from C_Tax) table2 on (zse_shoptax.C_Tax_ID = table2.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL2 on (table2.C_Tax_ID = tableTRL2.C_Tax_ID and tableTRL2.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND zse_shoptax.ZSE_Shoptax_ID = ? " +
      "        AND zse_shoptax.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_shoptax.AD_Org_ID IN (";
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
        TaxAssignment13182CCD78064F2280545870960704F5Data objectTaxAssignment13182CCD78064F2280545870960704F5Data = new TaxAssignment13182CCD78064F2280545870960704F5Data();
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.created = UtilSql.getValue(result, "created");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.updated = UtilSql.getValue(result, "updated");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.cTaxId = UtilSql.getValue(result, "c_tax_id");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.cTaxIdr = UtilSql.getValue(result, "c_tax_idr");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.title = UtilSql.getValue(result, "title");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.rate = UtilSql.getValue(result, "rate");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.externalid = UtilSql.getValue(result, "externalid");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.zseShoptaxId = UtilSql.getValue(result, "zse_shoptax_id");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.url = UtilSql.getValue(result, "url");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.isactive = UtilSql.getValue(result, "isactive");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.language = UtilSql.getValue(result, "language");
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.adUserClient = "";
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.adOrgClient = "";
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.createdby = "";
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.trBgcolor = "";
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.totalCount = "";
        objectTaxAssignment13182CCD78064F2280545870960704F5Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTaxAssignment13182CCD78064F2280545870960704F5Data);
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
    TaxAssignment13182CCD78064F2280545870960704F5Data objectTaxAssignment13182CCD78064F2280545870960704F5Data[] = new TaxAssignment13182CCD78064F2280545870960704F5Data[vector.size()];
    vector.copyInto(objectTaxAssignment13182CCD78064F2280545870960704F5Data);
    return(objectTaxAssignment13182CCD78064F2280545870960704F5Data);
  }

/**
Create a registry
 */
  public static TaxAssignment13182CCD78064F2280545870960704F5Data[] set(String cTaxId, String title, String externalid, String adClientId, String zseShoptaxId, String url, String rate, String zseShopId, String isactive, String adOrgId, String updatedby, String updatedbyr, String createdby, String createdbyr)    throws ServletException {
    TaxAssignment13182CCD78064F2280545870960704F5Data objectTaxAssignment13182CCD78064F2280545870960704F5Data[] = new TaxAssignment13182CCD78064F2280545870960704F5Data[1];
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0] = new TaxAssignment13182CCD78064F2280545870960704F5Data();
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].created = "";
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].createdbyr = createdbyr;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].updated = "";
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].updatedTimeStamp = "";
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].updatedby = updatedby;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].updatedbyr = updatedbyr;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].zseShopId = zseShopId;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].zseShopIdr = "";
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].cTaxId = cTaxId;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].cTaxIdr = "";
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].title = title;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].rate = rate;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].externalid = externalid;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].zseShoptaxId = zseShoptaxId;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].url = url;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].adClientId = adClientId;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].isactive = isactive;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].adOrgId = adOrgId;
    objectTaxAssignment13182CCD78064F2280545870960704F5Data[0].language = "";
    return objectTaxAssignment13182CCD78064F2280545870960704F5Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef59A7CAFA791D4287A3E1195E9D19A507_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDefB953D8D2F1C14BCFA6A2959200866390_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        UPDATE zse_shoptax" +
      "        SET ZSE_Shop_ID = (?) , C_Tax_ID = (?) , Title = (?) , Rate = TO_NUMBER(?) , Externalid = (?) , ZSE_Shoptax_ID = (?) , Url = (?) , AD_Client_ID = (?) , Isactive = (?) , AD_Org_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_shoptax.ZSE_Shoptax_ID = ? " +
      "        AND zse_shoptax.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shoptax.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShoptaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShoptaxId);
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
      "        INSERT INTO zse_shoptax " +
      "        (ZSE_Shop_ID, C_Tax_ID, Title, Rate, Externalid, ZSE_Shoptax_ID, Url, AD_Client_ID, Isactive, AD_Org_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShoptaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, url);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_shoptax" +
      "        WHERE zse_shoptax.ZSE_Shoptax_ID = ? " +
      "        AND zse_shoptax.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shoptax.AD_Org_ID IN (";
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
      "        DELETE FROM zse_shoptax" +
      "        WHERE zse_shoptax.ZSE_Shoptax_ID = ? ";

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
      "          FROM zse_shoptax" +
      "         WHERE zse_shoptax.ZSE_Shoptax_ID = ? ";

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
      "          FROM zse_shoptax" +
      "         WHERE zse_shoptax.ZSE_Shoptax_ID = ? ";

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
