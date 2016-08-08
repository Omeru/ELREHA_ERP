//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openz.modules.multilevelmarketing.EmployeeMLM;

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
class OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data implements FieldProvider {
static Logger log4j = Logger.getLogger(OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String isdescription;
  public String refOrderlineId;
  public String adClientId;
  public String adClientIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String mOfferId;
  public String cOrderId;
  public String cOrderIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String dateordered;
  public String line;
  public String linetaxamt;
  public String datepromised;
  public String isgrossprice;
  public String scheddeliverydate;
  public String cProjectphaseId;
  public String directship;
  public String calcfastestdeliverydate;
  public String aAssetId;
  public String isonetimeposition;
  public String mProductId;
  public String mProductIdr;
  public String issummaryitem;
  public String mAttributesetinstanceId;
  public String mAttributesetinstanceIdr;
  public String description;
  public String quantityorder;
  public String mProductUomId;
  public String mProductUomIdr;
  public String qtyordered;
  public String ignoreresiduedate;
  public String cUomId;
  public String cUomIdr;
  public String securityqty;
  public String qtydelivered;
  public String qtyreserved;
  public String qtyinvoiced;
  public String invoicedamt;
  public String ignoreresidue;
  public String deliverycomplete;
  public String mShipperId;
  public String mShipperIdr;
  public String priceactual;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String pricestd;
  public String cancelpricead;
  public String pricelist;
  public String discount;
  public String freightamt;
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
  public String calloffqty;
  public String dateinvoiced;
  public String pricelimit;
  public String datedelivered;
  public String cOrderlineId;
  public String isactive;
  public String mWarehouseId;
  public String chargeamt;
  public String cChargeId;
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
    else if (fieldName.equalsIgnoreCase("isdescription"))
      return isdescription;
    else if (fieldName.equalsIgnoreCase("ref_orderline_id") || fieldName.equals("refOrderlineId"))
      return refOrderlineId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_client_idr") || fieldName.equals("adClientIdr"))
      return adClientIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("m_offer_id") || fieldName.equals("mOfferId"))
      return mOfferId;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("c_order_idr") || fieldName.equals("cOrderIdr"))
      return cOrderIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_idr") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("line"))
      return line;
    else if (fieldName.equalsIgnoreCase("linetaxamt"))
      return linetaxamt;
    else if (fieldName.equalsIgnoreCase("datepromised"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("isgrossprice"))
      return isgrossprice;
    else if (fieldName.equalsIgnoreCase("scheddeliverydate"))
      return scheddeliverydate;
    else if (fieldName.equalsIgnoreCase("c_projectphase_id") || fieldName.equals("cProjectphaseId"))
      return cProjectphaseId;
    else if (fieldName.equalsIgnoreCase("directship"))
      return directship;
    else if (fieldName.equalsIgnoreCase("calcfastestdeliverydate"))
      return calcfastestdeliverydate;
    else if (fieldName.equalsIgnoreCase("a_asset_id") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("isonetimeposition"))
      return isonetimeposition;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("issummaryitem"))
      return issummaryitem;
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
    else if (fieldName.equalsIgnoreCase("ignoreresiduedate"))
      return ignoreresiduedate;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("securityqty"))
      return securityqty;
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
    else if (fieldName.equalsIgnoreCase("m_shipper_id") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("m_shipper_idr") || fieldName.equals("mShipperIdr"))
      return mShipperIdr;
    else if (fieldName.equalsIgnoreCase("priceactual"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("pricestd"))
      return pricestd;
    else if (fieldName.equalsIgnoreCase("cancelpricead"))
      return cancelpricead;
    else if (fieldName.equalsIgnoreCase("pricelist"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("discount"))
      return discount;
    else if (fieldName.equalsIgnoreCase("freightamt"))
      return freightamt;
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
    else if (fieldName.equalsIgnoreCase("calloffqty"))
      return calloffqty;
    else if (fieldName.equalsIgnoreCase("dateinvoiced"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("pricelimit"))
      return pricelimit;
    else if (fieldName.equalsIgnoreCase("datedelivered"))
      return datedelivered;
    else if (fieldName.equalsIgnoreCase("c_orderline_id") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("chargeamt"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("c_charge_id") || fieldName.equals("cChargeId"))
      return cChargeId;
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
  public static OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cOrderId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cOrderId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_OrderLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_OrderLine.CreatedBy) as CreatedByR, " +
      "        to_char(C_OrderLine.Updated, ?) as updated, " +
      "        to_char(C_OrderLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_OrderLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_OrderLine.UpdatedBy) as UpdatedByR," +
      "        COALESCE(C_OrderLine.IsDescription, 'N') AS IsDescription, " +
      "C_OrderLine.Ref_OrderLine_ID, " +
      "C_OrderLine.AD_Client_ID, " +
      "(CASE WHEN C_OrderLine.AD_Client_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Client_IDR, " +
      "C_OrderLine.AD_Org_ID, " +
      "(CASE WHEN C_OrderLine.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_OrderLine.M_Offer_ID, " +
      "C_OrderLine.C_Order_ID, " +
      "(CASE WHEN C_OrderLine.C_Order_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table3.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.GrandTotal), ''))),'') ) END) AS C_Order_IDR, " +
      "C_OrderLine.C_BPartner_ID, " +
      "(CASE WHEN C_OrderLine.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_OrderLine.C_BPartner_Location_ID, " +
      "(CASE WHEN C_OrderLine.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "C_OrderLine.DateOrdered, " +
      "C_OrderLine.Line, " +
      "C_OrderLine.Linetaxamt, " +
      "C_OrderLine.DatePromised, " +
      "COALESCE(C_OrderLine.Isgrossprice, 'N') AS Isgrossprice, " +
      "C_OrderLine.Scheddeliverydate, " +
      "C_OrderLine.C_Projectphase_ID, " +
      "COALESCE(C_OrderLine.DirectShip, 'N') AS DirectShip, " +
      "C_OrderLine.Calcfastestdeliverydate, " +
      "C_OrderLine.A_Asset_ID, " +
      "COALESCE(C_OrderLine.IsOneTimePosition, 'N') AS IsOneTimePosition, " +
      "C_OrderLine.M_Product_ID, " +
      "(CASE WHEN C_OrderLine.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "COALESCE(C_OrderLine.Issummaryitem, 'N') AS Issummaryitem, " +
      "C_OrderLine.M_AttributeSetInstance_ID, " +
      "(CASE WHEN C_OrderLine.M_AttributeSetInstance_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Description), ''))),'') ) END) AS M_AttributeSetInstance_IDR, " +
      "C_OrderLine.Description, " +
      "C_OrderLine.QuantityOrder, " +
      "C_OrderLine.M_Product_Uom_Id, " +
      "(CASE WHEN C_OrderLine.M_Product_Uom_Id IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL9.Name IS NULL THEN TO_CHAR(table9.Name) ELSE TO_CHAR(tableTRL9.Name) END)), ''))),'') ) END) AS M_Product_Uom_IdR, " +
      "C_OrderLine.QtyOrdered, " +
      "C_OrderLine.Ignoreresiduedate, " +
      "C_OrderLine.C_UOM_ID, " +
      "(CASE WHEN C_OrderLine.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL10.Name IS NULL THEN TO_CHAR(table10.Name) ELSE TO_CHAR(tableTRL10.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "C_OrderLine.Securityqty, " +
      "C_OrderLine.QtyDelivered, " +
      "C_OrderLine.QtyReserved, " +
      "C_OrderLine.QtyInvoiced, " +
      "C_OrderLine.Invoicedamt, " +
      "COALESCE(C_OrderLine.Ignoreresidue, 'N') AS Ignoreresidue, " +
      "COALESCE(C_OrderLine.Deliverycomplete, 'N') AS Deliverycomplete, " +
      "C_OrderLine.M_Shipper_ID, " +
      "(CASE WHEN C_OrderLine.M_Shipper_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS M_Shipper_IDR, " +
      "C_OrderLine.PriceActual, " +
      "C_OrderLine.C_Currency_ID, " +
      "(CASE WHEN C_OrderLine.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "C_OrderLine.PriceStd, " +
      "COALESCE(C_OrderLine.CANCELPRICEAD, 'N') AS CANCELPRICEAD, " +
      "C_OrderLine.PriceList, " +
      "C_OrderLine.Discount, " +
      "C_OrderLine.FreightAmt, " +
      "C_OrderLine.C_Tax_ID, " +
      "(CASE WHEN C_OrderLine.C_Tax_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL13.Name IS NULL THEN TO_CHAR(table13.Name) ELSE TO_CHAR(tableTRL13.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "C_OrderLine.C_Project_ID, " +
      "(CASE WHEN C_OrderLine.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_OrderLine.C_Projecttask_ID, " +
      "(CASE WHEN C_OrderLine.C_Projecttask_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table16.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table16.Name), ''))),'') ) END) AS C_Projecttask_IDR, " +
      "C_OrderLine.Orderlineselfjoin, " +
      "(CASE WHEN C_OrderLine.Orderlineselfjoin IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table18.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table18.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table18.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table18.GrandTotal), ''))),'') ) END) AS OrderlineselfjoinR, " +
      "C_OrderLine.LineNetAmt, " +
      "C_OrderLine.Linegrossamt, " +
      "C_OrderLine.Calloffqty, " +
      "C_OrderLine.DateInvoiced, " +
      "C_OrderLine.PriceLimit, " +
      "C_OrderLine.DateDelivered, " +
      "C_OrderLine.C_OrderLine_ID, " +
      "COALESCE(C_OrderLine.IsActive, 'N') AS IsActive, " +
      "C_OrderLine.M_Warehouse_ID, " +
      "C_OrderLine.ChargeAmt, " +
      "C_OrderLine.C_Charge_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_OrderLine left join (select AD_Client_ID, Name from AD_Client) table1 on (C_OrderLine.AD_Client_ID = table1.AD_Client_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (C_OrderLine.AD_Org_ID = table2.AD_Org_ID) left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table3 on (C_OrderLine.C_Order_ID = table3.C_Order_ID) left join (select C_BPartner_ID, Name from C_BPartner) table4 on (C_OrderLine.C_BPartner_ID = table4.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table5 on (C_OrderLine.C_BPartner_Location_ID = table5.C_BPartner_Location_ID) left join (select M_Product_ID, Value, Name from M_Product) table6 on (C_OrderLine.M_Product_ID = table6.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL6 on (table6.M_Product_ID = tableTRL6.M_Product_ID and tableTRL6.AD_Language = ?)  left join (select M_AttributeSetInstance_ID, Description from M_AttributeSetInstance) table7 on (C_OrderLine.M_AttributeSetInstance_ID = table7.M_AttributeSetInstance_ID) left join (select M_Product_Uom_Id, C_UOM_ID from M_Product_UOM) table8 on (C_OrderLine.M_Product_Uom_Id =  table8.M_Product_Uom_Id) left join (select C_UOM_ID, Name from C_UOM) table9 on (table8.C_UOM_ID = table9.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL9 on (table9.C_UOM_ID = tableTRL9.C_UOM_ID and tableTRL9.AD_Language = ?)  left join (select C_UOM_ID, Name from C_UOM) table10 on (C_OrderLine.C_UOM_ID = table10.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL10 on (table10.C_UOM_ID = tableTRL10.C_UOM_ID and tableTRL10.AD_Language = ?)  left join (select M_Shipper_ID, Name from M_Shipper) table11 on (C_OrderLine.M_Shipper_ID = table11.M_Shipper_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table12 on (C_OrderLine.C_Currency_ID = table12.C_Currency_ID) left join (select C_Tax_ID, Name from C_Tax) table13 on (C_OrderLine.C_Tax_ID =  table13.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL13 on (table13.C_Tax_ID = tableTRL13.C_Tax_ID and tableTRL13.AD_Language = ?)  left join (select C_Project_ID, Value, Name from C_Project) table14 on (C_OrderLine.C_Project_ID = table14.C_Project_ID) left join (select C_Projecttask_ID, Name, C_Project_ID from C_Projecttask) table15 on (C_OrderLine.C_Projecttask_ID = table15.C_Projecttask_ID) left join (select C_Project_ID, Value, Name from C_Project) table16 on (table15.C_Project_ID = table16.C_Project_ID) left join (select C_OrderLine_ID, C_Order_ID from C_OrderLine) table17 on (C_OrderLine.Orderlineselfjoin =  table17.C_OrderLine_ID) left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table18 on (table17.C_Order_ID = table18.C_Order_ID)" +
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
        OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data = new OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data();
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.created = UtilSql.getValue(result, "created");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.updated = UtilSql.getValue(result, "updated");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.isdescription = UtilSql.getValue(result, "isdescription");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.refOrderlineId = UtilSql.getValue(result, "ref_orderline_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.adClientIdr = UtilSql.getValue(result, "ad_client_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mOfferId = UtilSql.getValue(result, "m_offer_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cOrderIdr = UtilSql.getValue(result, "c_order_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cBpartnerLocationIdr = UtilSql.getValue(result, "c_bpartner_location_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.line = UtilSql.getValue(result, "line");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.linetaxamt = UtilSql.getValue(result, "linetaxamt");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.datepromised = UtilSql.getDateValue(result, "datepromised", "dd-MM-yyyy");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.isgrossprice = UtilSql.getValue(result, "isgrossprice");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.scheddeliverydate = UtilSql.getDateValue(result, "scheddeliverydate", "dd-MM-yyyy");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cProjectphaseId = UtilSql.getValue(result, "c_projectphase_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.directship = UtilSql.getValue(result, "directship");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.calcfastestdeliverydate = UtilSql.getValue(result, "calcfastestdeliverydate");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.isonetimeposition = UtilSql.getValue(result, "isonetimeposition");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.issummaryitem = UtilSql.getValue(result, "issummaryitem");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mAttributesetinstanceIdr = UtilSql.getValue(result, "m_attributesetinstance_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.description = UtilSql.getValue(result, "description");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.quantityorder = UtilSql.getValue(result, "quantityorder");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mProductUomId = UtilSql.getValue(result, "m_product_uom_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mProductUomIdr = UtilSql.getValue(result, "m_product_uom_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.qtyordered = UtilSql.getValue(result, "qtyordered");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.ignoreresiduedate = UtilSql.getDateValue(result, "ignoreresiduedate", "dd-MM-yyyy");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.securityqty = UtilSql.getValue(result, "securityqty");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.qtydelivered = UtilSql.getValue(result, "qtydelivered");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.qtyreserved = UtilSql.getValue(result, "qtyreserved");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.qtyinvoiced = UtilSql.getValue(result, "qtyinvoiced");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.invoicedamt = UtilSql.getValue(result, "invoicedamt");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.ignoreresidue = UtilSql.getValue(result, "ignoreresidue");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.deliverycomplete = UtilSql.getValue(result, "deliverycomplete");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mShipperId = UtilSql.getValue(result, "m_shipper_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mShipperIdr = UtilSql.getValue(result, "m_shipper_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.priceactual = UtilSql.getValue(result, "priceactual");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.pricestd = UtilSql.getValue(result, "pricestd");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cancelpricead = UtilSql.getValue(result, "cancelpricead");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.pricelist = UtilSql.getValue(result, "pricelist");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.discount = UtilSql.getValue(result, "discount");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.freightamt = UtilSql.getValue(result, "freightamt");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cTaxId = UtilSql.getValue(result, "c_tax_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cTaxIdr = UtilSql.getValue(result, "c_tax_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cProjecttaskId = UtilSql.getValue(result, "c_projecttask_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cProjecttaskIdr = UtilSql.getValue(result, "c_projecttask_idr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.orderlineselfjoin = UtilSql.getValue(result, "orderlineselfjoin");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.orderlineselfjoinr = UtilSql.getValue(result, "orderlineselfjoinr");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.linenetamt = UtilSql.getValue(result, "linenetamt");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.linegrossamt = UtilSql.getValue(result, "linegrossamt");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.calloffqty = UtilSql.getValue(result, "calloffqty");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.dateinvoiced = UtilSql.getDateValue(result, "dateinvoiced", "dd-MM-yyyy");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.pricelimit = UtilSql.getValue(result, "pricelimit");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.datedelivered = UtilSql.getDateValue(result, "datedelivered", "dd-MM-yyyy");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.isactive = UtilSql.getValue(result, "isactive");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.chargeamt = UtilSql.getValue(result, "chargeamt");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.cChargeId = UtilSql.getValue(result, "c_charge_id");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.language = UtilSql.getValue(result, "language");
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.adUserClient = "";
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.adOrgClient = "";
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.createdby = "";
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.trBgcolor = "";
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.totalCount = "";
        objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data);
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
    OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[] = new OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[vector.size()];
    vector.copyInto(objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data);
    return(objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data);
  }

/**
Create a registry
 */
  public static OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[] set(String cOrderId, String mProductUomId, String mWarehouseId, String datepromised, String isgrossprice, String qtyinvoiced, String qtyreserved, String issummaryitem, String adClientId, String securityqty, String calcfastestdeliverydate, String invoicedamt, String createdby, String createdbyr, String quantityorder, String cChargeId, String isonetimeposition, String discount, String linenetamt, String mOfferId, String pricelimit, String linegrossamt, String updatedby, String updatedbyr, String qtydelivered, String cOrderIdr, String cProjecttaskId, String qtyordered, String refOrderlineId, String cProjectId, String cProjectIdr, String ignoreresiduedate, String mAttributesetinstanceId, String mAttributesetinstanceIdr, String cBpartnerLocationId, String isactive, String cancelpricead, String priceactual, String deliverycomplete, String isdescription, String mShipperId, String cOrderlineId, String cBpartnerId, String cBpartnerIdr, String dateinvoiced, String cProjectphaseId, String cUomId, String scheddeliverydate, String directship, String freightamt, String mProductId, String mProductIdr, String adOrgId, String chargeamt, String aAssetId, String orderlineselfjoin, String linetaxamt, String dateordered, String pricestd, String calloffqty, String line, String cCurrencyId, String datedelivered, String pricelist, String cTaxId, String description, String ignoreresidue)    throws ServletException {
    OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[] = new OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[1];
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0] = new OrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data();
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].created = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].createdbyr = createdbyr;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].updated = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].updatedTimeStamp = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].updatedby = updatedby;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].updatedbyr = updatedbyr;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].isdescription = isdescription;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].refOrderlineId = refOrderlineId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].adClientId = adClientId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].adClientIdr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].adOrgId = adOrgId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].adOrgIdr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mOfferId = mOfferId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cOrderId = cOrderId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cOrderIdr = cOrderIdr;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cBpartnerId = cBpartnerId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cBpartnerIdr = cBpartnerIdr;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cBpartnerLocationId = cBpartnerLocationId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cBpartnerLocationIdr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].dateordered = dateordered;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].line = line;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].linetaxamt = linetaxamt;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].datepromised = datepromised;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].isgrossprice = isgrossprice;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].scheddeliverydate = scheddeliverydate;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cProjectphaseId = cProjectphaseId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].directship = directship;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].calcfastestdeliverydate = calcfastestdeliverydate;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].aAssetId = aAssetId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].isonetimeposition = isonetimeposition;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mProductId = mProductId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mProductIdr = mProductIdr;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].issummaryitem = issummaryitem;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mAttributesetinstanceIdr = mAttributesetinstanceIdr;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].description = description;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].quantityorder = quantityorder;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mProductUomId = mProductUomId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mProductUomIdr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].qtyordered = qtyordered;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].ignoreresiduedate = ignoreresiduedate;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cUomId = cUomId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cUomIdr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].securityqty = securityqty;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].qtydelivered = qtydelivered;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].qtyreserved = qtyreserved;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].qtyinvoiced = qtyinvoiced;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].invoicedamt = invoicedamt;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].ignoreresidue = ignoreresidue;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].deliverycomplete = deliverycomplete;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mShipperId = mShipperId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mShipperIdr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].priceactual = priceactual;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cCurrencyId = cCurrencyId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cCurrencyIdr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].pricestd = pricestd;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cancelpricead = cancelpricead;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].pricelist = pricelist;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].discount = discount;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].freightamt = freightamt;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cTaxId = cTaxId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cTaxIdr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cProjectId = cProjectId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cProjectIdr = cProjectIdr;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cProjecttaskId = cProjecttaskId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cProjecttaskIdr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].orderlineselfjoin = orderlineselfjoin;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].orderlineselfjoinr = "";
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].linenetamt = linenetamt;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].linegrossamt = linegrossamt;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].calloffqty = calloffqty;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].dateinvoiced = dateinvoiced;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].pricelimit = pricelimit;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].datedelivered = datedelivered;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cOrderlineId = cOrderlineId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].isactive = isactive;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].mWarehouseId = mWarehouseId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].chargeamt = chargeamt;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].cChargeId = cChargeId;
    objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data[0].language = "";
    return objectOrderlinesMLM8627A34726A649E69FBE68E772DEFBA2Data;
  }

