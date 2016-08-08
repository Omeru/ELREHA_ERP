//Sqlc generated V1.O00-1
package org.openz.view.templates;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

class TemplatesData implements FieldProvider {
static Logger log4j = Logger.getLogger(TemplatesData.class);
  private String InitRecordNumber="0";
  public String selectorcolumnname;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("selectorcolumnname"))
      return selectorcolumnname;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static TemplatesData[] getSelectorInputColumns(ConnectionProvider connectionProvider, String tabId, String selectorreferenceId)    throws ServletException {
    return getSelectorInputColumns(connectionProvider, tabId, selectorreferenceId, 0, 0);
  }

  public static TemplatesData[] getSelectorInputColumns(ConnectionProvider connectionProvider, String tabId, String selectorreferenceId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT sc.columnname as selectorcolumnname " +
      "        from  ad_ref_search_column sc,ad_ref_search rs,ad_reference r" +
      "        where r.ad_reference_id=rs.ad_reference_id and rs.ad_ref_search_id=sc.ad_ref_search_id" +
      "        and sc.columntype='I'  and lower(sc.columnname)!='ad_org_id'" +
      "        and lower(sc.columnname) in (select lower(cv.columnname) from ad_column_v cv,ad_field_v v where v.ad_column_v_id=cv.ad_column_v_id and v.ad_tab_id=?)" +
      "        and r.ad_reference_id= ? ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tabId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, selectorreferenceId);

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
        TemplatesData objectTemplatesData = new TemplatesData();
        objectTemplatesData.selectorcolumnname = UtilSql.getValue(result, "selectorcolumnname");
        objectTemplatesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTemplatesData);
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
    TemplatesData objectTemplatesData[] = new TemplatesData[vector.size()];
    vector.copyInto(objectTemplatesData);
    return(objectTemplatesData);
  }
}
