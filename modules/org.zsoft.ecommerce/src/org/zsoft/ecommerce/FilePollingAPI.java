package org.zsoft.ecommerce;

import org.openbravo.database.ConnectionProvider;

public interface FilePollingAPI {
  public void fetchAndProcess(ConnectionProvider conn,String apikey,String secret,String shop) throws Exception ;
}
