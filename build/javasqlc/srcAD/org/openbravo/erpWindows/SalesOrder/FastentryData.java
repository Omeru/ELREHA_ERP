//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.SalesOrder;

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
class FastentryData implements FieldProvider {
static Logger log4j = Logger.getLogger(FastentryData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adClientId;
  public String adClientIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String cOrderId;
  public String cOrderIdr;
  public String line;
  public String desireddeliverydate;
  public String datepromised;
  public String scheddeliverydate;
  public String directship;
  public String mProductId;
  public String mProductIdr;
  public String mAttributesetinstanceId;
  public String mAttributesetinstanceIdr;
  public String description;
  public String quantityorder;
  public String mProductUomId;
  public String mProductUomIdr;
  public String qtyordered;
  public String cUomId;
  public String cUomIdr;
  public String qtydelivered;
  public String qtyreserved;
  public String qtyinvoiced;
  public String invoicedamt;
  public String ignoreresidue;
  public String deliverycomplete;
  public String priceactual;
  public String pricestd;
  public String cancelpricead;
  public String pricelist;
  public String discount;
  public String cTaxId;
  public String cTaxIdr;
  public String cProjectId;
  public String cProjectIdr;
  public String cProjecttaskId;
  public String cProjecttaskIdr;
  public String orderlineselfjoin;
  public String orderlineselfjoinr;
  public String linenetamt;
  public String linegrossamt;
  public String ignoreresiduedate;
  public String cOrderlineId;
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
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_client_idr") || fieldName.equals("adClientIdr"))
      return adClientIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("c_order_idr") || fieldName.equals("cOrderIdr"))
      return cOrderIdr;
    else if (fieldName.equalsIgnoreCase("line"))
      return line;
    else if (fieldName.equalsIgnoreCase("desireddeliverydate"))
      return desireddeliverydate;
    else if (fieldName.equalsIgnoreCase("datepromised"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("scheddeliverydate"))
      return scheddeliverydate;
    else if (fieldName.equalsIgnoreCase("directship"))
      return directship;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_id") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_idr") || fieldName.equals("mAttributesetinstanceIdr"))
      return mAttributesetinstanceIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("quantityorder"))
      return quantityorder;
    else if (fieldName.equalsIgnoreCase("m_product_uom_id") || fieldName.equals("mProductUomId"))
      return mProductUomId;
    else if (fieldName.equalsIgnoreCase("m_product_uom_idr") || fieldName.equals("mProductUomIdr"))
      return mProductUomIdr;
    else if (fieldName.equalsIgnoreCase("qtyordered"))
      return qtyordered;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("qtydelivered"))
      return qtydelivered;
    else if (fieldName.equalsIgnoreCase("qtyreserved"))
      return qtyreserved;
    else if (fieldName.equalsIgnoreCase("qtyinvoiced"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("invoicedamt"))
      return invoicedamt;
    else if (fieldName.equalsIgnoreCase("ignoreresidue"))
      return ignoreresidue;
    else if (fieldName.equalsIgnoreCase("deliverycomplete"))
      return deliverycomplete;
    else if (fieldName.equalsIgnoreCase("priceactual"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("pricestd"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("cancelpricead"))
      return cancelpricead;
    else if (fieldName.equalsIgnoreCase("pricelist"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("discount"))
      return discount;
    else if (fieldName.equalsIgnoreCase("c_tax_id") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("c_tax_idr") || fieldName.equals("cTaxIdr"))
      return cTaxIdr;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_project_idr") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("c_projecttask_id") || fieldName.equals("cProjecttaskId"))
      return cProjecttaskId;
    else if (fieldName.equalsIgnoreCase("c_projecttask_idr") || fieldName.equals("cProjecttaskIdr"))
      return cProjecttaskIdr;
    else if (fieldName.equalsIgnoreCase("orderlineselfjoin"))
      return orderlineselfjoin;
    else if (fieldName.equalsIgnoreCase("orderlineselfjoinr"))
      return orderlineselfjoinr;
    else if (fieldName.equalsIgnoreCase("linenetamt"))
      return linenetamt;
    else if (fieldName.equalsIgnoreCase("linegrossamt"))
      return linegrossamt;
    else if (fieldName.equalsIgnoreCase("ignoreresiduedate"))
      return ignoreresiduedate;
    else if (fieldName.equalsIgnoreCase("c_orderline_id") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
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
  public static FastentryData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cOrderId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static FastentryData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_OrderLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_OrderLine.CreatedBy) as CreatedByR, " +
      "        to_char(C_OrderLine.Updated, ?) as updated, " +
      "        to_char(C_OrderLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_OrderLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_OrderLine.UpdatedBy) as UpdatedByR," +
      "        C_OrderLine.AD_Client_ID, " +
      "(CASE WHEN C_OrderLine.AD_Client_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Client_IDR, " +
      "C_OrderLine.AD_Org_ID, " +
      "(CASE WHEN C_OrderLine.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_OrderLine.C_Order_ID, " +
      "(CASE WHEN C_OrderLine.C_Order_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.GrandTotal), ''))),'') ) END) AS C_Order_IDR, " +
      "C_OrderLine.Line, " +
      "C_OrderLine.Desireddeliverydate, " +
      "C_OrderLine.DatePromised, " +
      "C_OrderLine.Scheddeliverydate, " +
      "COALESCE(C_OrderLine.DirectShip, 'N') AS DirectShip, " +
      "C_OrderLine.M_Product_ID, " +
      "(CASE WHEN C_OrderLine.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "C_OrderLine.M_AttributeSetInstance_ID, " +
      "(CASE WHEN C_OrderLine.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "C_OrderLine.Description, " +
      "C_OrderLine.QuantityOrder, " +
      "C_OrderLine.M_Product_Uom_Id, " +
      "(CASE WHEN C_OrderLine.M_Product_Uom_Id IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS M_Product_Uom_IdR, " +
      "C_OrderLine.QtyOrdered, " +
      "C_OrderLine.C_UOM_ID, " +
      "(CASE WHEN C_OrderLine.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL8.Name IS NULL THEN TO_CHAR(table8.Name) ELSE TO_CHAR(tableTRL8.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "C_OrderLine.QtyDelivered, " +
      "C_OrderLine.QtyReserved, " +
      "C_OrderLine.QtyInvoiced, " +
      "C_OrderLine.Invoicedamt, " +
      "COALESCE(C_OrderLine.Ignoreresidue, 'N') AS Ignoreresidue, " +
      "COALESCE(C_OrderLine.Deliverycomplete, 'N') AS Deliverycomplete, " +
      "C_OrderLine.PriceActual, " +
      "C_OrderLine.PriceStd, " +
      "COALESCE(C_OrderLine.CANCELPRICEAD, 'N') AS CANCELPRICEAD, " +
      "C_OrderLine.PriceList, " +
      "C_OrderLine.Discount, " +
      "C_OrderLine.C_Tax_ID, " +
      "(CASE WHEN C_OrderLine.C_Tax_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL9.Name IS NULL THEN TO_CHAR(table9.Name) ELSE TO_CHAR(tableTRL9.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "C_OrderLine.C_Project_ID, " +
      "(CASE WHEN C_OrderLine.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_OrderLine.C_Projecttask_ID, " +
      "(CASE WHEN C_OrderLine.C_Projecttask_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Name), ''))),'') ) END) AS C_Projecttask_IDR, " +
      "C_OrderLine.Orderlineselfjoin, " +
      "(CASE WHEN C_OrderLine.Orderlineselfjoin IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table14.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.GrandTotal), ''))),'') ) END) AS OrderlineselfjoinR, " +
      "C_OrderLine.LineNetAmt, " +
      "C_OrderLine.Linegrossamt, " +
      "C_OrderLine.Ignoreresiduedate, " +
      "C_OrderLine.C_OrderLine_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_OrderLine left join (select AD_Client_ID, Name from AD_Client) table1 on (C_OrderLine.AD_Client_ID = table1.AD_Client_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (C_OrderLine.AD_Org_ID = table2.AD_Org_ID) left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table3 on (C_OrderLine.C_Order_ID = table3.C_Order_ID) left join (select M_Product_ID, Value, Name from M_Product) table4 on (C_OrderLine.M_Product_ID = table4.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table5 on (C_OrderLine.M_AttributeSetInstance_ID = table5.M_AttributeSetInstance_ID) left join (select M_Product_Uom_Id, C_UOM_ID from M_Product_UOM) table6 on (C_OrderLine.M_Product_Uom_Id =  table6.M_Product_Uom_Id) left join (select C_UOM_ID, Name from C_UOM) table7 on (table6.C_UOM_ID = table7.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL7 on (table7.C_UOM_ID = tableTRL7.C_UOM_ID and tableTRL7.AD_Language = ?)  left join (select C_UOM_ID, Name from C_UOM) table8 on (C_OrderLine.C_UOM_ID = table8.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL8 on (table8.C_UOM_ID = tableTRL8.C_UOM_ID and tableTRL8.AD_Language = ?)  left join (select C_Tax_ID, Name from C_Tax) table9 on (C_OrderLine.C_Tax_ID =  table9.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL9 on (table9.C_Tax_ID = tableTRL9.C_Tax_ID and tableTRL9.AD_Language = ?)  left join (select C_Project_ID, Value, Name from C_Project) table10 on (C_OrderLine.C_Project_ID = table10.C_Project_ID) left join (select C_Projecttask_ID, Name, C_Project_ID from C_Projecttask) table11 on (C_OrderLine.C_Projecttask_ID = table11.C_Projecttask_ID) left join (select C_Project_ID, Value, Name from C_Project) table12 on (table11.C_Project_ID = table12.C_Project_ID) left join (select C_OrderLine_ID, C_Order_ID from C_OrderLine) table13 on (C_OrderLine.Orderlineselfjoin =  table13.C_OrderLine_ID) left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table14 on (table13.C_Order_ID = table14.C_Order_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cOrderId==null || cOrderId.equals(""))?"":"  AND C_OrderLine.C_Order_ID = ?  ");
    strSql = strSql + 
      "        AND C_OrderLine.C_OrderLine_ID = ? " +
      "        AND C_OrderLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_OrderLine.AD_Org_ID IN (";
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
        FastentryData objectFastentryData = new FastentryData();
        objectFastentryData.created = UtilSql.getValue(result, "created");
        objectFastentryData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectFastentryData.updated = UtilSql.getValue(result, "updated");
        objectFastentryData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectFastentryData.updatedby = UtilSql.getValue(result, "updatedby");
        objectFastentryData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectFastentryData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectFastentryData.adClientIdr = UtilSql.getValue(result, "ad_client_idr");
        objectFastentryData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectFastentryData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectFastentryData.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectFastentryData.cOrderIdr = UtilSql.getValue(result, "c_order_idr");
        objectFastentryData.line = UtilSql.getValue(result, "line");
        objectFastentryData.desireddeliverydate = UtilSql.getDateValue(result, "desireddeliverydate", "dd-MM-yyyy");
        objectFastentryData.datepromised = UtilSql.getDateValue(result, "datepromised", "dd-MM-yyyy");
        objectFastentryData.scheddeliverydate = UtilSql.getDateValue(result, "scheddeliverydate", "dd-MM-yyyy");
        objectFastentryData.directship = UtilSql.getValue(result, "directship");
        objectFastentryData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectFastentryData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectFastentryData.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectFastentryData.mAttributesetinstanceIdr = UtilSql.getValue(result, "m_attributesetinstance_idr");
        objectFastentryData.description = UtilSql.getValue(result, "description");
        objectFastentryData.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectFastentryData.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectFastentryData.mProductUomIdr = UtilSql.getValue(result, "m_product_uom_idr");
        objectFastentryData.qtyordered = UtilSql.getValue(result, "qtyordered");
        objectFastentryData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectFastentryData.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectFastentryData.qtydelivered = UtilSql.getValue(result, "qtydelivered");
        objectFastentryData.qtyreserved = UtilSql.getValue(result, "qtyreserved");
        objectFastentryData.qtyinvoiced = UtilSql.getValue(result, "qtyinvoiced");
        objectFastentryData.invoicedamt = UtilSql.getValue(result, "invoicedamt");
        objectFastentryData.ignoreresidue = UtilSql.getValue(result, "ignoreresidue");
        objectFastentryData.deliverycomplete = UtilSql.getValue(result, "deliverycomplete");
        objectFastentryData.priceactual = UtilSql.getValue(result, "priceactual");
        objectFastentryData.pricestd = UtilSql.getValue(result, "pricestd");
        objectFastentryData.cancelpricead = UtilSql.getValue(result, "cancelpricead");
        objectFastentryData.pricelist = UtilSql.getValue(result, "pricelist");
        objectFastentryData.discount = UtilSql.getValue(result, "discount");
        objectFastentryData.cTaxId = UtilSql.getValue(result, "c_tax_id");
        objectFastentryData.cTaxIdr = UtilSql.getValue(result, "c_tax_idr");
        objectFastentryData.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectFastentryData.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectFastentryData.cProjecttaskId = UtilSql.getValue(result, "c_projecttask_id");
        objectFastentryData.cProjecttaskIdr = UtilSql.getValue(result, "c_projecttask_idr");
        objectFastentryData.orderlineselfjoin = UtilSql.getValue(result, "orderlineselfjoin");
        objectFastentryData.orderlineselfjoinr = UtilSql.getValue(result, "orderlineselfjoinr");
        objectFastentryData.linenetamt = UtilSql.getValue(result, "linenetamt");
        objectFastentryData.linegrossamt = UtilSql.getValue(result, "linegrossamt");
        objectFastentryData.ignoreresiduedate = UtilSql.getDateValue(result, "ignoreresiduedate", "dd-MM-yyyy");
        objectFastentryData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectFastentryData.language = UtilSql.getValue(result, "language");
        objectFastentryData.adUserClient = "";
        objectFastentryData.adOrgClient = "";
        objectFastentryData.createdby = "";
        objectFastentryData.trBgcolor = "";
        objectFastentryData.totalCount = "";
        objectFastentryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFastentryData);
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
    FastentryData objectFastentryData[] = new FastentryData[vector.size()];
    vector.copyInto(objectFastentryData);
    return(objectFastentryData);
  }

/**
Create a registry
 */
  public static FastentryData[] set(String cOrderId, String mProductUomId, String datepromised, String qtyinvoiced, String qtyreserved, String adClientId, String desireddeliverydate, String invoicedamt, String createdby, String createdbyr, String quantityorder, String discount, String linenetamt, String linegrossamt, String updatedby, String updatedbyr, String qtydelivered, String cOrderIdr, String cProjecttaskId, String qtyordered, String cProjectId, String cProjectIdr, String ignoreresiduedate, String mAttributesetinstanceId, String mAttributesetinstanceIdr, String cancelpricead, String priceactual, String deliverycomplete, String cOrderlineId, String cUomId, String scheddeliverydate, String directship, String mProductId, String mProductIdr, String adOrgId, String orderlineselfjoin, String pricestd, String line, String pricelist, String cTaxId, String description, String ignoreresidue)    throws ServletException {
    FastentryData objectFastentryData[] = new FastentryData[1];
    objectFastentryData[0] = new FastentryData();
    objectFastentryData[0].created = "";
    objectFastentryData[0].createdbyr = createdbyr;
    objectFastentryData[0].updated = "";
    objectFastentryData[0].updatedTimeStamp = "";
    objectFastentryData[0].updatedby = updatedby;
    objectFastentryData[0].updatedbyr = updatedbyr;
    objectFastentryData[0].adClientId = adClientId;
    objectFastentryData[0].adClientIdr = "";
    objectFastentryData[0].adOrgId = adOrgId;
    objectFastentryData[0].adOrgIdr = "";
    objectFastentryData[0].cOrderId = cOrderId;
    objectFastentryData[0].cOrderIdr = cOrderIdr;
    objectFastentryData[0].line = line;
    objectFastentryData[0].desireddeliverydate = desireddeliverydate;
    objectFastentryData[0].datepromised = datepromised;
    objectFastentryData[0].scheddeliverydate = scheddeliverydate;
    objectFastentryData[0].directship = directship;
    objectFastentryData[0].mProductId = mProductId;
    objectFastentryData[0].mProductIdr = mProductIdr;
    objectFastentryData[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectFastentryData[0].mAttributesetinstanceIdr = mAttributesetinstanceIdr;
    objectFastentryData[0].description = description;
    objectFastentryData[0].quantityorder = quantityorder;
    objectFastentryData[0].mProductUomId = mProductUomId;
    objectFastentryData[0].mProductUomIdr = "";
    objectFastentryData[0].qtyordered = qtyordered;
    objectFastentryData[0].cUomId = cUomId;
    objectFastentryData[0].cUomIdr = "";
    objectFastentryData[0].qtydelivered = qtydelivered;
    objectFastentryData[0].qtyreserved = qtyreserved;
    objectFastentryData[0].qtyinvoiced = qtyinvoiced;
    objectFastentryData[0].invoicedamt = invoicedamt;
    objectFastentryData[0].ignoreresidue = ignoreresidue;
    objectFastentryData[0].deliverycomplete = deliverycomplete;
    objectFastentryData[0].priceactual = priceactual;
    objectFastentryData[0].pricestd = pricestd;
    objectFastentryData[0].cancelpricead = cancelpricead;
    objectFastentryData[0].pricelist = pricelist;
    objectFastentryData[0].discount = discount;
    objectFastentryData[0].cTaxId = cTaxId;
    objectFastentryData[0].cTaxIdr = "";
    objectFastentryData[0].cProjectId = cProjectId;
    objectFastentryData[0].cProjectIdr = cProjectIdr;
    objectFastentryData[0].cProjecttaskId = cProjecttaskId;
    objectFastentryData[0].cProjecttaskIdr = "";
    objectFastentryData[0].orderlineselfjoin = orderlineselfjoin;
    objectFastentryData[0].orderlineselfjoinr = "";
    objectFastentryData[0].linenetamt = linenetamt;
    objectFastentryData[0].linegrossamt = linegrossamt;
    objectFastentryData[0].ignoreresiduedate = ignoreresiduedate;
    objectFastentryData[0].cOrderlineId = cOrderlineId;
    objectFastentryData[0].language = "";
    return objectFastentryData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2210_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as CreatedBy FROM AD_User table1 WHERE table1.isActive='Y' AND table1.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedByR);

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
  public static String selectDef2212_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as UpdatedBy FROM AD_User table1 WHERE table1.isActive='Y' AND table1.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedByR);

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
  public static String selectDef2213_2(ConnectionProvider connectionProvider, String C_Order_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.DocumentNo), '')  || ' - ' || COALESCE(TO_CHAR(table1.Name), '')  || ' - ' || COALESCE(TO_CHAR(table1.DateOrdered), '')  || ' - ' || COALESCE(TO_CHAR(table1.GrandTotal), '') ) as C_Order_ID FROM C_Order table1 WHERE table1.isActive='Y' AND table1.C_Order_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Order_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_order_id");
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
  public static String selectDef6F7344EDD9904E5A94A709DE5BFE09D6(ConnectionProvider connectionProvider, String c_order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c_projecttask_id AS DefaultValue FROM c_order WHERE c_order_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_order_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "defaultvalue");
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
  public static String selectDefA48DE71600FC4CC7A352989D54135EDD(ConnectionProvider connectionProvider, String c_order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c_project_id AS DefaultValue FROM c_order WHERE c_order_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_order_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "defaultvalue");
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
  public static String selectDefA48DE71600FC4CC7A352989D54135EDD_3(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Value), '')  || ' - ' || COALESCE(TO_CHAR(table1.Name), '') ) as C_Project_ID FROM C_Project table1 WHERE table1.isActive='Y' AND table1.C_Project_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Project_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_project_id");
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
  public static String selectDef8767_4(ConnectionProvider connectionProvider, String M_AttributeSetInstance_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Description), '') ) as M_AttributeSetInstance_ID FROM M_AttributeSetInstance table1 WHERE table1.isActive='Y' AND table1.M_AttributeSetInstance_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_AttributeSetInstance_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_attributesetinstance_id");
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
  public static String selectDef2221_5(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef2214(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_OrderLine WHERE C_Order_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Order_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "defaultvalue");
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
      "        SELECT C_OrderLine.C_Order_ID AS NAME" +
      "        FROM C_OrderLine" +
      "        WHERE C_OrderLine.C_OrderLine_ID = ?";

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
      "        UPDATE C_OrderLine" +
      "        SET AD_Client_ID = (?) , AD_Org_ID = (?) , C_Order_ID = (?) , Line = TO_NUMBER(?) , Desireddeliverydate = TO_DATE(?) , DatePromised = TO_DATE(?) , Scheddeliverydate = TO_DATE(?) , DirectShip = (?) , M_Product_ID = (?) , M_AttributeSetInstance_ID = (?) , Description = (?) , QuantityOrder = TO_NUMBER(?) , M_Product_Uom_Id = (?) , QtyOrdered = TO_NUMBER(?) , C_UOM_ID = (?) , QtyDelivered = TO_NUMBER(?) , QtyReserved = TO_NUMBER(?) , QtyInvoiced = TO_NUMBER(?) , Invoicedamt = TO_NUMBER(?) , Ignoreresidue = (?) , Deliverycomplete = (?) , PriceActual = TO_NUMBER(?) , PriceStd = TO_NUMBER(?) , CANCELPRICEAD = (?) , PriceList = TO_NUMBER(?) , Discount = TO_NUMBER(?) , C_Tax_ID = (?) , C_Project_ID = (?) , C_Projecttask_ID = (?) , Orderlineselfjoin = (?) , LineNetAmt = TO_NUMBER(?) , Linegrossamt = TO_NUMBER(?) , Ignoreresiduedate = TO_DATE(?) , C_OrderLine_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_OrderLine.C_OrderLine_ID = ? " +
      "                 AND C_OrderLine.C_Order_ID = ? " +
      "        AND C_OrderLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_OrderLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, desireddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, directship);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtydelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyreserved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ignoreresidue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverycomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cancelpricead);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderlineselfjoin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linegrossamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ignoreresiduedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
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
      "        INSERT INTO C_OrderLine " +
      "        (AD_Client_ID, AD_Org_ID, C_Order_ID, Line, Desireddeliverydate, DatePromised, Scheddeliverydate, DirectShip, M_Product_ID, M_AttributeSetInstance_ID, Description, QuantityOrder, M_Product_Uom_Id, QtyOrdered, C_UOM_ID, QtyDelivered, QtyReserved, QtyInvoiced, Invoicedamt, Ignoreresidue, Deliverycomplete, PriceActual, PriceStd, CANCELPRICEAD, PriceList, Discount, C_Tax_ID, C_Project_ID, C_Projecttask_ID, Orderlineselfjoin, LineNetAmt, Linegrossamt, Ignoreresiduedate, C_OrderLine_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_NUMBER(?), TO_DATE(?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, desireddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, directship);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtydelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyreserved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ignoreresidue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverycomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cancelpricead);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderlineselfjoin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linegrossamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ignoreresiduedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
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
      "        DELETE FROM C_OrderLine" +
      "        WHERE C_OrderLine.C_OrderLine_ID = ? " +
      "                 AND C_OrderLine.C_Order_ID = ? " +
      "        AND C_OrderLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_OrderLine.AD_Org_ID IN (";
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
      "        DELETE FROM C_OrderLine" +
      "        WHERE C_OrderLine.C_OrderLine_ID = ? " +
      "                 AND C_OrderLine.C_Order_ID = ? ";

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
      "          FROM C_OrderLine" +
      "         WHERE C_OrderLine.C_OrderLine_ID = ? ";

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
      "          FROM C_OrderLine" +
      "         WHERE C_OrderLine.C_OrderLine_ID = ? ";

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
