//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.org.openz.modules.multilevelmarketing.EmployeeMLM;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

/**
WAD Generated class
 */
class BankAccountDF0A6D5276F0416CBB8FA011072C838DData implements FieldProvider {
static Logger log4j = Logger.getLogger(BankAccountDF0A6D5276F0416CBB8FA011072C838DData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String aCountry;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String adUserId;
  public String adUserIdr;
  public String isactive;
  public String bankaccounttype;
  public String bankaccounttyper;
  public String routingno;
  public String accountno;
  public String showaccountno;
  public String aZip;
  public String iban;
  public String showiban;
  public String swiftcode;
  public String cCountryId;
  public String cCountryIdr;
  public String displayedaccount;
  public String bankName;
  public String creditcardtype;
  public String creditcardtyper;
  public String creditcardnumber;
  public String creditcardexpmm;
  public String creditcardexpyy;
  public String aName;
  public String text1;
  public String cBpBankaccountId;
  public String adOrgId;
  public String aStreet;
  public String aEmail;
  public String aIdentSsn;
  public String rAvszip;
  public String aIdentDl;
  public String aCity;
  public String aState;
  public String adClientId;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("created"))
      return created;
    else if (fieldName.equalsIgnoreCase("createdbyr"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("updated"))
      return updated;
    else if (fieldName.equalsIgnoreCase("updated_time_stamp") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("updatedby"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("updatedbyr"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("a_country") || fieldName.equals("aCountry"))
      return aCountry;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("ad_user_idr") || fieldName.equals("adUserIdr"))
      return adUserIdr;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("bankaccounttype"))
      return bankaccounttype;
    else if (fieldName.equalsIgnoreCase("bankaccounttyper"))
      return bankaccounttyper;
    else if (fieldName.equalsIgnoreCase("routingno"))
      return routingno;
    else if (fieldName.equalsIgnoreCase("accountno"))
      return accountno;
    else if (fieldName.equalsIgnoreCase("showaccountno"))
      return showaccountno;
    else if (fieldName.equalsIgnoreCase("a_zip") || fieldName.equals("aZip"))
      return aZip;
    else if (fieldName.equalsIgnoreCase("iban"))
      return iban;
    else if (fieldName.equalsIgnoreCase("showiban"))
      return showiban;
    else if (fieldName.equalsIgnoreCase("swiftcode"))
      return swiftcode;
    else if (fieldName.equalsIgnoreCase("c_country_id") || fieldName.equals("cCountryId"))
      return cCountryId;
    else if (fieldName.equalsIgnoreCase("c_country_idr") || fieldName.equals("cCountryIdr"))
      return cCountryIdr;
    else if (fieldName.equalsIgnoreCase("displayedaccount"))
      return displayedaccount;
    else if (fieldName.equalsIgnoreCase("bank_name") || fieldName.equals("bankName"))
      return bankName;
    else if (fieldName.equalsIgnoreCase("creditcardtype"))
      return creditcardtype;
    else if (fieldName.equalsIgnoreCase("creditcardtyper"))
      return creditcardtyper;
    else if (fieldName.equalsIgnoreCase("creditcardnumber"))
      return creditcardnumber;
    else if (fieldName.equalsIgnoreCase("creditcardexpmm"))
      return creditcardexpmm;
    else if (fieldName.equalsIgnoreCase("creditcardexpyy"))
      return creditcardexpyy;
    else if (fieldName.equalsIgnoreCase("a_name") || fieldName.equals("aName"))
      return aName;
    else if (fieldName.equalsIgnoreCase("text1"))
      return text1;
    else if (fieldName.equalsIgnoreCase("c_bp_bankaccount_id") || fieldName.equals("cBpBankaccountId"))
      return cBpBankaccountId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("a_street") || fieldName.equals("aStreet"))
      return aStreet;
    else if (fieldName.equalsIgnoreCase("a_email") || fieldName.equals("aEmail"))
      return aEmail;
    else if (fieldName.equalsIgnoreCase("a_ident_ssn") || fieldName.equals("aIdentSsn"))
      return aIdentSsn;
    else if (fieldName.equalsIgnoreCase("r_avszip") || fieldName.equals("rAvszip"))
      return rAvszip;
    else if (fieldName.equalsIgnoreCase("a_ident_dl") || fieldName.equals("aIdentDl"))
      return aIdentDl;
    else if (fieldName.equalsIgnoreCase("a_city") || fieldName.equals("aCity"))
      return aCity;
    else if (fieldName.equalsIgnoreCase("a_state") || fieldName.equals("aState"))
      return aState;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("language"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static BankAccountDF0A6D5276F0416CBB8FA011072C838DData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static BankAccountDF0A6D5276F0416CBB8FA011072C838DData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(C_BP_BankAccount.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BP_BankAccount.CreatedBy) as CreatedByR, " +
      "        to_char(C_BP_BankAccount.Updated, ?) as updated, " +
      "        to_char(C_BP_BankAccount.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        C_BP_BankAccount.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = C_BP_BankAccount.UpdatedBy) as UpdatedByR," +
      "        C_BP_BankAccount.A_Country, " +
      "C_BP_BankAccount.C_BPartner_ID, " +
      "(CASE WHEN C_BP_BankAccount.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "C_BP_BankAccount.AD_User_ID, " +
      "(CASE WHEN C_BP_BankAccount.AD_User_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS AD_User_IDR, " +
      "COALESCE(C_BP_BankAccount.IsActive, 'N') AS IsActive, " +
      "C_BP_BankAccount.BankAccountType, " +
      "(CASE WHEN C_BP_BankAccount.BankAccountType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS BankAccountTypeR, " +
      "C_BP_BankAccount.RoutingNo, " +
      "C_BP_BankAccount.AccountNo, " +
      "COALESCE(C_BP_BankAccount.ShowAccountNo, 'N') AS ShowAccountNo, " +
      "C_BP_BankAccount.A_Zip, " +
      "C_BP_BankAccount.Iban, " +
      "COALESCE(C_BP_BankAccount.Showiban, 'N') AS Showiban, " +
      "C_BP_BankAccount.SwiftCode, " +
      "C_BP_BankAccount.C_Country_ID, " +
      "(CASE WHEN C_BP_BankAccount.C_Country_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL3.Name IS NULL THEN TO_CHAR(table3.Name) ELSE TO_CHAR(tableTRL3.Name) END)), ''))),'') ) END) AS C_Country_IDR, " +
      "C_BP_BankAccount.Displayedaccount, " +
      "C_BP_BankAccount.Bank_Name, " +
      "C_BP_BankAccount.CreditCardType, " +
      "(CASE WHEN C_BP_BankAccount.CreditCardType IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS CreditCardTypeR, " +
      "C_BP_BankAccount.CreditCardNumber, " +
      "C_BP_BankAccount.CreditCardExpMM, " +
      "C_BP_BankAccount.CreditCardExpYY, " +
      "C_BP_BankAccount.A_Name, " +
      "C_BP_BankAccount.Text1, " +
      "C_BP_BankAccount.C_BP_BankAccount_ID, " +
      "C_BP_BankAccount.AD_Org_ID, " +
      "C_BP_BankAccount.A_Street, " +
      "C_BP_BankAccount.A_EMail, " +
      "C_BP_BankAccount.A_Ident_SSN, " +
      "C_BP_BankAccount.R_AvsZip, " +
      "C_BP_BankAccount.A_Ident_DL, " +
      "C_BP_BankAccount.A_City, " +
      "C_BP_BankAccount.A_State, " +
      "C_BP_BankAccount.AD_Client_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM C_BP_BankAccount left join (select C_BPartner_ID, Name from C_BPartner) table1 on (C_BP_BankAccount.C_BPartner_ID = table1.C_BPartner_ID) left join (select AD_User_ID, Name from AD_User) table2 on (C_BP_BankAccount.AD_User_ID = table2.AD_User_ID) left join ad_ref_list_v list1 on (C_BP_BankAccount.BankAccountType = list1.value and list1.ad_reference_id = '216' and list1.ad_language = ?)  left join (select C_Country_ID, Name from C_Country) table3 on (C_BP_BankAccount.C_Country_ID = table3.C_Country_ID) left join (select C_Country_ID,AD_Language, Name from C_Country_TRL) tableTRL3 on (table3.C_Country_ID = tableTRL3.C_Country_ID and tableTRL3.AD_Language = ?)  left join ad_ref_list_v list2 on (C_BP_BankAccount.CreditCardType = list2.value and list2.ad_reference_id = '149' and list2.ad_language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND C_BP_BankAccount.C_BPartner_ID = ?  ");
    strSql = strSql + 
      "        AND C_BP_BankAccount.C_BP_BankAccount_ID = ? " +
      "        AND C_BP_BankAccount.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND C_BP_BankAccount.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (cBpartnerId != null && !(cBpartnerId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
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
        BankAccountDF0A6D5276F0416CBB8FA011072C838DData objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData = new BankAccountDF0A6D5276F0416CBB8FA011072C838DData();
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.created = UtilSql.getValue(result, "created");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.updated = UtilSql.getValue(result, "updated");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.updatedby = UtilSql.getValue(result, "updatedby");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.aCountry = UtilSql.getValue(result, "a_country");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.adUserIdr = UtilSql.getValue(result, "ad_user_idr");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.isactive = UtilSql.getValue(result, "isactive");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.bankaccounttype = UtilSql.getValue(result, "bankaccounttype");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.bankaccounttyper = UtilSql.getValue(result, "bankaccounttyper");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.routingno = UtilSql.getValue(result, "routingno");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.accountno = UtilSql.getValue(result, "accountno");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.showaccountno = UtilSql.getValue(result, "showaccountno");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.aZip = UtilSql.getValue(result, "a_zip");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.iban = UtilSql.getValue(result, "iban");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.showiban = UtilSql.getValue(result, "showiban");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.swiftcode = UtilSql.getValue(result, "swiftcode");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.cCountryId = UtilSql.getValue(result, "c_country_id");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.cCountryIdr = UtilSql.getValue(result, "c_country_idr");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.displayedaccount = UtilSql.getValue(result, "displayedaccount");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.bankName = UtilSql.getValue(result, "bank_name");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.creditcardtype = UtilSql.getValue(result, "creditcardtype");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.creditcardtyper = UtilSql.getValue(result, "creditcardtyper");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.creditcardnumber = UtilSql.getValue(result, "creditcardnumber");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.creditcardexpmm = UtilSql.getValue(result, "creditcardexpmm");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.creditcardexpyy = UtilSql.getValue(result, "creditcardexpyy");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.aName = UtilSql.getValue(result, "a_name");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.text1 = UtilSql.getValue(result, "text1");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.cBpBankaccountId = UtilSql.getValue(result, "c_bp_bankaccount_id");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.aStreet = UtilSql.getValue(result, "a_street");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.aEmail = UtilSql.getValue(result, "a_email");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.aIdentSsn = UtilSql.getValue(result, "a_ident_ssn");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.rAvszip = UtilSql.getValue(result, "r_avszip");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.aIdentDl = UtilSql.getValue(result, "a_ident_dl");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.aCity = UtilSql.getValue(result, "a_city");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.aState = UtilSql.getValue(result, "a_state");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.language = UtilSql.getValue(result, "language");
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.adUserClient = "";
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.adOrgClient = "";
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.createdby = "";
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.trBgcolor = "";
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.totalCount = "";
        objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData);
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
    BankAccountDF0A6D5276F0416CBB8FA011072C838DData objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[] = new BankAccountDF0A6D5276F0416CBB8FA011072C838DData[vector.size()];
    vector.copyInto(objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData);
    return(objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData);
  }

