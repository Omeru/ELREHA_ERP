//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.com.elreha.sales.SalesProduct;

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
class SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data implements FieldProvider {
static Logger log4j = Logger.getLogger(SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String snrMasterdataId;
  public String mProductId;
  public String mProductIdr;
  public String serialnumber;
  public String adClientId;
  public String firstseen;
  public String adOrgId;
  public String movementdate;
  public String movementtype;
  public String movementtyper;
  public String mLocatorId;
  public String mLocatorIdr;
  public String cProjecttaskId;
  public String cProjecttaskIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String mInoutlineId;
  public String mInoutlineIdr;
  public String mInventorylineId;
  public String mInventorylineIdr;
  public String mInternalConsumptionlineId;
  public String mInternalConsumptionlineIdr;
  public String mMovementlineId;
  public String mMovementlineIdr;
  public String adUserId;
  public String adUserIdr;
  public String sendmail;
  public String snrselfjoin;
  public String snrselfjoinr;
  public String description;
  public String guaranteedate;
  public String model;
  public String orderreference;
  public String identifier2;
  public String vendor;
  public String externaltrackingno;
  public String identifier3;
  public String remark;
  public String itemname;
  public String location;
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
    else if (fieldName.equalsIgnoreCase("snr_masterdata_id") || fieldName.equals("snrMasterdataId"))
      return snrMasterdataId;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("serialnumber"))
      return serialnumber;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("firstseen"))
      return firstseen;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("movementdate"))
      return movementdate;
    else if (fieldName.equalsIgnoreCase("movementtype"))
      return movementtype;
    else if (fieldName.equalsIgnoreCase("movementtyper"))
      return movementtyper;
    else if (fieldName.equalsIgnoreCase("m_locator_id") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("m_locator_idr") || fieldName.equals("mLocatorIdr"))
      return mLocatorIdr;
    else if (fieldName.equalsIgnoreCase("c_projecttask_id") || fieldName.equals("cProjecttaskId"))
      return cProjecttaskId;
    else if (fieldName.equalsIgnoreCase("c_projecttask_idr") || fieldName.equals("cProjecttaskIdr"))
      return cProjecttaskIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_idr") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("m_inoutline_id") || fieldName.equals("mInoutlineId"))
      return mInoutlineId;
    else if (fieldName.equalsIgnoreCase("m_inoutline_idr") || fieldName.equals("mInoutlineIdr"))
      return mInoutlineIdr;
    else if (fieldName.equalsIgnoreCase("m_inventoryline_id") || fieldName.equals("mInventorylineId"))
      return mInventorylineId;
    else if (fieldName.equalsIgnoreCase("m_inventoryline_idr") || fieldName.equals("mInventorylineIdr"))
      return mInventorylineIdr;
    else if (fieldName.equalsIgnoreCase("m_internal_consumptionline_id") || fieldName.equals("mInternalConsumptionlineId"))
      return mInternalConsumptionlineId;
    else if (fieldName.equalsIgnoreCase("m_internal_consumptionline_idr") || fieldName.equals("mInternalConsumptionlineIdr"))
      return mInternalConsumptionlineIdr;
    else if (fieldName.equalsIgnoreCase("m_movementline_id") || fieldName.equals("mMovementlineId"))
      return mMovementlineId;
    else if (fieldName.equalsIgnoreCase("m_movementline_idr") || fieldName.equals("mMovementlineIdr"))
      return mMovementlineIdr;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("ad_user_idr") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("sendmail"))
      return sendmail;
    else if (fieldName.equalsIgnoreCase("snrselfjoin"))
      return snrselfjoin;
    else if (fieldName.equalsIgnoreCase("snrselfjoinr"))
      return snrselfjoinr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("guaranteedate"))
      return guaranteedate;
    else if (fieldName.equalsIgnoreCase("model"))
      return model;
    else if (fieldName.equalsIgnoreCase("orderreference"))
      return orderreference;
    else if (fieldName.equalsIgnoreCase("identifier2"))
      return identifier2;
    else if (fieldName.equalsIgnoreCase("vendor"))
      return vendor;
    else if (fieldName.equalsIgnoreCase("externaltrackingno"))
      return externaltrackingno;
    else if (fieldName.equalsIgnoreCase("identifier3"))
      return identifier3;
    else if (fieldName.equalsIgnoreCase("remark"))
      return remark;
    else if (fieldName.equalsIgnoreCase("itemname"))
      return itemname;
    else if (fieldName.equalsIgnoreCase("location"))
      return location;
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
  public static SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String M_PRODUCT_ID, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, M_PRODUCT_ID, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String M_PRODUCT_ID, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(SNR_Masterdata.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = SNR_Masterdata.CreatedBy) as CreatedByR, " +
      "        to_char(SNR_Masterdata.Updated, ?) as updated, " +
      "        to_char(SNR_Masterdata.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        SNR_Masterdata.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = SNR_Masterdata.UpdatedBy) as UpdatedByR," +
      "        SNR_Masterdata.SNR_Masterdata_ID, " +
      "SNR_Masterdata.M_Product_ID, " +
      "(CASE WHEN SNR_Masterdata.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "SNR_Masterdata.Serialnumber, " +
      "SNR_Masterdata.AD_Client_ID, " +
      "SNR_Masterdata.Firstseen, " +
      "SNR_Masterdata.AD_Org_ID, " +
      "SNR_Masterdata.Movementdate, " +
      "SNR_Masterdata.Movementtype, " +
      "(CASE WHEN SNR_Masterdata.Movementtype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS MovementtypeR, " +
      "SNR_Masterdata.M_Locator_ID, " +
      "(CASE WHEN SNR_Masterdata.M_Locator_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'') ) END) AS M_Locator_IDR, " +
      "SNR_Masterdata.C_Projecttask_ID, " +
      "(CASE WHEN SNR_Masterdata.C_Projecttask_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_Projecttask_IDR, " +
      "SNR_Masterdata.C_Bpartner_ID, " +
      "(CASE WHEN SNR_Masterdata.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "SNR_Masterdata.C_Bpartner_Location_ID, " +
      "(CASE WHEN SNR_Masterdata.C_Bpartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_Bpartner_Location_IDR, " +
      "SNR_Masterdata.m_inoutline_id, " +
      "(CASE WHEN SNR_Masterdata.m_inoutline_id IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table8.MovementDate, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL9.Name IS NULL THEN TO_CHAR(table9.Name) ELSE TO_CHAR(tableTRL9.Name) END)), ''))),'') ) END) AS m_inoutline_idR, " +
      "SNR_Masterdata.m_inventoryline_id, " +
      "(CASE WHEN SNR_Masterdata.m_inventoryline_id IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.QtyCount), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Name), ''))),'') ) END) AS m_inventoryline_idR, " +
      "SNR_Masterdata.m_internal_consumptionline_id, " +
      "(CASE WHEN SNR_Masterdata.m_internal_consumptionline_id IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL14.Name IS NULL THEN TO_CHAR(table14.Name) ELSE TO_CHAR(tableTRL14.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.MovementQty), ''))),'') ) END) AS m_internal_consumptionline_idR, " +
      "SNR_Masterdata.m_movementline_id, " +
      "(CASE WHEN SNR_Masterdata.m_movementline_id IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.MovementQty), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table16.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table16.Name), ''))),'') ) END) AS m_movementline_idR, " +
      "SNR_Masterdata.AD_User_ID, " +
      "(CASE WHEN SNR_Masterdata.AD_User_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table17.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "SNR_Masterdata.Sendmail, " +
      "SNR_Masterdata.Snrselfjoin, " +
      "(CASE WHEN SNR_Masterdata.Snrselfjoin IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table18.name), ''))),'') ) END) AS SnrselfjoinR, " +
      "SNR_Masterdata.Description, " +
      "SNR_Masterdata.Guaranteedate, " +
      "SNR_Masterdata.Model, " +
      "SNR_Masterdata.Orderreference, " +
      "SNR_Masterdata.Identifier2, " +
      "SNR_Masterdata.Vendor, " +
      "SNR_Masterdata.Externaltrackingno, " +
      "SNR_Masterdata.Identifier3, " +
      "SNR_Masterdata.Remark, " +
      "SNR_Masterdata.Itemname, " +
      "SNR_Masterdata.Location, " +
      "COALESCE(SNR_Masterdata.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM SNR_Masterdata left join (select M_Product_ID, Value, Name from M_Product) table1 on (SNR_Masterdata.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join ad_ref_list_v list1 on (SNR_Masterdata.Movementtype = list1.value and list1.ad_reference_id = '189' and list1.ad_language = ?)  left join (select M_Locator_ID, Value from M_Locator) table2 on (SNR_Masterdata.M_Locator_ID = table2.M_Locator_ID) left join (select C_Projecttask_ID, Name, C_Project_ID from C_Projecttask) table3 on (SNR_Masterdata.C_Projecttask_ID = table3.C_Projecttask_ID) left join (select C_Project_ID, Value, Name from C_Project) table4 on (table3.C_Project_ID = table4.C_Project_ID) left join (select C_BPartner_ID, Name from C_BPartner) table5 on (SNR_Masterdata.C_Bpartner_ID = table5.C_BPartner_ID) left join (select C_Bpartner_Location_ID, Name from C_Bpartner_Location) table6 on (SNR_Masterdata.C_Bpartner_Location_ID = table6.C_Bpartner_Location_ID) left join (select m_inoutline_id, M_InOut_ID, M_Product_ID from m_inoutline) table7 on (SNR_Masterdata.m_inoutline_id = table7.m_inoutline_id) left join (select M_InOut_ID, DocumentNo, MovementDate from M_InOut) table8 on (table7.M_InOut_ID = table8.M_InOut_ID) left join (select M_Product_ID, Value, Name from M_Product) table9 on (table7.M_Product_ID = table9.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL9 on (table9.M_Product_ID = tableTRL9.M_Product_ID and tableTRL9.AD_Language = ?)  left join (select m_inventoryline_id, Line, QtyCount, M_Inventory_ID, Name from m_inventoryline) table10 on (SNR_Masterdata.m_inventoryline_id = table10.m_inventoryline_id) left join (select M_Inventory_ID, Name from M_Inventory) table11 on (table10.M_Inventory_ID = table11.M_Inventory_ID) left join (select m_internal_consumptionline_id, M_Internal_Consumption_ID, M_Product_ID, MovementQty from m_internal_consumptionline) table12 on (SNR_Masterdata.m_internal_consumptionline_id = table12.m_internal_consumptionline_id) left join (select M_Internal_Consumption_ID, Name from M_Internal_Consumption) table13 on (table12.M_Internal_Consumption_ID = table13.M_Internal_Consumption_ID) left join (select M_Product_ID, Value, Name from M_Product) table14 on (table12.M_Product_ID = table14.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL14 on (table14.M_Product_ID = tableTRL14.M_Product_ID and tableTRL14.AD_Language = ?)  left join (select m_movementline_id, Line, MovementQty, M_Movement_ID from m_movementline) table15 on (SNR_Masterdata.m_movementline_id = table15.m_movementline_id) left join (select M_Movement_ID, DocumentNo, Name from M_Movement) table16 on (table15.M_Movement_ID = table16.M_Movement_ID) left join (select AD_User_ID, Name from AD_User) table17 on (SNR_Masterdata.AD_User_ID = table17.AD_User_ID) left join (select SNR_Masterdata_ID, name from snr_masterdatadropdown_v) table18 on (SNR_Masterdata.Snrselfjoin =  table18.SNR_Masterdata_ID)" +
      "        WHERE 2=2 " +
      " AND SNR_MASTERDATA.M_Product_ID = ?" +
      "        AND 1=1 " +
      "        AND SNR_Masterdata.SNR_Masterdata_ID = ? " +
      "        AND SNR_Masterdata.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND SNR_Masterdata.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_PRODUCT_ID);
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
        SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data = new SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data();
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.created = UtilSql.getValue(result, "created");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.updated = UtilSql.getValue(result, "updated");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.snrMasterdataId = UtilSql.getValue(result, "snr_masterdata_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.serialnumber = UtilSql.getValue(result, "serialnumber");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.firstseen = UtilSql.getDateValue(result, "firstseen", "dd-MM-yyyy");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.movementdate = UtilSql.getDateValue(result, "movementdate", "dd-MM-yyyy");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.movementtype = UtilSql.getValue(result, "movementtype");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.movementtyper = UtilSql.getValue(result, "movementtyper");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mLocatorId = UtilSql.getValue(result, "m_locator_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mLocatorIdr = UtilSql.getValue(result, "m_locator_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.cProjecttaskId = UtilSql.getValue(result, "c_projecttask_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.cProjecttaskIdr = UtilSql.getValue(result, "c_projecttask_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.cBpartnerLocationIdr = UtilSql.getValue(result, "c_bpartner_location_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mInoutlineId = UtilSql.getValue(result, "m_inoutline_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mInoutlineIdr = UtilSql.getValue(result, "m_inoutline_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mInventorylineId = UtilSql.getValue(result, "m_inventoryline_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mInventorylineIdr = UtilSql.getValue(result, "m_inventoryline_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mInternalConsumptionlineId = UtilSql.getValue(result, "m_internal_consumptionline_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mInternalConsumptionlineIdr = UtilSql.getValue(result, "m_internal_consumptionline_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mMovementlineId = UtilSql.getValue(result, "m_movementline_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.mMovementlineIdr = UtilSql.getValue(result, "m_movementline_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.adUserIdr = UtilSql.getValue(result, "ad_user_idr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.sendmail = UtilSql.getValue(result, "sendmail");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.snrselfjoin = UtilSql.getValue(result, "snrselfjoin");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.snrselfjoinr = UtilSql.getValue(result, "snrselfjoinr");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.description = UtilSql.getValue(result, "description");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.guaranteedate = UtilSql.getDateValue(result, "guaranteedate", "dd-MM-yyyy");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.model = UtilSql.getValue(result, "model");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.orderreference = UtilSql.getValue(result, "orderreference");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.identifier2 = UtilSql.getValue(result, "identifier2");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.vendor = UtilSql.getValue(result, "vendor");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.externaltrackingno = UtilSql.getValue(result, "externaltrackingno");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.identifier3 = UtilSql.getValue(result, "identifier3");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.remark = UtilSql.getValue(result, "remark");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.itemname = UtilSql.getValue(result, "itemname");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.location = UtilSql.getValue(result, "location");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.isactive = UtilSql.getValue(result, "isactive");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.language = UtilSql.getValue(result, "language");
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.adUserClient = "";
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.adOrgClient = "";
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.createdby = "";
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.trBgcolor = "";
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.totalCount = "";
        objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data);
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
    SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[] = new SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[vector.size()];
    vector.copyInto(objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data);
    return(objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data);
  }

/**
Create a registry
 */
  public static SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[] set(String orderreference, String adClientId, String cBpartnerLocationId, String adUserId, String snrMasterdataId, String createdby, String createdbyr, String description, String firstseen, String identifier2, String externaltrackingno, String movementdate, String serialnumber, String mLocatorId, String mLocatorIdr, String mInventorylineId, String adOrgId, String identifier3, String mProductId, String mProductIdr, String model, String sendmail, String itemname, String mInoutlineId, String snrselfjoin, String movementtype, String location, String cBpartnerId, String cBpartnerIdr, String mMovementlineId, String guaranteedate, String mInternalConsumptionlineId, String isactive, String cProjecttaskId, String updatedby, String updatedbyr, String remark, String vendor)    throws ServletException {
    SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[] = new SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[1];
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0] = new SerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data();
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].created = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].createdbyr = createdbyr;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].updated = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].updatedTimeStamp = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].updatedby = updatedby;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].updatedbyr = updatedbyr;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].snrMasterdataId = snrMasterdataId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mProductId = mProductId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mProductIdr = mProductIdr;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].serialnumber = serialnumber;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].adClientId = adClientId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].firstseen = firstseen;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].adOrgId = adOrgId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].movementdate = movementdate;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].movementtype = movementtype;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].movementtyper = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mLocatorId = mLocatorId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mLocatorIdr = mLocatorIdr;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].cProjecttaskId = cProjecttaskId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].cProjecttaskIdr = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].cBpartnerId = cBpartnerId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].cBpartnerIdr = cBpartnerIdr;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].cBpartnerLocationId = cBpartnerLocationId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].cBpartnerLocationIdr = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mInoutlineId = mInoutlineId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mInoutlineIdr = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mInventorylineId = mInventorylineId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mInventorylineIdr = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mInternalConsumptionlineId = mInternalConsumptionlineId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mInternalConsumptionlineIdr = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mMovementlineId = mMovementlineId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].mMovementlineIdr = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].adUserId = adUserId;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].adUserIdr = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].sendmail = sendmail;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].snrselfjoin = snrselfjoin;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].snrselfjoinr = "";
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].description = description;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].guaranteedate = guaranteedate;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].model = model;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].orderreference = orderreference;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].identifier2 = identifier2;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].vendor = vendor;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].externaltrackingno = externaltrackingno;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].identifier3 = identifier3;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].remark = remark;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].itemname = itemname;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].location = location;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].isactive = isactive;
    objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data[0].language = "";
    return objectSerialNumbers8693D22CA55A4CB5B4338F4C256D9D80Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef317FB8A077064C76918AB109625DA981_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef2C7D9CFB113B43898F40654356D3F22B_1(ConnectionProvider connectionProvider, String M_Locator_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Value), '') ) as M_Locator_ID FROM M_Locator table1 WHERE table1.isActive='Y' AND table1.M_Locator_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Locator_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_locator_id");
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
  public static String selectDefEE5E955AF82E4EBB8CC343AA1BC17A2E_2(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef6CDD97D1255940789152D2FF953D5266_3(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as C_Bpartner_ID FROM C_BPartner table1 WHERE table1.isActive='Y' AND table1.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Bpartner_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_bpartner_id");
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
  public static String selectDef882E0B7E4F8A43E6A5C5B886B0ABE8FD_4(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE SNR_Masterdata" +
      "        SET SNR_Masterdata_ID = (?) , M_Product_ID = (?) , Serialnumber = (?) , AD_Client_ID = (?) , Firstseen = TO_DATE(?) , AD_Org_ID = (?) , Movementdate = TO_DATE(?) , Movementtype = (?) , M_Locator_ID = (?) , C_Projecttask_ID = (?) , C_Bpartner_ID = (?) , C_Bpartner_Location_ID = (?) , m_inoutline_id = (?) , m_inventoryline_id = (?) , m_internal_consumptionline_id = (?) , m_movementline_id = (?) , AD_User_ID = (?) , Sendmail = (?) , Snrselfjoin = (?) , Description = (?) , Guaranteedate = TO_DATE(?) , Model = (?) , Orderreference = (?) , Identifier2 = (?) , Vendor = (?) , Externaltrackingno = (?) , Identifier3 = (?) , Remark = (?) , Itemname = (?) , Location = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE SNR_Masterdata.SNR_Masterdata_ID = ? " +
      "        AND SNR_Masterdata.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND SNR_Masterdata.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrMasterdataId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serialnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, firstseen);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInventorylineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInternalConsumptionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mMovementlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sendmail);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrselfjoin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, model);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, identifier2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externaltrackingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, identifier3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remark);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, itemname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, location);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrMasterdataId);
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
      "        INSERT INTO SNR_Masterdata " +
      "        (SNR_Masterdata_ID, M_Product_ID, Serialnumber, AD_Client_ID, Firstseen, AD_Org_ID, Movementdate, Movementtype, M_Locator_ID, C_Projecttask_ID, C_Bpartner_ID, C_Bpartner_Location_ID, m_inoutline_id, m_inventoryline_id, m_internal_consumptionline_id, m_movementline_id, AD_User_ID, Sendmail, Snrselfjoin, Description, Guaranteedate, Model, Orderreference, Identifier2, Vendor, Externaltrackingno, Identifier3, Remark, Itemname, Location, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_DATE(?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrMasterdataId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serialnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, firstseen);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, movementtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInoutlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInventorylineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mInternalConsumptionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mMovementlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sendmail);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrselfjoin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, model);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, identifier2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externaltrackingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, identifier3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remark);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, itemname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, location);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM SNR_Masterdata" +
      "        WHERE SNR_Masterdata.SNR_Masterdata_ID = ? " +
      "        AND SNR_Masterdata.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND SNR_Masterdata.AD_Org_ID IN (";
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
      "        DELETE FROM SNR_Masterdata" +
      "        WHERE SNR_Masterdata.SNR_Masterdata_ID = ? ";

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
      "          FROM SNR_Masterdata" +
      "         WHERE SNR_Masterdata.SNR_Masterdata_ID = ? ";

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
      "          FROM SNR_Masterdata" +
      "         WHERE SNR_Masterdata.SNR_Masterdata_ID = ? ";

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
