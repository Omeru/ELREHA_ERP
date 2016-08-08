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

public class WebServicesData implements FieldProvider {
static Logger log4j = Logger.getLogger(WebServicesData.class);
  private String InitRecordNumber="0";
  public String url;
  public String apikey;
  public String secret;
  public String api;
  public String adUserId;
  public String adLanguage;
  public String isoderactive;
  public String isstockactive;
  public String initorderdays;
  public String deletesecurity;
  public String deletecount;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("url"))
      return url;
    else if (fieldName.equalsIgnoreCase("apikey"))
      return apikey;
    else if (fieldName.equalsIgnoreCase("secret"))
      return secret;
    else if (fieldName.equalsIgnoreCase("api"))
      return api;
    else if (fieldName.equalsIgnoreCase("ad_user_id") || fieldName.equals("adUserId"))
      return adUserId;
    else if (fieldName.equalsIgnoreCase("ad_language") || fieldName.equals("adLanguage"))
      return adLanguage;
    else if (fieldName.equalsIgnoreCase("isoderactive"))
      return isoderactive;
    else if (fieldName.equalsIgnoreCase("isstockactive"))
      return isstockactive;
    else if (fieldName.equalsIgnoreCase("initorderdays"))
      return initorderdays;
    else if (fieldName.equalsIgnoreCase("deletesecurity"))
      return deletesecurity;
    else if (fieldName.equalsIgnoreCase("deletecount"))
      return deletecount;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static WebServicesData[] selectShopCredentials(ConnectionProvider connectionProvider, String shopId)    throws ServletException {
    return selectShopCredentials(connectionProvider, shopId, 0, 0);
  }

  public static WebServicesData[] selectShopCredentials(ConnectionProvider connectionProvider, String shopId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "             SELECT url,apikey,secret,api,ad_user_id,ad_language,isoderactive,isstockactive,initorderdays,deletesecurity,deletecount" +
      "             from zse_shop where zse_shop_id = ?       ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shopId);

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
        WebServicesData objectWebServicesData = new WebServicesData();
        objectWebServicesData.url = UtilSql.getValue(result, "url");
        objectWebServicesData.apikey = UtilSql.getValue(result, "apikey");
        objectWebServicesData.secret = UtilSql.getValue(result, "secret");
        objectWebServicesData.api = UtilSql.getValue(result, "api");
        objectWebServicesData.adUserId = UtilSql.getValue(result, "ad_user_id");
        objectWebServicesData.adLanguage = UtilSql.getValue(result, "ad_language");
        objectWebServicesData.isoderactive = UtilSql.getValue(result, "isoderactive");
        objectWebServicesData.isstockactive = UtilSql.getValue(result, "isstockactive");
        objectWebServicesData.initorderdays = UtilSql.getValue(result, "initorderdays");
        objectWebServicesData.deletesecurity = UtilSql.getValue(result, "deletesecurity");
        objectWebServicesData.deletecount = UtilSql.getValue(result, "deletecount");
        objectWebServicesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectWebServicesData);
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
    WebServicesData objectWebServicesData[] = new WebServicesData[vector.size()];
    vector.copyInto(objectWebServicesData);
    return(objectWebServicesData);
  }

  public static String hasAccess(ConnectionProvider connectionProvider, String username, String password, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "	         SELECT COUNT(*) AS AUTH" +
      "		       FROM AD_USER  U, ad_user_roles UR, AD_ROLE R, ad_role_orgaccess ARO						      " +
      "			  WHERE U.USERNAME = ? " +
      "	            AND U.PASSWORD = ?	" +
      "	            AND UR.AD_USER_ID=U.AD_USER_ID" +
      "	            AND R.AD_ROLE_ID=UR.AD_ROLE_ID" +
      "	            AND ARO.AD_ROLE_ID=	R.AD_ROLE_ID" +
      "	            AND ARO.ad_org_id = ?		";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, username);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, password);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "auth");
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

  public static String getClient(ConnectionProvider connectionProvider, String adOrgId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "             SELECT AD_CLIENT_ID from AD_ORG where ad_org_id = ?       ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ad_client_id");
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

  public static String getUserId(ConnectionProvider connectionProvider, String username)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "             SELECT AD_USER_ID  FROM AD_USER  " +
      "              WHERE USERNAME = ?    ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, username);

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
}