/**
Select for auxiliar field
 */
  public static String selectActP00C298E9A47D464092678CC1323B20DB_scheddeliverydate(ConnectionProvider connectionProvider, String c_orderline_id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zssm_getfastestdeliverydate(?),'DD-MM-YYYY') as defaultvalue from dual ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_orderline_id);

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
  public static String selectDef2764(ConnectionProvider connectionProvider, String C_Order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_BPartner_ID AS DefaultValue FROM C_Order WHERE C_Order_ID=? ";

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
Select for auxiliar field
 */
  public static String selectDef2764_5(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDef94A94EC8613E4F9187409A87297DEB74(ConnectionProvider connectionProvider, String c_order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c_projectphase_id AS DefaultValue FROM c_order WHERE c_order_ID=? ";

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
  public static String selectDef2221_6(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef01D5706503CE49D6ABDE8345B5DB4642(ConnectionProvider connectionProvider, String c_order_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT a_asset_id AS DefaultValue FROM c_order WHERE c_order_ID=? ";

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
      "        SET IsDescription = (?) , Ref_OrderLine_ID = (?) , AD_Client_ID = (?) , AD_Org_ID = (?) , M_Offer_ID = (?) , C_Order_ID = (?) , C_BPartner_ID = (?) , C_BPartner_Location_ID = (?) , DateOrdered = TO_DATE(?) , Line = TO_NUMBER(?) , Linetaxamt = TO_NUMBER(?) , DatePromised = TO_DATE(?) , Isgrossprice = (?) , Scheddeliverydate = TO_DATE(?) , C_Projectphase_ID = (?) , DirectShip = (?) , Calcfastestdeliverydate = (?) , A_Asset_ID = (?) , IsOneTimePosition = (?) , M_Product_ID = (?) , Issummaryitem = (?) , M_AttributeSetInstance_ID = (?) , Description = (?) , QuantityOrder = TO_NUMBER(?) , M_Product_Uom_Id = (?) , QtyOrdered = TO_NUMBER(?) , Ignoreresiduedate = TO_DATE(?) , C_UOM_ID = (?) , Securityqty = TO_NUMBER(?) , QtyDelivered = TO_NUMBER(?) , QtyReserved = TO_NUMBER(?) , QtyInvoiced = TO_NUMBER(?) , Invoicedamt = TO_NUMBER(?) , Ignoreresidue = (?) , Deliverycomplete = (?) , M_Shipper_ID = (?) , PriceActual = TO_NUMBER(?) , C_Currency_ID = (?) , PriceStd = TO_NUMBER(?) , CANCELPRICEAD = (?) , PriceList = TO_NUMBER(?) , Discount = TO_NUMBER(?) , FreightAmt = TO_NUMBER(?) , C_Tax_ID = (?) , C_Project_ID = (?) , C_Projecttask_ID = (?) , Orderlineselfjoin = (?) , LineNetAmt = TO_NUMBER(?) , Linegrossamt = TO_NUMBER(?) , Calloffqty = TO_NUMBER(?) , DateInvoiced = TO_DATE(?) , PriceLimit = TO_NUMBER(?) , DateDelivered = TO_DATE(?) , C_OrderLine_ID = (?) , IsActive = (?) , M_Warehouse_ID = (?) , ChargeAmt = TO_NUMBER(?) , C_Charge_ID = (?) , updated = now(), updatedby = ? " +
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, refOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linetaxamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isgrossprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectphaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, directship);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calcfastestdeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isonetimeposition);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummaryitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ignoreresiduedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, securityqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtydelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyreserved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ignoreresidue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverycomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cancelpricead);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderlineselfjoin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linegrossamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calloffqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
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
      "        (IsDescription, Ref_OrderLine_ID, AD_Client_ID, AD_Org_ID, M_Offer_ID, C_Order_ID, C_BPartner_ID, C_BPartner_Location_ID, DateOrdered, Line, Linetaxamt, DatePromised, Isgrossprice, Scheddeliverydate, C_Projectphase_ID, DirectShip, Calcfastestdeliverydate, A_Asset_ID, IsOneTimePosition, M_Product_ID, Issummaryitem, M_AttributeSetInstance_ID, Description, QuantityOrder, M_Product_Uom_Id, QtyOrdered, Ignoreresiduedate, C_UOM_ID, Securityqty, QtyDelivered, QtyReserved, QtyInvoiced, Invoicedamt, Ignoreresidue, Deliverycomplete, M_Shipper_ID, PriceActual, C_Currency_ID, PriceStd, CANCELPRICEAD, PriceList, Discount, FreightAmt, C_Tax_ID, C_Project_ID, C_Projecttask_ID, Orderlineselfjoin, LineNetAmt, Linegrossamt, Calloffqty, DateInvoiced, PriceLimit, DateDelivered, C_OrderLine_ID, IsActive, M_Warehouse_ID, ChargeAmt, C_Charge_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_DATE(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?), TO_NUMBER(?), TO_DATE(?), (?), (?), (?), TO_NUMBER(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, refOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linetaxamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isgrossprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectphaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, directship);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calcfastestdeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isonetimeposition);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummaryitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quantityorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ignoreresiduedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, securityqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtydelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyreserved);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ignoreresidue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverycomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cancelpricead);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderlineselfjoin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linenetamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, linegrossamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calloffqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
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
