//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.VendorProductExport;

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
class VendorProductsData implements FieldProvider {
static Logger log4j = Logger.getLogger(VendorProductsData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String value;
  public String name;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String qualityrating;
  public String iscurrentvendor;
  public String upc;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String cUomId;
  public String cUomIdr;
  public String pricelist;
  public String pricepo;
  public String deliverytimePromised;
  public String vendorproductno;
  public String vendorcategory;
  public String mManufacturerId;
  public String mManufacturerIdr;
  public String manufacturernumber;
  public String discontinued;
  public String discontinuedby;
  public String qtystd;
  public String orderMin;
  public String ismultipleofminimumqty;
  public String adOrgId;
  public String iProductPoVId;
  public String pricelastpo;
  public String adClientId;
  public String pricelastinv;
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
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("qualityrating"))
      return qualityrating;
    else if (fieldName.equalsIgnoreCase("iscurrentvendor"))
      return iscurrentvendor;
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
    else if (fieldName.equalsIgnoreCase("deliverytime_promised") || fieldName.equals("deliverytimePromised"))
      return deliverytimePromised;
    else if (fieldName.equalsIgnoreCase("vendorproductno"))
      return vendorproductno;
    else if (fieldName.equalsIgnoreCase("vendorcategory"))
      return vendorcategory;
    else if (fieldName.equalsIgnoreCase("m_manufacturer_id") || fieldName.equals("mManufacturerId"))
      return mManufacturerId;
    else if (fieldName.equalsIgnoreCase("m_manufacturer_idr") || fieldName.equals("mManufacturerIdr"))
      return mManufacturerIdr;
    else if (fieldName.equalsIgnoreCase("manufacturernumber"))
      return manufacturernumber;
    else if (fieldName.equalsIgnoreCase("discontinued"))
      return discontinued;
    else if (fieldName.equalsIgnoreCase("discontinuedby"))
      return discontinuedby;
    else if (fieldName.equalsIgnoreCase("qtystd"))
      return qtystd;
    else if (fieldName.equalsIgnoreCase("order_min") || fieldName.equals("orderMin"))
      return orderMin;
    else if (fieldName.equalsIgnoreCase("ismultipleofminimumqty"))
      return ismultipleofminimumqty;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("i_product_po_v_id") || fieldName.equals("iProductPoVId"))
      return iProductPoVId;
    else if (fieldName.equalsIgnoreCase("pricelastpo"))
      return pricelastpo;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("pricelastinv"))
      return pricelastinv;
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
  public static VendorProductsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static VendorProductsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(i_product_po_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = i_product_po_v.CreatedBy) as CreatedByR, " +
      "        to_char(i_product_po_v.Updated, ?) as updated, " +
      "        to_char(i_product_po_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        i_product_po_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = i_product_po_v.UpdatedBy) as UpdatedByR," +
      "        i_product_po_v.Value, " +
      "i_product_po_v.Name, " +
      "i_product_po_v.C_Bpartner_ID, " +
      "(CASE WHEN i_product_po_v.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "i_product_po_v.Qualityrating, " +
      "COALESCE(i_product_po_v.Iscurrentvendor, 'N') AS Iscurrentvendor, " +
      "i_product_po_v.Upc, " +
      "i_product_po_v.C_Currency_ID, " +
      "(CASE WHEN i_product_po_v.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "i_product_po_v.C_Uom_ID, " +
      "(CASE WHEN i_product_po_v.C_Uom_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_Uom_IDR, " +
      "i_product_po_v.Pricelist, " +
      "i_product_po_v.Pricepo, " +
      "i_product_po_v.Deliverytime_Promised, " +
      "i_product_po_v.Vendorproductno, " +
      "i_product_po_v.Vendorcategory, " +
      "i_product_po_v.M_Manufacturer_ID, " +
      "(CASE WHEN i_product_po_v.M_Manufacturer_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'') ) END) AS M_Manufacturer_IDR, " +
      "i_product_po_v.Manufacturernumber, " +
      "COALESCE(i_product_po_v.Discontinued, 'N') AS Discontinued, " +
      "i_product_po_v.Discontinuedby, " +
      "i_product_po_v.Qtystd, " +
      "i_product_po_v.Order_Min, " +
      "COALESCE(i_product_po_v.Ismultipleofminimumqty, 'N') AS Ismultipleofminimumqty, " +
      "i_product_po_v.AD_Org_ID, " +
      "i_product_po_v.I_Product_Po_V_ID, " +
      "i_product_po_v.Pricelastpo, " +
      "i_product_po_v.AD_Client_ID, " +
      "i_product_po_v.Pricelastinv, " +
      "COALESCE(i_product_po_v.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM i_product_po_v left join (select C_BPartner_ID, Name from C_BPartner) table1 on (i_product_po_v.C_Bpartner_ID = table1.C_BPartner_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (i_product_po_v.C_Currency_ID = table2.C_Currency_ID) left join (select C_Uom_ID, Name from C_Uom) table3 on (i_product_po_v.C_Uom_ID = table3.C_Uom_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL3 on (table3.C_UOM_ID = tableTRL3.C_UOM_ID and tableTRL3.AD_Language = ?)  left join (select M_Manufacturer_ID, Name from M_Manufacturer) table4 on (i_product_po_v.M_Manufacturer_ID = table4.M_Manufacturer_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND i_product_po_v.I_Product_Po_V_ID = ? " +
      "        AND i_product_po_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND i_product_po_v.AD_Org_ID IN (";
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
        VendorProductsData objectVendorProductsData = new VendorProductsData();
        objectVendorProductsData.created = UtilSql.getValue(result, "created");
        objectVendorProductsData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectVendorProductsData.updated = UtilSql.getValue(result, "updated");
        objectVendorProductsData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectVendorProductsData.updatedby = UtilSql.getValue(result, "updatedby");
        objectVendorProductsData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectVendorProductsData.value = UtilSql.getValue(result, "value");
        objectVendorProductsData.name = UtilSql.getValue(result, "name");
        objectVendorProductsData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectVendorProductsData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectVendorProductsData.qualityrating = UtilSql.getValue(result, "qualityrating");
        objectVendorProductsData.iscurrentvendor = UtilSql.getValue(result, "iscurrentvendor");
        objectVendorProductsData.upc = UtilSql.getValue(result, "upc");
        objectVendorProductsData.cCurrencyId = UtilSql.getValue(result, "c_currency_id");
        objectVendorProductsData.cCurrencyIdr = UtilSql.getValue(result, "c_currency_idr");
        objectVendorProductsData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectVendorProductsData.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectVendorProductsData.pricelist = UtilSql.getValue(result, "pricelist");
        objectVendorProductsData.pricepo = UtilSql.getValue(result, "pricepo");
        objectVendorProductsData.deliverytimePromised = UtilSql.getValue(result, "deliverytime_promised");
        objectVendorProductsData.vendorproductno = UtilSql.getValue(result, "vendorproductno");
        objectVendorProductsData.vendorcategory = UtilSql.getValue(result, "vendorcategory");
        objectVendorProductsData.mManufacturerId = UtilSql.getValue(result, "m_manufacturer_id");
        objectVendorProductsData.mManufacturerIdr = UtilSql.getValue(result, "m_manufacturer_idr");
        objectVendorProductsData.manufacturernumber = UtilSql.getValue(result, "manufacturernumber");
        objectVendorProductsData.discontinued = UtilSql.getValue(result, "discontinued");
        objectVendorProductsData.discontinuedby = UtilSql.getDateValue(result, "discontinuedby", "dd-MM-yyyy");
        objectVendorProductsData.qtystd = UtilSql.getValue(result, "qtystd");
        objectVendorProductsData.orderMin = UtilSql.getValue(result, "order_min");
        objectVendorProductsData.ismultipleofminimumqty = UtilSql.getValue(result, "ismultipleofminimumqty");
        objectVendorProductsData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectVendorProductsData.iProductPoVId = UtilSql.getValue(result, "i_product_po_v_id");
        objectVendorProductsData.pricelastpo = UtilSql.getValue(result, "pricelastpo");
        objectVendorProductsData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectVendorProductsData.pricelastinv = UtilSql.getValue(result, "pricelastinv");
        objectVendorProductsData.isactive = UtilSql.getValue(result, "isactive");
        objectVendorProductsData.language = UtilSql.getValue(result, "language");
        objectVendorProductsData.adUserClient = "";
        objectVendorProductsData.adOrgClient = "";
        objectVendorProductsData.createdby = "";
        objectVendorProductsData.trBgcolor = "";
        objectVendorProductsData.totalCount = "";
        objectVendorProductsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectVendorProductsData);
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
    VendorProductsData objectVendorProductsData[] = new VendorProductsData[vector.size()];
    vector.copyInto(objectVendorProductsData);
    return(objectVendorProductsData);
  }

