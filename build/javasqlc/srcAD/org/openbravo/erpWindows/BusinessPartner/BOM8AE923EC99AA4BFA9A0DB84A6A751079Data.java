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
class BOM8AE923EC99AA4BFA9A0DB84A6A751079Data implements FieldProvider {
static Logger log4j = Logger.getLogger(BOM8AE923EC99AA4BFA9A0DB84A6A751079Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String caAssetsstockedId;
  public String caAssetsstockedIdr;
  public String mProductId;
  public String mProductIdr;
  public String price;
  public String qty;
  public String amt;
  public String description;
  public String bomqty;
  public String adOrgId;
  public String adClientId;
  public String caAssetsstockedbomId;
  public String isactive;
  public String dateofsale;
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
    else if (fieldName.equalsIgnoreCase("ca_assetsstocked_id") || fieldName.equals("caAssetsstockedId"))
      return caAssetsstockedId;
    else if (fieldName.equalsIgnoreCase("ca_assetsstocked_idr") || fieldName.equals("caAssetsstockedIdr"))
      return caAssetsstockedIdr;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("price"))
      return price;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("amt"))
      return amt;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("bomqty"))
      return bomqty;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ca_assetsstockedbom_id") || fieldName.equals("caAssetsstockedbomId"))
      return caAssetsstockedbomId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("dateofsale"))
      return dateofsale;
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
  public static BOM8AE923EC99AA4BFA9A0DB84A6A751079Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String caAssetsstockedId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, caAssetsstockedId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static BOM8AE923EC99AA4BFA9A0DB84A6A751079Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String caAssetsstockedId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(CA_ASSETSSTOCKEDBOM.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = CA_ASSETSSTOCKEDBOM.CreatedBy) as CreatedByR, " +
      "        to_char(CA_ASSETSSTOCKEDBOM.Updated, ?) as updated, " +
      "        to_char(CA_ASSETSSTOCKEDBOM.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        CA_ASSETSSTOCKEDBOM.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = CA_ASSETSSTOCKEDBOM.UpdatedBy) as UpdatedByR," +
      "        CA_ASSETSSTOCKEDBOM.CA_Assetsstocked_ID, " +
      "(CASE WHEN CA_ASSETSSTOCKEDBOM.CA_Assetsstocked_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Qty), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Serialnumber), ''))),'') ) END) AS CA_Assetsstocked_IDR, " +
      "CA_ASSETSSTOCKEDBOM.M_Product_ID, " +
      "(CASE WHEN CA_ASSETSSTOCKEDBOM.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL6.Name IS NULL THEN TO_CHAR(table6.Name) ELSE TO_CHAR(tableTRL6.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "CA_ASSETSSTOCKEDBOM.Price, " +
      "CA_ASSETSSTOCKEDBOM.Qty, " +
      "CA_ASSETSSTOCKEDBOM.Amt, " +
      "CA_ASSETSSTOCKEDBOM.Description, " +
      "CA_ASSETSSTOCKEDBOM.Bomqty, " +
      "CA_ASSETSSTOCKEDBOM.AD_Org_ID, " +
      "CA_ASSETSSTOCKEDBOM.AD_Client_ID, " +
      "CA_ASSETSSTOCKEDBOM.CA_Assetsstockedbom_ID, " +
      "COALESCE(CA_ASSETSSTOCKEDBOM.Isactive, 'N') AS Isactive, " +
      "CA_ASSETSSTOCKEDBOM.Dateofsale, " +
      "        ? AS LANGUAGE " +
      "        FROM CA_ASSETSSTOCKEDBOM left join (select CA_Assetsstocked_ID, C_BPartner_ID, M_Product_ID, Qty, SNR_Masterdata_id from CA_Assetsstocked) table1 on (CA_ASSETSSTOCKEDBOM.CA_Assetsstocked_ID = table1.CA_Assetsstocked_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (table1.C_BPartner_ID = table2.C_BPartner_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select SNR_Masterdata_id, M_Product_ID, Serialnumber from SNR_Masterdata) table4 on (table1.SNR_Masterdata_id = table4.SNR_Masterdata_id) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table4.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  left join (select M_Product_ID, Value, Name from M_Product) table6 on (CA_ASSETSSTOCKEDBOM.M_Product_ID = table6.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL6 on (table6.M_Product_ID = tableTRL6.M_Product_ID and tableTRL6.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((caAssetsstockedId==null || caAssetsstockedId.equals(""))?"":"  AND CA_ASSETSSTOCKEDBOM.CA_Assetsstocked_ID = ?  ");
    strSql = strSql + 
      "        AND CA_ASSETSSTOCKEDBOM.CA_Assetsstockedbom_ID = ? " +
      "        AND CA_ASSETSSTOCKEDBOM.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND CA_ASSETSSTOCKEDBOM.AD_Org_ID IN (";
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
      if (caAssetsstockedId != null && !(caAssetsstockedId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
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
        BOM8AE923EC99AA4BFA9A0DB84A6A751079Data objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data = new BOM8AE923EC99AA4BFA9A0DB84A6A751079Data();
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.created = UtilSql.getValue(result, "created");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.updated = UtilSql.getValue(result, "updated");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.caAssetsstockedId = UtilSql.getValue(result, "ca_assetsstocked_id");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.caAssetsstockedIdr = UtilSql.getValue(result, "ca_assetsstocked_idr");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.price = UtilSql.getValue(result, "price");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.qty = UtilSql.getValue(result, "qty");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.amt = UtilSql.getValue(result, "amt");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.description = UtilSql.getValue(result, "description");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.bomqty = UtilSql.getValue(result, "bomqty");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.caAssetsstockedbomId = UtilSql.getValue(result, "ca_assetsstockedbom_id");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.isactive = UtilSql.getValue(result, "isactive");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.dateofsale = UtilSql.getDateValue(result, "dateofsale", "dd-MM-yyyy");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.language = UtilSql.getValue(result, "language");
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.adUserClient = "";
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.adOrgClient = "";
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.createdby = "";
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.trBgcolor = "";
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.totalCount = "";
        objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data);
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
    BOM8AE923EC99AA4BFA9A0DB84A6A751079Data objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[] = new BOM8AE923EC99AA4BFA9A0DB84A6A751079Data[vector.size()];
    vector.copyInto(objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data);
    return(objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data);
  }

