//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openz.customerassets.CustomerAssetsOverview;

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
class AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data implements FieldProvider {
static Logger log4j = Logger.getLogger(AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String caAssetsstockedId;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String mProductId;
  public String mProductIdr;
  public String snrMasterdataId;
  public String snrMasterdataIdr;
  public String qty;
  public String actualqty;
  public String qtysold;
  public String price;
  public String amt;
  public String chargeamt;
  public String stockcharge;
  public String paymentdate;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String statusref;
  public String statusrefr;
  public String dateofsale;
  public String datedelivered;
  public String dateordered;
  public String datestockfeeuntil;
  public String description;
  public String cOrderlineId;
  public String cOrderlineIdr;
  public String mWarehouseId;
  public String mWarehouseIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String adClientId;
  public String poorderline;
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
    else if (fieldName.equalsIgnoreCase("ca_assetsstocked_id") || fieldName.equals("caAssetsstockedId"))
      return caAssetsstockedId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("snr_masterdata_id") || fieldName.equals("snrMasterdataId"))
      return snrMasterdataId;
    else if (fieldName.equalsIgnoreCase("snr_masterdata_idr") || fieldName.equals("snrMasterdataIdr"))
      return snrMasterdataIdr;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("actualqty"))
      return actualqty;
    else if (fieldName.equalsIgnoreCase("qtysold"))
      return qtysold;
    else if (fieldName.equalsIgnoreCase("price"))
      return price;
    else if (fieldName.equalsIgnoreCase("amt"))
      return amt;
    else if (fieldName.equalsIgnoreCase("chargeamt"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("stockcharge"))
      return stockcharge;
    else if (fieldName.equalsIgnoreCase("paymentdate"))
      return paymentdate;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("statusref"))
      return statusref;
    else if (fieldName.equalsIgnoreCase("statusrefr"))
      return statusrefr;
    else if (fieldName.equalsIgnoreCase("dateofsale"))
      return dateofsale;
    else if (fieldName.equalsIgnoreCase("datedelivered"))
      return datedelivered;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("datestockfeeuntil"))
      return datestockfeeuntil;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("c_orderline_id") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("c_orderline_idr") || fieldName.equals("cOrderlineIdr"))
      return cOrderlineIdr;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("m_warehouse_idr") || fieldName.equals("mWarehouseIdr"))
      return mWarehouseIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("poorderline"))
      return poorderline;
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
  public static AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(CA_Assetsstocked.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = CA_Assetsstocked.CreatedBy) as CreatedByR, " +
      "        to_char(CA_Assetsstocked.Updated, ?) as updated, " +
      "        to_char(CA_Assetsstocked.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        CA_Assetsstocked.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = CA_Assetsstocked.UpdatedBy) as UpdatedByR," +
      "        CA_Assetsstocked.CA_AssetsStocked_ID, " +
      "CA_Assetsstocked.C_BPartner_ID, " +
      "(CASE WHEN CA_Assetsstocked.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "CA_Assetsstocked.M_Product_ID, " +
      "(CASE WHEN CA_Assetsstocked.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "CA_Assetsstocked.SNR_Masterdata_id, " +
      "(CASE WHEN CA_Assetsstocked.SNR_Masterdata_id IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Serialnumber), ''))),'') ) END) AS SNR_Masterdata_idR, " +
      "CA_Assetsstocked.Qty, " +
      "CA_Assetsstocked.Actualqty, " +
      "CA_Assetsstocked.Qtysold, " +
      "CA_Assetsstocked.Price, " +
      "CA_Assetsstocked.Amt, " +
      "CA_Assetsstocked.ChargeAmt, " +
      "CA_Assetsstocked.Stockcharge, " +
      "CA_Assetsstocked.Paymentdate, " +
      "CA_Assetsstocked.C_Currency_ID, " +
      "(CASE WHEN CA_Assetsstocked.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "CA_Assetsstocked.Statusref, " +
      "(CASE WHEN CA_Assetsstocked.Statusref IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS StatusrefR, " +
      "CA_Assetsstocked.DateOfSale, " +
      "CA_Assetsstocked.DateDelivered, " +
      "CA_Assetsstocked.DateOrdered, " +
      "CA_Assetsstocked.DateStockFeeUntil, " +
      "CA_Assetsstocked.Description, " +
      "CA_Assetsstocked.C_OrderLine_ID, " +
      "(CASE WHEN CA_Assetsstocked.C_OrderLine_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table7.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.GrandTotal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.LineNetAmt), ''))),'') ) END) AS C_OrderLine_IDR, " +
      "CA_Assetsstocked.M_Warehouse_ID, " +
      "(CASE WHEN CA_Assetsstocked.M_Warehouse_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'') ) END) AS M_Warehouse_IDR, " +
      "CA_Assetsstocked.AD_Org_ID, " +
      "(CASE WHEN CA_Assetsstocked.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "CA_Assetsstocked.AD_Client_ID, " +
      "CA_Assetsstocked.Poorderline, " +
      "COALESCE(CA_Assetsstocked.IsActive, 'N') AS IsActive, " +
      "        ? AS LANGUAGE " +
      "        FROM CA_Assetsstocked left join (select C_BPartner_ID, Name from C_BPartner) table1 on (CA_Assetsstocked.C_BPartner_ID = table1.C_BPartner_ID) left join (select M_Product_ID, Value, Name from M_Product) table2 on (CA_Assetsstocked.M_Product_ID = table2.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  left join (select SNR_Masterdata_id, M_Product_ID, Serialnumber from SNR_Masterdata) table3 on (CA_Assetsstocked.SNR_Masterdata_id = table3.SNR_Masterdata_id) left join (select M_Product_ID, Value, Name from M_Product) table4 on (table3.M_Product_ID = table4.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  left join (select C_Currency_ID, ISO_Code from C_Currency) table5 on (CA_Assetsstocked.C_Currency_ID = table5.C_Currency_ID) left join ad_ref_list_v list1 on (CA_Assetsstocked.Statusref = list1.value and list1.ad_reference_id = '11F66EE090404622803A4D41F6BB3EB9' and list1.ad_language = ?)  left join (select C_OrderLine_ID, C_Order_ID, Line, LineNetAmt from C_OrderLine) table6 on (CA_Assetsstocked.C_OrderLine_ID = table6.C_OrderLine_ID) left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table7 on (table6.C_Order_ID = table7.C_Order_ID) left join (select M_Warehouse_ID, Name from M_Warehouse) table8 on (CA_Assetsstocked.M_Warehouse_ID = table8.M_Warehouse_ID) left join (select AD_Org_ID, Name from AD_Org) table9 on (CA_Assetsstocked.AD_Org_ID = table9.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND CA_Assetsstocked.CA_AssetsStocked_ID = ? " +
      "        AND CA_Assetsstocked.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND CA_Assetsstocked.AD_Org_ID IN (";
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
        AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data = new AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data();
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.created = UtilSql.getValue(result, "created");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.updated = UtilSql.getValue(result, "updated");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.caAssetsstockedId = UtilSql.getValue(result, "ca_assetsstocked_id");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.snrMasterdataId = UtilSql.getValue(result, "snr_masterdata_id");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.snrMasterdataIdr = UtilSql.getValue(result, "snr_masterdata_idr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.qty = UtilSql.getValue(result, "qty");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.actualqty = UtilSql.getValue(result, "actualqty");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.qtysold = UtilSql.getValue(result, "qtysold");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.price = UtilSql.getValue(result, "price");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.amt = UtilSql.getValue(result, "amt");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.chargeamt = UtilSql.getValue(result, "chargeamt");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.stockcharge = UtilSql.getValue(result, "stockcharge");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.paymentdate = UtilSql.getDateValue(result, "paymentdate", "dd-MM-yyyy");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.statusref = UtilSql.getValue(result, "statusref");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.statusrefr = UtilSql.getValue(result, "statusrefr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.dateofsale = UtilSql.getDateValue(result, "dateofsale", "dd-MM-yyyy");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.datedelivered = UtilSql.getDateValue(result, "datedelivered", "dd-MM-yyyy");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.datestockfeeuntil = UtilSql.getDateValue(result, "datestockfeeuntil", "dd-MM-yyyy");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.description = UtilSql.getValue(result, "description");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.cOrderlineIdr = UtilSql.getValue(result, "c_orderline_idr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.mWarehouseIdr = UtilSql.getValue(result, "m_warehouse_idr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.poorderline = UtilSql.getValue(result, "poorderline");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.isactive = UtilSql.getValue(result, "isactive");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.language = UtilSql.getValue(result, "language");
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.adUserClient = "";
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.adOrgClient = "";
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.createdby = "";
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.trBgcolor = "";
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.totalCount = "";
        objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data);
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
    AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[] = new AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[vector.size()];
    vector.copyInto(objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data);
    return(objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data);
  }

