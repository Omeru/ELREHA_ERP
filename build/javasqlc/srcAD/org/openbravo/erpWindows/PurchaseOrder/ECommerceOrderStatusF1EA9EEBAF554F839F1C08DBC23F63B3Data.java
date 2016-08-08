//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.PurchaseOrder;

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
class ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data implements FieldProvider {
static Logger log4j = Logger.getLogger(ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cOrderId;
  public String cOrderIdr;
  public String zseShopId;
  public String zseShopIdr;
  public String status;
  public String statusr;
  public String shopoderno;
  public String message;
  public String externalid;
  public String datedelivered;
  public String shipper;
  public String trackingno;
  public String issotrx;
  public String adClientId;
  public String adOrgId;
  public String isactive;
  public String zseShoporderstatusId;
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
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("c_order_idr") || fieldName.equals("cOrderIdr"))
      return cOrderIdr;
    else if (fieldName.equalsIgnoreCase("zse_shop_id") || fieldName.equals("zseShopId"))
      return zseShopId;
    else if (fieldName.equalsIgnoreCase("zse_shop_idr") || fieldName.equals("zseShopIdr"))
      return zseShopIdr;
    else if (fieldName.equalsIgnoreCase("status"))
      return status;
    else if (fieldName.equalsIgnoreCase("statusr"))
      return statusr;
    else if (fieldName.equalsIgnoreCase("shopoderno"))
      return shopoderno;
    else if (fieldName.equalsIgnoreCase("message"))
      return message;
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("datedelivered"))
      return datedelivered;
    else if (fieldName.equalsIgnoreCase("shipper"))
      return shipper;
    else if (fieldName.equalsIgnoreCase("trackingno"))
      return trackingno;
    else if (fieldName.equalsIgnoreCase("issotrx"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("zse_shoporderstatus_id") || fieldName.equals("zseShoporderstatusId"))
      return zseShoporderstatusId;
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
  public static ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cOrderId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_shoporderstatus.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shoporderstatus.CreatedBy) as CreatedByR, " +
      "        to_char(zse_shoporderstatus.Updated, ?) as updated, " +
      "        to_char(zse_shoporderstatus.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_shoporderstatus.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shoporderstatus.UpdatedBy) as UpdatedByR," +
      "        zse_shoporderstatus.C_Order_ID, " +
      "(CASE WHEN zse_shoporderstatus.C_Order_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table1.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))),'') ) END) AS C_Order_IDR, " +
      "zse_shoporderstatus.ZSE_Shop_ID, " +
      "(CASE WHEN zse_shoporderstatus.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "zse_shoporderstatus.Status, " +
      "(CASE WHEN zse_shoporderstatus.Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS StatusR, " +
      "zse_shoporderstatus.Shopoderno, " +
      "zse_shoporderstatus.Message, " +
      "zse_shoporderstatus.Externalid, " +
      "zse_shoporderstatus.Datedelivered, " +
      "zse_shoporderstatus.Shipper, " +
      "zse_shoporderstatus.Trackingno, " +
      "COALESCE(zse_shoporderstatus.Issotrx, 'N') AS Issotrx, " +
      "zse_shoporderstatus.AD_Client_ID, " +
      "zse_shoporderstatus.AD_Org_ID, " +
      "COALESCE(zse_shoporderstatus.Isactive, 'N') AS Isactive, " +
      "zse_shoporderstatus.ZSE_Shoporderstatus_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_shoporderstatus left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table1 on (zse_shoporderstatus.C_Order_ID = table1.C_Order_ID) left join (select ZSE_Shop_ID, Value from ZSE_Shop) table2 on (zse_shoporderstatus.ZSE_Shop_ID = table2.ZSE_Shop_ID) left join ad_ref_list_v list1 on (zse_shoporderstatus.Status = list1.value and list1.ad_reference_id = '9C600D5A50A24147B7613C160F5EA5E9' and list1.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cOrderId==null || cOrderId.equals(""))?"":"  AND zse_shoporderstatus.C_Order_ID = ?  ");
    strSql = strSql + 
      "        AND zse_shoporderstatus.ZSE_Shoporderstatus_ID = ? " +
      "        AND zse_shoporderstatus.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zse_shoporderstatus.AD_Org_ID IN (";
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
      if (cOrderId != null && !(cOrderId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
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
        ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data = new ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data();
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.created = UtilSql.getValue(result, "created");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.updated = UtilSql.getValue(result, "updated");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.cOrderIdr = UtilSql.getValue(result, "c_order_idr");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.status = UtilSql.getValue(result, "status");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.statusr = UtilSql.getValue(result, "statusr");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.shopoderno = UtilSql.getValue(result, "shopoderno");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.message = UtilSql.getValue(result, "message");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.externalid = UtilSql.getValue(result, "externalid");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.datedelivered = UtilSql.getDateValue(result, "datedelivered", "dd-MM-yyyy");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.shipper = UtilSql.getValue(result, "shipper");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.trackingno = UtilSql.getValue(result, "trackingno");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.issotrx = UtilSql.getValue(result, "issotrx");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.isactive = UtilSql.getValue(result, "isactive");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.zseShoporderstatusId = UtilSql.getValue(result, "zse_shoporderstatus_id");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.language = UtilSql.getValue(result, "language");
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.adUserClient = "";
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.adOrgClient = "";
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.createdby = "";
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.trBgcolor = "";
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.totalCount = "";
        objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data);
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
    ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[] = new ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[vector.size()];
    vector.copyInto(objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data);
    return(objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data);
  }

