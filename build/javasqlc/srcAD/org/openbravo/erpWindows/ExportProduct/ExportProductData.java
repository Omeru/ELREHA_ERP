//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.ExportProduct;

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
class ExportProductData implements FieldProvider {
static Logger log4j = Logger.getLogger(ExportProductData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String imageurl;
  public String value;
  public String upc;
  public String name;
  public String descriptionurl;
  public String description;
  public String documentnote;
  public String mProductCategoryId;
  public String mProductCategoryIdr;
  public String typeofproduct;
  public String cUomId;
  public String cUomIdr;
  public String producttype;
  public String isstocked;
  public String mLocatorId;
  public String mLocatorIdr;
  public String isserialtracking;
  public String isbatchtracking;
  public String weight;
  public String volume;
  public String shelfwidth;
  public String shelfheight;
  public String shelfdepth;
  public String unitsperpallet;
  public String isconsumable;
  public String issparepart;
  public String issetitem;
  public String isfreightproduct;
  public String production;
  public String isbom;
  public String ispurchased;
  public String manufacturer;
  public String manufacturernumber;
  public String cusomstarifno;
  public String cCountryId;
  public String cCountryIdr;
  public String calculated;
  public String issold;
  public String cTaxId;
  public String cTaxIdr;
  public String basepriceunit;
  public String basepricemultiplicator;
  public String discontinued;
  public String discontinuedby;
  public String isactive;
  public String isserviceitem;
  public String iProductVId;
  public String mAttributesetId;
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
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("imageurl"))
      return imageurl;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("upc"))
      return upc;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("descriptionurl"))
      return descriptionurl;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("documentnote"))
      return documentnote;
    else if (fieldName.equalsIgnoreCase("m_product_category_id") || fieldName.equals("mProductCategoryId"))
      return mProductCategoryId;
    else if (fieldName.equalsIgnoreCase("m_product_category_idr") || fieldName.equals("mProductCategoryIdr"))
      return mProductCategoryIdr;
    else if (fieldName.equalsIgnoreCase("typeofproduct"))
      return typeofproduct;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("producttype"))
      return producttype;
    else if (fieldName.equalsIgnoreCase("isstocked"))
      return isstocked;
    else if (fieldName.equalsIgnoreCase("m_locator_id") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("m_locator_idr") || fieldName.equals("mLocatorIdr"))
      return mLocatorIdr;
    else if (fieldName.equalsIgnoreCase("isserialtracking"))
      return isserialtracking;
    else if (fieldName.equalsIgnoreCase("isbatchtracking"))
      return isbatchtracking;
    else if (fieldName.equalsIgnoreCase("weight"))
      return weight;
    else if (fieldName.equalsIgnoreCase("volume"))
      return volume;
    else if (fieldName.equalsIgnoreCase("shelfwidth"))
      return shelfwidth;
    else if (fieldName.equalsIgnoreCase("shelfheight"))
      return shelfheight;
    else if (fieldName.equalsIgnoreCase("shelfdepth"))
      return shelfdepth;
    else if (fieldName.equalsIgnoreCase("unitsperpallet"))
      return unitsperpallet;
    else if (fieldName.equalsIgnoreCase("isconsumable"))
      return isconsumable;
    else if (fieldName.equalsIgnoreCase("issparepart"))
      return issparepart;
    else if (fieldName.equalsIgnoreCase("issetitem"))
      return issetitem;
    else if (fieldName.equalsIgnoreCase("isfreightproduct"))
      return isfreightproduct;
    else if (fieldName.equalsIgnoreCase("production"))
      return production;
    else if (fieldName.equalsIgnoreCase("isbom"))
      return isbom;
    else if (fieldName.equalsIgnoreCase("ispurchased"))
      return ispurchased;
    else if (fieldName.equalsIgnoreCase("manufacturer"))
      return manufacturer;
    else if (fieldName.equalsIgnoreCase("manufacturernumber"))
      return manufacturernumber;
    else if (fieldName.equalsIgnoreCase("cusomstarifno"))
      return cusomstarifno;
    else if (fieldName.equalsIgnoreCase("c_country_id") || fieldName.equals("cCountryId"))
      return cCountryId;
    else if (fieldName.equalsIgnoreCase("c_country_idr") || fieldName.equals("cCountryIdr"))
      return cCountryIdr;
    else if (fieldName.equalsIgnoreCase("calculated"))
      return calculated;
    else if (fieldName.equalsIgnoreCase("issold"))
      return issold;
    else if (fieldName.equalsIgnoreCase("c_tax_id") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("c_tax_idr") || fieldName.equals("cTaxIdr"))
      return cTaxIdr;
    else if (fieldName.equalsIgnoreCase("basepriceunit"))
      return basepriceunit;
    else if (fieldName.equalsIgnoreCase("basepricemultiplicator"))
      return basepricemultiplicator;
    else if (fieldName.equalsIgnoreCase("discontinued"))
      return discontinued;
    else if (fieldName.equalsIgnoreCase("discontinuedby"))
      return discontinuedby;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("isserviceitem"))
      return isserviceitem;
    else if (fieldName.equalsIgnoreCase("i_product_v_id") || fieldName.equals("iProductVId"))
      return iProductVId;
    else if (fieldName.equalsIgnoreCase("m_attributeset_id") || fieldName.equals("mAttributesetId"))
      return mAttributesetId;
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
  public static ExportProductData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ExportProductData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(i_product_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = i_product_v.CreatedBy) as CreatedByR, " +
      "        to_char(i_product_v.Updated, ?) as updated, " +
      "        to_char(i_product_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        i_product_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = i_product_v.UpdatedBy) as UpdatedByR," +
      "        i_product_v.AD_Org_ID, " +
      "(CASE WHEN i_product_v.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "i_product_v.Imageurl, " +
      "i_product_v.Value, " +
      "i_product_v.Upc, " +
      "i_product_v.Name, " +
      "i_product_v.Descriptionurl, " +
      "i_product_v.Description, " +
      "i_product_v.Documentnote, " +
      "i_product_v.M_Product_Category_ID, " +
      "(CASE WHEN i_product_v.M_Product_Category_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS M_Product_Category_IDR, " +
      "i_product_v.Typeofproduct, " +
      "i_product_v.C_Uom_ID, " +
      "(CASE WHEN i_product_v.C_Uom_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_Uom_IDR, " +
      "i_product_v.Producttype, " +
      "COALESCE(i_product_v.Isstocked, 'N') AS Isstocked, " +
      "i_product_v.M_Locator_ID, " +
      "(CASE WHEN i_product_v.M_Locator_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Value), ''))),'') ) END) AS M_Locator_IDR, " +
      "COALESCE(i_product_v.Isserialtracking, 'N') AS Isserialtracking, " +
      "COALESCE(i_product_v.Isbatchtracking, 'N') AS Isbatchtracking, " +
      "i_product_v.Weight, " +
      "i_product_v.Volume, " +
      "i_product_v.Shelfwidth, " +
      "i_product_v.Shelfheight, " +
      "i_product_v.Shelfdepth, " +
      "i_product_v.Unitsperpallet, " +
      "COALESCE(i_product_v.Isconsumable, 'N') AS Isconsumable, " +
      "COALESCE(i_product_v.Issparepart, 'N') AS Issparepart, " +
      "COALESCE(i_product_v.Issetitem, 'N') AS Issetitem, " +
      "COALESCE(i_product_v.Isfreightproduct, 'N') AS Isfreightproduct, " +
      "COALESCE(i_product_v.Production, 'N') AS Production, " +
      "COALESCE(i_product_v.Isbom, 'N') AS Isbom, " +
      "COALESCE(i_product_v.Ispurchased, 'N') AS Ispurchased, " +
      "i_product_v.Manufacturer, " +
      "i_product_v.Manufacturernumber, " +
      "i_product_v.Cusomstarifno, " +
      "i_product_v.C_Country_ID, " +
      "(CASE WHEN i_product_v.C_Country_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'') ) END) AS C_Country_IDR, " +
      "COALESCE(i_product_v.Calculated, 'N') AS Calculated, " +
      "COALESCE(i_product_v.Issold, 'N') AS Issold, " +
      "i_product_v.C_Tax_ID, " +
      "(CASE WHEN i_product_v.C_Tax_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "i_product_v.Basepriceunit, " +
      "i_product_v.Basepricemultiplicator, " +
      "COALESCE(i_product_v.Discontinued, 'N') AS Discontinued, " +
      "i_product_v.Discontinuedby, " +
      "COALESCE(i_product_v.Isactive, 'N') AS Isactive, " +
      "COALESCE(i_product_v.Isserviceitem, 'N') AS Isserviceitem, " +
      "i_product_v.I_Product_V_ID, " +
      "i_product_v.M_Attributeset_ID, " +
      "i_product_v.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM i_product_v left join (select AD_Org_ID, Name from AD_Org) table1 on (i_product_v.AD_Org_ID = table1.AD_Org_ID) left join (select M_Product_Category_ID, Name from M_Product_Category) table2 on (i_product_v.M_Product_Category_ID = table2.M_Product_Category_ID) left join (select C_Uom_ID, Name from C_Uom) table3 on (i_product_v.C_Uom_ID = table3.C_Uom_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL3 on (table3.C_UOM_ID = tableTRL3.C_UOM_ID and tableTRL3.AD_Language = ?)  left join (select M_Locator_ID, Value from M_Locator) table4 on (i_product_v.M_Locator_ID = table4.M_Locator_ID) left join (select C_Country_ID, Name from C_Country) table5 on (i_product_v.C_Country_ID = table5.C_Country_ID) left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL5 on (table5.C_Country_ID = tableTRL5.C_Country_ID and tableTRL5.AD_Language = ?)  left join (select C_Tax_ID, Name from C_Tax) table6 on (i_product_v.C_Tax_ID = table6.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL6 on (table6.C_Tax_ID = tableTRL6.C_Tax_ID and tableTRL6.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND i_product_v.I_Product_V_ID = ? " +
      "        AND i_product_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND i_product_v.AD_Org_ID IN (";
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
        ExportProductData objectExportProductData = new ExportProductData();
        objectExportProductData.created = UtilSql.getValue(result, "created");
        objectExportProductData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectExportProductData.updated = UtilSql.getValue(result, "updated");
        objectExportProductData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectExportProductData.updatedby = UtilSql.getValue(result, "updatedby");
        objectExportProductData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectExportProductData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectExportProductData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectExportProductData.imageurl = UtilSql.getValue(result, "imageurl");
        objectExportProductData.value = UtilSql.getValue(result, "value");
        objectExportProductData.upc = UtilSql.getValue(result, "upc");
        objectExportProductData.name = UtilSql.getValue(result, "name");
        objectExportProductData.descriptionurl = UtilSql.getValue(result, "descriptionurl");
        objectExportProductData.description = UtilSql.getValue(result, "description");
        objectExportProductData.documentnote = UtilSql.getValue(result, "documentnote");
        objectExportProductData.mProductCategoryId = UtilSql.getValue(result, "m_product_category_id");
        objectExportProductData.mProductCategoryIdr = UtilSql.getValue(result, "m_product_category_idr");
        objectExportProductData.typeofproduct = UtilSql.getValue(result, "typeofproduct");
        objectExportProductData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectExportProductData.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectExportProductData.producttype = UtilSql.getValue(result, "producttype");
        objectExportProductData.isstocked = UtilSql.getValue(result, "isstocked");
        objectExportProductData.mLocatorId = UtilSql.getValue(result, "m_locator_id");
        objectExportProductData.mLocatorIdr = UtilSql.getValue(result, "m_locator_idr");
        objectExportProductData.isserialtracking = UtilSql.getValue(result, "isserialtracking");
        objectExportProductData.isbatchtracking = UtilSql.getValue(result, "isbatchtracking");
        objectExportProductData.weight = UtilSql.getValue(result, "weight");
        objectExportProductData.volume = UtilSql.getValue(result, "volume");
        objectExportProductData.shelfwidth = UtilSql.getValue(result, "shelfwidth");
        objectExportProductData.shelfheight = UtilSql.getValue(result, "shelfheight");
        objectExportProductData.shelfdepth = UtilSql.getValue(result, "shelfdepth");
        objectExportProductData.unitsperpallet = UtilSql.getValue(result, "unitsperpallet");
        objectExportProductData.isconsumable = UtilSql.getValue(result, "isconsumable");
        objectExportProductData.issparepart = UtilSql.getValue(result, "issparepart");
        objectExportProductData.issetitem = UtilSql.getValue(result, "issetitem");
        objectExportProductData.isfreightproduct = UtilSql.getValue(result, "isfreightproduct");
        objectExportProductData.production = UtilSql.getValue(result, "production");
        objectExportProductData.isbom = UtilSql.getValue(result, "isbom");
        objectExportProductData.ispurchased = UtilSql.getValue(result, "ispurchased");
        objectExportProductData.manufacturer = UtilSql.getValue(result, "manufacturer");
        objectExportProductData.manufacturernumber = UtilSql.getValue(result, "manufacturernumber");
        objectExportProductData.cusomstarifno = UtilSql.getValue(result, "cusomstarifno");
        objectExportProductData.cCountryId = UtilSql.getValue(result, "c_country_id");
        objectExportProductData.cCountryIdr = UtilSql.getValue(result, "c_country_idr");
        objectExportProductData.calculated = UtilSql.getValue(result, "calculated");
        objectExportProductData.issold = UtilSql.getValue(result, "issold");
        objectExportProductData.cTaxId = UtilSql.getValue(result, "c_tax_id");
        objectExportProductData.cTaxIdr = UtilSql.getValue(result, "c_tax_idr");
        objectExportProductData.basepriceunit = UtilSql.getValue(result, "basepriceunit");
        objectExportProductData.basepricemultiplicator = UtilSql.getValue(result, "basepricemultiplicator");
        objectExportProductData.discontinued = UtilSql.getValue(result, "discontinued");
        objectExportProductData.discontinuedby = UtilSql.getDateValue(result, "discontinuedby", "dd-MM-yyyy");
        objectExportProductData.isactive = UtilSql.getValue(result, "isactive");
        objectExportProductData.isserviceitem = UtilSql.getValue(result, "isserviceitem");
        objectExportProductData.iProductVId = UtilSql.getValue(result, "i_product_v_id");
        objectExportProductData.mAttributesetId = UtilSql.getValue(result, "m_attributeset_id");
        objectExportProductData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectExportProductData.language = UtilSql.getValue(result, "language");
        objectExportProductData.adUserClient = "";
        objectExportProductData.adOrgClient = "";
        objectExportProductData.createdby = "";
        objectExportProductData.trBgcolor = "";
        objectExportProductData.totalCount = "";
        objectExportProductData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectExportProductData);
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
    ExportProductData objectExportProductData[] = new ExportProductData[vector.size()];
    vector.copyInto(objectExportProductData);
    return(objectExportProductData);
  }

