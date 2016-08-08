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
class LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data implements FieldProvider {
static Logger log4j = Logger.getLogger(LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String snrMasterdataId;
  public String snrMasterdataIdr;
  public String caAssetsstockedId;
  public String caAssetsstockedIdr;
  public String serialnumber;
  public String mProductId;
  public String mProductIdr;
  public String adOrgId;
  public String adOrgIdr;
  public String caLostassetsVId;
  public String adClientId;
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
    else if (fieldName.equalsIgnoreCase("snr_masterdata_id") || fieldName.equals("snrMasterdataId"))
      return snrMasterdataId;
    else if (fieldName.equalsIgnoreCase("snr_masterdata_idr") || fieldName.equals("snrMasterdataIdr"))
      return snrMasterdataIdr;
    else if (fieldName.equalsIgnoreCase("ca_assetsstocked_id") || fieldName.equals("caAssetsstockedId"))
      return caAssetsstockedId;
    else if (fieldName.equalsIgnoreCase("ca_assetsstocked_idr") || fieldName.equals("caAssetsstockedIdr"))
      return caAssetsstockedIdr;
    else if (fieldName.equalsIgnoreCase("serialnumber"))
      return serialnumber;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("m_product_idr") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("ca_lostassets_v_id") || fieldName.equals("caLostassetsVId"))
      return caLostassetsVId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
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
  public static LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(ca_lostassets_v.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ca_lostassets_v.CreatedBy) as CreatedByR, " +
      "        to_char(ca_lostassets_v.Updated, ?) as updated, " +
      "        to_char(ca_lostassets_v.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        ca_lostassets_v.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = ca_lostassets_v.UpdatedBy) as UpdatedByR," +
      "        ca_lostassets_v.SNR_Masterdata_ID, " +
      "(CASE WHEN ca_lostassets_v.SNR_Masterdata_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Serialnumber), ''))),'') ) END) AS SNR_Masterdata_IDR, " +
      "ca_lostassets_v.CA_Assetsstocked_ID, " +
      "(CASE WHEN ca_lostassets_v.CA_Assetsstocked_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.Name), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL5.Name IS NULL THEN TO_CHAR(table5.Name) ELSE TO_CHAR(tableTRL5.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.Qty), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table7.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Serialnumber), ''))),'') ) END) AS CA_Assetsstocked_IDR, " +
      "ca_lostassets_v.Serialnumber, " +
      "ca_lostassets_v.M_Product_ID, " +
      "(CASE WHEN ca_lostassets_v.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table8.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL8.Name IS NULL THEN TO_CHAR(table8.Name) ELSE TO_CHAR(tableTRL8.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "ca_lostassets_v.AD_Org_ID, " +
      "(CASE WHEN ca_lostassets_v.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "ca_lostassets_v.CA_Lostassets_V_ID, " +
      "ca_lostassets_v.AD_Client_ID, " +
      "COALESCE(ca_lostassets_v.Isactive, 'N') AS Isactive, " +
      "        ? AS LANGUAGE " +
      "        FROM ca_lostassets_v left join (select SNR_Masterdata_ID, M_Product_ID, Serialnumber from SNR_Masterdata) table1 on (ca_lostassets_v.SNR_Masterdata_ID = table1.SNR_Masterdata_ID) left join (select M_Product_ID, Value, Name from M_Product) table2 on (table1.M_Product_ID = table2.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  left join (select CA_Assetsstocked_ID, C_BPartner_ID, M_Product_ID, Qty, SNR_Masterdata_id from CA_Assetsstocked) table3 on (ca_lostassets_v.CA_Assetsstocked_ID = table3.CA_Assetsstocked_ID) left join (select C_BPartner_ID, Name from C_BPartner) table4 on (table3.C_BPartner_ID = table4.C_BPartner_ID) left join (select M_Product_ID, Value, Name from M_Product) table5 on (table3.M_Product_ID = table5.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL5 on (table5.M_Product_ID = tableTRL5.M_Product_ID and tableTRL5.AD_Language = ?)  left join (select SNR_Masterdata_id, M_Product_ID, Serialnumber from SNR_Masterdata) table6 on (table3.SNR_Masterdata_id = table6.SNR_Masterdata_id) left join (select M_Product_ID, Value, Name from M_Product) table7 on (table6.M_Product_ID = table7.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL7 on (table7.M_Product_ID = tableTRL7.M_Product_ID and tableTRL7.AD_Language = ?)  left join (select M_Product_ID, Value, Name from M_Product) table8 on (ca_lostassets_v.M_Product_ID = table8.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL8 on (table8.M_Product_ID = tableTRL8.M_Product_ID and tableTRL8.AD_Language = ?)  left join (select AD_Org_ID, Name from AD_Org) table9 on (ca_lostassets_v.AD_Org_ID = table9.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND ca_lostassets_v.CA_Lostassets_V_ID = ? " +
      "        AND ca_lostassets_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND ca_lostassets_v.AD_Org_ID IN (";
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
        LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data = new LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data();
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.created = UtilSql.getValue(result, "created");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.updated = UtilSql.getValue(result, "updated");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.snrMasterdataId = UtilSql.getValue(result, "snr_masterdata_id");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.snrMasterdataIdr = UtilSql.getValue(result, "snr_masterdata_idr");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.caAssetsstockedId = UtilSql.getValue(result, "ca_assetsstocked_id");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.caAssetsstockedIdr = UtilSql.getValue(result, "ca_assetsstocked_idr");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.serialnumber = UtilSql.getValue(result, "serialnumber");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.mProductId = UtilSql.getValue(result, "m_product_id");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.mProductIdr = UtilSql.getValue(result, "m_product_idr");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.caLostassetsVId = UtilSql.getValue(result, "ca_lostassets_v_id");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.isactive = UtilSql.getValue(result, "isactive");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.language = UtilSql.getValue(result, "language");
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.adUserClient = "";
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.adOrgClient = "";
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.createdby = "";
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.trBgcolor = "";
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.totalCount = "";
        objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data);
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
    LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[] = new LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[vector.size()];
    vector.copyInto(objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data);
    return(objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data);
  }

