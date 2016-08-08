//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openz.customerassets.CustomerAssetsOverview;

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
class FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data implements FieldProvider {
static Logger log4j = Logger.getLogger(FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String mProductId;
  public String mProductIdr;
  public String freeqty;
  public String mWarehouseId;
  public String mWarehouseIdr;
  public String isactive;
  public String cUomId;
  public String adClientId;
  public String caFreebulkpositionsVId;
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
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("freeqty"))
      return freeqty;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("m_warehouse_idr") || fieldName.equals("mWarehouseIdr"))
      return mWarehouseIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ca_freebulkpositions_v_id") || fieldName.equals("caFreebulkpositionsVId"))
      return caFreebulkpositionsVId;
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
  public static FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(ca_freebulkpositions_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ca_freebulkpositions_v.CreatedBy) as CreatedByR, " +
      "        to_char(ca_freebulkpositions_v.Updated, ?) as updated, " +
      "        to_char(ca_freebulkpositions_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        ca_freebulkpositions_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ca_freebulkpositions_v.UpdatedBy) as UpdatedByR," +
      "        ca_freebulkpositions_v.AD_Org_ID, " +
      "(CASE WHEN ca_freebulkpositions_v.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "ca_freebulkpositions_v.M_Product_ID, " +
      "(CASE WHEN ca_freebulkpositions_v.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "ca_freebulkpositions_v.Freeqty, " +
      "ca_freebulkpositions_v.M_Warehouse_ID, " +
      "(CASE WHEN ca_freebulkpositions_v.M_Warehouse_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS M_Warehouse_IDR, " +
      "COALESCE(ca_freebulkpositions_v.Isactive, 'N') AS Isactive, " +
      "ca_freebulkpositions_v.C_Uom_ID, " +
      "ca_freebulkpositions_v.AD_Client_ID, " +
      "ca_freebulkpositions_v.CA_Freebulkpositions_V_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM ca_freebulkpositions_v left join (select AD_Org_ID, Name from AD_Org) table1 on (ca_freebulkpositions_v.AD_Org_ID = table1.AD_Org_ID) left join (select M_Product_ID, Value, Name from M_Product) table2 on (ca_freebulkpositions_v.M_Product_ID = table2.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  left join (select M_Warehouse_ID, Name from M_Warehouse) table3 on (ca_freebulkpositions_v.M_Warehouse_ID = table3.M_Warehouse_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND ca_freebulkpositions_v.CA_Freebulkpositions_V_ID = ? " +
      "        AND ca_freebulkpositions_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND ca_freebulkpositions_v.AD_Org_ID IN (";
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
        FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data = new FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data();
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.created = UtilSql.getValue(result, "created");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.updated = UtilSql.getValue(result, "updated");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.freeqty = UtilSql.getValue(result, "freeqty");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.mWarehouseIdr = UtilSql.getValue(result, "m_warehouse_idr");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.isactive = UtilSql.getValue(result, "isactive");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.caFreebulkpositionsVId = UtilSql.getValue(result, "ca_freebulkpositions_v_id");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.language = UtilSql.getValue(result, "language");
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.adUserClient = "";
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.adOrgClient = "";
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.createdby = "";
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.trBgcolor = "";
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.totalCount = "";
        objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data);
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
    FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[] = new FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[vector.size()];
    vector.copyInto(objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data);
    return(objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data);
  }

/**
Create a registry
 */
  public static FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[] set(String cUomId, String createdby, String createdbyr, String freeqty, String mProductId, String mProductIdr, String mWarehouseId, String adOrgId, String adClientId, String isactive, String caFreebulkpositionsVId, String updatedby, String updatedbyr)    throws ServletException {
    FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[] = new FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[1];
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0] = new FreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data();
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].created = "";
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].createdbyr = createdbyr;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].updated = "";
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].updatedTimeStamp = "";
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].updatedby = updatedby;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].updatedbyr = updatedbyr;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].adOrgId = adOrgId;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].adOrgIdr = "";
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].mProductId = mProductId;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].mProductIdr = mProductIdr;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].freeqty = freeqty;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].mWarehouseId = mWarehouseId;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].mWarehouseIdr = "";
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].isactive = isactive;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].cUomId = cUomId;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].adClientId = adClientId;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].caFreebulkpositionsVId = caFreebulkpositionsVId;
    objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data[0].language = "";
    return objectFreeBulkPositions40CADE3B9ECF4B65B6CDED97E1515B57Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefD2F444B07E28446FA0A3332AB4C3EF85_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDefA6D95F8AB07442ACA1A0EA94BD51F503_1(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef839D85BF1EEB4F01AB165412FD3AF023_2(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE ca_freebulkpositions_v" +
      "        SET AD_Org_ID = (?) , M_Product_ID = (?) , Freeqty = TO_NUMBER(?) , M_Warehouse_ID = (?) , Isactive = (?) , C_Uom_ID = (?) , AD_Client_ID = (?) , CA_Freebulkpositions_V_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE ca_freebulkpositions_v.CA_Freebulkpositions_V_ID = ? " +
      "        AND ca_freebulkpositions_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ca_freebulkpositions_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freeqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caFreebulkpositionsVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caFreebulkpositionsVId);
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
      "        INSERT INTO ca_freebulkpositions_v " +
      "        (AD_Org_ID, M_Product_ID, Freeqty, M_Warehouse_ID, Isactive, C_Uom_ID, AD_Client_ID, CA_Freebulkpositions_V_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, freeqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caFreebulkpositionsVId);
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
      "        DELETE FROM ca_freebulkpositions_v" +
      "        WHERE ca_freebulkpositions_v.CA_Freebulkpositions_V_ID = ? " +
      "        AND ca_freebulkpositions_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ca_freebulkpositions_v.AD_Org_ID IN (";
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
      "        DELETE FROM ca_freebulkpositions_v" +
      "        WHERE ca_freebulkpositions_v.CA_Freebulkpositions_V_ID = ? ";

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
      "          FROM ca_freebulkpositions_v" +
      "         WHERE ca_freebulkpositions_v.CA_Freebulkpositions_V_ID = ? ";

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
      "          FROM ca_freebulkpositions_v" +
      "         WHERE ca_freebulkpositions_v.CA_Freebulkpositions_V_ID = ? ";

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
