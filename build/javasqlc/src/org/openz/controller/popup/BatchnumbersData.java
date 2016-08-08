//Sqlc generated V1.O00-1
package org.openz.controller.popup;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

class BatchnumbersData implements FieldProvider {
static Logger log4j = Logger.getLogger(BatchnumbersData.class);
  private String InitRecordNumber="0";
  public String snrBatchmasterdataId;
  public String snrBatchlocatorId;
  public String adOrgId;
  public String mProductId;
  public String name;
  public String value;
  public String batchnumber;
  public String locator;
  public String qty;
  public String uom;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("snr_batchmasterdata_id") || fieldName.equals("snrBatchmasterdataId"))
      return snrBatchmasterdataId;
    else if (fieldName.equalsIgnoreCase("snr_batchlocator_id") || fieldName.equals("snrBatchlocatorId"))
      return snrBatchlocatorId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("batchnumber"))
      return batchnumber;
    else if (fieldName.equalsIgnoreCase("locator"))
      return locator;
    else if (fieldName.equalsIgnoreCase("qty"))
      return qty;
    else if (fieldName.equalsIgnoreCase("uom"))
      return uom;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static BatchnumbersData[] select(ConnectionProvider connectionProvider, String language, String parName, String parValue, String parBatchnumber, String parLocator, String parOrg, String pgLimit, String orderBy)    throws ServletException {
    return select(connectionProvider, language, parName, parValue, parBatchnumber, parLocator, parOrg, pgLimit, orderBy, 0, 0);
  }

  public static BatchnumbersData[] select(ConnectionProvider connectionProvider, String language, String parName, String parValue, String parBatchnumber, String parLocator, String parOrg, String pgLimit, String orderBy, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    SELECT snr_batchmasterdata_id, snr_batchlocator_id, ad_org_id,m_product_id,name, value, batchnumber,  locator,  qty , uom from" +
      "    (" +
      "      SELECT bl.snr_batchmasterdata_id, bl.snr_batchlocator_id, bl.ad_org_id,p.m_product_id,zssi_getIdentifierFromKey('m_product_id',p.m_product_id,?) as name, p.value, bm.batchnumber, zssi_getIdentifierFromKey('m_locator_id',bl.m_locator_id,?) as locator, bl.qtyonhand as qty ,zssi_getuom(p.c_uom_id,?) as uom" +
      "      from m_product p, snr_batchmasterdata bm, snr_batchlocator bl , m_locator l" +
      "      where bm.m_product_id=p.m_product_id" +
      "      and p.isbatchtracking='Y'" +
      "      and bm.snr_batchmasterdata_id=bl.snr_batchmasterdata_id" +
      "      and bl.m_locator_id=l.m_locator_id" +
      "      and 1=1";
    strSql = strSql + ((parName==null || parName.equals(""))?"":"  AND upper(p.name) like upper(?) ");
    strSql = strSql + ((parValue==null || parValue.equals(""))?"":"  AND p.value like ? ");
    strSql = strSql + ((parBatchnumber==null || parBatchnumber.equals(""))?"":"  AND bm.batchnumber like ? ");
    strSql = strSql + ((parLocator==null || parLocator.equals(""))?"":"  AND l.value like ? ");
    strSql = strSql + ((parOrg==null || parOrg.equals(""))?"":"  AND bm.ad_org_id in ('0',?) ");
    strSql = strSql + 
      "      AND 4=4";
    strSql = strSql + ((pgLimit==null || pgLimit.equals(""))?"":"  LIMIT " + pgLimit);
    strSql = strSql + 
      "    ) a ORDER BY ";
    strSql = strSql + ((orderBy==null || orderBy.equals(""))?"":orderBy);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);
      if (parName != null && !(parName.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parName);
      }
      if (parValue != null && !(parValue.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parValue);
      }
      if (parBatchnumber != null && !(parBatchnumber.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parBatchnumber);
      }
      if (parLocator != null && !(parLocator.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parLocator);
      }
      if (parOrg != null && !(parOrg.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parOrg);
      }
      if (pgLimit != null && !(pgLimit.equals(""))) {
        }
      if (orderBy != null && !(orderBy.equals(""))) {
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
        BatchnumbersData objectBatchnumbersData = new BatchnumbersData();
        objectBatchnumbersData.snrBatchmasterdataId = UtilSql.getValue(result, "snr_batchmasterdata_id");
        objectBatchnumbersData.snrBatchlocatorId = UtilSql.getValue(result, "snr_batchlocator_id");
        objectBatchnumbersData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectBatchnumbersData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectBatchnumbersData.name = UtilSql.getValue(result, "name");
        objectBatchnumbersData.value = UtilSql.getValue(result, "value");
        objectBatchnumbersData.batchnumber = UtilSql.getValue(result, "batchnumber");
        objectBatchnumbersData.locator = UtilSql.getValue(result, "locator");
        objectBatchnumbersData.qty = UtilSql.getValue(result, "qty");
        objectBatchnumbersData.uom = UtilSql.getValue(result, "uom");
        objectBatchnumbersData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBatchnumbersData);
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
    BatchnumbersData objectBatchnumbersData[] = new BatchnumbersData[vector.size()];
    vector.copyInto(objectBatchnumbersData);
    return(objectBatchnumbersData);
  }

  public static String countRows(ConnectionProvider connectionProvider, String parName, String parValue, String parBatchnumber, String parLocator, String parOrg, String pgLimit)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT count(*) AS value" +
      " from m_product p, snr_batchmasterdata bm, snr_batchlocator bl , m_locator l" +
      "      where bm.m_product_id=p.m_product_id" +
      "      and p.isbatchtracking='Y'" +
      "    and bm.snr_batchmasterdata_id=bl.snr_batchmasterdata_id" +
      "    and bl.m_locator_id=l.m_locator_id" +
      "      and 1=1";
    strSql = strSql + ((parName==null || parName.equals(""))?"":"  AND p.name like ? ");
    strSql = strSql + ((parValue==null || parValue.equals(""))?"":"  AND p.value like ? ");
    strSql = strSql + ((parBatchnumber==null || parBatchnumber.equals(""))?"":"  AND bm.batchnumber like ? ");
    strSql = strSql + ((parLocator==null || parLocator.equals(""))?"":"  AND l.value like ? ");
    strSql = strSql + ((parOrg==null || parOrg.equals(""))?"":"  AND bm.ad_org_id in ('0',?) ");
    strSql = strSql + 
      "      AND 4=4";
    strSql = strSql + ((pgLimit==null || pgLimit.equals(""))?"":"  LIMIT " + pgLimit);

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (parName != null && !(parName.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parName);
      }
      if (parValue != null && !(parValue.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parValue);
      }
      if (parBatchnumber != null && !(parBatchnumber.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parBatchnumber);
      }
      if (parLocator != null && !(parLocator.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parLocator);
      }
      if (parOrg != null && !(parOrg.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, parOrg);
      }
      if (pgLimit != null && !(pgLimit.equals(""))) {
        }

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "value");
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

  public static String getValueProduct(ConnectionProvider connectionProvider, String productId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT value from m_product " +
      "        WHERE m_product_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "value");
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

  public static BatchnumbersData[] set()    throws ServletException {
    BatchnumbersData objectBatchnumbersData[] = new BatchnumbersData[1];
    objectBatchnumbersData[0] = new BatchnumbersData();
    objectBatchnumbersData[0].value = "";
    return objectBatchnumbersData;
  }
}
