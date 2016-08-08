//Sqlc generated V1.O00-1
package org.openz.controller.manualTabPane;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;

class ShopProductBulkSettingsData implements FieldProvider {
static Logger log4j = Logger.getLogger(ShopProductBulkSettingsData.class);
  private String InitRecordNumber="0";
  public String zseBulkproductshopassignment;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("zse_bulkproductshopassignment") || fieldName.equals("zseBulkproductshopassignment"))
      return zseBulkproductshopassignment;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static String insert(ConnectionProvider connectionProvider, String userid, String shopid, String productId, String catId, String tagId, String isorderble, String hideonnostock, String allowaordernostock, String maxstockshown, String minorderqtyn, String maxorderqty)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select zse_bulkproductshopassignment(?,?,?,?,?,?,?,?,to_number(?),to_number(?),to_number(?))";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, userid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, catId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, tagId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isorderble);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hideonnostock);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, allowaordernostock);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maxstockshown);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, minorderqtyn);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maxorderqty);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zse_bulkproductshopassignment");
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