/**
Create a registry
 */
  public static ExportProductData[] set(String shelfwidth, String shelfheight, String basepriceunit, String imageurl, String adClientId, String cusomstarifno, String basepricemultiplicator, String unitsperpallet, String production, String value, String isserviceitem, String descriptionurl, String issparepart, String mAttributesetId, String producttype, String issold, String isserialtracking, String name, String mProductCategoryId, String manufacturer, String isstocked, String weight, String upc, String cUomId, String updatedby, String updatedbyr, String iProductVId, String manufacturernumber, String isconsumable, String volume, String isbatchtracking, String ispurchased, String isactive, String documentnote, String description, String isbom, String discontinued, String calculated, String createdby, String createdbyr, String isfreightproduct, String typeofproduct, String cCountryId, String adOrgId, String mLocatorId, String mLocatorIdr, String discontinuedby, String issetitem, String shelfdepth, String cTaxId)    throws ServletException {
    ExportProductData objectExportProductData[] = new ExportProductData[1];
    objectExportProductData[0] = new ExportProductData();
    objectExportProductData[0].created = "";
    objectExportProductData[0].createdbyr = createdbyr;
    objectExportProductData[0].updated = "";
    objectExportProductData[0].updatedTimeStamp = "";
    objectExportProductData[0].updatedby = updatedby;
    objectExportProductData[0].updatedbyr = updatedbyr;
    objectExportProductData[0].adOrgId = adOrgId;
    objectExportProductData[0].adOrgIdr = "";
    objectExportProductData[0].imageurl = imageurl;
    objectExportProductData[0].value = value;
    objectExportProductData[0].upc = upc;
    objectExportProductData[0].name = name;
    objectExportProductData[0].descriptionurl = descriptionurl;
    objectExportProductData[0].description = description;
    objectExportProductData[0].documentnote = documentnote;
    objectExportProductData[0].mProductCategoryId = mProductCategoryId;
    objectExportProductData[0].mProductCategoryIdr = "";
    objectExportProductData[0].typeofproduct = typeofproduct;
    objectExportProductData[0].cUomId = cUomId;
    objectExportProductData[0].cUomIdr = "";
    objectExportProductData[0].producttype = producttype;
    objectExportProductData[0].isstocked = isstocked;
    objectExportProductData[0].mLocatorId = mLocatorId;
    objectExportProductData[0].mLocatorIdr = mLocatorIdr;
    objectExportProductData[0].isserialtracking = isserialtracking;
    objectExportProductData[0].isbatchtracking = isbatchtracking;
    objectExportProductData[0].weight = weight;
    objectExportProductData[0].volume = volume;
    objectExportProductData[0].shelfwidth = shelfwidth;
    objectExportProductData[0].shelfheight = shelfheight;
    objectExportProductData[0].shelfdepth = shelfdepth;
    objectExportProductData[0].unitsperpallet = unitsperpallet;
    objectExportProductData[0].isconsumable = isconsumable;
    objectExportProductData[0].issparepart = issparepart;
    objectExportProductData[0].issetitem = issetitem;
    objectExportProductData[0].isfreightproduct = isfreightproduct;
    objectExportProductData[0].production = production;
    objectExportProductData[0].isbom = isbom;
    objectExportProductData[0].ispurchased = ispurchased;
    objectExportProductData[0].manufacturer = manufacturer;
    objectExportProductData[0].manufacturernumber = manufacturernumber;
    objectExportProductData[0].cusomstarifno = cusomstarifno;
    objectExportProductData[0].cCountryId = cCountryId;
    objectExportProductData[0].cCountryIdr = "";
    objectExportProductData[0].calculated = calculated;
    objectExportProductData[0].issold = issold;
    objectExportProductData[0].cTaxId = cTaxId;
    objectExportProductData[0].cTaxIdr = "";
    objectExportProductData[0].basepriceunit = basepriceunit;
    objectExportProductData[0].basepricemultiplicator = basepricemultiplicator;
    objectExportProductData[0].discontinued = discontinued;
    objectExportProductData[0].discontinuedby = discontinuedby;
    objectExportProductData[0].isactive = isactive;
    objectExportProductData[0].isserviceitem = isserviceitem;
    objectExportProductData[0].iProductVId = iProductVId;
    objectExportProductData[0].mAttributesetId = mAttributesetId;
    objectExportProductData[0].adClientId = adClientId;
    objectExportProductData[0].language = "";
    return objectExportProductData;
  }