/**
Create a registry
 */
  public static VendorProductsData[] set(String upc, String cBpartnerId, String cBpartnerIdr, String mManufacturerId, String pricelastinv, String adOrgId, String qtystd, String vendorcategory, String discontinuedby, String orderMin, String name, String adClientId, String discontinued, String deliverytimePromised, String qualityrating, String value, String ismultipleofminimumqty, String createdby, String createdbyr, String iProductPoVId, String updatedby, String updatedbyr, String pricelastpo, String manufacturernumber, String cUomId, String isactive, String cCurrencyId, String pricepo, String vendorproductno, String iscurrentvendor, String pricelist)    throws ServletException {
    VendorProductsData objectVendorProductsData[] = new VendorProductsData[1];
    objectVendorProductsData[0] = new VendorProductsData();
    objectVendorProductsData[0].created = "";
    objectVendorProductsData[0].createdbyr = createdbyr;
    objectVendorProductsData[0].updated = "";
    objectVendorProductsData[0].updatedTimeStamp = "";
    objectVendorProductsData[0].updatedby = updatedby;
    objectVendorProductsData[0].updatedbyr = updatedbyr;
    objectVendorProductsData[0].value = value;
    objectVendorProductsData[0].name = name;
    objectVendorProductsData[0].cBpartnerId = cBpartnerId;
    objectVendorProductsData[0].cBpartnerIdr = cBpartnerIdr;
    objectVendorProductsData[0].qualityrating = qualityrating;
    objectVendorProductsData[0].iscurrentvendor = iscurrentvendor;
    objectVendorProductsData[0].upc = upc;
    objectVendorProductsData[0].cCurrencyId = cCurrencyId;
    objectVendorProductsData[0].cCurrencyIdr = "";
    objectVendorProductsData[0].cUomId = cUomId;
    objectVendorProductsData[0].cUomIdr = "";
    objectVendorProductsData[0].pricelist = pricelist;
    objectVendorProductsData[0].pricepo = pricepo;
    objectVendorProductsData[0].deliverytimePromised = deliverytimePromised;
    objectVendorProductsData[0].vendorproductno = vendorproductno;
    objectVendorProductsData[0].vendorcategory = vendorcategory;
    objectVendorProductsData[0].mManufacturerId = mManufacturerId;
    objectVendorProductsData[0].mManufacturerIdr = "";
    objectVendorProductsData[0].manufacturernumber = manufacturernumber;
    objectVendorProductsData[0].discontinued = discontinued;
    objectVendorProductsData[0].discontinuedby = discontinuedby;
    objectVendorProductsData[0].qtystd = qtystd;
    objectVendorProductsData[0].orderMin = orderMin;
    objectVendorProductsData[0].ismultipleofminimumqty = ismultipleofminimumqty;
    objectVendorProductsData[0].adOrgId = adOrgId;
    objectVendorProductsData[0].iProductPoVId = iProductPoVId;
    objectVendorProductsData[0].pricelastpo = pricelastpo;
    objectVendorProductsData[0].adClientId = adClientId;
    objectVendorProductsData[0].pricelastinv = pricelastinv;
    objectVendorProductsData[0].isactive = isactive;
    objectVendorProductsData[0].language = "";
    return objectVendorProductsData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef9AE86F823AC84EDBBFA7EE2F12FDCBAD_0(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as C_Bpartner_ID FROM C_BPartner table1 WHERE table1.isActive='Y' AND table1.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Bpartner_IDR);

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
  public static String selectDefE38DE16FBB1E4EBFA590FF8E366F3E04_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefC08F4C1B28214F76B787B93595973300_2(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE i_product_po_v" +
      "        SET Value = (?) , Name = (?) , C_Bpartner_ID = (?) , Qualityrating = TO_NUMBER(?) , Iscurrentvendor = (?) , Upc = (?) , C_Currency_ID = (?) , C_Uom_ID = (?) , Pricelist = TO_NUMBER(?) , Pricepo = TO_NUMBER(?) , Deliverytime_Promised = TO_NUMBER(?) , Vendorproductno = (?) , Vendorcategory = (?) , M_Manufacturer_ID = (?) , Manufacturernumber = (?) , Discontinued = (?) , Discontinuedby = TO_DATE(?) , Qtystd = TO_NUMBER(?) , Order_Min = TO_NUMBER(?) , Ismultipleofminimumqty = (?) , AD_Org_ID = (?) , I_Product_Po_V_ID = (?) , Pricelastpo = TO_NUMBER(?) , AD_Client_ID = (?) , Pricelastinv = TO_NUMBER(?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE i_product_po_v.I_Product_Po_V_ID = ? " +
      "        AND i_product_po_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND i_product_po_v.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qualityrating);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscurrentvendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricepo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimePromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorproductno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorcategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturernumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtystd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderMin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ismultipleofminimumqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iProductPoVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelastpo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelastinv);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iProductPoVId);
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
      "        INSERT INTO i_product_po_v " +
      "        (Value, Name, C_Bpartner_ID, Qualityrating, Iscurrentvendor, Upc, C_Currency_ID, C_Uom_ID, Pricelist, Pricepo, Deliverytime_Promised, Vendorproductno, Vendorcategory, M_Manufacturer_ID, Manufacturernumber, Discontinued, Discontinuedby, Qtystd, Order_Min, Ismultipleofminimumqty, AD_Org_ID, I_Product_Po_V_ID, Pricelastpo, AD_Client_ID, Pricelastinv, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), TO_DATE(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qualityrating);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscurrentvendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricepo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, deliverytimePromised);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorproductno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorcategory);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturernumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtystd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderMin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ismultipleofminimumqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iProductPoVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelastpo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelastinv);
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
      "        DELETE FROM i_product_po_v" +
      "        WHERE i_product_po_v.I_Product_Po_V_ID = ? " +
      "        AND i_product_po_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND i_product_po_v.AD_Org_ID IN (";
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
      "        DELETE FROM i_product_po_v" +
      "        WHERE i_product_po_v.I_Product_Po_V_ID = ? ";

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
      "          FROM i_product_po_v" +
      "         WHERE i_product_po_v.I_Product_Po_V_ID = ? ";

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
      "          FROM i_product_po_v" +
      "         WHERE i_product_po_v.I_Product_Po_V_ID = ? ";

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