/**
Create a registry
 */
  public static AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[] set(String snrMasterdataId, String caAssetsstockedId, String price, String mProductId, String mProductIdr, String chargeamt, String actualqty, String datestockfeeuntil, String cOrderlineId, String mWarehouseId, String adOrgId, String description, String datedelivered, String stockcharge, String amt, String cBpartnerId, String cBpartnerIdr, String isactive, String statusref, String poorderline, String updatedby, String updatedbyr, String cCurrencyId, String paymentdate, String qtysold, String qty, String adClientId, String createdby, String createdbyr, String dateordered, String dateofsale)    throws ServletException {
    AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[] = new AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[1];
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0] = new AllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data();
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].created = "";
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].createdbyr = createdbyr;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].updated = "";
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].updatedTimeStamp = "";
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].updatedby = updatedby;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].updatedbyr = updatedbyr;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].caAssetsstockedId = caAssetsstockedId;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].cBpartnerId = cBpartnerId;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].cBpartnerIdr = cBpartnerIdr;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].mProductId = mProductId;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].mProductIdr = mProductIdr;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].snrMasterdataId = snrMasterdataId;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].snrMasterdataIdr = "";
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].qty = qty;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].actualqty = actualqty;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].qtysold = qtysold;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].price = price;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].amt = amt;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].chargeamt = chargeamt;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].stockcharge = stockcharge;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].paymentdate = paymentdate;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].cCurrencyId = cCurrencyId;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].cCurrencyIdr = "";
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].statusref = statusref;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].statusrefr = "";
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].dateofsale = dateofsale;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].datedelivered = datedelivered;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].dateordered = dateordered;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].datestockfeeuntil = datestockfeeuntil;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].description = description;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].cOrderlineId = cOrderlineId;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].cOrderlineIdr = "";
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].mWarehouseId = mWarehouseId;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].mWarehouseIdr = "";
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].adOrgId = adOrgId;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].adOrgIdr = "";
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].adClientId = adClientId;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].poorderline = poorderline;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].isactive = isactive;
    objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data[0].language = "";
    return objectAllCustomerAssets2DA8999B9C8D4B478399C275EA76BFD5Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef9CFD412BDE444822A111D1D8F1C35ACD_0(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef50776D81AA0944A69E1B6F951CFF161D_1(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDefB8FD240B381E480FB8DDC9807008A7E7_2(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef57F4E21F8A55400DA273C41AF26F0AEB_3(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE CA_Assetsstocked" +
      "        SET CA_AssetsStocked_ID = (?) , C_BPartner_ID = (?) , M_Product_ID = (?) , SNR_Masterdata_id = (?) , Qty = TO_NUMBER(?) , Actualqty = TO_NUMBER(?) , Qtysold = TO_NUMBER(?) , Price = TO_NUMBER(?) , Amt = TO_NUMBER(?) , ChargeAmt = TO_NUMBER(?) , Stockcharge = TO_NUMBER(?) , Paymentdate = TO_DATE(?) , C_Currency_ID = (?) , Statusref = (?) , DateOfSale = TO_DATE(?) , DateDelivered = TO_DATE(?) , DateOrdered = TO_DATE(?) , DateStockFeeUntil = TO_DATE(?) , Description = (?) , C_OrderLine_ID = (?) , M_Warehouse_ID = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , Poorderline = (?) , IsActive = (?) , updated = now(), updatedby = ? " +
      "        WHERE CA_Assetsstocked.CA_AssetsStocked_ID = ? " +
      "        AND CA_Assetsstocked.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND CA_Assetsstocked.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrMasterdataId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, actualqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtysold);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, price);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockcharge);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statusref);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateofsale);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datestockfeeuntil);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poorderline);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
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
      "        INSERT INTO CA_Assetsstocked " +
      "        (CA_AssetsStocked_ID, C_BPartner_ID, M_Product_ID, SNR_Masterdata_id, Qty, Actualqty, Qtysold, Price, Amt, ChargeAmt, Stockcharge, Paymentdate, C_Currency_ID, Statusref, DateOfSale, DateDelivered, DateOrdered, DateStockFeeUntil, Description, C_OrderLine_ID, M_Warehouse_ID, AD_Org_ID, AD_Client_ID, Poorderline, IsActive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?), (?), (?), TO_DATE(?), TO_DATE(?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrMasterdataId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, actualqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtysold);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, price);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockcharge);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statusref);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateofsale);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datestockfeeuntil);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poorderline);
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
      "        DELETE FROM CA_Assetsstocked" +
      "        WHERE CA_Assetsstocked.CA_AssetsStocked_ID = ? " +
      "        AND CA_Assetsstocked.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND CA_Assetsstocked.AD_Org_ID IN (";
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
      "        DELETE FROM CA_Assetsstocked" +
      "        WHERE CA_Assetsstocked.CA_AssetsStocked_ID = ? ";

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
      "          FROM CA_Assetsstocked" +
      "         WHERE CA_Assetsstocked.CA_AssetsStocked_ID = ? ";

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
      "          FROM CA_Assetsstocked" +
      "         WHERE CA_Assetsstocked.CA_AssetsStocked_ID = ? ";

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
