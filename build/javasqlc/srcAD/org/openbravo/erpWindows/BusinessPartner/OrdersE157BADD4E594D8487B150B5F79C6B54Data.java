//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.BusinessPartner;

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
class OrdersE157BADD4E594D8487B150B5F79C6B54Data implements FieldProvider {
static Logger log4j = Logger.getLogger(OrdersE157BADD4E594D8487B150B5F79C6B54Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cOrderId;
  public String documentno;
  public String dateordered;
  public String dateacct;
  public String isactive;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String docstatus;
  public String docstatusr;
  public String cDoctypetargetId;
  public String cDoctypetargetIdr;
  public String description;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String billtoId;
  public String billtoIdr;
  public String deliveryLocationId;
  public String deliveryLocationIdr;
  public String cProjectId;
  public String cProjectIdr;
  public String datepromised;
  public String scheddeliverydate;
  public String schedtransactiondate;
  public String transactiondate;
  public String totallines;
  public String grandtotal;
  public String invoicedamt;
  public String totalpaid;
  public String iscompletelyinvoiced;
  public String deliverycomplete;
  public String isdelivered;
  public String istaxincluded;
  public String generatetemplate;
  public String isprinted;
  public String docaction;
  public String dropshipBpartnerId;
  public String cIncotermsId;
  public String isselfservice;
  public String cActivityId;
  public String cCurrencyId;
  public String priorityrule;
  public String cPaymenttermId;
  public String processed;
  public String mShipperId;
  public String isinvoiced;
  public String adUserId;
  public String adOrgId;
  public String deliveryrule;
  public String cCampaignId;
  public String adOrgtrxId;
  public String mWarehouseId;
  public String adClientId;
  public String freightamt;
  public String paymentrule;
  public String user1Id;
  public String completeordervalue;
  public String user2Id;
  public String deliverynotes;
  public String invoicerule;
  public String dropshipLocationId;
  public String mPricelistId;
  public String incotermsdescription;
  public String cChargeId;
  public String issotrx;
  public String processing;
  public String freightcostrule;
  public String isdiscountprinted;
  public String posted;
  public String dateprinted;
  public String dropshipUserId;
  public String deliveryviarule;
  public String poreference;
  public String salesrepId;
  public String copyfrom;
  public String isselected;
  public String chargeamt;
  public String copyfrompo;
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
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("c_doctype_idr") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("docstatusr"))
      return docstatusr;
    else if (fieldName.equalsIgnoreCase("c_doctypetarget_id") || fieldName.equals("cDoctypetargetId"))
      return cDoctypetargetId;
    else if (fieldName.equalsIgnoreCase("c_doctypetarget_idr") || fieldName.equals("cDoctypetargetIdr"))
      return cDoctypetargetIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_idr") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("billto_id") || fieldName.equals("billtoId"))
      return billtoId;
    else if (fieldName.equalsIgnoreCase("billto_idr") || fieldName.equals("billtoIdr"))
      return billtoIdr;
    else if (fieldName.equalsIgnoreCase("delivery_location_id") || fieldName.equals("deliveryLocationId"))
      return deliveryLocationId;
    else if (fieldName.equalsIgnoreCase("delivery_location_idr") || fieldName.equals("deliveryLocationIdr"))
      return deliveryLocationIdr;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_project_idr") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("datepromised"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("scheddeliverydate"))
      return scheddeliverydate;
    else if (fieldName.equalsIgnoreCase("schedtransactiondate"))
      return schedtransactiondate;
    else if (fieldName.equalsIgnoreCase("transactiondate"))
      return transactiondate;
    else if (fieldName.equalsIgnoreCase("totallines"))
      return totallines;
    else if (fieldName.equalsIgnoreCase("grandtotal"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("invoicedamt"))
      return invoicedamt;
    else if (fieldName.equalsIgnoreCase("totalpaid"))
      return totalpaid;
    else if (fieldName.equalsIgnoreCase("iscompletelyinvoiced"))
      return iscompletelyinvoiced;
    else if (fieldName.equalsIgnoreCase("deliverycomplete"))
      return deliverycomplete;
    else if (fieldName.equalsIgnoreCase("isdelivered"))
      return isdelivered;
    else if (fieldName.equalsIgnoreCase("istaxincluded"))
      return istaxincluded;
    else if (fieldName.equalsIgnoreCase("generatetemplate"))
      return generatetemplate;
    else if (fieldName.equalsIgnoreCase("isprinted"))
      return isprinted;
    else if (fieldName.equalsIgnoreCase("docaction"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("dropship_bpartner_id") || fieldName.equals("dropshipBpartnerId"))
      return dropshipBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_incoterms_id") || fieldName.equals("cIncotermsId"))
      return cIncotermsId;
    else if (fieldName.equalsIgnoreCase("isselfservice"))
      return isselfservice;
    else if (fieldName.equalsIgnoreCase("c_activity_id") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("priorityrule"))
      return priorityrule;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_id") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("m_shipper_id") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("isinvoiced"))
      return isinvoiced;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("deliveryrule"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("c_campaign_id") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("ad_orgtrx_id") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("freightamt"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("paymentrule"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("completeordervalue"))
      return completeordervalue;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("deliverynotes"))
      return deliverynotes;
    else if (fieldName.equalsIgnoreCase("invoicerule"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("dropship_location_id") || fieldName.equals("dropshipLocationId"))
      return dropshipLocationId;
    else if (fieldName.equalsIgnoreCase("m_pricelist_id") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("incotermsdescription"))
      return incotermsdescription;
    else if (fieldName.equalsIgnoreCase("c_charge_id") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("issotrx"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("freightcostrule"))
      return freightcostrule;
    else if (fieldName.equalsIgnoreCase("isdiscountprinted"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("dateprinted"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("dropship_user_id") || fieldName.equals("dropshipUserId"))
      return dropshipUserId;
    else if (fieldName.equalsIgnoreCase("deliveryviarule"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("poreference"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("salesrep_id") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("copyfrom"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("isselected"))
      return isselected;
    else if (fieldName.equalsIgnoreCase("chargeamt"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("copyfrompo"))
      return copyfrompo;
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
  public static OrdersE157BADD4E594D8487B150B5F79C6B54Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPartner_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, C_BPartner_ID, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OrdersE157BADD4E594D8487B150B5F79C6B54Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPartner_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_Order.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Order.CreatedBy) as CreatedByR, " +
      "        to_char(C_Order.Updated, ?) as updated, " +
      "        to_char(C_Order.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Order.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Order.UpdatedBy) as UpdatedByR," +
      "        C_Order.C_Order_ID, " +
      "C_Order.DocumentNo, " +
      "C_Order.DateOrdered, " +
      "C_Order.DateAcct, " +
      "COALESCE(C_Order.IsActive, 'N') AS IsActive, " +
      "C_Order.C_DocType_ID, " +
      "(CASE WHEN C_Order.C_DocType_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS C_DocType_IDR, " +
      "C_Order.DocStatus, " +
      "(CASE WHEN C_Order.DocStatus IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS DocStatusR, " +
      "C_Order.C_DocTypeTarget_ID, " +
      "(CASE WHEN C_Order.C_DocTypeTarget_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_DocTypeTarget_IDR, " +
      "C_Order.Description, " +
      "C_Order.C_BPartner_ID, " +
      "(CASE WHEN C_Order.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_Order.C_BPartner_Location_ID, " +
      "(CASE WHEN C_Order.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "C_Order.BillTo_ID, " +
      "(CASE WHEN C_Order.BillTo_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS BillTo_IDR, " +
      "C_Order.Delivery_Location_ID, " +
      "(CASE WHEN C_Order.Delivery_Location_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS Delivery_Location_IDR, " +
      "C_Order.C_Project_ID, " +
      "(CASE WHEN C_Order.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_Order.DatePromised, " +
      "C_Order.SchedDeliveryDate, " +
      "C_Order.SchedTransactionDate, " +
      "C_Order.TransactionDate, " +
      "C_Order.TotalLines, " +
      "C_Order.GrandTotal, " +
      "C_Order.InvoicedAmt, " +
      "C_Order.TotalPaid, " +
      "COALESCE(C_Order.IsCompletelyInvoiced, 'N') AS IsCompletelyInvoiced, " +
      "COALESCE(C_Order.DeliveryComplete, 'N') AS DeliveryComplete, " +
      "COALESCE(C_Order.IsDelivered, 'N') AS IsDelivered, " +
      "COALESCE(C_Order.IsTaxIncluded, 'N') AS IsTaxIncluded, " +
      "C_Order.Generatetemplate, " +
      "COALESCE(C_Order.IsPrinted, 'N') AS IsPrinted, " +
      "C_Order.DocAction, " +
      "C_Order.DropShip_BPartner_ID, " +
      "C_Order.C_Incoterms_ID, " +
      "COALESCE(C_Order.IsSelfService, 'N') AS IsSelfService, " +
      "C_Order.C_Activity_ID, " +
      "C_Order.C_Currency_ID, " +
      "C_Order.PriorityRule, " +
      "C_Order.C_PaymentTerm_ID, " +
      "COALESCE(C_Order.Processed, 'N') AS Processed, " +
      "C_Order.M_Shipper_ID, " +
      "COALESCE(C_Order.IsInvoiced, 'N') AS IsInvoiced, " +
      "C_Order.AD_User_ID, " +
      "C_Order.AD_Org_ID, " +
      "C_Order.DeliveryRule, " +
      "C_Order.C_Campaign_ID, " +
      "C_Order.AD_OrgTrx_ID, " +
      "C_Order.M_Warehouse_ID, " +
      "C_Order.AD_Client_ID, " +
      "C_Order.FreightAmt, " +
      "C_Order.PaymentRule, " +
      "C_Order.User1_ID, " +
      "C_Order.CompleteOrderValue, " +
      "C_Order.User2_ID, " +
      "C_Order.Deliverynotes, " +
      "C_Order.InvoiceRule, " +
      "C_Order.DropShip_Location_ID, " +
      "C_Order.M_PriceList_ID, " +
      "C_Order.Incotermsdescription, " +
      "C_Order.C_Charge_ID, " +
      "COALESCE(C_Order.IsSOTrx, 'N') AS IsSOTrx, " +
      "C_Order.Processing, " +
      "C_Order.FreightCostRule, " +
      "COALESCE(C_Order.IsDiscountPrinted, 'N') AS IsDiscountPrinted, " +
      "C_Order.Posted, " +
      "C_Order.DatePrinted, " +
      "C_Order.DropShip_User_ID, " +
      "C_Order.DeliveryViaRule, " +
      "C_Order.POReference, " +
      "C_Order.SalesRep_ID, " +
      "C_Order.CopyFrom, " +
      "COALESCE(C_Order.IsSelected, 'N') AS IsSelected, " +
      "C_Order.ChargeAmt, " +
      "C_Order.CopyFromPO, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Order left join (select C_DocType_ID, Name from C_DocType) table1 on (C_Order.C_DocType_ID = table1.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL1 on (table1.C_DocType_ID = tableTRL1.C_DocType_ID and tableTRL1.AD_Language = ?)  left join ad_ref_list_v list1 on (C_Order.DocStatus = list1.value and list1.ad_reference_id = '131' and list1.ad_language = ?)  left join (select C_DocType_ID, Name from C_DocType) table2 on (C_Order.C_DocTypeTarget_ID =  table2.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL2 on (table2.C_DocType_ID = tableTRL2.C_DocType_ID and tableTRL2.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table3 on (C_Order.C_BPartner_ID = table3.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table4 on (C_Order.C_BPartner_Location_ID = table4.C_BPartner_Location_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table5 on (C_Order.BillTo_ID =  table5.C_BPartner_Location_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table6 on (C_Order.Delivery_Location_ID =  table6.C_BPartner_Location_ID) left join (select C_Project_ID, Value, Name from C_Project) table7 on (C_Order.C_Project_ID = table7.C_Project_ID)" +
      "        WHERE 2=2 " +
      " AND c_order.C_BPartner_ID = ?" +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND C_Order.C_BPartner_ID = ?  ");
    strSql = strSql + 
      "        AND C_Order.C_Order_ID = ? " +
      "        AND C_Order.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_Order.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_ID);
      if (cBpartnerId != null && !(cBpartnerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
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
        OrdersE157BADD4E594D8487B150B5F79C6B54Data objectOrdersE157BADD4E594D8487B150B5F79C6B54Data = new OrdersE157BADD4E594D8487B150B5F79C6B54Data();
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.created = UtilSql.getValue(result, "created");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.updated = UtilSql.getValue(result, "updated");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.documentno = UtilSql.getValue(result, "documentno");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.isactive = UtilSql.getValue(result, "isactive");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cDoctypeIdr = UtilSql.getValue(result, "c_doctype_idr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.docstatus = UtilSql.getValue(result, "docstatus");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.docstatusr = UtilSql.getValue(result, "docstatusr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cDoctypetargetId = UtilSql.getValue(result, "c_doctypetarget_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cDoctypetargetIdr = UtilSql.getValue(result, "c_doctypetarget_idr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.description = UtilSql.getValue(result, "description");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cBpartnerLocationIdr = UtilSql.getValue(result, "c_bpartner_location_idr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.billtoId = UtilSql.getValue(result, "billto_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.billtoIdr = UtilSql.getValue(result, "billto_idr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.deliveryLocationId = UtilSql.getValue(result, "delivery_location_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.deliveryLocationIdr = UtilSql.getValue(result, "delivery_location_idr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.datepromised = UtilSql.getDateValue(result, "datepromised", "dd-MM-yyyy");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.scheddeliverydate = UtilSql.getDateValue(result, "scheddeliverydate", "dd-MM-yyyy");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.schedtransactiondate = UtilSql.getDateValue(result, "schedtransactiondate", "dd-MM-yyyy");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.transactiondate = UtilSql.getDateValue(result, "transactiondate", "dd-MM-yyyy");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.totallines = UtilSql.getValue(result, "totallines");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.grandtotal = UtilSql.getValue(result, "grandtotal");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.invoicedamt = UtilSql.getValue(result, "invoicedamt");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.totalpaid = UtilSql.getValue(result, "totalpaid");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.iscompletelyinvoiced = UtilSql.getValue(result, "iscompletelyinvoiced");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.deliverycomplete = UtilSql.getValue(result, "deliverycomplete");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.isdelivered = UtilSql.getValue(result, "isdelivered");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.istaxincluded = UtilSql.getValue(result, "istaxincluded");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.generatetemplate = UtilSql.getValue(result, "generatetemplate");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.isprinted = UtilSql.getValue(result, "isprinted");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.docaction = UtilSql.getValue(result, "docaction");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.dropshipBpartnerId = UtilSql.getValue(result, "dropship_bpartner_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cIncotermsId = UtilSql.getValue(result, "c_incoterms_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.isselfservice = UtilSql.getValue(result, "isselfservice");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cActivityId = UtilSql.getValue(result, "c_activity_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.priorityrule = UtilSql.getValue(result, "priorityrule");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cPaymenttermId = UtilSql.getValue(result, "c_paymentterm_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.processed = UtilSql.getValue(result, "processed");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.mShipperId = UtilSql.getValue(result, "m_shipper_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.isinvoiced = UtilSql.getValue(result, "isinvoiced");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.deliveryrule = UtilSql.getValue(result, "deliveryrule");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cCampaignId = UtilSql.getValue(result, "c_campaign_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.adOrgtrxId = UtilSql.getValue(result, "ad_orgtrx_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.freightamt = UtilSql.getValue(result, "freightamt");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.paymentrule = UtilSql.getValue(result, "paymentrule");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.user1Id = UtilSql.getValue(result, "user1_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.completeordervalue = UtilSql.getValue(result, "completeordervalue");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.user2Id = UtilSql.getValue(result, "user2_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.deliverynotes = UtilSql.getValue(result, "deliverynotes");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.invoicerule = UtilSql.getValue(result, "invoicerule");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.dropshipLocationId = UtilSql.getValue(result, "dropship_location_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.mPricelistId = UtilSql.getValue(result, "m_pricelist_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.incotermsdescription = UtilSql.getValue(result, "incotermsdescription");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.cChargeId = UtilSql.getValue(result, "c_charge_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.issotrx = UtilSql.getValue(result, "issotrx");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.processing = UtilSql.getValue(result, "processing");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.freightcostrule = UtilSql.getValue(result, "freightcostrule");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.isdiscountprinted = UtilSql.getValue(result, "isdiscountprinted");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.posted = UtilSql.getValue(result, "posted");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.dateprinted = UtilSql.getDateValue(result, "dateprinted", "dd-MM-yyyy");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.dropshipUserId = UtilSql.getValue(result, "dropship_user_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.deliveryviarule = UtilSql.getValue(result, "deliveryviarule");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.poreference = UtilSql.getValue(result, "poreference");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.salesrepId = UtilSql.getValue(result, "salesrep_id");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.copyfrom = UtilSql.getValue(result, "copyfrom");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.isselected = UtilSql.getValue(result, "isselected");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.chargeamt = UtilSql.getValue(result, "chargeamt");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.copyfrompo = UtilSql.getValue(result, "copyfrompo");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.language = UtilSql.getValue(result, "language");
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.adUserClient = "";
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.adOrgClient = "";
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.createdby = "";
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.trBgcolor = "";
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.totalCount = "";
        objectOrdersE157BADD4E594D8487B150B5F79C6B54Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrdersE157BADD4E594D8487B150B5F79C6B54Data);
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
    OrdersE157BADD4E594D8487B150B5F79C6B54Data objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[] = new OrdersE157BADD4E594D8487B150B5F79C6B54Data[vector.size()];
    vector.copyInto(objectOrdersE157BADD4E594D8487B150B5F79C6B54Data);
    return(objectOrdersE157BADD4E594D8487B150B5F79C6B54Data);
  }

/**
Create a registry
 */
  public static OrdersE157BADD4E594D8487B150B5F79C6B54Data[] set(String cBpartnerId, String adUserId, String cBpartnerIdr, String dropshipLocationId, String billtoId, String isselected, String istaxincluded, String user2Id, String cChargeId, String docaction, String totallines, String posted, String isactive, String user1Id, String chargeamt, String deliverynotes, String scheddeliverydate, String cBpartnerLocationId, String cCampaignId, String invoicerule, String dropshipBpartnerId, String deliveryviarule, String mPricelistId, String datepromised, String cProjectId, String cProjectIdr, String docstatus, String transactiondate, String cOrderId, String copyfrom, String updatedby, String updatedbyr, String isdelivered, String deliveryrule, String deliveryLocationId, String dateacct, String cCurrencyId, String adOrgId, String completeordervalue, String schedtransactiondate, String copyfrompo, String deliverycomplete, String issotrx, String isselfservice, String createdby, String createdbyr, String cPaymenttermId, String dateordered, String paymentrule, String generatetemplate, String cActivityId, String documentno, String poreference, String dropshipUserId, String mWarehouseId, String salesrepId, String totalpaid, String cDoctypetargetId, String incotermsdescription, String invoicedamt, String processed, String isdiscountprinted, String freightcostrule, String description, String dateprinted, String isprinted, String grandtotal, String isinvoiced, String iscompletelyinvoiced, String cDoctypeId, String adOrgtrxId, String adClientId, String cIncotermsId, String priorityrule, String processing, String mShipperId, String freightamt)    throws ServletException {
    OrdersE157BADD4E594D8487B150B5F79C6B54Data objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[] = new OrdersE157BADD4E594D8487B150B5F79C6B54Data[1];
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0] = new OrdersE157BADD4E594D8487B150B5F79C6B54Data();
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].created = "";
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].createdbyr = createdbyr;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].updated = "";
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].updatedTimeStamp = "";
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].updatedby = updatedby;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].updatedbyr = updatedbyr;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cOrderId = cOrderId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].documentno = documentno;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].dateordered = dateordered;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].dateacct = dateacct;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].isactive = isactive;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cDoctypeId = cDoctypeId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cDoctypeIdr = "";
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].docstatus = docstatus;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].docstatusr = "";
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cDoctypetargetId = cDoctypetargetId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cDoctypetargetIdr = "";
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].description = description;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cBpartnerId = cBpartnerId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cBpartnerIdr = cBpartnerIdr;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cBpartnerLocationId = cBpartnerLocationId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cBpartnerLocationIdr = "";
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].billtoId = billtoId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].billtoIdr = "";
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].deliveryLocationId = deliveryLocationId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].deliveryLocationIdr = "";
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cProjectId = cProjectId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cProjectIdr = cProjectIdr;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].datepromised = datepromised;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].scheddeliverydate = scheddeliverydate;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].schedtransactiondate = schedtransactiondate;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].transactiondate = transactiondate;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].totallines = totallines;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].grandtotal = grandtotal;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].invoicedamt = invoicedamt;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].totalpaid = totalpaid;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].iscompletelyinvoiced = iscompletelyinvoiced;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].deliverycomplete = deliverycomplete;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].isdelivered = isdelivered;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].istaxincluded = istaxincluded;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].generatetemplate = generatetemplate;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].isprinted = isprinted;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].docaction = docaction;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].dropshipBpartnerId = dropshipBpartnerId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cIncotermsId = cIncotermsId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].isselfservice = isselfservice;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cActivityId = cActivityId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cCurrencyId = cCurrencyId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].priorityrule = priorityrule;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cPaymenttermId = cPaymenttermId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].processed = processed;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].mShipperId = mShipperId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].isinvoiced = isinvoiced;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].adUserId = adUserId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].adOrgId = adOrgId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].deliveryrule = deliveryrule;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cCampaignId = cCampaignId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].adOrgtrxId = adOrgtrxId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].mWarehouseId = mWarehouseId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].adClientId = adClientId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].freightamt = freightamt;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].paymentrule = paymentrule;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].user1Id = user1Id;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].completeordervalue = completeordervalue;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].user2Id = user2Id;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].deliverynotes = deliverynotes;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].invoicerule = invoicerule;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].dropshipLocationId = dropshipLocationId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].mPricelistId = mPricelistId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].incotermsdescription = incotermsdescription;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].cChargeId = cChargeId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].issotrx = issotrx;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].processing = processing;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].freightcostrule = freightcostrule;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].isdiscountprinted = isdiscountprinted;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].posted = posted;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].dateprinted = dateprinted;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].dropshipUserId = dropshipUserId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].deliveryviarule = deliveryviarule;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].poreference = poreference;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].salesrepId = salesrepId;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].copyfrom = copyfrom;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].isselected = isselected;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].chargeamt = chargeamt;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].copyfrompo = copyfrompo;
    objectOrdersE157BADD4E594D8487B150B5F79C6B54Data[0].language = "";
    return objectOrdersE157BADD4E594D8487B150B5F79C6B54Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2762_0(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDef3402_1(ConnectionProvider connectionProvider, String C_Project_IDR)    throws ServletException {
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
  public static String selectDef2168_2(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef2166_3(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_Order.C_BPartner_ID AS NAME" +
      "        FROM C_Order" +
      "        WHERE C_Order.C_Order_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table1 on (C_BPartner.C_BPartner_ID = table1.C_BPartner_ID) WHERE C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table1 on (C_BPartner.C_BPartner_ID = table1.C_BPartner_ID) WHERE C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
      "        UPDATE C_Order" +
      "        SET C_Order_ID = (?) , DocumentNo = (?) , DateOrdered = TO_DATE(?) , DateAcct = TO_DATE(?) , IsActive = (?) , C_DocType_ID = (?) , DocStatus = (?) , C_DocTypeTarget_ID = (?) , Description = (?) , C_BPartner_ID = (?) , C_BPartner_Location_ID = (?) , BillTo_ID = (?) , Delivery_Location_ID = (?) , C_Project_ID = (?) , DatePromised = TO_DATE(?) , SchedDeliveryDate = TO_DATE(?) , SchedTransactionDate = TO_DATE(?) , TransactionDate = TO_DATE(?) , TotalLines = TO_NUMBER(?) , GrandTotal = TO_NUMBER(?) , InvoicedAmt = TO_NUMBER(?) , TotalPaid = TO_NUMBER(?) , IsCompletelyInvoiced = (?) , DeliveryComplete = (?) , IsDelivered = (?) , IsTaxIncluded = (?) , Generatetemplate = (?) , IsPrinted = (?) , DocAction = (?) , DropShip_BPartner_ID = (?) , C_Incoterms_ID = (?) , IsSelfService = (?) , C_Activity_ID = (?) , C_Currency_ID = (?) , PriorityRule = (?) , C_PaymentTerm_ID = (?) , Processed = (?) , M_Shipper_ID = (?) , IsInvoiced = (?) , AD_User_ID = (?) , AD_Org_ID = (?) , DeliveryRule = (?) , C_Campaign_ID = (?) , AD_OrgTrx_ID = (?) , M_Warehouse_ID = (?) , AD_Client_ID = (?) , FreightAmt = TO_NUMBER(?) , PaymentRule = (?) , User1_ID = (?) , CompleteOrderValue = TO_NUMBER(?) , User2_ID = (?) , Deliverynotes = (?) , InvoiceRule = (?) , DropShip_Location_ID = (?) , M_PriceList_ID = (?) , Incotermsdescription = (?) , C_Charge_ID = (?) , IsSOTrx = (?) , Processing = (?) , FreightCostRule = (?) , IsDiscountPrinted = (?) , Posted = (?) , DatePrinted = TO_DATE(?) , DropShip_User_ID = (?) , DeliveryViaRule = (?) , POReference = (?) , SalesRep_ID = (?) , CopyFrom = (?) , IsSelected = (?) , ChargeAmt = TO_NUMBER(?) , CopyFromPO = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_Order.C_Order_ID = ? " +
      "                 AND C_Order.C_BPartner_ID = ? " +
      "        AND C_Order.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Order.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, schedtransactiondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, transactiondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalpaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscompletelyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverycomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatetemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cIncotermsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, completeordervalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverynotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, incotermsdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselected);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrompo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
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
      "        INSERT INTO C_Order " +
      "        (C_Order_ID, DocumentNo, DateOrdered, DateAcct, IsActive, C_DocType_ID, DocStatus, C_DocTypeTarget_ID, Description, C_BPartner_ID, C_BPartner_Location_ID, BillTo_ID, Delivery_Location_ID, C_Project_ID, DatePromised, SchedDeliveryDate, SchedTransactionDate, TransactionDate, TotalLines, GrandTotal, InvoicedAmt, TotalPaid, IsCompletelyInvoiced, DeliveryComplete, IsDelivered, IsTaxIncluded, Generatetemplate, IsPrinted, DocAction, DropShip_BPartner_ID, C_Incoterms_ID, IsSelfService, C_Activity_ID, C_Currency_ID, PriorityRule, C_PaymentTerm_ID, Processed, M_Shipper_ID, IsInvoiced, AD_User_ID, AD_Org_ID, DeliveryRule, C_Campaign_ID, AD_OrgTrx_ID, M_Warehouse_ID, AD_Client_ID, FreightAmt, PaymentRule, User1_ID, CompleteOrderValue, User2_ID, Deliverynotes, InvoiceRule, DropShip_Location_ID, M_PriceList_ID, Incotermsdescription, C_Charge_ID, IsSOTrx, Processing, FreightCostRule, IsDiscountPrinted, Posted, DatePrinted, DropShip_User_ID, DeliveryViaRule, POReference, SalesRep_ID, CopyFrom, IsSelected, ChargeAmt, CopyFromPO, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, schedtransactiondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, transactiondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalpaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscompletelyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverycomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatetemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cIncotermsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, completeordervalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverynotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, incotermsdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselected);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrompo);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cBpartnerId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_Order" +
      "        WHERE C_Order.C_Order_ID = ? " +
      "                 AND C_Order.C_BPartner_ID = ? " +
      "        AND C_Order.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Order.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_Order" +
      "        WHERE C_Order.C_Order_ID = ? " +
      "                 AND C_Order.C_BPartner_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
      "          FROM C_Order" +
      "         WHERE C_Order.C_Order_ID = ? ";

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
      "          FROM C_Order" +
      "         WHERE C_Order.C_Order_ID = ? ";

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
