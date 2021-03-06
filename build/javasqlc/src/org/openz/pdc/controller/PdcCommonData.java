//Sqlc generated V1.O00-1
package org.openz.pdc.controller;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

public class PdcCommonData implements FieldProvider {
static Logger log4j = Logger.getLogger(PdcCommonData.class);
  private String InitRecordNumber="0";
  public String barcode;
  public String type;
  public String id;
  public String snrmasterdataId;
  public String batchmasterdataId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("barcode"))
      return barcode;
    else if (fieldName.equalsIgnoreCase("type"))
      return type;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("snrmasterdata_id") || fieldName.equals("snrmasterdataId"))
      return snrmasterdataId;
    else if (fieldName.equalsIgnoreCase("batchmasterdata_id") || fieldName.equals("batchmasterdataId"))
      return batchmasterdataId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static PdcCommonData[] selectbarcode(ConnectionProvider connectionProvider, String barcode)    throws ServletException {
    return selectbarcode(connectionProvider, barcode, 0, 0);
  }

  public static PdcCommonData[] selectbarcode(ConnectionProvider connectionProvider, String barcode, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "            select " +
      "                barcode, " +
      "                type, " +
      "                id," +
      "                snrmasterdata_id," +
      "                batchmasterdata_id" +
      "            from " +
      "                pdc_getDataIdfromScan(?)";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, barcode);

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
        PdcCommonData objectPdcCommonData = new PdcCommonData();
        objectPdcCommonData.barcode = UtilSql.getValue(result, "barcode");
        objectPdcCommonData.type = UtilSql.getValue(result, "type");
        objectPdcCommonData.id = UtilSql.getValue(result, "id");
        objectPdcCommonData.snrmasterdataId = UtilSql.getValue(result, "snrmasterdata_id");
        objectPdcCommonData.batchmasterdataId = UtilSql.getValue(result, "batchmasterdata_id");
        objectPdcCommonData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPdcCommonData);
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
    PdcCommonData objectPdcCommonData[] = new PdcCommonData[vector.size()];
    vector.copyInto(objectPdcCommonData);
    return(objectPdcCommonData);
  }

  public static int insertProduction(Connection conn, ConnectionProvider connectionProvider, String uuId, String adClientId, String adOrgId, String user, String cProjectId, String cProjecttaskId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        insert into M_INTERNAL_CONSUMPTION(M_INTERNAL_CONSUMPTION_ID, AD_CLIENT_ID, AD_ORG_ID,  CREATED, CREATEDBY, UPDATED, UPDATEDBY," +
      "                    NAME, DESCRIPTION, MOVEMENTDATE, " +
      "                    C_PROJECT_ID, C_PROJECTTASK_ID,  MOVEMENTTYPE,DOCUMENTNO,DATEACCT)" +
      "               values(?,?,?,NOW(), ?, NOW(),?," +
      "                      'Production-Process','Generated by PDC ->Send produced Material on Stock',now()," +
      "                      ?,?,'P+',ad_sequence_doc('Production',?,'Y'),trunc(now()))";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uuId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

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
Initializes a D- (Internal Consumption) Transaction
 */
  public static int insertConsumption(Connection conn, ConnectionProvider connectionProvider, String uuId, String adClientId, String adOrgId, String user, String cProjectId, String cProjecttaskId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        insert into M_INTERNAL_CONSUMPTION(M_INTERNAL_CONSUMPTION_ID, AD_CLIENT_ID, AD_ORG_ID,  CREATED, CREATEDBY, UPDATED, UPDATEDBY," +
      "                    NAME, DESCRIPTION, MOVEMENTDATE, " +
      "                    C_PROJECT_ID, C_PROJECTTASK_ID,  MOVEMENTTYPE,DOCUMENTNO,DATEACCT)" +
      "               values(?,?,?,NOW(), ?, NOW(),?," +
      "                      'Production-Process','Generated by PDC ->Get Material from Stock',now()," +
      "                      ?,?,'D-',ad_sequence_doc('Production',?,'Y'),trunc(now()))";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uuId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

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
Initializes a D+ (Internal Material Return) Transaction
 */
  public static int insertMaterailReturn(Connection conn, ConnectionProvider connectionProvider, String uuId, String adClientId, String adOrgId, String user, String cProjectId, String cProjecttaskId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        insert into M_INTERNAL_CONSUMPTION(M_INTERNAL_CONSUMPTION_ID, AD_CLIENT_ID, AD_ORG_ID,  CREATED, CREATEDBY, UPDATED, UPDATEDBY," +
      "                    NAME, DESCRIPTION, MOVEMENTDATE, " +
      "                    C_PROJECT_ID, C_PROJECTTASK_ID,  MOVEMENTTYPE,DOCUMENTNO,DATEACCT)" +
      "               values(?,?,?,NOW(), ?, NOW(),?," +
      "                      'Production-Process','Generated by PDC ->Send Material back to Stock',now()," +
      "                      ?,?,'D+',ad_sequence_doc('Production',?,'Y'),trunc(now())) ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uuId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

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

  public static int insertMaterialLine(Connection conn, ConnectionProvider connectionProvider, String adClientId, String adOrgId, String user, String consumptionId, String locatorId, String productId, String line, String qty, String uomId, String cProjectId, String cProjecttaskId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       insert into M_INTERNAL_CONSUMPTIONLINE(M_INTERNAL_CONSUMPTIONLINE_ID, AD_CLIENT_ID, AD_ORG_ID, CREATED, CREATEDBY, UPDATED, UPDATEDBY, M_INTERNAL_CONSUMPTION_ID, " +
      "                                                  M_LOCATOR_ID, M_PRODUCT_ID, LINE, MOVEMENTQTY, DESCRIPTION, C_UOM_ID, C_PROJECT_ID, C_PROJECTTASK_ID)" +
      "                  values (get_uuid(),?,?,NOW(), ?, NOW(),?,?," +
      "                          ?,?,to_number(?),to_number(?),'Generated by PDC',?,?, ?);";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, consumptionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, locatorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, uomId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjecttaskId);

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

  public static int updateMaterialLine(Connection conn, ConnectionProvider connectionProvider, String qty, String consumptionlineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       UPDATE M_INTERNAL_CONSUMPTIONLINE SET MOVEMENTQTY=to_number(?) where M_INTERNAL_CONSUMPTIONLINE_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, consumptionlineId);

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

  public static String getProductStdUOM(ConnectionProvider connectionProvider, String mProductId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  c_uom_id from m_product where m_product_id = ?  ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_uom_id");
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

  public static String getIDWhenScannedSameLine(ConnectionProvider connectionProvider, String mConsumptionId, String mProductId, String mLocatorId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  M_INTERNAL_CONSUMPTIONLINE_ID from M_INTERNAL_CONSUMPTIONLINE" +
      "        where M_INTERNAL_CONSUMPTION_ID=? and m_product_id = ? and m_locator_id=?  ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mConsumptionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mLocatorId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_internal_consumptionline_id");
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

  public static int deleteMaterialLine(Connection conn, ConnectionProvider connectionProvider, String consumptionlineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       delete from M_INTERNAL_CONSUMPTIONLINE where M_INTERNAL_CONSUMPTIONLINE_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, consumptionlineId);

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

  public static String getProductionOrderFromWorkstep(ConnectionProvider connectionProvider, String mProductId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  c_project_id from c_projecttask where c_projecttask_id = ?  ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_project_id");
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

  public static String getNextLineFromConsumption(ConnectionProvider connectionProvider, String consumptionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(to_char(max(line)+10),'10')   from M_INTERNAL_CONSUMPTIONLINE where M_INTERNAL_CONSUMPTION_ID=?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, consumptionId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "coalesce");
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

  public static String isbatchorserialnumber(ConnectionProvider connectionProvider, String consumptionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT pdc_isbatchorserialnumber(?)";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, consumptionId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "pdc_isbatchorserialnumber");
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

  public static String doConsumptionPost(ConnectionProvider connectionProvider, String consumptionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  m_internal_consumption_post(?)";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, consumptionId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_internal_consumption_post");
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

  public static String closeWorkstep(Connection conn, ConnectionProvider connectionProvider, String projecttaskId, String userId, String language)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       select zssm_closeworkstep(?,?,?) from dual";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, projecttaskId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, userId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zssm_closeworkstep");
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

  public static int deleteAllMaterialLines(Connection conn, ConnectionProvider connectionProvider, String consumptionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       delete from M_INTERNAL_CONSUMPTIONLINE where M_INTERNAL_CONSUMPTION_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, consumptionId);

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

  public static int deleteMaterialTransaction(Connection conn, ConnectionProvider connectionProvider, String consumptionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       delete from M_INTERNAL_CONSUMPTION where M_INTERNAL_CONSUMPTION_ID=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, consumptionId);

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

  public static String getConsumptionMovementType(ConnectionProvider connectionProvider, String consumptionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT movementtype from m_internal_consumption where m_internal_consumption_id= ?" +
      "        UNION " +
      "        SELECT 'XX' from dual";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, consumptionId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "movementtype");
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
