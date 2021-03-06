//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.zsoft.costing.CostCenter;

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
class CreatedamountsData implements FieldProvider {
static Logger log4j = Logger.getLogger(CreatedamountsData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String aAssetId;
  public String aAssetIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String documentno;
  public String mProductId;
  public String mProductIdr;
  public String description;
  public String dateordered;
  public String amt;
  public String cInvoicelineId;
  public String cInvoicelineIdr;
  public String zsfiMacctlineId;
  public String zsfiMacctlineIdr;
  public String value;
  public String adClientId;
  public String aAssetCostcenterVId;
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
    else if (fieldName.equalsIgnoreCase("a_asset_id") || fieldName.equals("aAssetId"))
      return aAssetId;
    else if (fieldName.equalsIgnoreCase("a_asset_idr") || fieldName.equals("aAssetIdr"))
      return aAssetIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("dateordered"))
      return dateordered;
    else if (fieldName.equalsIgnoreCase("amt"))
      return amt;
    else if (fieldName.equalsIgnoreCase("c_invoiceline_id") || fieldName.equals("cInvoicelineId"))
      return cInvoicelineId;
    else if (fieldName.equalsIgnoreCase("c_invoiceline_idr") || fieldName.equals("cInvoicelineIdr"))
      return cInvoicelineIdr;
    else if (fieldName.equalsIgnoreCase("zsfi_macctline_id") || fieldName.equals("zsfiMacctlineId"))
      return zsfiMacctlineId;
    else if (fieldName.equalsIgnoreCase("zsfi_macctline_idr") || fieldName.equals("zsfiMacctlineIdr"))
      return zsfiMacctlineIdr;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("a_asset_costcenter_v_id") || fieldName.equals("aAssetCostcenterVId"))
      return aAssetCostcenterVId;
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
  public static CreatedamountsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String aAssetId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, aAssetId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static CreatedamountsData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String aAssetId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(A_ASSET_COSTCENTER_V.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = A_ASSET_COSTCENTER_V.CreatedBy) as CreatedByR, " +
      "        to_char(A_ASSET_COSTCENTER_V.Updated, ?) as updated, " +
      "        to_char(A_ASSET_COSTCENTER_V.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        A_ASSET_COSTCENTER_V.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = A_ASSET_COSTCENTER_V.UpdatedBy) as UpdatedByR," +
      "        A_ASSET_COSTCENTER_V.A_Asset_ID, " +
      "(CASE WHEN A_ASSET_COSTCENTER_V.A_Asset_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS A_Asset_IDR, " +
      "A_ASSET_COSTCENTER_V.AD_Org_ID, " +
      "(CASE WHEN A_ASSET_COSTCENTER_V.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "A_ASSET_COSTCENTER_V.Documentno, " +
      "A_ASSET_COSTCENTER_V.M_Product_ID, " +
      "(CASE WHEN A_ASSET_COSTCENTER_V.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "A_ASSET_COSTCENTER_V.Description, " +
      "A_ASSET_COSTCENTER_V.Dateordered, " +
      "A_ASSET_COSTCENTER_V.Amt, " +
      "A_ASSET_COSTCENTER_V.C_Invoiceline_ID, " +
      "(CASE WHEN A_ASSET_COSTCENTER_V.C_Invoiceline_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table5.DateInvoiced, 'DD-MM-YYYY')),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.GrandTotal), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.LineNetAmt), ''))),'') ) END) AS C_Invoiceline_IDR, " +
      "A_ASSET_COSTCENTER_V.Zsfi_Macctline_ID, " +
      "(CASE WHEN A_ASSET_COSTCENTER_V.Zsfi_Macctline_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Description), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Line), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Amt), ''))),'') ) END) AS Zsfi_Macctline_IDR, " +
      "A_ASSET_COSTCENTER_V.Value, " +
      "A_ASSET_COSTCENTER_V.AD_Client_ID, " +
      "A_ASSET_COSTCENTER_V.A_Asset_Costcenter_V_ID, " +
      "COALESCE(A_ASSET_COSTCENTER_V.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM A_ASSET_COSTCENTER_V left join (select A_Asset_ID, Name from A_Asset) table1 on (A_ASSET_COSTCENTER_V.A_Asset_ID = table1.A_Asset_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (A_ASSET_COSTCENTER_V.AD_Org_ID = table2.AD_Org_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (A_ASSET_COSTCENTER_V.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select C_Invoiceline_ID, C_Invoice_ID, Line, LineNetAmt from C_Invoiceline) table4 on (A_ASSET_COSTCENTER_V.C_Invoiceline_ID = table4.C_Invoiceline_ID) left join (select C_Invoice_ID, DocumentNo, DateInvoiced, GrandTotal from C_Invoice) table5 on (table4.C_Invoice_ID = table5.C_Invoice_ID) left join (select Zsfi_Macctline_ID, Zsfi_Manualacct_ID, Line, Amt from Zsfi_Macctline) table6 on (A_ASSET_COSTCENTER_V.Zsfi_Macctline_ID = table6.Zsfi_Macctline_ID) left join (select Zsfi_Manualacct_ID, Description, DocumentNo from Zsfi_Manualacct) table7 on (table6.Zsfi_Manualacct_ID = table7.Zsfi_Manualacct_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((aAssetId==null || aAssetId.equals(""))?"":"  AND A_ASSET_COSTCENTER_V.A_Asset_ID = ?  ");
    strSql = strSql + 
      "        AND A_ASSET_COSTCENTER_V.A_Asset_Costcenter_V_ID = ? " +
      "        AND A_ASSET_COSTCENTER_V.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND A_ASSET_COSTCENTER_V.AD_Org_ID IN (";
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
      if (aAssetId != null && !(aAssetId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
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
        CreatedamountsData objectCreatedamountsData = new CreatedamountsData();
        objectCreatedamountsData.created = UtilSql.getValue(result, "created");
        objectCreatedamountsData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectCreatedamountsData.updated = UtilSql.getValue(result, "updated");
        objectCreatedamountsData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectCreatedamountsData.updatedby = UtilSql.getValue(result, "updatedby");
        objectCreatedamountsData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectCreatedamountsData.aAssetId = UtilSql.getValue(result, "a_asset_id");
        objectCreatedamountsData.aAssetIdr = UtilSql.getValue(result, "a_asset_idr");
        objectCreatedamountsData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCreatedamountsData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectCreatedamountsData.documentno = UtilSql.getValue(result, "documentno");
        objectCreatedamountsData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCreatedamountsData.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectCreatedamountsData.description = UtilSql.getValue(result, "description");
        objectCreatedamountsData.dateordered = UtilSql.getDateValue(result, "dateordered", "dd-MM-yyyy");
        objectCreatedamountsData.amt = UtilSql.getValue(result, "amt");
        objectCreatedamountsData.cInvoicelineId = UtilSql.getValue(result, "c_invoiceline_id");
        objectCreatedamountsData.cInvoicelineIdr = UtilSql.getValue(result, "c_invoiceline_idr");
        objectCreatedamountsData.zsfiMacctlineId = UtilSql.getValue(result, "zsfi_macctline_id");
        objectCreatedamountsData.zsfiMacctlineIdr = UtilSql.getValue(result, "zsfi_macctline_idr");
        objectCreatedamountsData.value = UtilSql.getValue(result, "value");
        objectCreatedamountsData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectCreatedamountsData.aAssetCostcenterVId = UtilSql.getValue(result, "a_asset_costcenter_v_id");
        objectCreatedamountsData.isactive = UtilSql.getValue(result, "isactive");
        objectCreatedamountsData.language = UtilSql.getValue(result, "language");
        objectCreatedamountsData.adUserClient = "";
        objectCreatedamountsData.adOrgClient = "";
        objectCreatedamountsData.createdby = "";
        objectCreatedamountsData.trBgcolor = "";
        objectCreatedamountsData.totalCount = "";
        objectCreatedamountsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCreatedamountsData);
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
    CreatedamountsData objectCreatedamountsData[] = new CreatedamountsData[vector.size()];
    vector.copyInto(objectCreatedamountsData);
    return(objectCreatedamountsData);
  }

