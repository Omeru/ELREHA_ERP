//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.zsoft.mrp.PurchasingPlan;

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
class Lines800259Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Lines800259Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String mrpRunPurchaseId;
  public String mrpRunPurchaseIdr;
  public String mProductId;
  public String mProductIdr;
  public String qty;
  public String neededqty;
  public String totaldemand;
  public String cUomId;
  public String cUomIdr;
  public String quantityorder;
  public String mProductUomId;
  public String mProductUomIdr;
  public String planneddate;
  public String mManufacturerId;
  public String mManufacturerIdr;
  public String inouttrxtype;
  public String inouttrxtyper;
  public String mRequisitionlineId;
  public String mRequisitionlineIdr;
  public String cProjecttaskId;
  public String cProjecttaskIdr;
  public String mrpSalesforecastlineId;
  public String mrpSalesforecastlineIdr;
  public String cOrderlineId;
  public String cOrderlineIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String pricelist;
  public String mWarehouseId;
  public String mWarehouseIdr;
  public String framecontractline;
  public String framecontractliner;
  public String adOrgId;
  public String adOrgIdr;
  public String cumqty;
  public String isactive;
  public String plannedorderdate;
  public String adClientId;
  public String isfixed;
  public String mrpRunPurchaselineId;
  public String iscompleted;
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
    else if (fieldName.equalsIgnoreCase("mrp_run_purchase_id") || fieldName.equals("mrpRunPurchaseId"))
      return mrpRunPurchaseId;
    else if (fieldName.equalsIgnoreCase("mrp_run_purchase_idr") || fieldName.equals("mrpRunPurchaseIdr"))
      return mrpRunPurchaseIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("neededqty"))
      return neededqty;
    else if (fieldName.equalsIgnoreCase("totaldemand"))
      return totaldemand;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("quantityorder"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("m_product_uom_id") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("m_product_uom_idr") || fieldName.equals("mProductUomIdr"))
      return mProductUomIdr;
    else if (fieldName.equalsIgnoreCase("planneddate"))
      return planneddate;
    else if (fieldName.equalsIgnoreCase("m_manufacturer_id") || fieldName.equals("mManufacturerId"))
      return mManufacturerId;
    else if (fieldName.equalsIgnoreCase("m_manufacturer_idr") || fieldName.equals("mManufacturerIdr"))
      return mManufacturerIdr;
    else if (fieldName.equalsIgnoreCase("inouttrxtype"))
      return inouttrxtype;
    else if (fieldName.equalsIgnoreCase("inouttrxtyper"))
      return inouttrxtyper;
    else if (fieldName.equalsIgnoreCase("m_requisitionline_id") || fieldName.equals("mRequisitionlineId"))
      return mRequisitionlineId;
    else if (fieldName.equalsIgnoreCase("m_requisitionline_idr") || fieldName.equals("mRequisitionlineIdr"))
      return mRequisitionlineIdr;
    else if (fieldName.equalsIgnoreCase("c_projecttask_id") || fieldName.equals("cProjecttaskId"))
      return cProjecttaskId;
    else if (fieldName.equalsIgnoreCase("c_projecttask_idr") || fieldName.equals("cProjecttaskIdr"))
      return cProjecttaskIdr;
    else if (fieldName.equalsIgnoreCase("mrp_salesforecastline_id") || fieldName.equals("mrpSalesforecastlineId"))
      return mrpSalesforecastlineId;
    else if (fieldName.equalsIgnoreCase("mrp_salesforecastline_idr") || fieldName.equals("mrpSalesforecastlineIdr"))
      return mrpSalesforecastlineIdr;
    else if (fieldName.equalsIgnoreCase("c_orderline_id") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("c_orderline_idr") || fieldName.equals("cOrderlineIdr"))
      return cOrderlineIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("pricelist"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("m_warehouse_idr") || fieldName.equals("mWarehouseIdr"))
      return mWarehouseIdr;
    else if (fieldName.equalsIgnoreCase("framecontractline"))
      return framecontractline;
    else if (fieldName.equalsIgnoreCase("framecontractliner"))
      return framecontractliner;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("cumqty"))
      return cumqty;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("plannedorderdate"))
      return plannedorderdate;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isfixed"))
      return isfixed;
    else if (fieldName.equalsIgnoreCase("mrp_run_purchaseline_id") || fieldName.equals("mrpRunPurchaselineId"))
      return mrpRunPurchaselineId;
    else if (fieldName.equalsIgnoreCase("iscompleted"))
      return iscompleted;
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
  public static Lines800259Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mrpRunPurchaseId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, mrpRunPurchaseId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Lines800259Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mrpRunPurchaseId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(MRP_Run_PurchaseLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = MRP_Run_PurchaseLine.CreatedBy) as CreatedByR, " +
      "        to_char(MRP_Run_PurchaseLine.Updated, ?) as updated, " +
      "        to_char(MRP_Run_PurchaseLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        MRP_Run_PurchaseLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = MRP_Run_PurchaseLine.UpdatedBy) as UpdatedByR," +
      "        MRP_Run_PurchaseLine.MRP_Run_Purchase_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.MRP_Run_Purchase_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS MRP_Run_Purchase_IDR, " +
      "MRP_Run_PurchaseLine.M_Product_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "MRP_Run_PurchaseLine.Qty, " +
      "MRP_Run_PurchaseLine.Neededqty, " +
      "MRP_Run_PurchaseLine.Totaldemand, " +
      "MRP_Run_PurchaseLine.C_Uom_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.C_Uom_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL8.Name IS NULL THEN TO_CHAR(table8.Name) ELSE TO_CHAR(tableTRL8.Name) END)), ''))),'') ) END) AS C_Uom_IDR, " +
      "MRP_Run_PurchaseLine.Quantityorder, " +
      "MRP_Run_PurchaseLine.M_Product_Uom_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.M_Product_Uom_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL10.Name IS NULL THEN TO_CHAR(table10.Name) ELSE TO_CHAR(tableTRL10.Name) END)), ''))),'') ) END) AS M_Product_Uom_IDR, " +
      "MRP_Run_PurchaseLine.Planneddate, " +
      "MRP_Run_PurchaseLine.M_Manufacturer_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.M_Manufacturer_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS M_Manufacturer_IDR, " +
      "MRP_Run_PurchaseLine.Inouttrxtype, " +
      "(CASE WHEN MRP_Run_PurchaseLine.Inouttrxtype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS InouttrxtypeR, " +
      "MRP_Run_PurchaseLine.M_Requisitionline_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.M_Requisitionline_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL14.Name IS NULL THEN TO_CHAR(table14.Name) ELSE TO_CHAR(tableTRL14.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Qty), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table12.Needbydate, 'DD-MM-YYYY')),'') ) END) AS M_Requisitionline_IDR, " +
      "MRP_Run_PurchaseLine.C_Projecttask_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.C_Projecttask_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table16.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table16.Name), ''))),'') ) END) AS C_Projecttask_IDR, " +
      "MRP_Run_PurchaseLine.MRP_Salesforecastline_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.MRP_Salesforecastline_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table18.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL18.Name IS NULL THEN TO_CHAR(table18.Name) ELSE TO_CHAR(tableTRL18.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table20.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table19.Enddate, 'DD-MM-YYYY')),'') ) END) AS MRP_Salesforecastline_IDR, " +
      "MRP_Run_PurchaseLine.C_OrderLine_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.C_OrderLine_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table22.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table22.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table22.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table22.GrandTotal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table21.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table21.LineNetAmt), ''))),'') ) END) AS C_OrderLine_IDR, " +
      "MRP_Run_PurchaseLine.C_BPartner_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table23.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "MRP_Run_PurchaseLine.Pricelist, " +
      "MRP_Run_PurchaseLine.M_Warehouse_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.M_Warehouse_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table24.Name), ''))),'') ) END) AS M_Warehouse_IDR, " +
      "MRP_Run_PurchaseLine.Framecontractline, " +
      "(CASE WHEN MRP_Run_PurchaseLine.Framecontractline IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table26.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table26.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table26.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table26.GrandTotal), ''))),'') ) END) AS FramecontractlineR, " +
      "MRP_Run_PurchaseLine.AD_Org_ID, " +
      "(CASE WHEN MRP_Run_PurchaseLine.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table27.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "MRP_Run_PurchaseLine.Cumqty, " +
      "COALESCE(MRP_Run_PurchaseLine.IsActive, 'N') AS IsActive, " +
      "MRP_Run_PurchaseLine.Plannedorderdate, " +
      "MRP_Run_PurchaseLine.AD_Client_ID, " +
      "COALESCE(MRP_Run_PurchaseLine.Isfixed, 'N') AS Isfixed, " +
      "MRP_Run_PurchaseLine.MRP_Run_Purchaseline_ID, " +
      "COALESCE(MRP_Run_PurchaseLine.Iscompleted, 'N') AS Iscompleted, " +
      "        ? AS LANGUAGE " +
      "        FROM MRP_Run_PurchaseLine left join (select MRP_Run_Purchase_ID, Name, MRP_Planner_ID, Vendor_ID, M_Product_Category_ID, M_Product_ID, C_BPartner_ID from MRP_Run_Purchase) table1 on (MRP_Run_PurchaseLine.MRP_Run_Purchase_ID = table1.MRP_Run_Purchase_ID) left join (select MRP_Planner_ID, Name from MRP_Planner) table2 on (table1.MRP_Planner_ID = table2.MRP_Planner_ID) left join (select C_BPartner_ID, Name from C_BPartner) table3 on (table1.Vendor_ID =  table3.C_BPartner_ID) left join (select M_Product_Category_ID, Name from M_Product_Category) table4 on (table1.M_Product_Category_ID = table4.M_Product_Category_ID) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table1.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table6 on (table1.C_BPartner_ID = table6.C_BPartner_ID) left join (select M_Product_ID, Value, Name from M_Product) table7 on (MRP_Run_PurchaseLine.M_Product_ID = table7.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL7 on (table7.M_Product_ID = tableTRL7.M_Product_ID and tableTRL7.AD_Language = ?)  left join (select C_Uom_ID, Name from C_Uom) table8 on (MRP_Run_PurchaseLine.C_Uom_ID = table8.C_Uom_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL8 on (table8.C_UOM_ID = tableTRL8.C_UOM_ID and tableTRL8.AD_Language = ?)  left join (select M_Product_Uom_ID, C_UOM_ID from M_Product_Uom) table9 on (MRP_Run_PurchaseLine.M_Product_Uom_ID = table9.M_Product_Uom_ID) left join (select C_UOM_ID, Name from C_UOM) table10 on (table9.C_UOM_ID = table10.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL10 on (table10.C_UOM_ID = tableTRL10.C_UOM_ID and tableTRL10.AD_Language = ?)  left join (select M_Manufacturer_ID, Name from M_Manufacturer) table11 on (MRP_Run_PurchaseLine.M_Manufacturer_ID = table11.M_Manufacturer_ID) left join ad_ref_list_v list1 on (MRP_Run_PurchaseLine.Inouttrxtype = list1.value and list1.ad_reference_id = '800098' and list1.ad_language = ?)  left join (select M_Requisitionline_ID, M_Requisition_ID, M_Product_ID, Qty, Needbydate from M_Requisitionline) table12 on (MRP_Run_PurchaseLine.M_Requisitionline_ID = table12.M_Requisitionline_ID) left join (select M_Requisition_ID, DocumentNo from M_Requisition) table13 on (table12.M_Requisition_ID = table13.M_Requisition_ID) left join (select M_Product_ID, Value, Name from M_Product) table14 on (table12.M_Product_ID = table14.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL14 on (table14.M_Product_ID = tableTRL14.M_Product_ID and tableTRL14.AD_Language = ?)  left join (select C_Projecttask_ID, Name, C_Project_ID from C_Projecttask) table15 on (MRP_Run_PurchaseLine.C_Projecttask_ID = table15.C_Projecttask_ID) left join (select C_Project_ID, Value, Name from C_Project) table16 on (table15.C_Project_ID = table16.C_Project_ID) left join (select MRP_Salesforecastline_ID, M_Product_ID, MRP_Salesforecast_ID from MRP_Salesforecastline) table17 on (MRP_Run_PurchaseLine.MRP_Salesforecastline_ID = table17.MRP_Salesforecastline_ID) left join (select M_Product_ID, Value, Name from M_Product) table18 on (table17.M_Product_ID = table18.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL18 on (table18.M_Product_ID = tableTRL18.M_Product_ID and tableTRL18.AD_Language = ?)  left join (select MRP_Salesforecast_ID, C_Bpartner_ID, Enddate from MRP_Salesforecast) table19 on (table17.MRP_Salesforecast_ID = table19.MRP_Salesforecast_ID) left join (select C_BPartner_ID, Name from C_BPartner) table20 on (table19.C_Bpartner_ID = table20.C_BPartner_ID) left join (select C_OrderLine_ID, C_Order_ID, Line, LineNetAmt from C_OrderLine) table21 on (MRP_Run_PurchaseLine.C_OrderLine_ID = table21.C_OrderLine_ID) left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table22 on (table21.C_Order_ID = table22.C_Order_ID) left join (select C_BPartner_ID, Name from C_BPartner) table23 on (MRP_Run_PurchaseLine.C_BPartner_ID = table23.C_BPartner_ID) left join (select M_Warehouse_ID, Name from M_Warehouse) table24 on (MRP_Run_PurchaseLine.M_Warehouse_ID = table24.M_Warehouse_ID) left join (select C_OrderLine_ID, C_Order_ID from C_OrderLine) table25 on (MRP_Run_PurchaseLine.Framecontractline =  table25.C_OrderLine_ID) left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table26 on (table25.C_Order_ID = table26.C_Order_ID) left join (select AD_Org_ID, Name from AD_Org) table27 on (MRP_Run_PurchaseLine.AD_Org_ID = table27.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((mrpRunPurchaseId==null || mrpRunPurchaseId.equals(""))?"":"  AND MRP_Run_PurchaseLine.MRP_Run_Purchase_ID = ?  ");
    strSql = strSql + 
      "        AND MRP_Run_PurchaseLine.MRP_Run_Purchaseline_ID = ? " +
      "        AND MRP_Run_PurchaseLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND MRP_Run_PurchaseLine.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (mrpRunPurchaseId != null && !(mrpRunPurchaseId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaseId);
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
        Lines800259Data objectLines800259Data = new Lines800259Data();
        objectLines800259Data.created = UtilSql.getValue(result, "created");
        objectLines800259Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectLines800259Data.updated = UtilSql.getValue(result, "updated");
        objectLines800259Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectLines800259Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectLines800259Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectLines800259Data.mrpRunPurchaseId = UtilSql.getValue(result, "mrp_run_purchase_id");
        objectLines800259Data.mrpRunPurchaseIdr = UtilSql.getValue(result, "mrp_run_purchase_idr");
        objectLines800259Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectLines800259Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectLines800259Data.qty = UtilSql.getValue(result, "qty");
        objectLines800259Data.neededqty = UtilSql.getValue(result, "neededqty");
        objectLines800259Data.totaldemand = UtilSql.getValue(result, "totaldemand");
        objectLines800259Data.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectLines800259Data.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectLines800259Data.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectLines800259Data.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectLines800259Data.mProductUomIdr = UtilSql.getValue(result, "m_product_uom_idr");
        objectLines800259Data.planneddate = UtilSql.getDateValue(result, "planneddate", "dd-MM-yyyy");
        objectLines800259Data.mManufacturerId = UtilSql.getValue(result, "m_manufacturer_id");
        objectLines800259Data.mManufacturerIdr = UtilSql.getValue(result, "m_manufacturer_idr");
        objectLines800259Data.inouttrxtype = UtilSql.getValue(result, "inouttrxtype");
        objectLines800259Data.inouttrxtyper = UtilSql.getValue(result, "inouttrxtyper");
        objectLines800259Data.mRequisitionlineId = UtilSql.getValue(result, "m_requisitionline_id");
        objectLines800259Data.mRequisitionlineIdr = UtilSql.getValue(result, "m_requisitionline_idr");
        objectLines800259Data.cProjecttaskId = UtilSql.getValue(result, "c_projecttask_id");
        objectLines800259Data.cProjecttaskIdr = UtilSql.getValue(result, "c_projecttask_idr");
        objectLines800259Data.mrpSalesforecastlineId = UtilSql.getValue(result, "mrp_salesforecastline_id");
        objectLines800259Data.mrpSalesforecastlineIdr = UtilSql.getValue(result, "mrp_salesforecastline_idr");
        objectLines800259Data.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectLines800259Data.cOrderlineIdr = UtilSql.getValue(result, "c_orderline_idr");
        objectLines800259Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectLines800259Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectLines800259Data.pricelist = UtilSql.getValue(result, "pricelist");
        objectLines800259Data.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectLines800259Data.mWarehouseIdr = UtilSql.getValue(result, "m_warehouse_idr");
        objectLines800259Data.framecontractline = UtilSql.getValue(result, "framecontractline");
        objectLines800259Data.framecontractliner = UtilSql.getValue(result, "framecontractliner");
        objectLines800259Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectLines800259Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectLines800259Data.cumqty = UtilSql.getValue(result, "cumqty");
        objectLines800259Data.isactive = UtilSql.getValue(result, "isactive");
        objectLines800259Data.plannedorderdate = UtilSql.getDateValue(result, "plannedorderdate", "dd-MM-yyyy");
        objectLines800259Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectLines800259Data.isfixed = UtilSql.getValue(result, "isfixed");
        objectLines800259Data.mrpRunPurchaselineId = UtilSql.getValue(result, "mrp_run_purchaseline_id");
        objectLines800259Data.iscompleted = UtilSql.getValue(result, "iscompleted");
        objectLines800259Data.language = UtilSql.getValue(result, "language");
        objectLines800259Data.adUserClient = "";
        objectLines800259Data.adOrgClient = "";
        objectLines800259Data.createdby = "";
        objectLines800259Data.trBgcolor = "";
        objectLines800259Data.totalCount = "";
        objectLines800259Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectLines800259Data);
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
    Lines800259Data objectLines800259Data[] = new Lines800259Data[vector.size()];
    vector.copyInto(objectLines800259Data);
    return(objectLines800259Data);
  }