/**
Create a registry
 */
  public static BankAccountDF0A6D5276F0416CBB8FA011072C838DData[] set(String cBpartnerId, String aStreet, String text1, String cCountryId, String displayedaccount, String aEmail, String creditcardexpmm, String showaccountno, String aCountry, String aZip, String creditcardnumber, String iban, String createdby, String createdbyr, String routingno, String bankaccounttype, String aCity, String adOrgId, String aName, String creditcardtype, String cBpartnerIdr, String created, String bankName, String adUserId, String swiftcode, String creditcardexpyy, String showiban, String accountno, String rAvszip, String adClientId, String aState, String aIdentDl, String aIdentSsn, String isactive, String updatedby, String updatedbyr, String cBpBankaccountId)    throws ServletException {
    BankAccountDF0A6D5276F0416CBB8FA011072C838DData objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[] = new BankAccountDF0A6D5276F0416CBB8FA011072C838DData[1];
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0] = new BankAccountDF0A6D5276F0416CBB8FA011072C838DData();
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].created = created;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].createdbyr = createdbyr;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].updated = "";
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].updatedTimeStamp = "";
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].updatedby = updatedby;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].updatedbyr = updatedbyr;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].aCountry = aCountry;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].cBpartnerId = cBpartnerId;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].cBpartnerIdr = cBpartnerIdr;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].adUserId = adUserId;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].adUserIdr = "";
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].isactive = isactive;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].bankaccounttype = bankaccounttype;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].bankaccounttyper = "";
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].routingno = routingno;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].accountno = accountno;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].showaccountno = showaccountno;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].aZip = aZip;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].iban = iban;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].showiban = showiban;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].swiftcode = swiftcode;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].cCountryId = cCountryId;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].cCountryIdr = "";
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].displayedaccount = displayedaccount;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].bankName = bankName;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].creditcardtype = creditcardtype;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].creditcardtyper = "";
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].creditcardnumber = creditcardnumber;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].creditcardexpmm = creditcardexpmm;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].creditcardexpyy = creditcardexpyy;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].aName = aName;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].text1 = text1;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].cBpBankaccountId = cBpBankaccountId;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].adOrgId = adOrgId;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].aStreet = aStreet;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].aEmail = aEmail;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].aIdentSsn = aIdentSsn;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].rAvszip = rAvszip;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].aIdentDl = aIdentDl;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].aCity = aCity;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].aState = aState;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].adClientId = adClientId;
    objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData[0].language = "";
    return objectBankAccountDF0A6D5276F0416CBB8FA011072C838DData;
  }

