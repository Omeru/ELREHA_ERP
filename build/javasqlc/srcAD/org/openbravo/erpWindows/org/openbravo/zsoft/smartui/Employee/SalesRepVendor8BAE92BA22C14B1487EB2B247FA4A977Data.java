//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.zsoft.smartui.Employee;

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
class SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data implements FieldProvider {
static Logger log4j = Logger.getLogger(SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String value;
  public String name;
  public String isactive;
  public String isvendor;
  public String paymentrulepo;
  public String paymentrulepor;
  public String poPaymenttermId;
  public String poPaymenttermIdr;
  public String poPricelistId;
  public String poPricelistIdr;
  public String poFixmonthday3;
  public String adOrgId;
  public String poFixmonthday2;
  public String iscreditcard;
  public String cBpartnerId;
  public String poFixmonthday;
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
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("isvendor"))
      return isvendor;
    else if (fieldName.equalsIgnoreCase("paymentrulepo"))
      return paymentrulepo;
    else if (fieldName.equalsIgnoreCase("paymentrulepor"))
      return paymentrulepor;
    else if (fieldName.equalsIgnoreCase("po_paymentterm_id") || fieldName.equals("poPaymenttermId"))
      return poPaymenttermId;
    else if (fieldName.equalsIgnoreCase("po_paymentterm_idr") || fieldName.equals("poPaymenttermIdr"))
      return poPaymenttermIdr;
    else if (fieldName.equalsIgnoreCase("po_pricelist_id") || fieldName.equals("poPricelistId"))
      return poPricelistId;
    else if (fieldName.equalsIgnoreCase("po_pricelist_idr") || fieldName.equals("poPricelistIdr"))
      return poPricelistIdr;
    else if (fieldName.equalsIgnoreCase("po_fixmonthday3") || fieldName.equals("poFixmonthday3"))
      return poFixmonthday3;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("po_fixmonthday2") || fieldName.equals("poFixmonthday2"))
      return poFixmonthday2;
    else if (fieldName.equalsIgnoreCase("iscreditcard"))
      return iscreditcard;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("po_fixmonthday") || fieldName.equals("poFixmonthday"))
      return poFixmonthday;
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
  public static SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPARTNER_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, C_BPARTNER_ID, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String C_BPARTNER_ID, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_BPartner.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BPartner.CreatedBy) as CreatedByR, " +
      "        to_char(C_BPartner.Updated, ?) as updated, " +
      "        to_char(C_BPartner.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_BPartner.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BPartner.UpdatedBy) as UpdatedByR," +
      "        C_BPartner.Value, " +
      "C_BPartner.Name, " +
      "COALESCE(C_BPartner.IsActive, 'N') AS IsActive, " +
      "COALESCE(C_BPartner.IsVendor, 'N') AS IsVendor, " +
      "C_BPartner.PaymentRulePO, " +
      "(CASE WHEN C_BPartner.PaymentRulePO IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS PaymentRulePOR, " +
      "C_BPartner.PO_PaymentTerm_ID, " +
      "(CASE WHEN C_BPartner.PO_PaymentTerm_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS PO_PaymentTerm_IDR, " +
      "C_BPartner.PO_PriceList_ID, " +
      "(CASE WHEN C_BPartner.PO_PriceList_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS PO_PriceList_IDR, " +
      "C_BPartner.PO_Fixmonthday3, " +
      "C_BPartner.AD_Org_ID, " +
      "C_BPartner.PO_Fixmonthday2, " +
      "COALESCE(C_BPartner.IsCreditcard, 'N') AS IsCreditcard, " +
      "C_BPartner.C_BPartner_ID, " +
      "C_BPartner.PO_Fixmonthday, " +
      "C_BPartner.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_BPartner left join ad_ref_list_v list1 on (C_BPartner.PaymentRulePO = list1.value and list1.ad_reference_id = '195' and list1.ad_language = ?)  left join (select C_PaymentTerm_ID, Name from C_PaymentTerm) table1 on (C_BPartner.PO_PaymentTerm_ID =  table1.C_PaymentTerm_ID) left join (select C_PaymentTerm_ID,AD_Language, Name from C_PaymentTerm_TRL) tableTRL1 on (table1.C_PaymentTerm_ID = tableTRL1.C_PaymentTerm_ID and tableTRL1.AD_Language = ?)  left join (select M_PriceList_ID, Name from M_PriceList) table2 on (C_BPartner.PO_PriceList_ID =  table2.M_PriceList_ID)" +
      "        WHERE 2=2 " +
      " AND c_bpartner.C_BPARTNER_ID=?" +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND C_BPartner.C_BPartner_ID = ?  ");
    strSql = strSql + 
      "        AND C_BPartner.C_BPartner_ID = ? " +
      "        AND C_BPartner.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_BPartner.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPARTNER_ID);
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
        SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data = new SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data();
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.created = UtilSql.getValue(result, "created");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.updated = UtilSql.getValue(result, "updated");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.value = UtilSql.getValue(result, "value");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.name = UtilSql.getValue(result, "name");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.isactive = UtilSql.getValue(result, "isactive");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.isvendor = UtilSql.getValue(result, "isvendor");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.paymentrulepo = UtilSql.getValue(result, "paymentrulepo");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.paymentrulepor = UtilSql.getValue(result, "paymentrulepor");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.poPaymenttermId = UtilSql.getValue(result, "po_paymentterm_id");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.poPaymenttermIdr = UtilSql.getValue(result, "po_paymentterm_idr");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.poPricelistId = UtilSql.getValue(result, "po_pricelist_id");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.poPricelistIdr = UtilSql.getValue(result, "po_pricelist_idr");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.poFixmonthday3 = UtilSql.getValue(result, "po_fixmonthday3");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.poFixmonthday2 = UtilSql.getValue(result, "po_fixmonthday2");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.iscreditcard = UtilSql.getValue(result, "iscreditcard");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.poFixmonthday = UtilSql.getValue(result, "po_fixmonthday");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.language = UtilSql.getValue(result, "language");
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.adUserClient = "";
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.adOrgClient = "";
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.createdby = "";
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.trBgcolor = "";
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.totalCount = "";
        objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data);
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
    SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[] = new SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[vector.size()];
    vector.copyInto(objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data);
    return(objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data);
  }

