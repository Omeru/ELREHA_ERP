
package org.openbravo.erpWindows.org.zsoft.serial.BatchNumberTracking;





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

public class BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  
  private static Logger log4j = Logger.getLogger(BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.class);
  
  private static final String windowId = "18C5A42061B9456085182F129F3F1832";
  private static final String tabId = "CC0B9B01312F499C9849B6842923DCCB";
  private static final String defaultTabView = "RELATION";
  private static final int accesslevel = 1;
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
        String strsnrBatchlocatorId = request.getParameter("inpsnrBatchlocatorId");
         String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");
        if (editableTab) {
          int total = 0;
          
          if(commandType.equalsIgnoreCase("EDIT") && !strsnrBatchlocatorId.equals(""))
              total = saveRecord(vars, myError, 'U', strPSNR_Batchmasterdata_ID);
          else
              total = saveRecord(vars, myError, 'I', strPSNR_Batchmasterdata_ID);
          
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
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID", "");

      String strSNR_Batchlocator_ID = vars.getGlobalVariable("inpsnrBatchlocatorId", windowId + "|SNR_Batchlocator_ID", "");
            if (strPSNR_Batchmasterdata_ID.equals("")) {
        strPSNR_Batchmasterdata_ID = getParentID(vars, strSNR_Batchlocator_ID);
        if (strPSNR_Batchmasterdata_ID.equals("")) throw new ServletException("Required parameter :" + windowId + "|SNR_Batchmasterdata_ID");
        vars.setSessionValue(windowId + "|SNR_Batchmasterdata_ID", strPSNR_Batchmasterdata_ID);

        refreshParentSession(vars, strPSNR_Batchmasterdata_ID);
      }


      String strView = vars.getSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view");
      if (strView.equals("")) {
        strView = defaultTabView;

        if (strView.equals("EDIT")) {
          if (strSNR_Batchlocator_ID.equals("")) strSNR_Batchlocator_ID = firstElement(vars, tableSQL);
          if (strSNR_Batchlocator_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strSNR_Batchlocator_ID, strPSNR_Batchmasterdata_ID, tableSQL);

      else printPageDataSheet(response, vars, strPSNR_Batchmasterdata_ID, strSNR_Batchlocator_ID, tableSQL);
    } else if (vars.commandIn("DIRECT") || vars.commandIn("DIRECTRELATION")) {
      String strSNR_Batchlocator_ID = vars.getStringParameter("inpDirectKey");
      
        
      if (strSNR_Batchlocator_ID.equals("")) strSNR_Batchlocator_ID = vars.getRequiredGlobalVariable("inpsnrBatchlocatorId", windowId + "|SNR_Batchlocator_ID");
      else vars.setSessionValue(windowId + "|SNR_Batchlocator_ID", strSNR_Batchlocator_ID);
      
      
      String strPSNR_Batchmasterdata_ID = getParentID(vars, strSNR_Batchlocator_ID);
      
      vars.setSessionValue(windowId + "|SNR_Batchmasterdata_ID", strPSNR_Batchmasterdata_ID);
      vars.setSessionValue("413FA06268994B24A5D9910C7F1EA938|Batch Numbers.view", "EDIT");

      refreshParentSession(vars, strPSNR_Batchmasterdata_ID);

      if (vars.commandIn("DIRECT")){
        vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view", "EDIT");

        printPageEdit(response, request, vars, false, strSNR_Batchlocator_ID, strPSNR_Batchmasterdata_ID, tableSQL);
      }
      if (vars.commandIn("DIRECTRELATION")){
        vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view", "RELATION");
        printPageDataSheet(response, vars, strPSNR_Batchmasterdata_ID, strSNR_Batchlocator_ID, tableSQL);
      }

    } else if (vars.commandIn("TAB")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID", false, false, true, "");
      vars.removeSessionValue(windowId + "|SNR_Batchlocator_ID");
      refreshParentSession(vars, strPSNR_Batchmasterdata_ID);


      String strView = vars.getSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view");
      String strSNR_Batchlocator_ID = "";
      if (strView.equals("")) {
        strView = defaultTabView;
        if (strView.equals("EDIT")) {
          strSNR_Batchlocator_ID = firstElement(vars, tableSQL);
          if (strSNR_Batchlocator_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) {

        if (strSNR_Batchlocator_ID.equals("")) strSNR_Batchlocator_ID = firstElement(vars, tableSQL);
        printPageEdit(response, request, vars, false, strSNR_Batchlocator_ID, strPSNR_Batchmasterdata_ID, tableSQL);

      } else printPageDataSheet(response, vars, strPSNR_Batchmasterdata_ID, "", tableSQL);
    } else if (vars.commandIn("SEARCH")) {
vars.getRequestGlobalVariable("inpParamSNR_Batchmasterdata_ID", tabId + "|paramSNR_Batchmasterdata_ID");
vars.getRequestGlobalVariable("inpParamM_Locator_ID", tabId + "|paramM_Locator_ID");

            String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");

      
      vars.removeSessionValue(windowId + "|SNR_Batchlocator_ID");
      String strSNR_Batchlocator_ID="";

      String strView = vars.getSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view");
      if (strView.equals("")) strView=defaultTabView;

      if (strView.equals("EDIT")) {
        strSNR_Batchlocator_ID = firstElement(vars, tableSQL);
        if (strSNR_Batchlocator_ID.equals("")) {
          // filter returns empty set
          strView = "RELATION";
          // switch to grid permanently until the user changes the view again
          vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view", strView);
        }
      }

      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strSNR_Batchlocator_ID, strPSNR_Batchmasterdata_ID, tableSQL);

      else printPageDataSheet(response, vars, strPSNR_Batchmasterdata_ID, strSNR_Batchlocator_ID, tableSQL);
    } else if (vars.commandIn("RELATION")) {
            String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");
      

      String strSNR_Batchlocator_ID = vars.getGlobalVariable("inpsnrBatchlocatorId", windowId + "|SNR_Batchlocator_ID", "");
      vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view", "RELATION");
      printPageDataSheet(response, vars, strPSNR_Batchmasterdata_ID, strSNR_Batchlocator_ID, tableSQL);
    } else if (vars.commandIn("NEW")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");


      printPageEdit(response, request, vars, true, "", strPSNR_Batchmasterdata_ID, tableSQL);

    } else if (vars.commandIn("EDIT")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");

      @SuppressWarnings("unused") // In Expense Invoice tab this variable is not used, to be fixed
      String strSNR_Batchlocator_ID = vars.getGlobalVariable("inpsnrBatchlocatorId", windowId + "|SNR_Batchlocator_ID", "");
      vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view", "EDIT");

      setHistoryCommand(request, "EDIT");
      printPageEdit(response, request, vars, false, strSNR_Batchlocator_ID, strPSNR_Batchmasterdata_ID, tableSQL);

    } else if (vars.commandIn("NEXT")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");
      String strSNR_Batchlocator_ID = vars.getRequiredStringParameter("inpsnrBatchlocatorId");
      
      String strNext = nextElement(vars, strSNR_Batchlocator_ID, tableSQL);

      printPageEdit(response, request, vars, false, strNext, strPSNR_Batchmasterdata_ID, tableSQL);
    } else if (vars.commandIn("PREVIOUS")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");
      String strSNR_Batchlocator_ID = vars.getRequiredStringParameter("inpsnrBatchlocatorId");
      
      String strPrevious = previousElement(vars, strSNR_Batchlocator_ID, tableSQL);

      printPageEdit(response, request, vars, false, strPrevious, strPSNR_Batchmasterdata_ID, tableSQL);
    } else if (vars.commandIn("FIRST_RELATION")) {
vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");

      vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.initRecordNumber", "0");
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("PREVIOUS_RELATION")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");

      String strInitRecord = vars.getSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      if (strInitRecord.equals("") || strInitRecord.equals("0")) {
        vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.initRecordNumber", "0");
      } else {
        int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
        initRecord -= intRecordRange;
        strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
        vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.initRecordNumber", strInitRecord);
      }
      vars.removeSessionValue(windowId + "|SNR_Batchlocator_ID");
      vars.setSessionValue(windowId + "|SNR_Batchmasterdata_ID", strPSNR_Batchmasterdata_ID);
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("NEXT_RELATION")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");

      String strInitRecord = vars.getSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
      if (initRecord==0) initRecord=1;
      initRecord += intRecordRange;
      strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
      vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.initRecordNumber", strInitRecord);
      vars.removeSessionValue(windowId + "|SNR_Batchlocator_ID");
      vars.setSessionValue(windowId + "|SNR_Batchmasterdata_ID", strPSNR_Batchmasterdata_ID);
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("FIRST")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");
      
      String strFirst = firstElement(vars, tableSQL);

      printPageEdit(response, request, vars, false, strFirst, strPSNR_Batchmasterdata_ID, tableSQL);
    } else if (vars.commandIn("LAST_RELATION")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");

      String strLast = lastElement(vars, tableSQL);
      printPageDataSheet(response, vars, strPSNR_Batchmasterdata_ID, strLast, tableSQL);
    } else if (vars.commandIn("LAST")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");
      
      String strLast = lastElement(vars, tableSQL);

      printPageEdit(response, request, vars, false, strLast, strPSNR_Batchmasterdata_ID, tableSQL);
    } else if (vars.commandIn("SAVE_NEW_RELATION", "SAVE_NEW_NEW", "SAVE_NEW_EDIT")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");
      OBError myError = new OBError();      
      int total = saveRecord(vars, myError, 'I', strPSNR_Batchmasterdata_ID);      
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
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");
      String strSNR_Batchlocator_ID = vars.getRequiredGlobalVariable("inpsnrBatchlocatorId", windowId + "|SNR_Batchlocator_ID");
      OBError myError = new OBError();
      int total = saveRecord(vars, myError, 'U', strPSNR_Batchmasterdata_ID);      
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
          String strNext = nextElement(vars, strSNR_Batchlocator_ID, tableSQL);
          vars.setSessionValue(windowId + "|SNR_Batchlocator_ID", strNext);
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        } else response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
      }
/*    } else if (vars.commandIn("DELETE_RELATION")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");

      String strSNR_Batchlocator_ID = vars.getRequiredInStringParameter("inpsnrBatchlocatorId");
      String message = deleteRelation(vars, strSNR_Batchlocator_ID, strPSNR_Batchmasterdata_ID);
      if (!message.equals("")) {
        bdError(request, response, message, vars.getLanguage());
      } else {
        vars.removeSessionValue(windowId + "|snrBatchlocatorId");
        vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view", "RELATION");
        response.sendRedirect(strDireccion + request.getServletPath());
      }*/
    } else if (vars.commandIn("DELETE")) {
      String strPSNR_Batchmasterdata_ID = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");

      String strSNR_Batchlocator_ID = vars.getRequiredStringParameter("inpsnrBatchlocatorId");
      //BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData data = getEditVariables(vars, strPSNR_Batchmasterdata_ID);
      int total = 0;
      OBError myError = null;
      if (org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) {
        myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
        vars.setMessage(tabId, myError);
      } else {
        try {
          total = BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.delete(this, strSNR_Batchlocator_ID, strPSNR_Batchmasterdata_ID, Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), Utility.getContext(this, vars, "#User_Org", windowId, accesslevel));
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
        vars.removeSessionValue(windowId + "|snrBatchlocatorId");
        vars.setSessionValue(tabId + "|BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB.view", "RELATION");
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
  String deleteRelation(VariablesSecureApp vars, String strSNR_Batchlocator_ID, String strPSNR_Batchmasterdata_ID) throws IOException, ServletException {
    log4j.debug("Deleting records");
    Connection conn = this.getTransactionConnection();
    try {
      if (strSNR_Batchlocator_ID.startsWith("(")) strSNR_Batchlocator_ID = strSNR_Batchlocator_ID.substring(1, strSNR_Batchlocator_ID.length()-1);
      if (!strSNR_Batchlocator_ID.equals("")) {
        strSNR_Batchlocator_ID = Replace.replace(strSNR_Batchlocator_ID, "'", "");
        StringTokenizer st = new StringTokenizer(strSNR_Batchlocator_ID, ",", false);
        while (st.hasMoreTokens()) {
          String strKey = st.nextToken();
          if (BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.deleteTransactional(conn, this, strKey, strPSNR_Batchmasterdata_ID)==0) {
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
  private BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData getEditVariables(Connection con, VariablesSecureApp vars, String strPSNR_Batchmasterdata_ID) throws IOException,ServletException {
    BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData data = new BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData();
    ServletException ex = null;
    try {
    data.snrBatchmasterdataId = vars.getStringParameter("inpsnrBatchmasterdataId");     data.snrBatchmasterdataIdr = vars.getStringParameter("inpsnrBatchmasterdataId_R");     data.mLocatorId = vars.getStringParameter("inpmLocatorId");     data.mLocatorIdr = vars.getStringParameter("inpmLocatorId_R");    try {   data.qtyonhand = vars.getNumericParameter("inpqtyonhand");  } catch (ServletException paramEx) { ex = paramEx; }     data.adOrgId = vars.getRequestGlobalVariable("inpadOrgId", windowId + "|AD_Org_ID");     data.snrBatchlocatorId = vars.getRequestGlobalVariable("inpsnrBatchlocatorId", windowId + "|SNR_Batchlocator_ID");     data.adClientId = vars.getRequestGlobalVariable("inpadClientId", windowId + "|AD_Client_ID");     data.isactive = vars.getStringParameter("inpisactive", "N"); 
      data.createdby = vars.getUser();
      data.updatedby = vars.getUser();
      data.adUserClient = Utility.getContext(this, vars, "#User_Client", windowId, accesslevel);
      data.adOrgClient = Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel);
      data.updatedTimeStamp = vars.getStringParameter("updatedTimestamp");

      data.snrBatchmasterdataId = vars.getGlobalVariable("inpsnrBatchmasterdataId", windowId + "|SNR_Batchmasterdata_ID");


    
    

    
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

   private BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[] getRelationData(BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[] data) {
    if (data!=null) {
      for (int i=0;i<data.length;i++) {        data[i].snrBatchmasterdataId = FormatUtilities.truncate(data[i].snrBatchmasterdataId, 32);        data[i].mLocatorId = FormatUtilities.truncate(data[i].mLocatorId, 32);        data[i].adOrgId = FormatUtilities.truncate(data[i].adOrgId, 32);        data[i].snrBatchlocatorId = FormatUtilities.truncate(data[i].snrBatchlocatorId, 32);        data[i].adClientId = FormatUtilities.truncate(data[i].adClientId, 32);}
    }
    return data;
  }

  private void refreshParentSession(VariablesSecureApp vars, String strPSNR_Batchmasterdata_ID) throws IOException,ServletException {
      BatchNumbers413FA06268994B24A5D9910C7F1EA938Data[] data = BatchNumbers413FA06268994B24A5D9910C7F1EA938Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strPSNR_Batchmasterdata_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
      if (data==null || data.length==0) return;
          vars.setSessionValue(windowId + "|AD_Org_ID", data[0].adOrgId);    vars.setSessionValue(windowId + "|Batchnumber", data[0].batchnumber);    vars.setSessionValue(windowId + "|AD_Client_ID", data[0].adClientId);    vars.setSessionValue(windowId + "|SNR_Batchmasterdata_ID", data[0].snrBatchmasterdataId);
      vars.setSessionValue(windowId + "|SNR_Batchmasterdata_ID", strPSNR_Batchmasterdata_ID); //to ensure key parent is set for EM_* cols

      FieldProvider dataField = null; // Define this so that auxiliar inputs using SQL will work
      
  }
    
  private String getParentID(VariablesSecureApp vars, String strSNR_Batchlocator_ID) throws ServletException {
    String strPSNR_Batchmasterdata_ID = BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.selectParentID(this, strSNR_Batchlocator_ID);
    if (strPSNR_Batchmasterdata_ID.equals("")) {
      log4j.error("Parent record not found for id: " + strSNR_Batchlocator_ID);
      throw new ServletException("Parent record not found");
    }
    return strPSNR_Batchmasterdata_ID;
  }

    private void refreshSessionEdit(VariablesSecureApp vars, FieldProvider[] data) {
      if (data==null || data.length==0) return;
          vars.setSessionValue(windowId + "|AD_Client_ID", data[0].getField("adClientId"));    vars.setSessionValue(windowId + "|SNR_Batchlocator_ID", data[0].getField("snrBatchlocatorId"));    vars.setSessionValue(windowId + "|AD_Org_ID", data[0].getField("adOrgId"));
    }

    private void refreshSessionNew(VariablesSecureApp vars, String strPSNR_Batchmasterdata_ID) throws IOException,ServletException {
      BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[] data = BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strPSNR_Batchmasterdata_ID, vars.getStringParameter("inpsnrBatchlocatorId", ""), Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
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

  private void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, String strPSNR_Batchmasterdata_ID, String strSNR_Batchlocator_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: dataSheet");

    String strParamSNR_Batchmasterdata_ID = vars.getSessionValue(tabId + "|paramSNR_Batchmasterdata_ID");
String strParamM_Locator_ID = vars.getSessionValue(tabId + "|paramM_Locator_ID");

    if (vars.getSessionValue(windowId +  "|SNR_Batchmasterdata_ID").isEmpty()) vars.setSessionValue(windowId + "|SNR_Batchmasterdata_ID", vars.getStringParameter("inpsnrBatchmasterdataId"));
    boolean hasSearchCondition=false;
    vars.removeEditionData(tabId);
    if (!(strParamSNR_Batchmasterdata_ID.equals("") && strParamM_Locator_ID.equals(""))) hasSearchCondition=true;
    String strOffset = "0";
    //vars.getSessionValue(tabId + "|offset");
    String selectedRow = "0";
    if (!strSNR_Batchlocator_ID.equals("")) {
      selectedRow = Integer.toString(getKeyPosition(vars, strSNR_Batchlocator_ID, tableSQL));
    }

    String[] discard={"isNotFiltered","isNotTest"};
    if (hasSearchCondition) discard[0] = new String("isFiltered");
    if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpWindows/org/zsoft/serial/BatchNumberTracking/BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB_Relation", discard).createXmlDocument();

    ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB", false, "document.frmMain.inpsnrBatchlocatorId", "grid", "..", "".equals("Y"), "BatchNumberTracking", strReplaceWith, false);
    toolbar.prepareRelationTemplate("N".equals("Y"), hasSearchCondition, !vars.getSessionValue("#ShowTest", "N").equals("Y"), true, Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    xmlDocument.setParameter("toolbar", toolbar.toString());

    xmlDocument.setParameter("keyParent", strPSNR_Batchmasterdata_ID);

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
    xmlDocument.setParameter("KeyName", "snrBatchlocatorId");
    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("theme", vars.getTheme());
    //xmlDocument.setParameter("buttonReference", Utility.messageBD(this, "Reference", vars.getLanguage()));
    try {
      WindowTabs tabs = new WindowTabs(this, vars, tabId, windowId, false);
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB_Relation.html", "BatchNumberTracking", "W", strReplaceWith, tabs.breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB_Relation.html", strReplaceWith);
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
    if (vars.getLanguage().equals("en_US")) xmlDocument.setParameter("parent", BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.selectParent(this, strPSNR_Batchmasterdata_ID));
    else xmlDocument.setParameter("parent", BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.selectParentTrl(this, strPSNR_Batchmasterdata_ID));

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

  private void printPageEdit(HttpServletResponse response, HttpServletRequest request, VariablesSecureApp vars,boolean boolNew, String strSNR_Batchlocator_ID, String strPSNR_Batchmasterdata_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: edit");
    
    HashMap<String, String> usedButtonShortCuts;
  
    usedButtonShortCuts = new HashMap<String, String>();
    
    
    
    String strOrderByFilter = vars.getSessionValue(tabId + "|orderby");
    String orderClause = " 1";
    if (strOrderByFilter==null || strOrderByFilter.equals("")) strOrderByFilter = orderClause;
    /*{
      if (!strOrderByFilter.equals("") && !orderClause.equals("")) strOrderByFilter += ", ";
      strOrderByFilter += orderClause;
    }*/
    
    
    String strCommand = null;
    BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[] data=null;
    XmlDocument xmlDocument=null;
    FieldProvider dataField = vars.getEditionData(tabId);
    vars.removeEditionData(tabId);
    String strParamSNR_Batchmasterdata_ID = vars.getSessionValue(tabId + "|paramSNR_Batchmasterdata_ID");
String strParamM_Locator_ID = vars.getSessionValue(tabId + "|paramM_Locator_ID");

    boolean hasSearchCondition=false;
    if (!(strParamSNR_Batchmasterdata_ID.equals("") && strParamM_Locator_ID.equals(""))) hasSearchCondition=true;

       String strParamSessionDate = vars.getGlobalVariable("inpParamSessionDate", Utility.getTransactionalDate(this, vars, windowId), "");
      String buscador = "";
      String[] discard = {"", "isNotTest"};
      
      if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    if (dataField==null) {
      if (!boolNew) {
        discard[0] = new String("newDiscard");
        data = BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strPSNR_Batchmasterdata_ID, strSNR_Batchlocator_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
  
        if (!strSNR_Batchlocator_ID.equals("") && (data == null || data.length==0)) {
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
          return;
        }
        refreshSessionEdit(vars, data);
        strCommand = "EDIT";
      }

      if (data==null || data.length==0) {
        strSNR_Batchlocator_ID = firstElement(vars, tableSQL);
        if (strSNR_Batchlocator_ID.equals("")) {
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
          return;
        } else {
          data = BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strPSNR_Batchmasterdata_ID, strSNR_Batchlocator_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
        }
      }

      if (boolNew || data==null || data.length==0) {
        discard[0] = new String ("editDiscard");
        strCommand = "NEW";
        data = new BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[0];
      } else {
        discard[0] = new String ("newDiscard");
      }
    } else {
      if (dataField.getField("snrBatchlocatorId") == null || dataField.getField("snrBatchlocatorId").equals("")) {
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
        refreshSessionNew(vars, strPSNR_Batchmasterdata_ID);
        data = BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.set(strPSNR_Batchmasterdata_ID, "Y", Utility.getDefault(this, vars, "M_Locator_ID", "", "18C5A42061B9456085182F129F3F1832", "CC0B9B01312F499C9849B6842923DCCB", "", dataField), BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.selectDef0ED5EDD107464B148E95A0B2CC383146_0(this, Utility.getDefault(this, vars, "M_Locator_ID", "", "18C5A42061B9456085182F129F3F1832", "CC0B9B01312F499C9849B6842923DCCB", "", dataField)), Utility.getDefault(this, vars, "Createdby", "", "18C5A42061B9456085182F129F3F1832", "CC0B9B01312F499C9849B6842923DCCB", "", dataField), BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.selectDef102E7DE30D8549CDB90095EE84360888_1(this, Utility.getDefault(this, vars, "Createdby", "", "18C5A42061B9456085182F129F3F1832", "CC0B9B01312F499C9849B6842923DCCB", "", dataField)), Utility.getDefault(this, vars, "AD_Org_ID", "@AD_ORG_ID@", "18C5A42061B9456085182F129F3F1832", "CC0B9B01312F499C9849B6842923DCCB", "", dataField), Utility.getDefault(this, vars, "Updatedby", "", "18C5A42061B9456085182F129F3F1832", "CC0B9B01312F499C9849B6842923DCCB", "", dataField), BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.selectDefF82ABA00D7DA4886AF996BEE8F698643_2(this, Utility.getDefault(this, vars, "Updatedby", "", "18C5A42061B9456085182F129F3F1832", "CC0B9B01312F499C9849B6842923DCCB", "", dataField)), Utility.getDefault(this, vars, "AD_Client_ID", "@AD_CLIENT_ID@", "18C5A42061B9456085182F129F3F1832", "CC0B9B01312F499C9849B6842923DCCB", "", dataField), "", Utility.getDefault(this, vars, "Qtyonhand", "0", "18C5A42061B9456085182F129F3F1832", "CC0B9B01312F499C9849B6842923DCCB", "", dataField));
        
      }
    } else {
      data = new BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData[1];
      java.lang.Object  ref1= dataField;
      data[0]=(BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData) ref1;
      data[0].created="";
      data[0].updated="";
    }
      
    String currentPOrg=BatchNumbers413FA06268994B24A5D9910C7F1EA938Data.selectOrg(this, strPSNR_Batchmasterdata_ID);
    String currentOrg = (boolNew?"":(dataField!=null?dataField.getField("adOrgId"):data[0].getField("adOrgId")));
    if (!currentOrg.equals("") && !currentOrg.startsWith("'")) currentOrg = "'"+currentOrg+"'";
    String currentClient = (boolNew?"":(dataField!=null?dataField.getField("adClientId"):data[0].getField("adClientId")));
    if (!currentClient.equals("") && !currentClient.startsWith("'")) currentClient = "'"+currentClient+"'";
    
    boolean editableTab = (!org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId) && (currentOrg.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),currentOrg)) && (currentClient.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), currentClient)));
    if (Formhelper.isTabReadOnly(this, vars, tabId))
      editableTab=false;
    
    ToolBar toolbar = new ToolBar(this, editableTab, vars.getLanguage(), "BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB", (strCommand.equals("NEW") || boolNew || (dataField==null && (data==null || data.length==0))), "document.frmMain.inpsnrBatchlocatorId", "", "..", "".equals("Y"), "BatchNumberTracking", strReplaceWith, true, false, false, Utility.hasTabAttachments(this, vars, tabId, strSNR_Batchlocator_ID));
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
  
  private int saveRecord(VariablesSecureApp vars, OBError myError, char type, String strPSNR_Batchmasterdata_ID) throws IOException, ServletException {
    BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData data = null;
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
            data = getEditVariables(con, vars, strPSNR_Batchmasterdata_ID);
            data.dateTimeFormat = vars.getSessionValue("#AD_SqlDateTimeFormat");            
            String strSequence = "";
            if(type == 'I') {                
        strSequence = SequenceIdData.getUUID();
                if(log4j.isDebugEnabled()) log4j.debug("Sequence: " + strSequence);
                data.snrBatchlocatorId = strSequence;  
            }
            if (Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),data.adClientId)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),data.adOrgId)){
		     if(type == 'I') {
		       total = data.insert(con, this);
		     } else {
		       //Check the version of the record we are saving is the one in DB
		       if (BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCBData.getCurrentDBTimestamp(this, data.snrBatchlocatorId).equals(
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
          CrudOperations.UpdateCustomFields(tabId, data.snrBatchlocatorId, vars, this);
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
                    data.snrBatchlocatorId = "";
                }
                else {                    
                    
                }
                vars.setEditionData(tabId, data);
            }            	
        }
        else {
            vars.setSessionValue(windowId + "|SNR_Batchlocator_ID", data.snrBatchlocatorId);
        }
    }
    return total;
  }

  public String getServletInfo() {
    return "Servlet BatchOnhandQuantitiesCC0B9B01312F499C9849B6842923DCCB. This Servlet was made by Wad constructor";
  } // End of getServletInfo() method
}
