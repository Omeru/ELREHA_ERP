//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.Manufacturer;

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
class ProductsandVendorsData implements FieldProvider {
static Logger log4j = Logger.getLogger(ProductsandVendorsData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String mManufacturerId;
  public String mManufacturerIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String mProductId;
  public String mProductIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String qualityrating;
  public String iscurrentvendor;
  public String manufacturernumber;
  public String upc;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String cUomId;
  public String cUomIdr;
  public String pricelist;
  public String pricepo;
  public String pricelastpo;
  public String pricelastinv;
  public String deliverytimePromised;
  public String vendorproductno;
  public String vendorcategory;
  public String discontinued;
  public String qtystd;
  public String orderMin;
  public String ismultipleofminimumqty;
  public String orderPack;
  public String isactive;
  public String royaltyamt;
  public String adClientId;
  public String mProductPoId;
  public String capacity;
  public String deliverytimeActual;
  public String discontinuedby;
  public String costperorder;
  public String priceeffective;
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
    else if (fieldName.equalsIgnoreCase("m_manufacturer_id") || fieldName.equals("mManufacturerId"))
      return mManufacturerId;
    else if (fieldName.equalsIgnoreCase("m_manufacturer_idr") || fieldName.equals("mManufacturerIdr"))
      return mManufacturerIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("qualityrating"))
      return qualityrating;
    else if (fieldName.equalsIgnoreCase("iscurrentvendor"))
      return iscurrentvendor;
    else if (fieldName.equalsIgnoreCase("manufacturernumber"))
      return manufacturernumber;
    else if (fieldName.equalsIgnoreCase("upc"))
      return upc;
    else if (fieldName.equalsIgnoreCase("c_currency_id") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("c_currency_idr") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("pricelist"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("pricepo"))
      return pricepo;
    else if (fieldName.equalsIgnoreCase("pricelastpo"))
      return pricelastpo;
    else if (fieldName.equalsIgnoreCase("pricelastinv"))
      return pricelastinv;
    else if (fieldName.equalsIgnoreCase("deliverytime_promised") || fieldName.equals("deliverytimePromised"))
      return deliverytimePromised;
    else if (fieldName.equalsIgnoreCase("vendorproductno"))
      return vendorproductno;
    else if (fieldName.equalsIgnoreCase("vendorcategory"))
      return vendorcategory;
    else if (fieldName.equalsIgnoreCase("discontinued"))
      return discontinued;
    else if (fieldName.equalsIgnoreCase("qtystd"))
      return qtystd;
    else if (fieldName.equalsIgnoreCase("order_min") || fieldName.equals("orderMin"))
      return orderMin;
    else if (fieldName.equalsIgnoreCase("ismultipleofminimumqty"))
      return ismultipleofminimumqty;
    else if (fieldName.equalsIgnoreCase("order_pack") || fieldName.equals("orderPack"))
      return orderPack;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("royaltyamt"))
      return royaltyamt;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("m_product_po_id") || fieldName.equals("mProductPoId"))
      return mProductPoId;
    else if (fieldName.equalsIgnoreCase("capacity"))
      return capacity;
    else if (fieldName.equalsIgnoreCase("deliverytime_actual") || fieldName.equals("deliverytimeActual"))
      return deliverytimeActual;
    else if (fieldName.equalsIgnoreCase("discontinuedby"))
      return discontinuedby;
    else if (fieldName.equalsIgnoreCase("costperorder"))
      return costperorder;
    else if (fieldName.equalsIgnoreCase("priceeffective"))
      return priceeffective;
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
  public static ProductsandVendorsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mManufacturerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, mManufacturerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ProductsandVendorsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mManufacturerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Product_PO.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product_PO.CreatedBy) as CreatedByR, " +
      "        to_char(M_Product_PO.Updated, ?) as updated, " +
      "        to_char(M_Product_PO.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Product_PO.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product_PO.UpdatedBy) as UpdatedByR," +
      "        M_Product_PO.M_Manufacturer_ID, " +
      "(CASE WHEN M_Product_PO.M_Manufacturer_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS M_Manufacturer_IDR, " +
      "M_Product_PO.AD_Org_ID, " +
      "(CASE WHEN M_Product_PO.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_Product_PO.M_Product_ID, " +
      "(CASE WHEN M_Product_PO.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "M_Product_PO.C_BPartner_ID, " +
      "(CASE WHEN M_Product_PO.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "M_Product_PO.QualityRating, " +
      "COALESCE(M_Product_PO.IsCurrentVendor, 'N') AS IsCurrentVendor, " +
      "M_Product_PO.manufacturernumber, " +
      "M_Product_PO.UPC, " +
      "M_Product_PO.C_Currency_ID, " +
      "(CASE WHEN M_Product_PO.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "M_Product_PO.C_UOM_ID, " +
      "(CASE WHEN M_Product_PO.C_UOM_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "M_Product_PO.PriceList, " +
      "M_Product_PO.PricePO, " +
      "M_Product_PO.PriceLastPO, " +
      "M_Product_PO.PriceLastInv, " +
      "M_Product_PO.DeliveryTime_Promised, " +
      "M_Product_PO.VendorProductNo, " +
      "M_Product_PO.VendorCategory, " +
      "COALESCE(M_Product_PO.Discontinued, 'N') AS Discontinued, " +
      "M_Product_PO.Qtystd, " +
      "M_Product_PO.Order_Min, " +
      "COALESCE(M_Product_PO.ismultipleofminimumqty, 'N') AS ismultipleofminimumqty, " +
      "M_Product_PO.Order_Pack, " +
      "COALESCE(M_Product_PO.IsActive, 'N') AS IsActive, " +
      "M_Product_PO.RoyaltyAmt, " +
      "M_Product_PO.AD_Client_ID, " +
      "M_Product_PO.M_Product_PO_ID, " +
      "M_Product_PO.Capacity, " +
      "M_Product_PO.DeliveryTime_Actual, " +
      "M_Product_PO.DiscontinuedBy, " +
      "M_Product_PO.CostPerOrder, " +
      "M_Product_PO.PriceEffective, " +
      "        ? AS LANGUAGE " +
      "        FROM M_Product_PO left join (select M_Manufacturer_ID, Name from M_Manufacturer) table1 on (M_Product_PO.M_Manufacturer_ID = table1.M_Manufacturer_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (M_Product_PO.AD_Org_ID = table2.AD_Org_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (M_Product_PO.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table4 on (M_Product_PO.C_BPartner_ID = table4.C_BPartner_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table5 on (M_Product_PO.C_Currency_ID = table5.C_Currency_ID) left join (select C_UOM_ID, Name from C_UOM) table6 on (M_Product_PO.C_UOM_ID =  table6.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL6 on (table6.C_UOM_ID = tableTRL6.C_UOM_ID and tableTRL6.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((mManufacturerId==null || mManufacturerId.equals(""))?"":"  AND M_Product_PO.M_Manufacturer_ID = ?  ");
    strSql = strSql + 
      "        AND M_Product_PO.M_Product_PO_ID = ? " +
      "        AND M_Product_PO.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_Product_PO.AD_Org_ID IN (";
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
      if (mManufacturerId != null && !(mManufacturerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
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
        ProductsandVendorsData objectProductsandVendorsData = new ProductsandVendorsData();
        objectProductsandVendorsData.created = UtilSql.getValue(result, "created");
        objectProductsandVendorsData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectProductsandVendorsData.updated = UtilSql.getValue(result, "updated");
        objectProductsandVendorsData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectProductsandVendorsData.updatedby = UtilSql.getValue(result, "updatedby");
        objectProductsandVendorsData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectProductsandVendorsData.mManufacturerId = UtilSql.getValue(result, "m_manufacturer_id");
        objectProductsandVendorsData.mManufacturerIdr = UtilSql.getValue(result, "m_manufacturer_idr");
        objectProductsandVendorsData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectProductsandVendorsData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectProductsandVendorsData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectProductsandVendorsData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectProductsandVendorsData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectProductsandVendorsData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectProductsandVendorsData.qualityrating = UtilSql.getValue(result, "qualityrating");
        objectProductsandVendorsData.iscurrentvendor = UtilSql.getValue(result, "iscurrentvendor");
        objectProductsandVendorsData.manufacturernumber = UtilSql.getValue(result, "manufacturernumber");
        objectProductsandVendorsData.upc = UtilSql.getValue(result, "upc");
        objectProductsandVendorsData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectProductsandVendorsData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectProductsandVendorsData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectProductsandVendorsData.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectProductsandVendorsData.pricelist = UtilSql.getValue(result, "pricelist");
        objectProductsandVendorsData.pricepo = UtilSql.getValue(result, "pricepo");
        objectProductsandVendorsData.pricelastpo = UtilSql.getValue(result, "pricelastpo");
        objectProductsandVendorsData.pricelastinv = UtilSql.getValue(result, "pricelastinv");
        objectProductsandVendorsData.deliverytimePromised = UtilSql.getValue(result, "deliverytime_promised");
        objectProductsandVendorsData.vendorproductno = UtilSql.getValue(result, "vendorproductno");
        objectProductsandVendorsData.vendorcategory = UtilSql.getValue(result, "vendorcategory");
        objectProductsandVendorsData.discontinued = UtilSql.getValue(result, "discontinued");
        objectProductsandVendorsData.qtystd = UtilSql.getValue(result, "qtystd");
        objectProductsandVendorsData.orderMin = UtilSql.getValue(result, "order_min");
        objectProductsandVendorsData.ismultipleofminimumqty = UtilSql.getValue(result, "ismultipleofminimumqty");
        objectProductsandVendorsData.orderPack = UtilSql.getValue(result, "order_pack");
        objectProductsandVendorsData.isactive = UtilSql.getValue(result, "isactive");
        objectProductsandVendorsData.royaltyamt = UtilSql.getValue(result, "royaltyamt");
        objectProductsandVendorsData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectProductsandVendorsData.mProductPoId = UtilSql.getValue(result, "m_product_po_id");
        objectProductsandVendorsData.capacity = UtilSql.getValue(result, "capacity");
        objectProductsandVendorsData.deliverytimeActual = UtilSql.getValue(result, "deliverytime_actual");
        objectProductsandVendorsData.discontinuedby = UtilSql.getDateValue(result, "discontinuedby", "dd-MM-yyyy");
        objectProductsandVendorsData.costperorder = UtilSql.getValue(result, "costperorder");
        objectProductsandVendorsData.priceeffective = UtilSql.getDateValue(result, "priceeffective", "dd-MM-yyyy");
        objectProductsandVendorsData.language = UtilSql.getValue(result, "language");
        objectProductsandVendorsData.adUserClient = "";
        objectProductsandVendorsData.adOrgClient = "";
        objectProductsandVendorsData.createdby = "";
        objectProductsandVendorsData.trBgcolor = "";
        objectProductsandVendorsData.totalCount = "";
        objectProductsandVendorsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectProductsandVendorsData);
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
    ProductsandVendorsData objectProductsandVendorsData[] = new ProductsandVendorsData[vector.size()];
    vector.copyInto(objectProductsandVendorsData);
    return(objectProductsandVendorsData);
  }

