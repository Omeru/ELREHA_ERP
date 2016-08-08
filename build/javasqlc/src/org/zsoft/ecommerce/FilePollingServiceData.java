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

public class FilePollingServiceData implements FieldProvider {
static Logger log4j = Logger.getLogger(FilePollingServiceData.class);
  private String InitRecordNumber="0";
  public String isoderactive;
  public String cBpartnerId;
  public String zseShopId;
  public String adOrgId;
  public String value;
  public String api;
  public String apikey;
  public String secret;
  public String externalid;
  public String parentid;
  public String adLanguage;
  public String lang;
  public String zseShopdeletelogId;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("isoderactive"))
      return isoderactive;
    else if (fieldName.equalsIgnoreCase("c_bpartner_id") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("zse_shop_id") || fieldName.equals("zseShopId"))
      return zseShopId;
    else if (fieldName.equalsIgnoreCase("ad_org_id") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("api"))
      return api;
    else if (fieldName.equalsIgnoreCase("apikey"))
      return apikey;
    else if (fieldName.equalsIgnoreCase("secret"))
      return secret;
    else if (fieldName.equalsIgnoreCase("externalid"))
      return externalid;
    else if (fieldName.equalsIgnoreCase("parentid"))
      return parentid;
    else if (fieldName.equalsIgnoreCase("ad_language") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("lang"))
      return lang;
    else if (fieldName.equalsIgnoreCase("zse_shopdeletelog_id") || fieldName.equals("zseShopdeletelogId"))
      return zseShopdeletelogId;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static FilePollingServiceData[] select(ConnectionProvider connectionProvider)    throws ServletException {
    return select(connectionProvider, 0, 0);
  }

  public static FilePollingServiceData[] select(ConnectionProvider connectionProvider, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT s.isoderactive , b.c_bpartner_id, s.zse_shop_id , s.ad_org_id , s.value, s.api,s.apikey , " +
      "             s.secret, '' as EXTERNALID,'' as parentid,s.ad_language,coalesce(l.languageiso,'de') as lang, " +
      "             '' as zse_shopdeletelog_id" +
      "        from zse_shop s left join ad_language l on s.ad_language=l.ad_language" +
      "                        left join zse_ecommercegrant b on b.zse_shop_id=s.zse_shop_id" +
      "        where s.isactive='Y' and s.api in ('SANGRO','ATTENDS')      ";

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
        FilePollingServiceData objectFilePollingServiceData = new FilePollingServiceData();
        objectFilePollingServiceData.isoderactive = UtilSql.getValue(result, "isoderactive");
        objectFilePollingServiceData.cBpartnerId = UtilSql.getValue(result, "c_bpartner_id");
        objectFilePollingServiceData.zseShopId = UtilSql.getValue(result, "zse_shop_id");
        objectFilePollingServiceData.adOrgId = UtilSql.getValue(result, "ad_org_id");
        objectFilePollingServiceData.value = UtilSql.getValue(result, "value");
        objectFilePollingServiceData.api = UtilSql.getValue(result, "api");
        objectFilePollingServiceData.apikey = UtilSql.getValue(result, "apikey");
        objectFilePollingServiceData.secret = UtilSql.getValue(result, "secret");
        objectFilePollingServiceData.externalid = UtilSql.getValue(result, "externalid");
        objectFilePollingServiceData.parentid = UtilSql.getValue(result, "parentid");
        objectFilePollingServiceData.adLanguage = UtilSql.getValue(result, "ad_language");
        objectFilePollingServiceData.lang = UtilSql.getValue(result, "lang");
        objectFilePollingServiceData.zseShopdeletelogId = UtilSql.getValue(result, "zse_shopdeletelog_id");
        objectFilePollingServiceData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectFilePollingServiceData);
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
    FilePollingServiceData objectFilePollingServiceData[] = new FilePollingServiceData[vector.size()];
    vector.copyInto(objectFilePollingServiceData);
    return(objectFilePollingServiceData);
  }

  public static String textwithHtmlEscapes(ConnectionProvider connectionProvider, String text)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "     select zssi_2HTMLescapes(?) from dual";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, text);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "zssi_2htmlescapes");
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
