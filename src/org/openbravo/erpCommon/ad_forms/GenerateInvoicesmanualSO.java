package org.openbravo.erpCommon.ad_forms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;

public class GenerateInvoicesmanualSO extends HttpSecureAppServlet {
	  private static final long serialVersionUID = 1L;

	  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
      ServletException {
		    VariablesSecureApp vars = new VariablesSecureApp(request);
		    vars.setSessionValue("issotrx", "Y");
		   
		    response.sendRedirect(strDireccion + "/org.openz.controller.ad_forms/GenerateInvoices.html");      		

		   //send redirect 
		    	
	  }
}
