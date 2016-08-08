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
class ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data implements FieldProvider {
static Logger log4j = Logger.getLogger(ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.class);
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
  public String mProductId;
  public String mProductIdr;
  public String isactive;
  public String name;
  public String note;
  public String value;
  public String elrsProductNotesId;
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
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("note"))
      return note;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("elrs_product_notes_id") || fieldName.equals("elrsProductNotesId"))
      return elrsProductNotesId;
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
  public static ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mProductId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, mProductId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String mProductId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(elrs_product_notes.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = elrs_product_notes.CreatedBy) as CreatedByR, " +
      "        to_char(elrs_product_notes.Updated, ?) as updated, " +
      "        to_char(elrs_product_notes.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        elrs_product_notes.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = elrs_product_notes.UpdatedBy) as UpdatedByR," +
      "        elrs_product_notes.AD_Client_ID, " +
      "(CASE WHEN elrs_product_notes.AD_Client_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Client_IDR, " +
      "elrs_product_notes.AD_Org_ID, " +
      "(CASE WHEN elrs_product_notes.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "elrs_product_notes.M_Product_ID, " +
      "(CASE WHEN elrs_product_notes.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "COALESCE(elrs_product_notes.Isactive, 'N') AS Isactive, " +
      "elrs_product_notes.Name, " +
      "elrs_product_notes.Note, " +
      "elrs_product_notes.Value, " +
      "elrs_product_notes.Elrs_Product_Notes_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM elrs_product_notes left join (select AD_Client_ID, Name from AD_Client) table1 on (elrs_product_notes.AD_Client_ID = table1.AD_Client_ID) left join (select AD_Org_ID, Name from AD_Org) table2 on (elrs_product_notes.AD_Org_ID = table2.AD_Org_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (elrs_product_notes.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((mProductId==null || mProductId.equals(""))?"":"  AND elrs_product_notes.M_Product_ID = ?  ");
    strSql = strSql + 
      "        AND elrs_product_notes.Elrs_Product_Notes_ID = ? " +
      "        AND elrs_product_notes.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND elrs_product_notes.AD_Org_ID IN (";
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
        ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data = new ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data();
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.created = UtilSql.getValue(result, "created");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.updated = UtilSql.getValue(result, "updated");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.adClientIdr = UtilSql.getValue(result, "ad_client_idr");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.isactive = UtilSql.getValue(result, "isactive");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.name = UtilSql.getValue(result, "name");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.note = UtilSql.getValue(result, "note");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.value = UtilSql.getValue(result, "value");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.elrsProductNotesId = UtilSql.getValue(result, "elrs_product_notes_id");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.language = UtilSql.getValue(result, "language");
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.adUserClient = "";
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.adOrgClient = "";
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.createdby = "";
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.trBgcolor = "";
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.totalCount = "";
        objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data);
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
    ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[] = new ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[vector.size()];
    vector.copyInto(objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data);
    return(objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data);
  }

/**
Create a registry
 */
  public static ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[] set(String mProductId, String updatedby, String updatedbyr, String adOrgId, String createdby, String createdbyr, String mProductIdr, String name, String elrsProductNotesId, String adClientId, String value, String isactive, String note)    throws ServletException {
    ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[] = new ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[1];
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0] = new ProductNote9E6795660D1C42B9AAF33DD0D89E7600Data();
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].created = "";
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].createdbyr = createdbyr;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].updated = "";
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].updatedTimeStamp = "";
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].updatedby = updatedby;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].updatedbyr = updatedbyr;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].adClientId = adClientId;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].adClientIdr = "";
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].adOrgId = adOrgId;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].adOrgIdr = "";
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].mProductId = mProductId;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].mProductIdr = mProductIdr;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].isactive = isactive;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].name = name;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].note = note;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].value = value;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].elrsProductNotesId = elrsProductNotesId;
    objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data[0].language = "";
    return objectProductNote9E6795660D1C42B9AAF33DD0D89E7600Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef9076595CD84249A0BF882CEBFD332248_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDefB74AB8092EA74EC0920BEF2B7C53029C_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefCAA78B52F91F43EDA536E18569583A31_2(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
      "        SELECT elrs_product_notes.M_Product_ID AS NAME" +
      "        FROM elrs_product_notes" +
      "        WHERE elrs_product_notes.Elrs_Product_Notes_ID = ?";

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
      "        UPDATE elrs_product_notes" +
      "        SET AD_Client_ID = (?) , AD_Org_ID = (?) , M_Product_ID = (?) , Isactive = (?) , Name = (?) , Note = (?) , Value = (?) , Elrs_Product_Notes_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE elrs_product_notes.Elrs_Product_Notes_ID = ? " +
      "                 AND elrs_product_notes.M_Product_ID = ? " +
      "        AND elrs_product_notes.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND elrs_product_notes.AD_Org_ID IN (";
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
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, note);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, elrsProductNotesId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, elrsProductNotesId);
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
      "        INSERT INTO elrs_product_notes " +
      "        (AD_Client_ID, AD_Org_ID, M_Product_ID, Isactive, Name, Note, Value, Elrs_Product_Notes_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, note);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, elrsProductNotesId);
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
      "        DELETE FROM elrs_product_notes" +
      "        WHERE elrs_product_notes.Elrs_Product_Notes_ID = ? " +
      "                 AND elrs_product_notes.M_Product_ID = ? " +
      "        AND elrs_product_notes.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND elrs_product_notes.AD_Org_ID IN (";
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
      "        DELETE FROM elrs_product_notes" +
      "        WHERE elrs_product_notes.Elrs_Product_Notes_ID = ? " +
      "                 AND elrs_product_notes.M_Product_ID = ? ";

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
      "          FROM elrs_product_notes" +
      "         WHERE elrs_product_notes.Elrs_Product_Notes_ID = ? ";

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
      "          FROM elrs_product_notes" +
      "         WHERE elrs_product_notes.Elrs_Product_Notes_ID = ? ";

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
