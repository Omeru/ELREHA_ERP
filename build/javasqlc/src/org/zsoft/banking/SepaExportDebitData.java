//Sqlc generated V1.O00-1
package org.zsoft.banking;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

class SepaExportDebitData implements FieldProvider {
static Logger log4j = Logger.getLogger(SepaExportDebitData.class);
  private String InitRecordNumber="0";
  public String zsfiSepaDebitDataId;
  public String adClientId;
  public String adOrgId;
  public String createdby;
  public String updatedby;
  public String cBankaccountId;
  public String grphdrMsgid;
  public String grphdrCredttm;
  public String grphdrInitgptyNm;
  public String pmtinfPmtinfid;
  public String pmtinfReqdcolltndt;
  public String pmtinfCdtracctIban;
  public String pmtinfCdtragtBic;
  public String pmtinfCdtrschmeidId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("zsfi_sepa_debit_data_id") || fieldName.equals("zsfiSepaDebitDataId"))
      return zsfiSepaDebitDataId;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("createdby"))
      return createdby;
    else if (fieldName.equalsIgnoreCase("updatedby"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("c_bankaccount_id") || fieldName.equals("cBankaccountId"))
      return cBankaccountId;
    else if (fieldName.equalsIgnoreCase("grphdr_msgid") || fieldName.equals("grphdrMsgid"))
      return grphdrMsgid;
    else if (fieldName.equalsIgnoreCase("grphdr_credttm") || fieldName.equals("grphdrCredttm"))
      return grphdrCredttm;
    else if (fieldName.equalsIgnoreCase("grphdr_initgpty_nm") || fieldName.equals("grphdrInitgptyNm"))
      return grphdrInitgptyNm;
    else if (fieldName.equalsIgnoreCase("pmtinf_pmtinfid") || fieldName.equals("pmtinfPmtinfid"))
      return pmtinfPmtinfid;
    else if (fieldName.equalsIgnoreCase("pmtinf_reqdcolltndt") || fieldName.equals("pmtinfReqdcolltndt"))
      return pmtinfReqdcolltndt;
    else if (fieldName.equalsIgnoreCase("pmtinf_cdtracct_iban") || fieldName.equals("pmtinfCdtracctIban"))
      return pmtinfCdtracctIban;
    else if (fieldName.equalsIgnoreCase("pmtinf_cdtragt_bic") || fieldName.equals("pmtinfCdtragtBic"))
      return pmtinfCdtragtBic;
    else if (fieldName.equalsIgnoreCase("pmtinf_cdtrschmeid_id") || fieldName.equals("pmtinfCdtrschmeidId"))
      return pmtinfCdtrschmeidId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static SepaExportDebitData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static SepaExportDebitData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "          SELECT " +
      "           '' AS zsfi_sepa_debit_data_id," +
      "           '' AS ad_client_id," +
      "           '' AS ad_org_id," +
      "           '' AS createdBy," +
      "           '' AS updatedBy," +
      "           '' AS c_bankaccount_id," +
      "           '' AS grphdr_msgid," +
      "           '' AS grphdr_credttm," +
      "           '' AS grphdr_initgpty_nm," +
      "           '' AS pmtinf_pmtinfid," +
      "           '' AS pmtinf_reqdcolltndt," +
      "           '' AS pmtinf_cdtracct_iban," +
      "           '' AS pmtinf_cdtragt_bic," +
      "           '' AS pmtinf_cdtrschmeid_id" +
      "          FROM dual;	      ";

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
        SepaExportDebitData objectSepaExportDebitData = new SepaExportDebitData();
        objectSepaExportDebitData.zsfiSepaDebitDataId = UtilSql.getValue(result, "zsfi_sepa_debit_data_id");
        objectSepaExportDebitData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectSepaExportDebitData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectSepaExportDebitData.createdby = UtilSql.getValue(result, "createdby");
        objectSepaExportDebitData.updatedby = UtilSql.getValue(result, "updatedby");
        objectSepaExportDebitData.cBankaccountId = UtilSql.getValue(result, "c_bankaccount_id");
        objectSepaExportDebitData.grphdrMsgid = UtilSql.getValue(result, "grphdr_msgid");
        objectSepaExportDebitData.grphdrCredttm = UtilSql.getValue(result, "grphdr_credttm");
        objectSepaExportDebitData.grphdrInitgptyNm = UtilSql.getValue(result, "grphdr_initgpty_nm");
        objectSepaExportDebitData.pmtinfPmtinfid = UtilSql.getValue(result, "pmtinf_pmtinfid");
        objectSepaExportDebitData.pmtinfReqdcolltndt = UtilSql.getValue(result, "pmtinf_reqdcolltndt");
        objectSepaExportDebitData.pmtinfCdtracctIban = UtilSql.getValue(result, "pmtinf_cdtracct_iban");
        objectSepaExportDebitData.pmtinfCdtragtBic = UtilSql.getValue(result, "pmtinf_cdtragt_bic");
        objectSepaExportDebitData.pmtinfCdtrschmeidId = UtilSql.getValue(result, "pmtinf_cdtrschmeid_id");
        objectSepaExportDebitData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectSepaExportDebitData);
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
    SepaExportDebitData objectSepaExportDebitData[] = new SepaExportDebitData[vector.size()];
    vector.copyInto(objectSepaExportDebitData);
    return(objectSepaExportDebitData);
  }

