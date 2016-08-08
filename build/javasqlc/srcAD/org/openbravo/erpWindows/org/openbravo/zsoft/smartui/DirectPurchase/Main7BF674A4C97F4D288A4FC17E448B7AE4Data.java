//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.zsoft.smartui.DirectPurchase;

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
class Main7BF674A4C97F4D288A4FC17E448B7AE4Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Main7BF674A4C97F4D288A4FC17E448B7AE4Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String textlines;
  public String dateofsale;
  public String mProductId;
  public String mProductIdr;
  public String priceactual;
  public String qty;
  public String cTaxId;
  public String cTaxIdr;
  public String description;
  public String aAssetId;
  public String aAssetIdr;
  public String cProjectId;
  public String cProjectIdr;
  public String cProjecttaskId;
  public String cProjecttaskIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String paymentrule;
  public String paymentruler;
  public String cUomId;
  public String cUomIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String mWarehouseId;
  public String mWarehouseIdr;
  public String cInvoiceId;
  public String cInvoiceIdr;
  public String action;
  public String processed;
  public String isposted;
  public String adOrgId;
  public String adOrgIdr;
  public String zssiDirectpurchaseId;
  public String mAttributesetinstanceId;
  public String adClientId;
  public String cOrderId;
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
    else if (fieldName.equalsIgnoreCase("textlines"))
      return textlines;
    else if (fieldName.equalsIgnoreCase("dateofsale"))
      return dateofsale;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("priceactual"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("c_tax_id") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("c_tax_idr") || fieldName.equals("cTaxIdr"))
      return cTaxIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("a_asset_id") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("a_asset_idr") || fieldName.equals("aAssetIdr"))
      return aAssetIdr;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_project_idr") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
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
    else if (fieldName.equalsIgnoreCase("paymentrule"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("paymentruler"))
      return paymentruler;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("m_warehouse_idr") || fieldName.equals("mWarehouseIdr"))
      return mWarehouseIdr;
    else if (fieldName.equalsIgnoreCase("c_invoice_id") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("c_invoice_idr") || fieldName.equals("cInvoiceIdr"))
      return cInvoiceIdr;
    else if (fieldName.equalsIgnoreCase("action"))
      return action;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("isposted"))
      return isposted;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("zssi_directpurchase_id") || fieldName.equals("zssiDirectpurchaseId"))
      return zssiDirectpurchaseId;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_id") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
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
  public static Main7BF674A4C97F4D288A4FC17E448B7AE4Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Main7BF674A4C97F4D288A4FC17E448B7AE4Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zssi_directpurchase.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zssi_directpurchase.CreatedBy) as CreatedByR, " +
      "        to_char(zssi_directpurchase.Updated, ?) as updated, " +
      "        to_char(zssi_directpurchase.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zssi_directpurchase.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zssi_directpurchase.UpdatedBy) as UpdatedByR," +
      "        zssi_directpurchase.Textlines, " +
      "zssi_directpurchase.Dateofsale, " +
      "zssi_directpurchase.M_Product_ID, " +
      "(CASE WHEN zssi_directpurchase.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "zssi_directpurchase.Priceactual, " +
      "zssi_directpurchase.Qty, " +
      "zssi_directpurchase.C_Tax_ID, " +
      "(CASE WHEN zssi_directpurchase.C_Tax_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "zssi_directpurchase.Description, " +
      "zssi_directpurchase.A_Asset_ID, " +
      "(CASE WHEN zssi_directpurchase.A_Asset_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS A_Asset_IDR, " +
      "zssi_directpurchase.C_Project_ID, " +
      "(CASE WHEN zssi_directpurchase.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "zssi_directpurchase.C_Projecttask_ID, " +
      "(CASE WHEN zssi_directpurchase.C_Projecttask_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_Projecttask_IDR, " +
      "zssi_directpurchase.C_Bpartner_ID, " +
      "(CASE WHEN zssi_directpurchase.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "zssi_directpurchase.C_Bpartner_Location_ID, " +
      "(CASE WHEN zssi_directpurchase.C_Bpartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS C_Bpartner_Location_IDR, " +
      "zssi_directpurchase.Paymentrule, " +
      "(CASE WHEN zssi_directpurchase.Paymentrule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS PaymentruleR, " +
      "zssi_directpurchase.C_Uom_ID, " +
      "(CASE WHEN zssi_directpurchase.C_Uom_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL9.Name IS NULL THEN TO_CHAR(table9.Name) ELSE TO_CHAR(tableTRL9.Name) END)), ''))),'') ) END) AS C_Uom_IDR, " +
      "zssi_directpurchase.C_Currency_ID, " +
      "(CASE WHEN zssi_directpurchase.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "zssi_directpurchase.M_Warehouse_ID, " +
      "(CASE WHEN zssi_directpurchase.M_Warehouse_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS M_Warehouse_IDR, " +
      "zssi_directpurchase.C_Invoice_ID, " +
      "(CASE WHEN zssi_directpurchase.C_Invoice_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table12.DateInvoiced, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.GrandTotal), ''))),'') ) END) AS C_Invoice_IDR, " +
      "zssi_directpurchase.Action, " +
      "COALESCE(zssi_directpurchase.Processed, 'N') AS Processed, " +
      "COALESCE(zssi_directpurchase.Isposted, 'N') AS Isposted, " +
      "zssi_directpurchase.AD_Org_ID, " +
      "(CASE WHEN zssi_directpurchase.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table13.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "zssi_directpurchase.Zssi_Directpurchase_ID, " +
      "zssi_directpurchase.M_Attributesetinstance_ID, " +
      "zssi_directpurchase.AD_Client_ID, " +
      "zssi_directpurchase.C_Order_ID, " +
      "COALESCE(zssi_directpurchase.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM zssi_directpurchase left join (select M_Product_ID, Value, Name from M_Product) table1 on (zssi_directpurchase.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select C_Tax_ID, Name from C_Tax) table2 on (zssi_directpurchase.C_Tax_ID = table2.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL2 on (table2.C_Tax_ID = tableTRL2.C_Tax_ID and tableTRL2.AD_Language = ?)  left join (select A_Asset_ID, Name from A_Asset) table3 on (zssi_directpurchase.A_Asset_ID = table3.A_Asset_ID) left join (select C_Project_ID, Value, Name from C_Project) table4 on (zssi_directpurchase.C_Project_ID = table4.C_Project_ID) left join (select C_Projecttask_ID, Name, C_Project_ID from C_Projecttask) table5 on (zssi_directpurchase.C_Projecttask_ID = table5.C_Projecttask_ID) left join (select C_Project_ID, Value, Name from C_Project) table6 on (table5.C_Project_ID = table6.C_Project_ID) left join (select C_BPartner_ID, Name from C_BPartner) table7 on (zssi_directpurchase.C_Bpartner_ID = table7.C_BPartner_ID) left join (select C_Bpartner_Location_ID, Name from C_Bpartner_Location) table8 on (zssi_directpurchase.C_Bpartner_Location_ID = table8.C_Bpartner_Location_ID) left join ad_ref_list_v list1 on (zssi_directpurchase.Paymentrule = list1.value and list1.ad_reference_id = '195' and list1.ad_language = ?)  left join (select C_Uom_ID, Name from C_Uom) table9 on (zssi_directpurchase.C_Uom_ID = table9.C_Uom_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL9 on (table9.C_UOM_ID = tableTRL9.C_UOM_ID and tableTRL9.AD_Language = ?)  left join (select C_Currency_ID, ISO_Code from C_Currency) table10 on (zssi_directpurchase.C_Currency_ID = table10.C_Currency_ID) left join (select M_Warehouse_ID, Name from M_Warehouse) table11 on (zssi_directpurchase.M_Warehouse_ID = table11.M_Warehouse_ID) left join (select C_Invoice_ID, DocumentNo, DateInvoiced, GrandTotal from C_Invoice) table12 on (zssi_directpurchase.C_Invoice_ID = table12.C_Invoice_ID) left join (select AD_Org_ID, Name from AD_Org) table13 on (zssi_directpurchase.AD_Org_ID = table13.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND zssi_directpurchase.Zssi_Directpurchase_ID = ? " +
      "        AND zssi_directpurchase.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zssi_directpurchase.AD_Org_ID IN (";
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
        Main7BF674A4C97F4D288A4FC17E448B7AE4Data objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data = new Main7BF674A4C97F4D288A4FC17E448B7AE4Data();
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.created = UtilSql.getValue(result, "created");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.updated = UtilSql.getValue(result, "updated");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.textlines = UtilSql.getValue(result, "textlines");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.dateofsale = UtilSql.getDateValue(result, "dateofsale", "dd-MM-yyyy");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.priceactual = UtilSql.getValue(result, "priceactual");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.qty = UtilSql.getValue(result, "qty");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cTaxId = UtilSql.getValue(result, "c_tax_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cTaxIdr = UtilSql.getValue(result, "c_tax_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.description = UtilSql.getValue(result, "description");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.aAssetIdr = UtilSql.getValue(result, "a_asset_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cProjecttaskId = UtilSql.getValue(result, "c_projecttask_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cProjecttaskIdr = UtilSql.getValue(result, "c_projecttask_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cBpartnerLocationIdr = UtilSql.getValue(result, "c_bpartner_location_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.paymentrule = UtilSql.getValue(result, "paymentrule");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.paymentruler = UtilSql.getValue(result, "paymentruler");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.mWarehouseIdr = UtilSql.getValue(result, "m_warehouse_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cInvoiceId = UtilSql.getValue(result, "c_invoice_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cInvoiceIdr = UtilSql.getValue(result, "c_invoice_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.action = UtilSql.getValue(result, "action");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.processed = UtilSql.getValue(result, "processed");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.isposted = UtilSql.getValue(result, "isposted");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.zssiDirectpurchaseId = UtilSql.getValue(result, "zssi_directpurchase_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.isactive = UtilSql.getValue(result, "isactive");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.language = UtilSql.getValue(result, "language");
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.adUserClient = "";
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.adOrgClient = "";
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.createdby = "";
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.trBgcolor = "";
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.totalCount = "";
        objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data);
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
    Main7BF674A4C97F4D288A4FC17E448B7AE4Data objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[] = new Main7BF674A4C97F4D288A4FC17E448B7AE4Data[vector.size()];
    vector.copyInto(objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data);
    return(objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data);
  }

/**
Create a registry
 */
  public static Main7BF674A4C97F4D288A4FC17E448B7AE4Data[] set(String cTaxId, String cInvoiceId, String adOrgId, String qty, String priceactual, String mWarehouseId, String mProductId, String mProductIdr, String cBpartnerLocationId, String isposted, String zssiDirectpurchaseId, String textlines, String cCurrencyId, String cProjectId, String cProjecttaskId, String dateofsale, String cUomId, String description, String createdby, String createdbyr, String cBpartnerId, String cBpartnerIdr, String isactive, String adClientId, String action, String processed, String paymentrule, String updatedby, String updatedbyr, String mAttributesetinstanceId, String cOrderId, String aAssetId)    throws ServletException {
    Main7BF674A4C97F4D288A4FC17E448B7AE4Data objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[] = new Main7BF674A4C97F4D288A4FC17E448B7AE4Data[1];
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0] = new Main7BF674A4C97F4D288A4FC17E448B7AE4Data();
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].created = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].createdbyr = createdbyr;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].updated = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].updatedTimeStamp = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].updatedby = updatedby;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].updatedbyr = updatedbyr;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].textlines = textlines;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].dateofsale = dateofsale;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].mProductId = mProductId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].mProductIdr = mProductIdr;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].priceactual = priceactual;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].qty = qty;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cTaxId = cTaxId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cTaxIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].description = description;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].aAssetId = aAssetId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].aAssetIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cProjectId = cProjectId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cProjectIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cProjecttaskId = cProjecttaskId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cProjecttaskIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cBpartnerId = cBpartnerId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cBpartnerIdr = cBpartnerIdr;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cBpartnerLocationId = cBpartnerLocationId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cBpartnerLocationIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].paymentrule = paymentrule;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].paymentruler = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cUomId = cUomId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cUomIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cCurrencyId = cCurrencyId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cCurrencyIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].mWarehouseId = mWarehouseId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].mWarehouseIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cInvoiceId = cInvoiceId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cInvoiceIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].action = action;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].processed = processed;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].isposted = isposted;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].adOrgId = adOrgId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].adOrgIdr = "";
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].zssiDirectpurchaseId = zssiDirectpurchaseId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].adClientId = adClientId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].cOrderId = cOrderId;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].isactive = isactive;
    objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data[0].language = "";
    return objectMain7BF674A4C97F4D288A4FC17E448B7AE4Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefDB63FBB3648B409083A8B174206D6653_0(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDefFB8D0CB79E4C4A3D8BCC217F792B6045_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefD3A6147886634D07952E0D1400EDF0C1_2(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
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
  public static String selectDefBE44287A9A1B49DFA908896C3238320D_3(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE zssi_directpurchase" +
      "        SET Textlines = (?) , Dateofsale = TO_DATE(?) , M_Product_ID = (?) , Priceactual = TO_NUMBER(?) , Qty = TO_NUMBER(?) , C_Tax_ID = (?) , Description = (?) , A_Asset_ID = (?) , C_Project_ID = (?) , C_Projecttask_ID = (?) , C_Bpartner_ID = (?) , C_Bpartner_Location_ID = (?) , Paymentrule = (?) , C_Uom_ID = (?) , C_Currency_ID = (?) , M_Warehouse_ID = (?) , C_Invoice_ID = (?) , Action = (?) , Processed = (?) , Isposted = (?) , AD_Org_ID = (?) , Zssi_Directpurchase_ID = (?) , M_Attributesetinstance_ID = (?) , AD_Client_ID = (?) , C_Order_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE zssi_directpurchase.Zssi_Directpurchase_ID = ? " +
      "        AND zssi_directpurchase.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zssi_directpurchase.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, textlines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateofsale);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, action);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isposted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zssiDirectpurchaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zssiDirectpurchaseId);
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
      "        INSERT INTO zssi_directpurchase " +
      "        (Textlines, Dateofsale, M_Product_ID, Priceactual, Qty, C_Tax_ID, Description, A_Asset_ID, C_Project_ID, C_Projecttask_ID, C_Bpartner_ID, C_Bpartner_Location_ID, Paymentrule, C_Uom_ID, C_Currency_ID, M_Warehouse_ID, C_Invoice_ID, Action, Processed, Isposted, AD_Org_ID, Zssi_Directpurchase_ID, M_Attributesetinstance_ID, AD_Client_ID, C_Order_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), TO_DATE(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, textlines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateofsale);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, action);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isposted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zssiDirectpurchaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
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
      "        DELETE FROM zssi_directpurchase" +
      "        WHERE zssi_directpurchase.Zssi_Directpurchase_ID = ? " +
      "        AND zssi_directpurchase.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zssi_directpurchase.AD_Org_ID IN (";
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
      "        DELETE FROM zssi_directpurchase" +
      "        WHERE zssi_directpurchase.Zssi_Directpurchase_ID = ? ";

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
      "          FROM zssi_directpurchase" +
      "         WHERE zssi_directpurchase.Zssi_Directpurchase_ID = ? ";

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
      "          FROM zssi_directpurchase" +
      "         WHERE zssi_directpurchase.Zssi_Directpurchase_ID = ? ";

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
