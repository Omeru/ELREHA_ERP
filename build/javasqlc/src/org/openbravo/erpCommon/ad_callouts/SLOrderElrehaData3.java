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

class SLOrderElrehaData3 implements FieldProvider {
static Logger log4j = Logger.getLogger(SLOrderElrehaData3.class);
  private String InitRecordNumber="0";
  public String minvalue;
  public String fee;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("minvalue"))
      return minvalue;
    else if (fieldName.equalsIgnoreCase("fee"))
      return fee;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SLOrderElrehaData3[] mrp_elr_getMinPreis(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    return mrp_elr_getMinPreis(connectionProvider, cBpartnerId, 0, 0);
  }

  public static SLOrderElrehaData3[] mrp_elr_getMinPreis(ConnectionProvider connectionProvider, String cBpartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT customfield1 as minValue, customfield2 as fee FROM c_bpartner WHERE c_bpartner_id = ?";

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
        SLOrderElrehaData3 objectSLOrderElrehaData3 = new SLOrderElrehaData3();
        objectSLOrderElrehaData3.minvalue = UtilSql.getValue(result, "minvalue");
        objectSLOrderElrehaData3.fee = UtilSql.getValue(result, "fee");
        objectSLOrderElrehaData3.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSLOrderElrehaData3);
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
    SLOrderElrehaData3 objectSLOrderElrehaData3[] = new SLOrderElrehaData3[vector.size()];
    vector.copyInto(objectSLOrderElrehaData3);
    return(objectSLOrderElrehaData3);
  }
}
