//Sqlc generated V1.O00-1
package org.zsoft.ecommerce.order.client;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

public class OrderData implements FieldProvider {
static Logger log4j = Logger.getLogger(OrderData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String cDoctypeId;
  public String cOrderId;
  public String documentno;
  public String docstatus;
  public String isdelivered;
  public String isinvoiced;
  public String cBpartnerId;
  public String cBpartnerLocationId;
  public String paymentrule;
  public String deliveryviarule;
  public String description;
  public String scheddeliverydate;
  public String sddami;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("c_doctype_id") || fieldName.equals("cDoctypeId"))
      return cDoctypeId;
    else if (fieldName.equalsIgnoreCase("c_order_id") || fieldName.equals("cOrderId"))
      return cOrderId;
    else if (fieldName.equalsIgnoreCase("documentno"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("docstatus"))
      return docstatus;
    else if (fieldName.equalsIgnoreCase("isdelivered"))
      return isdelivered;
    else if (fieldName.equalsIgnoreCase("isinvoiced"))
      return isinvoiced;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("paymentrule"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("deliveryviarule"))
      return deliveryviarule;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("scheddeliverydate"))
      return scheddeliverydate;
    else if (fieldName.equalsIgnoreCase("sddami"))
      return sddami;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static OrderData[] select(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    return select(connectionProvider, OrderId, 0, 0);
  }

  public static OrderData[] select(ConnectionProvider connectionProvider, String OrderId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select ad_org_id,c_doctype_id,c_order_id,documentno,docstatus,isdelivered,isinvoiced,c_bpartner_id,(select c_location_id from c_bpartner_location b, c_order c where b.c_bpartner_location_id=c.c_bpartner_location_id and c_order_id=?)  as c_bpartner_location_id," +
      "               paymentrule,deliveryviarule,description,scheddeliverydate,to_char(scheddeliverydate,'YYYY-MM-DD') as sddami from c_order" +
      "                        where c_order_id=?        ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

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
        OrderData objectOrderData = new OrderData();
        objectOrderData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectOrderData.cDoctypeId = UtilSql.getValue(result, "c_doctype_id");
        objectOrderData.cOrderId = UtilSql.getValue(result, "c_order_id");
        objectOrderData.documentno = UtilSql.getValue(result, "documentno");
        objectOrderData.docstatus = UtilSql.getValue(result, "docstatus");
        objectOrderData.isdelivered = UtilSql.getValue(result, "isdelivered");
        objectOrderData.isinvoiced = UtilSql.getValue(result, "isinvoiced");
        objectOrderData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectOrderData.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectOrderData.paymentrule = UtilSql.getValue(result, "paymentrule");
        objectOrderData.deliveryviarule = UtilSql.getValue(result, "deliveryviarule");
        objectOrderData.description = UtilSql.getValue(result, "description");
        objectOrderData.scheddeliverydate = UtilSql.getDateValue(result, "scheddeliverydate", "dd-MM-yyyy");
        objectOrderData.sddami = UtilSql.getValue(result, "sddami");
        objectOrderData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrderData);
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
    OrderData objectOrderData[] = new OrderData[vector.size()];
    vector.copyInto(objectOrderData);
    return(objectOrderData);
  }

  public static int InsertPoReference(ConnectionProvider connectionProvider, String docno, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "               update c_order set poreference=?,ecommerceorder='Y' where c_order_id=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, docno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

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

  public static String selectporeference(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select poreference from c_order where c_order_id=?        ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "poreference");
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

  public static String selectWSpw(ConnectionProvider connectionProvider, String UserName)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select password from ad_user where username= ?       ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UserName);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "password");
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

  public static String ecommerced(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select ecommerceorder from c_order where c_order_id=?        ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ecommerceorder");
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

  public static String selectUrl(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select url from zse_shop sh,zse_ecommercegrant g where g.zse_shop_id=sh.zse_shop_id and g.c_bpartner_id=(select c_bpartner_id  from c_order where c_order_id=?) and g.isactive='Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "url");
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

  public static String selectRemoteOrgID(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select orgidremote from zse_shop sh,zse_ecommercegrant g where g.zse_shop_id=sh.zse_shop_id and g.c_bpartner_id=(select c_bpartner_id  from c_order where c_order_id=?) and g.isactive='Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "orgidremote");
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

  public static String selectRemoteAPI(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select coalesce(sh.api,'SOAP') from zse_shop sh,zse_ecommercegrant g where g.zse_shop_id=sh.zse_shop_id and g.c_bpartner_id=(select c_bpartner_id  from c_order where c_order_id=?) and g.isactive='Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "coalesce");
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

  public static String selectRemoteShopId(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select g.zse_shop_id from zse_ecommercegrant g where g.c_bpartner_id=(select c_bpartner_id  from c_order where c_order_id=?) and g.isactive='Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zse_shop_id");
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

  public static String selectRemoteShopUserID(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select sh.ad_user_id from zse_shop sh,zse_ecommercegrant g where g.zse_shop_id=sh.zse_shop_id and g.c_bpartner_id=(select c_bpartner_id  from c_order where c_order_id=?) and g.isactive='Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_user_id");
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

  public static String selectRemoteShopUserName(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select u.username from zse_shop sh,zse_ecommercegrant g,ad_user u where g.zse_shop_id=sh.zse_shop_id and g.c_bpartner_id=(select c_bpartner_id  from c_order where c_order_id=?) and g.isactive='Y' and u.ad_user_id=sh.ad_user_id";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "username");
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

  public static String selectRemoteBPartnerID(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select bpartneridremote from zse_shop sh,zse_ecommercegrant g where g.zse_shop_id=sh.zse_shop_id and g.c_bpartner_id=(select c_bpartner_id  from c_order where c_order_id=?) and g.isactive='Y'";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "bpartneridremote");
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

  public static String selectDropShipCustomerOrder(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select c_order_id from c_order where c_order_id=(select orderselfjoin  from c_order where c_doctype_id='EE19ABBDB5A94C519DAB11003320FC8E' and c_order_id=?)";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

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

  public static String selectOwnCustromerNoAtVendorSite(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "              select owncodeatpartnersite from c_bpartner where c_bpartner_id=(select c_bpartner_id  from c_order where c_order_id=?) ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "owncodeatpartnersite");
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
