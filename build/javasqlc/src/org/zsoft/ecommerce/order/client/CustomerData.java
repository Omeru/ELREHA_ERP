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

public class CustomerData implements FieldProvider {
static Logger log4j = Logger.getLogger(CustomerData.class);
  private String InitRecordNumber="0";
  public String value;
  public String owncodeatpartnersite;
  public String address1;
  public String address2;
  public String postal;
  public String city;
  public String country;
  public String firstname;
  public String lastname;
  public String bpname;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("value"))
      return value;
    else if (fieldName.equalsIgnoreCase("owncodeatpartnersite"))
      return owncodeatpartnersite;
    else if (fieldName.equalsIgnoreCase("address1"))
      return address1;
    else if (fieldName.equalsIgnoreCase("address2"))
      return address2;
    else if (fieldName.equalsIgnoreCase("postal"))
      return postal;
    else if (fieldName.equalsIgnoreCase("city"))
      return city;
    else if (fieldName.equalsIgnoreCase("country"))
      return country;
    else if (fieldName.equalsIgnoreCase("firstname"))
      return firstname;
    else if (fieldName.equalsIgnoreCase("lastname"))
      return lastname;
    else if (fieldName.equalsIgnoreCase("bpname"))
      return bpname;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static CustomerData[] select(ConnectionProvider connectionProvider, String OrderId)    throws ServletException {
    return select(connectionProvider, OrderId, 0, 0);
  }

  public static CustomerData[] select(ConnectionProvider connectionProvider, String OrderId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         select b.value,b.owncodeatpartnersite,l.address1,l.address2,l.postal,l.city,c.name as country,u.firstname,u.lastname,coalesce(bpl.deviant_bp_name,b.name) as bpname" +
      "                       from c_bpartner b,c_order o left join ad_user u on o.ad_user_id=u.ad_user_id and u.c_bpartner_id=o.c_bpartner_id ," +
      "                           c_bpartner_location bpl,c_location l left join c_country c on   l.c_country_id=c.c_country_id             " +
      "                       where  b.c_bpartner_id=o.c_bpartner_id and o.c_bpartner_location_id=bpl.c_bpartner_location_id  and             " +
      "                              bpl.c_bpartner_id=b.c_bpartner_id  and bpl.c_location_id=l.c_location_id     " +
      "                          and o.c_order_id=? ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
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
        CustomerData objectCustomerData = new CustomerData();
        objectCustomerData.value = UtilSql.getValue(result, "value");
        objectCustomerData.owncodeatpartnersite = UtilSql.getValue(result, "owncodeatpartnersite");
        objectCustomerData.address1 = UtilSql.getValue(result, "address1");
        objectCustomerData.address2 = UtilSql.getValue(result, "address2");
        objectCustomerData.postal = UtilSql.getValue(result, "postal");
        objectCustomerData.city = UtilSql.getValue(result, "city");
        objectCustomerData.country = UtilSql.getValue(result, "country");
        objectCustomerData.firstname = UtilSql.getValue(result, "firstname");
        objectCustomerData.lastname = UtilSql.getValue(result, "lastname");
        objectCustomerData.bpname = UtilSql.getValue(result, "bpname");
        objectCustomerData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectCustomerData);
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
    CustomerData objectCustomerData[] = new CustomerData[vector.size()];
    vector.copyInto(objectCustomerData);
    return(objectCustomerData);
  }
}
