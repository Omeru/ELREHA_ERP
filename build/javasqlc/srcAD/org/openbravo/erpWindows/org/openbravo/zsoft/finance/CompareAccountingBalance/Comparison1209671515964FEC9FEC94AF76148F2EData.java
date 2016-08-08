//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openbravo.zsoft.finance.CompareAccountingBalance;

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
class Comparison1209671515964FEC9FEC94AF76148F2EData implements FieldProvider {
static Logger log4j = Logger.getLogger(Comparison1209671515964FEC9FEC94AF76148F2EData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String adOrgId;
  public String adOrgIdr;
  public String name;
  public String datefrom;
  public String dateto;
  public String description;
  public String btngenerate;
  public String btnimport;
  public String zsfiSusadatevId;
  public String isactive;
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
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("datefrom"))
      return datefrom;
    else if (fieldName.equalsIgnoreCase("dateto"))
      return dateto;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("btngenerate"))
      return btngenerate;
    else if (fieldName.equalsIgnoreCase("btnimport"))
      return btnimport;
    else if (fieldName.equalsIgnoreCase("zsfi_susadatev_id") || fieldName.equals("zsfiSusadatevId"))
      return zsfiSusadatevId;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
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
  public static Comparison1209671515964FEC9FEC94AF76148F2EData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static Comparison1209671515964FEC9FEC94AF76148F2EData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(zsfi_susadatev.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zsfi_susadatev.CreatedBy) as CreatedByR, " +
      "        to_char(zsfi_susadatev.Updated, ?) as updated, " +
      "        to_char(zsfi_susadatev.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        zsfi_susadatev.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = zsfi_susadatev.UpdatedBy) as UpdatedByR," +
      "        zsfi_susadatev.AD_Org_ID, " +
      "(CASE WHEN zsfi_susadatev.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "zsfi_susadatev.Name, " +
      "zsfi_susadatev.Datefrom, " +
      "zsfi_susadatev.Dateto, " +
      "zsfi_susadatev.Description, " +
      "COALESCE(zsfi_susadatev.Btngenerate, 'N') AS Btngenerate, " +
      "COALESCE(zsfi_susadatev.Btnimport, 'N') AS Btnimport, " +
      "zsfi_susadatev.Zsfi_Susadatev_ID, " +
      "COALESCE(zsfi_susadatev.Isactive, 'N') AS Isactive, " +
      "zsfi_susadatev.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM zsfi_susadatev left join (select AD_Org_ID, Name from AD_Org) table1 on (zsfi_susadatev.AD_Org_ID = table1.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND zsfi_susadatev.Zsfi_Susadatev_ID = ? " +
      "        AND zsfi_susadatev.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND zsfi_susadatev.AD_Org_ID IN (";
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
        Comparison1209671515964FEC9FEC94AF76148F2EData objectComparison1209671515964FEC9FEC94AF76148F2EData = new Comparison1209671515964FEC9FEC94AF76148F2EData();
        objectComparison1209671515964FEC9FEC94AF76148F2EData.created = UtilSql.getValue(result, "created");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.updated = UtilSql.getValue(result, "updated");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.updatedby = UtilSql.getValue(result, "updatedby");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.name = UtilSql.getValue(result, "name");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.datefrom = UtilSql.getDateValue(result, "datefrom", "dd-MM-yyyy");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.dateto = UtilSql.getDateValue(result, "dateto", "dd-MM-yyyy");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.description = UtilSql.getValue(result, "description");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.btngenerate = UtilSql.getValue(result, "btngenerate");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.btnimport = UtilSql.getValue(result, "btnimport");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.zsfiSusadatevId = UtilSql.getValue(result, "zsfi_susadatev_id");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.isactive = UtilSql.getValue(result, "isactive");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.language = UtilSql.getValue(result, "language");
        objectComparison1209671515964FEC9FEC94AF76148F2EData.adUserClient = "";
        objectComparison1209671515964FEC9FEC94AF76148F2EData.adOrgClient = "";
        objectComparison1209671515964FEC9FEC94AF76148F2EData.createdby = "";
        objectComparison1209671515964FEC9FEC94AF76148F2EData.trBgcolor = "";
        objectComparison1209671515964FEC9FEC94AF76148F2EData.totalCount = "";
        objectComparison1209671515964FEC9FEC94AF76148F2EData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectComparison1209671515964FEC9FEC94AF76148F2EData);
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
    Comparison1209671515964FEC9FEC94AF76148F2EData objectComparison1209671515964FEC9FEC94AF76148F2EData[] = new Comparison1209671515964FEC9FEC94AF76148F2EData[vector.size()];
    vector.copyInto(objectComparison1209671515964FEC9FEC94AF76148F2EData);
    return(objectComparison1209671515964FEC9FEC94AF76148F2EData);
  }