/**
Create a registry
 */
  public static ProductsandVendorsData[] set(String mManufacturerId, String createdby, String createdbyr, String costperorder, String cBpartnerId, String cBpartnerIdr, String cUomId, String orderMin, String iscurrentvendor, String mProductPoId, String priceeffective, String mProductId, String mProductIdr, String vendorcategory, String pricelastinv, String pricelist, String deliverytimeActual, String pricepo, String updatedby, String updatedbyr, String discontinued, String orderPack, String ismultipleofminimumqty, String pricelastpo, String vendorproductno, String qtystd, String cCurrencyId, String discontinuedby, String upc, String royaltyamt, String qualityrating, String adClientId, String capacity, String adOrgId, String manufacturernumber, String isactive, String deliverytimePromised)    throws ServletException {
    ProductsandVendorsData objectProductsandVendorsData[] = new ProductsandVendorsData[1];
    objectProductsandVendorsData[0] = new ProductsandVendorsData();
    objectProductsandVendorsData[0].created = "";
    objectProductsandVendorsData[0].createdbyr = createdbyr;
    objectProductsandVendorsData[0].updated = "";
    objectProductsandVendorsData[0].updatedTimeStamp = "";
    objectProductsandVendorsData[0].updatedby = updatedby;
    objectProductsandVendorsData[0].updatedbyr = updatedbyr;
    objectProductsandVendorsData[0].mManufacturerId = mManufacturerId;
    objectProductsandVendorsData[0].mManufacturerIdr = "";
    objectProductsandVendorsData[0].adOrgId = adOrgId;
    objectProductsandVendorsData[0].adOrgIdr = "";
    objectProductsandVendorsData[0].mProductId = mProductId;
    objectProductsandVendorsData[0].mProductIdr = mProductIdr;
    objectProductsandVendorsData[0].cBpartnerId = cBpartnerId;
    objectProductsandVendorsData[0].cBpartnerIdr = cBpartnerIdr;
    objectProductsandVendorsData[0].qualityrating = qualityrating;
    objectProductsandVendorsData[0].iscurrentvendor = iscurrentvendor;
    objectProductsandVendorsData[0].manufacturernumber = manufacturernumber;
    objectProductsandVendorsData[0].upc = upc;
    objectProductsandVendorsData[0].cCurrencyId = cCurrencyId;
    objectProductsandVendorsData[0].cCurrencyIdr = "";
    objectProductsandVendorsData[0].cUomId = cUomId;
    objectProductsandVendorsData[0].cUomIdr = "";
    objectProductsandVendorsData[0].pricelist = pricelist;
    objectProductsandVendorsData[0].pricepo = pricepo;
    objectProductsandVendorsData[0].pricelastpo = pricelastpo;
    objectProductsandVendorsData[0].pricelastinv = pricelastinv;
    objectProductsandVendorsData[0].deliverytimePromised = deliverytimePromised;
    objectProductsandVendorsData[0].vendorproductno = vendorproductno;
    objectProductsandVendorsData[0].vendorcategory = vendorcategory;
    objectProductsandVendorsData[0].discontinued = discontinued;
    objectProductsandVendorsData[0].qtystd = qtystd;
    objectProductsandVendorsData[0].orderMin = orderMin;
    objectProductsandVendorsData[0].ismultipleofminimumqty = ismultipleofminimumqty;
    objectProductsandVendorsData[0].orderPack = orderPack;
    objectProductsandVendorsData[0].isactive = isactive;
    objectProductsandVendorsData[0].royaltyamt = royaltyamt;
    objectProductsandVendorsData[0].adClientId = adClientId;
    objectProductsandVendorsData[0].mProductPoId = mProductPoId;
    objectProductsandVendorsData[0].capacity = capacity;
    objectProductsandVendorsData[0].deliverytimeActual = deliverytimeActual;
    objectProductsandVendorsData[0].discontinuedby = discontinuedby;
    objectProductsandVendorsData[0].costperorder = costperorder;
    objectProductsandVendorsData[0].priceeffective = priceeffective;
    objectProductsandVendorsData[0].language = "";
    return objectProductsandVendorsData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2314_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2705_1(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
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
  public static String selectDef1420_2(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef2316_3(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        SELECT M_Product_PO.M_Manufacturer_ID AS NAME" +
      "        FROM M_Product_PO" +
      "        WHERE M_Product_PO.M_Product_PO_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String mManufacturerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM m_manufacturer left join (select M_Manufacturer_ID, Name from M_Manufacturer) table1 on (m_manufacturer.M_Manufacturer_ID = table1.M_Manufacturer_ID) WHERE m_manufacturer.M_Manufacturer_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String mManufacturerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM m_manufacturer left join (select M_Manufacturer_ID, Name from M_Manufacturer) table1 on (m_manufacturer.M_Manufacturer_ID = table1.M_Manufacturer_ID) WHERE m_manufacturer.M_Manufacturer_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);

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
      "        UPDATE M_Product_PO" +
      "        SET M_Manufacturer_ID = (?) , AD_Org_ID = (?) , M_Product_ID = (?) , C_BPartner_ID = (?) , QualityRating = TO_NUMBER(?) , IsCurrentVendor = (?) , manufacturernumber = (?) , UPC = (?) , C_Currency_ID = (?) , C_UOM_ID = (?) , PriceList = TO_NUMBER(?) , PricePO = TO_NUMBER(?) , PriceLastPO = TO_NUMBER(?) , PriceLastInv = TO_NUMBER(?) , DeliveryTime_Promised = TO_NUMBER(?) , VendorProductNo = (?) , VendorCategory = (?) , Discontinued = (?) , Qtystd = TO_NUMBER(?) , Order_Min = TO_NUMBER(?) , ismultipleofminimumqty = (?) , Order_Pack = TO_NUMBER(?) , IsActive = (?) , RoyaltyAmt = TO_NUMBER(?) , AD_Client_ID = (?) , M_Product_PO_ID = (?) , Capacity = TO_NUMBER(?) , DeliveryTime_Actual = TO_NUMBER(?) , DiscontinuedBy = TO_DATE(?) , CostPerOrder = TO_NUMBER(?) , PriceEffective = TO_DATE(?) , updated = now(), updatedby = ? " +
      "        WHERE M_Product_PO.M_Product_PO_ID = ? " +
      "                 AND M_Product_PO.M_Manufacturer_ID = ? " +
      "        AND M_Product_PO.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product_PO.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qualityrating);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscurrentvendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturernumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricepo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelastpo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelastinv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimePromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorproductno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorcategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtystd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderMin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ismultipleofminimumqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderPack);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, royaltyamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductPoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, capacity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimeActual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costperorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceeffective);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductPoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
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
      "        INSERT INTO M_Product_PO " +
      "        (M_Manufacturer_ID, AD_Org_ID, M_Product_ID, C_BPartner_ID, QualityRating, IsCurrentVendor, manufacturernumber, UPC, C_Currency_ID, C_UOM_ID, PriceList, PricePO, PriceLastPO, PriceLastInv, DeliveryTime_Promised, VendorProductNo, VendorCategory, Discontinued, Qtystd, Order_Min, ismultipleofminimumqty, Order_Pack, IsActive, RoyaltyAmt, AD_Client_ID, M_Product_PO_ID, Capacity, DeliveryTime_Actual, DiscontinuedBy, CostPerOrder, PriceEffective, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_DATE(?), TO_NUMBER(?), TO_DATE(?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qualityrating);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscurrentvendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturernumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricepo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelastpo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelastinv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimePromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorproductno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorcategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtystd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderMin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ismultipleofminimumqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderPack);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, royaltyamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductPoId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, capacity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimeActual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costperorder);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceeffective);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String mManufacturerId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM M_Product_PO" +
      "        WHERE M_Product_PO.M_Product_PO_ID = ? " +
      "                 AND M_Product_PO.M_Manufacturer_ID = ? " +
      "        AND M_Product_PO.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product_PO.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String mManufacturerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM M_Product_PO" +
      "        WHERE M_Product_PO.M_Product_PO_ID = ? " +
      "                 AND M_Product_PO.M_Manufacturer_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);

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
      "          FROM M_Product_PO" +
      "         WHERE M_Product_PO.M_Product_PO_ID = ? ";

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
      "          FROM M_Product_PO" +
      "         WHERE M_Product_PO.M_Product_PO_ID = ? ";

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
