//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.ecommerce.ShopMaintanance;

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
class OtherLanguages51A035DE7014408EAC587446E8B591C8Data implements FieldProvider {
static Logger log4j = Logger.getLogger(OtherLanguages51A035DE7014408EAC587446E8B591C8Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseShopId;
  public String zseShopIdr;
  public String adLanguage;
  public String adLanguager;
  public String isactive;
  public String adClientId;
  public String adOrgId;
  public String zseShopLanguageId;
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
    else if (fieldName.equalsIgnoreCase("ad_language") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("ad_languager") || fieldName.equals("adLanguager"))
      return adLanguager;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("zse_shop_language_id") || fieldName.equals("zseShopLanguageId"))
      return zseShopLanguageId;
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
  public static OtherLanguages51A035DE7014408EAC587446E8B591C8Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseShopId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseShopId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OtherLanguages51A035DE7014408EAC587446E8B591C8Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseShopId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_shop_language.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shop_language.CreatedBy) as CreatedByR, " +
      "        to_char(zse_shop_language.Updated, ?) as updated, " +
      "        to_char(zse_shop_language.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_shop_language.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shop_language.UpdatedBy) as UpdatedByR," +
      "        zse_shop_language.ZSE_Shop_ID, " +
      "(CASE WHEN zse_shop_language.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "zse_shop_language.AD_Language, " +
      "(CASE WHEN zse_shop_language.AD_Language IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_LanguageR, " +
      "COALESCE(zse_shop_language.Isactive, 'N') AS Isactive, " +
      "zse_shop_language.AD_Client_ID, " +
      "zse_shop_language.AD_Org_ID, " +
      "zse_shop_language.ZSE_Shop_Language_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_shop_language left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shop_language.ZSE_Shop_ID = table1.ZSE_Shop_ID) left join (select AD_Language, Name from AD_Language) table2 on (zse_shop_language.AD_Language =  table2.AD_Language)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseShopId==null || zseShopId.equals(""))?"":"  AND zse_shop_language.ZSE_Shop_ID = ?  ");
    strSql = strSql + 
      "        AND zse_shop_language.ZSE_Shop_Language_ID = ? " +
      "        AND zse_shop_language.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_shop_language.AD_Org_ID IN (";
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
      if (zseShopId != null && !(zseShopId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
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
        OtherLanguages51A035DE7014408EAC587446E8B591C8Data objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data = new OtherLanguages51A035DE7014408EAC587446E8B591C8Data();
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.created = UtilSql.getValue(result, "created");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.updated = UtilSql.getValue(result, "updated");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.adLanguage = UtilSql.getValue(result, "ad_language");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.adLanguager = UtilSql.getValue(result, "ad_languager");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.isactive = UtilSql.getValue(result, "isactive");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.zseShopLanguageId = UtilSql.getValue(result, "zse_shop_language_id");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.language = UtilSql.getValue(result, "language");
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.adUserClient = "";
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.adOrgClient = "";
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.createdby = "";
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.trBgcolor = "";
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.totalCount = "";
        objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data);
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
    OtherLanguages51A035DE7014408EAC587446E8B591C8Data objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[] = new OtherLanguages51A035DE7014408EAC587446E8B591C8Data[vector.size()];
    vector.copyInto(objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data);
    return(objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data);
  }

/**
Create a registry
 */
  public static OtherLanguages51A035DE7014408EAC587446E8B591C8Data[] set(String zseShopId, String adOrgId, String zseShopLanguageId, String updatedby, String updatedbyr, String createdby, String createdbyr, String adClientId, String isactive, String adLanguage)    throws ServletException {
    OtherLanguages51A035DE7014408EAC587446E8B591C8Data objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[] = new OtherLanguages51A035DE7014408EAC587446E8B591C8Data[1];
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0] = new OtherLanguages51A035DE7014408EAC587446E8B591C8Data();
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].created = "";
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].createdbyr = createdbyr;
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].updated = "";
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].updatedTimeStamp = "";
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].updatedby = updatedby;
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].updatedbyr = updatedbyr;
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].zseShopId = zseShopId;
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].zseShopIdr = "";
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].adLanguage = adLanguage;
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].adLanguager = "";
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].isactive = isactive;
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].adClientId = adClientId;
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].adOrgId = adOrgId;
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].zseShopLanguageId = zseShopLanguageId;
    objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data[0].language = "";
    return objectOtherLanguages51A035DE7014408EAC587446E8B591C8Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef86208F39597B43CC8FF18F73E43EC90C_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef570AE651652344769080FDE8C9FCF52D_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        SELECT zse_shop_language.ZSE_Shop_ID AS NAME" +
      "        FROM zse_shop_language" +
      "        WHERE zse_shop_language.ZSE_Shop_Language_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String zseShopId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))) AS NAME FROM zse_shop left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shop.ZSE_Shop_ID = table1.ZSE_Shop_ID) WHERE zse_shop.ZSE_Shop_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String zseShopId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))) AS NAME FROM zse_shop left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shop.ZSE_Shop_ID = table1.ZSE_Shop_ID) WHERE zse_shop.ZSE_Shop_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);

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
      "        UPDATE zse_shop_language" +
      "        SET ZSE_Shop_ID = (?) , AD_Language = (?) , Isactive = (?) , AD_Client_ID = (?) , AD_Org_ID = (?) , ZSE_Shop_Language_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_shop_language.ZSE_Shop_Language_ID = ? " +
      "                 AND zse_shop_language.ZSE_Shop_ID = ? " +
      "        AND zse_shop_language.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shop_language.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopLanguageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopLanguageId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
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
      "        INSERT INTO zse_shop_language " +
      "        (ZSE_Shop_ID, AD_Language, Isactive, AD_Client_ID, AD_Org_ID, ZSE_Shop_Language_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopLanguageId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String zseShopId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_shop_language" +
      "        WHERE zse_shop_language.ZSE_Shop_Language_ID = ? " +
      "                 AND zse_shop_language.ZSE_Shop_ID = ? " +
      "        AND zse_shop_language.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shop_language.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String zseShopId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_shop_language" +
      "        WHERE zse_shop_language.ZSE_Shop_Language_ID = ? " +
      "                 AND zse_shop_language.ZSE_Shop_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);

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
      "          FROM zse_shop_language" +
      "         WHERE zse_shop_language.ZSE_Shop_Language_ID = ? ";

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
      "          FROM zse_shop_language" +
      "         WHERE zse_shop_language.ZSE_Shop_Language_ID = ? ";

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