/**
Create a registry
 */
  public static Comparison1209671515964FEC9FEC94AF76148F2EData[] set(String dateto, String zsfiSusadatevId, String updatedby, String updatedbyr, String datefrom, String description, String name, String adClientId, String btnimport, String btngenerate, String isactive, String createdby, String createdbyr, String adOrgId)    throws ServletException {
    Comparison1209671515964FEC9FEC94AF76148F2EData objectComparison1209671515964FEC9FEC94AF76148F2EData[] = new Comparison1209671515964FEC9FEC94AF76148F2EData[1];
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0] = new Comparison1209671515964FEC9FEC94AF76148F2EData();
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].created = "";
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].createdbyr = createdbyr;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].updated = "";
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].updatedTimeStamp = "";
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].updatedby = updatedby;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].updatedbyr = updatedbyr;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].adOrgId = adOrgId;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].adOrgIdr = "";
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].name = name;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].datefrom = datefrom;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].dateto = dateto;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].description = description;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].btngenerate = btngenerate;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].btnimport = btnimport;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].zsfiSusadatevId = zsfiSusadatevId;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].isactive = isactive;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].adClientId = adClientId;
    objectComparison1209671515964FEC9FEC94AF76148F2EData[0].language = "";
    return objectComparison1209671515964FEC9FEC94AF76148F2EData;
  }

/**
Select for auxiliar field
 */
  public static String selectDefC9A5A30C63E6454E8E7DCB5649466216_0(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
  public static String selectDef7A1B373A881D4FD3AD9F50196D33A503_1(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
      "        UPDATE zsfi_susadatev" +
      "        SET AD_Org_ID = (?) , Name = (?) , Datefrom = TO_DATE(?) , Dateto = TO_DATE(?) , Description = (?) , Btngenerate = (?) , Btnimport = (?) , Zsfi_Susadatev_ID = (?) , Isactive = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE zsfi_susadatev.Zsfi_Susadatev_ID = ? " +
      "        AND zsfi_susadatev.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zsfi_susadatev.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btngenerate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btnimport);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);
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
      "        INSERT INTO zsfi_susadatev " +
      "        (AD_Org_ID, Name, Datefrom, Dateto, Description, Btngenerate, Btnimport, Zsfi_Susadatev_ID, Isactive, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datefrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateto);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btngenerate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, btnimport);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfiSusadatevId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
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
      "        DELETE FROM zsfi_susadatev" +
      "        WHERE zsfi_susadatev.Zsfi_Susadatev_ID = ? " +
      "        AND zsfi_susadatev.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND zsfi_susadatev.AD_Org_ID IN (";
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
      "        DELETE FROM zsfi_susadatev" +
      "        WHERE zsfi_susadatev.Zsfi_Susadatev_ID = ? ";

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
      "          FROM zsfi_susadatev" +
      "         WHERE zsfi_susadatev.Zsfi_Susadatev_ID = ? ";

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
      "          FROM zsfi_susadatev" +
      "         WHERE zsfi_susadatev.Zsfi_Susadatev_ID = ? ";

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
