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
class Customer21A945DDD29E4D70B409ACA2F69D7DE8Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Customer21A945DDD29E4D70B409ACA2F69D7DE8Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String value;
  public String name;
  public String isactive;
  public String iscustomer;
  public String documentcopies;
  public String invoicerule;
  public String invoiceruler;
  public String cInvoicescheduleId;
  public String cInvoicescheduleIdr;
  public String invoicegrouping;
  public String invoicegroupingr;
  public String deliveryrule;
  public String deliveryruler;
  public String deliveryviarule;
  public String deliveryviaruler;
  public String mPricelistId;
  public String mPricelistIdr;
  public String paymentrule;
  public String paymentruler;
  public String cPaymenttermId;
  public String cPaymenttermIdr;
  public String salesrepId;
  public String salesrepIdr;
  public String isdiscountprinted;
  public String soDescription;
  public String soCreditlimit;
  public String soCreditused;
  public String isecommerceactive;
  public String fixmonthday;
  public String adClientId;
  public String poreference;
  public String fixmonthday3;
  public String cBpartnerId;
  public String adOrgId;
  public String soBankaccountId;
  public String fixmonthday2;
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
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("iscustomer"))
      return iscustomer;
    else if (fieldName.equalsIgnoreCase("documentcopies"))
      return documentcopies;
    else if (fieldName.equalsIgnoreCase("invoicerule"))
      return invoicerule;
    else if (fieldName.equalsIgnoreCase("invoiceruler"))
      return invoiceruler;
    else if (fieldName.equalsIgnoreCase("c_invoiceschedule_id") || fieldName.equals("cInvoicescheduleId"))
      return cInvoicescheduleId;
    else if (fieldName.equalsIgnoreCase("c_invoiceschedule_idr") || fieldName.equals("cInvoicescheduleIdr"))
      return cInvoicescheduleIdr;
    else if (fieldName.equalsIgnoreCase("invoicegrouping"))
      return invoicegrouping;
    else if (fieldName.equalsIgnoreCase("invoicegroupingr"))
      return invoicegroupingr;
    else if (fieldName.equalsIgnoreCase("deliveryrule"))
      return deliveryrule;
    else if (fieldName.equalsIgnoreCase("deliveryruler"))
      return deliveryruler;
    else if (fieldName.equalsIgnoreCase("deliveryviarule"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("deliveryviaruler"))
      return deliveryviaruler;
    else if (fieldName.equalsIgnoreCase("m_pricelist_id") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("m_pricelist_idr") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("paymentrule"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("paymentruler"))
      return paymentruler;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_id") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_idr") || fieldName.equals("cPaymenttermIdr"))
      return cPaymenttermIdr;
    else if (fieldName.equalsIgnoreCase("salesrep_id") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("salesrep_idr") || fieldName.equals("salesrepIdr"))
      return salesrepIdr;
    else if (fieldName.equalsIgnoreCase("isdiscountprinted"))
      return isdiscountprinted;
    else if (fieldName.equalsIgnoreCase("so_description") || fieldName.equals("soDescription"))
      return soDescription;
    else if (fieldName.equalsIgnoreCase("so_creditlimit") || fieldName.equals("soCreditlimit"))
      return soCreditlimit;
    else if (fieldName.equalsIgnoreCase("so_creditused") || fieldName.equals("soCreditused"))
      return soCreditused;
    else if (fieldName.equalsIgnoreCase("isecommerceactive"))
      return isecommerceactive;
    else if (fieldName.equalsIgnoreCase("fixmonthday"))
      return fixmonthday;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("poreference"))
      return poreference;
    else if (fieldName.equalsIgnoreCase("fixmonthday3"))
      return fixmonthday3;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("so_bankaccount_id") || fieldName.equals("soBankaccountId"))
      return soBankaccountId;
    else if (fieldName.equalsIgnoreCase("fixmonthday2"))
      return fixmonthday2;
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
  public static Customer21A945DDD29E4D70B409ACA2F69D7DE8Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPARTNER_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, C_BPARTNER_ID, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Customer21A945DDD29E4D70B409ACA2F69D7DE8Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPARTNER_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_BPartner.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BPartner.CreatedBy) as CreatedByR, " +
      "        to_char(C_BPartner.Updated, ?) as updated, " +
      "        to_char(C_BPartner.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_BPartner.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BPartner.UpdatedBy) as UpdatedByR," +
      "        C_BPartner.Value, " +
      "C_BPartner.Name, " +
      "COALESCE(C_BPartner.IsActive, 'N') AS IsActive, " +
      "COALESCE(C_BPartner.IsCustomer, 'N') AS IsCustomer, " +
      "C_BPartner.DocumentCopies, " +
      "C_BPartner.InvoiceRule, " +
      "(CASE WHEN C_BPartner.InvoiceRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS InvoiceRuleR, " +
      "C_BPartner.C_InvoiceSchedule_ID, " +
      "(CASE WHEN C_BPartner.C_InvoiceSchedule_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_InvoiceSchedule_IDR, " +
      "C_BPartner.Invoicegrouping, " +
      "(CASE WHEN C_BPartner.Invoicegrouping IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS InvoicegroupingR, " +
      "C_BPartner.DeliveryRule, " +
      "(CASE WHEN C_BPartner.DeliveryRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list3.name),'') ) END) AS DeliveryRuleR, " +
      "C_BPartner.DeliveryViaRule, " +
      "(CASE WHEN C_BPartner.DeliveryViaRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list4.name),'') ) END) AS DeliveryViaRuleR, " +
      "C_BPartner.M_PriceList_ID, " +
      "(CASE WHEN C_BPartner.M_PriceList_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS M_PriceList_IDR, " +
      "C_BPartner.PaymentRule, " +
      "(CASE WHEN C_BPartner.PaymentRule IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list5.name),'') ) END) AS PaymentRuleR, " +
      "C_BPartner.C_PaymentTerm_ID, " +
      "(CASE WHEN C_BPartner.C_PaymentTerm_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_PaymentTerm_IDR, " +
      "C_BPartner.SalesRep_ID, " +
      "(CASE WHEN C_BPartner.SalesRep_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS SalesRep_IDR, " +
      "COALESCE(C_BPartner.IsDiscountPrinted, 'N') AS IsDiscountPrinted, " +
      "C_BPartner.SO_Description, " +
      "C_BPartner.SO_CreditLimit, " +
      "C_BPartner.SO_CreditUsed, " +
      "COALESCE(C_BPartner.Isecommerceactive, 'N') AS Isecommerceactive, " +
      "C_BPartner.FixMonthDay, " +
      "C_BPartner.AD_Client_ID, " +
      "C_BPartner.POReference, " +
      "C_BPartner.Fixmonthday3, " +
      "C_BPartner.C_BPartner_ID, " +
      "C_BPartner.AD_Org_ID, " +
      "C_BPartner.SO_Bankaccount_ID, " +
      "C_BPartner.FixMonthDay2, " +
      "        ? AS LANGUAGE " +
      "        FROM C_BPartner left join ad_ref_list_v list1 on (C_BPartner.InvoiceRule = list1.value and list1.ad_reference_id = '150' and list1.ad_language = ?)  left join (select C_InvoiceSchedule_ID, Name from C_InvoiceSchedule) table1 on (C_BPartner.C_InvoiceSchedule_ID = table1.C_InvoiceSchedule_ID) left join ad_ref_list_v list2 on (C_BPartner.Invoicegrouping = list2.value and list2.ad_reference_id = '800026' and list2.ad_language = ?)  left join ad_ref_list_v list3 on (C_BPartner.DeliveryRule = list3.value and list3.ad_reference_id = '151' and list3.ad_language = ?)  left join ad_ref_list_v list4 on (C_BPartner.DeliveryViaRule = list4.value and list4.ad_reference_id = '152' and list4.ad_language = ?)  left join (select M_PriceList_ID, Name from M_PriceList) table2 on (C_BPartner.M_PriceList_ID =  table2.M_PriceList_ID) left join ad_ref_list_v list5 on (C_BPartner.PaymentRule = list5.value and list5.ad_reference_id = '195' and list5.ad_language = ?)  left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table3 on (C_BPartner.C_PaymentTerm_ID = table3.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL3 on (table3.C_PaymentTerm_ID = tableTRL3.C_PaymentTerm_ID and tableTRL3.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table4 on (C_BPartner.SalesRep_ID =  table4.C_BPartner_ID)" +
      "        WHERE 2=2 " +
      " AND c_bpartner.C_BPARTNER_ID=?" +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND C_BPartner.C_BPartner_ID = ?  ");
    strSql = strSql + 
      "        AND C_BPartner.C_BPartner_ID = ? " +
      "        AND C_BPartner.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_BPartner.AD_Org_ID IN (";
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
        Customer21A945DDD29E4D70B409ACA2F69D7DE8Data objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data = new Customer21A945DDD29E4D70B409ACA2F69D7DE8Data();
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.created = UtilSql.getValue(result, "created");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.updated = UtilSql.getValue(result, "updated");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.value = UtilSql.getValue(result, "value");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.name = UtilSql.getValue(result, "name");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.isactive = UtilSql.getValue(result, "isactive");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.iscustomer = UtilSql.getValue(result, "iscustomer");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.documentcopies = UtilSql.getValue(result, "documentcopies");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.invoicerule = UtilSql.getValue(result, "invoicerule");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.invoiceruler = UtilSql.getValue(result, "invoiceruler");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.cInvoicescheduleId = UtilSql.getValue(result, "c_invoiceschedule_id");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.cInvoicescheduleIdr = UtilSql.getValue(result, "c_invoiceschedule_idr");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.invoicegrouping = UtilSql.getValue(result, "invoicegrouping");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.invoicegroupingr = UtilSql.getValue(result, "invoicegroupingr");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.deliveryrule = UtilSql.getValue(result, "deliveryrule");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.deliveryruler = UtilSql.getValue(result, "deliveryruler");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.deliveryviarule = UtilSql.getValue(result, "deliveryviarule");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.deliveryviaruler = UtilSql.getValue(result, "deliveryviaruler");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.mPricelistId = UtilSql.getValue(result, "m_pricelist_id");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.mPricelistIdr = UtilSql.getValue(result, "m_pricelist_idr");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.paymentrule = UtilSql.getValue(result, "paymentrule");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.paymentruler = UtilSql.getValue(result, "paymentruler");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.cPaymenttermId = UtilSql.getValue(result, "c_paymentterm_id");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.cPaymenttermIdr = UtilSql.getValue(result, "c_paymentterm_idr");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.salesrepId = UtilSql.getValue(result, "salesrep_id");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.salesrepIdr = UtilSql.getValue(result, "salesrep_idr");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.isdiscountprinted = UtilSql.getValue(result, "isdiscountprinted");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.soDescription = UtilSql.getValue(result, "so_description");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.soCreditlimit = UtilSql.getValue(result, "so_creditlimit");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.soCreditused = UtilSql.getValue(result, "so_creditused");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.isecommerceactive = UtilSql.getValue(result, "isecommerceactive");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.fixmonthday = UtilSql.getValue(result, "fixmonthday");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.poreference = UtilSql.getValue(result, "poreference");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.fixmonthday3 = UtilSql.getValue(result, "fixmonthday3");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.soBankaccountId = UtilSql.getValue(result, "so_bankaccount_id");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.fixmonthday2 = UtilSql.getValue(result, "fixmonthday2");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.language = UtilSql.getValue(result, "language");
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.adUserClient = "";
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.adOrgClient = "";
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.createdby = "";
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.trBgcolor = "";
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.totalCount = "";
        objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data);
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
    Customer21A945DDD29E4D70B409ACA2F69D7DE8Data objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[] = new Customer21A945DDD29E4D70B409ACA2F69D7DE8Data[vector.size()];
    vector.copyInto(objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data);
    return(objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data);
  }