/**
Select for auxiliar field
 */
  public static String selectDefBEB394B329AE4BD5995E2D326917BCDD_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef5820980F26054DD9A4F5A9CB4BCA965B_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef429B1A2DEEFE4A1E9228C16E951CEDCA_2(ConnectionProvider connectionProvider, String M_Locator_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Value), '') ) as M_Locator_ID FROM M_Locator table1 WHERE table1.isActive='Y' AND table1.M_Locator_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Locator_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_locator_id");
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
      "        UPDATE i_product_v" +
      "        SET AD_Org_ID = (?) , Imageurl = (?) , Value = (?) , Upc = (?) , Name = (?) , Descriptionurl = (?) , Description = (?) , Documentnote = (?) , M_Product_Category_ID = (?) , Typeofproduct = (?) , C_Uom_ID = (?) , Producttype = (?) , Isstocked = (?) , M_Locator_ID = (?) , Isserialtracking = (?) , Isbatchtracking = (?) , Weight = TO_NUMBER(?) , Volume = TO_NUMBER(?) , Shelfwidth = TO_NUMBER(?) , Shelfheight = TO_NUMBER(?) , Shelfdepth = TO_NUMBER(?) , Unitsperpallet = TO_NUMBER(?) , Isconsumable = (?) , Issparepart = (?) , Issetitem = (?) , Isfreightproduct = (?) , Production = (?) , Isbom = (?) , Ispurchased = (?) , Manufacturer = (?) , Manufacturernumber = (?) , Cusomstarifno = (?) , C_Country_ID = (?) , Calculated = (?) , Issold = (?) , C_Tax_ID = (?) , Basepriceunit = (?) , Basepricemultiplicator = TO_NUMBER(?) , Discontinued = (?) , Discontinuedby = TO_DATE(?) , Isactive = (?) , Isserviceitem = (?) , I_Product_V_ID = (?) , M_Attributeset_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE i_product_v.I_Product_V_ID = ? " +
      "        AND i_product_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND i_product_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, imageurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, descriptionurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentnote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, typeofproduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, producttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isserialtracking);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbatchtracking);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, volume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfwidth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfheight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfdepth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unitsperpallet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isconsumable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issparepart);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issetitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfreightproduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, production);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturernumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cusomstarifno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCountryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issold);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basepriceunit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basepricemultiplicator);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isserviceitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iProductVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iProductVId);
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
      "        INSERT INTO i_product_v " +
      "        (AD_Org_ID, Imageurl, Value, Upc, Name, Descriptionurl, Description, Documentnote, M_Product_Category_ID, Typeofproduct, C_Uom_ID, Producttype, Isstocked, M_Locator_ID, Isserialtracking, Isbatchtracking, Weight, Volume, Shelfwidth, Shelfheight, Shelfdepth, Unitsperpallet, Isconsumable, Issparepart, Issetitem, Isfreightproduct, Production, Isbom, Ispurchased, Manufacturer, Manufacturernumber, Cusomstarifno, C_Country_ID, Calculated, Issold, C_Tax_ID, Basepriceunit, Basepricemultiplicator, Discontinued, Discontinuedby, Isactive, Isserviceitem, I_Product_V_ID, M_Attributeset_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_DATE(?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, imageurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, upc);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, descriptionurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentnote);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, typeofproduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, producttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isserialtracking);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbatchtracking);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, volume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfwidth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfheight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfdepth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unitsperpallet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isconsumable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issparepart);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issetitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfreightproduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, production);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturernumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cusomstarifno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCountryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issold);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basepriceunit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, basepricemultiplicator);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isserviceitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iProductVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM i_product_v" +
      "        WHERE i_product_v.I_Product_V_ID = ? " +
      "        AND i_product_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND i_product_v.AD_Org_ID IN (";
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
      "        DELETE FROM i_product_v" +
      "        WHERE i_product_v.I_Product_V_ID = ? ";

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
      "          FROM i_product_v" +
      "         WHERE i_product_v.I_Product_V_ID = ? ";

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
      "          FROM i_product_v" +
      "         WHERE i_product_v.I_Product_V_ID = ? ";

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
