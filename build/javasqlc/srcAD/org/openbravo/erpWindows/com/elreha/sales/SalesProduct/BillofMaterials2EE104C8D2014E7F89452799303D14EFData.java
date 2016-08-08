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
class BillofMaterials2EE104C8D2014E7F89452799303D14EFData implements FieldProvider {
static Logger log4j = Logger.getLogger(BillofMaterials2EE104C8D2014E7F89452799303D14EFData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String bomtype;
  public String mProductId;
  public String mProductIdr;
  public String isactive;
  public String line;
  public String productValue;
  public String mProductbomId;
  public String mProductbomIdr;
  public String bomqty;
  public String description;
  public String constuctivemeasure;
  public String rawmaterial;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String adOrgId;
  public String adClientId;
  public String mProductBomId;
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
    else if (fieldName.equalsIgnoreCase("bomtype"))
      return bomtype;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("line"))
      return line;
    else if (fieldName.equalsIgnoreCase("product_value") || fieldName.equals("productValue"))
      return productValue;
    else if (fieldName.equalsIgnoreCase("m_productbom_id") || fieldName.equals("mProductbomId"))
      return mProductbomId;
    else if (fieldName.equalsIgnoreCase("m_productbom_idr") || fieldName.equals("mProductbomIdr"))
      return mProductbomIdr;
    else if (fieldName.equalsIgnoreCase("bomqty"))
      return bomqty;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("constuctivemeasure"))
      return constuctivemeasure;
    else if (fieldName.equalsIgnoreCase("rawmaterial"))
      return rawmaterial;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("m_product_bom_id") || fieldName.equals("mProductBomId"))
      return mProductBomId;
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
  public static BillofMaterials2EE104C8D2014E7F89452799303D14EFData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mProductId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, mProductId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static BillofMaterials2EE104C8D2014E7F89452799303D14EFData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mProductId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(M_Product_BOM.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product_BOM.CreatedBy) as CreatedByR, " +
      "        to_char(M_Product_BOM.Updated, ?) as updated, " +
      "        to_char(M_Product_BOM.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        M_Product_BOM.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = M_Product_BOM.UpdatedBy) as UpdatedByR," +
      "        M_Product_BOM.BOMType, " +
      "M_Product_BOM.M_Product_ID, " +
      "(CASE WHEN M_Product_BOM.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "COALESCE(M_Product_BOM.IsActive, 'N') AS IsActive, " +
      "M_Product_BOM.Line, " +
      "M_Product_BOM.Product_Value, " +
      "M_Product_BOM.M_ProductBOM_ID, " +
      "(CASE WHEN M_Product_BOM.M_ProductBOM_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS M_ProductBOM_IDR, " +
      "M_Product_BOM.BOMQty, " +
      "M_Product_BOM.Description, " +
      "M_Product_BOM.Constuctivemeasure, " +
      "M_Product_BOM.Rawmaterial, " +
      "M_Product_BOM.C_Bpartner_ID, " +
      "(CASE WHEN M_Product_BOM.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "M_Product_BOM.AD_Org_ID, " +
      "M_Product_BOM.AD_Client_ID, " +
      "M_Product_BOM.M_Product_BOM_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM M_Product_BOM left join (select M_Product_ID, Value, Name from M_Product) table1 on (M_Product_BOM.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select M_Product_ID, Value, Name from M_Product) table2 on (M_Product_BOM.M_ProductBOM_ID = table2.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  left join (select C_BPartner_ID, Name from C_BPartner) table3 on (M_Product_BOM.C_Bpartner_ID = table3.C_BPartner_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((mProductId==null || mProductId.equals(""))?"":"  AND M_Product_BOM.M_Product_ID = ?  ");
    strSql = strSql + 
      "        AND M_Product_BOM.M_Product_BOM_ID = ? " +
      "        AND M_Product_BOM.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND M_Product_BOM.AD_Org_ID IN (";
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
        BillofMaterials2EE104C8D2014E7F89452799303D14EFData objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData = new BillofMaterials2EE104C8D2014E7F89452799303D14EFData();
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.created = UtilSql.getValue(result, "created");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.updated = UtilSql.getValue(result, "updated");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.updatedby = UtilSql.getValue(result, "updatedby");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.bomtype = UtilSql.getValue(result, "bomtype");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.isactive = UtilSql.getValue(result, "isactive");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.line = UtilSql.getValue(result, "line");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.productValue = UtilSql.getValue(result, "product_value");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.mProductbomId = UtilSql.getValue(result, "m_productbom_id");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.mProductbomIdr = UtilSql.getValue(result, "m_productbom_idr");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.bomqty = UtilSql.getValue(result, "bomqty");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.description = UtilSql.getValue(result, "description");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.constuctivemeasure = UtilSql.getValue(result, "constuctivemeasure");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.rawmaterial = UtilSql.getValue(result, "rawmaterial");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.mProductBomId = UtilSql.getValue(result, "m_product_bom_id");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.language = UtilSql.getValue(result, "language");
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.adUserClient = "";
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.adOrgClient = "";
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.createdby = "";
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.trBgcolor = "";
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.totalCount = "";
        objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData);
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
    BillofMaterials2EE104C8D2014E7F89452799303D14EFData objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[] = new BillofMaterials2EE104C8D2014E7F89452799303D14EFData[vector.size()];
    vector.copyInto(objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData);
    return(objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData);
  }

