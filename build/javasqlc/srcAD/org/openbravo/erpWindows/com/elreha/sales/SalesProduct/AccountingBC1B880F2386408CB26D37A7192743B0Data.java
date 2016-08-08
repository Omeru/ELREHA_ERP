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
class AccountingBC1B880F2386408CB26D37A7192743B0Data implements FieldProvider {
static Logger log4j = Logger.getLogger(AccountingBC1B880F2386408CB26D37A7192743B0Data.class);
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
  public String mProductId;
  public String mProductIdr;
  public String cAcctschemaId;
  public String cAcctschemaIdr;
  public String isactive;
  public String pAssetAcct;
  public String pExpenseAcct;
  public String pExpenseAcctr;
  public String pRevenueAcct;
  public String pRevenueAcctr;
  public String pCogsAcct;
  public String pPurchasepricevarianceAcct;
  public String pInvoicepricevarianceAcct;
  public String pInvoicepricevarianceAcctr;
  public String pTradediscountrecAcct;
  public String pTradediscountgrantAcct;
  public String mProductAcctId;
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
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("c_acctschema_id") || fieldName.equals("cAcctschemaId"))
      return cAcctschemaId;
    else if (fieldName.equalsIgnoreCase("c_acctschema_idr") || fieldName.equals("cAcctschemaIdr"))
      return cAcctschemaIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("p_asset_acct") || fieldName.equals("pAssetAcct"))
      return pAssetAcct;
    else if (fieldName.equalsIgnoreCase("p_expense_acct") || fieldName.equals("pExpenseAcct"))
      return pExpenseAcct;
    else if (fieldName.equalsIgnoreCase("p_expense_acctr") || fieldName.equals("pExpenseAcctr"))
      return pExpenseAcctr;
    else if (fieldName.equalsIgnoreCase("p_revenue_acct") || fieldName.equals("pRevenueAcct"))
      return pRevenueAcct;
    else if (fieldName.equalsIgnoreCase("p_revenue_acctr") || fieldName.equals("pRevenueAcctr"))
      return pRevenueAcctr;
    else if (fieldName.equalsIgnoreCase("p_cogs_acct") || fieldName.equals("pCogsAcct"))
      return pCogsAcct;
    else if (fieldName.equalsIgnoreCase("p_purchasepricevariance_acct") || fieldName.equals("pPurchasepricevarianceAcct"))
      return pPurchasepricevarianceAcct;
    else if (fieldName.equalsIgnoreCase("p_invoicepricevariance_acct") || fieldName.equals("pInvoicepricevarianceAcct"))
      return pInvoicepricevarianceAcct;
    else if (fieldName.equalsIgnoreCase("p_invoicepricevariance_acctr") || fieldName.equals("pInvoicepricevarianceAcctr"))
      return pInvoicepricevarianceAcctr;
    else if (fieldName.equalsIgnoreCase("p_tradediscountrec_acct") || fieldName.equals("pTradediscountrecAcct"))
      return pTradediscountrecAcct;
    else if (fieldName.equalsIgnoreCase("p_tradediscountgrant_acct") || fieldName.equals("pTradediscountgrantAcct"))
      return pTradediscountgrantAcct;
    else if (fieldName.equalsIgnoreCase("m_product_acct_id") || fieldName.equals("mProductAcctId"))
      return mProductAcctId;
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
  public static AccountingBC1B880F2386408CB26D37A7192743B0Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mProductId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, mProductId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static AccountingBC1B880F2386408CB26D37A7192743B0Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mProductId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Product_Acct.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product_Acct.CreatedBy) as CreatedByR, " +
      "        to_char(M_Product_Acct.Updated, ?) as updated, " +
      "        to_char(M_Product_Acct.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Product_Acct.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product_Acct.UpdatedBy) as UpdatedByR," +
      "        M_Product_Acct.AD_Client_ID, " +
      "(CASE WHEN M_Product_Acct.AD_Client_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Client_IDR, " +
      "M_Product_Acct.AD_Org_ID, " +
      "(CASE WHEN M_Product_Acct.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_Product_Acct.M_Product_ID, " +
      "(CASE WHEN M_Product_Acct.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "M_Product_Acct.C_AcctSchema_ID, " +
      "(CASE WHEN M_Product_Acct.C_AcctSchema_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_AcctSchema_IDR, " +
      "COALESCE(M_Product_Acct.IsActive, 'N') AS IsActive, " +
      "M_Product_Acct.P_Asset_Acct, " +
      "M_Product_Acct.P_Expense_Acct, " +
      "(CASE WHEN M_Product_Acct.P_Expense_Acct IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Combination), ''))),'') ) END) AS P_Expense_AcctR, " +
      "M_Product_Acct.P_Revenue_Acct, " +
      "(CASE WHEN M_Product_Acct.P_Revenue_Acct IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Combination), ''))),'') ) END) AS P_Revenue_AcctR, " +
      "M_Product_Acct.P_Cogs_Acct, " +
      "M_Product_Acct.P_PurchasePriceVariance_Acct, " +
      "M_Product_Acct.P_InvoicePriceVariance_Acct, " +
      "(CASE WHEN M_Product_Acct.P_InvoicePriceVariance_Acct IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Combination), ''))),'') ) END) AS P_InvoicePriceVariance_AcctR, " +
      "M_Product_Acct.P_TradeDiscountRec_Acct, " +
      "M_Product_Acct.P_TradeDiscountGrant_Acct, " +
      "M_Product_Acct.M_Product_Acct_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM M_Product_Acct left join (select AD_Client_ID, Name from AD_Client) table1 on (M_Product_Acct.AD_Client_ID = table1.AD_Client_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (M_Product_Acct.AD_Org_ID = table2.AD_Org_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (M_Product_Acct.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select C_AcctSchema_ID, Name from C_AcctSchema) table4 on (M_Product_Acct.C_AcctSchema_ID = table4.C_AcctSchema_ID) left join (select C_ValidCombination_ID, Combination from C_ValidCombination) table5 on (M_Product_Acct.P_Expense_Acct = table5.C_ValidCombination_ID) left join (select C_ValidCombination_ID, Combination from C_ValidCombination) table6 on (M_Product_Acct.P_Revenue_Acct = table6.C_ValidCombination_ID) left join (select C_ValidCombination_ID, Combination from C_ValidCombination) table7 on (M_Product_Acct.P_InvoicePriceVariance_Acct = table7.C_ValidCombination_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((mProductId==null || mProductId.equals(""))?"":"  AND M_Product_Acct.M_Product_ID = ?  ");
    strSql = strSql + 
      "        AND M_Product_Acct.M_Product_Acct_ID = ? " +
      "        AND M_Product_Acct.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_Product_Acct.AD_Org_ID IN (";
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
      if (mProductId != null && !(mProductId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
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
        AccountingBC1B880F2386408CB26D37A7192743B0Data objectAccountingBC1B880F2386408CB26D37A7192743B0Data = new AccountingBC1B880F2386408CB26D37A7192743B0Data();
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.created = UtilSql.getValue(result, "created");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.updated = UtilSql.getValue(result, "updated");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.adClientIdr = UtilSql.getValue(result, "ad_client_idr");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.cAcctschemaId = UtilSql.getValue(result, "c_acctschema_id");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.cAcctschemaIdr = UtilSql.getValue(result, "c_acctschema_idr");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.isactive = UtilSql.getValue(result, "isactive");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pAssetAcct = UtilSql.getValue(result, "p_asset_acct");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pExpenseAcct = UtilSql.getValue(result, "p_expense_acct");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pExpenseAcctr = UtilSql.getValue(result, "p_expense_acctr");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pRevenueAcct = UtilSql.getValue(result, "p_revenue_acct");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pRevenueAcctr = UtilSql.getValue(result, "p_revenue_acctr");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pCogsAcct = UtilSql.getValue(result, "p_cogs_acct");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pPurchasepricevarianceAcct = UtilSql.getValue(result, "p_purchasepricevariance_acct");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pInvoicepricevarianceAcct = UtilSql.getValue(result, "p_invoicepricevariance_acct");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pInvoicepricevarianceAcctr = UtilSql.getValue(result, "p_invoicepricevariance_acctr");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pTradediscountrecAcct = UtilSql.getValue(result, "p_tradediscountrec_acct");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.pTradediscountgrantAcct = UtilSql.getValue(result, "p_tradediscountgrant_acct");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.mProductAcctId = UtilSql.getValue(result, "m_product_acct_id");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.language = UtilSql.getValue(result, "language");
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.adUserClient = "";
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.adOrgClient = "";
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.createdby = "";
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.trBgcolor = "";
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.totalCount = "";
        objectAccountingBC1B880F2386408CB26D37A7192743B0Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAccountingBC1B880F2386408CB26D37A7192743B0Data);
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
    AccountingBC1B880F2386408CB26D37A7192743B0Data objectAccountingBC1B880F2386408CB26D37A7192743B0Data[] = new AccountingBC1B880F2386408CB26D37A7192743B0Data[vector.size()];
    vector.copyInto(objectAccountingBC1B880F2386408CB26D37A7192743B0Data);
    return(objectAccountingBC1B880F2386408CB26D37A7192743B0Data);
  }

