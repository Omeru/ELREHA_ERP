//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_process;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

class BPartnerFastEntryProcessData implements FieldProvider {
static Logger log4j = Logger.getLogger(BPartnerFastEntryProcessData.class);
  private String InitRecordNumber="0";
  public String adOrgId;
  public String value;
  public String name;
  public String cBpGroupId;
  public String url;
  public String salesrepId;
  public String address1;
  public String address2;
  public String city;
  public String postal;
  public String cCountryId;
  public String uidnumber;
  public String cTaxId;
  public String pLocationId2;
  public String pAddress12;
  public String pAddress22;
  public String pCity2;
  public String pPostal2;
  public String pCountryId2;
  public String firstname;
  public String lastname;
  public String title;
  public String cGreetingId;
  public String email;
  public String phone;
  public String phone2;
  public String bankName;
  public String iban;
  public String swiftcode;
  public String iscustomer;
  public String isvendor;
  public String isemployee;
  public String paymentrule;
  public String cPaymenttermId;
  public String dummy;
  public String cBpartnerId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("c_bp_group_id") || fieldName.equals("cBpGroupId"))
      return cBpGroupId;
    else if (fieldName.equalsIgnoreCase("url"))
      return url;
    else if (fieldName.equalsIgnoreCase("salesrep_id") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("address1"))
      return address1;
    else if (fieldName.equalsIgnoreCase("address2"))
      return address2;
    else if (fieldName.equalsIgnoreCase("city"))
      return city;
    else if (fieldName.equalsIgnoreCase("postal"))
      return postal;
    else if (fieldName.equalsIgnoreCase("c_country_id") || fieldName.equals("cCountryId"))
      return cCountryId;
    else if (fieldName.equalsIgnoreCase("uidnumber"))
      return uidnumber;
    else if (fieldName.equalsIgnoreCase("c_tax_id") || fieldName.equals("cTaxId"))
      return cTaxId;
    else if (fieldName.equalsIgnoreCase("p_location_id2") || fieldName.equals("pLocationId2"))
      return pLocationId2;
    else if (fieldName.equalsIgnoreCase("p_address12") || fieldName.equals("pAddress12"))
      return pAddress12;
    else if (fieldName.equalsIgnoreCase("p_address22") || fieldName.equals("pAddress22"))
      return pAddress22;
    else if (fieldName.equalsIgnoreCase("p_city2") || fieldName.equals("pCity2"))
      return pCity2;
    else if (fieldName.equalsIgnoreCase("p_postal2") || fieldName.equals("pPostal2"))
      return pPostal2;
    else if (fieldName.equalsIgnoreCase("p_country_id2") || fieldName.equals("pCountryId2"))
      return pCountryId2;
    else if (fieldName.equalsIgnoreCase("firstname"))
      return firstname;
    else if (fieldName.equalsIgnoreCase("lastname"))
      return lastname;
    else if (fieldName.equalsIgnoreCase("title"))
      return title;
    else if (fieldName.equalsIgnoreCase("c_greeting_id") || fieldName.equals("cGreetingId"))
      return cGreetingId;
    else if (fieldName.equalsIgnoreCase("email"))
      return email;
    else if (fieldName.equalsIgnoreCase("phone"))
      return phone;
    else if (fieldName.equalsIgnoreCase("phone2"))
      return phone2;
    else if (fieldName.equalsIgnoreCase("bank_name") || fieldName.equals("bankName"))
      return bankName;
    else if (fieldName.equalsIgnoreCase("iban"))
      return iban;
    else if (fieldName.equalsIgnoreCase("swiftcode"))
      return swiftcode;
    else if (fieldName.equalsIgnoreCase("iscustomer"))
      return iscustomer;
    else if (fieldName.equalsIgnoreCase("isvendor"))
      return isvendor;
    else if (fieldName.equalsIgnoreCase("isemployee"))
      return isemployee;
    else if (fieldName.equalsIgnoreCase("paymentrule"))
      return paymentrule;
    else if (fieldName.equalsIgnoreCase("c_paymentterm_id") || fieldName.equals("cPaymenttermId"))
      return cPaymenttermId;
    else if (fieldName.equalsIgnoreCase("dummy"))
      return dummy;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static BPartnerFastEntryProcessData[] select(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    return select(connectionProvider, cBpartnerId, 0, 0);
  }

  public static BPartnerFastEntryProcessData[] select(ConnectionProvider connectionProvider, String cBpartnerId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       select p_org_id as ad_org_id, p_value as value, p_name as name, p_bp_group_id as c_bp_group_id, p_url as url, p_salesrep_id  as salesrep_id," +
      "              p_ADDRESS1 as ADDRESS1,p_ADDRESS2 as ADDRESS2,p_CITY as city, p_POSTAL as postal ,P_COUNTRY_ID as C_COUNTRY_ID, p_uidnumber as uidnumber,P_TAX_ID as c_tax_id," +
      "              p_LOCATION_ID2,p_ADDRESS12 ,p_ADDRESS22, p_CITY2 ,p_POSTAL2,P_COUNTRY_ID2," +
      "              p_FIRSTNAME as FIRSTNAME,p_LASTNAME  as LASTNAME, p_TITLE as title, p_GREETING_ID as c_GREETING_ID,p_EMAIL as email,p_PHONE as phone, p_PHONE2 as phone2," +
      "              p_BANK_NAME as bank_name,p_IBAN as iban, p_SWIFTCODE as SWIFTCODE ,p_iscustomer as iscustomer," +
      "              p_isvendor as isvendor,p_isemployee as isemployee, p_paymentrule as paymentrule, p_payterm  as c_paymentterm_id," +
      "              '' as dummy,'' as c_bpartner_id" +
      "       from c_Bpartner_getFastEntryData(?)";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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
        BPartnerFastEntryProcessData objectBPartnerFastEntryProcessData = new BPartnerFastEntryProcessData();
        objectBPartnerFastEntryProcessData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectBPartnerFastEntryProcessData.value = UtilSql.getValue(result, "value");
        objectBPartnerFastEntryProcessData.name = UtilSql.getValue(result, "name");
        objectBPartnerFastEntryProcessData.cBpGroupId = UtilSql.getValue(result, "c_bp_group_id");
        objectBPartnerFastEntryProcessData.url = UtilSql.getValue(result, "url");
        objectBPartnerFastEntryProcessData.salesrepId = UtilSql.getValue(result, "salesrep_id");
        objectBPartnerFastEntryProcessData.address1 = UtilSql.getValue(result, "address1");
        objectBPartnerFastEntryProcessData.address2 = UtilSql.getValue(result, "address2");
        objectBPartnerFastEntryProcessData.city = UtilSql.getValue(result, "city");
        objectBPartnerFastEntryProcessData.postal = UtilSql.getValue(result, "postal");
        objectBPartnerFastEntryProcessData.cCountryId = UtilSql.getValue(result, "c_country_id");
        objectBPartnerFastEntryProcessData.uidnumber = UtilSql.getValue(result, "uidnumber");
        objectBPartnerFastEntryProcessData.cTaxId = UtilSql.getValue(result, "c_tax_id");
        objectBPartnerFastEntryProcessData.pLocationId2 = UtilSql.getValue(result, "p_location_id2");
        objectBPartnerFastEntryProcessData.pAddress12 = UtilSql.getValue(result, "p_address12");
        objectBPartnerFastEntryProcessData.pAddress22 = UtilSql.getValue(result, "p_address22");
        objectBPartnerFastEntryProcessData.pCity2 = UtilSql.getValue(result, "p_city2");
        objectBPartnerFastEntryProcessData.pPostal2 = UtilSql.getValue(result, "p_postal2");
        objectBPartnerFastEntryProcessData.pCountryId2 = UtilSql.getValue(result, "p_country_id2");
        objectBPartnerFastEntryProcessData.firstname = UtilSql.getValue(result, "firstname");
        objectBPartnerFastEntryProcessData.lastname = UtilSql.getValue(result, "lastname");
        objectBPartnerFastEntryProcessData.title = UtilSql.getValue(result, "title");
        objectBPartnerFastEntryProcessData.cGreetingId = UtilSql.getValue(result, "c_greeting_id");
        objectBPartnerFastEntryProcessData.email = UtilSql.getValue(result, "email");
        objectBPartnerFastEntryProcessData.phone = UtilSql.getValue(result, "phone");
        objectBPartnerFastEntryProcessData.phone2 = UtilSql.getValue(result, "phone2");
        objectBPartnerFastEntryProcessData.bankName = UtilSql.getValue(result, "bank_name");
        objectBPartnerFastEntryProcessData.iban = UtilSql.getValue(result, "iban");
        objectBPartnerFastEntryProcessData.swiftcode = UtilSql.getValue(result, "swiftcode");
        objectBPartnerFastEntryProcessData.iscustomer = UtilSql.getValue(result, "iscustomer");
        objectBPartnerFastEntryProcessData.isvendor = UtilSql.getValue(result, "isvendor");
        objectBPartnerFastEntryProcessData.isemployee = UtilSql.getValue(result, "isemployee");
        objectBPartnerFastEntryProcessData.paymentrule = UtilSql.getValue(result, "paymentrule");
        objectBPartnerFastEntryProcessData.cPaymenttermId = UtilSql.getValue(result, "c_paymentterm_id");
        objectBPartnerFastEntryProcessData.dummy = UtilSql.getValue(result, "dummy");
        objectBPartnerFastEntryProcessData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectBPartnerFastEntryProcessData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBPartnerFastEntryProcessData);
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
    BPartnerFastEntryProcessData objectBPartnerFastEntryProcessData[] = new BPartnerFastEntryProcessData[vector.size()];
    vector.copyInto(objectBPartnerFastEntryProcessData);
    return(objectBPartnerFastEntryProcessData);
  }

  public static String selectUpdate(ConnectionProvider connectionProvider, String cBpartnerId, String adUserId, String p_value, String p_name, String p_bp_group_id, String p_url, String p_salesrep_id, String p_ADDRESS1, String p_ADDRESS2, String p_CITY, String p_POSTAL, String P_COUNTRY_ID, String p_uidnumber, String p_TAX_ID, String p_ADDRESS12, String p_ADDRESS22, String p_CITY2, String p_POSTAL2, String P_COUNTRY_ID2, String p_FIRSTNAME, String p_LASTNAME, String p_TITLE, String p_GREETING_ID, String p_EMAIL, String p_PHONE, String p_PHONE2, String p_iscustomer, String p_isvendor, String p_isemployee, String p_paymentrule, String p_payterm)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT c_Bpartner_updateFastEntryData(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) as dummy from dual";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_value);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_bp_group_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_url);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_salesrep_id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_ADDRESS1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_ADDRESS2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_CITY);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_POSTAL);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_COUNTRY_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_uidnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_TAX_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_ADDRESS12);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_ADDRESS22);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_CITY2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_POSTAL2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, P_COUNTRY_ID2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_FIRSTNAME);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_LASTNAME);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_TITLE);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_GREETING_ID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_EMAIL);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_PHONE);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_PHONE2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_iscustomer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_isvendor);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_isemployee);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_paymentrule);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_payterm);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "dummy");
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

  public static String selectUpdateBank(ConnectionProvider connectionProvider, String cBpartnerId, String adUserId, String p_BANK_NAME, String p_IBAN, String p_SWIFTCODE)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT c_Bpartner_updateFastEntryDataBank(?,?,?,?,?) as dummy from dual";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_BANK_NAME);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_IBAN);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, p_SWIFTCODE);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "dummy");
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

  public static String selectPartnerIDfromValue(ConnectionProvider connectionProvider, String value)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT c_bpartner_id from c_bpartner where value= ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, value);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "c_bpartner_id");
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

  public static String selectEmployeefromBP(ConnectionProvider connectionProvider, String bpartnerID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT isemployee from c_bpartner where c_bpartner_id= ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bpartnerID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "isemployee");
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

  public static BPartnerFastEntryProcessData[] set()    throws ServletException {
    BPartnerFastEntryProcessData objectBPartnerFastEntryProcessData[] = new BPartnerFastEntryProcessData[1];
    objectBPartnerFastEntryProcessData[0] = new BPartnerFastEntryProcessData();
    objectBPartnerFastEntryProcessData[0].isemployee = "";
    return objectBPartnerFastEntryProcessData;
  }
}