/**
Create a registry
 */
  public static BillofMaterials2EE104C8D2014E7F89452799303D14EFData[] set(String mProductId, String productValue, String mProductIdr, String bomtype, String isactive, String adOrgId, String line, String createdby, String createdbyr, String bomqty, String description, String constuctivemeasure, String adClientId, String mProductbomId, String mProductbomIdr, String rawmaterial, String mProductBomId, String cBpartnerId, String cBpartnerIdr, String updatedby, String updatedbyr)    throws ServletException {
    BillofMaterials2EE104C8D2014E7F89452799303D14EFData objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[] = new BillofMaterials2EE104C8D2014E7F89452799303D14EFData[1];
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0] = new BillofMaterials2EE104C8D2014E7F89452799303D14EFData();
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].created = "";
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].createdbyr = createdbyr;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].updated = "";
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].updatedTimeStamp = "";
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].updatedby = updatedby;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].updatedbyr = updatedbyr;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].bomtype = bomtype;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].mProductId = mProductId;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].mProductIdr = mProductIdr;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].isactive = isactive;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].line = line;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].productValue = productValue;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].mProductbomId = mProductbomId;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].mProductbomIdr = mProductbomIdr;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].bomqty = bomqty;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].description = description;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].constuctivemeasure = constuctivemeasure;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].rawmaterial = rawmaterial;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].cBpartnerId = cBpartnerId;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].cBpartnerIdr = cBpartnerIdr;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].adOrgId = adOrgId;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].adClientId = adClientId;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].mProductBomId = mProductBomId;
    objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData[0].language = "";
    return objectBillofMaterials2EE104C8D2014E7F89452799303D14EFData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef4721_0(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef4770(ConnectionProvider connectionProvider, String M_Product_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_Product_BOM WHERE M_Product_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "defaultvalue");
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
  public static String selectDef4718_1(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef4722_2(ConnectionProvider connectionProvider, String M_ProductBOM_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Value), '')  || ' - ' || COALESCE(TO_CHAR(table1.Name), '') ) as M_ProductBOM_ID FROM M_Product table1 WHERE table1.isActive='Y' AND table1.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_ProductBOM_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_productbom_id");
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
  public static String selectDef03A847352F8A4518A7C5BDB31644E23D_3(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
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
  public static String selectDef4720_4(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        SELECT M_Product_BOM.M_Product_ID AS NAME" +
      "        FROM M_Product_BOM" +
      "        WHERE M_Product_BOM.M_Product_BOM_ID = ?";

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
      "        UPDATE M_Product_BOM" +
      "        SET BOMType = (?) , M_Product_ID = (?) , IsActive = (?) , Line = TO_NUMBER(?) , Product_Value = (?) , M_ProductBOM_ID = (?) , BOMQty = TO_NUMBER(?) , Description = (?) , Constuctivemeasure = (?) , Rawmaterial = (?) , C_Bpartner_ID = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , M_Product_BOM_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE M_Product_BOM.M_Product_BOM_ID = ? " +
      "                 AND M_Product_BOM.M_Product_ID = ? " +
      "        AND M_Product_BOM.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product_BOM.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productValue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductbomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, constuctivemeasure);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rawmaterial);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductBomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductBomId);
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
      "        INSERT INTO M_Product_BOM " +
      "        (BOMType, M_Product_ID, IsActive, Line, Product_Value, M_ProductBOM_ID, BOMQty, Description, Constuctivemeasure, Rawmaterial, C_Bpartner_ID, AD_Org_ID, AD_Client_ID, M_Product_BOM_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productValue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductbomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, constuctivemeasure);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rawmaterial);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductBomId);
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
      "        DELETE FROM M_Product_BOM" +
      "        WHERE M_Product_BOM.M_Product_BOM_ID = ? " +
      "                 AND M_Product_BOM.M_Product_ID = ? " +
      "        AND M_Product_BOM.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND M_Product_BOM.AD_Org_ID IN (";
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
      "        DELETE FROM M_Product_BOM" +
      "        WHERE M_Product_BOM.M_Product_BOM_ID = ? " +
      "                 AND M_Product_BOM.M_Product_ID = ? ";

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
      "          FROM M_Product_BOM" +
      "         WHERE M_Product_BOM.M_Product_BOM_ID = ? ";

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
      "          FROM M_Product_BOM" +
      "         WHERE M_Product_BOM.M_Product_BOM_ID = ? ";

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