/**
Create a registry
 */
  public static CreatedamountsData[] set(String aAssetId, String dateordered, String description, String documentno, String updatedby, String updatedbyr, String mProductId, String mProductIdr, String createdby, String createdbyr, String adOrgId, String aAssetCostcenterVId, String isactive, String zsfiMacctlineId, String value, String amt, String adClientId, String cInvoicelineId)    throws ServletException {
    CreatedamountsData objectCreatedamountsData[] = new CreatedamountsData[1];
    objectCreatedamountsData[0] = new CreatedamountsData();
    objectCreatedamountsData[0].created = "";
    objectCreatedamountsData[0].createdbyr = createdbyr;
    objectCreatedamountsData[0].updated = "";
    objectCreatedamountsData[0].updatedTimeStamp = "";
    objectCreatedamountsData[0].updatedby = updatedby;
    objectCreatedamountsData[0].updatedbyr = updatedbyr;
    objectCreatedamountsData[0].aAssetId = aAssetId;
    objectCreatedamountsData[0].aAssetIdr = "";
    objectCreatedamountsData[0].adOrgId = adOrgId;
    objectCreatedamountsData[0].adOrgIdr = "";
    objectCreatedamountsData[0].documentno = documentno;
    objectCreatedamountsData[0].mProductId = mProductId;
    objectCreatedamountsData[0].mProductIdr = mProductIdr;
    objectCreatedamountsData[0].description = description;
    objectCreatedamountsData[0].dateordered = dateordered;
    objectCreatedamountsData[0].amt = amt;
    objectCreatedamountsData[0].cInvoicelineId = cInvoicelineId;
    objectCreatedamountsData[0].cInvoicelineIdr = "";
    objectCreatedamountsData[0].zsfiMacctlineId = zsfiMacctlineId;
    objectCreatedamountsData[0].zsfiMacctlineIdr = "";
    objectCreatedamountsData[0].value = value;
    objectCreatedamountsData[0].adClientId = adClientId;
    objectCreatedamountsData[0].aAssetCostcenterVId = aAssetCostcenterVId;
    objectCreatedamountsData[0].isactive = isactive;
    objectCreatedamountsData[0].language = "";
    return objectCreatedamountsData;
  }