/**
Create a registry
 */
  public static SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[] set(String cBpartnerId, String poPricelistId, String poFixmonthday3, String adOrgId, String value, String name, String paymentrulepo, String isactive, String isvendor, String createdby, String createdbyr, String adClientId, String poPaymenttermId, String iscreditcard, String updatedby, String updatedbyr, String poFixmonthday2, String poFixmonthday)    throws ServletException {
    SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[] = new SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[1];
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0] = new SalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data();
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].created = "";
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].createdbyr = createdbyr;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].updated = "";
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].updatedTimeStamp = "";
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].updatedby = updatedby;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].updatedbyr = updatedbyr;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].value = value;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].name = name;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].isactive = isactive;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].isvendor = isvendor;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].paymentrulepo = paymentrulepo;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].paymentrulepor = "";
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].poPaymenttermId = poPaymenttermId;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].poPaymenttermIdr = "";
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].poPricelistId = poPricelistId;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].poPricelistIdr = "";
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].poFixmonthday3 = poFixmonthday3;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].adOrgId = adOrgId;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].poFixmonthday2 = poFixmonthday2;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].iscreditcard = iscreditcard;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].cBpartnerId = cBpartnerId;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].poFixmonthday = poFixmonthday;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].adClientId = adClientId;
    objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data[0].language = "";
    return objectSalesRepVendor8BAE92BA22C14B1487EB2B247FA4A977Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef2901(ConnectionProvider connectionProvider, String AD_ORG_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT zssi_getNewBPartnerValue(?) ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AD_ORG_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zssi_getnewbpartnervalue");
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
  public static String selectDef2898_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef2900_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        SELECT C_BPartner.C_BPartner_ID AS NAME" +
      "        FROM C_BPartner" +
      "        WHERE C_BPartner.C_BPartner_ID = ?";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(c_bpartneremployee_view.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(c_bpartneremployee_view.Name), ''))) AS NAME FROM c_bpartneremployee_view WHERE c_bpartneremployee_view.C_BPartner_ID = ?  ";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(c_bpartneremployee_view.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(c_bpartneremployee_view.Name), ''))) AS NAME FROM c_bpartneremployee_view WHERE c_bpartneremployee_view.C_BPartner_ID = ?  ";

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
      "        UPDATE C_BPartner" +
      "        SET Value = (?) , Name = (?) , IsActive = (?) , IsVendor = (?) , PaymentRulePO = (?) , PO_PaymentTerm_ID = (?) , PO_PriceList_ID = (?) , PO_Fixmonthday3 = TO_NUMBER(?) , AD_Org_ID = (?) , PO_Fixmonthday2 = TO_NUMBER(?) , IsCreditcard = (?) , C_BPartner_ID = (?) , PO_Fixmonthday = TO_NUMBER(?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_BPartner.C_BPartner_ID = ? " +
      "                 AND C_BPartner.C_BPartner_ID = ? " +
      "        AND C_BPartner.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BPartner.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isvendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrulepo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poFixmonthday3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poFixmonthday2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscreditcard);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poFixmonthday);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
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
      "        INSERT INTO C_BPartner " +
      "        (Value, Name, IsActive, IsVendor, PaymentRulePO, PO_PaymentTerm_ID, PO_PriceList_ID, PO_Fixmonthday3, AD_Org_ID, PO_Fixmonthday2, IsCreditcard, C_BPartner_ID, PO_Fixmonthday, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isvendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentrulepo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poPaymenttermId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poPricelistId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poFixmonthday3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poFixmonthday2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscreditcard);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, poFixmonthday);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cBpartnerId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_BPartner" +
      "        WHERE C_BPartner.C_BPartner_ID = ? " +
      "                 AND C_BPartner.C_BPartner_ID = ? " +
      "        AND C_BPartner.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BPartner.AD_Org_ID IN (";
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
      "        DELETE FROM C_BPartner" +
      "        WHERE C_BPartner.C_BPartner_ID = ? " +
      "                 AND C_BPartner.C_BPartner_ID = ? ";

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
      "          FROM C_BPartner" +
      "         WHERE C_BPartner.C_BPartner_ID = ? ";

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
      "          FROM C_BPartner" +
      "         WHERE C_BPartner.C_BPartner_ID = ? ";

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
