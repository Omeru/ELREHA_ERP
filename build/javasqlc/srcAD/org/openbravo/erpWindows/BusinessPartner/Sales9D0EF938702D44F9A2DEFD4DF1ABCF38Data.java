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
class Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data implements FieldProvider {
static Logger log4j = Logger.getLogger(Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String caAssetsstockedId;
  public String caAssetsstockedIdr;
  public String mProductId;
  public String mProductIdr;
  public String cOrderlineId;
  public String cOrderlineIdr;
  public String qty;
  public String price;
  public String amt;
  public String dateofsale;
  public String paymentdate;
  public String description;
  public String caAssetsstockedsalesId;
  public String isactive;
  public String adClientId;
  public String chargeamt;
  public String adOrgId;
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
    else if (fieldName.equalsIgnoreCase("ca_assetsstocked_idr") || fieldName.equals("caAssetsstockedIdr"))
      return caAssetsstockedIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("c_orderline_id") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("c_orderline_idr") || fieldName.equals("cOrderlineIdr"))
      return cOrderlineIdr;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("price"))
      return price;
    else if (fieldName.equalsIgnoreCase("amt"))
      return amt;
    else if (fieldName.equalsIgnoreCase("dateofsale"))
      return dateofsale;
    else if (fieldName.equalsIgnoreCase("paymentdate"))
      return paymentdate;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("ca_assetsstockedsales_id") || fieldName.equals("caAssetsstockedsalesId"))
      return caAssetsstockedsalesId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("chargeamt"))
      return chargeamt;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
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
  public static Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String caAssetsstockedId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, caAssetsstockedId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String caAssetsstockedId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(CA_ASSETSSTOCKEDSALES.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = CA_ASSETSSTOCKEDSALES.CreatedBy) as CreatedByR, " +
      "        to_char(CA_ASSETSSTOCKEDSALES.Updated, ?) as updated, " +
      "        to_char(CA_ASSETSSTOCKEDSALES.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        CA_ASSETSSTOCKEDSALES.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = CA_ASSETSSTOCKEDSALES.UpdatedBy) as UpdatedByR," +
      "        CA_ASSETSSTOCKEDSALES.CA_Assetsstocked_ID, " +
      "(CASE WHEN CA_ASSETSSTOCKEDSALES.CA_Assetsstocked_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Qty), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Serialnumber), ''))),'') ) END) AS CA_Assetsstocked_IDR, " +
      "CA_ASSETSSTOCKEDSALES.M_Product_ID, " +
      "(CASE WHEN CA_ASSETSSTOCKEDSALES.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "CA_ASSETSSTOCKEDSALES.C_Orderline_ID, " +
      "(CASE WHEN CA_ASSETSSTOCKEDSALES.C_Orderline_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table8.DateOrdered, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.GrandTotal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.LineNetAmt), ''))),'') ) END) AS C_Orderline_IDR, " +
      "CA_ASSETSSTOCKEDSALES.Qty, " +
      "CA_ASSETSSTOCKEDSALES.Price, " +
      "CA_ASSETSSTOCKEDSALES.Amt, " +
      "CA_ASSETSSTOCKEDSALES.Dateofsale, " +
      "CA_ASSETSSTOCKEDSALES.Paymentdate, " +
      "CA_ASSETSSTOCKEDSALES.Description, " +
      "CA_ASSETSSTOCKEDSALES.CA_Assetsstockedsales_ID, " +
      "COALESCE(CA_ASSETSSTOCKEDSALES.Isactive, 'N') AS Isactive, " +
      "CA_ASSETSSTOCKEDSALES.AD_Client_ID, " +
      "CA_ASSETSSTOCKEDSALES.Chargeamt, " +
      "CA_ASSETSSTOCKEDSALES.AD_Org_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM CA_ASSETSSTOCKEDSALES left join (select CA_Assetsstocked_ID, C_BPartner_ID, M_Product_ID, Qty, SNR_Masterdata_id from CA_Assetsstocked) table1 on (CA_ASSETSSTOCKEDSALES.CA_Assetsstocked_ID = table1.CA_Assetsstocked_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (table1.C_BPartner_ID = table2.C_BPartner_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select SNR_Masterdata_id, M_Product_ID, Serialnumber from SNR_Masterdata) table4 on (table1.SNR_Masterdata_id = table4.SNR_Masterdata_id) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table4.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  left join (select M_Product_ID, Value, Name from M_Product) table6 on (CA_ASSETSSTOCKEDSALES.M_Product_ID = table6.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL6 on (table6.M_Product_ID = tableTRL6.M_Product_ID and tableTRL6.AD_Language = ?)  left join (select C_Orderline_ID, C_Order_ID, Line, LineNetAmt from C_Orderline) table7 on (CA_ASSETSSTOCKEDSALES.C_Orderline_ID = table7.C_Orderline_ID) left join (select C_Order_ID, DocumentNo, Name, DateOrdered, GrandTotal from C_Order) table8 on (table7.C_Order_ID = table8.C_Order_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((caAssetsstockedId==null || caAssetsstockedId.equals(""))?"":"  AND CA_ASSETSSTOCKEDSALES.CA_Assetsstocked_ID = ?  ");
    strSql = strSql + 
      "        AND CA_ASSETSSTOCKEDSALES.CA_Assetsstockedsales_ID = ? " +
      "        AND CA_ASSETSSTOCKEDSALES.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND CA_ASSETSSTOCKEDSALES.AD_Org_ID IN (";
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
      if (caAssetsstockedId != null && !(caAssetsstockedId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
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
        Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data = new Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data();
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.created = UtilSql.getValue(result, "created");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.updated = UtilSql.getValue(result, "updated");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.caAssetsstockedId = UtilSql.getValue(result, "ca_assetsstocked_id");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.caAssetsstockedIdr = UtilSql.getValue(result, "ca_assetsstocked_idr");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.cOrderlineIdr = UtilSql.getValue(result, "c_orderline_idr");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.qty = UtilSql.getValue(result, "qty");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.price = UtilSql.getValue(result, "price");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.amt = UtilSql.getValue(result, "amt");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.dateofsale = UtilSql.getDateValue(result, "dateofsale", "dd-MM-yyyy");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.paymentdate = UtilSql.getDateValue(result, "paymentdate", "dd-MM-yyyy");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.description = UtilSql.getValue(result, "description");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.caAssetsstockedsalesId = UtilSql.getValue(result, "ca_assetsstockedsales_id");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.isactive = UtilSql.getValue(result, "isactive");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.chargeamt = UtilSql.getValue(result, "chargeamt");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.language = UtilSql.getValue(result, "language");
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.adUserClient = "";
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.adOrgClient = "";
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.createdby = "";
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.trBgcolor = "";
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.totalCount = "";
        objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data);
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
    Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[] = new Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[vector.size()];
    vector.copyInto(objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data);
    return(objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data);
  }

