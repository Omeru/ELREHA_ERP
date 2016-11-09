//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_callouts;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

class SLOrderElrehaData implements FieldProvider {
static Logger log4j = Logger.getLogger(SLOrderElrehaData.class);
  private String InitRecordNumber="0";
  public String param1;
  public String param2;
  public String param3;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("param1"))
      return param1;
    else if (fieldName.equalsIgnoreCase("param2"))
      return param2;
    else if (fieldName.equalsIgnoreCase("param3"))
      return param3;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLOrderElrehaData[] mrp_elr_getPriceAd(ConnectionProvider connectionProvider, String mProductId, String cBpartnerId)    throws ServletException {
    return mrp_elr_getPriceAd(connectionProvider, mProductId, cBpartnerId, 0, 0);
  }

  public static SLOrderElrehaData[] mrp_elr_getPriceAd(ConnectionProvider connectionProvider, String mProductId, String cBpartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT qty_from as param1, qty_to as param2, fixed as param3 from m_offer_v WHERE m_product_id = ? AND c_bpartner_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
        SLOrderElrehaData objectSLOrderElrehaData = new SLOrderElrehaData();
        objectSLOrderElrehaData.param1 = UtilSql.getValue(result, "param1");
        objectSLOrderElrehaData.param2 = UtilSql.getValue(result, "param2");
        objectSLOrderElrehaData.param3 = UtilSql.getValue(result, "param3");
        objectSLOrderElrehaData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLOrderElrehaData);
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
    SLOrderElrehaData objectSLOrderElrehaData[] = new SLOrderElrehaData[vector.size()];
    vector.copyInto(objectSLOrderElrehaData);
    return(objectSLOrderElrehaData);
  }

  public static String mrp_elr_getMinPreis(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT customfield3 FROM c_bpartner WHERE c_bpartner_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "customfield3");
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

  public static SLOrderElrehaData[] mrp_elr_getMinValueAndFee(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    return mrp_elr_getMinValueAndFee(connectionProvider, cBpartnerId, 0, 0);
  }

  public static SLOrderElrehaData[] mrp_elr_getMinValueAndFee(ConnectionProvider connectionProvider, String cBpartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT customfield1 as param1, customfield2 as param1, null as param3 FROM c_bpartner WHERE c_bpartner_id = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
        SLOrderElrehaData objectSLOrderElrehaData = new SLOrderElrehaData();
        objectSLOrderElrehaData.param1 = UtilSql.getValue(result, "param1");
        objectSLOrderElrehaData.param1 = UtilSql.getValue(result, "param1");
        objectSLOrderElrehaData.param3 = UtilSql.getValue(result, "param3");
        objectSLOrderElrehaData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLOrderElrehaData);
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
    SLOrderElrehaData objectSLOrderElrehaData[] = new SLOrderElrehaData[vector.size()];
    vector.copyInto(objectSLOrderElrehaData);
    return(objectSLOrderElrehaData);
  }
}
