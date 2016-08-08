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
class PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data implements FieldProvider {
static Logger log4j = Logger.getLogger(PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String cGreetingId;
  public String cGreetingIdr;
  public String title;
  public String name;
  public String enumber;
  public String email;
  public String fax;
  public String phone;
  public String phone2;
  public String medicaleducation;
  public String description;
  public String comments;
  public String isactive;
  public String iscommission;
  public String birthday;
  public String date1;
  public String date2;
  public String aussendienst;
  public String auxtext2;
  public String auxtext3;
  public String button1;
  public String nis;
  public String date3;
  public String emailuser;
  public String prominenter;
  public String kunde;
  public String persoenlicherkontakt2010;
  public String kooperation;
  public String defaultAdRoleId;
  public String geschaeftsfuehrer;
  public String persoenlicherkontakt2009;
  public String cUserDepartmentId;
  public String marktforschung;
  public String klinik;
  public String salesrepId;
  public String emailuserpw;
  public String number1;
  public String sachgebiet;
  public String defaultAdLanguage;
  public String processing;
  public String mailingzielgruppe;
  public String hobby;
  public String marketing;
  public String auxtext1;
  public String adUserId;
  public String einkauf;
  public String lastresult;
  public String password;
  public String blockbuster;
  public String adOrgtrxId;
  public String lastcontact;
  public String emarketing;
  public String supervisorId;
  public String persoenlicherkontakt2011;
  public String number4;
  public String communityzugehoerigkeit;
  public String it;
  public String unternehmenskommunikation;
  public String branche;
  public String number2;
  public String username;
  public String defaultAdClientId;
  public String number3;
  public String abteilungbereich;
  public String planung;
  public String humanresources;
  public String lastname;
  public String cColorId;
  public String date5;
  public String stippvisitenkunde;
  public String persoenlicherkontakt2008;
  public String training;
  public String adClientId;
  public String schluesselkontakt;
  public String veranstaltungsmanagement;
  public String positionfunktion;
  public String land;
  public String defaultAdOrgId;
  public String defaultMWarehouseId;
  public String presse;
  public String firstname;
  public String kol;
  public String adOrgId;
  public String number5;
  public String klinikkunde;
  public String medwissen;
  public String cBpartnerLocationId;
  public String cUserPositionId;
  public String geschaeftsentwicklung;
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
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("c_bpartner_idr") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("c_greeting_id") || fieldName.equals("cGreetingId"))
      return cGreetingId;
    else if (fieldName.equalsIgnoreCase("c_greeting_idr") || fieldName.equals("cGreetingIdr"))
      return cGreetingIdr;
    else if (fieldName.equalsIgnoreCase("title"))
      return title;
    else if (fieldName.equalsIgnoreCase("name"))
      return name;
    else if (fieldName.equalsIgnoreCase("enumber"))
      return enumber;
    else if (fieldName.equalsIgnoreCase("email"))
      return email;
    else if (fieldName.equalsIgnoreCase("fax"))
      return fax;
    else if (fieldName.equalsIgnoreCase("phone"))
      return phone;
    else if (fieldName.equalsIgnoreCase("phone2"))
      return phone2;
    else if (fieldName.equalsIgnoreCase("medicaleducation"))
      return medicaleducation;
    else if (fieldName.equalsIgnoreCase("description"))
      return description;
    else if (fieldName.equalsIgnoreCase("comments"))
      return comments;
    else if (fieldName.equalsIgnoreCase("isactive"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("iscommission"))
      return iscommission;
    else if (fieldName.equalsIgnoreCase("birthday"))
      return birthday;
    else if (fieldName.equalsIgnoreCase("date1"))
      return date1;
    else if (fieldName.equalsIgnoreCase("date2"))
      return date2;
    else if (fieldName.equalsIgnoreCase("aussendienst"))
      return aussendienst;
    else if (fieldName.equalsIgnoreCase("auxtext2"))
      return auxtext2;
    else if (fieldName.equalsIgnoreCase("auxtext3"))
      return auxtext3;
    else if (fieldName.equalsIgnoreCase("button1"))
      return button1;
    else if (fieldName.equalsIgnoreCase("nis"))
      return nis;
    else if (fieldName.equalsIgnoreCase("date3"))
      return date3;
    else if (fieldName.equalsIgnoreCase("emailuser"))
      return emailuser;
    else if (fieldName.equalsIgnoreCase("prominenter"))
      return prominenter;
    else if (fieldName.equalsIgnoreCase("kunde"))
      return kunde;
    else if (fieldName.equalsIgnoreCase("persoenlicherkontakt2010"))
      return persoenlicherkontakt2010;
    else if (fieldName.equalsIgnoreCase("kooperation"))
      return kooperation;
    else if (fieldName.equalsIgnoreCase("default_ad_role_id") || fieldName.equals("defaultAdRoleId"))
      return defaultAdRoleId;
    else if (fieldName.equalsIgnoreCase("geschaeftsfuehrer"))
      return geschaeftsfuehrer;
    else if (fieldName.equalsIgnoreCase("persoenlicherkontakt2009"))
      return persoenlicherkontakt2009;
    else if (fieldName.equalsIgnoreCase("c_user_department_id") || fieldName.equals("cUserDepartmentId"))
      return cUserDepartmentId;
    else if (fieldName.equalsIgnoreCase("marktforschung"))
      return marktforschung;
    else if (fieldName.equalsIgnoreCase("klinik"))
      return klinik;
    else if (fieldName.equalsIgnoreCase("salesrep_id") || fieldName.equals("salesrepId"))
      return salesrepId;
    else if (fieldName.equalsIgnoreCase("emailuserpw"))
      return emailuserpw;
    else if (fieldName.equalsIgnoreCase("number1"))
      return number1;
    else if (fieldName.equalsIgnoreCase("sachgebiet"))
      return sachgebiet;
    else if (fieldName.equalsIgnoreCase("default_ad_language") || fieldName.equals("defaultAdLanguage"))
      return defaultAdLanguage;
    else if (fieldName.equalsIgnoreCase("processing"))
      return processing;
    else if (fieldName.equalsIgnoreCase("mailingzielgruppe"))
      return mailingzielgruppe;
    else if (fieldName.equalsIgnoreCase("hobby"))
      return hobby;
    else if (fieldName.equalsIgnoreCase("marketing"))
      return marketing;
    else if (fieldName.equalsIgnoreCase("auxtext1"))
      return auxtext1;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("einkauf"))
      return einkauf;
    else if (fieldName.equalsIgnoreCase("lastresult"))
      return lastresult;
    else if (fieldName.equalsIgnoreCase("password"))
      return password;
    else if (fieldName.equalsIgnoreCase("blockbuster"))
      return blockbuster;
    else if (fieldName.equalsIgnoreCase("ad_orgtrx_id") || fieldName.equals("adOrgtrxId"))
      return adOrgtrxId;
    else if (fieldName.equalsIgnoreCase("lastcontact"))
      return lastcontact;
    else if (fieldName.equalsIgnoreCase("emarketing"))
      return emarketing;
    else if (fieldName.equalsIgnoreCase("supervisor_id") || fieldName.equals("supervisorId"))
      return supervisorId;
    else if (fieldName.equalsIgnoreCase("persoenlicherkontakt2011"))
      return persoenlicherkontakt2011;
    else if (fieldName.equalsIgnoreCase("number4"))
      return number4;
    else if (fieldName.equalsIgnoreCase("communityzugehoerigkeit"))
      return communityzugehoerigkeit;
    else if (fieldName.equalsIgnoreCase("it"))
      return it;
    else if (fieldName.equalsIgnoreCase("unternehmenskommunikation"))
      return unternehmenskommunikation;
    else if (fieldName.equalsIgnoreCase("branche"))
      return branche;
    else if (fieldName.equalsIgnoreCase("number2"))
      return number2;
    else if (fieldName.equalsIgnoreCase("username"))
      return username;
    else if (fieldName.equalsIgnoreCase("default_ad_client_id") || fieldName.equals("defaultAdClientId"))
      return defaultAdClientId;
    else if (fieldName.equalsIgnoreCase("number3"))
      return number3;
    else if (fieldName.equalsIgnoreCase("abteilungbereich"))
      return abteilungbereich;
    else if (fieldName.equalsIgnoreCase("planung"))
      return planung;
    else if (fieldName.equalsIgnoreCase("humanresources"))
      return humanresources;
    else if (fieldName.equalsIgnoreCase("lastname"))
      return lastname;
    else if (fieldName.equalsIgnoreCase("c_color_id") || fieldName.equals("cColorId"))
      return cColorId;
    else if (fieldName.equalsIgnoreCase("date5"))
      return date5;
    else if (fieldName.equalsIgnoreCase("stippvisitenkunde"))
      return stippvisitenkunde;
    else if (fieldName.equalsIgnoreCase("persoenlicherkontakt2008"))
      return persoenlicherkontakt2008;
    else if (fieldName.equalsIgnoreCase("training"))
      return training;
    else if (fieldName.equalsIgnoreCase("ad_client_id") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("schluesselkontakt"))
      return schluesselkontakt;
    else if (fieldName.equalsIgnoreCase("veranstaltungsmanagement"))
      return veranstaltungsmanagement;
    else if (fieldName.equalsIgnoreCase("positionfunktion"))
      return positionfunktion;
    else if (fieldName.equalsIgnoreCase("land"))
      return land;
    else if (fieldName.equalsIgnoreCase("default_ad_org_id") || fieldName.equals("defaultAdOrgId"))
      return defaultAdOrgId;
    else if (fieldName.equalsIgnoreCase("default_m_warehouse_id") || fieldName.equals("defaultMWarehouseId"))
      return defaultMWarehouseId;
    else if (fieldName.equalsIgnoreCase("presse"))
      return presse;
    else if (fieldName.equalsIgnoreCase("firstname"))
      return firstname;
    else if (fieldName.equalsIgnoreCase("kol"))
      return kol;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("number5"))
      return number5;
    else if (fieldName.equalsIgnoreCase("klinikkunde"))
      return klinikkunde;
    else if (fieldName.equalsIgnoreCase("medwissen"))
      return medwissen;
    else if (fieldName.equalsIgnoreCase("c_bpartner_location_id") || fieldName.equals("cBpartnerLocationId"))
      return cBpartnerLocationId;
    else if (fieldName.equalsIgnoreCase("c_user_position_id") || fieldName.equals("cUserPositionId"))
      return cUserPositionId;
    else if (fieldName.equalsIgnoreCase("geschaeftsentwicklung"))
      return geschaeftsentwicklung;
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
  public static PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, cBpartnerId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String cBpartnerId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(AD_User.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_User.CreatedBy) as CreatedByR, " +
      "        to_char(AD_User.Updated, ?) as updated, " +
      "        to_char(AD_User.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        AD_User.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = AD_User.UpdatedBy) as UpdatedByR," +
      "        AD_User.C_BPartner_ID, " +
      "(CASE WHEN AD_User.C_BPartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.Name), ''))),'') ) END) AS C_BPartner_IDR, " +
      "AD_User.C_Greeting_ID, " +
      "(CASE WHEN AD_User.C_Greeting_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))),'') ) END) AS C_Greeting_IDR, " +
      "AD_User.Title, " +
      "AD_User.Name, " +
      "AD_User.Enumber, " +
      "AD_User.Email, " +
      "AD_User.Fax, " +
      "AD_User.Phone, " +
      "AD_User.Phone2, " +
      "AD_User.Medicaleducation, " +
      "AD_User.Description, " +
      "AD_User.Comments, " +
      "COALESCE(AD_User.IsActive, 'N') AS IsActive, " +
      "COALESCE(AD_User.Iscommission, 'N') AS Iscommission, " +
      "AD_User.Birthday, " +
      "AD_User.Date1, " +
      "AD_User.Date2, " +
      "AD_User.Aussendienst, " +
      "AD_User.Auxtext2, " +
      "AD_User.Auxtext3, " +
      "AD_User.Button1, " +
      "AD_User.Nis, " +
      "AD_User.Date3, " +
      "AD_User.EmailUser, " +
      "AD_User.Prominenter, " +
      "AD_User.Kunde, " +
      "AD_User.Persoenlicherkontakt2010, " +
      "AD_User.Kooperation, " +
      "AD_User.Default_Ad_Role_ID, " +
      "AD_User.Geschaeftsfuehrer, " +
      "AD_User.Persoenlicherkontakt2009, " +
      "AD_User.C_User_Department_ID, " +
      "AD_User.Marktforschung, " +
      "AD_User.Klinik, " +
      "AD_User.Salesrep_ID, " +
      "AD_User.EmailUserPW, " +
      "AD_User.Number1, " +
      "AD_User.Sachgebiet, " +
      "AD_User.Default_Ad_Language, " +
      "AD_User.Processing, " +
      "AD_User.Mailingzielgruppe, " +
      "AD_User.Hobby, " +
      "AD_User.Marketing, " +
      "AD_User.Auxtext1, " +
      "AD_User.AD_User_ID, " +
      "AD_User.Einkauf, " +
      "AD_User.LastResult, " +
      "AD_User.Password, " +
      "AD_User.Blockbuster, " +
      "AD_User.AD_OrgTrx_ID, " +
      "AD_User.LastContact, " +
      "AD_User.Emarketing, " +
      "AD_User.Supervisor_ID, " +
      "AD_User.Persoenlicherkontakt2011, " +
      "AD_User.Number4, " +
      "AD_User.Communityzugehoerigkeit, " +
      "AD_User.It, " +
      "AD_User.Unternehmenskommunikation, " +
      "AD_User.Branche, " +
      "AD_User.Number2, " +
      "AD_User.UserName, " +
      "AD_User.Default_Ad_Client_ID, " +
      "AD_User.Number3, " +
      "AD_User.Abteilungbereich, " +
      "AD_User.Planung, " +
      "AD_User.Humanresources, " +
      "AD_User.Lastname, " +
      "AD_User.C_Color_ID, " +
      "AD_User.Date5, " +
      "AD_User.Stippvisitenkunde, " +
      "AD_User.Persoenlicherkontakt2008, " +
      "AD_User.Training, " +
      "AD_User.AD_Client_ID, " +
      "AD_User.Schluesselkontakt, " +
      "AD_User.Veranstaltungsmanagement, " +
      "AD_User.Positionfunktion, " +
      "AD_User.Land, " +
      "AD_User.Default_Ad_Org_ID, " +
      "AD_User.Default_M_Warehouse_ID, " +
      "AD_User.Presse, " +
      "AD_User.Firstname, " +
      "AD_User.Kol, " +
      "AD_User.AD_Org_ID, " +
      "AD_User.Number5, " +
      "AD_User.Klinikkunde, " +
      "AD_User.Medwissen, " +
      "AD_User.C_BPartner_Location_ID, " +
      "AD_User.C_User_Position_ID, " +
      "AD_User.Geschaeftsentwicklung, " +
      "        ? AS LANGUAGE " +
      "        FROM AD_User left join (select C_BPartner_ID, Name from C_BPartner) table1 on (AD_User.C_BPartner_ID = table1.C_BPartner_ID) left join (select C_Greeting_ID, Name from C_Greeting) table2 on (AD_User.C_Greeting_ID = table2.C_Greeting_ID) left join (select C_Greeting_ID,AD_Language, Name from C_Greeting_TRL) tableTRL2 on (table2.C_Greeting_ID = tableTRL2.C_Greeting_ID and tableTRL2.AD_Language = ?) " +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((cBpartnerId==null || cBpartnerId.equals(""))?"":"  AND AD_User.C_BPartner_ID = ?  ");
    strSql = strSql + 
      "        AND AD_User.AD_User_ID = ? " +
      "        AND AD_User.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND AD_User.AD_Org_ID IN (";
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
        PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data = new PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data();
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.created = UtilSql.getValue(result, "created");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.createdbyr = UtilSql.getValue(result, "createdbyr");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.updated = UtilSql.getValue(result, "updated");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.updatedTimeStamp = UtilSql.getValue(result, "updated_time_stamp");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.updatedby = UtilSql.getValue(result, "updatedby");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.updatedbyr = UtilSql.getValue(result, "updatedbyr");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.cBpartnerIdr = UtilSql.getValue(result, "c_bpartner_idr");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.cGreetingId = UtilSql.getValue(result, "c_greeting_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.cGreetingIdr = UtilSql.getValue(result, "c_greeting_idr");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.title = UtilSql.getValue(result, "title");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.name = UtilSql.getValue(result, "name");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.enumber = UtilSql.getValue(result, "enumber");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.email = UtilSql.getValue(result, "email");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.fax = UtilSql.getValue(result, "fax");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.phone = UtilSql.getValue(result, "phone");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.phone2 = UtilSql.getValue(result, "phone2");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.medicaleducation = UtilSql.getValue(result, "medicaleducation");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.description = UtilSql.getValue(result, "description");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.comments = UtilSql.getValue(result, "comments");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.isactive = UtilSql.getValue(result, "isactive");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.iscommission = UtilSql.getValue(result, "iscommission");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.birthday = UtilSql.getDateValue(result, "birthday", "dd-MM-yyyy");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.date1 = UtilSql.getDateValue(result, "date1", "dd-MM-yyyy");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.date2 = UtilSql.getDateValue(result, "date2", "dd-MM-yyyy");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.aussendienst = UtilSql.getValue(result, "aussendienst");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.auxtext2 = UtilSql.getValue(result, "auxtext2");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.auxtext3 = UtilSql.getValue(result, "auxtext3");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.button1 = UtilSql.getValue(result, "button1");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.nis = UtilSql.getValue(result, "nis");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.date3 = UtilSql.getDateValue(result, "date3", "dd-MM-yyyy");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.emailuser = UtilSql.getValue(result, "emailuser");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.prominenter = UtilSql.getValue(result, "prominenter");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.kunde = UtilSql.getValue(result, "kunde");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.persoenlicherkontakt2010 = UtilSql.getValue(result, "persoenlicherkontakt2010");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.kooperation = UtilSql.getValue(result, "kooperation");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.defaultAdRoleId = UtilSql.getValue(result, "default_ad_role_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.geschaeftsfuehrer = UtilSql.getValue(result, "geschaeftsfuehrer");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.persoenlicherkontakt2009 = UtilSql.getValue(result, "persoenlicherkontakt2009");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.cUserDepartmentId = UtilSql.getValue(result, "c_user_department_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.marktforschung = UtilSql.getValue(result, "marktforschung");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.klinik = UtilSql.getValue(result, "klinik");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.salesrepId = UtilSql.getValue(result, "salesrep_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.emailuserpw = UtilSql.getValue(result, "emailuserpw");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.number1 = UtilSql.getValue(result, "number1");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.sachgebiet = UtilSql.getValue(result, "sachgebiet");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.defaultAdLanguage = UtilSql.getValue(result, "default_ad_language");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.processing = UtilSql.getValue(result, "processing");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.mailingzielgruppe = UtilSql.getValue(result, "mailingzielgruppe");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.hobby = UtilSql.getValue(result, "hobby");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.marketing = UtilSql.getValue(result, "marketing");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.auxtext1 = UtilSql.getValue(result, "auxtext1");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.einkauf = UtilSql.getValue(result, "einkauf");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.lastresult = UtilSql.getValue(result, "lastresult");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.password = UtilSql.getValue(result, "password");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.blockbuster = UtilSql.getValue(result, "blockbuster");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.adOrgtrxId = UtilSql.getValue(result, "ad_orgtrx_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.lastcontact = UtilSql.getDateValue(result, "lastcontact", "dd-MM-yyyy");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.emarketing = UtilSql.getValue(result, "emarketing");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.supervisorId = UtilSql.getValue(result, "supervisor_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.persoenlicherkontakt2011 = UtilSql.getValue(result, "persoenlicherkontakt2011");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.number4 = UtilSql.getValue(result, "number4");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.communityzugehoerigkeit = UtilSql.getValue(result, "communityzugehoerigkeit");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.it = UtilSql.getValue(result, "it");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.unternehmenskommunikation = UtilSql.getValue(result, "unternehmenskommunikation");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.branche = UtilSql.getValue(result, "branche");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.number2 = UtilSql.getValue(result, "number2");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.username = UtilSql.getValue(result, "username");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.defaultAdClientId = UtilSql.getValue(result, "default_ad_client_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.number3 = UtilSql.getValue(result, "number3");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.abteilungbereich = UtilSql.getValue(result, "abteilungbereich");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.planung = UtilSql.getValue(result, "planung");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.humanresources = UtilSql.getValue(result, "humanresources");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.lastname = UtilSql.getValue(result, "lastname");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.cColorId = UtilSql.getValue(result, "c_color_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.date5 = UtilSql.getDateValue(result, "date5", "dd-MM-yyyy");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.stippvisitenkunde = UtilSql.getValue(result, "stippvisitenkunde");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.persoenlicherkontakt2008 = UtilSql.getValue(result, "persoenlicherkontakt2008");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.training = UtilSql.getValue(result, "training");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.adClientId = UtilSql.getValue(result, "ad_client_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.schluesselkontakt = UtilSql.getValue(result, "schluesselkontakt");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.veranstaltungsmanagement = UtilSql.getValue(result, "veranstaltungsmanagement");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.positionfunktion = UtilSql.getValue(result, "positionfunktion");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.land = UtilSql.getValue(result, "land");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.defaultAdOrgId = UtilSql.getValue(result, "default_ad_org_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.defaultMWarehouseId = UtilSql.getValue(result, "default_m_warehouse_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.presse = UtilSql.getValue(result, "presse");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.firstname = UtilSql.getValue(result, "firstname");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.kol = UtilSql.getValue(result, "kol");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.number5 = UtilSql.getValue(result, "number5");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.klinikkunde = UtilSql.getValue(result, "klinikkunde");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.medwissen = UtilSql.getValue(result, "medwissen");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.cBpartnerLocationId = UtilSql.getValue(result, "c_bpartner_location_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.cUserPositionId = UtilSql.getValue(result, "c_user_position_id");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.geschaeftsentwicklung = UtilSql.getValue(result, "geschaeftsentwicklung");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.language = UtilSql.getValue(result, "language");
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.adUserClient = "";
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.adOrgClient = "";
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.createdby = "";
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.trBgcolor = "";
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.totalCount = "";
        objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data);
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
    PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[] = new PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[vector.size()];
    vector.copyInto(objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data);
    return(objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data);
  }

/**
Create a registry
 */
  public static PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[] set(String cBpartnerId, String kol, String date1, String adOrgtrxId, String marketing, String phone, String emailuser, String emailuserpw, String humanresources, String salesrepId, String cColorId, String kooperation, String number1, String prominenter, String lastcontact, String positionfunktion, String auxtext1, String cUserDepartmentId, String fax, String name, String defaultMWarehouseId, String cGreetingId, String hobby, String adUserId, String land, String geschaeftsfuehrer, String birthday, String button1, String auxtext3, String persoenlicherkontakt2009, String defaultAdClientId, String einkauf, String date3, String unternehmenskommunikation, String persoenlicherkontakt2008, String auxtext2, String defaultAdOrgId, String presse, String description, String lastresult, String createdby, String createdbyr, String date2, String iscommission, String cBpartnerLocationId, String medicaleducation, String number4, String isactive, String klinik, String phone2, String supervisorId, String it, String firstname, String username, String aussendienst, String kunde, String email, String number5, String processing, String adOrgId, String blockbuster, String password, String geschaeftsentwicklung, String title, String nis, String branche, String persoenlicherkontakt2011, String mailingzielgruppe, String veranstaltungsmanagement, String schluesselkontakt, String enumber, String abteilungbereich, String medwissen, String klinikkunde, String cUserPositionId, String defaultAdRoleId, String defaultAdLanguage, String training, String persoenlicherkontakt2010, String adClientId, String communityzugehoerigkeit, String sachgebiet, String date5, String number2, String comments, String number3, String lastname, String updatedby, String updatedbyr, String stippvisitenkunde, String planung, String emarketing, String marktforschung)    throws ServletException {
    PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[] = new PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[1];
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0] = new PersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data();
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].created = "";
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].createdbyr = createdbyr;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].updated = "";
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].updatedTimeStamp = "";
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].updatedby = updatedby;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].updatedbyr = updatedbyr;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].cBpartnerId = cBpartnerId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].cBpartnerIdr = "";
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].cGreetingId = cGreetingId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].cGreetingIdr = "";
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].title = title;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].name = name;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].enumber = enumber;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].email = email;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].fax = fax;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].phone = phone;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].phone2 = phone2;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].medicaleducation = medicaleducation;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].description = description;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].comments = comments;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].isactive = isactive;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].iscommission = iscommission;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].birthday = birthday;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].date1 = date1;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].date2 = date2;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].aussendienst = aussendienst;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].auxtext2 = auxtext2;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].auxtext3 = auxtext3;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].button1 = button1;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].nis = nis;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].date3 = date3;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].emailuser = emailuser;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].prominenter = prominenter;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].kunde = kunde;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].persoenlicherkontakt2010 = persoenlicherkontakt2010;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].kooperation = kooperation;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].defaultAdRoleId = defaultAdRoleId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].geschaeftsfuehrer = geschaeftsfuehrer;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].persoenlicherkontakt2009 = persoenlicherkontakt2009;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].cUserDepartmentId = cUserDepartmentId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].marktforschung = marktforschung;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].klinik = klinik;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].salesrepId = salesrepId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].emailuserpw = emailuserpw;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].number1 = number1;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].sachgebiet = sachgebiet;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].defaultAdLanguage = defaultAdLanguage;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].processing = processing;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].mailingzielgruppe = mailingzielgruppe;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].hobby = hobby;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].marketing = marketing;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].auxtext1 = auxtext1;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].adUserId = adUserId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].einkauf = einkauf;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].lastresult = lastresult;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].password = password;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].blockbuster = blockbuster;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].adOrgtrxId = adOrgtrxId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].lastcontact = lastcontact;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].emarketing = emarketing;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].supervisorId = supervisorId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].persoenlicherkontakt2011 = persoenlicherkontakt2011;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].number4 = number4;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].communityzugehoerigkeit = communityzugehoerigkeit;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].it = it;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].unternehmenskommunikation = unternehmenskommunikation;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].branche = branche;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].number2 = number2;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].username = username;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].defaultAdClientId = defaultAdClientId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].number3 = number3;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].abteilungbereich = abteilungbereich;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].planung = planung;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].humanresources = humanresources;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].lastname = lastname;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].cColorId = cColorId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].date5 = date5;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].stippvisitenkunde = stippvisitenkunde;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].persoenlicherkontakt2008 = persoenlicherkontakt2008;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].training = training;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].adClientId = adClientId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].schluesselkontakt = schluesselkontakt;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].veranstaltungsmanagement = veranstaltungsmanagement;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].positionfunktion = positionfunktion;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].land = land;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].defaultAdOrgId = defaultAdOrgId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].defaultMWarehouseId = defaultMWarehouseId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].presse = presse;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].firstname = firstname;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].kol = kol;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].adOrgId = adOrgId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].number5 = number5;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].klinikkunde = klinikkunde;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].medwissen = medwissen;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].cBpartnerLocationId = cBpartnerLocationId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].cUserPositionId = cUserPositionId;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].geschaeftsentwicklung = geschaeftsentwicklung;
    objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data[0].language = "";
    return objectPersonalData8E5C93CA2B3E415EB4B1A1CF37735A99Data;
  }