/**
Create a registry
 */
  public static Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[] set(String caAssetsstockedId, String createdby, String createdbyr, String updatedby, String updatedbyr, String chargeamt, String caAssetsstockedsalesId, String adClientId, String dateofsale, String isactive, String amt, String adOrgId, String description, String mProductId, String mProductIdr, String cOrderlineId, String qty, String price, String paymentdate)    throws ServletException {
    Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[] = new Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[1];
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0] = new Sales9D0EF938702D44F9A2DEFD4DF1ABCF38Data();
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].created = "";
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].createdbyr = createdbyr;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].updated = "";
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].updatedTimeStamp = "";
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].updatedby = updatedby;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].updatedbyr = updatedbyr;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].caAssetsstockedId = caAssetsstockedId;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].caAssetsstockedIdr = "";
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].mProductId = mProductId;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].mProductIdr = mProductIdr;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].cOrderlineId = cOrderlineId;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].cOrderlineIdr = "";
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].qty = qty;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].price = price;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].amt = amt;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].dateofsale = dateofsale;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].paymentdate = paymentdate;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].description = description;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].caAssetsstockedsalesId = caAssetsstockedsalesId;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].isactive = isactive;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].adClientId = adClientId;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].chargeamt = chargeamt;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].adOrgId = adOrgId;
    objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data[0].language = "";
    return objectSales9D0EF938702D44F9A2DEFD4DF1ABCF38Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefE15D919F050E4090BD7EFA3F237930C3_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefACF22FE595984DE6B07C8A35CC7286C7_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef14F64F11969C4BABA5F105423FFA15E2_2(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT CA_ASSETSSTOCKEDSALES.CA_Assetsstocked_ID AS NAME" +
      "        FROM CA_ASSETSSTOCKEDSALES" +
      "        WHERE CA_ASSETSSTOCKEDSALES.CA_Assetsstockedsales_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String paramLanguage, String caAssetsstockedId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table3.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Qty), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table5.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table4.Serialnumber), ''))) AS NAME FROM CA_Assetsstocked left join (select CA_Assetsstocked_ID, C_BPartner_ID, M_Product_ID, Qty, SNR_Masterdata_id from CA_Assetsstocked) table1 on (CA_Assetsstocked.CA_Assetsstocked_ID = table1.CA_Assetsstocked_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (table1.C_BPartner_ID = table2.C_BPartner_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select SNR_Masterdata_id, M_Product_ID, Serialnumber from SNR_Masterdata) table4 on (table1.SNR_Masterdata_id = table4.SNR_Masterdata_id) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table4.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  WHERE CA_Assetsstocked.CA_Assetsstocked_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String paramLanguage, String caAssetsstockedId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table3.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Qty), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table5.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table4.Serialnumber), ''))) AS NAME FROM CA_Assetsstocked left join (select CA_Assetsstocked_ID, C_BPartner_ID, M_Product_ID, Qty, SNR_Masterdata_id from CA_Assetsstocked) table1 on (CA_Assetsstocked.CA_Assetsstocked_ID = table1.CA_Assetsstocked_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (table1.C_BPartner_ID = table2.C_BPartner_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select SNR_Masterdata_id, M_Product_ID, Serialnumber from SNR_Masterdata) table4 on (table1.SNR_Masterdata_id = table4.SNR_Masterdata_id) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table4.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  WHERE CA_Assetsstocked.CA_Assetsstocked_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);

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
      "        UPDATE CA_ASSETSSTOCKEDSALES" +
      "        SET CA_Assetsstocked_ID = (?) , M_Product_ID = (?) , C_Orderline_ID = (?) , Qty = TO_NUMBER(?) , Price = TO_NUMBER(?) , Amt = TO_NUMBER(?) , Dateofsale = TO_DATE(?) , Paymentdate = TO_DATE(?) , Description = (?) , CA_Assetsstockedsales_ID = (?) , Isactive = (?) , AD_Client_ID = (?) , Chargeamt = TO_NUMBER(?) , AD_Org_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE CA_ASSETSSTOCKEDSALES.CA_Assetsstockedsales_ID = ? " +
      "                 AND CA_ASSETSSTOCKEDSALES.CA_Assetsstocked_ID = ? " +
      "        AND CA_ASSETSSTOCKEDSALES.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND CA_ASSETSSTOCKEDSALES.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, price);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateofsale);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedsalesId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedsalesId);
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
      "        INSERT INTO CA_ASSETSSTOCKEDSALES " +
      "        (CA_Assetsstocked_ID, M_Product_ID, C_Orderline_ID, Qty, Price, Amt, Dateofsale, Paymentdate, Description, CA_Assetsstockedsales_ID, Isactive, AD_Client_ID, Chargeamt, AD_Org_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), TO_NUMBER(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, price);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateofsale);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedsalesId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, chargeamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String caAssetsstockedId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM CA_ASSETSSTOCKEDSALES" +
      "        WHERE CA_ASSETSSTOCKEDSALES.CA_Assetsstockedsales_ID = ? " +
      "                 AND CA_ASSETSSTOCKEDSALES.CA_Assetsstocked_ID = ? " +
      "        AND CA_ASSETSSTOCKEDSALES.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND CA_ASSETSSTOCKEDSALES.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
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
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String caAssetsstockedId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM CA_ASSETSSTOCKEDSALES" +
      "        WHERE CA_ASSETSSTOCKEDSALES.CA_Assetsstockedsales_ID = ? " +
      "                 AND CA_ASSETSSTOCKEDSALES.CA_Assetsstocked_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);

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
      "          FROM CA_ASSETSSTOCKEDSALES" +
      "         WHERE CA_ASSETSSTOCKEDSALES.CA_Assetsstockedsales_ID = ? ";

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
      "          FROM CA_ASSETSSTOCKEDSALES" +
      "         WHERE CA_ASSETSSTOCKEDSALES.CA_Assetsstockedsales_ID = ? ";

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
