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
class PriceAdjustmentProductAssignmentData implements FieldProvider {
static Logger log4j = Logger.getLogger(PriceAdjustmentProductAssignmentData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String name;
  public String isactive;
  public String datefrom;
  public String dateto;
  public String qtyFrom;
  public String qtyTo;
  public String priority;
  public String discount;
  public String addamt;
  public String fixed;
  public String mProductCategoryId;
  public String mProductCategoryIdr;
  public String mPricelistId;
  public String mPricelistIdr;
  public String mProductId;
  public String mProductIdr;
  public String cUomId;
  public String cUomIdr;
  public String description;
  public String mOfferbpartnerVId;
  public String productSelection;
  public String bpGroupSelection;
  public String adClientId;
  public String pricelistSelection;
  public String adOrgId;
  public String bpartnerSelection;
  public String prodCatSelection;
  public String mManufacturerId;
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
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("datefrom"))
      return datefrom;
    else if (fieldName.equalsIgnoreCase("dateto"))
      return dateto;
    else if (fieldName.equalsIgnoreCase("qty_from") || fieldName.equals("qtyFrom"))
      return qtyFrom;
    else if (fieldName.equalsIgnoreCase("qty_to") || fieldName.equals("qtyTo"))
      return qtyTo;
    else if (fieldName.equalsIgnoreCase("priority"))
      return priority;
    else if (fieldName.equalsIgnoreCase("discount"))
      return discount;
    else if (fieldName.equalsIgnoreCase("addamt"))
      return addamt;
    else if (fieldName.equalsIgnoreCase("fixed"))
      return fixed;
    else if (fieldName.equalsIgnoreCase("m_product_category_id") || fieldName.equals("mProductCategoryId"))
      return mProductCategoryId;
    else if (fieldName.equalsIgnoreCase("m_product_category_idr") || fieldName.equals("mProductCategoryIdr"))
      return mProductCategoryIdr;
    else if (fieldName.equalsIgnoreCase("m_pricelist_id") || fieldName.equals("mPricelistId"))
      return mPricelistId;
    else if (fieldName.equalsIgnoreCase("m_pricelist_idr") || fieldName.equals("mPricelistIdr"))
      return mPricelistIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("c_uom_idr") || fieldName.equals("cUomIdr"))
      return cUomIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("m_offerbpartner_v_id") || fieldName.equals("mOfferbpartnerVId"))
      return mOfferbpartnerVId;
    else if (fieldName.equalsIgnoreCase("product_selection") || fieldName.equals("productSelection"))
      return productSelection;
    else if (fieldName.equalsIgnoreCase("bp_group_selection") || fieldName.equals("bpGroupSelection"))
      return bpGroupSelection;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("pricelist_selection") || fieldName.equals("pricelistSelection"))
      return pricelistSelection;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("bpartner_selection") || fieldName.equals("bpartnerSelection"))
      return bpartnerSelection;
    else if (fieldName.equalsIgnoreCase("prod_cat_selection") || fieldName.equals("prodCatSelection"))
      return prodCatSelection;
    else if (fieldName.equalsIgnoreCase("m_manufacturer_id") || fieldName.equals("mManufacturerId"))
      return mManufacturerId;
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
  public static PriceAdjustmentProductAssignmentData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String c_bpartner_id, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, c_bpartner_id, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static PriceAdjustmentProductAssignmentData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String c_bpartner_id, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(m_offerbpartner_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = m_offerbpartner_v.CreatedBy) as CreatedByR, " +
      "        to_char(m_offerbpartner_v.Updated, ?) as updated, " +
      "        to_char(m_offerbpartner_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        m_offerbpartner_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = m_offerbpartner_v.UpdatedBy) as UpdatedByR," +
      "        m_offerbpartner_v.C_Bpartner_ID, " +
      "(CASE WHEN m_offerbpartner_v.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "m_offerbpartner_v.Name, " +
      "COALESCE(m_offerbpartner_v.Isactive, 'N') AS Isactive, " +
      "m_offerbpartner_v.Datefrom, " +
      "m_offerbpartner_v.Dateto, " +
      "m_offerbpartner_v.QTY_From, " +
      "m_offerbpartner_v.QTY_To, " +
      "m_offerbpartner_v.Priority, " +
      "m_offerbpartner_v.Discount, " +
      "m_offerbpartner_v.Addamt, " +
      "m_offerbpartner_v.Fixed, " +
      "m_offerbpartner_v.M_Product_Category_ID, " +
      "(CASE WHEN m_offerbpartner_v.M_Product_Category_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS M_Product_Category_IDR, " +
      "m_offerbpartner_v.M_Pricelist_ID, " +
      "(CASE WHEN m_offerbpartner_v.M_Pricelist_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS M_Pricelist_IDR, " +
      "m_offerbpartner_v.M_Product_ID, " +
      "(CASE WHEN m_offerbpartner_v.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL4.Name IS NULL THEN TO_CHAR(table4.Name) ELSE TO_CHAR(tableTRL4.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "m_offerbpartner_v.C_Uom_ID, " +
      "(CASE WHEN m_offerbpartner_v.C_Uom_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'') ) END) AS C_Uom_IDR, " +
      "m_offerbpartner_v.Description, " +
      "m_offerbpartner_v.M_Offerbpartner_V_ID, " +
      "COALESCE(m_offerbpartner_v.Product_Selection, 'N') AS Product_Selection, " +
      "COALESCE(m_offerbpartner_v.BP_Group_Selection, 'N') AS BP_Group_Selection, " +
      "m_offerbpartner_v.AD_Client_ID, " +
      "COALESCE(m_offerbpartner_v.Pricelist_Selection, 'N') AS Pricelist_Selection, " +
      "m_offerbpartner_v.AD_Org_ID, " +
      "COALESCE(m_offerbpartner_v.Bpartner_Selection, 'N') AS Bpartner_Selection, " +
      "COALESCE(m_offerbpartner_v.Prod_Cat_Selection, 'N') AS Prod_Cat_Selection, " +
      "m_offerbpartner_v.M_Manufacturer_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM m_offerbpartner_v left join (select C_Bpartner_ID, Name from C_Bpartner) table1 on (m_offerbpartner_v.C_Bpartner_ID = table1.C_Bpartner_ID) left join (select M_Product_Category_ID, Name from M_Product_Category) table2 on (m_offerbpartner_v.M_Product_Category_ID = table2.M_Product_Category_ID) left join (select M_PriceList_ID, Name from M_PriceList) table3 on (m_offerbpartner_v.M_Pricelist_ID =  table3.M_PriceList_ID) left join (select M_Product_ID, Value, Name from M_Product) table4 on (m_offerbpartner_v.M_Product_ID = table4.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL4 on (table4.M_Product_ID = tableTRL4.M_Product_ID and tableTRL4.AD_Language = ?)  left join (select C_Uom_ID, Name from C_Uom) table5 on (m_offerbpartner_v.C_Uom_ID = table5.C_Uom_ID) left join (select C_UOM_ID,AD_Language, Name from C_UOM_TRL) tableTRL5 on (table5.C_UOM_ID = tableTRL5.C_UOM_ID and tableTRL5.AD_Language = ?) " +
      "        WHERE 2=2 " +
      " AND m_offerbpartner_v.c_bpartner_id=?" +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND m_offerbpartner_v.C_Bpartner_ID = ?  ");
    strSql = strSql + 
      "        AND m_offerbpartner_v.M_Offerbpartner_V_ID = ? " +
      "        AND m_offerbpartner_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND m_offerbpartner_v.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_bpartner_id);
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
        PriceAdjustmentProductAssignmentData objectPriceAdjustmentProductAssignmentData = new PriceAdjustmentProductAssignmentData();
        objectPriceAdjustmentProductAssignmentData.created = UtilSql.getValue(result, "created");
        objectPriceAdjustmentProductAssignmentData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectPriceAdjustmentProductAssignmentData.updated = UtilSql.getValue(result, "updated");
        objectPriceAdjustmentProductAssignmentData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectPriceAdjustmentProductAssignmentData.updatedby = UtilSql.getValue(result, "updatedby");
        objectPriceAdjustmentProductAssignmentData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectPriceAdjustmentProductAssignmentData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectPriceAdjustmentProductAssignmentData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectPriceAdjustmentProductAssignmentData.name = UtilSql.getValue(result, "name");
        objectPriceAdjustmentProductAssignmentData.isactive = UtilSql.getValue(result, "isactive");
        objectPriceAdjustmentProductAssignmentData.datefrom = UtilSql.getDateValue(result, "datefrom", "dd-MM-yyyy");
        objectPriceAdjustmentProductAssignmentData.dateto = UtilSql.getDateValue(result, "dateto", "dd-MM-yyyy");
        objectPriceAdjustmentProductAssignmentData.qtyFrom = UtilSql.getValue(result, "qty_from");
        objectPriceAdjustmentProductAssignmentData.qtyTo = UtilSql.getValue(result, "qty_to");
        objectPriceAdjustmentProductAssignmentData.priority = UtilSql.getValue(result, "priority");
        objectPriceAdjustmentProductAssignmentData.discount = UtilSql.getValue(result, "discount");
        objectPriceAdjustmentProductAssignmentData.addamt = UtilSql.getValue(result, "addamt");
        objectPriceAdjustmentProductAssignmentData.fixed = UtilSql.getValue(result, "fixed");
        objectPriceAdjustmentProductAssignmentData.mProductCategoryId = UtilSql.getValue(result, "m_product_category_id");
        objectPriceAdjustmentProductAssignmentData.mProductCategoryIdr = UtilSql.getValue(result, "m_product_category_idr");
        objectPriceAdjustmentProductAssignmentData.mPricelistId = UtilSql.getValue(result, "m_pricelist_id");
        objectPriceAdjustmentProductAssignmentData.mPricelistIdr = UtilSql.getValue(result, "m_pricelist_idr");
        objectPriceAdjustmentProductAssignmentData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectPriceAdjustmentProductAssignmentData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectPriceAdjustmentProductAssignmentData.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectPriceAdjustmentProductAssignmentData.cUomIdr = UtilSql.getValue(result, "c_uom_idr");
        objectPriceAdjustmentProductAssignmentData.description = UtilSql.getValue(result, "description");
        objectPriceAdjustmentProductAssignmentData.mOfferbpartnerVId = UtilSql.getValue(result, "m_offerbpartner_v_id");
        objectPriceAdjustmentProductAssignmentData.productSelection = UtilSql.getValue(result, "product_selection");
        objectPriceAdjustmentProductAssignmentData.bpGroupSelection = UtilSql.getValue(result, "bp_group_selection");
        objectPriceAdjustmentProductAssignmentData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectPriceAdjustmentProductAssignmentData.pricelistSelection = UtilSql.getValue(result, "pricelist_selection");
        objectPriceAdjustmentProductAssignmentData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectPriceAdjustmentProductAssignmentData.bpartnerSelection = UtilSql.getValue(result, "bpartner_selection");
        objectPriceAdjustmentProductAssignmentData.prodCatSelection = UtilSql.getValue(result, "prod_cat_selection");
        objectPriceAdjustmentProductAssignmentData.mManufacturerId = UtilSql.getValue(result, "m_manufacturer_id");
        objectPriceAdjustmentProductAssignmentData.language = UtilSql.getValue(result, "language");
        objectPriceAdjustmentProductAssignmentData.adUserClient = "";
        objectPriceAdjustmentProductAssignmentData.adOrgClient = "";
        objectPriceAdjustmentProductAssignmentData.createdby = "";
        objectPriceAdjustmentProductAssignmentData.trBgcolor = "";
        objectPriceAdjustmentProductAssignmentData.totalCount = "";
        objectPriceAdjustmentProductAssignmentData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPriceAdjustmentProductAssignmentData);
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
    PriceAdjustmentProductAssignmentData objectPriceAdjustmentProductAssignmentData[] = new PriceAdjustmentProductAssignmentData[vector.size()];
    vector.copyInto(objectPriceAdjustmentProductAssignmentData);
    return(objectPriceAdjustmentProductAssignmentData);
  }

