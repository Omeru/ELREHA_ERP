//Sqlc generated V1.O00-1
package org.openz.bommanagement;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

public class BOMMainDialogueData implements FieldProvider {
static Logger log4j = Logger.getLogger(BOMMainDialogueData.class);
  private String InitRecordNumber="0";
  public String language;
  public String zssmWorkstepbomVId;
  public String product;
  public String qtyPlan;
  public String quantity;
  public String qtyreceived;
  public String qtyAvailable;
  public String issuingLocator;
  public String barcode;
  public String type;
  public String id;
  public String mess;
  public String adMessageValue;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("language"))
      return language;
    else if (fieldName.equalsIgnoreCase("zssm_workstepbom_v_id") || fieldName.equals("zssmWorkstepbomVId"))
      return zssmWorkstepbomVId;
    else if (fieldName.equalsIgnoreCase("product"))
      return product;
    else if (fieldName.equalsIgnoreCase("qty_plan") || fieldName.equals("qtyPlan"))
      return qtyPlan;
    else if (fieldName.equalsIgnoreCase("quantity"))
      return quantity;
    else if (fieldName.equalsIgnoreCase("qtyreceived"))
      return qtyreceived;
    else if (fieldName.equalsIgnoreCase("qty_available") || fieldName.equals("qtyAvailable"))
      return qtyAvailable;
    else if (fieldName.equalsIgnoreCase("issuing_locator") || fieldName.equals("issuingLocator"))
      return issuingLocator;
    else if (fieldName.equalsIgnoreCase("barcode"))
      return barcode;
    else if (fieldName.equalsIgnoreCase("type"))
      return type;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("mess"))
      return mess;
    else if (fieldName.equalsIgnoreCase("ad_message_value") || fieldName.equals("adMessageValue"))
      return adMessageValue;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static BOMMainDialogueData[] selectupper(ConnectionProvider connectionProvider, String language)    throws ServletException {
    return selectupper(connectionProvider, language, 0, 0);
  }

  public static BOMMainDialogueData[] selectupper(ConnectionProvider connectionProvider, String language, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    Select ? as language , '' as zssm_workstepbom_v_id, '' as product, '' as qty_plan, '' as quantity, '' as qtyreceived, '' as qty_available, '' as issuing_locator, '' as barcode, '' as type, '' as id, '' as mess, '' as ad_message_value from dual";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);

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
        BOMMainDialogueData objectBOMMainDialogueData = new BOMMainDialogueData();
        objectBOMMainDialogueData.language = UtilSql.getValue(result, "language");
        objectBOMMainDialogueData.zssmWorkstepbomVId = UtilSql.getValue(result, "zssm_workstepbom_v_id");
        objectBOMMainDialogueData.product = UtilSql.getValue(result, "product");
        objectBOMMainDialogueData.qtyPlan = UtilSql.getValue(result, "qty_plan");
        objectBOMMainDialogueData.quantity = UtilSql.getValue(result, "quantity");
        objectBOMMainDialogueData.qtyreceived = UtilSql.getValue(result, "qtyreceived");
        objectBOMMainDialogueData.qtyAvailable = UtilSql.getValue(result, "qty_available");
        objectBOMMainDialogueData.issuingLocator = UtilSql.getValue(result, "issuing_locator");
        objectBOMMainDialogueData.barcode = UtilSql.getValue(result, "barcode");
        objectBOMMainDialogueData.type = UtilSql.getValue(result, "type");
        objectBOMMainDialogueData.id = UtilSql.getValue(result, "id");
        objectBOMMainDialogueData.mess = UtilSql.getValue(result, "mess");
        objectBOMMainDialogueData.adMessageValue = UtilSql.getValue(result, "ad_message_value");
        objectBOMMainDialogueData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBOMMainDialogueData);
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
    BOMMainDialogueData objectBOMMainDialogueData[] = new BOMMainDialogueData[vector.size()];
    vector.copyInto(objectBOMMainDialogueData);
    return(objectBOMMainDialogueData);
  }

  public static BOMMainDialogueData[] selectbarcode(ConnectionProvider connectionProvider, String barcode)    throws ServletException {
    return selectbarcode(connectionProvider, barcode, 0, 0);
  }

  public static BOMMainDialogueData[] selectbarcode(ConnectionProvider connectionProvider, String barcode, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select type,id from  pdc_getDataIdFromScan(?)";

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
        BOMMainDialogueData objectBOMMainDialogueData = new BOMMainDialogueData();
        objectBOMMainDialogueData.type = UtilSql.getValue(result, "type");
        objectBOMMainDialogueData.id = UtilSql.getValue(result, "id");
        objectBOMMainDialogueData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBOMMainDialogueData);
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
    BOMMainDialogueData objectBOMMainDialogueData[] = new BOMMainDialogueData[vector.size()];
    vector.copyInto(objectBOMMainDialogueData);
    return(objectBOMMainDialogueData);
  }

  public static String getusername(ConnectionProvider connectionProvider, String userid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select name from ad_user where ad_user_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, userid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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

  public static String getproductname(ConnectionProvider connectionProvider, String productid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select name from m_product where m_product_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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

  public static String getproductnamefromserial(ConnectionProvider connectionProvider, String snrmasterdataid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select p.name from m_product p, snr_masterdata s where s.snr_masterdata_id = ? and s.m_product_id = p.m_product_id";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrmasterdataid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "name");
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

  public static String getproductidfromserial(ConnectionProvider connectionProvider, String snrmasterdataid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select p.m_product_id from m_product p, snr_masterdata s where s.snr_masterdata_id = ? and s.m_product_id = p.m_product_id";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrmasterdataid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "m_product_id");
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

  public static String getlocatorname(ConnectionProvider connectionProvider, String locatorid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select value from m_locator where m_locator_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, locatorid);

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

  public static String getserialorbatch(ConnectionProvider connectionProvider, String snrmasterid, String batchmasterid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select serialnumber as number from snr_masterdata where snr_masterdata_id = ?" +
      "        union" +
      "        select batchnumber as number from snr_batchmasterdata where snr_batchmasterdata_id = ?" +
      "        limit 1";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, snrmasterid);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, batchmasterid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "number");
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
