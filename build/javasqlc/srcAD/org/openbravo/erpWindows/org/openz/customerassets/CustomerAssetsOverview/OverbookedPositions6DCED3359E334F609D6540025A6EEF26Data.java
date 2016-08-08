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
class OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data implements FieldProvider {
static Logger log4j = Logger.getLogger(OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String mProductId;
  public String mProductIdr;
  public String overbookedqty;
  public String mWarehouseId;
  public String mWarehouseIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String isactive;
  public String caOverbookedbulkpositionsVId;
  public String cUomId;
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
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("overbookedqty"))
      return overbookedqty;
    else if (fieldName.equalsIgnoreCase("m_warehouse_id") || fieldName.equals("mWarehouseId"))
      return mWarehouseId;
    else if (fieldName.equalsIgnoreCase("m_warehouse_idr") || fieldName.equals("mWarehouseIdr"))
      return mWarehouseIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ca_overbookedbulkpositions_v_id") || fieldName.equals("caOverbookedbulkpositionsVId"))
      return caOverbookedbulkpositionsVId;
    else if (fieldName.equalsIgnoreCase("c_uom_id") || fieldName.equals("cUomId"))
      return cUomId;
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
  public static OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(ca_overbookedbulkpositions_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ca_overbookedbulkpositions_v.CreatedBy) as CreatedByR, " +
      "        to_char(ca_overbookedbulkpositions_v.Updated, ?) as updated, " +
      "        to_char(ca_overbookedbulkpositions_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        ca_overbookedbulkpositions_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ca_overbookedbulkpositions_v.UpdatedBy) as UpdatedByR," +
      "        ca_overbookedbulkpositions_v.M_Product_ID, " +
      "(CASE WHEN ca_overbookedbulkpositions_v.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "ca_overbookedbulkpositions_v.Overbookedqty, " +
      "ca_overbookedbulkpositions_v.M_Warehouse_ID, " +
      "(CASE WHEN ca_overbookedbulkpositions_v.M_Warehouse_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS M_Warehouse_IDR, " +
      "ca_overbookedbulkpositions_v.AD_Org_ID, " +
      "(CASE WHEN ca_overbookedbulkpositions_v.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "COALESCE(ca_overbookedbulkpositions_v.Isactive, 'N') AS Isactive, " +
      "ca_overbookedbulkpositions_v.CA_Overbookedbulkpositions_V_ID, " +
      "ca_overbookedbulkpositions_v.C_Uom_ID, " +
      "ca_overbookedbulkpositions_v.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM ca_overbookedbulkpositions_v left join (select M_Product_ID, Value, Name from M_Product) table1 on (ca_overbookedbulkpositions_v.M_Product_ID = table1.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL1 on (table1.M_Product_ID = tableTRL1.M_Product_ID and tableTRL1.AD_Language = ?)  left join (select M_Warehouse_ID, Name from M_Warehouse) table2 on (ca_overbookedbulkpositions_v.M_Warehouse_ID = table2.M_Warehouse_ID) left join (select AD_Org_ID, Name from AD_Org) table3 on (ca_overbookedbulkpositions_v.AD_Org_ID = table3.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND ca_overbookedbulkpositions_v.CA_Overbookedbulkpositions_V_ID = ? " +
      "        AND ca_overbookedbulkpositions_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND ca_overbookedbulkpositions_v.AD_Org_ID IN (";
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
        OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data = new OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data();
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.created = UtilSql.getValue(result, "created");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.updated = UtilSql.getValue(result, "updated");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.overbookedqty = UtilSql.getValue(result, "overbookedqty");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.mWarehouseId = UtilSql.getValue(result, "m_warehouse_id");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.mWarehouseIdr = UtilSql.getValue(result, "m_warehouse_idr");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.isactive = UtilSql.getValue(result, "isactive");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.caOverbookedbulkpositionsVId = UtilSql.getValue(result, "ca_overbookedbulkpositions_v_id");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.cUomId = UtilSql.getValue(result, "c_uom_id");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.language = UtilSql.getValue(result, "language");
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.adUserClient = "";
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.adOrgClient = "";
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.createdby = "";
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.trBgcolor = "";
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.totalCount = "";
        objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data);
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
    OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[] = new OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[vector.size()];
    vector.copyInto(objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data);
    return(objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data);
  }

/**
Create a registry
 */
  public static OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[] set(String cUomId, String adClientId, String isactive, String mWarehouseId, String mProductId, String mProductIdr, String adOrgId, String caOverbookedbulkpositionsVId, String updatedby, String updatedbyr, String createdby, String createdbyr, String overbookedqty)    throws ServletException {
    OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[] = new OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[1];
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0] = new OverbookedPositions6DCED3359E334F609D6540025A6EEF26Data();
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].created = "";
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].createdbyr = createdbyr;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].updated = "";
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].updatedTimeStamp = "";
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].updatedby = updatedby;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].updatedbyr = updatedbyr;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].mProductId = mProductId;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].mProductIdr = mProductIdr;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].overbookedqty = overbookedqty;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].mWarehouseId = mWarehouseId;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].mWarehouseIdr = "";
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].adOrgId = adOrgId;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].adOrgIdr = "";
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].isactive = isactive;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].caOverbookedbulkpositionsVId = caOverbookedbulkpositionsVId;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].cUomId = cUomId;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].adClientId = adClientId;
    objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data[0].language = "";
    return objectOverbookedPositions6DCED3359E334F609D6540025A6EEF26Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefA6D4C76405074554827451120B99F7AC_0(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef14428C20DA534AFA8C90F2029F595F17_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDefB4CD38E9B4CB4A72B3C6772095F02BB3_2(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE ca_overbookedbulkpositions_v" +
      "        SET M_Product_ID = (?) , Overbookedqty = TO_NUMBER(?) , M_Warehouse_ID = (?) , AD_Org_ID = (?) , Isactive = (?) , CA_Overbookedbulkpositions_V_ID = (?) , C_Uom_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE ca_overbookedbulkpositions_v.CA_Overbookedbulkpositions_V_ID = ? " +
      "        AND ca_overbookedbulkpositions_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ca_overbookedbulkpositions_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, overbookedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caOverbookedbulkpositionsVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caOverbookedbulkpositionsVId);
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
      "        INSERT INTO ca_overbookedbulkpositions_v " +
      "        (M_Product_ID, Overbookedqty, M_Warehouse_ID, AD_Org_ID, Isactive, CA_Overbookedbulkpositions_V_ID, C_Uom_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, overbookedqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caOverbookedbulkpositionsVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUomId);
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
      "        DELETE FROM ca_overbookedbulkpositions_v" +
      "        WHERE ca_overbookedbulkpositions_v.CA_Overbookedbulkpositions_V_ID = ? " +
      "        AND ca_overbookedbulkpositions_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ca_overbookedbulkpositions_v.AD_Org_ID IN (";
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
      "        DELETE FROM ca_overbookedbulkpositions_v" +
      "        WHERE ca_overbookedbulkpositions_v.CA_Overbookedbulkpositions_V_ID = ? ";

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
      "          FROM ca_overbookedbulkpositions_v" +
      "         WHERE ca_overbookedbulkpositions_v.CA_Overbookedbulkpositions_V_ID = ? ";

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
      "          FROM ca_overbookedbulkpositions_v" +
      "         WHERE ca_overbookedbulkpositions_v.CA_Overbookedbulkpositions_V_ID = ? ";

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
