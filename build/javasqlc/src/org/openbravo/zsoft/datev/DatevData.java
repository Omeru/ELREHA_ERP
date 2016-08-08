//Sqlc generated V1.O00-1
package org.openbravo.zsoft.datev;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;

public class DatevData implements FieldProvider {
static Logger log4j = Logger.getLogger(DatevData.class);
  private String InitRecordNumber="0";
  public String zsdvInsertdatevimportSusa;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("zsdv_insertdatevimport_susa") || fieldName.equals("zsdvInsertdatevimportSusa"))
      return zsdvInsertdatevimportSusa;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static String importSuSa(ConnectionProvider connectionProvider, String filename, String user, String zsfisusadatev)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select zsdv_InsertDatevImport_SuSa(?,?,?) from dual";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, filename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, zsfisusadatev);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zsdv_insertdatevimport_susa");
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
