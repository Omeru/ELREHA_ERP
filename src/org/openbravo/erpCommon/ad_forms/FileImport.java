/*
 *************************************************************************
* The contents of this file are subject to the Openbravo  Public  License Version  1.0  (the  "License"),  being   the  Mozilla   Public  License
* Version 1.1  with a permitted attribution clause; you may not  use this file except in compliance with the License. You  may  obtain  a copy of
* the License at http://www.openbravo.com/legal/license.html. Software distributed under the License  is  distributed  on  an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the specific  language  governing  rights  and  limitations
* under the License. The Original Code is Openbravo ERP.
* The Initial Developer of the Original Code is Openbravo SL. Parts created by Openbravo are Copyright (C) 2001-2009 Openbravo SL
* All Rights Reserved.
* Contributor(s): Stefan Zimmermann, 02/2012, sz@zimmermann-software.de (SZ) Contributions are Copyright (C) 2012 Stefan Zimmermann
* 
 ************************************************************************
 */
package org.openbravo.erpCommon.ad_forms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.data.FieldProvider;
import org.openbravo.erpCommon.ad_combos.OrganizationComboData;
import org.openbravo.erpCommon.businessUtility.WindowTabs;
import org.openbravo.erpCommon.utility.ComboTableData;
import org.openbravo.erpCommon.utility.LeftTabsBar;
import org.openbravo.erpCommon.utility.NavigationBar;
import org.openbravo.erpCommon.utility.OBError;
import org.openbravo.erpCommon.utility.SequenceIdData;
import org.openbravo.erpCommon.utility.ToolBar;
import org.openbravo.erpCommon.utility.Utility;
import org.openbravo.xmlEngine.XmlDocument;
import org.openbravo.erpCommon.utility.OBError;
import org.openz.util.*;

