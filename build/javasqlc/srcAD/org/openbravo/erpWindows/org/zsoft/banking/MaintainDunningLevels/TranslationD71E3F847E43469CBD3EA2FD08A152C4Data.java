//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.zsoft.banking.MaintainDunningLevels;

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
class TranslationD71E3F847E43469CBD3EA2FD08A152C4Data implements FieldProvider {
static Logger log4j = Logger.getLogger(TranslationD71E3F847E43469CBD3EA2FD08A152C4Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cDunningId;
  public String cDunningIdr;
  public String adLanguage;
  public String adLanguager;
  public String name;
  public String printname;
  public String headertext;
  public String footertext;
  public String cDunningTrlId;
  public String isactive;
  public String adOrgId;
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
    else if (fieldName.equalsIgnoreCase("c_dunning_id") || fieldName.equals("cDunningId"))
      return cDunningId;
    else if (fieldName.equalsIgnoreCase("c_dunning_idr") || fieldName.equals("cDunningIdr"))
      return cDunningIdr;
    else if (fieldName.equalsIgnoreCase("ad_language") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("ad_languager") || fieldName.equals("adLanguager"))
      return adLanguager;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("printname"))
      return printname;
    else if (fieldName.equalsIgnoreCase("headertext"))
      return headertext;
    else if (fieldName.equalsIgnoreCase("footertext"))
      return footertext;
    else if (fieldName.equalsIgnoreCase("c_dunning_trl_id") || fieldName.equals("cDunningTrlId"))
      return cDunningTrlId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
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
  public static TranslationD71E3F847E43469CBD3EA2FD08A152C4Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cDunningId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cDunningId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static TranslationD71E3F847E43469CBD3EA2FD08A152C4Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cDunningId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(c_dunning_trl.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_dunning_trl.CreatedBy) as CreatedByR, " +
      "        to_char(c_dunning_trl.Updated, ?) as updated, " +
      "        to_char(c_dunning_trl.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        c_dunning_trl.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_dunning_trl.UpdatedBy) as UpdatedByR," +
      "        c_dunning_trl.C_Dunning_ID, " +
      "(CASE WHEN c_dunning_trl.C_Dunning_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))),'') ) END) AS C_Dunning_IDR, " +
      "c_dunning_trl.AD_Language, " +
      "(CASE WHEN c_dunning_trl.AD_Language IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_LanguageR, " +
      "c_dunning_trl.Name, " +
      "c_dunning_trl.Printname, " +
      "c_dunning_trl.Headertext, " +
      "c_dunning_trl.Footertext, " +
      "c_dunning_trl.C_Dunning_Trl_ID, " +
      "COALESCE(c_dunning_trl.Isactive, 'N') AS Isactive, " +
      "c_dunning_trl.AD_Org_ID, " +
      "c_dunning_trl.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM c_dunning_trl left join (select C_Dunning_ID, Name from C_Dunning) table1 on (c_dunning_trl.C_Dunning_ID = table1.C_Dunning_ID) left join (select C_Dunning_ID,AD_Language, Name from c_dunning_TRL) tableTRL1 on (table1.C_Dunning_ID = tableTRL1.C_Dunning_ID and tableTRL1.AD_Language = ?)  left join (select AD_Language, Name from AD_Language) table2 on (c_dunning_trl.AD_Language =  table2.AD_Language)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cDunningId==null || cDunningId.equals(""))?"":"  AND c_dunning_trl.C_Dunning_ID = ?  ");
    strSql = strSql + 
      "        AND c_dunning_trl.C_Dunning_Trl_ID = ? " +
      "        AND c_dunning_trl.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND c_dunning_trl.AD_Org_ID IN (";
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
      if (cDunningId != null && !(cDunningId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);
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
        TranslationD71E3F847E43469CBD3EA2FD08A152C4Data objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data = new TranslationD71E3F847E43469CBD3EA2FD08A152C4Data();
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.created = UtilSql.getValue(result, "created");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.updated = UtilSql.getValue(result, "updated");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.cDunningId = UtilSql.getValue(result, "c_dunning_id");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.cDunningIdr = UtilSql.getValue(result, "c_dunning_idr");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.adLanguage = UtilSql.getValue(result, "ad_language");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.adLanguager = UtilSql.getValue(result, "ad_languager");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.name = UtilSql.getValue(result, "name");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.printname = UtilSql.getValue(result, "printname");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.headertext = UtilSql.getValue(result, "headertext");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.footertext = UtilSql.getValue(result, "footertext");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.cDunningTrlId = UtilSql.getValue(result, "c_dunning_trl_id");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.isactive = UtilSql.getValue(result, "isactive");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.language = UtilSql.getValue(result, "language");
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.adUserClient = "";
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.adOrgClient = "";
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.createdby = "";
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.trBgcolor = "";
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.totalCount = "";
        objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data);
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
    TranslationD71E3F847E43469CBD3EA2FD08A152C4Data objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[] = new TranslationD71E3F847E43469CBD3EA2FD08A152C4Data[vector.size()];
    vector.copyInto(objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data);
    return(objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data);
  }

