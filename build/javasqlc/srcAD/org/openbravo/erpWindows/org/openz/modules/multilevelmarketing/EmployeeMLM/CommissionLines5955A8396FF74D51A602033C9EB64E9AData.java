//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openz.modules.multilevelmarketing.EmployeeMLM;

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
class CommissionLines5955A8396FF74D51A602033C9EB64E9AData implements FieldProvider {
static Logger log4j = Logger.getLogger(CommissionLines5955A8396FF74D51A602033C9EB64E9AData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cCommissionId;
  public String cCommissionIdr;
  public String line;
  public String isactive;
  public String mProductCategoryId;
  public String mProductCategoryIdr;
  public String amtmultiplier;
  public String salesvolumefrom;
  public String convertedturnover;
  public String cCommissionlineId;
  public String adClientId;
  public String isshareofturnover;
  public String commissionorders;
  public String amtsubtract;
  public String qtymultiplier;
  public String qtysubtract;
  public String ispositiveonly;
  public String adOrgId;
  public String description;
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
    else if (fieldName.equalsIgnoreCase("c_commission_id") || fieldName.equals("cCommissionId"))
      return cCommissionId;
    else if (fieldName.equalsIgnoreCase("c_commission_idr") || fieldName.equals("cCommissionIdr"))
      return cCommissionIdr;
    else if (fieldName.equalsIgnoreCase("line"))
      return line;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("m_product_category_id") || fieldName.equals("mProductCategoryId"))
      return mProductCategoryId;
    else if (fieldName.equalsIgnoreCase("m_product_category_idr") || fieldName.equals("mProductCategoryIdr"))
      return mProductCategoryIdr;
    else if (fieldName.equalsIgnoreCase("amtmultiplier"))
      return amtmultiplier;
    else if (fieldName.equalsIgnoreCase("salesvolumefrom"))
      return salesvolumefrom;
    else if (fieldName.equalsIgnoreCase("convertedturnover"))
      return convertedturnover;
    else if (fieldName.equalsIgnoreCase("c_commissionline_id") || fieldName.equals("cCommissionlineId"))
      return cCommissionlineId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("isshareofturnover"))
      return isshareofturnover;
    else if (fieldName.equalsIgnoreCase("commissionorders"))
      return commissionorders;
    else if (fieldName.equalsIgnoreCase("amtsubtract"))
      return amtsubtract;
    else if (fieldName.equalsIgnoreCase("qtymultiplier"))
      return qtymultiplier;
    else if (fieldName.equalsIgnoreCase("qtysubtract"))
      return qtysubtract;
    else if (fieldName.equalsIgnoreCase("ispositiveonly"))
      return ispositiveonly;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
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
  public static CommissionLines5955A8396FF74D51A602033C9EB64E9AData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cCommissionId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cCommissionId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static CommissionLines5955A8396FF74D51A602033C9EB64E9AData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cCommissionId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_CommissionLine.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_CommissionLine.CreatedBy) as CreatedByR, " +
      "        to_char(C_CommissionLine.Updated, ?) as updated, " +
      "        to_char(C_CommissionLine.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_CommissionLine.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_CommissionLine.UpdatedBy) as UpdatedByR," +
      "        C_CommissionLine.C_Commission_ID, " +
      "(CASE WHEN C_CommissionLine.C_Commission_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_Commission_IDR, " +
      "C_CommissionLine.Line, " +
      "COALESCE(C_CommissionLine.IsActive, 'N') AS IsActive, " +
      "C_CommissionLine.M_Product_Category_ID, " +
      "(CASE WHEN C_CommissionLine.M_Product_Category_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS M_Product_Category_IDR, " +
      "C_CommissionLine.AmtMultiplier, " +
      "C_CommissionLine.Salesvolumefrom, " +
      "C_CommissionLine.Convertedturnover, " +
      "C_CommissionLine.C_CommissionLine_ID, " +
      "C_CommissionLine.AD_Client_ID, " +
      "COALESCE(C_CommissionLine.Isshareofturnover, 'N') AS Isshareofturnover, " +
      "COALESCE(C_CommissionLine.CommissionOrders, 'N') AS CommissionOrders, " +
      "C_CommissionLine.AmtSubtract, " +
      "C_CommissionLine.QtyMultiplier, " +
      "C_CommissionLine.QtySubtract, " +
      "COALESCE(C_CommissionLine.IsPositiveOnly, 'N') AS IsPositiveOnly, " +
      "C_CommissionLine.AD_Org_ID, " +
      "C_CommissionLine.Description, " +
      "        ? AS LANGUAGE " +
      "        FROM C_CommissionLine left join (select C_Commission_ID, Name from C_Commission) table1 on (C_CommissionLine.C_Commission_ID = table1.C_Commission_ID) left join (select M_Product_Category_ID, Name from M_Product_Category) table2 on (C_CommissionLine.M_Product_Category_ID = table2.M_Product_Category_ID)" +
      "        WHERE 2=2 " +
      " AND c_commissionline.isshareofturnover='N'" +
      "        AND 1=1 ";
    strSql = strSql + ((cCommissionId==null || cCommissionId.equals(""))?"":"  AND C_CommissionLine.C_Commission_ID = ?  ");
    strSql = strSql + 
      "        AND C_CommissionLine.C_CommissionLine_ID = ? " +
      "        AND C_CommissionLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_CommissionLine.AD_Org_ID IN (";
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
      if (cCommissionId != null && !(cCommissionId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
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
        CommissionLines5955A8396FF74D51A602033C9EB64E9AData objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData = new CommissionLines5955A8396FF74D51A602033C9EB64E9AData();
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.created = UtilSql.getValue(result, "created");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.updated = UtilSql.getValue(result, "updated");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.updatedby = UtilSql.getValue(result, "updatedby");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.cCommissionId = UtilSql.getValue(result, "c_commission_id");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.cCommissionIdr = UtilSql.getValue(result, "c_commission_idr");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.line = UtilSql.getValue(result, "line");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.isactive = UtilSql.getValue(result, "isactive");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.mProductCategoryId = UtilSql.getValue(result, "m_product_category_id");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.mProductCategoryIdr = UtilSql.getValue(result, "m_product_category_idr");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.amtmultiplier = UtilSql.getValue(result, "amtmultiplier");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.salesvolumefrom = UtilSql.getValue(result, "salesvolumefrom");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.convertedturnover = UtilSql.getValue(result, "convertedturnover");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.cCommissionlineId = UtilSql.getValue(result, "c_commissionline_id");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.isshareofturnover = UtilSql.getValue(result, "isshareofturnover");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.commissionorders = UtilSql.getValue(result, "commissionorders");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.amtsubtract = UtilSql.getValue(result, "amtsubtract");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.qtymultiplier = UtilSql.getValue(result, "qtymultiplier");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.qtysubtract = UtilSql.getValue(result, "qtysubtract");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.ispositiveonly = UtilSql.getValue(result, "ispositiveonly");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.description = UtilSql.getValue(result, "description");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.language = UtilSql.getValue(result, "language");
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.adUserClient = "";
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.adOrgClient = "";
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.createdby = "";
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.trBgcolor = "";
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.totalCount = "";
        objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData);
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
    CommissionLines5955A8396FF74D51A602033C9EB64E9AData objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[] = new CommissionLines5955A8396FF74D51A602033C9EB64E9AData[vector.size()];
    vector.copyInto(objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData);
    return(objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData);
  }

