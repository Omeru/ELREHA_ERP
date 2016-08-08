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
class ProductF6A25D6EA3384B0C85679865687E51D4Data implements FieldProvider {
static Logger log4j = Logger.getLogger(ProductF6A25D6EA3384B0C85679865687E51D4Data.class);
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
  public String adImageId;
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
  public String typeofproductr;
  public String cUomId;
  public String cUomIdr;
  public String mAttributesetId;
  public String mAttributesetIdr;
  public String producttype;
  public String producttyper;
  public String isstocked;
  public String mLocatorId;
  public String mLocatorIdr;
  public String issold;
  public String cTaxId;
  public String cTaxIdr;
  public String customerproductno;
  public String customerproducttext;
  public String discontinued;
  public String discontinuedby;
  public String isserialtracking;
  public String isbatchtracking;
  public String weight;
  public String volume;
  public String shelfwidth;
  public String shelfheight;
  public String shelfdepth;
  public String unitsperpallet;
  public String cutoff;
  public String isconsumable;
  public String issparepart;
  public String issetitem;
  public String isfreightproduct;
  public String production;
  public String isbom;
  public String isverified;
  public String buttoncopyitem;
  public String setready4production;
  public String isactive;
  public String issummary;
  public String manufacturer;
  public String versionno;
  public String cBpartnerId;
  public String qtymin;
  public String issummaryitem;
  public String theme;
  public String manufacturernumber;
  public String mrpPlanningmethodId;
  public String colorcount;
  public String stockMin;
  public String sku;
  public String text;
  public String length;
  public String ispriceprinted;
  public String stockmin;
  public String coststd;
  public String sResourceId;
  public String width;
  public String capacity;
  public String qtymax;
  public String maProcessplanId;
  public String mFreightcategoryId;
  public String isinvoiceprintdetails;
  public String qtytype;
  public String name2;
  public String calculated;
  public String guaranteedays;
  public String ispurchased;
  public String processing;
  public String mAttributesetinstanceId;
  public String delaymin;
  public String salesrepId;
  public String enforceAttribute;
  public String sExpensetypeId;
  public String ispicklistprintdetails;
  public String corediameter;
  public String help;
  public String downloadurl;
  public String palettetype;
  public String classification;
  public String buttonprintbom;
  public String isserviceitem;
  public String vendorproductno;
  public String costtype;
  public String qtystd;
  public String mProductId;
  public String mrpPlannerId;
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
    else if (fieldName.equalsIgnoreCase("ad_image_id") || fieldName.equals("adImageId"))
      return adImageId;
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
    else if (fieldName.equalsIgnoreCase("typeofproductr"))
      return typeofproductr;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("m_attributeset_id") || fieldName.equals("mAttributesetId"))
      return mAttributesetId;
    else if (fieldName.equalsIgnoreCase("m_attributeset_idr") || fieldName.equals("mAttributesetIdr"))
      return mAttributesetIdr;
    else if (fieldName.equalsIgnoreCase("producttype"))
      return producttype;
    else if (fieldName.equalsIgnoreCase("producttyper"))
      return producttyper;
    else if (fieldName.equalsIgnoreCase("isstocked"))
      return isstocked;
    else if (fieldName.equalsIgnoreCase("m_locator_id") || fieldName.equals("mLocatorId"))
      return mLocatorId;
    else if (fieldName.equalsIgnoreCase("m_locator_idr") || fieldName.equals("mLocatorIdr"))
      return mLocatorIdr;
    else if (fieldName.equalsIgnoreCase("issold"))
      return issold;
    else if (fieldName.equalsIgnoreCase("c_tax_id") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("c_tax_idr") || fieldName.equals("cTaxIdr"))
      return cTaxIdr;
    else if (fieldName.equalsIgnoreCase("customerproductno"))
      return customerproductno;
    else if (fieldName.equalsIgnoreCase("customerproducttext"))
      return customerproducttext;
    else if (fieldName.equalsIgnoreCase("discontinued"))
      return discontinued;
    else if (fieldName.equalsIgnoreCase("discontinuedby"))
      return discontinuedby;
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
    else if (fieldName.equalsIgnoreCase("cutoff"))
      return cutoff;
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
    else if (fieldName.equalsIgnoreCase("isverified"))
      return isverified;
    else if (fieldName.equalsIgnoreCase("buttoncopyitem"))
      return buttoncopyitem;
    else if (fieldName.equalsIgnoreCase("setready4production"))
      return setready4production;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("issummary"))
      return issummary;
    else if (fieldName.equalsIgnoreCase("manufacturer"))
      return manufacturer;
    else if (fieldName.equalsIgnoreCase("versionno"))
      return versionno;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("qtymin"))
      return qtymin;
    else if (fieldName.equalsIgnoreCase("issummaryitem"))
      return issummaryitem;
    else if (fieldName.equalsIgnoreCase("theme"))
      return theme;
    else if (fieldName.equalsIgnoreCase("manufacturernumber"))
      return manufacturernumber;
    else if (fieldName.equalsIgnoreCase("mrp_planningmethod_id") || fieldName.equals("mrpPlanningmethodId"))
      return mrpPlanningmethodId;
    else if (fieldName.equalsIgnoreCase("colorcount"))
      return colorcount;
    else if (fieldName.equalsIgnoreCase("stock_min") || fieldName.equals("stockMin"))
      return stockMin;
    else if (fieldName.equalsIgnoreCase("sku"))
      return sku;
    else if (fieldName.equalsIgnoreCase("text"))
      return text;
    else if (fieldName.equalsIgnoreCase("length"))
      return length;
    else if (fieldName.equalsIgnoreCase("ispriceprinted"))
      return ispriceprinted;
    else if (fieldName.equalsIgnoreCase("stockmin"))
      return stockmin;
    else if (fieldName.equalsIgnoreCase("coststd"))
      return coststd;
    else if (fieldName.equalsIgnoreCase("s_resource_id") || fieldName.equals("sResourceId"))
      return sResourceId;
    else if (fieldName.equalsIgnoreCase("width"))
      return width;
    else if (fieldName.equalsIgnoreCase("capacity"))
      return capacity;
    else if (fieldName.equalsIgnoreCase("qtymax"))
      return qtymax;
    else if (fieldName.equalsIgnoreCase("ma_processplan_id") || fieldName.equals("maProcessplanId"))
      return maProcessplanId;
    else if (fieldName.equalsIgnoreCase("m_freightcategory_id") || fieldName.equals("mFreightcategoryId"))
      return mFreightcategoryId;
    else if (fieldName.equalsIgnoreCase("isinvoiceprintdetails"))
      return isinvoiceprintdetails;
    else if (fieldName.equalsIgnoreCase("qtytype"))
      return qtytype;
    else if (fieldName.equalsIgnoreCase("name2"))
      return name2;
    else if (fieldName.equalsIgnoreCase("calculated"))
      return calculated;
    else if (fieldName.equalsIgnoreCase("guaranteedays"))
      return guaranteedays;
    else if (fieldName.equalsIgnoreCase("ispurchased"))
      return ispurchased;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("m_attributesetinstance_id") || fieldName.equals("mAttributesetinstanceId"))
      return mAttributesetinstanceId;
    else if (fieldName.equalsIgnoreCase("delaymin"))
      return delaymin;
    else if (fieldName.equalsIgnoreCase("salesrep_id") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("enforce_attribute") || fieldName.equals("enforceAttribute"))
      return enforceAttribute;
    else if (fieldName.equalsIgnoreCase("s_expensetype_id") || fieldName.equals("sExpensetypeId"))
      return sExpensetypeId;
    else if (fieldName.equalsIgnoreCase("ispicklistprintdetails"))
      return ispicklistprintdetails;
    else if (fieldName.equalsIgnoreCase("corediameter"))
      return corediameter;
    else if (fieldName.equalsIgnoreCase("help"))
      return help;
    else if (fieldName.equalsIgnoreCase("downloadurl"))
      return downloadurl;
    else if (fieldName.equalsIgnoreCase("palettetype"))
      return palettetype;
    else if (fieldName.equalsIgnoreCase("classification"))
      return classification;
    else if (fieldName.equalsIgnoreCase("buttonprintbom"))
      return buttonprintbom;
    else if (fieldName.equalsIgnoreCase("isserviceitem"))
      return isserviceitem;
    else if (fieldName.equalsIgnoreCase("vendorproductno"))
      return vendorproductno;
    else if (fieldName.equalsIgnoreCase("costtype"))
      return costtype;
    else if (fieldName.equalsIgnoreCase("qtystd"))
      return qtystd;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("mrp_planner_id") || fieldName.equals("mrpPlannerId"))
      return mrpPlannerId;
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
  public static ProductF6A25D6EA3384B0C85679865687E51D4Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ProductF6A25D6EA3384B0C85679865687E51D4Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Product.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product.CreatedBy) as CreatedByR, " +
      "        to_char(M_Product.Updated, ?) as updated, " +
      "        to_char(M_Product.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Product.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product.UpdatedBy) as UpdatedByR," +
      "        M_Product.AD_Client_ID, " +
      "(CASE WHEN M_Product.AD_Client_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Client_IDR, " +
      "M_Product.AD_Org_ID, " +
      "(CASE WHEN M_Product.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "M_Product.AD_Image_ID, " +
      "M_Product.ImageURL, " +
      "M_Product.Value, " +
      "M_Product.UPC, " +
      "M_Product.Name, " +
      "M_Product.DescriptionURL, " +
      "M_Product.Description, " +
      "M_Product.DocumentNote, " +
      "M_Product.M_Product_Category_ID, " +
      "(CASE WHEN M_Product.M_Product_Category_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS M_Product_Category_IDR, " +
      "M_Product.Typeofproduct, " +
      "(CASE WHEN M_Product.Typeofproduct IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS TypeofproductR, " +
      "M_Product.C_UOM_ID, " +
      "(CASE WHEN M_Product.C_UOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS C_UOM_IDR, " +
      "M_Product.M_AttributeSet_ID, " +
      "(CASE WHEN M_Product.M_AttributeSet_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Name), ''))),'') ) END) AS M_AttributeSet_IDR, " +
      "M_Product.ProductType, " +
      "(CASE WHEN M_Product.ProductType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS ProductTypeR, " +
      "COALESCE(M_Product.IsStocked, 'N') AS IsStocked, " +
      "M_Product.M_Locator_ID, " +
      "(CASE WHEN M_Product.M_Locator_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Value), ''))),'') ) END) AS M_Locator_IDR, " +
      "COALESCE(M_Product.IsSold, 'N') AS IsSold, " +
      "M_Product.C_Tax_ID, " +
      "(CASE WHEN M_Product.C_Tax_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS C_Tax_IDR, " +
      "M_Product.CustomerProductNo, " +
      "M_Product.Customerproducttext, " +
      "COALESCE(M_Product.Discontinued, 'N') AS Discontinued, " +
      "M_Product.DiscontinuedBy, " +
      "COALESCE(M_Product.IsSerialTracking, 'N') AS IsSerialTracking, " +
      "COALESCE(M_Product.Isbatchtracking, 'N') AS Isbatchtracking, " +
      "M_Product.Weight, " +
      "M_Product.Volume, " +
      "M_Product.ShelfWidth, " +
      "M_Product.ShelfHeight, " +
      "M_Product.ShelfDepth, " +
      "M_Product.UnitsPerPallet, " +
      "M_Product.Cutoff, " +
      "COALESCE(M_Product.isConsumable, 'N') AS isConsumable, " +
      "COALESCE(M_Product.isSparePart, 'N') AS isSparePart, " +
      "COALESCE(M_Product.isSetItem, 'N') AS isSetItem, " +
      "COALESCE(M_Product.isFreightProduct, 'N') AS isFreightProduct, " +
      "COALESCE(M_Product.Production, 'N') AS Production, " +
      "COALESCE(M_Product.IsBOM, 'N') AS IsBOM, " +
      "COALESCE(M_Product.isVerified, 'N') AS isVerified, " +
      "M_Product.Buttoncopyitem, " +
      "M_Product.Setready4production, " +
      "COALESCE(M_Product.IsActive, 'N') AS IsActive, " +
      "COALESCE(M_Product.IsSummary, 'N') AS IsSummary, " +
      "M_Product.Manufacturer, " +
      "M_Product.VersionNo, " +
      "M_Product.C_BPartner_ID, " +
      "M_Product.Qtymin, " +
      "COALESCE(M_Product.IsSummaryItem, 'N') AS IsSummaryItem, " +
      "M_Product.Theme, " +
      "M_Product.Manufacturernumber, " +
      "M_Product.MRP_Planningmethod_ID, " +
      "M_Product.Colorcount, " +
      "M_Product.Stock_Min, " +
      "M_Product.SKU, " +
      "M_Product.Text, " +
      "M_Product.Length, " +
      "COALESCE(M_Product.Ispriceprinted, 'N') AS Ispriceprinted, " +
      "M_Product.Stockmin, " +
      "M_Product.Coststd, " +
      "M_Product.S_Resource_ID, " +
      "M_Product.Width, " +
      "M_Product.Capacity, " +
      "M_Product.Qtymax, " +
      "M_Product.MA_Processplan_ID, " +
      "M_Product.M_FreightCategory_ID, " +
      "COALESCE(M_Product.IsInvoicePrintDetails, 'N') AS IsInvoicePrintDetails, " +
      "COALESCE(M_Product.Qtytype, 'N') AS Qtytype, " +
      "M_Product.Name2, " +
      "COALESCE(M_Product.Calculated, 'N') AS Calculated, " +
      "M_Product.GuaranteeDays, " +
      "COALESCE(M_Product.IsPurchased, 'N') AS IsPurchased, " +
      "M_Product.Processing, " +
      "M_Product.M_AttributeSetInstance_ID, " +
      "M_Product.Delaymin, " +
      "M_Product.SalesRep_ID, " +
      "COALESCE(M_Product.Enforce_Attribute, 'N') AS Enforce_Attribute, " +
      "M_Product.S_ExpenseType_ID, " +
      "COALESCE(M_Product.IsPickListPrintDetails, 'N') AS IsPickListPrintDetails, " +
      "M_Product.CoreDiameter, " +
      "M_Product.Help, " +
      "M_Product.DownloadURL, " +
      "M_Product.Palettetype, " +
      "M_Product.Classification, " +
      "M_Product.Buttonprintbom, " +
      "COALESCE(M_Product.isServiceItem, 'N') AS isServiceItem, " +
      "M_Product.VendorProductNo, " +
      "M_Product.Costtype, " +
      "M_Product.Qtystd, " +
      "M_Product.M_Product_ID, " +
      "M_Product.MRP_Planner_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM M_Product left join (select AD_Client_ID, Name from AD_Client) table1 on (M_Product.AD_Client_ID = table1.AD_Client_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (M_Product.AD_Org_ID = table2.AD_Org_ID) left join (select M_Product_Category_ID, Name from M_Product_Category) table3 on (M_Product.M_Product_Category_ID = table3.M_Product_Category_ID) left join ad_ref_list_v list1 on (M_Product.Typeofproduct = list1.value and list1.ad_reference_id = 'D3CE5ED8E56C43E19FA09D10B616BCAA' and list1.ad_language = ?)  left join (select C_UOM_ID, Name from C_UOM) table4 on (M_Product.C_UOM_ID = table4.C_UOM_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL4 on (table4.C_UOM_ID = tableTRL4.C_UOM_ID and tableTRL4.AD_Language = ?)  left join (select M_AttributeSet_ID, Name from M_AttributeSet) table5 on (M_Product.M_AttributeSet_ID = table5.M_AttributeSet_ID) left join ad_ref_list_v list2 on (M_Product.ProductType = list2.value and list2.ad_reference_id = '270' and list2.ad_language = ?)  left join (select M_Locator_ID, Value from M_Locator) table6 on (M_Product.M_Locator_ID = table6.M_Locator_ID) left join (select C_Tax_ID, Name from C_Tax) table7 on (M_Product.C_Tax_ID = table7.C_Tax_ID) left join (select C_Tax_ID,AD_Language, Name from C_Tax_TRL) tableTRL7 on (table7.C_Tax_ID = tableTRL7.C_Tax_ID and tableTRL7.AD_Language = ?) " +
      "        WHERE 2=2 " +
      " AND m_product.isactive='Y' and m_product.m_product_category_id='E4A58F68B2724B74A6563585A2E8FB4C'" +
      "        AND 1=1 " +
      "        AND M_Product.M_Product_ID = ? " +
      "        AND M_Product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_Product.AD_Org_ID IN (";
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
        ProductF6A25D6EA3384B0C85679865687E51D4Data objectProductF6A25D6EA3384B0C85679865687E51D4Data = new ProductF6A25D6EA3384B0C85679865687E51D4Data();
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.created = UtilSql.getValue(result, "created");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.updated = UtilSql.getValue(result, "updated");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.adClientIdr = UtilSql.getValue(result, "ad_client_idr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.adImageId = UtilSql.getValue(result, "ad_image_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.imageurl = UtilSql.getValue(result, "imageurl");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.value = UtilSql.getValue(result, "value");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.upc = UtilSql.getValue(result, "upc");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.name = UtilSql.getValue(result, "name");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.descriptionurl = UtilSql.getValue(result, "descriptionurl");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.description = UtilSql.getValue(result, "description");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.documentnote = UtilSql.getValue(result, "documentnote");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mProductCategoryId = UtilSql.getValue(result, "m_product_category_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mProductCategoryIdr = UtilSql.getValue(result, "m_product_category_idr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.typeofproduct = UtilSql.getValue(result, "typeofproduct");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.typeofproductr = UtilSql.getValue(result, "typeofproductr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mAttributesetId = UtilSql.getValue(result, "m_attributeset_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mAttributesetIdr = UtilSql.getValue(result, "m_attributeset_idr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.producttype = UtilSql.getValue(result, "producttype");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.producttyper = UtilSql.getValue(result, "producttyper");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isstocked = UtilSql.getValue(result, "isstocked");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mLocatorId = UtilSql.getValue(result, "m_locator_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mLocatorIdr = UtilSql.getValue(result, "m_locator_idr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.issold = UtilSql.getValue(result, "issold");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.cTaxId = UtilSql.getValue(result, "c_tax_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.cTaxIdr = UtilSql.getValue(result, "c_tax_idr");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.customerproductno = UtilSql.getValue(result, "customerproductno");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.customerproducttext = UtilSql.getValue(result, "customerproducttext");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.discontinued = UtilSql.getValue(result, "discontinued");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.discontinuedby = UtilSql.getDateValue(result, "discontinuedby", "dd-MM-yyyy");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isserialtracking = UtilSql.getValue(result, "isserialtracking");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isbatchtracking = UtilSql.getValue(result, "isbatchtracking");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.weight = UtilSql.getValue(result, "weight");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.volume = UtilSql.getValue(result, "volume");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.shelfwidth = UtilSql.getValue(result, "shelfwidth");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.shelfheight = UtilSql.getValue(result, "shelfheight");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.shelfdepth = UtilSql.getValue(result, "shelfdepth");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.unitsperpallet = UtilSql.getValue(result, "unitsperpallet");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.cutoff = UtilSql.getValue(result, "cutoff");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isconsumable = UtilSql.getValue(result, "isconsumable");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.issparepart = UtilSql.getValue(result, "issparepart");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.issetitem = UtilSql.getValue(result, "issetitem");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isfreightproduct = UtilSql.getValue(result, "isfreightproduct");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.production = UtilSql.getValue(result, "production");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isbom = UtilSql.getValue(result, "isbom");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isverified = UtilSql.getValue(result, "isverified");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.buttoncopyitem = UtilSql.getValue(result, "buttoncopyitem");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.setready4production = UtilSql.getValue(result, "setready4production");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isactive = UtilSql.getValue(result, "isactive");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.issummary = UtilSql.getValue(result, "issummary");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.manufacturer = UtilSql.getValue(result, "manufacturer");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.versionno = UtilSql.getValue(result, "versionno");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.qtymin = UtilSql.getValue(result, "qtymin");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.issummaryitem = UtilSql.getValue(result, "issummaryitem");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.theme = UtilSql.getValue(result, "theme");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.manufacturernumber = UtilSql.getValue(result, "manufacturernumber");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mrpPlanningmethodId = UtilSql.getValue(result, "mrp_planningmethod_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.colorcount = UtilSql.getValue(result, "colorcount");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.stockMin = UtilSql.getValue(result, "stock_min");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.sku = UtilSql.getValue(result, "sku");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.text = UtilSql.getValue(result, "text");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.length = UtilSql.getValue(result, "length");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.ispriceprinted = UtilSql.getValue(result, "ispriceprinted");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.stockmin = UtilSql.getValue(result, "stockmin");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.coststd = UtilSql.getValue(result, "coststd");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.sResourceId = UtilSql.getValue(result, "s_resource_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.width = UtilSql.getValue(result, "width");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.capacity = UtilSql.getValue(result, "capacity");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.qtymax = UtilSql.getValue(result, "qtymax");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.maProcessplanId = UtilSql.getValue(result, "ma_processplan_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mFreightcategoryId = UtilSql.getValue(result, "m_freightcategory_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isinvoiceprintdetails = UtilSql.getValue(result, "isinvoiceprintdetails");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.qtytype = UtilSql.getValue(result, "qtytype");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.name2 = UtilSql.getValue(result, "name2");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.calculated = UtilSql.getValue(result, "calculated");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.guaranteedays = UtilSql.getValue(result, "guaranteedays");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.ispurchased = UtilSql.getValue(result, "ispurchased");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.processing = UtilSql.getValue(result, "processing");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mAttributesetinstanceId = UtilSql.getValue(result, "m_attributesetinstance_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.delaymin = UtilSql.getValue(result, "delaymin");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.salesrepId = UtilSql.getValue(result, "salesrep_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.enforceAttribute = UtilSql.getValue(result, "enforce_attribute");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.sExpensetypeId = UtilSql.getValue(result, "s_expensetype_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.ispicklistprintdetails = UtilSql.getValue(result, "ispicklistprintdetails");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.corediameter = UtilSql.getValue(result, "corediameter");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.help = UtilSql.getValue(result, "help");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.downloadurl = UtilSql.getValue(result, "downloadurl");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.palettetype = UtilSql.getValue(result, "palettetype");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.classification = UtilSql.getValue(result, "classification");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.buttonprintbom = UtilSql.getValue(result, "buttonprintbom");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.isserviceitem = UtilSql.getValue(result, "isserviceitem");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.vendorproductno = UtilSql.getValue(result, "vendorproductno");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.costtype = UtilSql.getValue(result, "costtype");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.qtystd = UtilSql.getValue(result, "qtystd");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.mrpPlannerId = UtilSql.getValue(result, "mrp_planner_id");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.language = UtilSql.getValue(result, "language");
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.adUserClient = "";
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.adOrgClient = "";
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.createdby = "";
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.trBgcolor = "";
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.totalCount = "";
        objectProductF6A25D6EA3384B0C85679865687E51D4Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectProductF6A25D6EA3384B0C85679865687E51D4Data);
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
    ProductF6A25D6EA3384B0C85679865687E51D4Data objectProductF6A25D6EA3384B0C85679865687E51D4Data[] = new ProductF6A25D6EA3384B0C85679865687E51D4Data[vector.size()];
    vector.copyInto(objectProductF6A25D6EA3384B0C85679865687E51D4Data);
    return(objectProductF6A25D6EA3384B0C85679865687E51D4Data);
  }

/**
Create a registry
 */
  public static ProductF6A25D6EA3384B0C85679865687E51D4Data[] set(String manufacturer, String issummaryitem, String corediameter, String issetitem, String isactive, String mProductCategoryId, String isverified, String volume, String stockmin, String shelfdepth, String costtype, String sExpensetypeId, String cTaxId, String descriptionurl, String createdby, String createdbyr, String imageurl, String value, String theme, String cUomId, String isinvoiceprintdetails, String mrpPlannerId, String unitsperpallet, String setready4production, String delaymin, String vendorproductno, String shelfheight, String isserialtracking, String maProcessplanId, String help, String production, String isbatchtracking, String name, String ispriceprinted, String mProductId, String sku, String issparepart, String upc, String adImageId, String downloadurl, String adClientId, String isserviceitem, String mLocatorId, String mLocatorIdr, String issummary, String issold, String mAttributesetinstanceId, String classification, String versionno, String colorcount, String buttonprintbom, String discontinued, String customerproductno, String qtystd, String text, String calculated, String isconsumable, String qtymax, String sResourceId, String description, String palettetype, String typeofproduct, String processing, String manufacturernumber, String name2, String width, String qtytype, String enforceAttribute, String discontinuedby, String isstocked, String adOrgId, String buttoncopyitem, String stockMin, String customerproducttext, String producttype, String salesrepId, String isfreightproduct, String mrpPlanningmethodId, String isbom, String cBpartnerId, String guaranteedays, String shelfwidth, String updatedby, String updatedbyr, String capacity, String cutoff, String qtymin, String ispurchased, String mFreightcategoryId, String weight, String documentnote, String coststd, String mAttributesetId, String length, String ispicklistprintdetails)    throws ServletException {
    ProductF6A25D6EA3384B0C85679865687E51D4Data objectProductF6A25D6EA3384B0C85679865687E51D4Data[] = new ProductF6A25D6EA3384B0C85679865687E51D4Data[1];
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0] = new ProductF6A25D6EA3384B0C85679865687E51D4Data();
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].created = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].createdbyr = createdbyr;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].updated = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].updatedTimeStamp = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].updatedby = updatedby;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].updatedbyr = updatedbyr;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].adClientId = adClientId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].adClientIdr = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].adOrgId = adOrgId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].adOrgIdr = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].adImageId = adImageId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].imageurl = imageurl;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].value = value;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].upc = upc;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].name = name;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].descriptionurl = descriptionurl;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].description = description;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].documentnote = documentnote;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mProductCategoryId = mProductCategoryId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mProductCategoryIdr = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].typeofproduct = typeofproduct;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].typeofproductr = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].cUomId = cUomId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].cUomIdr = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mAttributesetId = mAttributesetId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mAttributesetIdr = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].producttype = producttype;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].producttyper = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isstocked = isstocked;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mLocatorId = mLocatorId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mLocatorIdr = mLocatorIdr;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].issold = issold;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].cTaxId = cTaxId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].cTaxIdr = "";
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].customerproductno = customerproductno;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].customerproducttext = customerproducttext;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].discontinued = discontinued;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].discontinuedby = discontinuedby;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isserialtracking = isserialtracking;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isbatchtracking = isbatchtracking;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].weight = weight;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].volume = volume;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].shelfwidth = shelfwidth;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].shelfheight = shelfheight;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].shelfdepth = shelfdepth;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].unitsperpallet = unitsperpallet;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].cutoff = cutoff;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isconsumable = isconsumable;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].issparepart = issparepart;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].issetitem = issetitem;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isfreightproduct = isfreightproduct;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].production = production;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isbom = isbom;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isverified = isverified;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].buttoncopyitem = buttoncopyitem;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].setready4production = setready4production;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isactive = isactive;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].issummary = issummary;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].manufacturer = manufacturer;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].versionno = versionno;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].cBpartnerId = cBpartnerId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].qtymin = qtymin;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].issummaryitem = issummaryitem;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].theme = theme;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].manufacturernumber = manufacturernumber;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mrpPlanningmethodId = mrpPlanningmethodId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].colorcount = colorcount;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].stockMin = stockMin;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].sku = sku;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].text = text;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].length = length;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].ispriceprinted = ispriceprinted;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].stockmin = stockmin;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].coststd = coststd;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].sResourceId = sResourceId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].width = width;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].capacity = capacity;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].qtymax = qtymax;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].maProcessplanId = maProcessplanId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mFreightcategoryId = mFreightcategoryId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isinvoiceprintdetails = isinvoiceprintdetails;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].qtytype = qtytype;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].name2 = name2;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].calculated = calculated;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].guaranteedays = guaranteedays;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].ispurchased = ispurchased;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].processing = processing;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mAttributesetinstanceId = mAttributesetinstanceId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].delaymin = delaymin;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].salesrepId = salesrepId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].enforceAttribute = enforceAttribute;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].sExpensetypeId = sExpensetypeId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].ispicklistprintdetails = ispicklistprintdetails;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].corediameter = corediameter;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].help = help;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].downloadurl = downloadurl;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].palettetype = palettetype;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].classification = classification;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].buttonprintbom = buttonprintbom;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].isserviceitem = isserviceitem;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].vendorproductno = vendorproductno;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].costtype = costtype;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].qtystd = qtystd;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mProductId = mProductId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].mrpPlannerId = mrpPlannerId;
    objectProductF6A25D6EA3384B0C85679865687E51D4Data[0].language = "";
    return objectProductF6A25D6EA3384B0C85679865687E51D4Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef1407_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2011(ConnectionProvider connectionProvider, String AD_ORG_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT zssi_getNewProductValue(?) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zssi_getnewproductvalue");
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
  public static String selectDef1760(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select c_uom_id from c_uom where isdefault='Y' limit 1 ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_uom_id");
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
  public static String selectDef2304(ConnectionProvider connectionProvider, String AD_ORG_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT zssi_getNewProductEan(?) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zssi_getnewproductean");
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
  public static String selectDef9420_1(ConnectionProvider connectionProvider, String M_Locator_IDR)    throws ServletException {
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

/**
Select for auxiliar field
 */
  public static String selectDef1409_2(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE M_Product" +
      "        SET AD_Client_ID = (?) , AD_Org_ID = (?) , AD_Image_ID = (?) , ImageURL = (?) , Value = (?) , UPC = (?) , Name = (?) , DescriptionURL = (?) , Description = (?) , DocumentNote = (?) , M_Product_Category_ID = (?) , Typeofproduct = (?) , C_UOM_ID = (?) , M_AttributeSet_ID = (?) , ProductType = (?) , IsStocked = (?) , M_Locator_ID = (?) , IsSold = (?) , C_Tax_ID = (?) , CustomerProductNo = (?) , Customerproducttext = (?) , Discontinued = (?) , DiscontinuedBy = TO_DATE(?) , IsSerialTracking = (?) , Isbatchtracking = (?) , Weight = TO_NUMBER(?) , Volume = TO_NUMBER(?) , ShelfWidth = TO_NUMBER(?) , ShelfHeight = TO_NUMBER(?) , ShelfDepth = TO_NUMBER(?) , UnitsPerPallet = TO_NUMBER(?) , Cutoff = TO_NUMBER(?) , isConsumable = (?) , isSparePart = (?) , isSetItem = (?) , isFreightProduct = (?) , Production = (?) , IsBOM = (?) , isVerified = (?) , Buttoncopyitem = (?) , Setready4production = (?) , IsActive = (?) , IsSummary = (?) , Manufacturer = (?) , VersionNo = (?) , C_BPartner_ID = (?) , Qtymin = TO_NUMBER(?) , IsSummaryItem = (?) , Theme = (?) , Manufacturernumber = (?) , MRP_Planningmethod_ID = (?) , Colorcount = TO_NUMBER(?) , Stock_Min = TO_NUMBER(?) , SKU = (?) , Text = (?) , Length = TO_NUMBER(?) , Ispriceprinted = (?) , Stockmin = TO_NUMBER(?) , Coststd = TO_NUMBER(?) , S_Resource_ID = (?) , Width = TO_NUMBER(?) , Capacity = TO_NUMBER(?) , Qtymax = TO_NUMBER(?) , MA_Processplan_ID = (?) , M_FreightCategory_ID = (?) , IsInvoicePrintDetails = (?) , Qtytype = (?) , Name2 = (?) , Calculated = (?) , GuaranteeDays = TO_NUMBER(?) , IsPurchased = (?) , Processing = (?) , M_AttributeSetInstance_ID = (?) , Delaymin = TO_NUMBER(?) , SalesRep_ID = (?) , Enforce_Attribute = (?) , S_ExpenseType_ID = (?) , IsPickListPrintDetails = (?) , CoreDiameter = TO_NUMBER(?) , Help = (?) , DownloadURL = (?) , Palettetype = (?) , Classification = (?) , Buttonprintbom = (?) , isServiceItem = (?) , VendorProductNo = (?) , Costtype = (?) , Qtystd = TO_NUMBER(?) , M_Product_ID = (?) , MRP_Planner_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_Product.M_Product_ID = ? " +
      "        AND M_Product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adImageId);
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, producttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issold);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, customerproductno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, customerproducttext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isserialtracking);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbatchtracking);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, volume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfwidth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfheight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfdepth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unitsperpallet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cutoff);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isconsumable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issparepart);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issetitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfreightproduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, production);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isverified);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, buttoncopyitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, setready4production);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, versionno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummaryitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, theme);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturernumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpPlanningmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, colorcount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockMin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sku);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, text);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, length);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispriceprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockmin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, coststd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, width);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, capacity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mFreightcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiceprintdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtytype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedays);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, delaymin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enforceAttribute);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sExpensetypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispicklistprintdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, corediameter);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, downloadurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, palettetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, classification);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, buttonprintbom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isserviceitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorproductno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtystd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpPlannerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
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
      "        INSERT INTO M_Product " +
      "        (AD_Client_ID, AD_Org_ID, AD_Image_ID, ImageURL, Value, UPC, Name, DescriptionURL, Description, DocumentNote, M_Product_Category_ID, Typeofproduct, C_UOM_ID, M_AttributeSet_ID, ProductType, IsStocked, M_Locator_ID, IsSold, C_Tax_ID, CustomerProductNo, Customerproducttext, Discontinued, DiscontinuedBy, IsSerialTracking, Isbatchtracking, Weight, Volume, ShelfWidth, ShelfHeight, ShelfDepth, UnitsPerPallet, Cutoff, isConsumable, isSparePart, isSetItem, isFreightProduct, Production, IsBOM, isVerified, Buttoncopyitem, Setready4production, IsActive, IsSummary, Manufacturer, VersionNo, C_BPartner_ID, Qtymin, IsSummaryItem, Theme, Manufacturernumber, MRP_Planningmethod_ID, Colorcount, Stock_Min, SKU, Text, Length, Ispriceprinted, Stockmin, Coststd, S_Resource_ID, Width, Capacity, Qtymax, MA_Processplan_ID, M_FreightCategory_ID, IsInvoicePrintDetails, Qtytype, Name2, Calculated, GuaranteeDays, IsPurchased, Processing, M_AttributeSetInstance_ID, Delaymin, SalesRep_ID, Enforce_Attribute, S_ExpenseType_ID, IsPickListPrintDetails, CoreDiameter, Help, DownloadURL, Palettetype, Classification, Buttonprintbom, isServiceItem, VendorProductNo, Costtype, Qtystd, M_Product_ID, MRP_Planner_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adImageId);
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, producttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isstocked);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issold);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cTaxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, customerproductno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, customerproducttext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinued);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discontinuedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isserialtracking);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbatchtracking);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, weight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, volume);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfwidth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfheight);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shelfdepth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unitsperpallet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cutoff);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isconsumable);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issparepart);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issetitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isfreightproduct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, production);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isbom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isverified);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, buttoncopyitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, setready4production);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummary);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, versionno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issummaryitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, theme);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, manufacturernumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpPlanningmethodId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, colorcount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockMin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sku);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, text);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, length);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispriceprinted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stockmin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, coststd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sResourceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, width);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, capacity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maProcessplanId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mFreightcategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isinvoiceprintdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtytype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, calculated);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, guaranteedays);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispurchased);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mAttributesetinstanceId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, delaymin);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enforceAttribute);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sExpensetypeId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispicklistprintdetails);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, corediameter);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, help);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, downloadurl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, palettetype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, classification);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, buttonprintbom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isserviceitem);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vendorproductno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, costtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtystd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mrpPlannerId);
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
      "        DELETE FROM M_Product" +
      "        WHERE M_Product.M_Product_ID = ? " +
      "        AND M_Product.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product.AD_Org_ID IN (";
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
      "        DELETE FROM M_Product" +
      "        WHERE M_Product.M_Product_ID = ? ";

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
      "          FROM M_Product" +
      "         WHERE M_Product.M_Product_ID = ? ";

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
      "          FROM M_Product" +
      "         WHERE M_Product.M_Product_ID = ? ";

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
