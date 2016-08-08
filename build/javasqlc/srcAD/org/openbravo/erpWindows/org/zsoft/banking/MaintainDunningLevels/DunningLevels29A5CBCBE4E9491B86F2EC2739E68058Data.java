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
class DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data implements FieldProvider {
static Logger log4j = Logger.getLogger(DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String seqno;
  public String adOrgId;
  public String adOrgIdr;
  public String name;
  public String printname;
  public String headertext;
  public String footertext;
  public String isactive;
  public String cDunningId;
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
    else if (fieldName.equalsIgnoreCase("seqno"))
      return seqno;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("ad_org_idr") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("printname"))
      return printname;
    else if (fieldName.equalsIgnoreCase("headertext"))
      return headertext;
    else if (fieldName.equalsIgnoreCase("footertext"))
      return footertext;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("c_dunning_id") || fieldName.equals("cDunningId"))
      return cDunningId;
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
  public static DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(c_dunning.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_dunning.CreatedBy) as CreatedByR, " +
      "        to_char(c_dunning.Updated, ?) as updated, " +
      "        to_char(c_dunning.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        c_dunning.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = c_dunning.UpdatedBy) as UpdatedByR," +
      "        c_dunning.Seqno, " +
      "c_dunning.AD_Org_ID, " +
      "(CASE WHEN c_dunning.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS AD_Org_IDR, " +
      "c_dunning.Name, " +
      "c_dunning.Printname, " +
      "c_dunning.Headertext, " +
      "c_dunning.Footertext, " +
      "COALESCE(c_dunning.Isactive, 'N') AS Isactive, " +
      "c_dunning.C_Dunning_ID, " +
      "c_dunning.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM c_dunning left join (select AD_Org_ID, Name from AD_Org) table1 on (c_dunning.AD_Org_ID = table1.AD_Org_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 " +
      "        AND c_dunning.C_Dunning_ID = ? " +
      "        AND c_dunning.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND c_dunning.AD_Org_ID IN (";
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
        DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data = new DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data();
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.created = UtilSql.getValue(result, "created");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.updated = UtilSql.getValue(result, "updated");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.seqno = UtilSql.getValue(result, "seqno");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.adOrgIdr = UtilSql.getValue(result, "ad_org_idr");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.name = UtilSql.getValue(result, "name");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.printname = UtilSql.getValue(result, "printname");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.headertext = UtilSql.getValue(result, "headertext");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.footertext = UtilSql.getValue(result, "footertext");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.isactive = UtilSql.getValue(result, "isactive");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.cDunningId = UtilSql.getValue(result, "c_dunning_id");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.language = UtilSql.getValue(result, "language");
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.adUserClient = "";
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.adOrgClient = "";
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.createdby = "";
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.trBgcolor = "";
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.totalCount = "";
        objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data);
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
    DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[] = new DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[vector.size()];
    vector.copyInto(objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data);
    return(objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data);
  }

/**
Create a registry
 */
  public static DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[] set(String isactive, String adOrgId, String headertext, String createdby, String createdbyr, String name, String footertext, String adClientId, String cDunningId, String printname, String seqno, String updatedby, String updatedbyr)    throws ServletException {
    DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[] = new DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[1];
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0] = new DunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data();
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].created = "";
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].createdbyr = createdbyr;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].updated = "";
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].updatedTimeStamp = "";
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].updatedby = updatedby;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].updatedbyr = updatedbyr;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].seqno = seqno;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].adOrgId = adOrgId;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].adOrgIdr = "";
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].name = name;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].printname = printname;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].headertext = headertext;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].footertext = footertext;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].isactive = isactive;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].cDunningId = cDunningId;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].adClientId = adClientId;
    objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data[0].language = "";
    return objectDunningLevels29A5CBCBE4E9491B86F2EC2739E68058Data;
  }

/**
Select for auxiliar field
 */
  public static String selectDef1701561AB2CC49638E7AB08810B584A9_0(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
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
  public static String selectDef5CE4E09B1B8843A5A0980174330F680F_1(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
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
      "        UPDATE c_dunning" +
      "        SET Seqno = TO_NUMBER(?) , AD_Org_ID = (?) , Name = (?) , Printname = (?) , Headertext = (?) , Footertext = (?) , Isactive = (?) , C_Dunning_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE c_dunning.C_Dunning_ID = ? " +
      "        AND c_dunning.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_dunning.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, printname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, headertext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, footertext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
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
      "        INSERT INTO c_dunning " +
      "        (Seqno, AD_Org_ID, Name, Printname, Headertext, Footertext, Isactive, C_Dunning_ID, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, seqno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, printname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, headertext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, footertext);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cDunningId);
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
      "        DELETE FROM c_dunning" +
      "        WHERE c_dunning.C_Dunning_ID = ? " +
      "        AND c_dunning.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND c_dunning.AD_Org_ID IN (";
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
      "        DELETE FROM c_dunning" +
      "        WHERE c_dunning.C_Dunning_ID = ? ";

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
      "          FROM c_dunning" +
      "         WHERE c_dunning.C_Dunning_ID = ? ";

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
      "          FROM c_dunning" +
      "         WHERE c_dunning.C_Dunning_ID = ? ";

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
