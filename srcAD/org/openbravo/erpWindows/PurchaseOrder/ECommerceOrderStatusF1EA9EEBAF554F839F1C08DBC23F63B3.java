
package org.openbravo.erpWindows.PurchaseOrder;





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

public class ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3 extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  
  private static Logger log4j = Logger.getLogger(ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.class);
  
  private static final String windowId = "181";
  private static final String tabId = "F1EA9EEBAF554F839F1C08DBC23F63B3";
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
        String strzseShoporderstatusId = request.getParameter("inpzseShoporderstatusId");
         String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");
        if (editableTab) {
          int total = 0;
          
          if(commandType.equalsIgnoreCase("EDIT") && !strzseShoporderstatusId.equals(""))
              total = saveRecord(vars, myError, 'U', strPC_Order_ID);
          else
              total = saveRecord(vars, myError, 'I', strPC_Order_ID);
          
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
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID", "");

      String strZSE_Shoporderstatus_ID = vars.getGlobalVariable("inpzseShoporderstatusId", windowId + "|ZSE_Shoporderstatus_ID", "");
            if (strPC_Order_ID.equals("")) {
        strPC_Order_ID = getParentID(vars, strZSE_Shoporderstatus_ID);
        if (strPC_Order_ID.equals("")) throw new ServletException("Required parameter :" + windowId + "|C_Order_ID");
        vars.setSessionValue(windowId + "|C_Order_ID", strPC_Order_ID);

        refreshParentSession(vars, strPC_Order_ID);
      }


      String strView = vars.getSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view");
      if (strView.equals("")) {
        strView = defaultTabView;

        if (strView.equals("EDIT")) {
          if (strZSE_Shoporderstatus_ID.equals("")) strZSE_Shoporderstatus_ID = firstElement(vars, tableSQL);
          if (strZSE_Shoporderstatus_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strZSE_Shoporderstatus_ID, strPC_Order_ID, tableSQL);

      else printPageDataSheet(response, vars, strPC_Order_ID, strZSE_Shoporderstatus_ID, tableSQL);
    } else if (vars.commandIn("DIRECT") || vars.commandIn("DIRECTRELATION")) {
      String strZSE_Shoporderstatus_ID = vars.getStringParameter("inpDirectKey");
      
        
      if (strZSE_Shoporderstatus_ID.equals("")) strZSE_Shoporderstatus_ID = vars.getRequiredGlobalVariable("inpzseShoporderstatusId", windowId + "|ZSE_Shoporderstatus_ID");
      else vars.setSessionValue(windowId + "|ZSE_Shoporderstatus_ID", strZSE_Shoporderstatus_ID);
      
      
      String strPC_Order_ID = getParentID(vars, strZSE_Shoporderstatus_ID);
      
      vars.setSessionValue(windowId + "|C_Order_ID", strPC_Order_ID);
      vars.setSessionValue("294|Header.view", "EDIT");

      refreshParentSession(vars, strPC_Order_ID);

      if (vars.commandIn("DIRECT")){
        vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view", "EDIT");

        printPageEdit(response, request, vars, false, strZSE_Shoporderstatus_ID, strPC_Order_ID, tableSQL);
      }
      if (vars.commandIn("DIRECTRELATION")){
        vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view", "RELATION");
        printPageDataSheet(response, vars, strPC_Order_ID, strZSE_Shoporderstatus_ID, tableSQL);
      }

    } else if (vars.commandIn("TAB")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID", false, false, true, "");
      vars.removeSessionValue(windowId + "|ZSE_Shoporderstatus_ID");
      refreshParentSession(vars, strPC_Order_ID);


      String strView = vars.getSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view");
      String strZSE_Shoporderstatus_ID = "";
      if (strView.equals("")) {
        strView = defaultTabView;
        if (strView.equals("EDIT")) {
          strZSE_Shoporderstatus_ID = firstElement(vars, tableSQL);
          if (strZSE_Shoporderstatus_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) {

        if (strZSE_Shoporderstatus_ID.equals("")) strZSE_Shoporderstatus_ID = firstElement(vars, tableSQL);
        printPageEdit(response, request, vars, false, strZSE_Shoporderstatus_ID, strPC_Order_ID, tableSQL);

      } else printPageDataSheet(response, vars, strPC_Order_ID, "", tableSQL);
    } else if (vars.commandIn("SEARCH")) {
vars.getRequestGlobalVariable("inpParamC_Order_ID", tabId + "|paramC_Order_ID");

            String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");

      
      vars.removeSessionValue(windowId + "|ZSE_Shoporderstatus_ID");
      String strZSE_Shoporderstatus_ID="";

      String strView = vars.getSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view");
      if (strView.equals("")) strView=defaultTabView;

      if (strView.equals("EDIT")) {
        strZSE_Shoporderstatus_ID = firstElement(vars, tableSQL);
        if (strZSE_Shoporderstatus_ID.equals("")) {
          // filter returns empty set
          strView = "RELATION";
          // switch to grid permanently until the user changes the view again
          vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view", strView);
        }
      }

      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strZSE_Shoporderstatus_ID, strPC_Order_ID, tableSQL);

      else printPageDataSheet(response, vars, strPC_Order_ID, strZSE_Shoporderstatus_ID, tableSQL);
    } else if (vars.commandIn("RELATION")) {
            String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");
      

      String strZSE_Shoporderstatus_ID = vars.getGlobalVariable("inpzseShoporderstatusId", windowId + "|ZSE_Shoporderstatus_ID", "");
      vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view", "RELATION");
      printPageDataSheet(response, vars, strPC_Order_ID, strZSE_Shoporderstatus_ID, tableSQL);
    } else if (vars.commandIn("NEW")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");


      printPageEdit(response, request, vars, true, "", strPC_Order_ID, tableSQL);

    } else if (vars.commandIn("EDIT")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");

      @SuppressWarnings("unused") // In Expense Invoice tab this variable is not used, to be fixed
      String strZSE_Shoporderstatus_ID = vars.getGlobalVariable("inpzseShoporderstatusId", windowId + "|ZSE_Shoporderstatus_ID", "");
      vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view", "EDIT");

      setHistoryCommand(request, "EDIT");
      printPageEdit(response, request, vars, false, strZSE_Shoporderstatus_ID, strPC_Order_ID, tableSQL);

    } else if (vars.commandIn("NEXT")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");
      String strZSE_Shoporderstatus_ID = vars.getRequiredStringParameter("inpzseShoporderstatusId");
      
      String strNext = nextElement(vars, strZSE_Shoporderstatus_ID, tableSQL);

      printPageEdit(response, request, vars, false, strNext, strPC_Order_ID, tableSQL);
    } else if (vars.commandIn("PREVIOUS")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");
      String strZSE_Shoporderstatus_ID = vars.getRequiredStringParameter("inpzseShoporderstatusId");
      
      String strPrevious = previousElement(vars, strZSE_Shoporderstatus_ID, tableSQL);

      printPageEdit(response, request, vars, false, strPrevious, strPC_Order_ID, tableSQL);
    } else if (vars.commandIn("FIRST_RELATION")) {
vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");

      vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.initRecordNumber", "0");
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("PREVIOUS_RELATION")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");

      String strInitRecord = vars.getSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      if (strInitRecord.equals("") || strInitRecord.equals("0")) {
        vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.initRecordNumber", "0");
      } else {
        int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
        initRecord -= intRecordRange;
        strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
        vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.initRecordNumber", strInitRecord);
      }
      vars.removeSessionValue(windowId + "|ZSE_Shoporderstatus_ID");
      vars.setSessionValue(windowId + "|C_Order_ID", strPC_Order_ID);
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("NEXT_RELATION")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");

      String strInitRecord = vars.getSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
      if (initRecord==0) initRecord=1;
      initRecord += intRecordRange;
      strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
      vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.initRecordNumber", strInitRecord);
      vars.removeSessionValue(windowId + "|ZSE_Shoporderstatus_ID");
      vars.setSessionValue(windowId + "|C_Order_ID", strPC_Order_ID);
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("FIRST")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");
      
      String strFirst = firstElement(vars, tableSQL);

      printPageEdit(response, request, vars, false, strFirst, strPC_Order_ID, tableSQL);
    } else if (vars.commandIn("LAST_RELATION")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");

      String strLast = lastElement(vars, tableSQL);
      printPageDataSheet(response, vars, strPC_Order_ID, strLast, tableSQL);
    } else if (vars.commandIn("LAST")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");
      
      String strLast = lastElement(vars, tableSQL);

      printPageEdit(response, request, vars, false, strLast, strPC_Order_ID, tableSQL);
    } else if (vars.commandIn("SAVE_NEW_RELATION", "SAVE_NEW_NEW", "SAVE_NEW_EDIT")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");
      OBError myError = new OBError();      
      int total = saveRecord(vars, myError, 'I', strPC_Order_ID);      
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
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");
      String strZSE_Shoporderstatus_ID = vars.getRequiredGlobalVariable("inpzseShoporderstatusId", windowId + "|ZSE_Shoporderstatus_ID");
      OBError myError = new OBError();
      int total = saveRecord(vars, myError, 'U', strPC_Order_ID);      
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
          String strNext = nextElement(vars, strZSE_Shoporderstatus_ID, tableSQL);
          vars.setSessionValue(windowId + "|ZSE_Shoporderstatus_ID", strNext);
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        } else response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
      }
/*    } else if (vars.commandIn("DELETE_RELATION")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");

      String strZSE_Shoporderstatus_ID = vars.getRequiredInStringParameter("inpzseShoporderstatusId");
      String message = deleteRelation(vars, strZSE_Shoporderstatus_ID, strPC_Order_ID);
      if (!message.equals("")) {
        bdError(request, response, message, vars.getLanguage());
      } else {
        vars.removeSessionValue(windowId + "|zseShoporderstatusId");
        vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view", "RELATION");
        response.sendRedirect(strDireccion + request.getServletPath());
      }*/
    } else if (vars.commandIn("DELETE")) {
      String strPC_Order_ID = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");

      String strZSE_Shoporderstatus_ID = vars.getRequiredStringParameter("inpzseShoporderstatusId");
      //ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data data = getEditVariables(vars, strPC_Order_ID);
      int total = 0;
      OBError myError = null;
      if (org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) {
        myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
        vars.setMessage(tabId, myError);
      } else {
        try {
          total = ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.delete(this, strZSE_Shoporderstatus_ID, strPC_Order_ID, Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), Utility.getContext(this, vars, "#User_Org", windowId, accesslevel));
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
        vars.removeSessionValue(windowId + "|zseShoporderstatusId");
        vars.setSessionValue(tabId + "|ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3.view", "RELATION");
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
  String deleteRelation(VariablesSecureApp vars, String strZSE_Shoporderstatus_ID, String strPC_Order_ID) throws IOException, ServletException {
    log4j.debug("Deleting records");
    Connection conn = this.getTransactionConnection();
    try {
      if (strZSE_Shoporderstatus_ID.startsWith("(")) strZSE_Shoporderstatus_ID = strZSE_Shoporderstatus_ID.substring(1, strZSE_Shoporderstatus_ID.length()-1);
      if (!strZSE_Shoporderstatus_ID.equals("")) {
        strZSE_Shoporderstatus_ID = Replace.replace(strZSE_Shoporderstatus_ID, "'", "");
        StringTokenizer st = new StringTokenizer(strZSE_Shoporderstatus_ID, ",", false);
        while (st.hasMoreTokens()) {
          String strKey = st.nextToken();
          if (ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.deleteTransactional(conn, this, strKey, strPC_Order_ID)==0) {
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
  private ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data getEditVariables(Connection con, VariablesSecureApp vars, String strPC_Order_ID) throws IOException,ServletException {
    ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data data = new ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data();
    ServletException ex = null;
    try {
    data.cOrderId = vars.getStringParameter("inpcOrderId");     data.cOrderIdr = vars.getStringParameter("inpcOrderId_R");     data.zseShopId = vars.getStringParameter("inpzseShopId");     data.zseShopIdr = vars.getStringParameter("inpzseShopId_R");     data.status = vars.getStringParameter("inpstatus");     data.statusr = vars.getStringParameter("inpstatus_R");     data.shopoderno = vars.getStringParameter("inpshopoderno");     data.message = vars.getStringParameter("inpmessage");     data.externalid = vars.getStringParameter("inpexternalid");     data.datedelivered = vars.getStringParameter("inpdatedelivered");     data.shipper = vars.getStringParameter("inpshipper");     data.trackingno = vars.getStringParameter("inptrackingno");     data.issotrx = vars.getStringParameter("inpissotrx", "N");     data.adClientId = vars.getRequestGlobalVariable("inpadClientId", windowId + "|AD_Client_ID");     data.adOrgId = vars.getRequestGlobalVariable("inpadOrgId", windowId + "|AD_Org_ID");     data.isactive = vars.getStringParameter("inpisactive", "N");     data.zseShoporderstatusId = vars.getRequestGlobalVariable("inpzseShoporderstatusId", windowId + "|ZSE_Shoporderstatus_ID"); 
      data.createdby = vars.getUser();
      data.updatedby = vars.getUser();
      data.adUserClient = Utility.getContext(this, vars, "#User_Client", windowId, accesslevel);
      data.adOrgClient = Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel);
      data.updatedTimeStamp = vars.getStringParameter("updatedTimestamp");

      data.cOrderId = vars.getGlobalVariable("inpcOrderId", windowId + "|C_Order_ID");


    
    

    
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

   private ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[] getRelationData(ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[] data) {
    if (data!=null) {
      for (int i=0;i<data.length;i++) {        data[i].cOrderId = FormatUtilities.truncate(data[i].cOrderId, 32);        data[i].zseShopId = FormatUtilities.truncate(data[i].zseShopId, 32);        data[i].status = FormatUtilities.truncate(data[i].status, 40);        data[i].shopoderno = FormatUtilities.truncate(data[i].shopoderno, 40);        data[i].message = FormatUtilities.truncate(data[i].message, 50);        data[i].externalid = FormatUtilities.truncate(data[i].externalid, 32);        data[i].shipper = FormatUtilities.truncate(data[i].shipper, 50);        data[i].trackingno = FormatUtilities.truncate(data[i].trackingno, 50);        data[i].adClientId = FormatUtilities.truncate(data[i].adClientId, 32);        data[i].adOrgId = FormatUtilities.truncate(data[i].adOrgId, 32);        data[i].zseShoporderstatusId = FormatUtilities.truncate(data[i].zseShoporderstatusId, 32);}
    }
    return data;
  }

  private void refreshParentSession(VariablesSecureApp vars, String strPC_Order_ID) throws IOException,ServletException {
      HeaderData[] data = HeaderData.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strPC_Order_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
      if (data==null || data.length==0) return;
          vars.setSessionValue(windowId + "|AD_Client_ID", data[0].adClientId);    vars.setSessionValue(windowId + "|AD_Org_ID", data[0].adOrgId);    vars.setSessionValue(windowId + "|DateOrdered", data[0].dateordered);    vars.setSessionValue(windowId + "|C_DocTypeTarget_ID", data[0].cDoctypetargetId);    vars.setSessionValue(windowId + "|C_DocType_ID", data[0].cDoctypeId);    vars.setSessionValue(windowId + "|C_BPartner_ID", data[0].cBpartnerId);    vars.setSessionValue(windowId + "|C_BPartner_Location_ID", data[0].cBpartnerLocationId);    vars.setSessionValue(windowId + "|M_PriceList_ID", data[0].mPricelistId);    vars.setSessionValue(windowId + "|M_Warehouse_ID", data[0].mWarehouseId);    vars.setSessionValue(windowId + "|C_Currency_ID", data[0].cCurrencyId);    vars.setSessionValue(windowId + "|DeliveryViaRule", data[0].deliveryviarule);    vars.setSessionValue(windowId + "|DatePromised", data[0].datepromised);    vars.setSessionValue(windowId + "|SchedDeliveryDate", data[0].scheddeliverydate);    vars.setSessionValue(windowId + "|M_Shipper_ID", data[0].mShipperId);    vars.setSessionValue(windowId + "|C_Order_ID", data[0].cOrderId);    vars.setSessionValue(windowId + "|Processed", data[0].processed);    vars.setSessionValue(windowId + "|FreightCostRule", data[0].freightcostrule);    vars.setSessionValue(windowId + "|IsSOTrx", data[0].issotrx);
      vars.setSessionValue(windowId + "|C_Order_ID", strPC_Order_ID); //to ensure key parent is set for EM_* cols

      FieldProvider dataField = null; // Define this so that auxiliar inputs using SQL will work
      
      vars.setSessionValue(windowId + "|ORDERTYPE", HeaderData.selectAux8(this, Utility.getContext(this, vars, "C_DOCTYPETARGET_ID", "181")));
      
  }
    
  private String getParentID(VariablesSecureApp vars, String strZSE_Shoporderstatus_ID) throws ServletException {
    String strPC_Order_ID = ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.selectParentID(this, strZSE_Shoporderstatus_ID);
    if (strPC_Order_ID.equals("")) {
      log4j.error("Parent record not found for id: " + strZSE_Shoporderstatus_ID);
      throw new ServletException("Parent record not found");
    }
    return strPC_Order_ID;
  }

    private void refreshSessionEdit(VariablesSecureApp vars, FieldProvider[] data) {
      if (data==null || data.length==0) return;
          vars.setSessionValue(windowId + "|AD_Org_ID", data[0].getField("adOrgId"));    vars.setSessionValue(windowId + "|AD_Client_ID", data[0].getField("adClientId"));    vars.setSessionValue(windowId + "|ZSE_Shoporderstatus_ID", data[0].getField("zseShoporderstatusId"));
    }

    private void refreshSessionNew(VariablesSecureApp vars, String strPC_Order_ID) throws IOException,ServletException {
      ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[] data = ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strPC_Order_ID, vars.getStringParameter("inpzseShoporderstatusId", ""), Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
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

  private void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, String strPC_Order_ID, String strZSE_Shoporderstatus_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: dataSheet");

    String strParamC_Order_ID = vars.getSessionValue(tabId + "|paramC_Order_ID");

    if (vars.getSessionValue(windowId +  "|C_Order_ID").isEmpty()) vars.setSessionValue(windowId + "|C_Order_ID", vars.getStringParameter("inpcOrderId"));
    boolean hasSearchCondition=false;
    vars.removeEditionData(tabId);
    if (!(strParamC_Order_ID.equals(""))) hasSearchCondition=true;
    String strOffset = "0";
    //vars.getSessionValue(tabId + "|offset");
    String selectedRow = "0";
    if (!strZSE_Shoporderstatus_ID.equals("")) {
      selectedRow = Integer.toString(getKeyPosition(vars, strZSE_Shoporderstatus_ID, tableSQL));
    }

    String[] discard={"isNotFiltered","isNotTest"};
    if (hasSearchCondition) discard[0] = new String("isFiltered");
    if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpWindows/PurchaseOrder/ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3_Relation", discard).createXmlDocument();

    ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3", false, "document.frmMain.inpzseShoporderstatusId", "grid", "..", "".equals("Y"), "PurchaseOrder", strReplaceWith, false);
    toolbar.prepareRelationTemplate("N".equals("Y"), hasSearchCondition, !vars.getSessionValue("#ShowTest", "N").equals("Y"), true, Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    xmlDocument.setParameter("toolbar", toolbar.toString());

    xmlDocument.setParameter("keyParent", strPC_Order_ID);

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
    xmlDocument.setParameter("KeyName", "zseShoporderstatusId");
    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("theme", vars.getTheme());
    //xmlDocument.setParameter("buttonReference", Utility.messageBD(this, "Reference", vars.getLanguage()));
    try {
      WindowTabs tabs = new WindowTabs(this, vars, tabId, windowId, false);
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3_Relation.html", "PurchaseOrder", "W", strReplaceWith, tabs.breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3_Relation.html", strReplaceWith);
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
    if (vars.getLanguage().equals("en_US")) xmlDocument.setParameter("parent", ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.selectParent(this, strPC_Order_ID));
    else xmlDocument.setParameter("parent", ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.selectParentTrl(this, strPC_Order_ID));

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

  private void printPageEdit(HttpServletResponse response, HttpServletRequest request, VariablesSecureApp vars,boolean boolNew, String strZSE_Shoporderstatus_ID, String strPC_Order_ID, TableSQLData tableSQL)
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
    ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[] data=null;
    XmlDocument xmlDocument=null;
    FieldProvider dataField = vars.getEditionData(tabId);
    vars.removeEditionData(tabId);
    String strParamC_Order_ID = vars.getSessionValue(tabId + "|paramC_Order_ID");

    boolean hasSearchCondition=false;
    if (!(strParamC_Order_ID.equals(""))) hasSearchCondition=true;

       String strParamSessionDate = vars.getGlobalVariable("inpParamSessionDate", Utility.getTransactionalDate(this, vars, windowId), "");
      String buscador = "";
      String[] discard = {"", "isNotTest"};
      
      if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    if (dataField==null) {
      if (!boolNew) {
        discard[0] = new String("newDiscard");
        data = ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strPC_Order_ID, strZSE_Shoporderstatus_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
  
        if (!strZSE_Shoporderstatus_ID.equals("") && (data == null || data.length==0)) {
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
          return;
        }
        refreshSessionEdit(vars, data);
        strCommand = "EDIT";
      }

      if (data==null || data.length==0) {
        strZSE_Shoporderstatus_ID = firstElement(vars, tableSQL);
        if (strZSE_Shoporderstatus_ID.equals("")) {
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
          return;
        } else {
          data = ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strPC_Order_ID, strZSE_Shoporderstatus_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
        }
      }

      if (boolNew || data==null || data.length==0) {
        discard[0] = new String ("editDiscard");
        strCommand = "NEW";
        data = new ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[0];
      } else {
        discard[0] = new String ("newDiscard");
      }
    } else {
      if (dataField.getField("zseShoporderstatusId") == null || dataField.getField("zseShoporderstatusId").equals("")) {
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
        refreshSessionNew(vars, strPC_Order_ID);
        data = ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.set(strPC_Order_ID, Utility.getDefault(this, vars, "AD_Client_ID", "@AD_CLIENT_ID@", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), Utility.getDefault(this, vars, "Issotrx", "Y", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "N", dataField), "", Utility.getDefault(this, vars, "Createdby", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.selectDef05E4F0D6DB1F4BDFB370BCE936346934_0(this, Utility.getDefault(this, vars, "Createdby", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField)), Utility.getDefault(this, vars, "Externalid", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), Utility.getDefault(this, vars, "Shipper", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), Utility.getDefault(this, vars, "Trackingno", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), Utility.getDefault(this, vars, "Updatedby", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.selectDefA80A1F8192FC4B84A56DE233AFBB6453_1(this, Utility.getDefault(this, vars, "Updatedby", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField)), Utility.getDefault(this, vars, "AD_Org_ID", "@AD_ORG_ID@", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), "Y", Utility.getDefault(this, vars, "Shopoderno", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), Utility.getDefault(this, vars, "Message", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), Utility.getDefault(this, vars, "ZSE_Shop_ID", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), Utility.getDefault(this, vars, "Status", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField), Utility.getDefault(this, vars, "Datedelivered", "", "181", "F1EA9EEBAF554F839F1C08DBC23F63B3", "", dataField));
        
      }
    } else {
      data = new ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data[1];
      java.lang.Object  ref1= dataField;
      data[0]=(ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data) ref1;
      data[0].created="";
      data[0].updated="";
    }
      
    String currentPOrg=HeaderData.selectOrg(this, strPC_Order_ID);
    String currentOrg = (boolNew?"":(dataField!=null?dataField.getField("adOrgId"):data[0].getField("adOrgId")));
    if (!currentOrg.equals("") && !currentOrg.startsWith("'")) currentOrg = "'"+currentOrg+"'";
    String currentClient = (boolNew?"":(dataField!=null?dataField.getField("adClientId"):data[0].getField("adClientId")));
    if (!currentClient.equals("") && !currentClient.startsWith("'")) currentClient = "'"+currentClient+"'";
    
    boolean editableTab = (!org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId) && (currentOrg.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),currentOrg)) && (currentClient.equals("") || Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), currentClient)));
    if (Formhelper.isTabReadOnly(this, vars, tabId))
      editableTab=false;
    
    ToolBar toolbar = new ToolBar(this, editableTab, vars.getLanguage(), "ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3", (strCommand.equals("NEW") || boolNew || (dataField==null && (data==null || data.length==0))), "document.frmMain.inpzseShoporderstatusId", "", "..", "".equals("Y"), "PurchaseOrder", strReplaceWith, true, false, false, Utility.hasTabAttachments(this, vars, tabId, strZSE_Shoporderstatus_ID));
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
  
  private int saveRecord(VariablesSecureApp vars, OBError myError, char type, String strPC_Order_ID) throws IOException, ServletException {
    ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data data = null;
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
            data = getEditVariables(con, vars, strPC_Order_ID);
            data.dateTimeFormat = vars.getSessionValue("#AD_SqlDateTimeFormat");            
            String strSequence = "";
            if(type == 'I') {                
        strSequence = SequenceIdData.getUUID();
                if(log4j.isDebugEnabled()) log4j.debug("Sequence: " + strSequence);
                data.zseShoporderstatusId = strSequence;  
            }
            if (Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),data.adClientId)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),data.adOrgId)){
		     if(type == 'I') {
		       total = data.insert(con, this);
		     } else {
		       //Check the version of the record we are saving is the one in DB
		       if (ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3Data.getCurrentDBTimestamp(this, data.zseShoporderstatusId).equals(
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
          CrudOperations.UpdateCustomFields(tabId, data.zseShoporderstatusId, vars, this);
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
                    data.zseShoporderstatusId = "";
                }
                else {                    
                    
                }
                vars.setEditionData(tabId, data);
            }            	
        }
        else {
            vars.setSessionValue(windowId + "|ZSE_Shoporderstatus_ID", data.zseShoporderstatusId);
        }
    }
    return total;
  }

  public String getServletInfo() {
    return "Servlet ECommerceOrderStatusF1EA9EEBAF554F839F1C08DBC23F63B3. This Servlet was made by Wad constructor";
  } // End of getServletInfo() method
}