/**
Create a registry
 */
  public static BOM8AE923EC99AA4BFA9A0DB84A6A751079Data[] set(String caAssetsstockedId, String createdby, String createdbyr, String updatedby, String updatedbyr, String price, String dateofsale, String description, String caAssetsstockedbomId, String bomqty, String isactive, String amt, String qty, String mProductId, String mProductIdr, String adOrgId, String adClientId)    throws ServletException {
    BOM8AE923EC99AA4BFA9A0DB84A6A751079Data objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[] = new BOM8AE923EC99AA4BFA9A0DB84A6A751079Data[1];
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0] = new BOM8AE923EC99AA4BFA9A0DB84A6A751079Data();
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].created = "";
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].createdbyr = createdbyr;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].updated = "";
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].updatedTimeStamp = "";
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].updatedby = updatedby;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].updatedbyr = updatedbyr;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].caAssetsstockedId = caAssetsstockedId;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].caAssetsstockedIdr = "";
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].mProductId = mProductId;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].mProductIdr = mProductIdr;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].price = price;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].qty = qty;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].amt = amt;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].description = description;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].bomqty = bomqty;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].adOrgId = adOrgId;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].adClientId = adClientId;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].caAssetsstockedbomId = caAssetsstockedbomId;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].isactive = isactive;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].dateofsale = dateofsale;
    objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data[0].language = "";
    return objectBOM8AE923EC99AA4BFA9A0DB84A6A751079Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef022E76A8FA794084919FAB58EB78E816_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef297D9C0A758A4B58A43B72D271E2BB56_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDefA05A562191F14F09A97238A274D76532_2(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
      "        SELECT CA_ASSETSSTOCKEDBOM.CA_Assetsstocked_ID AS NAME" +
      "        FROM CA_ASSETSSTOCKEDBOM" +
      "        WHERE CA_ASSETSSTOCKEDBOM.CA_Assetsstockedbom_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String paramLanguage, String caAssetsstockedId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table3.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Qty), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table5.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table4.Serialnumber), ''))) AS NAME FROM CA_Assetsstocked left join (select CA_Assetsstocked_ID, C_BPartner_ID, M_Product_ID, Qty, SNR_Masterdata_id from CA_Assetsstocked) table1 on (CA_Assetsstocked.CA_Assetsstocked_ID = table1.CA_Assetsstocked_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (table1.C_BPartner_ID = table2.C_BPartner_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select SNR_Masterdata_id, M_Product_ID, Serialnumber from SNR_Masterdata) table4 on (table1.SNR_Masterdata_id = table4.SNR_Masterdata_id) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table4.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  WHERE CA_Assetsstocked.CA_Assetsstocked_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String paramLanguage, String caAssetsstockedId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table2.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table3.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.Qty), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table5.Value), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table4.Serialnumber), ''))) AS NAME FROM CA_Assetsstocked left join (select CA_Assetsstocked_ID, C_BPartner_ID, M_Product_ID, Qty, SNR_Masterdata_id from CA_Assetsstocked) table1 on (CA_Assetsstocked.CA_Assetsstocked_ID = table1.CA_Assetsstocked_ID) left join (select C_BPartner_ID, Name from C_BPartner) table2 on (table1.C_BPartner_ID = table2.C_BPartner_ID) left join (select M_Product_ID, Value, Name from M_Product) table3 on (table1.M_Product_ID = table3.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL3 on (table3.M_Product_ID = tableTRL3.M_Product_ID and tableTRL3.AD_Language = ?)  left join (select SNR_Masterdata_id, M_Product_ID, Serialnumber from SNR_Masterdata) table4 on (table1.SNR_Masterdata_id = table4.SNR_Masterdata_id) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table4.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  WHERE CA_Assetsstocked.CA_Assetsstocked_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);

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
      "        UPDATE CA_ASSETSSTOCKEDBOM" +
      "        SET CA_Assetsstocked_ID = (?) , M_Product_ID = (?) , Price = TO_NUMBER(?) , Qty = TO_NUMBER(?) , Amt = TO_NUMBER(?) , Description = (?) , Bomqty = TO_NUMBER(?) , AD_Org_ID = (?) , AD_Client_ID = (?) , CA_Assetsstockedbom_ID = (?) , Isactive = (?) , Dateofsale = TO_DATE(?) , updated = now(), updatedby = ? " +
      "        WHERE CA_ASSETSSTOCKEDBOM.CA_Assetsstockedbom_ID = ? " +
      "                 AND CA_ASSETSSTOCKEDBOM.CA_Assetsstocked_ID = ? " +
      "        AND CA_ASSETSSTOCKEDBOM.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND CA_ASSETSSTOCKEDBOM.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, price);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedbomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateofsale);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedbomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
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
      "        INSERT INTO CA_ASSETSSTOCKEDBOM " +
      "        (CA_Assetsstocked_ID, M_Product_ID, Price, Qty, Amt, Description, Bomqty, AD_Org_ID, AD_Client_ID, CA_Assetsstockedbom_ID, Isactive, Dateofsale, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), (?), TO_NUMBER(?), (?), (?), (?), (?), TO_DATE(?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, price);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, amt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bomqty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedbomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateofsale);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String caAssetsstockedId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM CA_ASSETSSTOCKEDBOM" +
      "        WHERE CA_ASSETSSTOCKEDBOM.CA_Assetsstockedbom_ID = ? " +
      "                 AND CA_ASSETSSTOCKEDBOM.CA_Assetsstocked_ID = ? " +
      "        AND CA_ASSETSSTOCKEDBOM.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND CA_ASSETSSTOCKEDBOM.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String caAssetsstockedId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM CA_ASSETSSTOCKEDBOM" +
      "        WHERE CA_ASSETSSTOCKEDBOM.CA_Assetsstockedbom_ID = ? " +
      "                 AND CA_ASSETSSTOCKEDBOM.CA_Assetsstocked_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);

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
      "          FROM CA_ASSETSSTOCKEDBOM" +
      "         WHERE CA_ASSETSSTOCKEDBOM.CA_Assetsstockedbom_ID = ? ";

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
      "          FROM CA_ASSETSSTOCKEDBOM" +
      "         WHERE CA_ASSETSSTOCKEDBOM.CA_Assetsstockedbom_ID = ? ";

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