/**
Select for auxiliar field
 */
  public static String selectDef3100_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as CreatedBy FROM AD_User table1 WHERE table1.isActive='Y' AND table1.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "createdby");
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
Select for auxiliar field
 */
  public static String selectDef3102_1(ConnectionProvider connectionProvider, String C_BPartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as C_BPartner_ID FROM C_BPartner table1 WHERE table1.isActive='Y' AND table1.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_BPartner_IDR);

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

/**
Select for auxiliar field
 */
  public static String selectDef3101_2(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(table1.Name), '') ) as UpdatedBy FROM AD_User table1 WHERE table1.isActive='Y' AND table1.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedByR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updatedby");
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
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT C_BP_BankAccount.C_BPartner_ID AS NAME" +
      "        FROM C_BP_BankAccount" +
      "        WHERE C_BP_BankAccount.C_BP_BankAccount_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

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

/**
Select for parent field
 */
  public static String selectParent(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table1 on (C_BPartner.C_BPartner_ID = table1.C_BPartner_ID) WHERE C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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

/**
Select for parent field
 */
  public static String selectParentTrl(ConnectionProvider connectionProvider, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))) AS NAME FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table1 on (C_BPartner.C_BPartner_ID = table1.C_BPartner_ID) WHERE C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE C_BP_BankAccount" +
      "        SET A_Country = (?) , C_BPartner_ID = (?) , AD_User_ID = (?) , IsActive = (?) , BankAccountType = (?) , RoutingNo = (?) , AccountNo = (?) , ShowAccountNo = (?) , A_Zip = (?) , Iban = (?) , Showiban = (?) , SwiftCode = (?) , C_Country_ID = (?) , Displayedaccount = (?) , Bank_Name = (?) , CreditCardType = (?) , CreditCardNumber = (?) , CreditCardExpMM = TO_NUMBER(?) , CreditCardExpYY = TO_NUMBER(?) , A_Name = (?) , Text1 = (?) , AD_Org_ID = (?) , A_Street = (?) , A_EMail = (?) , A_Ident_SSN = (?) , R_AvsZip = (?) , A_Ident_DL = (?) , A_State = (?) , A_City = (?) , C_BP_BankAccount_ID = (?) , AD_Client_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE C_BP_BankAccount.C_BP_BankAccount_ID = ? " +
      "                 AND C_BP_BankAccount.C_BPartner_ID = ? " +
      "        AND C_BP_BankAccount.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BP_BankAccount.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aCountry);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bankaccounttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, routingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, showaccountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aZip);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iban);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, showiban);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, swiftcode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCountryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, displayedaccount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bankName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditcardtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditcardnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditcardexpmm);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditcardexpyy);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, text1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aStreet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aEmail);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aIdentSsn);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rAvszip);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aIdentDl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aState);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aCity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpBankaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpBankaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

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

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO C_BP_BankAccount " +
      "        (A_Country, C_BPartner_ID, AD_User_ID, IsActive, BankAccountType, RoutingNo, AccountNo, ShowAccountNo, A_Zip, Iban, Showiban, SwiftCode, C_Country_ID, Displayedaccount, Bank_Name, CreditCardType, CreditCardNumber, CreditCardExpMM, CreditCardExpYY, A_Name, Text1, C_BP_BankAccount_ID, AD_Org_ID, A_Street, A_EMail, A_Ident_SSN, R_AvsZip, A_Ident_DL, A_City, A_State, AD_Client_ID, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aCountry);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bankaccounttype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, routingno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, accountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, showaccountno);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aZip);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iban);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, showiban);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, swiftcode);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCountryId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, displayedaccount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, bankName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditcardtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditcardnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditcardexpmm);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, creditcardexpyy);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aName);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, text1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpBankaccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aStreet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aEmail);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aIdentSsn);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, rAvszip);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aIdentDl);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aCity);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aState);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

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

  public static int delete(ConnectionProvider connectionProvider, String param1, String cBpartnerId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_BP_BankAccount" +
      "        WHERE C_BP_BankAccount.C_BP_BankAccount_ID = ? " +
      "                 AND C_BP_BankAccount.C_BPartner_ID = ? " +
      "        AND C_BP_BankAccount.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND C_BP_BankAccount.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

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

  public static int deleteTransactional(Connection conn, ConnectionProvider connectionProvider, String param1, String cBpartnerId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM C_BP_BankAccount" +
      "        WHERE C_BP_BankAccount.C_BP_BankAccount_ID = ? " +
      "                 AND C_BP_BankAccount.C_BPartner_ID = ? ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);

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

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM C_BP_BankAccount" +
      "         WHERE C_BP_BankAccount.C_BP_BankAccount_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_org_id");
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

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM C_BP_BankAccount" +
      "         WHERE C_BP_BankAccount.C_BP_BankAccount_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "updated_time_stamp");
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
