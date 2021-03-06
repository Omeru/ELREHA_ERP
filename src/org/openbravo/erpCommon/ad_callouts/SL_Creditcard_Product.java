/*
***************************************************************************************************************************************************
* The contents of this file are subject to the Openbravo  Public  License Version  1.0  (the  "License"),  being   the  Mozilla   Public  License
* Version 1.1  with a permitted attribution clause; you may not  use this file except in compliance with the License. You  may  obtain  a copy of
* the License at http://www.openbravo.com/legal/license.html. Software distributed under the License  is  distributed  on  an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the specific  language  governing  rights  and  limitations
* under the License. The Original Code is Openbravo ERP.
* The Initial Developer of the Original Code is Openbravo SL. Parts created by Openbravo are Copyright (C) 2001-2009 Openbravo SL
* All Rights Reserved.
* Contributor(s): Stefan Zimmermann, sz@zimmermann-software.de (SZ) Contributions are Copyright (C) 2011 Stefan Zimmermann
****************************************************************************************************************************************************
 */
package org.openbravo.erpCommon.ad_callouts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openz.controller.callouts.CalloutStructure;

public class SL_Creditcard_Product extends ProductTextHelper {
  private static final long serialVersionUID = 1L;

  public void init(ServletConfig config) {
    super.init(config);
    boolHist = false;
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    VariablesSecureApp vars = new VariablesSecureApp(request);
    if (vars.commandIn("DEFAULT")) {
      String strChanged = vars.getStringParameter("inpLastFieldChanged");
      if (log4j.isDebugEnabled())
        log4j.debug("CHANGED: " + strChanged);
      
      String strWindowId = vars.getStringParameter("inpwindowId");
      String strCBpartnerID = vars.getSessionValue(strWindowId+"|C_BPartner_ID");
      String strCInvoiceID = vars.getStringParameter("inpcInvoiceCreditcardVId");  // request-variable      
      String strMProductID = vars.getStringParameter("inpmProductId");             // request-variable
      
      try {
        printPage(response, vars, strMProductID, strCInvoiceID, strCBpartnerID);
      } catch (ServletException ex) {
        pageErrorCallOut(response);
      }
    } else
      pageError(response);
  }

  private void printPage(HttpServletResponse response, VariablesSecureApp vars,
      String strMProductID, String strCInvoiceID, String strCBpartnerID) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: dataSheet");

    CalloutStructure callout = new CalloutStructure(this, this.getClass().getSimpleName() );
    
    String strUOM=SLGlobalUseProductData.selectProductUom(this, strMProductID);
    callout.appendString("inpcUomId",strUOM);
    
   // get TAX from Product, BP-Location, Product-Category or default (Organization / Org_AcctSchema)
    if (! strMProductID.equals("")) {
      String strCTaxID = SLInvoiceTaxData.selectTax(this, strCInvoiceID, strMProductID);
      if (! strCTaxID.equals("")) {
        callout.appendString("inpcTaxId", strCTaxID);
      }
      else
        callout.appendMessage("NoLocationNoTaxCalculated", this, vars);
    }
    
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(callout.returnCalloutAppFrame());
    out.close();
  }
}
