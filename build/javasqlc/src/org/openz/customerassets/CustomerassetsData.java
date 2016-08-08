//Sqlc generated V1.O00-1
package org.openz.customerassets;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

public class CustomerassetsData implements FieldProvider {
static Logger log4j = Logger.getLogger(CustomerassetsData.class);
  private String InitRecordNumber="0";
  public String datefrom;
  public String dateto;
  public String columnname;
  public String referencename;
  public String includesemptyitem;
  public String adValRuleId;
  public String mProductId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("datefrom"))
      return datefrom;
    else if (fieldName.equalsIgnoreCase("dateto"))
      return dateto;
    else if (fieldName.equalsIgnoreCase("columnname"))
      return columnname;
    else if (fieldName.equalsIgnoreCase("referencename"))
      return referencename;
    else if (fieldName.equalsIgnoreCase("includesemptyitem"))
      return includesemptyitem;
    else if (fieldName.equalsIgnoreCase("ad_val_rule_id") || fieldName.equals("adValRuleId"))
      return adValRuleId;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static CustomerassetsData[] init(ConnectionProvider connectionProvider)    throws ServletException {
    return init(connectionProvider, 0, 0);
  }

  public static CustomerassetsData[] init(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     SELECT '' as DateFrom, '' as DateTo, '' as columnname , '' as referencename, '' as includesemptyitem, '' as AD_VAL_RULE_ID,'' as m_product_id  from dual";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

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
        CustomerassetsData objectCustomerassetsData = new CustomerassetsData();
        objectCustomerassetsData.datefrom = UtilSql.getValue(result, "datefrom");
        objectCustomerassetsData.dateto = UtilSql.getValue(result, "dateto");
        objectCustomerassetsData.columnname = UtilSql.getValue(result, "columnname");
        objectCustomerassetsData.referencename = UtilSql.getValue(result, "referencename");
        objectCustomerassetsData.includesemptyitem = UtilSql.getValue(result, "includesemptyitem");
        objectCustomerassetsData.adValRuleId = UtilSql.getValue(result, "ad_val_rule_id");
        objectCustomerassetsData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectCustomerassetsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCustomerassetsData);
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
    CustomerassetsData objectCustomerassetsData[] = new CustomerassetsData[vector.size()];
    vector.copyInto(objectCustomerassetsData);
    return(objectCustomerassetsData);
  }

  public static String getProduct(ConnectionProvider connectionProvider, String assetStockedId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ca_getproductfromauxtext(?) from dual";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, assetStockedId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ca_getproductfromauxtext");
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

  public static String getQty(ConnectionProvider connectionProvider, String productId, String bPartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT coalesce(sum(actualqty),0) as qty from ca_assetsstocked where m_product_id = ? and c_bpartner_id= ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bPartnerId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "qty");
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

  public static String getUOM(ConnectionProvider connectionProvider, String productId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT c_uom_id from m_product where m_product_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);

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

  public static String getPricelist(ConnectionProvider connectionProvider, String productId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT m_pricelist_id from m_pricelist  where c_currency_id = ? and issopricelist='Y' order by  isdefault desc limit 1";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_pricelist_id");
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

  public static String getPrice(ConnectionProvider connectionProvider, String bPartnerId, String productId, String pQty, String orderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT ca_offerbuyback(?,?,?,?) as retval from dual";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bPartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pQty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "retval");
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