/**
Select for auxiliar field
 */
  public static String selectDefB1B199FA979643B2A5CCD981A8830C35_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef980C0BAC113D4D138E504112D6B537F9_1(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef76382B82D32F4D9BA6F3736915D76E63_2(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT A_ASSET_COSTCENTER_V.A_Asset_ID AS NAME" +
      "        FROM A_ASSET_COSTCENTER_V" +
      "        WHERE A_ASSET_COSTCENTER_V.A_Asset_Costcenter_V_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String aAssetId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM A_Asset left join (select A_Asset_ID, Name from A_Asset) table1 on (A_Asset.A_Asset_ID = table1.A_Asset_ID) WHERE A_Asset.A_Asset_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String aAssetId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM A_Asset left join (select A_Asset_ID, Name from A_Asset) table1 on (A_Asset.A_Asset_ID = table1.A_Asset_ID) WHERE A_Asset.A_Asset_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);

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
      "        UPDATE A_ASSET_COSTCENTER_V" +
      "        SET A_Asset_ID = (?) , AD_Org_ID = (?) , Documentno = (?) , M_Product_ID = (?) , Description = (?) , Dateordered = TO_DATE(?) , Amt = TO_NUMBER(?) , C_Invoiceline_ID = (?) , Zsfi_Macctline_ID = (?) , Value = (?) , AD_Client_ID = (?) , A_Asset_Costcenter_V_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE A_ASSET_COSTCENTER_V.A_Asset_Costcenter_V_ID = ? " +
      "                 AND A_ASSET_COSTCENTER_V.A_Asset_ID = ? " +
      "        AND A_ASSET_COSTCENTER_V.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND A_ASSET_COSTCENTER_V.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiMacctlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetCostcenterVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetCostcenterVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
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
      "        INSERT INTO A_ASSET_COSTCENTER_V " +
      "        (A_Asset_ID, AD_Org_ID, Documentno, M_Product_ID, Description, Dateordered, Amt, C_Invoiceline_ID, Zsfi_Macctline_ID, Value, AD_Client_ID, A_Asset_Costcenter_V_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), TO_DATE(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateordered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cInvoicelineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiMacctlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetCostcenterVId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String aAssetId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM A_ASSET_COSTCENTER_V" +
      "        WHERE A_ASSET_COSTCENTER_V.A_Asset_Costcenter_V_ID = ? " +
      "                 AND A_ASSET_COSTCENTER_V.A_Asset_ID = ? " +
      "        AND A_ASSET_COSTCENTER_V.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND A_ASSET_COSTCENTER_V.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String aAssetId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM A_ASSET_COSTCENTER_V" +
      "        WHERE A_ASSET_COSTCENTER_V.A_Asset_Costcenter_V_ID = ? " +
      "                 AND A_ASSET_COSTCENTER_V.A_Asset_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aAssetId);

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
      "          FROM A_ASSET_COSTCENTER_V" +
      "         WHERE A_ASSET_COSTCENTER_V.A_Asset_Costcenter_V_ID = ? ";

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
      "          FROM A_ASSET_COSTCENTER_V" +
      "         WHERE A_ASSET_COSTCENTER_V.A_Asset_Costcenter_V_ID = ? ";

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
