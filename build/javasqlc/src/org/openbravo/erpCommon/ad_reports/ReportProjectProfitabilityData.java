//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_reports;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

class ReportProjectProfitabilityData implements FieldProvider {
static Logger log4j = Logger.getLogger(ReportProjectProfitabilityData.class);
  private String InitRecordNumber="0";
  public String name;
  public String id;
  public String header1;
  public String headerpron;
  public String headerpro;
  public String headerresp;
  public String headersalesrep;
  public String headerbpartner;
  public String headermargep;
  public String headermarge;
  public String headerist;
  public String headerplan;
  public String headerange;
  public String headerauftr;
  public String headerrechn;
  public String headerstatus;
  public String headerstartdate;
  public String headerenddate;
  public String pSearchkey;
  public String pName;
  public String pResponsible;
  public String pBpartner;
  public String pSalesrep;
  public String pStatus;
  public String pStartdate;
  public String pDatefinish;
  public String pInvoicedocno;
  public String pInvoicenetamt;
  public String pInvoicedate;
  public String pOrderdocno;
  public String pOrdernetamt;
  public String pOrderdate;
  public String pOfferdocno;
  public String pOffernetamt;
  public String pOfferdate;
  public String pPlannedamt;
  public String pActualcost;
  public String pMarginamt;
  public String pMarginperc;
  public String pOrgId;
  public String pIsitalic;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("id"))
      return id;
    else if (fieldName.equalsIgnoreCase("header1"))
      return header1;
    else if (fieldName.equalsIgnoreCase("headerpron"))
      return headerpron;
    else if (fieldName.equalsIgnoreCase("headerpro"))
      return headerpro;
    else if (fieldName.equalsIgnoreCase("headerresp"))
      return headerresp;
    else if (fieldName.equalsIgnoreCase("headersalesrep"))
      return headersalesrep;
    else if (fieldName.equalsIgnoreCase("headerbpartner"))
      return headerbpartner;
    else if (fieldName.equalsIgnoreCase("headermargep"))
      return headermargep;
    else if (fieldName.equalsIgnoreCase("headermarge"))
      return headermarge;
    else if (fieldName.equalsIgnoreCase("headerist"))
      return headerist;
    else if (fieldName.equalsIgnoreCase("headerplan"))
      return headerplan;
    else if (fieldName.equalsIgnoreCase("headerange"))
      return headerange;
    else if (fieldName.equalsIgnoreCase("headerauftr"))
      return headerauftr;
    else if (fieldName.equalsIgnoreCase("headerrechn"))
      return headerrechn;
    else if (fieldName.equalsIgnoreCase("headerstatus"))
      return headerstatus;
    else if (fieldName.equalsIgnoreCase("headerstartdate"))
      return headerstartdate;
    else if (fieldName.equalsIgnoreCase("headerenddate"))
      return headerenddate;
    else if (fieldName.equalsIgnoreCase("p_searchkey") || fieldName.equals("pSearchkey"))
      return pSearchkey;
    else if (fieldName.equalsIgnoreCase("p_name") || fieldName.equals("pName"))
      return pName;
    else if (fieldName.equalsIgnoreCase("p_responsible") || fieldName.equals("pResponsible"))
      return pResponsible;
    else if (fieldName.equalsIgnoreCase("p_bpartner") || fieldName.equals("pBpartner"))
      return pBpartner;
    else if (fieldName.equalsIgnoreCase("p_salesrep") || fieldName.equals("pSalesrep"))
      return pSalesrep;
    else if (fieldName.equalsIgnoreCase("p_status") || fieldName.equals("pStatus"))
      return pStatus;
    else if (fieldName.equalsIgnoreCase("p_startdate") || fieldName.equals("pStartdate"))
      return pStartdate;
    else if (fieldName.equalsIgnoreCase("p_datefinish") || fieldName.equals("pDatefinish"))
      return pDatefinish;
    else if (fieldName.equalsIgnoreCase("p_invoicedocno") || fieldName.equals("pInvoicedocno"))
      return pInvoicedocno;
    else if (fieldName.equalsIgnoreCase("p_invoicenetamt") || fieldName.equals("pInvoicenetamt"))
      return pInvoicenetamt;
    else if (fieldName.equalsIgnoreCase("p_invoicedate") || fieldName.equals("pInvoicedate"))
      return pInvoicedate;
    else if (fieldName.equalsIgnoreCase("p_orderdocno") || fieldName.equals("pOrderdocno"))
      return pOrderdocno;
    else if (fieldName.equalsIgnoreCase("p_ordernetamt") || fieldName.equals("pOrdernetamt"))
      return pOrdernetamt;
    else if (fieldName.equalsIgnoreCase("p_orderdate") || fieldName.equals("pOrderdate"))
      return pOrderdate;
    else if (fieldName.equalsIgnoreCase("p_offerdocno") || fieldName.equals("pOfferdocno"))
      return pOfferdocno;
    else if (fieldName.equalsIgnoreCase("p_offernetamt") || fieldName.equals("pOffernetamt"))
      return pOffernetamt;
    else if (fieldName.equalsIgnoreCase("p_offerdate") || fieldName.equals("pOfferdate"))
      return pOfferdate;
    else if (fieldName.equalsIgnoreCase("p_plannedamt") || fieldName.equals("pPlannedamt"))
      return pPlannedamt;
    else if (fieldName.equalsIgnoreCase("p_actualcost") || fieldName.equals("pActualcost"))
      return pActualcost;
    else if (fieldName.equalsIgnoreCase("p_marginamt") || fieldName.equals("pMarginamt"))
      return pMarginamt;
    else if (fieldName.equalsIgnoreCase("p_marginperc") || fieldName.equals("pMarginperc"))
      return pMarginperc;
    else if (fieldName.equalsIgnoreCase("p_org_id") || fieldName.equals("pOrgId"))
      return pOrgId;
    else if (fieldName.equalsIgnoreCase("p_isitalic") || fieldName.equals("pIsitalic"))
      return pIsitalic;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static ReportProjectProfitabilityData[] select(ConnectionProvider connectionProvider, String lang, String adOrgID, String responsibleID, String Status, String offerFrom, String offerTo, String orderFrom, String orderTo, String startFrom, String startTo, String invoiceFrom, String invoiceTo, String salesReps, String bPartners)    throws ServletException {
    return select(connectionProvider, lang, adOrgID, responsibleID, Status, offerFrom, offerTo, orderFrom, orderTo, startFrom, startTo, invoiceFrom, invoiceTo, salesReps, bPartners, 0, 0);
  }

  public static ReportProjectProfitabilityData[] select(ConnectionProvider connectionProvider, String lang, String adOrgID, String responsibleID, String Status, String offerFrom, String offerTo, String orderFrom, String orderTo, String startFrom, String startTo, String invoiceFrom, String invoiceTo, String salesReps, String bPartners, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       select '' as name,'' as id," +
      "       '' as header1," +
      "		zssi_getElementTextByColumname('pcr_pno',?) as headerpron," +
      "		zssi_getElementTextByColumname('pcr_pname',?) as headerpro," +
      "		zssi_getElementTextByColumname('Responsible_id',?) as headerresp," +
      "		zssi_getElementTextByColumname('salesrep_id',?) as headersalesrep," +
      "		zssi_getElementTextByColumname('c_bpartner_id',?) as headerbpartner," +
      "		'%' as headermargep," +
      "		zssi_getElementTextByColumname('pcr_margin',?) as headermarge," +
      "		zssi_getElementTextByColumname('Cost',?) as headerist," +
      "		zssi_getElementTextByColumname('pcr_Plancost',?) as headerplan," +
      "		zssi_getElementTextByColumname('pcr_offer',?) as headerange," +
      "		zssi_getElementTextByColumname('pcr_order',?) as headerauftr," +
      "		zssi_getElementTextByColumname('pcr_invoice',?) as headerrechn," +
      "		zssi_getElementTextByColumname('Status',?) as headerstatus," +
      "		zssi_getElementTextByColumname('pcr_StartDate',?) as headerstartdate," +
      "		zssi_getElementTextByColumname('pcr_DateFinish',?) as headerenddate," +
      "		p_searchkey ,        p_name , p_responsible , p_bpartner , p_salesrep  , p_status ,     p_startdate     ,    p_datefinish     ," +
      "		p_invoicedocno , p_invoicenetamt ,      p_invoicedate        ," +
      "		p_orderdocno , p_ordernetamt ,  p_orderdate  ," +
      "		p_offerdocno ,p_offernetamt ,     p_offerdate     ," +
      "		p_plannedamt      ,   p_actualcost   , p_marginamt ,p_marginperc,p_org_id,p_isitalic" +
      "		from zssi_getProjectProfReportData(?,?,?,?,?,?,?,?,?,?,?,?)" +
      "		where 1=1";
    strSql = strSql + ((salesReps==null || salesReps.equals(""))?"":" AND p_salesrepid IN" + salesReps);
    strSql = strSql + ((bPartners==null || bPartners.equals(""))?"":" AND p_bpartnerid IN" + bPartners);
    strSql = strSql + 
      "		order by p_searchkey,p_marginperc";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, responsibleID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, offerFrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, offerTo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderFrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, orderTo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, startFrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, startTo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceFrom);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, invoiceTo);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lang);
      if (salesReps != null && !(salesReps.equals(""))) {
        }
      if (bPartners != null && !(bPartners.equals(""))) {
        }

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
        ReportProjectProfitabilityData objectReportProjectProfitabilityData = new ReportProjectProfitabilityData();
        objectReportProjectProfitabilityData.name = UtilSql.getValue(result, "name");
        objectReportProjectProfitabilityData.id = UtilSql.getValue(result, "id");
        objectReportProjectProfitabilityData.header1 = UtilSql.getValue(result, "header1");
        objectReportProjectProfitabilityData.headerpron = UtilSql.getValue(result, "headerpron");
        objectReportProjectProfitabilityData.headerpro = UtilSql.getValue(result, "headerpro");
        objectReportProjectProfitabilityData.headerresp = UtilSql.getValue(result, "headerresp");
        objectReportProjectProfitabilityData.headersalesrep = UtilSql.getValue(result, "headersalesrep");
        objectReportProjectProfitabilityData.headerbpartner = UtilSql.getValue(result, "headerbpartner");
        objectReportProjectProfitabilityData.headermargep = UtilSql.getValue(result, "headermargep");
        objectReportProjectProfitabilityData.headermarge = UtilSql.getValue(result, "headermarge");
        objectReportProjectProfitabilityData.headerist = UtilSql.getValue(result, "headerist");
        objectReportProjectProfitabilityData.headerplan = UtilSql.getValue(result, "headerplan");
        objectReportProjectProfitabilityData.headerange = UtilSql.getValue(result, "headerange");
        objectReportProjectProfitabilityData.headerauftr = UtilSql.getValue(result, "headerauftr");
        objectReportProjectProfitabilityData.headerrechn = UtilSql.getValue(result, "headerrechn");
        objectReportProjectProfitabilityData.headerstatus = UtilSql.getValue(result, "headerstatus");
        objectReportProjectProfitabilityData.headerstartdate = UtilSql.getValue(result, "headerstartdate");
        objectReportProjectProfitabilityData.headerenddate = UtilSql.getValue(result, "headerenddate");
        objectReportProjectProfitabilityData.pSearchkey = UtilSql.getValue(result, "p_searchkey");
        objectReportProjectProfitabilityData.pName = UtilSql.getValue(result, "p_name");
        objectReportProjectProfitabilityData.pResponsible = UtilSql.getValue(result, "p_responsible");
        objectReportProjectProfitabilityData.pBpartner = UtilSql.getValue(result, "p_bpartner");
        objectReportProjectProfitabilityData.pSalesrep = UtilSql.getValue(result, "p_salesrep");
        objectReportProjectProfitabilityData.pStatus = UtilSql.getValue(result, "p_status");
        objectReportProjectProfitabilityData.pStartdate = UtilSql.getValue(result, "p_startdate");
        objectReportProjectProfitabilityData.pDatefinish = UtilSql.getValue(result, "p_datefinish");
        objectReportProjectProfitabilityData.pInvoicedocno = UtilSql.getValue(result, "p_invoicedocno");
        objectReportProjectProfitabilityData.pInvoicenetamt = UtilSql.getValue(result, "p_invoicenetamt");
        objectReportProjectProfitabilityData.pInvoicedate = UtilSql.getValue(result, "p_invoicedate");
        objectReportProjectProfitabilityData.pOrderdocno = UtilSql.getValue(result, "p_orderdocno");
        objectReportProjectProfitabilityData.pOrdernetamt = UtilSql.getValue(result, "p_ordernetamt");
        objectReportProjectProfitabilityData.pOrderdate = UtilSql.getValue(result, "p_orderdate");
        objectReportProjectProfitabilityData.pOfferdocno = UtilSql.getValue(result, "p_offerdocno");
        objectReportProjectProfitabilityData.pOffernetamt = UtilSql.getValue(result, "p_offernetamt");
        objectReportProjectProfitabilityData.pOfferdate = UtilSql.getValue(result, "p_offerdate");
        objectReportProjectProfitabilityData.pPlannedamt = UtilSql.getValue(result, "p_plannedamt");
        objectReportProjectProfitabilityData.pActualcost = UtilSql.getValue(result, "p_actualcost");
        objectReportProjectProfitabilityData.pMarginamt = UtilSql.getValue(result, "p_marginamt");
        objectReportProjectProfitabilityData.pMarginperc = UtilSql.getValue(result, "p_marginperc");
        objectReportProjectProfitabilityData.pOrgId = UtilSql.getValue(result, "p_org_id");
        objectReportProjectProfitabilityData.pIsitalic = UtilSql.getValue(result, "p_isitalic");
        objectReportProjectProfitabilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportProjectProfitabilityData);
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
    ReportProjectProfitabilityData objectReportProjectProfitabilityData[] = new ReportProjectProfitabilityData[vector.size()];
    vector.copyInto(objectReportProjectProfitabilityData);
    return(objectReportProjectProfitabilityData);
  }

  public static String isUserSupervisor(ConnectionProvider connectionProvider, String userId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "select isprojectmanager from c_bpartner where c_bpartner_id=(select c_bpartner_id from ad_user where ad_user_id=?) ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, userId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "isprojectmanager");
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

  public static ReportProjectProfitabilityData[] getSelectedSalesreps(ConnectionProvider connectionProvider, String userIdList)    throws ServletException {
    return getSelectedSalesreps(connectionProvider, userIdList, 0, 0);
  }

  public static ReportProjectProfitabilityData[] getSelectedSalesreps(ConnectionProvider connectionProvider, String userIdList, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "select name,ad_user_id as ID from ad_user where ad_user_id in ";
    strSql = strSql + ((userIdList==null || userIdList.equals(""))?"":userIdList);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (userIdList != null && !(userIdList.equals(""))) {
        }

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
        ReportProjectProfitabilityData objectReportProjectProfitabilityData = new ReportProjectProfitabilityData();
        objectReportProjectProfitabilityData.name = UtilSql.getValue(result, "name");
        objectReportProjectProfitabilityData.id = UtilSql.getValue(result, "id");
        objectReportProjectProfitabilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportProjectProfitabilityData);
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
    ReportProjectProfitabilityData objectReportProjectProfitabilityData[] = new ReportProjectProfitabilityData[vector.size()];
    vector.copyInto(objectReportProjectProfitabilityData);
    return(objectReportProjectProfitabilityData);
  }

  public static ReportProjectProfitabilityData[] getSelectedBpartner(ConnectionProvider connectionProvider, String bpartnerIdList)    throws ServletException {
    return getSelectedBpartner(connectionProvider, bpartnerIdList, 0, 0);
  }

  public static ReportProjectProfitabilityData[] getSelectedBpartner(ConnectionProvider connectionProvider, String bpartnerIdList, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "select name,c_bpartner_id as ID from c_bpartner where c_bpartner_id in ";
    strSql = strSql + ((bpartnerIdList==null || bpartnerIdList.equals(""))?"":bpartnerIdList);

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);
      if (bpartnerIdList != null && !(bpartnerIdList.equals(""))) {
        }

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
        ReportProjectProfitabilityData objectReportProjectProfitabilityData = new ReportProjectProfitabilityData();
        objectReportProjectProfitabilityData.name = UtilSql.getValue(result, "name");
        objectReportProjectProfitabilityData.id = UtilSql.getValue(result, "id");
        objectReportProjectProfitabilityData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectReportProjectProfitabilityData);
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
    ReportProjectProfitabilityData objectReportProjectProfitabilityData[] = new ReportProjectProfitabilityData[vector.size()];
    vector.copyInto(objectReportProjectProfitabilityData);
    return(objectReportProjectProfitabilityData);
  }

  public static String getSelectedOrg(ConnectionProvider connectionProvider, String adOrgID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "select name from ad_org where ad_org_id=? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgID);

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

  public static ReportProjectProfitabilityData[] set()    throws ServletException {
    ReportProjectProfitabilityData objectReportProjectProfitabilityData[] = new ReportProjectProfitabilityData[1];
    objectReportProjectProfitabilityData[0] = new ReportProjectProfitabilityData();
    objectReportProjectProfitabilityData[0].name = "";
    return objectReportProjectProfitabilityData;
  }
}
