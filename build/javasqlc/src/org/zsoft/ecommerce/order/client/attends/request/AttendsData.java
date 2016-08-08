//Sqlc generated V1.O00-1
package org.zsoft.ecommerce.order.client.attends.request;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.data.FResponse;
import java.util.*;

public class AttendsData implements FieldProvider {
static Logger log4j = Logger.getLogger(AttendsData.class);
  private String InitRecordNumber="0";
  public String name;
  public String address1;
  public String address2;
  public String postal;
  public String city;
  public String country;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("name"))
      return name;
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
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static AttendsData[] select(ConnectionProvider connectionProvider, String shopId)    throws ServletException {
    return select(connectionProvider, shopId, 0, 0);
  }

  public static AttendsData[] select(ConnectionProvider connectionProvider, String shopId, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         select org.name,l.address1,l.address2,l.postal,l.city,c.name as country" +
      "                       from m_warehouse m,c_order o,ad_org org, c_location l left join c_country c on   l.c_country_id=c.c_country_id             " +
      "                       where  m.c_location_id=l.c_location_id and o.m_warehouse_id=m.m_warehouse_id " +
      "                          and o.ad_org_id=org.ad_org_id and o.c_order_id=? ";

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
        AttendsData objectAttendsData = new AttendsData();
        objectAttendsData.name = UtilSql.getValue(result, "name");
        objectAttendsData.address1 = UtilSql.getValue(result, "address1");
        objectAttendsData.address2 = UtilSql.getValue(result, "address2");
        objectAttendsData.postal = UtilSql.getValue(result, "postal");
        objectAttendsData.city = UtilSql.getValue(result, "city");
        objectAttendsData.country = UtilSql.getValue(result, "country");
        objectAttendsData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectAttendsData);
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
    AttendsData objectAttendsData[] = new AttendsData[vector.size()];
    vector.copyInto(objectAttendsData);
    return(objectAttendsData);
  }
}
