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
class OrdersMLM960A4C797C884245ABE57C603A334D82Data implements FieldProvider {
static Logger log4j = Logger.getLogger(OrdersMLM960A4C797C884245ABE57C603A334D82Data.class);
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
  public String documentno;
  public String poreference;
  public String dateordered;
  public String performanceperiodstart;
  public String performanceperiodend;
  public String cDoctypetargetId;
  public String cDoctypetargetIdr;
  public String name;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String docstatus;
  public String docstatusr;
  public String description;
  public String deliverynotes;
  public String internalnote;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String bpzipcode;
  public String billtoId;
  public String billtoIdr;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String adUserId;
  public String adUserIdr;
  public String salesrepId;
  public String salesrepIdr;
  public String mPricelistId;
  public String mPricelistIdr;
  public String isdiscountprinted;
  public String invoicerule;
  public String invoiceruler;
  public String estpropability;
  public String estpropabilityr;
  public String mWarehouseId;
  public String mWarehouseIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String deliveryrule;
  public String deliveryruler;
  public String priorityrule;
  public String priorityruler;
  public String paymentrule;
  public String paymentruler;
  public String cPaymenttermId;
  public String cPaymenttermIdr;
  public String cIncotermsId;
  public String cIncotermsIdr;
  public String deliveryLocationId;
  public String deliveryLocationIdr;
  public String deliveryviarule;
  public String deliveryviaruler;
  public String mShipperId;
  public String mShipperIdr;
  public String weight;
  public String weightUom;
  public String weightUomr;
  public String freightcostrule;
  public String freightcostruler;
  public String mProductId;
  public String mProductIdr;
  public String qty;
  public String freightamt;
  public String cProjectId;
  public String cProjectIdr;
  public String cProjecttaskId;
  public String cProjecttaskIdr;
  public String orderselfjoin;
  public String orderselfjoinr;
  public String firstschedinvoicedate;
  public String datepromised;
  public String scheddeliverydate;
  public String schedtransactiondate;
  public String transactiondate;
  public String contractdate;
  public String enddate;
  public String invoicefrequence;
  public String invoicefrequencer;
  public String isinvoiceafterfirstcycle;
  public String quarterlyMonth;
  public String quarterlyMonthr;
  public String yearlyMonth;
  public String yearlyMonthr;
  public String weeklyDay;
  public String weeklyDayr;
  public String monthlyDay;
  public String proposalstatus;
  public String proposalstatusr;
  public String lostproposalfixedreason;
  public String lostproposalfixedreasonr;
  public String lostproposalreason;
  public String totallinesonetime;
  public String grandtotalonetime;
  public String totallines;
  public String grandtotal;
  public String invoicedamt;
  public String totalpaid;
  public String completeordervalue;
  public String iscompletelyinvoiced;
  public String deliverycomplete;
  public String subscriptionchangedate;
  public String docaction;
  public String docactionBtn;
  public String generatetemplate;
  public String copyfrom;
  public String copyfrompo;
  public String generateproject;
  public String closeproject;
  public String cOrderId;
  public String dropshipUserId;
  public String adOrgtrxId;
  public String isrecharge;
  public String cBidprojectId;
  public String istaxincluded;
  public String user1Id;
  public String isprinted;
  public String btncopytemplate;
  public String dateacct;
  public String isselected;
  public String processed;
  public String incotermsdescription;
  public String dropshipBpartnerId;
  public String user2Id;
  public String ispaid;
  public String chargeamt;
  public String isselfservice;
  public String isdelivered;
  public String posted;
  public String aAssetId;
  public String transactionreference;
  public String isinvoiced;
  public String processing;
  public String cProjectphaseId;
  public String cChargeId;
  public String cCampaignId;
  public String cActivityId;
  public String isactive;
  public String dateprinted;
  public String issotrx;
  public String dropshipLocationId;
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
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("poreference"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("performanceperiodstart"))
      return performanceperiodstart;
    else if (fieldName.equalsIgnoreCase("performanceperiodend"))
      return performanceperiodend;
    else if (fieldName.equalsIgnoreCase("c_doctypetarget_id") || fieldName.equals("cDoctypetargetId"))
      return cDoctypetargetId;
    else if (fieldName.equalsIgnoreCase("c_doctypetarget_idr") || fieldName.equals("cDoctypetargetIdr"))
      return cDoctypetargetIdr;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("c_doctype_idr") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("docstatusr"))
      return docstatusr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("deliverynotes"))
      return deliverynotes;
    else if (fieldName.equalsIgnoreCase("internalnote"))
      return internalnote;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("bpzipcode"))
      return bpzipcode;
    else if (fieldName.equalsIgnoreCase("billto_id") || fieldName.equals("billtoId"))
      return billtoId;
    else if (fieldName.equalsIgnoreCase("billto_idr") || fieldName.equals("billtoIdr"))
      return billtoIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_idr") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("ad_user_idr") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("salesrep_id") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("salesrep_idr") || fieldName.equals("salesrepIdr"))
      return salesrepIdr;
    else if (fieldName.equalsIgnoreCase("m_pricelist_id") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("m_pricelist_idr") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("isdiscountprinted"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("invoicerule"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("invoiceruler"))
      return invoiceruler;
    else if (fieldName.equalsIgnoreCase("estpropability"))
      return estpropability;
    else if (fieldName.equalsIgnoreCase("estpropabilityr"))
      return estpropabilityr;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("m_warehouse_idr") || fieldName.equals("mWarehouseIdr"))
      return mWarehouseIdr;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("deliveryrule"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("deliveryruler"))
      return deliveryruler;
    else if (fieldName.equalsIgnoreCase("priorityrule"))
      return priorityrule;
    else if (fieldName.equalsIgnoreCase("priorityruler"))
      return priorityruler;
    else if (fieldName.equalsIgnoreCase("paymentrule"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("paymentruler"))
      return paymentruler;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_id") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_idr") || fieldName.equals("cPaymenttermIdr"))
      return cPaymenttermIdr;
    else if (fieldName.equalsIgnoreCase("c_incoterms_id") || fieldName.equals("cIncotermsId"))
      return cIncotermsId;
    else if (fieldName.equalsIgnoreCase("c_incoterms_idr") || fieldName.equals("cIncotermsIdr"))
      return cIncotermsIdr;
    else if (fieldName.equalsIgnoreCase("delivery_location_id") || fieldName.equals("deliveryLocationId"))
      return deliveryLocationId;
    else if (fieldName.equalsIgnoreCase("delivery_location_idr") || fieldName.equals("deliveryLocationIdr"))
      return deliveryLocationIdr;
    else if (fieldName.equalsIgnoreCase("deliveryviarule"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("deliveryviaruler"))
      return deliveryviaruler;
    else if (fieldName.equalsIgnoreCase("m_shipper_id") || fieldName.equals("mShipperId"))
      return mShipperId;
    else if (fieldName.equalsIgnoreCase("m_shipper_idr") || fieldName.equals("mShipperIdr"))
      return mShipperIdr;
    else if (fieldName.equalsIgnoreCase("weight"))
      return weight;
    else if (fieldName.equalsIgnoreCase("weight_uom") || fieldName.equals("weightUom"))
      return weightUom;
    else if (fieldName.equalsIgnoreCase("weight_uomr") || fieldName.equals("weightUomr"))
      return weightUomr;
    else if (fieldName.equalsIgnoreCase("freightcostrule"))
      return freightcostrule;
    else if (fieldName.equalsIgnoreCase("freightcostruler"))
      return freightcostruler;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("freightamt"))
      return freightamt;
    else if (fieldName.equalsIgnoreCase("c_project_id") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("c_project_idr") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("c_projecttask_id") || fieldName.equals("cProjecttaskId"))
      return cProjecttaskId;
    else if (fieldName.equalsIgnoreCase("c_projecttask_idr") || fieldName.equals("cProjecttaskIdr"))
      return cProjecttaskIdr;
    else if (fieldName.equalsIgnoreCase("orderselfjoin"))
      return orderselfjoin;
    else if (fieldName.equalsIgnoreCase("orderselfjoinr"))
      return orderselfjoinr;
    else if (fieldName.equalsIgnoreCase("firstschedinvoicedate"))
      return firstschedinvoicedate;
    else if (fieldName.equalsIgnoreCase("datepromised"))
      return datepromised;
    else if (fieldName.equalsIgnoreCase("scheddeliverydate"))
      return scheddeliverydate;
    else if (fieldName.equalsIgnoreCase("schedtransactiondate"))
      return schedtransactiondate;
    else if (fieldName.equalsIgnoreCase("transactiondate"))
      return transactiondate;
    else if (fieldName.equalsIgnoreCase("contractdate"))
      return contractdate;
    else if (fieldName.equalsIgnoreCase("enddate"))
      return enddate;
    else if (fieldName.equalsIgnoreCase("invoicefrequence"))
      return invoicefrequence;
    else if (fieldName.equalsIgnoreCase("invoicefrequencer"))
      return invoicefrequencer;
    else if (fieldName.equalsIgnoreCase("isinvoiceafterfirstcycle"))
      return isinvoiceafterfirstcycle;
    else if (fieldName.equalsIgnoreCase("quarterly_month") || fieldName.equals("quarterlyMonth"))
      return quarterlyMonth;
    else if (fieldName.equalsIgnoreCase("quarterly_monthr") || fieldName.equals("quarterlyMonthr"))
      return quarterlyMonthr;
    else if (fieldName.equalsIgnoreCase("yearly_month") || fieldName.equals("yearlyMonth"))
      return yearlyMonth;
    else if (fieldName.equalsIgnoreCase("yearly_monthr") || fieldName.equals("yearlyMonthr"))
      return yearlyMonthr;
    else if (fieldName.equalsIgnoreCase("weekly_day") || fieldName.equals("weeklyDay"))
      return weeklyDay;
    else if (fieldName.equalsIgnoreCase("weekly_dayr") || fieldName.equals("weeklyDayr"))
      return weeklyDayr;
    else if (fieldName.equalsIgnoreCase("monthly_day") || fieldName.equals("monthlyDay"))
      return monthlyDay;
    else if (fieldName.equalsIgnoreCase("proposalstatus"))
      return proposalstatus;
    else if (fieldName.equalsIgnoreCase("proposalstatusr"))
      return proposalstatusr;
    else if (fieldName.equalsIgnoreCase("lostproposalfixedreason"))
      return lostproposalfixedreason;
    else if (fieldName.equalsIgnoreCase("lostproposalfixedreasonr"))
      return lostproposalfixedreasonr;
    else if (fieldName.equalsIgnoreCase("lostproposalreason"))
      return lostproposalreason;
    else if (fieldName.equalsIgnoreCase("totallinesonetime"))
      return totallinesonetime;
    else if (fieldName.equalsIgnoreCase("grandtotalonetime"))
      return grandtotalonetime;
    else if (fieldName.equalsIgnoreCase("totallines"))
      return totallines;
    else if (fieldName.equalsIgnoreCase("grandtotal"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("invoicedamt"))
      return invoicedamt;
    else if (fieldName.equalsIgnoreCase("totalpaid"))
      return totalpaid;
    else if (fieldName.equalsIgnoreCase("completeordervalue"))
      return completeordervalue;
    else if (fieldName.equalsIgnoreCase("iscompletelyinvoiced"))
      return iscompletelyinvoiced;
    else if (fieldName.equalsIgnoreCase("deliverycomplete"))
      return deliverycomplete;
    else if (fieldName.equalsIgnoreCase("subscriptionchangedate"))
      return subscriptionchangedate;
    else if (fieldName.equalsIgnoreCase("docaction"))
      return docaction;
    else if (fieldName.equalsIgnoreCase("docaction_btn") || fieldName.equals("docactionBtn"))
      return docactionBtn;
    else if (fieldName.equalsIgnoreCase("generatetemplate"))
      return generatetemplate;
    else if (fieldName.equalsIgnoreCase("copyfrom"))
      return copyfrom;
    else if (fieldName.equalsIgnoreCase("copyfrompo"))
      return copyfrompo;
    else if (fieldName.equalsIgnoreCase("generateproject"))
      return generateproject;
    else if (fieldName.equalsIgnoreCase("closeproject"))
      return closeproject;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("dropship_user_id") || fieldName.equals("dropshipUserId"))
      return dropshipUserId;
    else if (fieldName.equalsIgnoreCase("ad_orgtrx_id") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("isrecharge"))
      return isrecharge;
    else if (fieldName.equalsIgnoreCase("c_bidproject_id") || fieldName.equals("cBidprojectId"))
      return cBidprojectId;
    else if (fieldName.equalsIgnoreCase("istaxincluded"))
      return istaxincluded;
    else if (fieldName.equalsIgnoreCase("user1_id") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("isprinted"))
      return isprinted;
    else if (fieldName.equalsIgnoreCase("btncopytemplate"))
      return btncopytemplate;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("isselected"))
      return isselected;
    else if (fieldName.equalsIgnoreCase("processed"))
      return processed;
    else if (fieldName.equalsIgnoreCase("incotermsdescription"))
      return incotermsdescription;
    else if (fieldName.equalsIgnoreCase("dropship_bpartner_id") || fieldName.equals("dropshipBpartnerId"))
      return dropshipBpartnerId;
    else if (fieldName.equalsIgnoreCase("user2_id") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("ispaid"))
      return ispaid;
    else if (fieldName.equalsIgnoreCase("chargeamt"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("isselfservice"))
      return isselfservice;
    else if (fieldName.equalsIgnoreCase("isdelivered"))
      return isdelivered;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("a_asset_id") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("transactionreference"))
      return transactionreference;
    else if (fieldName.equalsIgnoreCase("isinvoiced"))
      return isinvoiced;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("c_projectphase_id") || fieldName.equals("cProjectphaseId"))
      return cProjectphaseId;
    else if (fieldName.equalsIgnoreCase("c_charge_id") || fieldName.equals("cChargeId"))
      return cChargeId;
    else if (fieldName.equalsIgnoreCase("c_campaign_id") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("c_activity_id") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("dateprinted"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("issotrx"))
      return issotrx;
    else if (fieldName.equalsIgnoreCase("dropship_location_id") || fieldName.equals("dropshipLocationId"))
      return dropshipLocationId;
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
  public static OrdersMLM960A4C797C884245ABE57C603A334D82Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPARTNER_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, C_BPARTNER_ID, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OrdersMLM960A4C797C884245ABE57C603A334D82Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPARTNER_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_Order.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Order.CreatedBy) as CreatedByR, " +
      "        to_char(C_Order.Updated, ?) as updated, " +
      "        to_char(C_Order.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Order.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Order.UpdatedBy) as UpdatedByR," +
      "        C_Order.AD_Client_ID, " +
      "(CASE WHEN C_Order.AD_Client_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Client_IDR, " +
      "C_Order.AD_Org_ID, " +
      "(CASE WHEN C_Order.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_Order.DocumentNo, " +
      "C_Order.POReference, " +
      "C_Order.DateOrdered, " +
      "C_Order.performanceperiodstart, " +
      "C_Order.performanceperiodend, " +
      "C_Order.C_DocTypeTarget_ID, " +
      "(CASE WHEN C_Order.C_DocTypeTarget_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_DocTypeTarget_IDR, " +
      "C_Order.Name, " +
      "C_Order.C_DocType_ID, " +
      "(CASE WHEN C_Order.C_DocType_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS C_DocType_IDR, " +
      "C_Order.DocStatus, " +
      "(CASE WHEN C_Order.DocStatus IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS DocStatusR, " +
      "C_Order.Description, " +
      "C_Order.Deliverynotes, " +
      "C_Order.Internalnote, " +
      "C_Order.C_BPartner_ID, " +
      "(CASE WHEN C_Order.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_Order.bpzipcode, " +
      "C_Order.BillTo_ID, " +
      "(CASE WHEN C_Order.BillTo_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS BillTo_IDR, " +
      "C_Order.C_BPartner_Location_ID, " +
      "(CASE WHEN C_Order.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "C_Order.AD_User_ID, " +
      "(CASE WHEN C_Order.AD_User_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "C_Order.SalesRep_ID, " +
      "(CASE WHEN C_Order.SalesRep_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS SalesRep_IDR, " +
      "C_Order.M_PriceList_ID, " +
      "(CASE WHEN C_Order.M_PriceList_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "COALESCE(C_Order.IsDiscountPrinted, 'N') AS IsDiscountPrinted, " +
      "C_Order.InvoiceRule, " +
      "(CASE WHEN C_Order.InvoiceRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS InvoiceRuleR, " +
      "C_Order.Estpropability, " +
      "(CASE WHEN C_Order.Estpropability IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS EstpropabilityR, " +
      "C_Order.M_Warehouse_ID, " +
      "(CASE WHEN C_Order.M_Warehouse_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS M_Warehouse_IDR, " +
      "C_Order.C_Currency_ID, " +
      "(CASE WHEN C_Order.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "C_Order.DeliveryRule, " +
      "(CASE WHEN C_Order.DeliveryRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list4.name),'') ) END) AS DeliveryRuleR, " +
      "C_Order.PriorityRule, " +
      "(CASE WHEN C_Order.PriorityRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list5.name),'') ) END) AS PriorityRuleR, " +
      "C_Order.PaymentRule, " +
      "(CASE WHEN C_Order.PaymentRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list6.name),'') ) END) AS PaymentRuleR, " +
      "C_Order.C_PaymentTerm_ID, " +
      "(CASE WHEN C_Order.C_PaymentTerm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL13.Name IS NULL THEN TO_CHAR(table13.Name) ELSE TO_CHAR(tableTRL13.Name) END)), ''))),'') ) END) AS C_PaymentTerm_IDR, " +
      "C_Order.C_Incoterms_ID, " +
      "(CASE WHEN C_Order.C_Incoterms_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table14.Name), ''))),'') ) END) AS C_Incoterms_IDR, " +
      "C_Order.Delivery_Location_ID, " +
      "(CASE WHEN C_Order.Delivery_Location_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table15.Name), ''))),'') ) END) AS Delivery_Location_IDR, " +
      "C_Order.DeliveryViaRule, " +
      "(CASE WHEN C_Order.DeliveryViaRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list7.name),'') ) END) AS DeliveryViaRuleR, " +
      "C_Order.M_Shipper_ID, " +
      "(CASE WHEN C_Order.M_Shipper_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table16.Name), ''))),'') ) END) AS M_Shipper_IDR, " +
      "C_Order.Weight, " +
      "C_Order.Weight_Uom, " +
      "(CASE WHEN C_Order.Weight_Uom IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL17.Name IS NULL THEN TO_CHAR(table17.Name) ELSE TO_CHAR(tableTRL17.Name) END)), ''))),'') ) END) AS Weight_UomR, " +
      "C_Order.FreightCostRule, " +
      "(CASE WHEN C_Order.FreightCostRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list8.name),'') ) END) AS FreightCostRuleR, " +
      "C_Order.M_Product_ID, " +
      "(CASE WHEN C_Order.M_Product_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL18.Name IS NULL THEN TO_CHAR(table18.Name) ELSE TO_CHAR(tableTRL18.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "C_Order.Qty, " +
      "C_Order.FreightAmt, " +
      "C_Order.C_Project_ID, " +
      "(CASE WHEN C_Order.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table19.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table19.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "C_Order.C_Projecttask_ID, " +
      "(CASE WHEN C_Order.C_Projecttask_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table20.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table21.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table21.Name), ''))),'') ) END) AS C_Projecttask_IDR, " +
      "C_Order.Orderselfjoin, " +
      "(CASE WHEN C_Order.Orderselfjoin IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table22.DocumentNo), ''))),'') ) END) AS OrderselfjoinR, " +
      "C_Order.Firstschedinvoicedate, " +
      "C_Order.DatePromised, " +
      "C_Order.SchedDeliveryDate, " +
      "C_Order.SchedTransactionDate, " +
      "C_Order.TransactionDate, " +
      "C_Order.Contractdate, " +
      "C_Order.Enddate, " +
      "C_Order.Invoicefrequence, " +
      "(CASE WHEN C_Order.Invoicefrequence IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list9.name),'') ) END) AS InvoicefrequenceR, " +
      "COALESCE(C_Order.Isinvoiceafterfirstcycle, 'N') AS Isinvoiceafterfirstcycle, " +
      "C_Order.Quarterly_Month, " +
      "(CASE WHEN C_Order.Quarterly_Month IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list10.name),'') ) END) AS Quarterly_MonthR, " +
      "C_Order.Yearly_Month, " +
      "(CASE WHEN C_Order.Yearly_Month IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list11.name),'') ) END) AS Yearly_MonthR, " +
      "C_Order.Weekly_Day, " +
      "(CASE WHEN C_Order.Weekly_Day IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list12.name),'') ) END) AS Weekly_DayR, " +
      "C_Order.Monthly_Day, " +
      "C_Order.Proposalstatus, " +
      "(CASE WHEN C_Order.Proposalstatus IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list13.name),'') ) END) AS ProposalstatusR, " +
      "C_Order.Lostproposalfixedreason, " +
      "(CASE WHEN C_Order.Lostproposalfixedreason IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list14.name),'') ) END) AS LostproposalfixedreasonR, " +
      "C_Order.Lostproposalreason, " +
      "C_Order.Totallinesonetime, " +
      "C_Order.Grandtotalonetime, " +
      "C_Order.TotalLines, " +
      "C_Order.GrandTotal, " +
      "C_Order.InvoicedAmt, " +
      "C_Order.TotalPaid, " +
      "C_Order.CompleteOrderValue, " +
      "COALESCE(C_Order.IsCompletelyInvoiced, 'N') AS IsCompletelyInvoiced, " +
      "COALESCE(C_Order.DeliveryComplete, 'N') AS DeliveryComplete, " +
      "C_Order.Subscriptionchangedate, " +
      "C_Order.DocAction, " +
      "list15.name as DocAction_BTN, " +
      "C_Order.Generatetemplate, " +
      "C_Order.CopyFrom, " +
      "C_Order.CopyFromPO, " +
      "C_Order.Generateproject, " +
      "C_Order.Closeproject, " +
      "C_Order.C_Order_ID, " +
      "C_Order.DropShip_User_ID, " +
      "C_Order.AD_OrgTrx_ID, " +
      "COALESCE(C_Order.Isrecharge, 'N') AS Isrecharge, " +
      "C_Order.C_Bidproject_ID, " +
      "COALESCE(C_Order.IsTaxIncluded, 'N') AS IsTaxIncluded, " +
      "C_Order.User1_ID, " +
      "COALESCE(C_Order.IsPrinted, 'N') AS IsPrinted, " +
      "C_Order.BtnCopyTemplate, " +
      "C_Order.DateAcct, " +
      "COALESCE(C_Order.IsSelected, 'N') AS IsSelected, " +
      "COALESCE(C_Order.Processed, 'N') AS Processed, " +
      "C_Order.Incotermsdescription, " +
      "C_Order.DropShip_BPartner_ID, " +
      "C_Order.User2_ID, " +
      "COALESCE(C_Order.Ispaid, 'N') AS Ispaid, " +
      "C_Order.ChargeAmt, " +
      "COALESCE(C_Order.IsSelfService, 'N') AS IsSelfService, " +
      "COALESCE(C_Order.IsDelivered, 'N') AS IsDelivered, " +
      "C_Order.Posted, " +
      "C_Order.A_Asset_ID, " +
      "C_Order.Transactionreference, " +
      "COALESCE(C_Order.IsInvoiced, 'N') AS IsInvoiced, " +
      "C_Order.Processing, " +
      "C_Order.C_Projectphase_ID, " +
      "C_Order.C_Charge_ID, " +
      "C_Order.C_Campaign_ID, " +
      "C_Order.C_Activity_ID, " +
      "COALESCE(C_Order.IsActive, 'N') AS IsActive, " +
      "C_Order.DatePrinted, " +
      "COALESCE(C_Order.IsSOTrx, 'N') AS IsSOTrx, " +
      "C_Order.DropShip_Location_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Order left join (select AD_Client_ID, Name from AD_Client) table1 on (C_Order.AD_Client_ID = table1.AD_Client_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (C_Order.AD_Org_ID = table2.AD_Org_ID) left join (select C_DocType_ID, Name from C_DocType) table3 on (C_Order.C_DocTypeTarget_ID =  table3.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL3 on (table3.C_DocType_ID = tableTRL3.C_DocType_ID and tableTRL3.AD_Language = ?)  left join (select C_DocType_ID, Name from C_DocType) table4 on (C_Order.C_DocType_ID = table4.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL4 on (table4.C_DocType_ID = tableTRL4.C_DocType_ID and tableTRL4.AD_Language = ?)  left join ad_ref_list_v list1 on (C_Order.DocStatus = list1.value and list1.ad_reference_id = '131' and list1.ad_language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table5 on (C_Order.C_BPartner_ID = table5.C_BPartner_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table6 on (C_Order.BillTo_ID =  table6.C_BPartner_Location_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table7 on (C_Order.C_BPartner_Location_ID = table7.C_BPartner_Location_ID) left join (select AD_User_ID, Name from AD_User) table8 on (C_Order.AD_User_ID = table8.AD_User_ID) left join (select AD_User_ID, Name from AD_User) table9 on (C_Order.SalesRep_ID =  table9.AD_User_ID) left join (select M_PriceList_ID, Name from M_PriceList) table10 on (C_Order.M_PriceList_ID = table10.M_PriceList_ID) left join ad_ref_list_v list2 on (C_Order.InvoiceRule = list2.value and list2.ad_reference_id = '150' and list2.ad_language = ?)  left join ad_ref_list_v list3 on (C_Order.Estpropability = list3.value and list3.ad_reference_id = 'DD6AA16AB1DD4DF5AD11A2665AE665BC' and list3.ad_language = ?)  left join (select M_Warehouse_ID, Name from M_Warehouse) table11 on (C_Order.M_Warehouse_ID =  table11.M_Warehouse_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table12 on (C_Order.C_Currency_ID = table12.C_Currency_ID) left join ad_ref_list_v list4 on (C_Order.DeliveryRule = list4.value and list4.ad_reference_id = '151' and list4.ad_language = ?)  left join ad_ref_list_v list5 on (C_Order.PriorityRule = list5.value and list5.ad_reference_id = '154' and list5.ad_language = ?)  left join ad_ref_list_v list6 on (C_Order.PaymentRule = list6.value and list6.ad_reference_id = '195' and list6.ad_language = ?)  left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table13 on (C_Order.C_PaymentTerm_ID = table13.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL13 on (table13.C_PaymentTerm_ID = tableTRL13.C_PaymentTerm_ID and tableTRL13.AD_Language = ?)  left join (select C_Incoterms_ID, Name from C_Incoterms) table14 on (C_Order.C_Incoterms_ID = table14.C_Incoterms_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table15 on (C_Order.Delivery_Location_ID =  table15.C_BPartner_Location_ID) left join ad_ref_list_v list7 on (C_Order.DeliveryViaRule = list7.value and list7.ad_reference_id = '152' and list7.ad_language = ?)  left join (select M_Shipper_ID, Name from M_Shipper) table16 on (C_Order.M_Shipper_ID = table16.M_Shipper_ID) left join (select C_UOM_ID, Name from C_UOM) table17 on (C_Order.Weight_Uom =  table17.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL17 on (table17.C_UOM_ID = tableTRL17.C_UOM_ID and tableTRL17.AD_Language = ?)  left join ad_ref_list_v list8 on (C_Order.FreightCostRule = list8.value and list8.ad_reference_id = '153' and list8.ad_language = ?)  left join (select M_Product_ID, value, Name from M_Product) table18 on (C_Order.M_Product_ID =  table18.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL18 on (table18.M_Product_ID = tableTRL18.M_Product_ID and tableTRL18.AD_Language = ?)  left join (select C_Project_ID, Value, Name from C_Project) table19 on (C_Order.C_Project_ID = table19.C_Project_ID) left join (select C_Projecttask_ID, Name, C_Project_ID from C_Projecttask) table20 on (C_Order.C_Projecttask_ID = table20.C_Projecttask_ID) left join (select C_Project_ID, Value, Name from C_Project) table21 on (table20.C_Project_ID = table21.C_Project_ID) left join (select C_Order_ID, DocumentNo from C_Order) table22 on (C_Order.Orderselfjoin =  table22.C_Order_ID) left join ad_ref_list_v list9 on (C_Order.Invoicefrequence = list9.value and list9.ad_reference_id = 'F17BFE71276743BBB6105EE61D9FD666' and list9.ad_language = ?)  left join ad_ref_list_v list10 on (C_Order.Quarterly_Month = list10.value and list10.ad_reference_id = '99780AA6C1644A329162A8AF74602925' and list10.ad_language = ?)  left join ad_ref_list_v list11 on (C_Order.Yearly_Month = list11.value and list11.ad_reference_id = 'B849337BE90242BEB0B230808EDC0CEE' and list11.ad_language = ?)  left join ad_ref_list_v list12 on (C_Order.Weekly_Day = list12.value and list12.ad_reference_id = '167' and list12.ad_language = ?)  left join ad_ref_list_v list13 on (C_Order.Proposalstatus = list13.value and list13.ad_reference_id = 'B00D78B6B154404A831F25F11ABD867E' and list13.ad_language = ?)  left join ad_ref_list_v list14 on (C_Order.Lostproposalfixedreason = list14.value and list14.ad_reference_id = 'B51F770E9FA84F5B8FC0FFD7B3848317' and list14.ad_language = ?)  left join ad_ref_list_v list15 on (list15.ad_reference_id = '135' and list15.ad_language = ?  AND (CASE C_Order.DocAction WHEN '--' THEN 'CL' ELSE TO_CHAR(C_Order.DocAction) END) = list15.value)" +
      "        WHERE 2=2 " +
      " AND c_order.salesrep_ID = (select ad_user_id from ad_user where C_BPARTNER_ID=? LIMIT 1)" +
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPARTNER_ID);
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
        OrdersMLM960A4C797C884245ABE57C603A334D82Data objectOrdersMLM960A4C797C884245ABE57C603A334D82Data = new OrdersMLM960A4C797C884245ABE57C603A334D82Data();
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.created = UtilSql.getValue(result, "created");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.updated = UtilSql.getValue(result, "updated");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.adClientIdr = UtilSql.getValue(result, "ad_client_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.documentno = UtilSql.getValue(result, "documentno");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.poreference = UtilSql.getValue(result, "poreference");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.performanceperiodstart = UtilSql.getDateValue(result, "performanceperiodstart", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.performanceperiodend = UtilSql.getDateValue(result, "performanceperiodend", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cDoctypetargetId = UtilSql.getValue(result, "c_doctypetarget_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cDoctypetargetIdr = UtilSql.getValue(result, "c_doctypetarget_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.name = UtilSql.getValue(result, "name");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cDoctypeIdr = UtilSql.getValue(result, "c_doctype_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.docstatus = UtilSql.getValue(result, "docstatus");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.docstatusr = UtilSql.getValue(result, "docstatusr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.description = UtilSql.getValue(result, "description");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.deliverynotes = UtilSql.getValue(result, "deliverynotes");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.internalnote = UtilSql.getValue(result, "internalnote");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.bpzipcode = UtilSql.getValue(result, "bpzipcode");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.billtoId = UtilSql.getValue(result, "billto_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.billtoIdr = UtilSql.getValue(result, "billto_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cBpartnerLocationIdr = UtilSql.getValue(result, "c_bpartner_location_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.adUserIdr = UtilSql.getValue(result, "ad_user_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.salesrepId = UtilSql.getValue(result, "salesrep_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.salesrepIdr = UtilSql.getValue(result, "salesrep_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.mPricelistId = UtilSql.getValue(result, "m_pricelist_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.mPricelistIdr = UtilSql.getValue(result, "m_pricelist_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.isdiscountprinted = UtilSql.getValue(result, "isdiscountprinted");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.invoicerule = UtilSql.getValue(result, "invoicerule");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.invoiceruler = UtilSql.getValue(result, "invoiceruler");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.estpropability = UtilSql.getValue(result, "estpropability");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.estpropabilityr = UtilSql.getValue(result, "estpropabilityr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.mWarehouseIdr = UtilSql.getValue(result, "m_warehouse_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.deliveryrule = UtilSql.getValue(result, "deliveryrule");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.deliveryruler = UtilSql.getValue(result, "deliveryruler");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.priorityrule = UtilSql.getValue(result, "priorityrule");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.priorityruler = UtilSql.getValue(result, "priorityruler");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.paymentrule = UtilSql.getValue(result, "paymentrule");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.paymentruler = UtilSql.getValue(result, "paymentruler");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cPaymenttermId = UtilSql.getValue(result, "c_paymentterm_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cPaymenttermIdr = UtilSql.getValue(result, "c_paymentterm_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cIncotermsId = UtilSql.getValue(result, "c_incoterms_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cIncotermsIdr = UtilSql.getValue(result, "c_incoterms_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.deliveryLocationId = UtilSql.getValue(result, "delivery_location_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.deliveryLocationIdr = UtilSql.getValue(result, "delivery_location_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.deliveryviarule = UtilSql.getValue(result, "deliveryviarule");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.deliveryviaruler = UtilSql.getValue(result, "deliveryviaruler");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.mShipperId = UtilSql.getValue(result, "m_shipper_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.mShipperIdr = UtilSql.getValue(result, "m_shipper_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.weight = UtilSql.getValue(result, "weight");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.weightUom = UtilSql.getValue(result, "weight_uom");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.weightUomr = UtilSql.getValue(result, "weight_uomr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.freightcostrule = UtilSql.getValue(result, "freightcostrule");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.freightcostruler = UtilSql.getValue(result, "freightcostruler");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.qty = UtilSql.getValue(result, "qty");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.freightamt = UtilSql.getValue(result, "freightamt");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cProjectId = UtilSql.getValue(result, "c_project_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cProjectIdr = UtilSql.getValue(result, "c_project_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cProjecttaskId = UtilSql.getValue(result, "c_projecttask_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cProjecttaskIdr = UtilSql.getValue(result, "c_projecttask_idr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.orderselfjoin = UtilSql.getValue(result, "orderselfjoin");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.orderselfjoinr = UtilSql.getValue(result, "orderselfjoinr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.firstschedinvoicedate = UtilSql.getDateValue(result, "firstschedinvoicedate", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.datepromised = UtilSql.getDateValue(result, "datepromised", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.scheddeliverydate = UtilSql.getDateValue(result, "scheddeliverydate", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.schedtransactiondate = UtilSql.getDateValue(result, "schedtransactiondate", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.transactiondate = UtilSql.getDateValue(result, "transactiondate", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.contractdate = UtilSql.getDateValue(result, "contractdate", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.enddate = UtilSql.getDateValue(result, "enddate", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.invoicefrequence = UtilSql.getValue(result, "invoicefrequence");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.invoicefrequencer = UtilSql.getValue(result, "invoicefrequencer");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.isinvoiceafterfirstcycle = UtilSql.getValue(result, "isinvoiceafterfirstcycle");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.quarterlyMonth = UtilSql.getValue(result, "quarterly_month");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.quarterlyMonthr = UtilSql.getValue(result, "quarterly_monthr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.yearlyMonth = UtilSql.getValue(result, "yearly_month");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.yearlyMonthr = UtilSql.getValue(result, "yearly_monthr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.weeklyDay = UtilSql.getValue(result, "weekly_day");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.weeklyDayr = UtilSql.getValue(result, "weekly_dayr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.monthlyDay = UtilSql.getValue(result, "monthly_day");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.proposalstatus = UtilSql.getValue(result, "proposalstatus");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.proposalstatusr = UtilSql.getValue(result, "proposalstatusr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.lostproposalfixedreason = UtilSql.getValue(result, "lostproposalfixedreason");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.lostproposalfixedreasonr = UtilSql.getValue(result, "lostproposalfixedreasonr");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.lostproposalreason = UtilSql.getValue(result, "lostproposalreason");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.totallinesonetime = UtilSql.getValue(result, "totallinesonetime");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.grandtotalonetime = UtilSql.getValue(result, "grandtotalonetime");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.totallines = UtilSql.getValue(result, "totallines");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.grandtotal = UtilSql.getValue(result, "grandtotal");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.invoicedamt = UtilSql.getValue(result, "invoicedamt");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.totalpaid = UtilSql.getValue(result, "totalpaid");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.completeordervalue = UtilSql.getValue(result, "completeordervalue");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.iscompletelyinvoiced = UtilSql.getValue(result, "iscompletelyinvoiced");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.deliverycomplete = UtilSql.getValue(result, "deliverycomplete");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.subscriptionchangedate = UtilSql.getDateValue(result, "subscriptionchangedate", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.docaction = UtilSql.getValue(result, "docaction");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.docactionBtn = UtilSql.getValue(result, "docaction_btn");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.generatetemplate = UtilSql.getValue(result, "generatetemplate");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.copyfrom = UtilSql.getValue(result, "copyfrom");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.copyfrompo = UtilSql.getValue(result, "copyfrompo");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.generateproject = UtilSql.getValue(result, "generateproject");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.closeproject = UtilSql.getValue(result, "closeproject");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.dropshipUserId = UtilSql.getValue(result, "dropship_user_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.adOrgtrxId = UtilSql.getValue(result, "ad_orgtrx_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.isrecharge = UtilSql.getValue(result, "isrecharge");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cBidprojectId = UtilSql.getValue(result, "c_bidproject_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.istaxincluded = UtilSql.getValue(result, "istaxincluded");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.user1Id = UtilSql.getValue(result, "user1_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.isprinted = UtilSql.getValue(result, "isprinted");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.btncopytemplate = UtilSql.getValue(result, "btncopytemplate");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.isselected = UtilSql.getValue(result, "isselected");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.processed = UtilSql.getValue(result, "processed");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.incotermsdescription = UtilSql.getValue(result, "incotermsdescription");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.dropshipBpartnerId = UtilSql.getValue(result, "dropship_bpartner_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.user2Id = UtilSql.getValue(result, "user2_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.ispaid = UtilSql.getValue(result, "ispaid");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.chargeamt = UtilSql.getValue(result, "chargeamt");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.isselfservice = UtilSql.getValue(result, "isselfservice");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.isdelivered = UtilSql.getValue(result, "isdelivered");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.posted = UtilSql.getValue(result, "posted");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.transactionreference = UtilSql.getValue(result, "transactionreference");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.isinvoiced = UtilSql.getValue(result, "isinvoiced");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.processing = UtilSql.getValue(result, "processing");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cProjectphaseId = UtilSql.getValue(result, "c_projectphase_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cChargeId = UtilSql.getValue(result, "c_charge_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cCampaignId = UtilSql.getValue(result, "c_campaign_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.cActivityId = UtilSql.getValue(result, "c_activity_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.isactive = UtilSql.getValue(result, "isactive");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.dateprinted = UtilSql.getDateValue(result, "dateprinted", "dd-MM-yyyy");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.issotrx = UtilSql.getValue(result, "issotrx");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.dropshipLocationId = UtilSql.getValue(result, "dropship_location_id");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.language = UtilSql.getValue(result, "language");
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.adUserClient = "";
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.adOrgClient = "";
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.createdby = "";
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.trBgcolor = "";
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.totalCount = "";
        objectOrdersMLM960A4C797C884245ABE57C603A334D82Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrdersMLM960A4C797C884245ABE57C603A334D82Data);
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
    OrdersMLM960A4C797C884245ABE57C603A334D82Data objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[] = new OrdersMLM960A4C797C884245ABE57C603A334D82Data[vector.size()];
    vector.copyInto(objectOrdersMLM960A4C797C884245ABE57C603A334D82Data);
    return(objectOrdersMLM960A4C797C884245ABE57C603A334D82Data);
  }

/**
Create a registry
 */
  public static OrdersMLM960A4C797C884245ABE57C603A334D82Data[] set(String cBpartnerId, String cBpartnerIdr, String priorityrule, String generateproject, String dropshipLocationId, String cIncotermsId, String adClientId, String billtoId, String isselected, String mShipperId, String freightamt, String performanceperiodstart, String istaxincluded, String cProjecttaskId, String qty, String performanceperiodend, String user2Id, String cChargeId, String cProjectphaseId, String mProductId, String totallines, String weightUom, String ispaid, String enddate, String proposalstatus, String posted, String weight, String user1Id, String name, String invoicefrequence, String chargeamt, String scheddeliverydate, String cBpartnerLocationId, String cCampaignId, String internalnote, String dropshipBpartnerId, String isdiscountprinted, String totallinesonetime, String isrecharge, String freightcostrule, String cBidprojectId, String datepromised, String cPaymenttermId, String contractdate, String generatetemplate, String paymentrule, String docstatus, String cProjectId, String cProjectIdr, String lostproposalfixedreason, String transactiondate, String updatedby, String updatedbyr, String deliveryLocationId, String salesrepId, String poreference, String mWarehouseId, String schedtransactiondate, String deliverycomplete, String cOrderId, String copyfrom, String isdelivered, String deliveryrule, String issotrx, String isselfservice, String createdby, String createdbyr, String dateordered, String cActivityId, String monthlyDay, String documentno, String completeordervalue, String copyfrompo, String dropshipUserId, String subscriptionchangedate, String dateacct, String cCurrencyId, String totalpaid, String adOrgId, String grandtotalonetime, String bpzipcode, String cDoctypetargetId, String btncopytemplate, String invoicerule, String transactionreference, String closeproject, String isinvoiceafterfirstcycle, String incotermsdescription, String deliverynotes, String mPricelistId, String invoicedamt, String processed, String weeklyDay, String estpropability, String deliveryviarule, String description, String docaction, String docactionBtn, String isprinted, String dateprinted, String grandtotal, String isinvoiced, String orderselfjoin, String iscompletelyinvoiced, String lostproposalreason, String isactive, String cDoctypeId, String adOrgtrxId, String aAssetId, String adUserId, String quarterlyMonth, String firstschedinvoicedate, String processing, String yearlyMonth)    throws ServletException {
    OrdersMLM960A4C797C884245ABE57C603A334D82Data objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[] = new OrdersMLM960A4C797C884245ABE57C603A334D82Data[1];
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0] = new OrdersMLM960A4C797C884245ABE57C603A334D82Data();
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].created = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].createdbyr = createdbyr;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].updated = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].updatedTimeStamp = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].updatedby = updatedby;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].updatedbyr = updatedbyr;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].adClientId = adClientId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].adClientIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].adOrgId = adOrgId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].adOrgIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].documentno = documentno;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].poreference = poreference;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].dateordered = dateordered;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].performanceperiodstart = performanceperiodstart;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].performanceperiodend = performanceperiodend;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cDoctypetargetId = cDoctypetargetId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cDoctypetargetIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].name = name;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cDoctypeId = cDoctypeId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cDoctypeIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].docstatus = docstatus;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].docstatusr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].description = description;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].deliverynotes = deliverynotes;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].internalnote = internalnote;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cBpartnerId = cBpartnerId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cBpartnerIdr = cBpartnerIdr;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].bpzipcode = bpzipcode;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].billtoId = billtoId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].billtoIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cBpartnerLocationId = cBpartnerLocationId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cBpartnerLocationIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].adUserId = adUserId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].adUserIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].salesrepId = salesrepId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].salesrepIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].mPricelistId = mPricelistId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].mPricelistIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].isdiscountprinted = isdiscountprinted;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].invoicerule = invoicerule;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].invoiceruler = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].estpropability = estpropability;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].estpropabilityr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].mWarehouseId = mWarehouseId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].mWarehouseIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cCurrencyId = cCurrencyId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cCurrencyIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].deliveryrule = deliveryrule;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].deliveryruler = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].priorityrule = priorityrule;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].priorityruler = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].paymentrule = paymentrule;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].paymentruler = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cPaymenttermId = cPaymenttermId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cPaymenttermIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cIncotermsId = cIncotermsId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cIncotermsIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].deliveryLocationId = deliveryLocationId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].deliveryLocationIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].deliveryviarule = deliveryviarule;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].deliveryviaruler = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].mShipperId = mShipperId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].mShipperIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].weight = weight;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].weightUom = weightUom;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].weightUomr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].freightcostrule = freightcostrule;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].freightcostruler = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].mProductId = mProductId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].mProductIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].qty = qty;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].freightamt = freightamt;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cProjectId = cProjectId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cProjectIdr = cProjectIdr;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cProjecttaskId = cProjecttaskId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cProjecttaskIdr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].orderselfjoin = orderselfjoin;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].orderselfjoinr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].firstschedinvoicedate = firstschedinvoicedate;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].datepromised = datepromised;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].scheddeliverydate = scheddeliverydate;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].schedtransactiondate = schedtransactiondate;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].transactiondate = transactiondate;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].contractdate = contractdate;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].enddate = enddate;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].invoicefrequence = invoicefrequence;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].invoicefrequencer = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].isinvoiceafterfirstcycle = isinvoiceafterfirstcycle;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].quarterlyMonth = quarterlyMonth;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].quarterlyMonthr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].yearlyMonth = yearlyMonth;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].yearlyMonthr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].weeklyDay = weeklyDay;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].weeklyDayr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].monthlyDay = monthlyDay;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].proposalstatus = proposalstatus;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].proposalstatusr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].lostproposalfixedreason = lostproposalfixedreason;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].lostproposalfixedreasonr = "";
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].lostproposalreason = lostproposalreason;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].totallinesonetime = totallinesonetime;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].grandtotalonetime = grandtotalonetime;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].totallines = totallines;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].grandtotal = grandtotal;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].invoicedamt = invoicedamt;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].totalpaid = totalpaid;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].completeordervalue = completeordervalue;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].iscompletelyinvoiced = iscompletelyinvoiced;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].deliverycomplete = deliverycomplete;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].subscriptionchangedate = subscriptionchangedate;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].docaction = docaction;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].docactionBtn = docactionBtn;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].generatetemplate = generatetemplate;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].copyfrom = copyfrom;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].copyfrompo = copyfrompo;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].generateproject = generateproject;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].closeproject = closeproject;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cOrderId = cOrderId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].dropshipUserId = dropshipUserId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].adOrgtrxId = adOrgtrxId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].isrecharge = isrecharge;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cBidprojectId = cBidprojectId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].istaxincluded = istaxincluded;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].user1Id = user1Id;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].isprinted = isprinted;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].btncopytemplate = btncopytemplate;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].dateacct = dateacct;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].isselected = isselected;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].processed = processed;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].incotermsdescription = incotermsdescription;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].dropshipBpartnerId = dropshipBpartnerId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].user2Id = user2Id;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].ispaid = ispaid;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].chargeamt = chargeamt;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].isselfservice = isselfservice;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].isdelivered = isdelivered;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].posted = posted;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].aAssetId = aAssetId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].transactionreference = transactionreference;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].isinvoiced = isinvoiced;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].processing = processing;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cProjectphaseId = cProjectphaseId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cChargeId = cChargeId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cCampaignId = cCampaignId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].cActivityId = cActivityId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].isactive = isactive;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].dateprinted = dateprinted;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].issotrx = issotrx;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].dropshipLocationId = dropshipLocationId;
    objectOrdersMLM960A4C797C884245ABE57C603A334D82Data[0].language = "";
    return objectOrdersMLM960A4C797C884245ABE57C603A334D82Data;
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

  public static int updateDocAction(ConnectionProvider connectionProvider, String docaction, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_Order" +
      "        SET docaction = ? " +
      "        WHERE C_Order.C_Order_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
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
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_Order" +
      "        SET AD_Client_ID = (?) , AD_Org_ID = (?) , DocumentNo = (?) , POReference = (?) , DateOrdered = TO_DATE(?) , performanceperiodstart = TO_DATE(?) , performanceperiodend = TO_DATE(?) , C_DocTypeTarget_ID = (?) , Name = (?) , C_DocType_ID = (?) , DocStatus = (?) , Description = (?) , Deliverynotes = (?) , Internalnote = (?) , C_BPartner_ID = (?) , bpzipcode = (?) , BillTo_ID = (?) , C_BPartner_Location_ID = (?) , AD_User_ID = (?) , SalesRep_ID = (?) , M_PriceList_ID = (?) , IsDiscountPrinted = (?) , InvoiceRule = (?) , Estpropability = (?) , M_Warehouse_ID = (?) , C_Currency_ID = (?) , DeliveryRule = (?) , PriorityRule = (?) , PaymentRule = (?) , C_PaymentTerm_ID = (?) , C_Incoterms_ID = (?) , Delivery_Location_ID = (?) , DeliveryViaRule = (?) , M_Shipper_ID = (?) , Weight = TO_NUMBER(?) , Weight_Uom = (?) , FreightCostRule = (?) , M_Product_ID = (?) , Qty = TO_NUMBER(?) , FreightAmt = TO_NUMBER(?) , C_Project_ID = (?) , C_Projecttask_ID = (?) , Orderselfjoin = (?) , Firstschedinvoicedate = TO_DATE(?) , DatePromised = TO_DATE(?) , SchedDeliveryDate = TO_DATE(?) , SchedTransactionDate = TO_DATE(?) , TransactionDate = TO_DATE(?) , Contractdate = TO_DATE(?) , Enddate = TO_DATE(?) , Invoicefrequence = (?) , Isinvoiceafterfirstcycle = (?) , Quarterly_Month = (?) , Yearly_Month = (?) , Weekly_Day = (?) , Monthly_Day = TO_NUMBER(?) , Proposalstatus = (?) , Lostproposalfixedreason = (?) , Lostproposalreason = (?) , Totallinesonetime = TO_NUMBER(?) , Grandtotalonetime = TO_NUMBER(?) , TotalLines = TO_NUMBER(?) , GrandTotal = TO_NUMBER(?) , InvoicedAmt = TO_NUMBER(?) , TotalPaid = TO_NUMBER(?) , CompleteOrderValue = TO_NUMBER(?) , IsCompletelyInvoiced = (?) , DeliveryComplete = (?) , Subscriptionchangedate = TO_DATE(?) , DocAction = (?) , Generatetemplate = (?) , CopyFrom = (?) , CopyFromPO = (?) , Generateproject = (?) , Closeproject = (?) , C_Order_ID = (?) , DropShip_User_ID = (?) , AD_OrgTrx_ID = (?) , Isrecharge = (?) , C_Bidproject_ID = (?) , IsTaxIncluded = (?) , User1_ID = (?) , IsPrinted = (?) , BtnCopyTemplate = (?) , DateAcct = TO_DATE(?) , IsSelected = (?) , Processed = (?) , Incotermsdescription = (?) , DropShip_BPartner_ID = (?) , User2_ID = (?) , Ispaid = (?) , ChargeAmt = TO_NUMBER(?) , IsSelfService = (?) , IsDelivered = (?) , Posted = (?) , A_Asset_ID = (?) , Transactionreference = (?) , IsInvoiced = (?) , Processing = (?) , C_Projectphase_ID = (?) , C_Charge_ID = (?) , C_Campaign_ID = (?) , C_Activity_ID = (?) , IsActive = (?) , DatePrinted = TO_DATE(?) , IsSOTrx = (?) , DropShip_Location_ID = (?) , updated = now(), updatedby = ? " +
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, performanceperiodstart);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, performanceperiodend);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverynotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, internalnote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpzipcode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, estpropability);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cIncotermsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weightUom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderselfjoin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, firstschedinvoicedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, schedtransactiondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, transactiondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, contractdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enddate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicefrequence);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiceafterfirstcycle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quarterlyMonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, yearlyMonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weeklyDay);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, monthlyDay);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, proposalstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lostproposalfixedreason);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lostproposalreason);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallinesonetime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotalonetime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalpaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, completeordervalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscompletelyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverycomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, subscriptionchangedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatetemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrompo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateproject);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, closeproject);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isrecharge);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBidprojectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btncopytemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselected);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, incotermsdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, transactionreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectphaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipLocationId);
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
      "        (AD_Client_ID, AD_Org_ID, DocumentNo, POReference, DateOrdered, performanceperiodstart, performanceperiodend, C_DocTypeTarget_ID, Name, C_DocType_ID, DocStatus, Description, Deliverynotes, Internalnote, C_BPartner_ID, bpzipcode, BillTo_ID, C_BPartner_Location_ID, AD_User_ID, SalesRep_ID, M_PriceList_ID, IsDiscountPrinted, InvoiceRule, Estpropability, M_Warehouse_ID, C_Currency_ID, DeliveryRule, PriorityRule, PaymentRule, C_PaymentTerm_ID, C_Incoterms_ID, Delivery_Location_ID, DeliveryViaRule, M_Shipper_ID, Weight, Weight_Uom, FreightCostRule, M_Product_ID, Qty, FreightAmt, C_Project_ID, C_Projecttask_ID, Orderselfjoin, Firstschedinvoicedate, DatePromised, SchedDeliveryDate, SchedTransactionDate, TransactionDate, Contractdate, Enddate, Invoicefrequence, Isinvoiceafterfirstcycle, Quarterly_Month, Yearly_Month, Weekly_Day, Monthly_Day, Proposalstatus, Lostproposalfixedreason, Lostproposalreason, Totallinesonetime, Grandtotalonetime, TotalLines, GrandTotal, InvoicedAmt, TotalPaid, CompleteOrderValue, IsCompletelyInvoiced, DeliveryComplete, Subscriptionchangedate, DocAction, Generatetemplate, CopyFrom, CopyFromPO, Generateproject, Closeproject, C_Order_ID, DropShip_User_ID, AD_OrgTrx_ID, Isrecharge, C_Bidproject_ID, IsTaxIncluded, User1_ID, IsPrinted, BtnCopyTemplate, DateAcct, IsSelected, Processed, Incotermsdescription, DropShip_BPartner_ID, User2_ID, Ispaid, ChargeAmt, IsSelfService, IsDelivered, Posted, A_Asset_ID, Transactionreference, IsInvoiced, Processing, C_Projectphase_ID, C_Charge_ID, C_Campaign_ID, C_Activity_ID, IsActive, DatePrinted, IsSOTrx, DropShip_Location_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_DATE(?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, performanceperiodstart);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, performanceperiodend);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypetargetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverynotes);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, internalnote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpzipcode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, billtoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, estpropability);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priorityrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cIncotermsId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mShipperId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weightUom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightcostrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freightamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderselfjoin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, firstschedinvoicedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datepromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, scheddeliverydate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, schedtransactiondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, transactiondate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, contractdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enddate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicefrequence);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiceafterfirstcycle);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, quarterlyMonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, yearlyMonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weeklyDay);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, monthlyDay);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, proposalstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lostproposalfixedreason);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lostproposalreason);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallinesonetime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotalonetime);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicedamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalpaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, completeordervalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscompletelyinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverycomplete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, subscriptionchangedate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docaction);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generatetemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, copyfrompo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, generateproject);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, closeproject);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isrecharge);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBidprojectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, istaxincluded);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btncopytemplate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselected);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, incotermsdescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isselfservice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, transactionreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectphaseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cChargeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dropshipLocationId);
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
