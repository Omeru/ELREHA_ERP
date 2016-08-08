
package org.openbravo.erpWindows.org.openbravo.zsoft.smartui.CRMBusinessPartnerV;





import org.openbravo.erpCommon.utility.*;
import org.openbravo.data.FieldProvider;
import org.openbravo.utils.FormatUtilities;
import org.openbravo.utils.Replace;
import org.openbravo.base.secureApp.HttpSecureAppServlet;
import org.openbravo.base.secureApp.VariablesSecureApp;
import org.openbravo.base.exception.OBException;
import org.openbravo.scheduling.ProcessBundle;
import org.openbravo.scheduling.ProcessRunner;
import org.openbravo.erpCommon.businessUtility.WindowTabs;
import org.openbravo.xmlEngine.XmlDocument;
import java.util.Vector;
import java.util.StringTokenizer;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.sql.Connection;
import org.apache.log4j.Logger;
import org.apache.commons.fileupload.FileItem;
import org.openz.view.*;
import org.openz.model.*;
import org.openz.controller.callouts.CalloutStructure;
import org.openz.view.Formhelper;
import org.openz.view.Scripthelper;
import org.openz.view.templates.ConfigureButton;
import org.openz.view.templates.ConfigureInfobar;
import org.openz.view.templates.ConfigurePopup;
import org.openz.view.templates.ConfigureSelectBox;
import org.openz.view.templates.ConfigureFrameWindow;
import org.openz.util.LocalizationUtils;
import org.openz.util.UtilsData;
import org.openz.controller.businessprocess.DocActionWorkflowOptions;
import org.openbravo.data.Sqlc;