/**
Create a registry
 */
  public static TranslationD71E3F847E43469CBD3EA2FD08A152C4Data[] set(String cDunningId, String name, String adOrgId, String createdby, String createdbyr, String headertext, String footertext, String adClientId, String cDunningTrlId, String printname, String adLanguage, String isactive, String updatedby, String updatedbyr)    throws ServletException {
    TranslationD71E3F847E43469CBD3EA2FD08A152C4Data objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[] = new TranslationD71E3F847E43469CBD3EA2FD08A152C4Data[1];
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0] = new TranslationD71E3F847E43469CBD3EA2FD08A152C4Data();
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].created = "";
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].createdbyr = createdbyr;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].updated = "";
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].updatedTimeStamp = "";
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].updatedby = updatedby;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].updatedbyr = updatedbyr;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].cDunningId = cDunningId;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].cDunningIdr = "";
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].adLanguage = adLanguage;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].adLanguager = "";
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].name = name;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].printname = printname;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].headertext = headertext;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].footertext = footertext;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].cDunningTrlId = cDunningTrlId;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].isactive = isactive;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].adOrgId = adOrgId;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].adClientId = adClientId;
    objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data[0].language = "";
    return objectTranslationD71E3F847E43469CBD3EA2FD08A152C4Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef992B5BD76EFB4D38A0372A9D2ED63FDC_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef2E84E10EC2FF409AADD3E79067CF91E5_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        SELECT c_dunning_trl.C_Dunning_ID AS NAME" +
      "        FROM c_dunning_trl" +
      "        WHERE c_dunning_trl.C_Dunning_Trl_ID = ?";

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
  public static String selectParent(ConnectionProvider connectionProvider, String paramLanguage, String cDunningId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))) AS NAME FROM c_dunning left join (select C_Dunning_ID, Name from C_Dunning) table1 on (c_dunning.C_Dunning_ID = table1.C_Dunning_ID) left join (select C_Dunning_ID,AD_Language, Name from c_dunning_TRL) tableTRL1 on (table1.C_Dunning_ID = tableTRL1.C_Dunning_ID and tableTRL1.AD_Language = ?)  WHERE c_dunning.C_Dunning_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);

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
  public static String selectParentTrl(ConnectionProvider connectionProvider, String paramLanguage, String cDunningId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL1.Name IS NULL THEN TO_CHAR(table1.Name) ELSE TO_CHAR(tableTRL1.Name) END)), ''))) AS NAME FROM c_dunning left join (select C_Dunning_ID, Name from C_Dunning) table1 on (c_dunning.C_Dunning_ID = table1.C_Dunning_ID) left join (select C_Dunning_ID,AD_Language, Name from c_dunning_TRL) tableTRL1 on (table1.C_Dunning_ID = tableTRL1.C_Dunning_ID and tableTRL1.AD_Language = ?)  WHERE c_dunning.C_Dunning_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);

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
      "        UPDATE c_dunning_trl" +
      "        SET C_Dunning_ID = (?) , AD_Language = (?) , Name = (?) , Printname = (?) , Headertext = (?) , Footertext = (?) , C_Dunning_Trl_ID = (?) , Isactive = (?) , AD_Org_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE c_dunning_trl.C_Dunning_Trl_ID = ? " +
      "                 AND c_dunning_trl.C_Dunning_ID = ? " +
      "        AND c_dunning_trl.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_dunning_trl.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, printname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, headertext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, footertext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningTrlId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningTrlId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);
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
      "        INSERT INTO c_dunning_trl " +
      "        (C_Dunning_ID, AD_Language, Name, Printname, Headertext, Footertext, C_Dunning_Trl_ID, Isactive, AD_Org_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, printname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, headertext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, footertext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningTrlId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cDunningId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM c_dunning_trl" +
      "        WHERE c_dunning_trl.C_Dunning_Trl_ID = ? " +
      "                 AND c_dunning_trl.C_Dunning_ID = ? " +
      "        AND c_dunning_trl.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_dunning_trl.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);
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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String cDunningId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM c_dunning_trl" +
      "        WHERE c_dunning_trl.C_Dunning_Trl_ID = ? " +
      "                 AND c_dunning_trl.C_Dunning_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);

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
      "          FROM c_dunning_trl" +
      "         WHERE c_dunning_trl.C_Dunning_Trl_ID = ? ";

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
      "          FROM c_dunning_trl" +
      "         WHERE c_dunning_trl.C_Dunning_Trl_ID = ? ";

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