/**
Create a registry
 */
  public static AccountingBC1B880F2386408CB26D37A7192743B0Data[] set(String mProductId, String pPurchasepricevarianceAcct, String pPurchasepricevarianceAcctr, String pTradediscountrecAcct, String pTradediscountrecAcctr, String adOrgId, String mProductIdr, String pTradediscountgrantAcct, String pTradediscountgrantAcctr, String createdby, String createdbyr, String isactive, String updatedby, String updatedbyr, String pInvoicepricevarianceAcct, String pInvoicepricevarianceAcctr, String pRevenueAcct, String pRevenueAcctr, String cAcctschemaId, String mProductAcctId, String pExpenseAcct, String pExpenseAcctr, String pCogsAcct, String pCogsAcctr, String adClientId, String pAssetAcct, String pAssetAcctr)    throws ServletException {
    AccountingBC1B880F2386408CB26D37A7192743B0Data objectAccountingBC1B880F2386408CB26D37A7192743B0Data[] = new AccountingBC1B880F2386408CB26D37A7192743B0Data[1];
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0] = new AccountingBC1B880F2386408CB26D37A7192743B0Data();
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].created = "";
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].createdbyr = createdbyr;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].updated = "";
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].updatedTimeStamp = "";
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].updatedby = updatedby;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].updatedbyr = updatedbyr;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].adClientId = adClientId;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].adClientIdr = "";
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].adOrgId = adOrgId;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].adOrgIdr = "";
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].mProductId = mProductId;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].mProductIdr = mProductIdr;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].cAcctschemaId = cAcctschemaId;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].cAcctschemaIdr = "";
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].isactive = isactive;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pAssetAcct = pAssetAcct;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pExpenseAcct = pExpenseAcct;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pExpenseAcctr = pExpenseAcctr;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pRevenueAcct = pRevenueAcct;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pRevenueAcctr = pRevenueAcctr;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pCogsAcct = pCogsAcct;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pPurchasepricevarianceAcct = pPurchasepricevarianceAcct;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pInvoicepricevarianceAcct = pInvoicepricevarianceAcct;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pInvoicepricevarianceAcctr = pInvoicepricevarianceAcctr;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pTradediscountrecAcct = pTradediscountrecAcct;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].pTradediscountgrantAcct = pTradediscountgrantAcct;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].mProductAcctId = mProductAcctId;
    objectAccountingBC1B880F2386408CB26D37A7192743B0Data[0].language = "";
    return objectAccountingBC1B880F2386408CB26D37A7192743B0Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef5109_0(ConnectionProvider connectionProvider, String P_PurchasePriceVariance_AcctR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Combination), '') ) as P_PurchasePriceVariance_Acct FROM C_ValidCombination table1 WHERE table1.isActive='Y' AND table1.C_ValidCombination_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_PurchasePriceVariance_AcctR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "p_purchasepricevariance_acct");
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
  public static String selectDef6119_1(ConnectionProvider connectionProvider, String P_TradeDiscountRec_AcctR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Combination), '') ) as P_TradeDiscountRec_Acct FROM C_ValidCombination table1 WHERE table1.isActive='Y' AND table1.C_ValidCombination_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_TradeDiscountRec_AcctR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "p_tradediscountrec_acct");
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
  public static String selectDef2565_2(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef6120_3(ConnectionProvider connectionProvider, String P_TradeDiscountGrant_AcctR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Combination), '') ) as P_TradeDiscountGrant_Acct FROM C_ValidCombination table1 WHERE table1.isActive='Y' AND table1.C_ValidCombination_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_TradeDiscountGrant_AcctR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "p_tradediscountgrant_acct");
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
  public static String selectDef2562_4(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2564_5(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef6118_6(ConnectionProvider connectionProvider, String P_InvoicePriceVariance_AcctR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Combination), '') ) as P_InvoicePriceVariance_Acct FROM C_ValidCombination table1 WHERE table1.isActive='Y' AND table1.C_ValidCombination_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_InvoicePriceVariance_AcctR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "p_invoicepricevariance_acct");
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
  public static String selectDef31D8E17FACF74378B93278F16F34DA5E_7(ConnectionProvider connectionProvider, String P_Revenue_AcctR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Combination), '') ) as P_Revenue_Acct FROM C_ValidCombination table1 WHERE table1.isActive='Y' AND table1.C_ValidCombination_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_Revenue_AcctR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "p_revenue_acct");
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
  public static String selectDefDF4C8A3C70804B2FB2631E62C2DF7E1F_8(ConnectionProvider connectionProvider, String P_Expense_AcctR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Combination), '') ) as P_Expense_Acct FROM C_ValidCombination table1 WHERE table1.isActive='Y' AND table1.C_ValidCombination_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_Expense_AcctR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "p_expense_acct");
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
  public static String selectDef3421_9(ConnectionProvider connectionProvider, String P_Cogs_AcctR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Combination), '') ) as P_Cogs_Acct FROM C_ValidCombination table1 WHERE table1.isActive='Y' AND table1.C_ValidCombination_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_Cogs_AcctR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "p_cogs_acct");
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
  public static String selectDef3420_10(ConnectionProvider connectionProvider, String P_Asset_AcctR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Combination), '') ) as P_Asset_Acct FROM C_ValidCombination table1 WHERE table1.isActive='Y' AND table1.C_ValidCombination_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_Asset_AcctR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "p_asset_acct");
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
      "        SELECT M_Product_Acct.M_Product_ID AS NAME" +
      "        FROM M_Product_Acct" +
      "        WHERE M_Product_Acct.M_Product_Acct_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String paramLanguage, String mProductId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))) AS NAME FROM M_Product left join (select M_Product_ID, Value, Name from M_Product) table1 on (M_Product.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  WHERE M_Product.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String paramLanguage, String mProductId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))) AS NAME FROM M_Product left join (select M_Product_ID, Value, Name from M_Product) table1 on (M_Product.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  WHERE M_Product.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

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
      "        UPDATE M_Product_Acct" +
      "        SET AD_Client_ID = (?) , AD_Org_ID = (?) , M_Product_ID = (?) , C_AcctSchema_ID = (?) , IsActive = (?) , P_Asset_Acct = (?) , P_Expense_Acct = (?) , P_Revenue_Acct = (?) , P_Cogs_Acct = (?) , P_PurchasePriceVariance_Acct = (?) , P_InvoicePriceVariance_Acct = (?) , P_TradeDiscountRec_Acct = (?) , P_TradeDiscountGrant_Acct = (?) , M_Product_Acct_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_Product_Acct.M_Product_Acct_ID = ? " +
      "                 AND M_Product_Acct.M_Product_ID = ? " +
      "        AND M_Product_Acct.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product_Acct.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pPurchasepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pInvoicepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountrecAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountgrantAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductAcctId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductAcctId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
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
      "        INSERT INTO M_Product_Acct " +
      "        (AD_Client_ID, AD_Org_ID, M_Product_ID, C_AcctSchema_ID, IsActive, P_Asset_Acct, P_Expense_Acct, P_Revenue_Acct, P_Cogs_Acct, P_PurchasePriceVariance_Acct, P_InvoicePriceVariance_Acct, P_TradeDiscountRec_Acct, P_TradeDiscountGrant_Acct, M_Product_Acct_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cAcctschemaId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pAssetAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pExpenseAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pRevenueAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pCogsAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pPurchasepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pInvoicepricevarianceAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountrecAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pTradediscountgrantAcct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductAcctId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String mProductId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM M_Product_Acct" +
      "        WHERE M_Product_Acct.M_Product_Acct_ID = ? " +
      "                 AND M_Product_Acct.M_Product_ID = ? " +
      "        AND M_Product_Acct.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product_Acct.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String mProductId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM M_Product_Acct" +
      "        WHERE M_Product_Acct.M_Product_Acct_ID = ? " +
      "                 AND M_Product_Acct.M_Product_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

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
      "          FROM M_Product_Acct" +
      "         WHERE M_Product_Acct.M_Product_Acct_ID = ? ";

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
      "          FROM M_Product_Acct" +
      "         WHERE M_Product_Acct.M_Product_Acct_ID = ? ";

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
