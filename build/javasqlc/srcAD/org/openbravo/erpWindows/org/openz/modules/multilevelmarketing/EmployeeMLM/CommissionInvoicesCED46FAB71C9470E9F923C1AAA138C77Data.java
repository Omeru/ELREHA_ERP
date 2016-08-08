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
class CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data implements FieldProvider {
static Logger log4j = Logger.getLogger(CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cInvoiceId;
  public String documentno;
  public String dateinvoiced;
  public String ispaid;
  public String grandtotal;
  public String totallines;
  public String outstandingamt;
  public String totalpaid;
  public String dueamt;
  public String daystilldue;
  public String writeoffamt;
  public String discountamt;
  public String paymentrule;
  public String paymentruler;
  public String salesrepId;
  public String salesrepIdr;
  public String dateacct;
  public String cBpartnerLocationId;
  public String cBpartnerLocationIdr;
  public String cPaymenttermId;
  public String cPaymenttermIdr;
  public String dateprinted;
  public String description;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String docstatus;
  public String docstatusr;
  public String cDoctypeId;
  public String cDoctypeIdr;
  public String isactive;
  public String dateordered;
  public String adOrgId;
  public String adOrgIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String mPricelistId;
  public String mPricelistIdr;
  public String posted;
  public String postedBtn;
  public String processing;
  public String adClientId;
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
    else if (fieldName.equalsIgnoreCase("c_invoice_id") || fieldName.equals("cInvoiceId"))
      return cInvoiceId;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("dateinvoiced"))
      return dateinvoiced;
    else if (fieldName.equalsIgnoreCase("ispaid"))
      return ispaid;
    else if (fieldName.equalsIgnoreCase("grandtotal"))
      return grandtotal;
    else if (fieldName.equalsIgnoreCase("totallines"))
      return totallines;
    else if (fieldName.equalsIgnoreCase("outstandingamt"))
      return outstandingamt;
    else if (fieldName.equalsIgnoreCase("totalpaid"))
      return totalpaid;
    else if (fieldName.equalsIgnoreCase("dueamt"))
      return dueamt;
    else if (fieldName.equalsIgnoreCase("daystilldue"))
      return daystilldue;
    else if (fieldName.equalsIgnoreCase("writeoffamt"))
      return writeoffamt;
    else if (fieldName.equalsIgnoreCase("discountamt"))
      return discountamt;
    else if (fieldName.equalsIgnoreCase("paymentrule"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("paymentruler"))
      return paymentruler;
    else if (fieldName.equalsIgnoreCase("salesrep_id") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("salesrep_idr") || fieldName.equals("salesrepIdr"))
      return salesrepIdr;
    else if (fieldName.equalsIgnoreCase("dateacct"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_idr") || fieldName.equals("cBpartnerLocationIdr"))
      return cBpartnerLocationIdr;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_id") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_idr") || fieldName.equals("cPaymenttermIdr"))
      return cPaymenttermIdr;
    else if (fieldName.equalsIgnoreCase("dateprinted"))
      return dateprinted;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("docstatusr"))
      return docstatusr;
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("c_doctype_idr") || fieldName.equals("cDoctypeIdr"))
      return cDoctypeIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("m_pricelist_id") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("m_pricelist_idr") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("posted"))
      return posted;
    else if (fieldName.equalsIgnoreCase("posted_btn") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
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
  public static CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_Invoice.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Invoice.CreatedBy) as CreatedByR, " +
      "        to_char(C_Invoice.Updated, ?) as updated, " +
      "        to_char(C_Invoice.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_Invoice.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_Invoice.UpdatedBy) as UpdatedByR," +
      "        C_Invoice.C_Invoice_ID, " +
      "C_Invoice.DocumentNo, " +
      "C_Invoice.DateInvoiced, " +
      "COALESCE(C_Invoice.IsPaid, 'N') AS IsPaid, " +
      "C_Invoice.GrandTotal, " +
      "C_Invoice.TotalLines, " +
      "C_Invoice.OutstandingAmt, " +
      "C_Invoice.TotalPaid, " +
      "C_Invoice.DueAmt, " +
      "C_Invoice.DaysTillDue, " +
      "C_Invoice.Writeoffamt, " +
      "C_Invoice.DiscountAmt, " +
      "C_Invoice.PaymentRule, " +
      "(CASE WHEN C_Invoice.PaymentRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS PaymentRuleR, " +
      "C_Invoice.SalesRep_ID, " +
      "(CASE WHEN C_Invoice.SalesRep_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS SalesRep_IDR, " +
      "C_Invoice.DateAcct, " +
      "C_Invoice.C_BPartner_Location_ID, " +
      "(CASE WHEN C_Invoice.C_BPartner_Location_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_BPartner_Location_IDR, " +
      "C_Invoice.C_PaymentTerm_ID, " +
      "(CASE WHEN C_Invoice.C_PaymentTerm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_PaymentTerm_IDR, " +
      "C_Invoice.DatePrinted, " +
      "C_Invoice.Description, " +
      "C_Invoice.C_Currency_ID, " +
      "(CASE WHEN C_Invoice.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "C_Invoice.DocStatus, " +
      "(CASE WHEN C_Invoice.DocStatus IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS DocStatusR, " +
      "C_Invoice.C_DocType_ID, " +
      "(CASE WHEN C_Invoice.C_DocType_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'') ) END) AS C_DocType_IDR, " +
      "COALESCE(C_Invoice.IsActive, 'N') AS IsActive, " +
      "C_Invoice.DateOrdered, " +
      "C_Invoice.AD_Org_ID, " +
      "(CASE WHEN C_Invoice.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "C_Invoice.C_BPartner_ID, " +
      "(CASE WHEN C_Invoice.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_Invoice.M_PriceList_ID, " +
      "(CASE WHEN C_Invoice.M_PriceList_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "C_Invoice.Posted, " +
      "list3.name as Posted_BTN, " +
      "C_Invoice.Processing, " +
      "C_Invoice.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_Invoice left join ad_ref_list_v list1 on (C_Invoice.PaymentRule = list1.value and list1.ad_reference_id = '195' and list1.ad_language = ?)  left join (select AD_User_ID, Name from AD_User) table1 on (C_Invoice.SalesRep_ID =  table1.AD_User_ID) left join (select C_BPartner_Location_ID, Name from C_BPartner_Location) table2 on (C_Invoice.C_BPartner_Location_ID = table2.C_BPartner_Location_ID) left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table3 on (C_Invoice.C_PaymentTerm_ID = table3.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL3 on (table3.C_PaymentTerm_ID = tableTRL3.C_PaymentTerm_ID and tableTRL3.AD_Language = ?)  left join (select C_Currency_ID, ISO_Code from C_Currency) table4 on (C_Invoice.C_Currency_ID = table4.C_Currency_ID) left join ad_ref_list_v list2 on (C_Invoice.DocStatus = list2.value and list2.ad_reference_id = '131' and list2.ad_language = ?)  left join (select C_DocType_ID, Name from C_DocType) table5 on (C_Invoice.C_DocType_ID = table5.C_DocType_ID) left join (select C_DocType_ID,AD_Language, Name from C_DocType_TRL) tableTRL5 on (table5.C_DocType_ID = tableTRL5.C_DocType_ID and tableTRL5.AD_Language = ?)  left join (select AD_Org_ID, Name from AD_Org) table6 on (C_Invoice.AD_Org_ID = table6.AD_Org_ID) left join (select C_BPartner_ID, Name from C_BPartner) table7 on (C_Invoice.C_BPartner_ID = table7.C_BPartner_ID) left join (select M_PriceList_ID, Name from M_PriceList) table8 on (C_Invoice.M_PriceList_ID = table8.M_PriceList_ID) left join ad_ref_list_v list3 on (list3.ad_reference_id = '234' and list3.ad_language = ?  AND C_Invoice.Posted = TO_CHAR(list3.value))" +
      "        WHERE 2=2 " +
      " AND issotrx='N'" +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND C_Invoice.C_BPartner_ID = ?  ");
    strSql = strSql + 
      "        AND C_Invoice.C_Invoice_ID = ? " +
      "        AND C_Invoice.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_Invoice.AD_Org_ID IN (";
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
        CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data = new CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data();
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.created = UtilSql.getValue(result, "created");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.updated = UtilSql.getValue(result, "updated");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cInvoiceId = UtilSql.getValue(result, "c_invoice_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.documentno = UtilSql.getValue(result, "documentno");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.dateinvoiced = UtilSql.getDateValue(result, "dateinvoiced", "dd-MM-yyyy");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.ispaid = UtilSql.getValue(result, "ispaid");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.grandtotal = UtilSql.getValue(result, "grandtotal");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.totallines = UtilSql.getValue(result, "totallines");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.outstandingamt = UtilSql.getValue(result, "outstandingamt");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.totalpaid = UtilSql.getValue(result, "totalpaid");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.dueamt = UtilSql.getValue(result, "dueamt");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.daystilldue = UtilSql.getValue(result, "daystilldue");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.writeoffamt = UtilSql.getValue(result, "writeoffamt");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.discountamt = UtilSql.getValue(result, "discountamt");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.paymentrule = UtilSql.getValue(result, "paymentrule");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.paymentruler = UtilSql.getValue(result, "paymentruler");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.salesrepId = UtilSql.getValue(result, "salesrep_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.salesrepIdr = UtilSql.getValue(result, "salesrep_idr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.dateacct = UtilSql.getDateValue(result, "dateacct", "dd-MM-yyyy");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cBpartnerLocationIdr = UtilSql.getValue(result, "c_bpartner_location_idr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cPaymenttermId = UtilSql.getValue(result, "c_paymentterm_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cPaymenttermIdr = UtilSql.getValue(result, "c_paymentterm_idr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.dateprinted = UtilSql.getDateValue(result, "dateprinted", "dd-MM-yyyy");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.description = UtilSql.getValue(result, "description");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.docstatus = UtilSql.getValue(result, "docstatus");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.docstatusr = UtilSql.getValue(result, "docstatusr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cDoctypeIdr = UtilSql.getValue(result, "c_doctype_idr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.isactive = UtilSql.getValue(result, "isactive");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.mPricelistId = UtilSql.getValue(result, "m_pricelist_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.mPricelistIdr = UtilSql.getValue(result, "m_pricelist_idr");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.posted = UtilSql.getValue(result, "posted");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.postedBtn = UtilSql.getValue(result, "posted_btn");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.processing = UtilSql.getValue(result, "processing");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.language = UtilSql.getValue(result, "language");
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.adUserClient = "";
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.adOrgClient = "";
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.createdby = "";
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.trBgcolor = "";
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.totalCount = "";
        objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data);
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
    CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[] = new CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[vector.size()];
    vector.copyInto(objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data);
    return(objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data);
  }

/**
Create a registry
 */
  public static CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[] set(String cBpartnerId, String dateacct, String mPricelistId, String outstandingamt, String docstatus, String cCurrencyId, String discountamt, String cPaymenttermId, String cBpartnerLocationId, String salesrepId, String totallines, String createdby, String createdbyr, String ispaid, String adOrgId, String dateprinted, String adClientId, String grandtotal, String totalpaid, String dateinvoiced, String cBpartnerIdr, String isactive, String paymentrule, String processing, String updatedby, String updatedbyr, String cDoctypeId, String posted, String postedBtn, String description, String daystilldue, String documentno, String writeoffamt, String dateordered, String dueamt, String cInvoiceId)    throws ServletException {
    CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[] = new CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[1];
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0] = new CommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data();
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].created = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].createdbyr = createdbyr;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].updated = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].updatedTimeStamp = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].updatedby = updatedby;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].updatedbyr = updatedbyr;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cInvoiceId = cInvoiceId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].documentno = documentno;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].dateinvoiced = dateinvoiced;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].ispaid = ispaid;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].grandtotal = grandtotal;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].totallines = totallines;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].outstandingamt = outstandingamt;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].totalpaid = totalpaid;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].dueamt = dueamt;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].daystilldue = daystilldue;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].writeoffamt = writeoffamt;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].discountamt = discountamt;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].paymentrule = paymentrule;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].paymentruler = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].salesrepId = salesrepId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].salesrepIdr = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].dateacct = dateacct;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cBpartnerLocationId = cBpartnerLocationId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cBpartnerLocationIdr = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cPaymenttermId = cPaymenttermId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cPaymenttermIdr = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].dateprinted = dateprinted;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].description = description;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cCurrencyId = cCurrencyId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cCurrencyIdr = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].docstatus = docstatus;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].docstatusr = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cDoctypeId = cDoctypeId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cDoctypeIdr = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].isactive = isactive;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].dateordered = dateordered;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].adOrgId = adOrgId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].adOrgIdr = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cBpartnerId = cBpartnerId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].cBpartnerIdr = cBpartnerIdr;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].mPricelistId = mPricelistId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].mPricelistIdr = "";
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].posted = posted;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].postedBtn = postedBtn;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].processing = processing;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].adClientId = adClientId;
    objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data[0].language = "";
    return objectCommissionInvoicesCED46FAB71C9470E9F923C1AAA138C77Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef3489_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef3499_1(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDef3491_2(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_Invoice.C_BPartner_ID AS NAME" +
      "        FROM C_Invoice" +
      "        WHERE C_Invoice.C_Invoice_ID = ?";

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
      "        UPDATE C_Invoice" +
      "        SET C_Invoice_ID = (?) , DocumentNo = (?) , DateInvoiced = TO_DATE(?) , IsPaid = (?) , GrandTotal = TO_NUMBER(?) , TotalLines = TO_NUMBER(?) , OutstandingAmt = TO_NUMBER(?) , TotalPaid = TO_NUMBER(?) , DueAmt = TO_NUMBER(?) , DaysTillDue = TO_NUMBER(?) , Writeoffamt = TO_NUMBER(?) , DiscountAmt = TO_NUMBER(?) , PaymentRule = (?) , SalesRep_ID = (?) , DateAcct = TO_DATE(?) , C_BPartner_Location_ID = (?) , C_PaymentTerm_ID = (?) , DatePrinted = TO_DATE(?) , Description = (?) , C_Currency_ID = (?) , DocStatus = (?) , C_DocType_ID = (?) , IsActive = (?) , DateOrdered = TO_DATE(?) , AD_Org_ID = (?) , C_BPartner_ID = (?) , M_PriceList_ID = (?) , Posted = (?) , Processing = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_Invoice.C_Invoice_ID = ? " +
      "                 AND C_Invoice.C_BPartner_ID = ? " +
      "        AND C_Invoice.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Invoice.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, outstandingamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalpaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, daystilldue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discountamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
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
      "        INSERT INTO C_Invoice " +
      "        (C_Invoice_ID, DocumentNo, DateInvoiced, IsPaid, GrandTotal, TotalLines, OutstandingAmt, TotalPaid, DueAmt, DaysTillDue, Writeoffamt, DiscountAmt, PaymentRule, SalesRep_ID, DateAcct, C_BPartner_Location_ID, C_PaymentTerm_ID, DatePrinted, Description, C_Currency_ID, DocStatus, C_DocType_ID, IsActive, DateOrdered, AD_Org_ID, C_BPartner_ID, M_PriceList_ID, Posted, Processing, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_DATE(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_DATE(?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoiceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateinvoiced);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grandtotal);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totallines);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, outstandingamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, totalpaid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dueamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, daystilldue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, writeoffamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discountamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docstatus);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDoctypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
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
      "        DELETE FROM C_Invoice" +
      "        WHERE C_Invoice.C_Invoice_ID = ? " +
      "                 AND C_Invoice.C_BPartner_ID = ? " +
      "        AND C_Invoice.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_Invoice.AD_Org_ID IN (";
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
      "        DELETE FROM C_Invoice" +
      "        WHERE C_Invoice.C_Invoice_ID = ? " +
      "                 AND C_Invoice.C_BPartner_ID = ? ";

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
      "          FROM C_Invoice" +
      "         WHERE C_Invoice.C_Invoice_ID = ? ";

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
      "          FROM C_Invoice" +
      "         WHERE C_Invoice.C_Invoice_ID = ? ";

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