/**
Insert header for sepa-collection pain.008
 */
  public static int insertHeader(ConnectionProvider connectionProvider, String sepaDebitDataId, String adClientId, String adOrgId, String adUserId, String bankStatementId, String grphdrMsgId, String pmtinfPmtInfId, String pmtInfReqdColltnDt)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO zsfi_sepa_debit_data (" +
      "           zsfi_sepa_debit_data_id" +
      "         , ad_client_id" +
      "         , ad_org_id" +
      "         , createdby" +
      "         , updatedby" +
      "         , c_bankaccount_id" +
      "         , grphdr_MsgId" +
      "         , pmtinf_PmtInfId" +
      "         , pmtInf_ReqdColltnDt" +
      "        ) VALUES (?,?,?,?,?,(select c_bankaccount_id from c_bankstatement WHERE c_bankstatement_id = ?),?,?,to_date(?))";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepaDebitDataId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bankStatementId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, grphdrMsgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pmtinfPmtInfId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, pmtInfReqdColltnDt);

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

/**
Insert data lines for sepa-debit pain.008.003.02
 */
  public static int insertLines(ConnectionProvider connectionProvider, String sepaDataExportId, String createdby, String updatedby, String adUserId, String cBankstatementId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO zsfi_sepa_debit_dataline(" +
      "           zsfi_sepa_debit_data_id, ad_client_id, ad_org_id, createdby, updatedby" +
      "         , c_bp_bankaccount_id" +
      "         , drctdbttx_instdamt, seqtp, lclinstrm " +
      "         , drctdbttx_rmtinf_ustrd)            " +
      "         SELECT " +
      "           ?, ?, ?, ?, ?" +
      "         , zssi_getPartnerBankaccountFromDebtPayment(bsl.c_debt_payment_id, true)" +
      "         , abs(bsl.trxamt), 'RCUR', 'CORE'  " +
      "         , SUBSTR(COALESCE(memo,'-'),1,140)" +
      "         FROM c_bankstatementline bsl WHERE isactive='Y' AND sepaexportenabled='Y' AND voidline='N' AND c_bankstatement_id=?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepaDataExportId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBankstatementId);

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

  public static String doProcessing(Connection conn, ConnectionProvider connectionProvider, String sepaDataExportId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT zsfi_sepa_export_debit(?) AS plresult FROM dual;";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sepaDataExportId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "plresult");
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

  public static String attachFile(Connection conn, ConnectionProvider connectionProvider, String BankstatementId, String UserId, String ClientId, String OrgId, String Filename, String Text)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT zsse_addattachmentfile('392',?,?,?,?,?,?) as plresult from dual;";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, BankstatementId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, ClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, OrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Filename);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Text);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "plresult");
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

/**
set c_bankstatement.sepacollectioniscreated = Y
 */
  public static String cSettlementSepaCollect(ConnectionProvider connectionProvider, String BankstatementId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      select c_settlement_sepa_collect(?);";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, BankstatementId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_settlement_sepa_collect");
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