/**
Create a registry
 */
  public static LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[] set(String caAssetsstockedId, String caLostassetsVId, String snrMasterdataId, String createdby, String createdbyr, String adOrgId, String adClientId, String serialnumber, String isactive, String mProductId, String mProductIdr, String updatedby, String updatedbyr)    throws ServletException {
    LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[] = new LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[1];
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0] = new LostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data();
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].created = "";
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].createdbyr = createdbyr;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].updated = "";
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].updatedTimeStamp = "";
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].updatedby = updatedby;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].updatedbyr = updatedbyr;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].snrMasterdataId = snrMasterdataId;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].snrMasterdataIdr = "";
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].caAssetsstockedId = caAssetsstockedId;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].caAssetsstockedIdr = "";
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].serialnumber = serialnumber;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].mProductId = mProductId;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].mProductIdr = mProductIdr;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].adOrgId = adOrgId;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].adOrgIdr = "";
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].caLostassetsVId = caLostassetsVId;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].adClientId = adClientId;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].isactive = isactive;
    objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data[0].language = "";
    return objectLostAssetsD22DADDC27914C9D98E6E1B09E0B3B92Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDefA34DC27BCDE04FB9AB46C81B7C5FDEDE_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef9C7113F6DDE8400092EF6B5617228CBC_1(ConnectionProvider connectionProvider, String M_Product_IDR)    throws ServletException {
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
  public static String selectDef40ABE8F65EBE4E659939517D43614974_2(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE ca_lostassets_v" +
      "        SET SNR_Masterdata_ID = (?) , CA_Assetsstocked_ID = (?) , Serialnumber = (?) , M_Product_ID = (?) , AD_Org_ID = (?) , CA_Lostassets_V_ID = (?) , AD_Client_ID = (?) , Isactive = (?) , updated = now(), updatedby = ? " +
      "        WHERE ca_lostassets_v.CA_Lostassets_V_ID = ? " +
      "        AND ca_lostassets_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ca_lostassets_v.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrMasterdataId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serialnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caLostassetsVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caLostassetsVId);
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
      "        INSERT INTO ca_lostassets_v " +
      "        (SNR_Masterdata_ID, CA_Assetsstocked_ID, Serialnumber, M_Product_ID, AD_Org_ID, CA_Lostassets_V_ID, AD_Client_ID, Isactive, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrMasterdataId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caAssetsstockedId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, serialnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, caLostassetsVId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM ca_lostassets_v" +
      "        WHERE ca_lostassets_v.CA_Lostassets_V_ID = ? " +
      "        AND ca_lostassets_v.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND ca_lostassets_v.AD_Org_ID IN (";
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
      "        DELETE FROM ca_lostassets_v" +
      "        WHERE ca_lostassets_v.CA_Lostassets_V_ID = ? ";

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
      "          FROM ca_lostassets_v" +
      "         WHERE ca_lostassets_v.CA_Lostassets_V_ID = ? ";

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
      "          FROM ca_lostassets_v" +
      "         WHERE ca_lostassets_v.CA_Lostassets_V_ID = ? ";

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
