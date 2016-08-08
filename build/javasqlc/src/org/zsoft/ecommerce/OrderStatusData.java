//Sqlc generated V1.O00-1
package org.zsoft.ecommerce;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

public class OrderStatusData implements FieldProvider {
static Logger log4j = Logger.getLogger(OrderStatusData.class);
  private String InitRecordNumber="0";
  public String cOrderId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static OrderStatusData[] select(ConnectionProvider connectionProvider, String bPartnerId)    throws ServletException {
    return select(connectionProvider, bPartnerId, 0, 0);
  }

  public static OrderStatusData[] select(ConnectionProvider connectionProvider, String bPartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT c_order_id from c_order where issotrx='N' and c_bpartner_id= ? and ecommerceorder='N' and docstatus='CO'";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bPartnerId);

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
        OrderStatusData objectOrderStatusData = new OrderStatusData();
        objectOrderStatusData.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectOrderStatusData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrderStatusData);
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
    OrderStatusData objectOrderStatusData[] = new OrderStatusData[vector.size()];
    vector.copyInto(objectOrderStatusData);
    return(objectOrderStatusData);
  }

  public static int insertOrderStatusNew(ConnectionProvider connectionProvider, String adOrgId, String shopId, String shopoderno, String externalId, String c_order_id, String status, String message, String issotrx)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     insert into zse_shoporderstatus (ZSE_SHOPORDERSTATUS_ID, AD_CLIENT_ID, ad_org_id, CREATEDBY, UPDATEDBY, " +
      "                                      ZSE_SHOP_ID, SHOPODERNO, EXTERNALID, C_ORDER_ID, STATUS,message,issotrx)" +
      "                               values (get_uuid(),'C726FEC915A54A0995C568555DA5BB3C'," +
      "                                        ?,'0','0',?,?,?,?,?,?,?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopoderno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_order_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, message);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, issotrx);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateOrderStatus(ConnectionProvider connectionProvider, String status, String message, String trackingno, String shipper, String datedelivered, String shopOrderstatusId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     update zse_shoporderstatus set STATUS = ? , updated=now(), message=message||';'||?,trackingno=?,shipper=?,datedelivered=to_date(?) where zse_shoporderstatus_id = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, message);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trackingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shipper);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, datedelivered);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopOrderstatusId);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static int updateOrderStatusExternalID(ConnectionProvider connectionProvider, String externalId, String shopOrderstatusId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     update zse_shoporderstatus set externalid = ? , updated=now() where zse_shoporderstatus_id = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopOrderstatusId);

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

  public static String getStatusIDByExternalID(ConnectionProvider connectionProvider, String cbPartner, String externalId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     select z.zse_shoporderstatus_id from zse_shoporderstatus z,c_order o where z.c_order_id=o.c_order_id  " +
      "            and externalid=? and o. c_bpartner_id= ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cbPartner);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, externalId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zse_shoporderstatus_id");
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

  public static String getStatusIDByOrder(ConnectionProvider connectionProvider, String cOrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     select zse_shoporderstatus_id from zse_shoporderstatus where c_order_id=?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zse_shoporderstatus_id");
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

/**
Drop Ship Order (PO),Order (PO) 
 */
  public static String getPurchaseOrderIDByDocumentno(ConnectionProvider connectionProvider, String documentno)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     select c_order_id from c_order where documentno = ? and  c_doctype_id in ('EE19ABBDB5A94C519DAB11003320FC8E','B342FD5CA1C64E8BA25A0A6F6C98C7DA')";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, documentno);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_order_id");
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
