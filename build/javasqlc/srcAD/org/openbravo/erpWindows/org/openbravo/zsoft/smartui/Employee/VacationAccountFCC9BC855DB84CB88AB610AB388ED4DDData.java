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
class VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData implements FieldProvider {
static Logger log4j = Logger.getLogger(VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String wmonth;
  public String wyear;
  public String remaining;
  public String reason;
  public String isactive;
  public String adOrgId;
  public String cVacationAccountId;
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
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("wmonth"))
      return wmonth;
    else if (fieldName.equalsIgnoreCase("wyear"))
      return wyear;
    else if (fieldName.equalsIgnoreCase("remaining"))
      return remaining;
    else if (fieldName.equalsIgnoreCase("reason"))
      return reason;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("c_vacation_account_id") || fieldName.equals("cVacationAccountId"))
      return cVacationAccountId;
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
  public static VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(c_vacation_account.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_vacation_account.CreatedBy) as CreatedByR, " +
      "        to_char(c_vacation_account.Updated, ?) as updated, " +
      "        to_char(c_vacation_account.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        c_vacation_account.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_vacation_account.UpdatedBy) as UpdatedByR," +
      "        c_vacation_account.C_Bpartner_ID, " +
      "(CASE WHEN c_vacation_account.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "c_vacation_account.Wmonth, " +
      "c_vacation_account.Wyear, " +
      "c_vacation_account.Remaining, " +
      "c_vacation_account.Reason, " +
      "COALESCE(c_vacation_account.Isactive, 'N') AS Isactive, " +
      "c_vacation_account.AD_Org_ID, " +
      "c_vacation_account.C_Vacation_Account_ID, " +
      "c_vacation_account.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM c_vacation_account left join (select C_BPartner_ID, Name from C_BPartner) table1 on (c_vacation_account.C_Bpartner_ID = table1.C_BPartner_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND c_vacation_account.C_Bpartner_ID = ?  ");
    strSql = strSql + 
      "        AND c_vacation_account.C_Vacation_Account_ID = ? " +
      "        AND c_vacation_account.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND c_vacation_account.AD_Org_ID IN (";
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
        VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData = new VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData();
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.created = UtilSql.getValue(result, "created");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.updated = UtilSql.getValue(result, "updated");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.updatedby = UtilSql.getValue(result, "updatedby");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.wmonth = UtilSql.getValue(result, "wmonth");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.wyear = UtilSql.getValue(result, "wyear");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.remaining = UtilSql.getValue(result, "remaining");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.reason = UtilSql.getValue(result, "reason");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.isactive = UtilSql.getValue(result, "isactive");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.cVacationAccountId = UtilSql.getValue(result, "c_vacation_account_id");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.language = UtilSql.getValue(result, "language");
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.adUserClient = "";
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.adOrgClient = "";
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.createdby = "";
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.trBgcolor = "";
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.totalCount = "";
        objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData);
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
    VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[] = new VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[vector.size()];
    vector.copyInto(objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData);
    return(objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData);
  }

/**
Create a registry
 */
  public static VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[] set(String cBpartnerId, String isactive, String updatedby, String updatedbyr, String reason, String cBpartnerIdr, String wyear, String adOrgId, String cVacationAccountId, String remaining, String createdby, String createdbyr, String wmonth, String adClientId)    throws ServletException {
    VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[] = new VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[1];
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0] = new VacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData();
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].created = "";
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].createdbyr = createdbyr;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].updated = "";
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].updatedTimeStamp = "";
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].updatedby = updatedby;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].updatedbyr = updatedbyr;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].cBpartnerId = cBpartnerId;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].cBpartnerIdr = cBpartnerIdr;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].wmonth = wmonth;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].wyear = wyear;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].remaining = remaining;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].reason = reason;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].isactive = isactive;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].adOrgId = adOrgId;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].cVacationAccountId = cVacationAccountId;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].adClientId = adClientId;
    objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData[0].language = "";
    return objectVacationAccountFCC9BC855DB84CB88AB610AB388ED4DDData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef65620839346D4DFD8B56F1942A217D9D_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef72D6667B10B54912887FC2D14D0F18E0_1(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
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
  public static String selectDef9957B02CE6424894B10C03D1A2BB73FE_2(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        SELECT c_vacation_account.C_Bpartner_ID AS NAME" +
      "        FROM c_vacation_account" +
      "        WHERE c_vacation_account.C_Vacation_Account_ID = ?";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM c_bpartneremployee_view left join (select C_BPartner_ID, Name from C_BPartner) table1 on (c_bpartneremployee_view.C_Bpartner_ID = table1.C_BPartner_ID) WHERE c_bpartneremployee_view.C_Bpartner_ID = ?  ";

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
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM c_bpartneremployee_view left join (select C_BPartner_ID, Name from C_BPartner) table1 on (c_bpartneremployee_view.C_Bpartner_ID = table1.C_BPartner_ID) WHERE c_bpartneremployee_view.C_Bpartner_ID = ?  ";

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
      "        UPDATE c_vacation_account" +
      "        SET C_Bpartner_ID = (?) , Wmonth = (?) , Wyear = TO_NUMBER(?) , Remaining = TO_NUMBER(?) , Reason = (?) , Isactive = (?) , AD_Org_ID = (?) , C_Vacation_Account_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE c_vacation_account.C_Vacation_Account_ID = ? " +
      "                 AND c_vacation_account.C_Bpartner_ID = ? " +
      "        AND c_vacation_account.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_vacation_account.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wmonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wyear);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remaining);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reason);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cVacationAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cVacationAccountId);
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
      "        INSERT INTO c_vacation_account " +
      "        (C_Bpartner_ID, Wmonth, Wyear, Remaining, Reason, Isactive, AD_Org_ID, C_Vacation_Account_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wmonth);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, wyear);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, remaining);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, reason);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cVacationAccountId);
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
      "        DELETE FROM c_vacation_account" +
      "        WHERE c_vacation_account.C_Vacation_Account_ID = ? " +
      "                 AND c_vacation_account.C_Bpartner_ID = ? " +
      "        AND c_vacation_account.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_vacation_account.AD_Org_ID IN (";
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
      "        DELETE FROM c_vacation_account" +
      "        WHERE c_vacation_account.C_Vacation_Account_ID = ? " +
      "                 AND c_vacation_account.C_Bpartner_ID = ? ";

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
      "          FROM c_vacation_account" +
      "         WHERE c_vacation_account.C_Vacation_Account_ID = ? ";

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
      "          FROM c_vacation_account" +
      "         WHERE c_vacation_account.C_Vacation_Account_ID = ? ";

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