/**
Create a registry
 */
  public static Customer21A945DDD29E4D70B409ACA2F69D7DE8Data[] set(String cBpartnerId, String documentcopies, String value, String iscustomer, String fixmonthday3, String name, String isactive, String invoicerule, String createdby, String createdbyr, String isdiscountprinted, String isecommerceactive, String fixmonthday, String paymentrule, String soCreditlimit, String updatedby, String updatedbyr, String soDescription, String fixmonthday2, String adOrgId, String mPricelistId, String soCreditused, String invoicegrouping, String soBankaccountId, String cPaymenttermId, String deliveryrule, String poreference, String deliveryviarule, String adClientId, String salesrepId, String cInvoicescheduleId)    throws ServletException {
    Customer21A945DDD29E4D70B409ACA2F69D7DE8Data objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[] = new Customer21A945DDD29E4D70B409ACA2F69D7DE8Data[1];
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0] = new Customer21A945DDD29E4D70B409ACA2F69D7DE8Data();
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].created = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].createdbyr = createdbyr;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].updated = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].updatedTimeStamp = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].updatedby = updatedby;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].updatedbyr = updatedbyr;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].value = value;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].name = name;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].isactive = isactive;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].iscustomer = iscustomer;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].documentcopies = documentcopies;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].invoicerule = invoicerule;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].invoiceruler = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].cInvoicescheduleId = cInvoicescheduleId;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].cInvoicescheduleIdr = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].invoicegrouping = invoicegrouping;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].invoicegroupingr = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].deliveryrule = deliveryrule;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].deliveryruler = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].deliveryviarule = deliveryviarule;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].deliveryviaruler = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].mPricelistId = mPricelistId;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].mPricelistIdr = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].paymentrule = paymentrule;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].paymentruler = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].cPaymenttermId = cPaymenttermId;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].cPaymenttermIdr = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].salesrepId = salesrepId;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].salesrepIdr = "";
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].isdiscountprinted = isdiscountprinted;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].soDescription = soDescription;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].soCreditlimit = soCreditlimit;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].soCreditused = soCreditused;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].isecommerceactive = isecommerceactive;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].fixmonthday = fixmonthday;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].adClientId = adClientId;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].poreference = poreference;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].fixmonthday3 = fixmonthday3;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].cBpartnerId = cBpartnerId;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].adOrgId = adOrgId;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].soBankaccountId = soBankaccountId;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].fixmonthday2 = fixmonthday2;
    objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data[0].language = "";
    return objectCustomer21A945DDD29E4D70B409ACA2F69D7DE8Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2901(ConnectionProvider connectionProvider, String AD_ORG_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT zssi_getNewBPartnerValue(?) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zssi_getnewbpartnervalue");
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
  public static String selectDef2898_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2900_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        SELECT C_BPartner.C_BPartner_ID AS NAME" +
      "        FROM C_BPartner" +
      "        WHERE C_BPartner.C_BPartner_ID = ?";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(C_BPartner.Name), ''))) AS NAME FROM C_BPartner WHERE C_BPartner.C_BPartner_ID = ?  ";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(C_BPartner.Name), ''))) AS NAME FROM C_BPartner WHERE C_BPartner.C_BPartner_ID = ?  ";

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
      "        UPDATE C_BPartner" +
      "        SET Value = (?) , Name = (?) , IsActive = (?) , IsCustomer = (?) , DocumentCopies = TO_NUMBER(?) , InvoiceRule = (?) , C_InvoiceSchedule_ID = (?) , Invoicegrouping = (?) , DeliveryRule = (?) , DeliveryViaRule = (?) , M_PriceList_ID = (?) , PaymentRule = (?) , C_PaymentTerm_ID = (?) , SalesRep_ID = (?) , IsDiscountPrinted = (?) , SO_Description = (?) , SO_CreditLimit = TO_NUMBER(?) , SO_CreditUsed = TO_NUMBER(?) , Isecommerceactive = (?) , FixMonthDay = TO_NUMBER(?) , AD_Client_ID = (?) , POReference = (?) , Fixmonthday3 = TO_NUMBER(?) , C_BPartner_ID = (?) , AD_Org_ID = (?) , SO_Bankaccount_ID = (?) , FixMonthDay2 = TO_NUMBER(?) , updated = now(), updatedby = ? " +
      "        WHERE C_BPartner.C_BPartner_ID = ? " +
      "                 AND C_BPartner.C_BPartner_ID = ? " +
      "        AND C_BPartner.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BPartner.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscustomer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentcopies);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicescheduleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicegrouping);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soDescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soCreditlimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soCreditused);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isecommerceactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixmonthday);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixmonthday3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soBankaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixmonthday2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
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
      "        INSERT INTO C_BPartner " +
      "        (Value, Name, IsActive, IsCustomer, DocumentCopies, InvoiceRule, C_InvoiceSchedule_ID, Invoicegrouping, DeliveryRule, DeliveryViaRule, M_PriceList_ID, PaymentRule, C_PaymentTerm_ID, SalesRep_ID, IsDiscountPrinted, SO_Description, SO_CreditLimit, SO_CreditUsed, Isecommerceactive, FixMonthDay, AD_Client_ID, POReference, Fixmonthday3, C_BPartner_ID, AD_Org_ID, SO_Bankaccount_ID, FixMonthDay2, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscustomer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentcopies);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicerule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicescheduleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoicegrouping);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliveryviarule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isdiscountprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soDescription);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soCreditlimit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soCreditused);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isecommerceactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixmonthday);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poreference);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixmonthday3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, soBankaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixmonthday2);
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
      "        DELETE FROM C_BPartner" +
      "        WHERE C_BPartner.C_BPartner_ID = ? " +
      "                 AND C_BPartner.C_BPartner_ID = ? " +
      "        AND C_BPartner.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BPartner.AD_Org_ID IN (";
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
      "        DELETE FROM C_BPartner" +
      "        WHERE C_BPartner.C_BPartner_ID = ? " +
      "                 AND C_BPartner.C_BPartner_ID = ? ";

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
      "          FROM C_BPartner" +
      "         WHERE C_BPartner.C_BPartner_ID = ? ";

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
      "          FROM C_BPartner" +
      "         WHERE C_BPartner.C_BPartner_ID = ? ";

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
