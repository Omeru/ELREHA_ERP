//Sqlc generated V1.O00-1
package org.openz.controller.manualTabPane;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

class OrderlineFastEntryData implements FieldProvider {
static Logger log4j = Logger.getLogger(OrderlineFastEntryData.class);
  private String InitRecordNumber="0";
  public String cOrderlineId;
  public String cProjecttaskId;
  public String amount;
  public String line;
  public String mProductId;
  public String pricelist;
  public String priceactual;
  public String qtyordered;
  public String qtydelivered;
  public String qtyinvoiced;
  public String discount;
  public String description;
  public String preselected;
  public String productcategory;
  public String uom;
  public String ignoreresidue;
  public String deliverycomplete;
  public String seqno;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("c_orderline_id") || fieldName.equals("cOrderlineId"))
      return cOrderlineId;
    else if (fieldName.equalsIgnoreCase("c_projecttask_id") || fieldName.equals("cProjecttaskId"))
      return cProjecttaskId;
    else if (fieldName.equalsIgnoreCase("amount"))
      return amount;
    else if (fieldName.equalsIgnoreCase("line"))
      return line;
    else if (fieldName.equalsIgnoreCase("m_product_id") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("pricelist"))
      return pricelist;
    else if (fieldName.equalsIgnoreCase("priceactual"))
      return priceactual;
    else if (fieldName.equalsIgnoreCase("qtyordered"))
      return qtyordered;
    else if (fieldName.equalsIgnoreCase("qtydelivered"))
      return qtydelivered;
    else if (fieldName.equalsIgnoreCase("qtyinvoiced"))
      return qtyinvoiced;
    else if (fieldName.equalsIgnoreCase("discount"))
      return discount;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("preselected"))
      return preselected;
    else if (fieldName.equalsIgnoreCase("productcategory"))
      return productcategory;
    else if (fieldName.equalsIgnoreCase("uom"))
      return uom;
    else if (fieldName.equalsIgnoreCase("ignoreresidue"))
      return ignoreresidue;
    else if (fieldName.equalsIgnoreCase("deliverycomplete"))
      return deliverycomplete;
    else if (fieldName.equalsIgnoreCase("seqno"))
      return seqno;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static OrderlineFastEntryData[] select(ConnectionProvider connectionProvider, String cOrderID, String productvalue, String lang, String productname)    throws ServletException {
    return select(connectionProvider, cOrderID, productvalue, lang, productname, 0, 0);
  }

  public static OrderlineFastEntryData[] select(ConnectionProvider connectionProvider, String cOrderID, String productvalue, String lang, String productname, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select ol.c_orderline_ID,ol.C_Projecttask_ID,case when ol.linegrossamt=0 then ol.linenetamt else ol.linegrossamt end as amount,ol.Line,ol.M_Product_ID," +
      "             ol.pricelist,ol.priceactual,ol.qtyordered,ol.qtydelivered,ol.qtyinvoiced,ol.discount,ol.description," +
      "             'N' as preselected,c.name as productcategory,zssi_getuom(p.c_uom_id,?) as uom," +
      "             ol.ignoreresidue,ol.deliverycomplete,ol.line as seqno" +
      "             from c_orderline ol,m_product p , m_product_category c" +
      "             where ol.c_order_ID = ? " +
      "             and p.m_product_id=ol.m_product_id and c.m_product_category_id=p.m_product_category_id " +
      "             and p.value like ?" +
      "             and upper(zssi_getproductname(p.m_product_id,?)) like upper(?)" +
      "        order by ol.line";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cOrderID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productvalue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);

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
        OrderlineFastEntryData objectOrderlineFastEntryData = new OrderlineFastEntryData();
        objectOrderlineFastEntryData.cOrderlineId = UtilSql.getValue(result, "c_orderline_id");
        objectOrderlineFastEntryData.cProjecttaskId = UtilSql.getValue(result, "c_projecttask_id");
        objectOrderlineFastEntryData.amount = UtilSql.getValue(result, "amount");
        objectOrderlineFastEntryData.line = UtilSql.getValue(result, "line");
        objectOrderlineFastEntryData.mProductId = UtilSql.getValue(result, "m_product_id");
        objectOrderlineFastEntryData.pricelist = UtilSql.getValue(result, "pricelist");
        objectOrderlineFastEntryData.priceactual = UtilSql.getValue(result, "priceactual");
        objectOrderlineFastEntryData.qtyordered = UtilSql.getValue(result, "qtyordered");
        objectOrderlineFastEntryData.qtydelivered = UtilSql.getValue(result, "qtydelivered");
        objectOrderlineFastEntryData.qtyinvoiced = UtilSql.getValue(result, "qtyinvoiced");
        objectOrderlineFastEntryData.discount = UtilSql.getValue(result, "discount");
        objectOrderlineFastEntryData.description = UtilSql.getValue(result, "description");
        objectOrderlineFastEntryData.preselected = UtilSql.getValue(result, "preselected");
        objectOrderlineFastEntryData.productcategory = UtilSql.getValue(result, "productcategory");
        objectOrderlineFastEntryData.uom = UtilSql.getValue(result, "uom");
        objectOrderlineFastEntryData.ignoreresidue = UtilSql.getValue(result, "ignoreresidue");
        objectOrderlineFastEntryData.deliverycomplete = UtilSql.getValue(result, "deliverycomplete");
        objectOrderlineFastEntryData.seqno = UtilSql.getValue(result, "seqno");
        objectOrderlineFastEntryData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectOrderlineFastEntryData);
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
    OrderlineFastEntryData objectOrderlineFastEntryData[] = new OrderlineFastEntryData[vector.size()];
    vector.copyInto(objectOrderlineFastEntryData);
    return(objectOrderlineFastEntryData);
  }

  public static String insert(Connection conn, ConnectionProvider connectionProvider, String idValue, String productId, String qty, String price, String listprice, String stdprice, String discountprice, String description)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select zsse_createOrderLineWithPrices(?,?,to_number(?),to_number(?),to_number(?),to_number(?),to_number(?),?,null);";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, idValue);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, price);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, listprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stdprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discountprice);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zsse_createorderlinewithprices");
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
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(strReturn);
  }

  public static int update(Connection conn, ConnectionProvider connectionProvider, String productId, String qty, String description, String updatedby, String pricelist, String priceactual, String discount, String corderlineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      UPDATE c_orderline  set m_product_id=?,QTYORDERED=to_number(?),description=?,updatedby=?,updated=now(),pricelist=to_number(?),priceactual=to_number(?),discount=to_number(?)" +
      "      WHERE c_orderline_id = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, productId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricelist);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, discount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, corderlineId);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static String isExisting(ConnectionProvider connectionProvider, String porderlineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT count(*) from c_orderline where c_orderline_id = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, porderlineId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "count");
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

  public static int delete(Connection conn, ConnectionProvider connectionProvider, String orderlineId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       delete from c_orderline where c_orderline_id = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderlineId);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + e.getSQLState() + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static String gfetNextLine(ConnectionProvider connectionProvider, String orderId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM c_orderline WHERE  C_order_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "defaultvalue");
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

  public static String getOffersPrice(ConnectionProvider connectionProvider, String mProductId, String qty, String orderid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ROUND(M_GET_OFFERS_PRICE(TO_DATE(o.dateordered),o.c_bpartner_id,?,TO_NUMBER(?), o.m_pricelist_id,'N',null,'N',null,null,null),c.PRICEPRECISION ) as total" +
      "             from C_ORDER    O ,C_CURRENCY C WHERE C.C_CURRENCY_ID = O.C_CURRENCY_ID AND O.C_ORDER_ID    = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, qty);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "total");
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

  public static String getStdPrice(ConnectionProvider connectionProvider, String mProductId, String orderid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ROUND(m_bom_pricestd(?, o.m_pricelist_id,null,null,null),c.PRICEPRECISION ) as total" +
      "             from C_ORDER    O ,C_CURRENCY C WHERE C.C_CURRENCY_ID = O.C_CURRENCY_ID AND O.C_ORDER_ID    = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "total");
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

  public static String getListPrice(ConnectionProvider connectionProvider, String mProductId, String orderid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT ROUND(m_bom_pricelist(?, o.m_pricelist_id,null,null),c.PRICEPRECISION ) as total" +
      "             from C_ORDER    O ,C_CURRENCY C WHERE C.C_CURRENCY_ID = O.C_CURRENCY_ID AND O.C_ORDER_ID    = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "total");
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

  public static String isFreight(ConnectionProvider connectionProvider, String orderid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT  c_orderneedsfreight(?) from dual";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_orderneedsfreight");
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

  public static String getDiscount(ConnectionProvider connectionProvider, String pricestd, String priceactual, String orderid)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT case when to_number(?)>0 then ROUND(100*((to_number(?)-to_number(?))/(to_number(?))),2) else 0 end as total" +
      "             from C_ORDER    O where O.C_ORDER_ID    = ?";

    ResultSet result;
    String strReturn = "0";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, priceactual);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pricestd);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderid);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "total");
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