/**
Create a registry
 */
  public static CommissionLines5955A8396FF74D51A602033C9EB64E9AData[] set(String cCommissionId, String ispositiveonly, String qtymultiplier, String salesvolumefrom, String createdby, String createdbyr, String amtsubtract, String adOrgId, String updatedby, String updatedbyr, String isshareofturnover, String isactive, String line, String cCommissionlineId, String convertedturnover, String amtmultiplier, String description, String adClientId, String mProductCategoryId, String qtysubtract, String commissionorders)    throws ServletException {
    CommissionLines5955A8396FF74D51A602033C9EB64E9AData objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[] = new CommissionLines5955A8396FF74D51A602033C9EB64E9AData[1];
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0] = new CommissionLines5955A8396FF74D51A602033C9EB64E9AData();
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].created = "";
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].createdbyr = createdbyr;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].updated = "";
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].updatedTimeStamp = "";
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].updatedby = updatedby;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].updatedbyr = updatedbyr;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].cCommissionId = cCommissionId;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].cCommissionIdr = "";
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].line = line;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].isactive = isactive;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].mProductCategoryId = mProductCategoryId;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].mProductCategoryIdr = "";
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].amtmultiplier = amtmultiplier;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].salesvolumefrom = salesvolumefrom;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].convertedturnover = convertedturnover;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].cCommissionlineId = cCommissionlineId;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].adClientId = adClientId;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].isshareofturnover = isshareofturnover;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].commissionorders = commissionorders;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].amtsubtract = amtsubtract;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].qtymultiplier = qtymultiplier;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].qtysubtract = qtysubtract;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].ispositiveonly = ispositiveonly;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].adOrgId = adOrgId;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].description = description;
    objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData[0].language = "";
    return objectCommissionLines5955A8396FF74D51A602033C9EB64E9AData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef5705_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef5707_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
  public static String selectDef5709(ConnectionProvider connectionProvider, String C_Commission_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_CommissionLine WHERE C_Commission_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Commission_ID);

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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_CommissionLine.C_Commission_ID AS NAME" +
      "        FROM C_CommissionLine" +
      "        WHERE C_CommissionLine.C_CommissionLine_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String cCommissionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_Commission left join (select C_Commission_ID, Name from C_Commission) table1 on (C_Commission.C_Commission_ID = table1.C_Commission_ID) WHERE C_Commission.C_Commission_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cCommissionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_Commission left join (select C_Commission_ID, Name from C_Commission) table1 on (C_Commission.C_Commission_ID = table1.C_Commission_ID) WHERE C_Commission.C_Commission_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);

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
      "        UPDATE C_CommissionLine" +
      "        SET C_Commission_ID = (?) , Line = TO_NUMBER(?) , IsActive = (?) , M_Product_Category_ID = (?) , AmtMultiplier = TO_NUMBER(?) , Salesvolumefrom = TO_NUMBER(?) , Convertedturnover = TO_NUMBER(?) , C_CommissionLine_ID = (?) , AD_Client_ID = (?) , Isshareofturnover = (?) , CommissionOrders = (?) , AmtSubtract = TO_NUMBER(?) , QtyMultiplier = TO_NUMBER(?) , QtySubtract = TO_NUMBER(?) , IsPositiveOnly = (?) , AD_Org_ID = (?) , Description = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_CommissionLine.C_CommissionLine_ID = ? " +
      "                 AND C_CommissionLine.C_Commission_ID = ? " +
      "        AND C_CommissionLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_CommissionLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amtmultiplier);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesvolumefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, convertedturnover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isshareofturnover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, commissionorders);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amtsubtract);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymultiplier);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtysubtract);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispositiveonly);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
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
      "        INSERT INTO C_CommissionLine " +
      "        (C_Commission_ID, Line, IsActive, M_Product_Category_ID, AmtMultiplier, Salesvolumefrom, Convertedturnover, C_CommissionLine_ID, AD_Client_ID, Isshareofturnover, CommissionOrders, AmtSubtract, QtyMultiplier, QtySubtract, IsPositiveOnly, AD_Org_ID, Description, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductCategoryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amtmultiplier);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesvolumefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, convertedturnover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionlineId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isshareofturnover);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, commissionorders);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amtsubtract);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtymultiplier);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qtysubtract);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ispositiveonly);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cCommissionId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_CommissionLine" +
      "        WHERE C_CommissionLine.C_CommissionLine_ID = ? " +
      "                 AND C_CommissionLine.C_Commission_ID = ? " +
      "        AND C_CommissionLine.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_CommissionLine.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String cCommissionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_CommissionLine" +
      "        WHERE C_CommissionLine.C_CommissionLine_ID = ? " +
      "                 AND C_CommissionLine.C_Commission_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCommissionId);

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
      "          FROM C_CommissionLine" +
      "         WHERE C_CommissionLine.C_CommissionLine_ID = ? ";

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
      "          FROM C_CommissionLine" +
      "         WHERE C_CommissionLine.C_CommissionLine_ID = ? ";

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
