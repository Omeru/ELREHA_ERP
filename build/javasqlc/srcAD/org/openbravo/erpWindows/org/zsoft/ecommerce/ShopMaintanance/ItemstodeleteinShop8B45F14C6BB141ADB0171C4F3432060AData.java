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
class ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData implements FieldProvider {
static Logger log4j = Logger.getLogger(ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseShopId;
  public String zseShopIdr;
  public String item;
  public String externalid;
  public String parentid;
  public String executionflag;
  public String adOrgId;
  public String adClientId;
  public String isactive;
  public String zseShopdeletelogId;
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
    else if (fieldName.equalsIgnoreCase("item"))
      return item;
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("parentid"))
      return parentid;
    else if (fieldName.equalsIgnoreCase("executionflag"))
      return executionflag;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("zse_shopdeletelog_id") || fieldName.equals("zseShopdeletelogId"))
      return zseShopdeletelogId;
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
  public static ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseShopId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, zseShopId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String zseShopId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_shopdeletelog.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shopdeletelog.CreatedBy) as CreatedByR, " +
      "        to_char(zse_shopdeletelog.Updated, ?) as updated, " +
      "        to_char(zse_shopdeletelog.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_shopdeletelog.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shopdeletelog.UpdatedBy) as UpdatedByR," +
      "        zse_shopdeletelog.ZSE_Shop_ID, " +
      "(CASE WHEN zse_shopdeletelog.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "zse_shopdeletelog.Item, " +
      "zse_shopdeletelog.Externalid, " +
      "zse_shopdeletelog.Parentid, " +
      "zse_shopdeletelog.Executionflag, " +
      "zse_shopdeletelog.AD_Org_ID, " +
      "zse_shopdeletelog.AD_Client_ID, " +
      "COALESCE(zse_shopdeletelog.Isactive, 'N') AS Isactive, " +
      "zse_shopdeletelog.ZSE_Shopdeletelog_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_shopdeletelog left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shopdeletelog.ZSE_Shop_ID = table1.ZSE_Shop_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((zseShopId==null || zseShopId.equals(""))?"":"  AND zse_shopdeletelog.ZSE_Shop_ID = ?  ");
    strSql = strSql + 
      "        AND zse_shopdeletelog.ZSE_Shopdeletelog_ID = ? " +
      "        AND zse_shopdeletelog.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_shopdeletelog.AD_Org_ID IN (";
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
        ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData = new ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData();
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.created = UtilSql.getValue(result, "created");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.updated = UtilSql.getValue(result, "updated");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.updatedby = UtilSql.getValue(result, "updatedby");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.item = UtilSql.getValue(result, "item");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.externalid = UtilSql.getValue(result, "externalid");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.parentid = UtilSql.getValue(result, "parentid");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.executionflag = UtilSql.getValue(result, "executionflag");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.isactive = UtilSql.getValue(result, "isactive");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.zseShopdeletelogId = UtilSql.getValue(result, "zse_shopdeletelog_id");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.language = UtilSql.getValue(result, "language");
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.adUserClient = "";
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.adOrgClient = "";
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.createdby = "";
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.trBgcolor = "";
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.totalCount = "";
        objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData);
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
    ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[] = new ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[vector.size()];
    vector.copyInto(objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData);
    return(objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData);
  }

/**
Create a registry
 */
  public static ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[] set(String zseShopId, String adClientId, String isactive, String item, String executionflag, String adOrgId, String updatedby, String updatedbyr, String parentid, String createdby, String createdbyr, String zseShopdeletelogId, String externalid)    throws ServletException {
    ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[] = new ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[1];
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0] = new ItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData();
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].created = "";
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].createdbyr = createdbyr;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].updated = "";
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].updatedTimeStamp = "";
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].updatedby = updatedby;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].updatedbyr = updatedbyr;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].zseShopId = zseShopId;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].zseShopIdr = "";
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].item = item;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].externalid = externalid;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].parentid = parentid;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].executionflag = executionflag;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].adOrgId = adOrgId;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].adClientId = adClientId;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].isactive = isactive;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].zseShopdeletelogId = zseShopdeletelogId;
    objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData[0].language = "";
    return objectItemstodeleteinShop8B45F14C6BB141ADB0171C4F3432060AData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef62B538BDD6D447F7A06B05199DADCEBD_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef1AA85C0202124802A1CBEAC59E61F34C_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        SELECT zse_shopdeletelog.ZSE_Shop_ID AS NAME" +
      "        FROM zse_shopdeletelog" +
      "        WHERE zse_shopdeletelog.ZSE_Shopdeletelog_ID = ?";

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
      "        UPDATE zse_shopdeletelog" +
      "        SET ZSE_Shop_ID = (?) , Item = (?) , Externalid = (?) , Parentid = (?) , Executionflag = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , Isactive = (?) , ZSE_Shopdeletelog_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_shopdeletelog.ZSE_Shopdeletelog_ID = ? " +
      "                 AND zse_shopdeletelog.ZSE_Shop_ID = ? " +
      "        AND zse_shopdeletelog.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shopdeletelog.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, item);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, executionflag);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopdeletelogId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopdeletelogId);
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
      "        INSERT INTO zse_shopdeletelog " +
      "        (ZSE_Shop_ID, Item, Externalid, Parentid, Executionflag, AD_Org_ID, AD_Client_ID, Isactive, ZSE_Shopdeletelog_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, item);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, parentid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, executionflag);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopdeletelogId);
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
      "        DELETE FROM zse_shopdeletelog" +
      "        WHERE zse_shopdeletelog.ZSE_Shopdeletelog_ID = ? " +
      "                 AND zse_shopdeletelog.ZSE_Shop_ID = ? " +
      "        AND zse_shopdeletelog.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shopdeletelog.AD_Org_ID IN (";
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
      "        DELETE FROM zse_shopdeletelog" +
      "        WHERE zse_shopdeletelog.ZSE_Shopdeletelog_ID = ? " +
      "                 AND zse_shopdeletelog.ZSE_Shop_ID = ? ";

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
      "          FROM zse_shopdeletelog" +
      "         WHERE zse_shopdeletelog.ZSE_Shopdeletelog_ID = ? ";

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
      "          FROM zse_shopdeletelog" +
      "         WHERE zse_shopdeletelog.ZSE_Shopdeletelog_ID = ? ";

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