/**
Create a registry
 */
  public static Lines800259Data[] set(String mrpRunPurchaseId, String cumqty, String mProductId, String mProductIdr, String adClientId, String neededqty, String mrpRunPurchaselineId, String adOrgId, String cOrderlineId, String iscompleted, String framecontractline, String plannedorderdate, String pricelist, String mRequisitionlineId, String cProjecttaskId, String mWarehouseId, String isactive, String mrpSalesforecastlineId, String cBpartnerId, String cBpartnerIdr, String updatedby, String updatedbyr, String planneddate, String createdby, String createdbyr, String qty, String totaldemand, String cUomId, String inouttrxtype, String isfixed, String mProductUomId, String mManufacturerId, String quantityorder)    throws ServletException {
    Lines800259Data objectLines800259Data[] = new Lines800259Data[1];
    objectLines800259Data[0] = new Lines800259Data();
    objectLines800259Data[0].created = "";
    objectLines800259Data[0].createdbyr = createdbyr;
    objectLines800259Data[0].updated = "";
    objectLines800259Data[0].updatedTimeStamp = "";
    objectLines800259Data[0].updatedby = updatedby;
    objectLines800259Data[0].updatedbyr = updatedbyr;
    objectLines800259Data[0].mrpRunPurchaseId = mrpRunPurchaseId;
    objectLines800259Data[0].mrpRunPurchaseIdr = "";
    objectLines800259Data[0].mProductId = mProductId;
    objectLines800259Data[0].mProductIdr = mProductIdr;
    objectLines800259Data[0].qty = qty;
    objectLines800259Data[0].neededqty = neededqty;
    objectLines800259Data[0].totaldemand = totaldemand;
    objectLines800259Data[0].cUomId = cUomId;
    objectLines800259Data[0].cUomIdr = "";
    objectLines800259Data[0].quantityorder = quantityorder;
    objectLines800259Data[0].mProductUomId = mProductUomId;
    objectLines800259Data[0].mProductUomIdr = "";
    objectLines800259Data[0].planneddate = planneddate;
    objectLines800259Data[0].mManufacturerId = mManufacturerId;
    objectLines800259Data[0].mManufacturerIdr = "";
    objectLines800259Data[0].inouttrxtype = inouttrxtype;
    objectLines800259Data[0].inouttrxtyper = "";
    objectLines800259Data[0].mRequisitionlineId = mRequisitionlineId;
    objectLines800259Data[0].mRequisitionlineIdr = "";
    objectLines800259Data[0].cProjecttaskId = cProjecttaskId;
    objectLines800259Data[0].cProjecttaskIdr = "";
    objectLines800259Data[0].mrpSalesforecastlineId = mrpSalesforecastlineId;
    objectLines800259Data[0].mrpSalesforecastlineIdr = "";
    objectLines800259Data[0].cOrderlineId = cOrderlineId;
    objectLines800259Data[0].cOrderlineIdr = "";
    objectLines800259Data[0].cBpartnerId = cBpartnerId;
    objectLines800259Data[0].cBpartnerIdr = cBpartnerIdr;
    objectLines800259Data[0].pricelist = pricelist;
    objectLines800259Data[0].mWarehouseId = mWarehouseId;
    objectLines800259Data[0].mWarehouseIdr = "";
    objectLines800259Data[0].framecontractline = framecontractline;
    objectLines800259Data[0].framecontractliner = "";
    objectLines800259Data[0].adOrgId = adOrgId;
    objectLines800259Data[0].adOrgIdr = "";
    objectLines800259Data[0].cumqty = cumqty;
    objectLines800259Data[0].isactive = isactive;
    objectLines800259Data[0].plannedorderdate = plannedorderdate;
    objectLines800259Data[0].adClientId = adClientId;
    objectLines800259Data[0].isfixed = isfixed;
    objectLines800259Data[0].mrpRunPurchaselineId = mrpRunPurchaselineId;
    objectLines800259Data[0].iscompleted = iscompleted;
    objectLines800259Data[0].language = "";
    return objectLines800259Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef803675_0(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef803699_1(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as C_BPartner_ID FROM C_BPartner table1 WHERE table1.isActive='Y' AND table1.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_IDR);

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
  public static String selectDef803673_2(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef803671_3(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        SELECT MRP_Run_PurchaseLine.MRP_Run_Purchase_ID AS NAME" +
      "        FROM MRP_Run_PurchaseLine" +
      "        WHERE MRP_Run_PurchaseLine.MRP_Run_Purchaseline_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String paramLanguage, String mrpRunPurchaseId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table2.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table3.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table4.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table5.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))) AS NAME FROM MRP_Run_Purchase left join (select MRP_Run_Purchase_ID, Name, MRP_Planner_ID, Vendor_ID, M_Product_Category_ID, M_Product_ID, C_BPartner_ID from MRP_Run_Purchase) table1 on (MRP_Run_Purchase.MRP_Run_Purchase_ID = table1.MRP_Run_Purchase_ID) left join (select MRP_Planner_ID, Name from MRP_Planner) table2 on (table1.MRP_Planner_ID = table2.MRP_Planner_ID) left join (select C_BPartner_ID, Name from C_BPartner) table3 on (table1.Vendor_ID =  table3.C_BPartner_ID) left join (select M_Product_Category_ID, Name from M_Product_Category) table4 on (table1.M_Product_Category_ID = table4.M_Product_Category_ID) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table1.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table6 on (table1.C_BPartner_ID = table6.C_BPartner_ID) WHERE MRP_Run_Purchase.MRP_Run_Purchase_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaseId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String paramLanguage, String mrpRunPurchaseId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table2.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table3.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table4.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table5.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))) AS NAME FROM MRP_Run_Purchase left join (select MRP_Run_Purchase_ID, Name, MRP_Planner_ID, Vendor_ID, M_Product_Category_ID, M_Product_ID, C_BPartner_ID from MRP_Run_Purchase) table1 on (MRP_Run_Purchase.MRP_Run_Purchase_ID = table1.MRP_Run_Purchase_ID) left join (select MRP_Planner_ID, Name from MRP_Planner) table2 on (table1.MRP_Planner_ID = table2.MRP_Planner_ID) left join (select C_BPartner_ID, Name from C_BPartner) table3 on (table1.Vendor_ID =  table3.C_BPartner_ID) left join (select M_Product_Category_ID, Name from M_Product_Category) table4 on (table1.M_Product_Category_ID = table4.M_Product_Category_ID) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table1.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table6 on (table1.C_BPartner_ID = table6.C_BPartner_ID) WHERE MRP_Run_Purchase.MRP_Run_Purchase_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaseId);

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
      "        UPDATE MRP_Run_PurchaseLine" +
      "        SET MRP_Run_Purchase_ID = (?) , M_Product_ID = (?) , Qty = TO_NUMBER(?) , Neededqty = TO_NUMBER(?) , Totaldemand = TO_NUMBER(?) , C_Uom_ID = (?) , Quantityorder = TO_NUMBER(?) , M_Product_Uom_ID = (?) , Planneddate = TO_DATE(?) , M_Manufacturer_ID = (?) , Inouttrxtype = (?) , M_Requisitionline_ID = (?) , C_Projecttask_ID = (?) , MRP_Salesforecastline_ID = (?) , C_OrderLine_ID = (?) , C_BPartner_ID = (?) , Pricelist = TO_NUMBER(?) , M_Warehouse_ID = (?) , Framecontractline = (?) , AD_Org_ID = (?) , Cumqty = TO_NUMBER(?) , IsActive = (?) , Plannedorderdate = TO_DATE(?) , AD_Client_ID = (?) , Isfixed = (?) , MRP_Run_Purchaseline_ID = (?) , Iscompleted = (?) , updated = now(), updatedby = ? " +
      "        WHERE MRP_Run_PurchaseLine.MRP_Run_Purchaseline_ID = ? " +
      "                 AND MRP_Run_PurchaseLine.MRP_Run_Purchase_ID = ? " +
      "        AND MRP_Run_PurchaseLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MRP_Run_PurchaseLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, neededqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totaldemand);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, planneddate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, inouttrxtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpSalesforecastlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, framecontractline);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cumqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedorderdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfixed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaselineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscompleted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaselineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaseId);
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
      "        INSERT INTO MRP_Run_PurchaseLine " +
      "        (MRP_Run_Purchase_ID, M_Product_ID, Qty, Neededqty, Totaldemand, C_Uom_ID, Quantityorder, M_Product_Uom_ID, Planneddate, M_Manufacturer_ID, Inouttrxtype, M_Requisitionline_ID, C_Projecttask_ID, MRP_Salesforecastline_ID, C_OrderLine_ID, C_BPartner_ID, Pricelist, M_Warehouse_ID, Framecontractline, AD_Org_ID, Cumqty, IsActive, Plannedorderdate, AD_Client_ID, Isfixed, MRP_Run_Purchaseline_ID, Iscompleted, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), TO_DATE(?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, neededqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totaldemand);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, planneddate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, inouttrxtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mRequisitionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpSalesforecastlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, framecontractline);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cumqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, plannedorderdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfixed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaselineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscompleted);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String mrpRunPurchaseId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM MRP_Run_PurchaseLine" +
      "        WHERE MRP_Run_PurchaseLine.MRP_Run_Purchaseline_ID = ? " +
      "                 AND MRP_Run_PurchaseLine.MRP_Run_Purchase_ID = ? " +
      "        AND MRP_Run_PurchaseLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND MRP_Run_PurchaseLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaseId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String mrpRunPurchaseId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM MRP_Run_PurchaseLine" +
      "        WHERE MRP_Run_PurchaseLine.MRP_Run_Purchaseline_ID = ? " +
      "                 AND MRP_Run_PurchaseLine.MRP_Run_Purchase_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpRunPurchaseId);

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
      "          FROM MRP_Run_PurchaseLine" +
      "         WHERE MRP_Run_PurchaseLine.MRP_Run_Purchaseline_ID = ? ";

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
      "          FROM MRP_Run_PurchaseLine" +
      "         WHERE MRP_Run_PurchaseLine.MRP_Run_Purchaseline_ID = ? ";

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