/**
Select for auxiliar field
 */
  public static String selectActP51CE8E634AC04C74B2D18DEC05F9AF56_password(ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select c_password_create(10) as defaultvalue from dual ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    try {
    st = connectionProvider.getPreparedStatement(strSql);

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

/**
Select for auxiliar field
 */
  public static String selectDef624_0(ConnectionProvider connectionProvider, String CreatedByR)    throws ServletException {
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
  public static String selectDef626_1(ConnectionProvider connectionProvider, String UpdatedByR)    throws ServletException {
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
      "        SELECT AD_User.C_BPartner_ID AS NAME" +
      "        FROM AD_User" +
      "        WHERE AD_User.AD_User_ID = ?";

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
      "        UPDATE AD_User" +
      "        SET C_BPartner_ID = (?) , C_Greeting_ID = (?) , Title = (?) , Name = (?) , Enumber = (?) , Email = (?) , Fax = (?) , Phone = (?) , Phone2 = (?) , Medicaleducation = (?) , Description = (?) , Comments = (?) , IsActive = (?) , Iscommission = (?) , Birthday = TO_DATE(?) , Date1 = TO_DATE(?) , Date2 = TO_DATE(?) , Aussendienst = (?) , Auxtext2 = (?) , Auxtext3 = (?) , Button1 = (?) , Nis = (?) , Date3 = TO_DATE(?) , EmailUser = (?) , Prominenter = (?) , Kunde = (?) , Persoenlicherkontakt2010 = (?) , Kooperation = (?) , Default_Ad_Role_ID = (?) , Geschaeftsfuehrer = (?) , Persoenlicherkontakt2009 = (?) , C_User_Department_ID = (?) , Marktforschung = (?) , Klinik = (?) , Salesrep_ID = (?) , Number1 = TO_NUMBER(?) , Sachgebiet = (?) , Default_Ad_Language = (?) , Processing = (?) , Mailingzielgruppe = (?) , Hobby = (?) , Marketing = (?) , AD_User_ID = (?) , Lastname = (?) , Einkauf = (?) , LastResult = (?) , Blockbuster = (?) , AD_OrgTrx_ID = (?) , LastContact = TO_DATE(?) , Emarketing = (?) , Supervisor_ID = (?) , Persoenlicherkontakt2011 = (?) , Number4 = TO_NUMBER(?) , Communityzugehoerigkeit = (?) , It = (?) , Unternehmenskommunikation = (?) , Branche = (?) , Number2 = TO_NUMBER(?) , UserName = (?) , Default_Ad_Client_ID = (?) , Number3 = TO_NUMBER(?) , Abteilungbereich = (?) , Planung = (?) , Humanresources = (?) , Auxtext1 = (?) , C_Color_ID = (?) , Date5 = TO_DATE(?) , Stippvisitenkunde = (?) , Persoenlicherkontakt2008 = (?) , Training = (?) , AD_Client_ID = (?) , Schluesselkontakt = (?) , Veranstaltungsmanagement = (?) , Positionfunktion = (?) , Land = (?) , Default_Ad_Org_ID = (?) , Default_M_Warehouse_ID = (?) , Presse = (?) , Firstname = (?) , Kol = (?) , AD_Org_ID = (?) , Number5 = TO_NUMBER(?) , Klinikkunde = (?) , Medwissen = (?) , C_BPartner_Location_ID = (?) , C_User_Position_ID = (?) , Geschaeftsentwicklung = (?) , updated = now(), updatedby = ? " +
      "        WHERE AD_User.AD_User_ID = ? " +
      "                 AND AD_User.C_BPartner_ID = ? " +
      "        AND AD_User.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_User.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGreetingId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, email);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, phone);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, phone2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, medicaleducation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, comments);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscommission);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, birthday);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aussendienst);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, auxtext2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, auxtext3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, button1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nis);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emailuser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, prominenter);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, kunde);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, persoenlicherkontakt2010);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, kooperation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultAdRoleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, geschaeftsfuehrer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, persoenlicherkontakt2009);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUserDepartmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, marktforschung);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, klinik);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sachgebiet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultAdLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mailingzielgruppe);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hobby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, marketing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, einkauf);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastresult);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, blockbuster);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastcontact);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emarketing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, supervisorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, persoenlicherkontakt2011);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number4);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, communityzugehoerigkeit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, it);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unternehmenskommunikation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, branche);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, username);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultAdClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, abteilungbereich);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, planung);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, humanresources);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, auxtext1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cColorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date5);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stippvisitenkunde);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, persoenlicherkontakt2008);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, training);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, schluesselkontakt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, veranstaltungsmanagement);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, positionfunktion);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, land);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultAdOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultMWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, presse);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, firstname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, kol);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number5);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, klinikkunde);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, medwissen);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUserPositionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, geschaeftsentwicklung);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
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
      "        INSERT INTO AD_User " +
      "        (C_BPartner_ID, C_Greeting_ID, Title, Name, Enumber, Email, Fax, Phone, Phone2, Medicaleducation, Description, Comments, IsActive, Iscommission, Birthday, Date1, Date2, Aussendienst, Auxtext2, Auxtext3, Button1, Nis, Date3, EmailUser, Prominenter, Kunde, Persoenlicherkontakt2010, Kooperation, Default_Ad_Role_ID, Geschaeftsfuehrer, Persoenlicherkontakt2009, C_User_Department_ID, Marktforschung, Klinik, Salesrep_ID, EmailUserPW, Number1, Sachgebiet, Default_Ad_Language, Processing, Mailingzielgruppe, Hobby, Marketing, Auxtext1, AD_User_ID, Einkauf, LastResult, Password, Blockbuster, AD_OrgTrx_ID, LastContact, Emarketing, Supervisor_ID, Persoenlicherkontakt2011, Number4, Communityzugehoerigkeit, It, Unternehmenskommunikation, Branche, Number2, UserName, Default_Ad_Client_ID, Number3, Abteilungbereich, Planung, Humanresources, Lastname, C_Color_ID, Date5, Stippvisitenkunde, Persoenlicherkontakt2008, Training, AD_Client_ID, Schluesselkontakt, Veranstaltungsmanagement, Positionfunktion, Land, Default_Ad_Org_ID, Default_M_Warehouse_ID, Presse, Firstname, Kol, AD_Org_ID, Number5, Klinikkunde, Medwissen, C_BPartner_Location_ID, C_User_Position_ID, Geschaeftsentwicklung, created, createdby, updated, updatedBy)" +
      "        VALUES ((?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGreetingId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, title);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, name);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, enumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, email);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, fax);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, phone);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, phone2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, medicaleducation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, comments);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, iscommission);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, birthday);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, aussendienst);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, auxtext2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, auxtext3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, button1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, nis);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emailuser);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, prominenter);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, kunde);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, persoenlicherkontakt2010);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, kooperation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultAdRoleId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, geschaeftsfuehrer);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, persoenlicherkontakt2009);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUserDepartmentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, marktforschung);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, klinik);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, salesrepId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emailuserpw);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, sachgebiet);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultAdLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mailingzielgruppe);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, hobby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, marketing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, auxtext1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adUserId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, einkauf);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastresult);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, password);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, blockbuster);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgtrxId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastcontact);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emarketing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, supervisorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, persoenlicherkontakt2011);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number4);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, communityzugehoerigkeit);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, it);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, unternehmenskommunikation);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, branche);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number2);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, username);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultAdClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number3);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, abteilungbereich);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, planung);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, humanresources);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, lastname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cColorId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, date5);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, stippvisitenkunde);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, persoenlicherkontakt2008);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, training);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, schluesselkontakt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, veranstaltungsmanagement);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, positionfunktion);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, land);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultAdOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, defaultMWarehouseId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, presse);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, firstname);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, kol);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, number5);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, klinikkunde);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, medwissen);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerLocationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cUserPositionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, geschaeftsentwicklung);
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
      "        DELETE FROM AD_User" +
      "        WHERE AD_User.AD_User_ID = ? " +
      "                 AND AD_User.C_BPartner_ID = ? " +
      "        AND AD_User.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND AD_User.AD_Org_ID IN (";
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
      "        DELETE FROM AD_User" +
      "        WHERE AD_User.AD_User_ID = ? " +
      "                 AND AD_User.C_BPartner_ID = ? ";

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
      "          FROM AD_User" +
      "         WHERE AD_User.AD_User_ID = ? ";

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
      "          FROM AD_User" +
      "         WHERE AD_User.AD_User_ID = ? ";

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
