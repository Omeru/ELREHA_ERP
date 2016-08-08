//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.ecommerce.ECommercePOOrderStatus;

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
class ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData implements FieldProvider {
static Logger log4j = Logger.getLogger(ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String zseShopId;
  public String zseShopIdr;
  public String shopoderno;
  public String cOrderId;
  public String cOrderIdr;
  public String status;
  public String statusr;
  public String message;
  public String externalid;
  public String datedelivered;
  public String shipper;
  public String trackingno;
  public String zseShoporderstatusId;
  public String isactive;
  public String adOrgId;
  public String adClientId;
  public String issotrx;
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
    else if (fieldName.equalsIgnoreCase("shopoderno"))
      return shopoderno;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("c_order_idr") || fieldName.equals("cOrderIdr"))
      return cOrderIdr;
    else if (fieldName.equalsIgnoreCase("status"))
      return status;
    else if (fieldName.equalsIgnoreCase("statusr"))
      return statusr;
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
    else if (fieldName.equalsIgnoreCase("zse_shoporderstatus_id") || fieldName.equals("zseShoporderstatusId"))
      return zseShoporderstatusId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("issotrx"))
      return issotrx;
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
  public static ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zse_shoporderstatus.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shoporderstatus.CreatedBy) as CreatedByR, " +
      "        to_char(zse_shoporderstatus.Updated, ?) as updated, " +
      "        to_char(zse_shoporderstatus.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zse_shoporderstatus.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zse_shoporderstatus.UpdatedBy) as UpdatedByR," +
      "        zse_shoporderstatus.ZSE_Shop_ID, " +
      "(CASE WHEN zse_shoporderstatus.ZSE_Shop_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'') ) END) AS ZSE_Shop_IDR, " +
      "zse_shoporderstatus.Shopoderno, " +
      "zse_shoporderstatus.C_Order_ID, " +
      "(CASE WHEN zse_shoporderstatus.C_Order_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table2.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.GrandTotal), ''))),'') ) END) AS C_Order_IDR, " +
      "zse_shoporderstatus.Status, " +
      "(CASE WHEN zse_shoporderstatus.Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS StatusR, " +
      "zse_shoporderstatus.Message, " +
      "zse_shoporderstatus.Externalid, " +
      "zse_shoporderstatus.Datedelivered, " +
      "zse_shoporderstatus.Shipper, " +
      "zse_shoporderstatus.Trackingno, " +
      "zse_shoporderstatus.ZSE_Shoporderstatus_ID, " +
      "COALESCE(zse_shoporderstatus.Isactive, 'N') AS Isactive, " +
      "zse_shoporderstatus.AD_Org_ID, " +
      "zse_shoporderstatus.AD_Client_ID, " +
      "COALESCE(zse_shoporderstatus.Issotrx, 'N') AS Issotrx, " +
      "        ? AS LANGUAGE " +
      "        FROM zse_shoporderstatus left join (select ZSE_Shop_ID, Value from ZSE_Shop) table1 on (zse_shoporderstatus.ZSE_Shop_ID = table1.ZSE_Shop_ID) left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table2 on (zse_shoporderstatus.C_Order_ID = table2.C_Order_ID) left join ad_ref_list_v list1 on (zse_shoporderstatus.Status = list1.value and list1.ad_reference_id = '9C600D5A50A24147B7613C160F5EA5E9' and list1.ad_language = ?) " +
      "        WHERE 2=2 " +
      " AND zse_shoporderstatus.issotrx='N'" +
      "        AND 1=1 " +
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
        ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData = new ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData();
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.created = UtilSql.getValue(result, "created");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.updated = UtilSql.getValue(result, "updated");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.updatedby = UtilSql.getValue(result, "updatedby");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.zseShopIdr = UtilSql.getValue(result, "zse_shop_idr");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.shopoderno = UtilSql.getValue(result, "shopoderno");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.cOrderIdr = UtilSql.getValue(result, "c_order_idr");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.status = UtilSql.getValue(result, "status");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.statusr = UtilSql.getValue(result, "statusr");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.message = UtilSql.getValue(result, "message");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.externalid = UtilSql.getValue(result, "externalid");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.datedelivered = UtilSql.getDateValue(result, "datedelivered", "dd-MM-yyyy");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.shipper = UtilSql.getValue(result, "shipper");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.trackingno = UtilSql.getValue(result, "trackingno");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.zseShoporderstatusId = UtilSql.getValue(result, "zse_shoporderstatus_id");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.isactive = UtilSql.getValue(result, "isactive");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.issotrx = UtilSql.getValue(result, "issotrx");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.language = UtilSql.getValue(result, "language");
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.adUserClient = "";
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.adOrgClient = "";
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.createdby = "";
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.trBgcolor = "";
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.totalCount = "";
        objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData);
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
    ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[] = new ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[vector.size()];
    vector.copyInto(objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData);
    return(objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData);
  }

/**
Create a registry
 */
  public static ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[] set(String issotrx, String zseShoporderstatusId, String adClientId, String createdby, String createdbyr, String shipper, String externalid, String trackingno, String updatedby, String updatedbyr, String adOrgId, String isactive, String shopoderno, String message, String status, String zseShopId, String cOrderId, String datedelivered)    throws ServletException {
    ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[] = new ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[1];
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0] = new ECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData();
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].created = "";
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].createdbyr = createdbyr;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].updated = "";
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].updatedTimeStamp = "";
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].updatedby = updatedby;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].updatedbyr = updatedbyr;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].zseShopId = zseShopId;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].zseShopIdr = "";
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].shopoderno = shopoderno;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].cOrderId = cOrderId;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].cOrderIdr = "";
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].status = status;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].statusr = "";
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].message = message;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].externalid = externalid;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].datedelivered = datedelivered;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].shipper = shipper;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].trackingno = trackingno;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].zseShoporderstatusId = zseShoporderstatusId;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].isactive = isactive;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].adOrgId = adOrgId;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].adClientId = adClientId;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].issotrx = issotrx;
    objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData[0].language = "";
    return objectECommercePOOrderStatusA0A4E63B50DE49F58D1300757123AF5FData;
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE zse_shoporderstatus" +
      "        SET ZSE_Shop_ID = (?) , Shopoderno = (?) , C_Order_ID = (?) , Status = (?) , Message = (?) , Externalid = (?) , Datedelivered = TO_DATE(?) , Shipper = (?) , Trackingno = (?) , ZSE_Shoporderstatus_ID = (?) , Isactive = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , Issotrx = (?) , updated = now(), updatedby = ? " +
      "        WHERE zse_shoporderstatus.ZSE_Shoporderstatus_ID = ? " +
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopoderno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, message);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shipper);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trackingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShoporderstatusId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShoporderstatusId);
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
      "        (ZSE_Shop_ID, Shopoderno, C_Order_ID, Status, Message, Externalid, Datedelivered, Shipper, Trackingno, ZSE_Shoporderstatus_ID, Isactive, AD_Org_ID, AD_Client_ID, Issotrx, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopoderno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, message);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shipper);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trackingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zseShoporderstatusId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
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
      "        DELETE FROM zse_shoporderstatus" +
      "        WHERE zse_shoporderstatus.ZSE_Shoporderstatus_ID = ? " +
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
      "        DELETE FROM zse_shoporderstatus" +
      "        WHERE zse_shoporderstatus.ZSE_Shoporderstatus_ID = ? ";

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