/**
Create a registry
 */
  public static PriceAdjustmentProductAssignmentData[] set(String cBpartnerId, String mManufacturerId, String qtyFrom, String addamt, String mOfferbpartnerVId, String productSelection, String mPricelistId, String name, String discount, String mProductCategoryId, String cUomId, String mProductId, String mProductIdr, String adOrgId, String description, String priority, String bpartnerSelection, String datefrom, String bpGroupSelection, String fixed, String createdby, String createdbyr, String prodCatSelection, String updatedby, String updatedbyr, String pricelistSelection, String isactive, String qtyTo, String dateto, String adClientId)    throws ServletException {
    PriceAdjustmentProductAssignmentData objectPriceAdjustmentProductAssignmentData[] = new PriceAdjustmentProductAssignmentData[1];
    objectPriceAdjustmentProductAssignmentData[0] = new PriceAdjustmentProductAssignmentData();
    objectPriceAdjustmentProductAssignmentData[0].created = "";
    objectPriceAdjustmentProductAssignmentData[0].createdbyr = createdbyr;
    objectPriceAdjustmentProductAssignmentData[0].updated = "";
    objectPriceAdjustmentProductAssignmentData[0].updatedTimeStamp = "";
    objectPriceAdjustmentProductAssignmentData[0].updatedby = updatedby;
    objectPriceAdjustmentProductAssignmentData[0].updatedbyr = updatedbyr;
    objectPriceAdjustmentProductAssignmentData[0].cBpartnerId = cBpartnerId;
    objectPriceAdjustmentProductAssignmentData[0].cBpartnerIdr = "";
    objectPriceAdjustmentProductAssignmentData[0].name = name;
    objectPriceAdjustmentProductAssignmentData[0].isactive = isactive;
    objectPriceAdjustmentProductAssignmentData[0].datefrom = datefrom;
    objectPriceAdjustmentProductAssignmentData[0].dateto = dateto;
    objectPriceAdjustmentProductAssignmentData[0].qtyFrom = qtyFrom;
    objectPriceAdjustmentProductAssignmentData[0].qtyTo = qtyTo;
    objectPriceAdjustmentProductAssignmentData[0].priority = priority;
    objectPriceAdjustmentProductAssignmentData[0].discount = discount;
    objectPriceAdjustmentProductAssignmentData[0].addamt = addamt;
    objectPriceAdjustmentProductAssignmentData[0].fixed = fixed;
    objectPriceAdjustmentProductAssignmentData[0].mProductCategoryId = mProductCategoryId;
    objectPriceAdjustmentProductAssignmentData[0].mProductCategoryIdr = "";
    objectPriceAdjustmentProductAssignmentData[0].mPricelistId = mPricelistId;
    objectPriceAdjustmentProductAssignmentData[0].mPricelistIdr = "";
    objectPriceAdjustmentProductAssignmentData[0].mProductId = mProductId;
    objectPriceAdjustmentProductAssignmentData[0].mProductIdr = mProductIdr;
    objectPriceAdjustmentProductAssignmentData[0].cUomId = cUomId;
    objectPriceAdjustmentProductAssignmentData[0].cUomIdr = "";
    objectPriceAdjustmentProductAssignmentData[0].description = description;
    objectPriceAdjustmentProductAssignmentData[0].mOfferbpartnerVId = mOfferbpartnerVId;
    objectPriceAdjustmentProductAssignmentData[0].productSelection = productSelection;
    objectPriceAdjustmentProductAssignmentData[0].bpGroupSelection = bpGroupSelection;
    objectPriceAdjustmentProductAssignmentData[0].adClientId = adClientId;
    objectPriceAdjustmentProductAssignmentData[0].pricelistSelection = pricelistSelection;
    objectPriceAdjustmentProductAssignmentData[0].adOrgId = adOrgId;
    objectPriceAdjustmentProductAssignmentData[0].bpartnerSelection = bpartnerSelection;
    objectPriceAdjustmentProductAssignmentData[0].prodCatSelection = prodCatSelection;
    objectPriceAdjustmentProductAssignmentData[0].mManufacturerId = mManufacturerId;
    objectPriceAdjustmentProductAssignmentData[0].language = "";
    return objectPriceAdjustmentProductAssignmentData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef190E88C98AF146659837BFB531E55F84_0(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDefC3245A49E1E744E6923D8E776A2D607A_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefFC5B56E488AB4993A00DD3FA829D907E_2(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT m_offerbpartner_v.C_Bpartner_ID AS NAME" +
      "        FROM m_offerbpartner_v" +
      "        WHERE m_offerbpartner_v.M_Offerbpartner_V_ID = ?";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BPartner left join (select C_Bpartner_ID, Name from C_Bpartner) table1 on (C_BPartner.C_Bpartner_ID = table1.C_Bpartner_ID) WHERE C_BPartner.C_Bpartner_ID = ?  ";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BPartner left join (select C_Bpartner_ID, Name from C_Bpartner) table1 on (C_BPartner.C_Bpartner_ID = table1.C_Bpartner_ID) WHERE C_BPartner.C_Bpartner_ID = ?  ";

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
      "        UPDATE m_offerbpartner_v" +
      "        SET C_Bpartner_ID = (?) , Name = (?) , Isactive = (?) , Datefrom = TO_DATE(?) , Dateto = TO_DATE(?) , QTY_From = TO_NUMBER(?) , QTY_To = TO_NUMBER(?) , Priority = TO_NUMBER(?) , Discount = TO_NUMBER(?) , Addamt = TO_NUMBER(?) , Fixed = TO_NUMBER(?) , M_Product_Category_ID = (?) , M_Pricelist_ID = (?) , M_Product_ID = (?) , C_Uom_ID = (?) , Description = (?) , M_Offerbpartner_V_ID = (?) , Product_Selection = (?) , BP_Group_Selection = (?) , AD_Client_ID = (?) , Pricelist_Selection = (?) , AD_Org_ID = (?) , Bpartner_Selection = (?) , Prod_Cat_Selection = (?) , M_Manufacturer_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE m_offerbpartner_v.M_Offerbpartner_V_ID = ? " +
      "                 AND m_offerbpartner_v.C_Bpartner_ID = ? " +
      "        AND m_offerbpartner_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND m_offerbpartner_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyFrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyTo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priority);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, addamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferbpartnerVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpGroupSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelistSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpartnerSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, prodCatSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferbpartnerVId);
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
      "        INSERT INTO m_offerbpartner_v " +
      "        (C_Bpartner_ID, Name, Isactive, Datefrom, Dateto, QTY_From, QTY_To, Priority, Discount, Addamt, Fixed, M_Product_Category_ID, M_Pricelist_ID, M_Product_ID, C_Uom_ID, Description, M_Offerbpartner_V_ID, Product_Selection, BP_Group_Selection, AD_Client_ID, Pricelist_Selection, AD_Org_ID, Bpartner_Selection, Prod_Cat_Selection, M_Manufacturer_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_DATE(?), TO_DATE(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyFrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtyTo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priority);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, addamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fixed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mOfferbpartnerVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpGroupSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelistSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpartnerSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, prodCatSelection);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mManufacturerId);
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
      "        DELETE FROM m_offerbpartner_v" +
      "        WHERE m_offerbpartner_v.M_Offerbpartner_V_ID = ? " +
      "                 AND m_offerbpartner_v.C_Bpartner_ID = ? " +
      "        AND m_offerbpartner_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND m_offerbpartner_v.AD_Org_ID IN (";
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
      "        DELETE FROM m_offerbpartner_v" +
      "        WHERE m_offerbpartner_v.M_Offerbpartner_V_ID = ? " +
      "                 AND m_offerbpartner_v.C_Bpartner_ID = ? ";

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
      "          FROM m_offerbpartner_v" +
      "         WHERE m_offerbpartner_v.M_Offerbpartner_V_ID = ? ";

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
      "          FROM m_offerbpartner_v" +
      "         WHERE m_offerbpartner_v.M_Offerbpartner_V_ID = ? ";

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
