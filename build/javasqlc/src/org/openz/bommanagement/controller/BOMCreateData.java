//Sqlc generated V1.O00-1
package org.openz.bommanagement.controller;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

class BOMCreateData implements FieldProvider {
static Logger log4j = Logger.getLogger(BOMCreateData.class);
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
  public String serialnumber;

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
    else if (fieldName.equalsIgnoreCase("serialnumber"))
      return serialnumber;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static BOMCreateData[] selectupper(ConnectionProvider connectionProvider, String language)    throws ServletException {
    return selectupper(connectionProvider, language, 0, 0);
  }

  public static BOMCreateData[] selectupper(ConnectionProvider connectionProvider, String language, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "    Select ? as language , '' as zssm_workstepbom_v_id, '' as product, '' as qty_plan, '' as quantity, '' as qtyreceived, '' as qty_available, '' as issuing_locator, '' as barcode, '' as type, '' as id, '' as mess, '' as ad_message_value, '' as serialnumber from dual";

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
        BOMCreateData objectBOMCreateData = new BOMCreateData();
        objectBOMCreateData.language = UtilSql.getValue(result, "language");
        objectBOMCreateData.zssmWorkstepbomVId = UtilSql.getValue(result, "zssm_workstepbom_v_id");
        objectBOMCreateData.product = UtilSql.getValue(result, "product");
        objectBOMCreateData.qtyPlan = UtilSql.getValue(result, "qty_plan");
        objectBOMCreateData.quantity = UtilSql.getValue(result, "quantity");
        objectBOMCreateData.qtyreceived = UtilSql.getValue(result, "qtyreceived");
        objectBOMCreateData.qtyAvailable = UtilSql.getValue(result, "qty_available");
        objectBOMCreateData.issuingLocator = UtilSql.getValue(result, "issuing_locator");
        objectBOMCreateData.barcode = UtilSql.getValue(result, "barcode");
        objectBOMCreateData.type = UtilSql.getValue(result, "type");
        objectBOMCreateData.id = UtilSql.getValue(result, "id");
        objectBOMCreateData.mess = UtilSql.getValue(result, "mess");
        objectBOMCreateData.adMessageValue = UtilSql.getValue(result, "ad_message_value");
        objectBOMCreateData.serialnumber = UtilSql.getValue(result, "serialnumber");
        objectBOMCreateData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBOMCreateData);
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
    BOMCreateData objectBOMCreateData[] = new BOMCreateData[vector.size()];
    vector.copyInto(objectBOMCreateData);
    return(objectBOMCreateData);
  }

  public static BOMCreateData[] selectbarcode(ConnectionProvider connectionProvider, String barcode)    throws ServletException {
    return selectbarcode(connectionProvider, barcode, 0, 0);
  }

  public static BOMCreateData[] selectbarcode(ConnectionProvider connectionProvider, String barcode, int firstRegister, int numberRegisters)    throws ServletException {
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
        BOMCreateData objectBOMCreateData = new BOMCreateData();
        objectBOMCreateData.type = UtilSql.getValue(result, "type");
        objectBOMCreateData.id = UtilSql.getValue(result, "id");
        objectBOMCreateData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBOMCreateData);
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
    BOMCreateData objectBOMCreateData[] = new BOMCreateData[vector.size()];
    vector.copyInto(objectBOMCreateData);
    return(objectBOMCreateData);
  }

  public static String createInsertion(ConnectionProvider connectionProvider, String ClientId, String OrgId, String UserId, String ProductId, String Serialnumber, String LocatorId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select pdc_insertnewbom(?,?,?,?,?,?)";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Serialnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, LocatorId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "pdc_insertnewbom");
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

  public static String serialfromConsumtion(ConnectionProvider connectionProvider, String ConsumptionId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT serialnumber from snr_masterdata where m_internal_consumptionline_id = (select m_internal_consumptionline_id from m_internal_consumptionline where m_internal_consumption_id =?);";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ConsumptionId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "serialnumber");
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