public class Header48F5831CC2A24D548535C7C31B499F92 extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  
  private static Logger log4j = Logger.getLogger(Header48F5831CC2A24D548535C7C31B499F92.class);
  
  private static final String windowId = "18F9A2B8EBB44B4C8A8E464E5A150AB2";
  private static final String tabId = "48F5831CC2A24D548535C7C31B499F92";
  private static final String defaultTabView = "RELATION";
  private static final int accesslevel = 3;
  private static final double SUBTABS_COL_SIZE = 15;

  public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
    TableSQLData tableSQL = null;
    VariablesSecureApp vars = new VariablesSecureApp(request);
    
    Boolean saveRequest = (Boolean) request.getAttribute("autosave");
    this.setWindowId(windowId);
    this.setTabId(tabId);
    if(saveRequest != null && saveRequest){
      String currentOrg = vars.getStringParameter("inpadOrgId");
      String currentClient = vars.getStringParameter("inpadClientId");
      boolean editableTab = (!org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)
                            && (currentOrg.equals("") || Utility.isElementInList(Utility.getContext(this, vars,"#User_Org", windowId, accesslevel), currentOrg)) 
                            && (currentClient.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),currentClient)));
    
        OBError myError = new OBError();
        String commandType = request.getParameter("inpCommandType");
        String strzssiCrmBpartnerVId = request.getParameter("inpzssiCrmBpartnerVId");
        
        if (editableTab) {
          int total = 0;
          
          if(commandType.equalsIgnoreCase("EDIT") && !strzssiCrmBpartnerVId.equals(""))
              total = saveRecord(vars, myError, 'U');
          else
              total = saveRecord(vars, myError, 'I');
          
          if (!myError.isEmpty() && total == 0)     
            throw new OBException(myError.getMessage());
        }
        vars.setSessionValue(request.getParameter("mappingName") +"|hash", vars.getPostDataHash());
        vars.setSessionValue(tabId + "|Header.view", "EDIT");
        
        return;
    }
    
    try {
      tableSQL = new TableSQLData(vars, this, tabId, Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel), Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    String strOrderBy = vars.getSessionValue(tabId + "|orderby");
    if (!strOrderBy.equals("")) {
      vars.setSessionValue(tabId + "|newOrder", "1");
    }

    if (vars.commandIn("DEFAULT")) {

      String strZssi_Crm_Bpartner_V_ID = vars.getGlobalVariable("inpzssiCrmBpartnerVId", windowId + "|Zssi_Crm_Bpartner_V_ID", "");
      

      String strView = vars.getSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view");
      if (strView.equals("")) {
        strView = defaultTabView;

        if (strView.equals("EDIT")) {
          if (strZssi_Crm_Bpartner_V_ID.equals("")) strZssi_Crm_Bpartner_V_ID = firstElement(vars, tableSQL);
          if (strZssi_Crm_Bpartner_V_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strZssi_Crm_Bpartner_V_ID, tableSQL);

      else printPageDataSheet(response, vars, strZssi_Crm_Bpartner_V_ID, tableSQL);
    } else if (vars.commandIn("DIRECT") || vars.commandIn("DIRECTRELATION")) {
      String strZssi_Crm_Bpartner_V_ID = vars.getStringParameter("inpDirectKey");
      
        
      if (strZssi_Crm_Bpartner_V_ID.equals("")) strZssi_Crm_Bpartner_V_ID = vars.getRequiredGlobalVariable("inpzssiCrmBpartnerVId", windowId + "|Zssi_Crm_Bpartner_V_ID");
      else vars.setSessionValue(windowId + "|Zssi_Crm_Bpartner_V_ID", strZssi_Crm_Bpartner_V_ID);
      
      if (vars.commandIn("DIRECT")){
        vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view", "EDIT");

        printPageEdit(response, request, vars, false, strZssi_Crm_Bpartner_V_ID, tableSQL);
      }
      if (vars.commandIn("DIRECTRELATION")){
        vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view", "RELATION");
        printPageDataSheet(response, vars, strZssi_Crm_Bpartner_V_ID, tableSQL);
      }

    } else if (vars.commandIn("TAB")) {


      String strView = vars.getSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view");
      String strZssi_Crm_Bpartner_V_ID = "";
      if (strView.equals("")) {
        strView = defaultTabView;
        if (strView.equals("EDIT")) {
          strZssi_Crm_Bpartner_V_ID = firstElement(vars, tableSQL);
          if (strZssi_Crm_Bpartner_V_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) {

        if (strZssi_Crm_Bpartner_V_ID.equals("")) strZssi_Crm_Bpartner_V_ID = firstElement(vars, tableSQL);
        printPageEdit(response, request, vars, false, strZssi_Crm_Bpartner_V_ID, tableSQL);

      } else printPageDataSheet(response, vars, "", tableSQL);
    } else if (vars.commandIn("SEARCH")) {
vars.getRequestGlobalVariable("inpParamName", tabId + "|paramName");

      
      
      vars.removeSessionValue(windowId + "|Zssi_Crm_Bpartner_V_ID");
      String strZssi_Crm_Bpartner_V_ID="";

      String strView = vars.getSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view");
      if (strView.equals("")) strView=defaultTabView;

      if (strView.equals("EDIT")) {
        strZssi_Crm_Bpartner_V_ID = firstElement(vars, tableSQL);
        if (strZssi_Crm_Bpartner_V_ID.equals("")) {
          // filter returns empty set
          strView = "RELATION";
          // switch to grid permanently until the user changes the view again
          vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view", strView);
        }
      }

      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strZssi_Crm_Bpartner_V_ID, tableSQL);

      else printPageDataSheet(response, vars, strZssi_Crm_Bpartner_V_ID, tableSQL);
    } else if (vars.commandIn("RELATION")) {
      

      String strZssi_Crm_Bpartner_V_ID = vars.getGlobalVariable("inpzssiCrmBpartnerVId", windowId + "|Zssi_Crm_Bpartner_V_ID", "");
      vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view", "RELATION");
      printPageDataSheet(response, vars, strZssi_Crm_Bpartner_V_ID, tableSQL);
    } else if (vars.commandIn("NEW")) {


      printPageEdit(response, request, vars, true, "", tableSQL);

    } else if (vars.commandIn("EDIT")) {

      @SuppressWarnings("unused") // In Expense Invoice tab this variable is not used, to be fixed
      String strZssi_Crm_Bpartner_V_ID = vars.getGlobalVariable("inpzssiCrmBpartnerVId", windowId + "|Zssi_Crm_Bpartner_V_ID", "");
      vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view", "EDIT");

      setHistoryCommand(request, "EDIT");
      printPageEdit(response, request, vars, false, strZssi_Crm_Bpartner_V_ID, tableSQL);

    } else if (vars.commandIn("NEXT")) {

      String strZssi_Crm_Bpartner_V_ID = vars.getRequiredStringParameter("inpzssiCrmBpartnerVId");
      
      String strNext = nextElement(vars, strZssi_Crm_Bpartner_V_ID, tableSQL);

      printPageEdit(response, request, vars, false, strNext, tableSQL);
    } else if (vars.commandIn("PREVIOUS")) {

      String strZssi_Crm_Bpartner_V_ID = vars.getRequiredStringParameter("inpzssiCrmBpartnerVId");
      
      String strPrevious = previousElement(vars, strZssi_Crm_Bpartner_V_ID, tableSQL);

      printPageEdit(response, request, vars, false, strPrevious, tableSQL);
    } else if (vars.commandIn("FIRST_RELATION")) {

      vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.initRecordNumber", "0");
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("PREVIOUS_RELATION")) {

      String strInitRecord = vars.getSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      if (strInitRecord.equals("") || strInitRecord.equals("0")) {
        vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.initRecordNumber", "0");
      } else {
        int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
        initRecord -= intRecordRange;
        strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
        vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.initRecordNumber", strInitRecord);
      }
      vars.removeSessionValue(windowId + "|Zssi_Crm_Bpartner_V_ID");

      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("NEXT_RELATION")) {

      String strInitRecord = vars.getSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
      if (initRecord==0) initRecord=1;
      initRecord += intRecordRange;
      strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
      vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.initRecordNumber", strInitRecord);
      vars.removeSessionValue(windowId + "|Zssi_Crm_Bpartner_V_ID");

      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("FIRST")) {

      
      String strFirst = firstElement(vars, tableSQL);

      printPageEdit(response, request, vars, false, strFirst, tableSQL);
    } else if (vars.commandIn("LAST_RELATION")) {

      String strLast = lastElement(vars, tableSQL);
      printPageDataSheet(response, vars, strLast, tableSQL);
    } else if (vars.commandIn("LAST")) {

      
      String strLast = lastElement(vars, tableSQL);

      printPageEdit(response, request, vars, false, strLast, tableSQL);
    } else if (vars.commandIn("SAVE_NEW_RELATION", "SAVE_NEW_NEW", "SAVE_NEW_EDIT")) {

      OBError myError = new OBError();      
      int total = saveRecord(vars, myError, 'I');      
      if (!myError.isEmpty()) {        
        response.sendRedirect(strDireccion + request.getServletPath() + "?Command=NEW");
      } 
      else {
		if (myError.isEmpty()) {
		  myError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=RowsInserted");
		  myError.setMessage(total + " " + myError.getMessage());
		  vars.setMessage(tabId, myError);
		}        
        if (vars.commandIn("SAVE_NEW_NEW")) response.sendRedirect(strDireccion + request.getServletPath() + "?Command=NEW");
        else if (vars.commandIn("SAVE_NEW_EDIT")) response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        else response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
      }
    } else if (vars.commandIn("SAVE_EDIT_RELATION", "SAVE_EDIT_NEW", "SAVE_EDIT_EDIT", "SAVE_EDIT_NEXT")) {

      String strZssi_Crm_Bpartner_V_ID = vars.getRequiredGlobalVariable("inpzssiCrmBpartnerVId", windowId + "|Zssi_Crm_Bpartner_V_ID");
      OBError myError = new OBError();
      int total = saveRecord(vars, myError, 'U');      
      if (!myError.isEmpty()) {
        response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
      } 
      else {
        if (myError.isEmpty()) {
          myError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=RowsUpdated");
          myError.setMessage(total + " " + myError.getMessage());
          vars.setMessage(tabId, myError);
        }
        if (vars.commandIn("SAVE_EDIT_NEW")) response.sendRedirect(strDireccion + request.getServletPath() + "?Command=NEW");
        else if (vars.commandIn("SAVE_EDIT_EDIT")) response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        else if (vars.commandIn("SAVE_EDIT_NEXT")) {
          String strNext = nextElement(vars, strZssi_Crm_Bpartner_V_ID, tableSQL);
          vars.setSessionValue(windowId + "|Zssi_Crm_Bpartner_V_ID", strNext);
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        } else response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
      }
/*    } else if (vars.commandIn("DELETE_RELATION")) {

      String strZssi_Crm_Bpartner_V_ID = vars.getRequiredInStringParameter("inpzssiCrmBpartnerVId");
      String message = deleteRelation(vars, strZssi_Crm_Bpartner_V_ID);
      if (!message.equals("")) {
        bdError(request, response, message, vars.getLanguage());
      } else {
        vars.removeSessionValue(windowId + "|zssiCrmBpartnerVId");
        vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view", "RELATION");
        response.sendRedirect(strDireccion + request.getServletPath());
      }*/
    } else if (vars.commandIn("DELETE")) {

      String strZssi_Crm_Bpartner_V_ID = vars.getRequiredStringParameter("inpzssiCrmBpartnerVId");
      //Header48F5831CC2A24D548535C7C31B499F92Data data = getEditVariables(vars);
      int total = 0;
      OBError myError = null;
      if (org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) {
        myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
        vars.setMessage(tabId, myError);
      } else {
        try {
          total = Header48F5831CC2A24D548535C7C31B499F92Data.delete(this, strZssi_Crm_Bpartner_V_ID, Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), Utility.getContext(this, vars, "#User_Org", windowId, accesslevel));
        } catch(ServletException ex) {
          myError = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          if (!myError.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myError);
        }
        if (myError==null && total==0) {
          myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
        }
        vars.removeSessionValue(windowId + "|zssiCrmBpartnerVId");
        vars.setSessionValue(tabId + "|Header48F5831CC2A24D548535C7C31B499F92.view", "RELATION");
      }
      if (myError==null) {
        myError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=RowsDeleted");
        myError.setMessage(total + " " + myError.getMessage());
        vars.setMessage(tabId, myError);
      }
      response.sendRedirect(strDireccion + request.getServletPath());








    } else if (vars.getCommand().toUpperCase().startsWith("BUTTON") || vars.getCommand().toUpperCase().startsWith("SAVE_BUTTON")) {
      pageErrorPopUp(response);
    } else pageError(response);
  }
/*
  String deleteRelation(VariablesSecureApp vars, String strZssi_Crm_Bpartner_V_ID) throws IOException, ServletException {
    log4j.debug("Deleting records");
    Connection conn = this.getTransactionConnection();
    try {
      if (strZssi_Crm_Bpartner_V_ID.startsWith("(")) strZssi_Crm_Bpartner_V_ID = strZssi_Crm_Bpartner_V_ID.substring(1, strZssi_Crm_Bpartner_V_ID.length()-1);
      if (!strZssi_Crm_Bpartner_V_ID.equals("")) {
        strZssi_Crm_Bpartner_V_ID = Replace.replace(strZssi_Crm_Bpartner_V_ID, "'", "");
        StringTokenizer st = new StringTokenizer(strZssi_Crm_Bpartner_V_ID, ",", false);
        while (st.hasMoreTokens()) {
          String strKey = st.nextToken();
          if (Header48F5831CC2A24D548535C7C31B499F92Data.deleteTransactional(conn, this, strKey)==0) {
            releaseRollbackConnection(conn);
            log4j.warn("deleteRelation - key :" + strKey + " - 0 records deleted");
          }
        }
      }
      releaseCommitConnection(conn);
    } catch (ServletException e) {
      releaseRollbackConnection(conn);
      e.printStackTrace();
      log4j.error("Rollback in transaction");
      return "ProcessRunError";
    }
    return "";
  }
*/
  private Header48F5831CC2A24D548535C7C31B499F92Data getEditVariables(Connection con, VariablesSecureApp vars) throws IOException,ServletException {
    Header48F5831CC2A24D548535C7C31B499F92Data data = new Header48F5831CC2A24D548535C7C31B499F92Data();
    ServletException ex = null;
    try {
    data.adOrgId = vars.getRequestGlobalVariable("inpadOrgId", windowId + "|AD_Org_ID");     data.adOrgIdr = vars.getStringParameter("inpadOrgId_R");     data.cBpartnerId = vars.getStringParameter("inpcBpartnerId");     data.cBpartnerIdr = vars.getStringParameter("inpcBpartnerId_R");     data.value = vars.getStringParameter("inpvalue");     data.name = vars.getStringParameter("inpname");     data.name2 = vars.getStringParameter("inpname2");     data.url = vars.getStringParameter("inpurl");     data.cBpGroupId = vars.getStringParameter("inpcBpGroupId");     data.cBpGroupIdr = vars.getStringParameter("inpcBpGroupId_R");     data.cBpartnerLocationId = vars.getStringParameter("inpcBpartnerLocationId");     data.cBpartnerLocationIdr = vars.getStringParameter("inpcBpartnerLocationId_R");     data.address1 = vars.getStringParameter("inpaddress1");     data.address2 = vars.getStringParameter("inpaddress2");     data.postal = vars.getStringParameter("inppostal");     data.city = vars.getStringParameter("inpcity");     data.cCountryId = vars.getStringParameter("inpcCountryId");     data.cCountryIdr = vars.getStringParameter("inpcCountryId_R");     data.adUserId = vars.getStringParameter("inpadUserId");     data.adUserIdr = vars.getStringParameter("inpadUserId_R");     data.cGreetingId = vars.getStringParameter("inpcGreetingId");     data.cGreetingIdr = vars.getStringParameter("inpcGreetingId_R");     data.firstname = vars.getStringParameter("inpfirstname");     data.lastname = vars.getStringParameter("inplastname");     data.email = vars.getStringParameter("inpemail");     data.phone = vars.getStringParameter("inpphone");     data.fax = vars.getStringParameter("inpfax");     data.birthday = vars.getStringParameter("inpbirthday");     data.description = vars.getStringParameter("inpdescription");     data.comments = vars.getStringParameter("inpcomments");     data.interests = vars.getStringParameter("inpinterests");     data.iscustomer = vars.getStringParameter("inpiscustomer", "N");     data.isvendor = vars.getStringParameter("inpisvendor", "N");     data.isactive = vars.getStringParameter("inpisactive", "N");     data.adClientId = vars.getRequestGlobalVariable("inpadClientId", windowId + "|AD_Client_ID");     data.zssiCrmBpartnerVId = vars.getRequestGlobalVariable("inpzssiCrmBpartnerVId", windowId + "|Zssi_Crm_Bpartner_V_ID"); 
      data.createdby = vars.getUser();
      data.updatedby = vars.getUser();
      data.adUserClient = Utility.getContext(this, vars, "#User_Client", windowId, accesslevel);
      data.adOrgClient = Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel);
      data.updatedTimeStamp = vars.getStringParameter("updatedTimestamp");



    
    

    
    }
    catch(ServletException e) {
    	vars.setEditionData(tabId, data);
    	throw e;
    }
    // Behavior with exception for numeric fields is to catch last one if we have multiple ones
    if(ex != null) {
      vars.setEditionData(tabId, data);
      throw ex;
    }
    return data;
  }

   private Header48F5831CC2A24D548535C7C31B499F92Data[] getRelationData(Header48F5831CC2A24D548535C7C31B499F92Data[] data) {
    if (data!=null) {
      for (int i=0;i<data.length;i++) {        data[i].adOrgId = FormatUtilities.truncate(data[i].adOrgId, 32);        data[i].cBpartnerId = FormatUtilities.truncate(data[i].cBpartnerId, 32);        data[i].value = FormatUtilities.truncate(data[i].value, 20);        data[i].name = FormatUtilities.truncate(data[i].name, 50);        data[i].name2 = FormatUtilities.truncate(data[i].name2, 50);        data[i].url = FormatUtilities.truncate(data[i].url, 50);        data[i].cBpGroupId = FormatUtilities.truncate(data[i].cBpGroupId, 32);        data[i].cBpartnerLocationId = FormatUtilities.truncate(data[i].cBpartnerLocationId, 32);        data[i].address1 = FormatUtilities.truncate(data[i].address1, 50);        data[i].address2 = FormatUtilities.truncate(data[i].address2, 50);        data[i].postal = FormatUtilities.truncate(data[i].postal, 10);        data[i].city = FormatUtilities.truncate(data[i].city, 50);        data[i].cCountryId = FormatUtilities.truncate(data[i].cCountryId, 32);        data[i].adUserId = FormatUtilities.truncate(data[i].adUserId, 32);        data[i].cGreetingId = FormatUtilities.truncate(data[i].cGreetingId, 32);        data[i].firstname = FormatUtilities.truncate(data[i].firstname, 50);        data[i].lastname = FormatUtilities.truncate(data[i].lastname, 50);        data[i].email = FormatUtilities.truncate(data[i].email, 50);        data[i].phone = FormatUtilities.truncate(data[i].phone, 40);        data[i].fax = FormatUtilities.truncate(data[i].fax, 40);        data[i].description = FormatUtilities.truncate(data[i].description, 50);        data[i].comments = FormatUtilities.truncate(data[i].comments, 50);        data[i].interests = FormatUtilities.truncate(data[i].interests, 50);        data[i].adClientId = FormatUtilities.truncate(data[i].adClientId, 32);        data[i].zssiCrmBpartnerVId = FormatUtilities.truncate(data[i].zssiCrmBpartnerVId, 32);}
    }
    return data;
  }



    private void refreshSessionEdit(VariablesSecureApp vars, FieldProvider[] data) {
      if (data==null || data.length==0) return;
          vars.setSessionValue(windowId + "|AD_Org_ID", data[0].getField("adOrgId"));    vars.setSessionValue(windowId + "|Zssi_Crm_Bpartner_V_ID", data[0].getField("zssiCrmBpartnerVId"));    vars.setSessionValue(windowId + "|AD_Client_ID", data[0].getField("adClientId"));
    }

    private void refreshSessionNew(VariablesSecureApp vars) throws IOException,ServletException {
      Header48F5831CC2A24D548535C7C31B499F92Data[] data = Header48F5831CC2A24D548535C7C31B499F92Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), vars.getStringParameter("inpzssiCrmBpartnerVId", ""), Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
      if (data==null || data.length==0) return;
      refreshSessionEdit(vars, data);
    }

  private String nextElement(VariablesSecureApp vars, String strSelected, TableSQLData tableSQL) throws IOException, ServletException {
    if (strSelected == null || strSelected.equals("")) return firstElement(vars, tableSQL);
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(), 0, 0);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.NEXT, strSelected, tableSQL.getKeyColumn());
      } catch (Exception e) { 
        log4j.error("Error getting next element", e);
      }
      if (data!=null) {
        if (data!=null) return data;
      }
    }
    return strSelected;
  }

  private int getKeyPosition(VariablesSecureApp vars, String strSelected, TableSQLData tableSQL) throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("getKeyPosition: " + strSelected);
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(),0,0);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.GETPOSITION, strSelected, tableSQL.getKeyColumn());
      } catch (Exception e) { 
        log4j.error("Error getting key position", e);
      }
      if (data!=null) {
        // split offset -> (page,relativeOffset)
        int absoluteOffset = Integer.valueOf(data);
        int page = absoluteOffset / TableSQLData.maxRowsPerGridPage;
        int relativeOffset = absoluteOffset % TableSQLData.maxRowsPerGridPage;
        log4j.debug("getKeyPosition: absOffset: " + absoluteOffset + "=> page: " + page + " relOffset: " + relativeOffset);
        String currPageKey = tabId + "|" + "currentPage";
        vars.setSessionValue(currPageKey, String.valueOf(page));
        return relativeOffset;
      }
    }
    return 0;
  }

  private String previousElement(VariablesSecureApp vars, String strSelected, TableSQLData tableSQL) throws IOException, ServletException {
    if (strSelected == null || strSelected.equals("")) return firstElement(vars, tableSQL);
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(),0,0);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.PREVIOUS, strSelected, tableSQL.getKeyColumn());
      } catch (Exception e) { 
        log4j.error("Error getting previous element", e);
      }
      if (data!=null) {
        return data;
      }
    }
    return strSelected;
  }

  private String firstElement(VariablesSecureApp vars, TableSQLData tableSQL) throws IOException, ServletException {
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(),0,1);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.FIRST, "", tableSQL.getKeyColumn());

      } catch (Exception e) { 
        log4j.debug("Error getting first element", e);
      }
      if (data!=null) return data;
    }
    return "";
  }

  private String lastElement(VariablesSecureApp vars, TableSQLData tableSQL) throws IOException, ServletException {
    if (tableSQL!=null) {
      String data = null;
      try{
        String strSQL = ModelSQLGeneration.generateSQLonlyId(this, vars, tableSQL, (tableSQL.getTableName() + "." + tableSQL.getKeyColumn() + " AS ID"), new Vector<String>(), new Vector<String>(),0,0);
        ExecuteQuery execquery = new ExecuteQuery(this, strSQL, tableSQL.getParameterValuesOnlyId());
        data = execquery.selectAndSearch(ExecuteQuery.SearchType.LAST, "", tableSQL.getKeyColumn());
      } catch (Exception e) { 
        log4j.error("Error getting last element", e);
      }
      if (data!=null) return data;
    }
    return "";
  }

  private void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, String strZssi_Crm_Bpartner_V_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: dataSheet");

    String strParamName = vars.getSessionValue(tabId + "|paramName");

    
    boolean hasSearchCondition=false;
    vars.removeEditionData(tabId);
    if (!(strParamName.equals(""))) hasSearchCondition=true;
    String strOffset = "0";
    //vars.getSessionValue(tabId + "|offset");
    String selectedRow = "0";
    if (!strZssi_Crm_Bpartner_V_ID.equals("")) {
      selectedRow = Integer.toString(getKeyPosition(vars, strZssi_Crm_Bpartner_V_ID, tableSQL));
    }

    String[] discard={"isNotFiltered","isNotTest"};
    if (hasSearchCondition) discard[0] = new String("isFiltered");
    if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpWindows/org/openbravo/zsoft/smartui/CRMBusinessPartnerV/Header48F5831CC2A24D548535C7C31B499F92_Relation", discard).createXmlDocument();

    ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "Header48F5831CC2A24D548535C7C31B499F92", false, "document.frmMain.inpzssiCrmBpartnerVId", "grid", "..", "".equals("Y"), "CRMBusinessPartnerV", strReplaceWith, false);
    toolbar.prepareRelationTemplate("N".equals("Y"), hasSearchCondition, !vars.getSessionValue("#ShowTest", "N").equals("Y"), true, Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    xmlDocument.setParameter("toolbar", toolbar.toString());



    StringBuffer orderByArray = new StringBuffer();
      vars.setSessionValue(tabId + "|newOrder", "1");
      String positions = vars.getSessionValue(tabId + "|orderbyPositions");
      orderByArray.append("var orderByPositions = new Array(\n");
      if (!positions.equals("")) {
        StringTokenizer tokens=new StringTokenizer(positions, ",");
        boolean firstOrder = true;
        while(tokens.hasMoreTokens()){
          if (!firstOrder) orderByArray.append(",\n");
          orderByArray.append("\"").append(tokens.nextToken()).append("\"");
          firstOrder = false;
        }
      }
      orderByArray.append(");\n");
      String directions = vars.getSessionValue(tabId + "|orderbyDirections");
      orderByArray.append("var orderByDirections = new Array(\n");
      if (!positions.equals("")) {
        StringTokenizer tokens=new StringTokenizer(directions, ",");
        boolean firstOrder = true;
        while(tokens.hasMoreTokens()){
          if (!firstOrder) orderByArray.append(",\n");
          orderByArray.append("\"").append(tokens.nextToken()).append("\"");
          firstOrder = false;
        }
      }
      orderByArray.append(");\n");
//    }

    xmlDocument.setParameter("selectedColumn", "\nvar selectedRow = " + selectedRow + ";\n" + orderByArray.toString());
    xmlDocument.setParameter("directory", "var baseDirectory = \"" + strReplaceWith + "/\";\n");
    xmlDocument.setParameter("windowId", windowId);
    xmlDocument.setParameter("KeyName", "zssiCrmBpartnerVId");
    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("theme", vars.getTheme());
    //xmlDocument.setParameter("buttonReference", Utility.messageBD(this, "Reference", vars.getLanguage()));
    try {
      WindowTabs tabs = new WindowTabs(this, vars, tabId, windowId, false);
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "Header48F5831CC2A24D548535C7C31B499F92_Relation.html", "CRMBusinessPartnerV", "W", strReplaceWith, tabs.breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "Header48F5831CC2A24D548535C7C31B499F92_Relation.html", strReplaceWith);
      xmlDocument.setParameter("leftTabs", lBar.relationTemplate());
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
    {
      OBError myMessage = vars.getMessage(tabId);
      vars.removeMessage(tabId);
      if (myMessage!=null) {
        xmlDocument.setParameter("messageType", myMessage.getType());
        xmlDocument.setParameter("messageTitle", myMessage.getTitle());
        xmlDocument.setParameter("messageMessage", myMessage.getMessage());
      }
    }


    xmlDocument.setParameter("grid", Utility.getContext(this, vars, "#RecordRange", windowId));
xmlDocument.setParameter("grid_Offset", strOffset);
xmlDocument.setParameter("grid_SortCols", positions);
xmlDocument.setParameter("grid_SortDirs", directions);
xmlDocument.setParameter("grid_Default", selectedRow);


    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(xmlDocument.print());
    out.close();
  }

  private void printPageEdit(HttpServletResponse response, HttpServletRequest request, VariablesSecureApp vars,boolean boolNew, String strZssi_Crm_Bpartner_V_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: edit");
    
    HashMap<String, String> usedButtonShortCuts;
  
    usedButtonShortCuts = new HashMap<String, String>();
    
    
    
    String strOrderByFilter = vars.getSessionValue(tabId + "|orderby");
    String orderClause = " zssi_crm_bpartner_v.Value";
    if (strOrderByFilter==null || strOrderByFilter.equals("")) strOrderByFilter = orderClause;
    /*{
      if (!strOrderByFilter.equals("") && !orderClause.equals("")) strOrderByFilter += ", ";
      strOrderByFilter += orderClause;
    }*/
    
    
    String strCommand = null;
    Header48F5831CC2A24D548535C7C31B499F92Data[] data=null;
    XmlDocument xmlDocument=null;
    FieldProvider dataField = vars.getEditionData(tabId);
    vars.removeEditionData(tabId);
    String strParamName = vars.getSessionValue(tabId + "|paramName");

    boolean hasSearchCondition=false;
    if (!(strParamName.equals(""))) hasSearchCondition=true;

       String strParamSessionDate = vars.getGlobalVariable("inpParamSessionDate", Utility.getTransactionalDate(this, vars, windowId), "");
      String buscador = "";
      String[] discard = {"", "isNotTest"};
      
      if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    if (dataField==null) {
      if (!boolNew) {
        discard[0] = new String("newDiscard");
        data = Header48F5831CC2A24D548535C7C31B499F92Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strZssi_Crm_Bpartner_V_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
  
        if (!strZssi_Crm_Bpartner_V_ID.equals("") && (data == null || data.length==0)) {
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
          return;
        }
        refreshSessionEdit(vars, data);
        strCommand = "EDIT";
      }

      if (data==null || data.length==0) {
        strZssi_Crm_Bpartner_V_ID = firstElement(vars, tableSQL);
        if (strZssi_Crm_Bpartner_V_ID.equals("")) {
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
          return;
        } else {
          data = Header48F5831CC2A24D548535C7C31B499F92Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strZssi_Crm_Bpartner_V_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
        }
      }

      if (boolNew || data==null || data.length==0) {
        discard[0] = new String ("editDiscard");
        strCommand = "NEW";
        data = new Header48F5831CC2A24D548535C7C31B499F92Data[0];
      } else {
        discard[0] = new String ("newDiscard");
      }
    } else {
      if (dataField.getField("zssiCrmBpartnerVId") == null || dataField.getField("zssiCrmBpartnerVId").equals("")) {
        discard[0] = new String ("editDiscard");
        strCommand = "NEW";
        boolNew = true;
      } else {
        discard[0] = new String ("newDiscard");
        strCommand = "EDIT";
      }
    }
    
    
    
    if (dataField==null) {
      if (boolNew || data==null || data.length==0) {
        refreshSessionNew(vars);
        data = Header48F5831CC2A24D548535C7C31B499F92Data.set(Utility.getDefault(this, vars, "Firstname", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Url", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Fax", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "C_Bpartner_ID", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Header48F5831CC2A24D548535C7C31B499F92Data.selectDef3F0571221AF3459886D095523394B2EB_0(this, Utility.getDefault(this, vars, "C_Bpartner_ID", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField)), Utility.getDefault(this, vars, "City", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Interests", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Iscustomer", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "N", dataField), Utility.getDefault(this, vars, "Postal", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Lastname", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "AD_User_ID", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Createdby", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Header48F5831CC2A24D548535C7C31B499F92Data.selectDef6A1F15EE209248E4BB17A475459D8B9F_1(this, Utility.getDefault(this, vars, "Createdby", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField)), Utility.getDefault(this, vars, "Comments", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Birthday", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Address1", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "AD_Org_ID", "@AD_ORG_ID@", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Email", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Name", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Phone", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Value", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Description", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Isvendor", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "N", dataField), Utility.getDefault(this, vars, "C_Bpartner_Location_ID", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Header48F5831CC2A24D548535C7C31B499F92Data.selectDef1028B6FF6E2F48F9924C3664CF65AEDE_2(this, Utility.getDefault(this, vars, "C_Bpartner_Location_ID", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField)), "", Utility.getDefault(this, vars, "Updatedby", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Header48F5831CC2A24D548535C7C31B499F92Data.selectDefADEBD01B98BC4CAE906F348029B46331_3(this, Utility.getDefault(this, vars, "Updatedby", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField)), Utility.getDefault(this, vars, "AD_Client_ID", "@AD_CLIENT_ID@", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "C_Greeting_ID", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "C_Bp_Group_ID", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Name2", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "Address2", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), Utility.getDefault(this, vars, "C_Country_ID", "", "18F9A2B8EBB44B4C8A8E464E5A150AB2", "48F5831CC2A24D548535C7C31B499F92", "", dataField), "Y");
        
      }
    } else {
      data = new Header48F5831CC2A24D548535C7C31B499F92Data[1];
      java.lang.Object  ref1= dataField;
      data[0]=(Header48F5831CC2A24D548535C7C31B499F92Data) ref1;
      data[0].created="";
      data[0].updated="";
    }
      
    
    String currentOrg = (boolNew?"":(dataField!=null?dataField.getField("adOrgId"):data[0].getField("adOrgId")));
    if (!currentOrg.equals("") && !currentOrg.startsWith("'")) currentOrg = "'"+currentOrg+"'";
    String currentClient = (boolNew?"":(dataField!=null?dataField.getField("adClientId"):data[0].getField("adClientId")));
    if (!currentClient.equals("") && !currentClient.startsWith("'")) currentClient = "'"+currentClient+"'";
    
    boolean editableTab = (!org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId) && (currentOrg.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),currentOrg)) && (currentClient.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), currentClient)));
    if (Formhelper.isTabReadOnly(this, vars, tabId))
      editableTab=false;
    
    ToolBar toolbar = new ToolBar(this, editableTab, vars.getLanguage(), "Header48F5831CC2A24D548535C7C31B499F92", (strCommand.equals("NEW") || boolNew || (dataField==null && (data==null || data.length==0))), "document.frmMain.inpzssiCrmBpartnerVId", "", "..", "".equals("Y"), "CRMBusinessPartnerV", strReplaceWith, true, false, false, Utility.hasTabAttachments(this, vars, tabId, strZssi_Crm_Bpartner_V_ID));
    toolbar.prepareEditionTemplate("N".equals("Y"), hasSearchCondition, vars.getSessionValue("#ShowTest", "N").equals("Y"), "RO", Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    
  // set updated timestamp to manage locking mechanism
    String updatedTimestamp="";
    if (!boolNew) {
      updatedTimestamp=(dataField != null ? dataField.getField("updatedTimeStamp") : data[0].getField("updatedTimeStamp"));
    }
    this.setUpdatedtimestamp(updatedTimestamp);
   // this.setOrgparent(currentPOrg);
    this.setCommandtype(strCommand);
    try {
      WindowTabs tabs = new WindowTabs(this, vars, tabId, windowId, true, (strCommand.equalsIgnoreCase("NEW")));
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter output = response.getWriter();
      
      Connection conn = null;
      Scripthelper script = new Scripthelper();
      if (boolNew) 
        script.addHiddenfieldWithID("newdatasetindicator", "NEW");
      else
        script.addHiddenfieldWithID("newdatasetindicator", "");
      script.addHiddenfieldWithID("enabledautosave", "Y");
      script.addMessage(this, vars, vars.getMessage(tabId));
      Formhelper fh=new Formhelper();
      String strLeftabsmode="EDIT";
      String focus=fh.TabGetFirstFocusField(this,tabId);
      String strSkeleton = ConfigureFrameWindow.doConfigureWindowMode(this,vars,Sqlc.TransformaNombreColumna(focus),tabs.breadcrumb(), "Form Window",null,strLeftabsmode,tabs,"_Relation",toolbar.toString());
      String strTableStructure="";
      if (editableTab||tabId.equalsIgnoreCase("800026"))
        strTableStructure=fh.prepareTabFields(this, vars, script, tabId,data[0], Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
      else
        strTableStructure=fh.prepareTabFieldsRO(this, vars, script, tabId,data[0], Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
      strSkeleton=Replace.replace(strSkeleton, "@CONTENT@", strTableStructure );  
      script.addOnload("setProcessingMode('window', false);");
      strSkeleton = script.doScript(strSkeleton, "",this,vars);
      output.println(strSkeleton);
      vars.removeMessage(tabId);
      output.close();
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
  }

  void printPageButtonFS(HttpServletResponse response, VariablesSecureApp vars, String strProcessId, String path) throws IOException, ServletException {
    log4j.debug("Output: Frames action button");
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate(
        "org/openbravo/erpCommon/ad_actionButton/ActionButtonDefaultFrames").createXmlDocument();
    xmlDocument.setParameter("processId", strProcessId);
    xmlDocument.setParameter("trlFormType", "PROCESS");
    xmlDocument.setParameter("language", "defaultLang = \"" + vars.getLanguage() + "\";\n");
    xmlDocument.setParameter("type", strDireccion + path);
    out.println(xmlDocument.print());
    out.close();
  }
  






    private String getDisplayLogicContext(VariablesSecureApp vars, boolean isNew) throws IOException, ServletException {
      log4j.debug("Output: Display logic context fields");
      String result = "var strShowAudit=\"" +(isNew?"N":Utility.getContext(this, vars, "ShowAudit", windowId)) + "\";\n";
      return result;
    }


    private String getReadOnlyLogicContext(VariablesSecureApp vars) throws IOException, ServletException {
      log4j.debug("Output: Read Only logic context fields");
      String result = "";
      return result;
    }




 
  private String getShortcutScript( HashMap<String, String> usedButtonShortCuts){
    StringBuffer shortcuts = new StringBuffer();
    shortcuts.append(" function buttonListShorcuts() {\n");
    Iterator<String> ik = usedButtonShortCuts.keySet().iterator();
    Iterator<String> iv = usedButtonShortCuts.values().iterator();
    while(ik.hasNext() && iv.hasNext()){
      shortcuts.append("  keyArray[keyArray.length] = new keyArrayItem(\"").append(ik.next()).append("\", \"").append(iv.next()).append("\", null, \"altKey\", false, \"onkeydown\");\n");
    }
    shortcuts.append(" return true;\n}");
    return shortcuts.toString();
  }
  
  private int saveRecord(VariablesSecureApp vars, OBError myError, char type) throws IOException, ServletException {
    Header48F5831CC2A24D548535C7C31B499F92Data data = null;
    int total = 0;
    if (org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) {
        OBError newError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
        myError.setError(newError);
        vars.setMessage(tabId, myError);
    }
    else {
        Connection con = null;
        try {
            con = this.getTransactionConnection();
            data = getEditVariables(con, vars);
            data.dateTimeFormat = vars.getSessionValue("#AD_SqlDateTimeFormat");            
            String strSequence = "";
            if(type == 'I') {                
        strSequence = SequenceIdData.getUUID();
                if(log4j.isDebugEnabled()) log4j.debug("Sequence: " + strSequence);
                data.zssiCrmBpartnerVId = strSequence;  
            }
            if (Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),data.adClientId)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),data.adOrgId)){
		     if(type == 'I') {
		       total = data.insert(con, this);
		     } else {
		       //Check the version of the record we are saving is the one in DB
		       if (Header48F5831CC2A24D548535C7C31B499F92Data.getCurrentDBTimestamp(this, data.zssiCrmBpartnerVId).equals(
                vars.getStringParameter("updatedTimestamp"))) {
                total = data.update(con, this);
               } else {
                 myError.setMessage(Replace.replace(Replace.replace(Utility.messageBD(this,
                    "SavingModifiedRecord", vars.getLanguage()), "\\n", "<br/>"), "&quot;", "\""));
                 myError.setType("Error");
                 vars.setSessionValue(tabId + "|concurrentSave", "true");
               } 
		     }		            
          
            }
                else {
            OBError newError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
            myError.setError(newError);            
          }
          releaseCommitConnection(con);
          CrudOperations.UpdateCustomFields(tabId, data.zssiCrmBpartnerVId, vars, this);
        } catch(Exception ex) {
            OBError newError = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
            myError.setError(newError);   
            try {
              releaseRollbackConnection(con);
            } catch (final Exception e) { //do nothing 
            }           
        }
            
        if (myError.isEmpty() && total == 0) {
            OBError newError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=DBExecuteError");
            myError.setError(newError);
        }
        vars.setMessage(tabId, myError);
            
        if(!myError.isEmpty()){
            if(data != null ) {
                if(type == 'I') {            			
                    data.zssiCrmBpartnerVId = "";
                }
                else {                    
                    
                }
                vars.setEditionData(tabId, data);
            }            	
        }
        else {
            vars.setSessionValue(windowId + "|Zssi_Crm_Bpartner_V_ID", data.zssiCrmBpartnerVId);
        }
    }
    return total;
  }

  public String getServletInfo() {
    return "Servlet Header48F5831CC2A24D548535C7C31B499F92. This Servlet was made by Wad constructor";
  } // End of getServletInfo() method
}