public class FileImport extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  private static boolean firstRowHeaders = true;

  private static final int THRESHOLD = 1000;
  
  private static String uploadPath="/tmp/";

  public void init(ServletConfig config) {
    super.init(config);
    boolHist = false;
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    VariablesSecureApp vars = new VariablesSecureApp(request);
    if (log4j.isDebugEnabled())
      log4j.debug("Command: " + vars.getStringParameter("Command"));
    String strFirstLineHeader = vars.getStringParameter("inpFirstLineHeader");
    firstRowHeaders = (strFirstLineHeader.equals("Y")) ? true : false;
    FileLoadData fieldsData = null;
    vars.setSessionValue("isDatevImport","Y");  // This hides unessessary Screen Items
    if (vars.commandIn("DEFAULT")) {
      String strAdImpformatId = vars.getStringParameter("inpadImpformatId");
      printPage(response, vars);
      
    } else if (vars.commandIn("SAVE")) {
      String strAdImpformatId = vars.getStringParameter("inpadImpformatId");
      if (strAdImpformatId.equals("1000007")) { //DATEV Import
       String strAD_Org_ID = vars.getStringParameter("inpadOrgId");
    
        final File uploadedDir = new File("/tmp");
        final FileItem file = vars.getMultiFile("inpFile");
        final File uploadedFile = new File(uploadedDir, file.getName());
        if (file == null)
          throw new ServletException("Empty file");

        String result = "ERROR";
        if (uploadedFile.exists())
          uploadedFile.delete();
        try {
          file.write(uploadedFile);
          File tempfile=new File(uploadedDir, file.getName() + ".tmp");
          uploadedFile.renameTo(tempfile);
          InputStreamReader in = new InputStreamReader (new FileInputStream(tempfile), "ISO-8859-15");
          BufferedReader inr = new BufferedReader(in);
          FileOutputStream fos = new FileOutputStream(uploadedFile);
          OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
          Writer out = new BufferedWriter(osw);
          String line;
          while ((line= inr.readLine())!=null) {
            if (!line.contains("\"DTVF\";")){
              if (line.contains("20;Stück;Gewicht"))
                line=line.substring(0,line.indexOf("gsjahr;Zugeordnete Fälligkeit")+29);
              else
                line=line.substring(0,FormatUtils.ordinalIndexOf(line,";", 91)+1);
          }
              out.write(line);
              out.write("\r\n");
              
          }

          out.close();
          in.close();
          tempfile.delete();
          
         result =  FileImportData.zsdv_insertDatevImport_01(this, uploadedFile.getAbsolutePath().replace("\\", "/") );
          if (!result.startsWith("SUCCESS")) 
            throw new Exception ("Error in Datev-Procedure 1:" + result);
          else
            result =  FileImportData.zsdv_insertDatevImport_02(this,strAD_Org_ID);
          if (!result.startsWith("SUCCESS")) 
            throw new Exception ("Error in Datev-Procedure 2:" + result);
          else
            result =  FileImportData.zsdv_insertDatevImport_03(this,strAD_Org_ID);
          if (!result.startsWith("SUCCESS")) 
            throw new Exception ("Error in Datev-Procedure 3:" + result);
        } catch (Exception e) {
          e.printStackTrace();
          throw new ServletException ("Error in Datev-Procedure." + result);  
          
        }
        OBError myMessage =new  OBError();
        myMessage.setType("Success");
        myMessage.setTitle(Utility.messageBD(this, "ImportSucess", vars.getLanguage()));
        myMessage.setMessage(result);
        vars.setMessage("FileImport", myMessage);
        printPage(response, vars);
       

      } else {

        
        if (strAdImpformatId.equals("41E0B6B0B0564C4EB9E1B9B727D0F295")){ // Pricelist Import
          final File uploadedDir = new File(uploadPath);
          final FileItem file = vars.getMultiFile("inpFile");
          final File uploadedFile = new File(uploadedDir, file.getName());
          if (file == null)
            throw new ServletException("Empty file");

          String result = "ERROR";
          if (uploadedFile.exists())
            uploadedFile.delete();
          try {
            file.write(uploadedFile);
            
           result =  FileImportData.i_import_pricelist(this, uploadedFile.getAbsolutePath().replace("\\", "/") ,vars.getUser());
          } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException ("Error in File Upload Procedure." + e.getMessage());  
            
          }
        OBError myMessage =new  OBError();
        myMessage.setType("Success");
        myMessage.setTitle(Utility.messageBD(this, "ImportSucess", vars.getLanguage()));
        myMessage.setMessage(result);
        vars.setMessage("FileImport", myMessage);
        printPage(response, vars);
      }
      if (strAdImpformatId.equals("D5396BAC318C40C8BE603CD6FDFE3B18")){ // Product Import
          final File uploadedDir = new File(uploadPath);
          final FileItem file = vars.getMultiFile("inpFile");
          final File uploadedFile = new File(uploadedDir, file.getName());
          if (file == null)
            throw new ServletException("Empty file");

          String result = "ERROR";
          if (uploadedFile.exists())
            uploadedFile.delete();
          try {
            file.write(uploadedFile);
            
           result =  FileImportData.i_import_product(this, uploadedFile.getAbsolutePath().replace("\\", "/") ,vars.getUser());
          } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException ("Error in File Upload Procedure." + e.getMessage());  
            
          }
        OBError myMessage =new  OBError();
        myMessage.setType("Success");
        myMessage.setTitle(Utility.messageBD(this, "ImportSucess", vars.getLanguage()));
        myMessage.setMessage(result);
        vars.setMessage("FileImport", myMessage);
        printPage(response, vars);
      }
      if (strAdImpformatId.equals("3CF8D43902B345A093835A16A3187238")){ // Product PO Import
        final File uploadedDir = new File(uploadPath);
        final FileItem file = vars.getMultiFile("inpFile");
        final File uploadedFile = new File(uploadedDir, file.getName());
        if (file == null)
          throw new ServletException("Empty file");

        String result = "ERROR";
        if (uploadedFile.exists())
          uploadedFile.delete();
        try {
          file.write(uploadedFile);
          
         result =  FileImportData.i_import_product_po(this, uploadedFile.getAbsolutePath().replace("\\", "/") ,vars.getUser());
        } catch (Exception e) {
          e.printStackTrace();
          throw new ServletException ("Error in File Upload Procedure." + e.getMessage());  
          
        }
      OBError myMessage =new  OBError();
      myMessage.setType("Success");
      myMessage.setTitle(Utility.messageBD(this, "ImportSucess", vars.getLanguage()));
      myMessage.setMessage(result);
      vars.setMessage("FileImport", myMessage);
      printPage(response, vars);
    }
     }
    } else
      pageError(response);
  }



  private void printPage(HttpServletResponse response, VariablesSecureApp vars) throws IOException, ServletException {
    if (log4j.isDebugEnabled())
      log4j.debug("Output: file importing Frame 1");
    XmlDocument xmlDocument = null;
    xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpCommon/ad_forms/FileImport").createXmlDocument();

    ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "FileImport", false, "", "", "", false, "ad_forms", strReplaceWith, false, true);

    toolbar.prepareSimpleToolBarTemplate();
    xmlDocument.setParameter("toolbar", toolbar.toString());
    
    String strDatevImport=vars.getSessionValue("isDatevImport");
    if (log4j.isDebugEnabled())
      log4j.debug("2");

    if (strDatevImport.equals("Y")) {
    try {
      WindowTabs tabs = new WindowTabs(this, vars, "org.openbravo.erpCommon.ad_forms.FileImportDatev");
      //"org.openbravo.erpCommon.ad_forms.FileImport"
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "FileImport.html", classInfo.id, classInfo.type, strReplaceWith, tabs.breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "FileImport.html", strReplaceWith);
      xmlDocument.setParameter("leftTabs", lBar.manualTemplate());

      xmlDocument.setData("reportAD_ORGID", "liststructure", OrganizationComboData.selectCombo(this, vars.getRole()));
      xmlDocument.setParameter("isDatevImport", vars.getSessionValue("isDatevImport"));
    } catch (Exception ex) {
      ex.printStackTrace();
      throw new ServletException(ex);
    }} else try {
        WindowTabs tabs = new WindowTabs(this, vars, "org.openbravo.erpCommon.ad_forms.FileImportStd");
        //"org.openbravo.erpCommon.ad_forms.FileImport"
        xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
        xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
        xmlDocument.setParameter("childTabContainer", tabs.childTabs());
        NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "FileImport.html", classInfo.id, classInfo.type, strReplaceWith, tabs.breadcrumb());
        xmlDocument.setParameter("navigationBar", nav.toString());
        LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "FileImport.html", strReplaceWith);
        xmlDocument.setParameter("leftTabs", lBar.manualTemplate());

        xmlDocument.setData("reportAD_ORGID", "liststructure", OrganizationComboData.selectCombo(this, vars.getRole()));
        xmlDocument.setParameter("isDatevImport", vars.getSessionValue("isDatevImport"));
      } catch (Exception ex) {
        ex.printStackTrace();
        throw new ServletException(ex);
      }

    xmlDocument.setParameter("theme", vars.getTheme());
    {
      OBError myMessage = vars.getMessage("FileImport");
      vars.removeMessage("FileImport");
      if (myMessage != null) {
        xmlDocument.setParameter("messageType", myMessage.getType());
        xmlDocument.setParameter("messageTitle", myMessage.getTitle());
        xmlDocument.setParameter("messageMessage", myMessage.getMessage());
      }
    }

    if (log4j.isDebugEnabled())
      log4j.debug("3");

    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    //xmlDocument.setParameter("firstLineHeader", strFirstLineHeader);
    if (log4j.isDebugEnabled())
      log4j.debug("4");

    try {
      ComboTableData comboTableData = new ComboTableData(vars, this, "TABLEDIR", "AD_ImpFormat_ID", "", "", Utility.getContext(this, vars, "#AccessibleOrgTree", ""), Utility.getContext(this, vars, "#User_Client", ""), 0);
      Utility.fillSQLParameters(this, vars, null, comboTableData, "", "");
      xmlDocument.setData("reportImpFormat", "liststructure", comboTableData.select(false));
      comboTableData = null;
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
    String strJS = "\n top.frames['appFrame'].setProcessingMode('window', false); \n" + "top.frames['appFrame'].document.getElementById('buttonRefresh').onclick();\n";
    xmlDocument.setParameter("result", strJS);
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(xmlDocument.print());
    out.close();
  }

 
  
  public String getServletInfo() {
    return "Servlet that presents the files-importing process";
    // end of getServletInfo() method
  }
  
}
