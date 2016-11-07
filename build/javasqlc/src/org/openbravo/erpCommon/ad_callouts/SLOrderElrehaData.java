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
  public String qtyfrom;
  public String qtyto;
  public String fixed;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("qtyfrom"))
      return qtyfrom;
    else if (fieldName.equalsIgnoreCase("qtyto"))
      return qtyto;
    else if (fieldName.equalsIgnoreCase("fixed"))
      return fixed;
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
      "       SELECT qty_from as qtyFrom, qty_to as qtyTo, fixed as fixed from m_offer_v WHERE m_product_id = ? AND c_bpartner_id = ?";

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
        objectSLOrderElrehaData.qtyfrom = UtilSql.getValue(result, "qtyfrom");
        objectSLOrderElrehaData.qtyto = UtilSql.getValue(result, "qtyto");
        objectSLOrderElrehaData.fixed = UtilSql.getValue(result, "fixed");
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