/**
Create a registry
 */
  public static ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[] set(String cOrderId, String adClientId, String issotrx, String zseShoporderstatusId, String createdby, String createdbyr, String externalid, String shipper, String trackingno, String updatedby, String updatedbyr, String adOrgId, String isactive, String shopoderno, String message, String zseShopId, String status, String datedelivered)    throws ServletException {
    ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[] = new ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[1];
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0] = new ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data();
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].created = "";
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].createdbyr = createdbyr;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].updated = "";
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].updatedTimeStamp = "";
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].updatedby = updatedby;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].updatedbyr = updatedbyr;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].cOrderId = cOrderId;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].cOrderIdr = "";
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].zseShopId = zseShopId;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].zseShopIdr = "";
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].status = status;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].statusr = "";
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].shopoderno = shopoderno;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].message = message;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].externalid = externalid;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].datedelivered = datedelivered;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].shipper = shipper;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].trackingno = trackingno;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].issotrx = issotrx;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].adClientId = adClientId;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].adOrgId = adOrgId;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].isactive = isactive;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].zseShoporderstatusId = zseShoporderstatusId;
    objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0].language = "";
    return objectECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef05E4F0D6DB1F4BDFB370BCE936346934_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefA80A1F8192FC4B84A56DE233AFBB6453_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        SELECT zse_shoporderstatus.C_Order_ID AS NAME" +
      "        FROM zse_shoporderstatus" +
      "        WHERE zse_shoporderstatus.ZSE_Shoporderstatus_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Name), '')) || ' - ' || TO_CHAR(table1.DateOrdered, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Order left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table1 on (C_Order.C_Order_ID = table1.C_Order_ID) WHERE C_Order.C_Order_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Name), '')) || ' - ' || TO_CHAR(table1.DateOrdered, 'DD-MM-YYYY') || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.GrandTotal), ''))) AS NAME FROM C_Order left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table1 on (C_Order.C_Order_ID = table1.C_Order_ID) WHERE C_Order.C_Order_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

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
      "        UPDATE zse_shoporderstatus" +
      "        SET C_Order_ID = (?) , ZSE_Shop_ID = (?) , Status = (?) , Shopoderno = (?) , Message = (?) , Externalid = (?) , Datedelivered = TO_DATE(?) , Shipper = (?) , Trackingno = (?) , Issotrx = (?) , AD_Client_ID = (?) , AD_Org_ID = (?) , Isactive = (?) , ZSE_Shoporderstatus_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_shoporderstatus.ZSE_Shoporderstatus_ID = ? " +
      "                 AND zse_shoporderstatus.C_Order_ID = ? " +
      "        AND zse_shoporderstatus.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shoporderstatus.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopoderno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, message);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shipper);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trackingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShoporderstatusId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShoporderstatusId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
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
      "        INSERT INTO zse_shoporderstatus " +
      "        (C_Order_ID, ZSE_Shop_ID, Status, Shopoderno, Message, Externalid, Datedelivered, Shipper, Trackingno, Issotrx, AD_Client_ID, AD_Org_ID, Isactive, ZSE_Shoporderstatus_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopoderno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, message);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shipper);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trackingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShoporderstatusId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cOrderId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_shoporderstatus" +
      "        WHERE zse_shoporderstatus.ZSE_Shoporderstatus_ID = ? " +
      "                 AND zse_shoporderstatus.C_Order_ID = ? " +
      "        AND zse_shoporderstatus.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zse_shoporderstatus.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM zse_shoporderstatus" +
      "        WHERE zse_shoporderstatus.ZSE_Shoporderstatus_ID = ? " +
      "                 AND zse_shoporderstatus.C_Order_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

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
      "          FROM zse_shoporderstatus" +
      "         WHERE zse_shoporderstatus.ZSE_Shoporderstatus_ID = ? ";

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
      "          FROM zse_shoporderstatus" +
      "         WHERE zse_shoporderstatus.ZSE_Shoporderstatus_ID = ? ";

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
