
package org.openbravo.erpWindows.com.elreha.sales.SalesProduct;


import org.openbravo.erpCommon.reference.*;




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

public class ProductF6A25D6EA3384B0C85679865687E51D4 extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  
  private static Logger log4j = Logger.getLogger(ProductF6A25D6EA3384B0C85679865687E51D4.class);
  
  private static final String windowId = "6614375915A04200ACCE9C693F0651E2";
  private static final String tabId = "F6A25D6EA3384B0C85679865687E51D4";
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
        String strmProductId = request.getParameter("inpmProductId");
        
        if (editableTab) {
          int total = 0;
          
          if(commandType.equalsIgnoreCase("EDIT") && !strmProductId.equals(""))
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

      String strM_Product_ID = vars.getGlobalVariable("inpmProductId", windowId + "|M_Product_ID", "");
      

      String strView = vars.getSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view");
      if (strView.equals("")) {
        strView = defaultTabView;

        if (strView.equals("EDIT")) {
          if (strM_Product_ID.equals("")) strM_Product_ID = firstElement(vars, tableSQL);
          if (strM_Product_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strM_Product_ID, tableSQL);

      else printPageDataSheet(response, vars, strM_Product_ID, tableSQL);
    } else if (vars.commandIn("DIRECT") || vars.commandIn("DIRECTRELATION")) {
      String strM_Product_ID = vars.getStringParameter("inpDirectKey");
      
        
      if (strM_Product_ID.equals("")) strM_Product_ID = vars.getRequiredGlobalVariable("inpmProductId", windowId + "|M_Product_ID");
      else vars.setSessionValue(windowId + "|M_Product_ID", strM_Product_ID);
      
      if (vars.commandIn("DIRECT")){
        vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view", "EDIT");

        printPageEdit(response, request, vars, false, strM_Product_ID, tableSQL);
      }
      if (vars.commandIn("DIRECTRELATION")){
        vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view", "RELATION");
        printPageDataSheet(response, vars, strM_Product_ID, tableSQL);
      }

    } else if (vars.commandIn("TAB")) {


      String strView = vars.getSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view");
      String strM_Product_ID = "";
      if (strView.equals("")) {
        strView = defaultTabView;
        if (strView.equals("EDIT")) {
          strM_Product_ID = firstElement(vars, tableSQL);
          if (strM_Product_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) {

        if (strM_Product_ID.equals("")) strM_Product_ID = firstElement(vars, tableSQL);
        printPageEdit(response, request, vars, false, strM_Product_ID, tableSQL);

      } else printPageDataSheet(response, vars, "", tableSQL);
    } else if (vars.commandIn("SEARCH")) {
vars.getRequestGlobalVariable("inpParamC_BPartner_ID", tabId + "|paramC_BPartner_ID");
vars.getRequestGlobalVariable("inpParamValue", tabId + "|paramValue");
vars.getRequestGlobalVariable("inpParamProduction", tabId + "|paramProduction");
vars.getRequestGlobalVariable("inpParamName", tabId + "|paramName");
vars.getRequestGlobalVariable("inpParamM_Product_Category_ID", tabId + "|paramM_Product_Category_ID");
vars.getRequestGlobalVariable("inpParamProductType", tabId + "|paramProductType");
vars.getRequestGlobalVariable("inpParamTypeofproduct", tabId + "|paramTypeofproduct");
vars.getRequestGlobalVariable("inpParamVendorProductNo", tabId + "|paramVendorProductNo");
vars.getRequestGlobalVariable("inpParamisFreightProduct", tabId + "|paramisFreightProduct");
vars.getRequestGlobalVariable("inpParamisSetItem", tabId + "|paramisSetItem");
vars.getRequestGlobalVariable("inpParamIsSerialTracking", tabId + "|paramIsSerialTracking");
vars.getRequestGlobalVariable("inpParamCustomerProductNo", tabId + "|paramCustomerProductNo");
vars.getRequestGlobalVariable("inpParamUPC", tabId + "|paramUPC");
vars.getRequestGlobalVariable("inpParamDescription", tabId + "|paramDescription");
vars.getRequestGlobalVariable("inpParamDocumentNote", tabId + "|paramDocumentNote");
vars.getRequestGlobalVariable("inpParamIsStocked", tabId + "|paramIsStocked");
vars.getRequestGlobalVariable("inpParamIsPurchased", tabId + "|paramIsPurchased");
vars.getRequestGlobalVariable("inpParamIsSold", tabId + "|paramIsSold");
vars.getRequestGlobalVariable("inpParamManufacturer", tabId + "|paramManufacturer");
vars.getRequestGlobalVariable("inpParamManufacturernumber", tabId + "|paramManufacturernumber");
vars.getRequestGlobalVariable("inpParamAD_Org_ID", tabId + "|paramAD_Org_ID");

      
      
      vars.removeSessionValue(windowId + "|M_Product_ID");
      String strM_Product_ID="";

      String strView = vars.getSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view");
      if (strView.equals("")) strView=defaultTabView;

      if (strView.equals("EDIT")) {
        strM_Product_ID = firstElement(vars, tableSQL);
        if (strM_Product_ID.equals("")) {
          // filter returns empty set
          strView = "RELATION";
          // switch to grid permanently until the user changes the view again
          vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view", strView);
        }
      }

      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strM_Product_ID, tableSQL);

      else printPageDataSheet(response, vars, strM_Product_ID, tableSQL);
    } else if (vars.commandIn("RELATION")) {
      

      String strM_Product_ID = vars.getGlobalVariable("inpmProductId", windowId + "|M_Product_ID", "");
      vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view", "RELATION");
      printPageDataSheet(response, vars, strM_Product_ID, tableSQL);
    } else if (vars.commandIn("NEW")) {


      printPageEdit(response, request, vars, true, "", tableSQL);

    } else if (vars.commandIn("EDIT")) {

      @SuppressWarnings("unused") // In Expense Invoice tab this variable is not used, to be fixed
      String strM_Product_ID = vars.getGlobalVariable("inpmProductId", windowId + "|M_Product_ID", "");
      vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view", "EDIT");

      setHistoryCommand(request, "EDIT");
      printPageEdit(response, request, vars, false, strM_Product_ID, tableSQL);

    } else if (vars.commandIn("NEXT")) {

      String strM_Product_ID = vars.getRequiredStringParameter("inpmProductId");
      
      String strNext = nextElement(vars, strM_Product_ID, tableSQL);

      printPageEdit(response, request, vars, false, strNext, tableSQL);
    } else if (vars.commandIn("PREVIOUS")) {

      String strM_Product_ID = vars.getRequiredStringParameter("inpmProductId");
      
      String strPrevious = previousElement(vars, strM_Product_ID, tableSQL);

      printPageEdit(response, request, vars, false, strPrevious, tableSQL);
    } else if (vars.commandIn("FIRST_RELATION")) {

      vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.initRecordNumber", "0");
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("PREVIOUS_RELATION")) {

      String strInitRecord = vars.getSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      if (strInitRecord.equals("") || strInitRecord.equals("0")) {
        vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.initRecordNumber", "0");
      } else {
        int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
        initRecord -= intRecordRange;
        strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
        vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.initRecordNumber", strInitRecord);
      }
      vars.removeSessionValue(windowId + "|M_Product_ID");

      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("NEXT_RELATION")) {

      String strInitRecord = vars.getSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
      if (initRecord==0) initRecord=1;
      initRecord += intRecordRange;
      strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
      vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.initRecordNumber", strInitRecord);
      vars.removeSessionValue(windowId + "|M_Product_ID");

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

      String strM_Product_ID = vars.getRequiredGlobalVariable("inpmProductId", windowId + "|M_Product_ID");
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
          String strNext = nextElement(vars, strM_Product_ID, tableSQL);
          vars.setSessionValue(windowId + "|M_Product_ID", strNext);
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        } else response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
      }
/*    } else if (vars.commandIn("DELETE_RELATION")) {

      String strM_Product_ID = vars.getRequiredInStringParameter("inpmProductId");
      String message = deleteRelation(vars, strM_Product_ID);
      if (!message.equals("")) {
        bdError(request, response, message, vars.getLanguage());
      } else {
        vars.removeSessionValue(windowId + "|mProductId");
        vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view", "RELATION");
        response.sendRedirect(strDireccion + request.getServletPath());
      }*/
    } else if (vars.commandIn("DELETE")) {

      String strM_Product_ID = vars.getRequiredStringParameter("inpmProductId");
      //ProductF6A25D6EA3384B0C85679865687E51D4Data data = getEditVariables(vars);
      int total = 0;
      OBError myError = null;
      if (org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) {
        myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
        vars.setMessage(tabId, myError);
      } else {
        try {
          total = ProductF6A25D6EA3384B0C85679865687E51D4Data.delete(this, strM_Product_ID, Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), Utility.getContext(this, vars, "#User_Org", windowId, accesslevel));
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
        vars.removeSessionValue(windowId + "|mProductId");
        vars.setSessionValue(tabId + "|ProductF6A25D6EA3384B0C85679865687E51D4.view", "RELATION");
      }
      if (myError==null) {
        myError = Utility.translateError(this, vars, vars.getLanguage(), "@CODE=RowsDeleted");
        myError.setMessage(total + " " + myError.getMessage());
        vars.setMessage(tabId, myError);
      }
      response.sendRedirect(strDireccion + request.getServletPath());

     } else if (vars.commandIn("BUTTONSetready4production22DADA01A94140A3947F85DB13CD8555")) {
        vars.setSessionValue("button22DADA01A94140A3947F85DB13CD8555.strsetready4production", vars.getStringParameter("inpsetready4production"));
        vars.setSessionValue("button22DADA01A94140A3947F85DB13CD8555.strProcessing", vars.getStringParameter("inpprocessing", "Y"));
        vars.setSessionValue("button22DADA01A94140A3947F85DB13CD8555.strOrg", vars.getStringParameter("inpadOrgId"));
        vars.setSessionValue("button22DADA01A94140A3947F85DB13CD8555.strClient", vars.getStringParameter("inpadClientId"));
        
        
        HashMap<String, String> p = new HashMap<String, String>();
        
        
        //Save in session needed params for combos if needed
        vars.setSessionObject("button22DADA01A94140A3947F85DB13CD8555.originalParams", FieldProviderFactory.getFieldProvider(p));
        printPageButtonFS(response, vars, "22DADA01A94140A3947F85DB13CD8555", request.getServletPath());    
     } else if (vars.commandIn("BUTTON22DADA01A94140A3947F85DB13CD8555")) {
        String strM_Product_ID = vars.getGlobalVariable("inpmProductId", windowId + "|M_Product_ID", "");
        String strsetready4production = vars.getSessionValue("button22DADA01A94140A3947F85DB13CD8555.strsetready4production");
        String strProcessing = vars.getSessionValue("button22DADA01A94140A3947F85DB13CD8555.strProcessing");
        String strOrg = vars.getSessionValue("button22DADA01A94140A3947F85DB13CD8555.strOrg");
        String strClient = vars.getSessionValue("button22DADA01A94140A3947F85DB13CD8555.strClient");
        
        
        if ((org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) || !(Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),strClient)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),strOrg))){
          OBError myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
          printPageClosePopUp(response, vars);
        }else{       
          printPageButtonSetready4production22DADA01A94140A3947F85DB13CD8555(response, vars, strM_Product_ID, strsetready4production, strProcessing);
        }

    } else if (vars.commandIn("BUTTONButtoncopyitem36E59A3C3EB54943B7445D527C5DA380")) {
        vars.setSessionValue("button36E59A3C3EB54943B7445D527C5DA380.strbuttoncopyitem", vars.getStringParameter("inpbuttoncopyitem"));
        vars.setSessionValue("button36E59A3C3EB54943B7445D527C5DA380.strProcessing", vars.getStringParameter("inpprocessing", "Y"));
        vars.setSessionValue("button36E59A3C3EB54943B7445D527C5DA380.strOrg", vars.getStringParameter("inpadOrgId"));
        vars.setSessionValue("button36E59A3C3EB54943B7445D527C5DA380.strClient", vars.getStringParameter("inpadClientId"));
        
        
        HashMap<String, String> p = new HashMap<String, String>();
        
        
        //Save in session needed params for combos if needed
        vars.setSessionObject("button36E59A3C3EB54943B7445D527C5DA380.originalParams", FieldProviderFactory.getFieldProvider(p));
        printPageButtonFS(response, vars, "36E59A3C3EB54943B7445D527C5DA380", request.getServletPath());
      } else if (vars.commandIn("BUTTON36E59A3C3EB54943B7445D527C5DA380")) {
        String strM_Product_ID = vars.getGlobalVariable("inpmProductId", windowId + "|M_Product_ID", "");
        String strbuttoncopyitem = vars.getSessionValue("button36E59A3C3EB54943B7445D527C5DA380.strbuttoncopyitem");
        String strProcessing = vars.getSessionValue("button36E59A3C3EB54943B7445D527C5DA380.strProcessing");
        String strOrg = vars.getSessionValue("button36E59A3C3EB54943B7445D527C5DA380.strOrg");
        String strClient = vars.getSessionValue("button36E59A3C3EB54943B7445D527C5DA380.strClient");

        
        if ((org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) || !(Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),strClient)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),strOrg))){
          OBError myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
          vars.setMessage(tabId, myError);
          printPageClosePopUp(response, vars);
        }else{       
          printPageButtonButtoncopyitem36E59A3C3EB54943B7445D527C5DA380(response, vars, strM_Product_ID, strbuttoncopyitem, strProcessing);
        }

    } else if (vars.commandIn("SAVE_BUTTONSetready4production22DADA01A94140A3947F85DB13CD8555")) {
        String strM_Product_ID = vars.getGlobalVariable("inpKey", windowId + "|M_Product_ID", "");
        @SuppressWarnings("unused")
        String strsetready4production = vars.getStringParameter("inpsetready4production");
        String strProcessing = vars.getStringParameter("inpprocessing");
        OBError myMessage = null;
        try {
          String pinstance = SequenceIdData.getUUID();
          PInstanceProcessData.insertPInstance(this, pinstance, "22DADA01A94140A3947F85DB13CD8555", (("M_Product_ID".equalsIgnoreCase("AD_Language"))?"0":strM_Product_ID), strProcessing, vars.getUser(), vars.getClient(), vars.getOrg());
          
          
          ProcessBundle bundle = ProcessBundle.pinstance(pinstance, vars, this);
          new ProcessRunner(bundle).execute(this);
          
          PInstanceProcessData[] pinstanceData = PInstanceProcessData.select(this, pinstance);
          myMessage = Utility.getProcessInstanceMessage(this, vars, pinstanceData);
        } catch (ServletException ex) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          if (!myMessage.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myMessage);
        }
        //close popup
        if (myMessage!=null) {
          if (log4j.isDebugEnabled()) log4j.debug(myMessage.getMessage());
          vars.setMessage(tabId, myMessage);
        }
        printPageClosePopUp(response, vars);

    } else if (vars.commandIn("SAVE_BUTTONButtoncopyitem36E59A3C3EB54943B7445D527C5DA380")) {
        String strM_Product_ID = vars.getGlobalVariable("inpKey", windowId + "|M_Product_ID", "");
        
        ProcessBundle pb = new ProcessBundle("36E59A3C3EB54943B7445D527C5DA380", vars).init(this);
        HashMap<String, Object> params= new HashMap<String, Object>();
       
        params.put("M_Product_ID", strM_Product_ID);
        params.put("adOrgId", vars.getStringParameter("inpadOrgId"));
        params.put("adClientId", vars.getStringParameter("inpadClientId"));
        String strvalue = vars.getStringParameter("inpvalue");
params.put("value", strvalue);
String strname = vars.getStringParameter("inpname");
params.put("name", strname);

        
        pb.setParams(params);
        OBError myMessage = null;
        try {
          new ProcessRunner(pb).execute(this);
          myMessage = (OBError) pb.getResult();
          myMessage.setMessage(Utility.parseTranslation(this, vars, vars.getLanguage(), myMessage.getMessage()));
          myMessage.setTitle(Utility.parseTranslation(this, vars, vars.getLanguage(), myMessage.getTitle()));
        } catch (Exception ex) {
          myMessage = Utility.translateError(this, vars, vars.getLanguage(), ex.getMessage());
          log4j.error(ex);
          if (!myMessage.isConnectionAvailable()) {
            bdErrorConnection(response);
            return;
          } else vars.setMessage(tabId, myMessage);
        }
        //close popup
        if (myMessage!=null) {
          if (log4j.isDebugEnabled()) log4j.debug(myMessage.getMessage());
          vars.setMessage(tabId, myMessage);
        }
        printPageClosePopUp(response, vars);





    } else if (vars.getCommand().toUpperCase().startsWith("BUTTON") || vars.getCommand().toUpperCase().startsWith("SAVE_BUTTON")) {
      pageErrorPopUp(response);
    } else pageError(response);
  }
/*
  String deleteRelation(VariablesSecureApp vars, String strM_Product_ID) throws IOException, ServletException {
    log4j.debug("Deleting records");
    Connection conn = this.getTransactionConnection();
    try {
      if (strM_Product_ID.startsWith("(")) strM_Product_ID = strM_Product_ID.substring(1, strM_Product_ID.length()-1);
      if (!strM_Product_ID.equals("")) {
        strM_Product_ID = Replace.replace(strM_Product_ID, "'", "");
        StringTokenizer st = new StringTokenizer(strM_Product_ID, ",", false);
        while (st.hasMoreTokens()) {
          String strKey = st.nextToken();
          if (ProductF6A25D6EA3384B0C85679865687E51D4Data.deleteTransactional(conn, this, strKey)==0) {
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
  private ProductF6A25D6EA3384B0C85679865687E51D4Data getEditVariables(Connection con, VariablesSecureApp vars) throws IOException,ServletException {
    ProductF6A25D6EA3384B0C85679865687E51D4Data data = new ProductF6A25D6EA3384B0C85679865687E51D4Data();
    ServletException ex = null;
    try {
    data.adClientId = vars.getRequestGlobalVariable("inpadClientId", windowId + "|AD_Client_ID");     data.adClientIdr = vars.getStringParameter("inpadClientId_R");     data.adOrgId = vars.getRequestGlobalVariable("inpadOrgId", windowId + "|AD_Org_ID");     data.adOrgIdr = vars.getStringParameter("inpadOrgId_R");     data.adImageId = vars.getStringParameter("inpadImageId");     data.imageurl = vars.getStringParameter("inpimageurl");     data.value = vars.getRequestGlobalVariable("inpvalue", windowId + "|Value");     data.upc = vars.getStringParameter("inpupc");     data.name = vars.getRequestGlobalVariable("inpname", windowId + "|Name");     data.descriptionurl = vars.getStringParameter("inpdescriptionurl");     data.description = vars.getStringParameter("inpdescription");     data.documentnote = vars.getStringParameter("inpdocumentnote");     data.mProductCategoryId = vars.getStringParameter("inpmProductCategoryId");     data.mProductCategoryIdr = vars.getStringParameter("inpmProductCategoryId_R");     data.typeofproduct = vars.getStringParameter("inptypeofproduct");     data.typeofproductr = vars.getStringParameter("inptypeofproduct_R");     data.cUomId = vars.getStringParameter("inpcUomId");     data.cUomIdr = vars.getStringParameter("inpcUomId_R");     data.mAttributesetId = vars.getStringParameter("inpmAttributesetId");     data.mAttributesetIdr = vars.getStringParameter("inpmAttributesetId_R");     data.producttype = vars.getStringParameter("inpproducttype");     data.producttyper = vars.getStringParameter("inpproducttype_R");     data.isstocked = vars.getStringParameter("inpisstocked", "N");     data.mLocatorId = vars.getStringParameter("inpmLocatorId");     data.mLocatorIdr = vars.getStringParameter("inpmLocatorId_R");     data.issold = vars.getStringParameter("inpissold", "N");     data.cTaxId = vars.getStringParameter("inpcTaxId");     data.cTaxIdr = vars.getStringParameter("inpcTaxId_R");     data.customerproductno = vars.getStringParameter("inpcustomerproductno");     data.customerproducttext = vars.getStringParameter("inpcustomerproducttext");     data.discontinued = vars.getStringParameter("inpdiscontinued", "N");     data.discontinuedby = vars.getStringParameter("inpdiscontinuedby");     data.isserialtracking = vars.getStringParameter("inpisserialtracking", "N");     data.isbatchtracking = vars.getStringParameter("inpisbatchtracking", "N");    try {   data.weight = vars.getNumericParameter("inpweight");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.volume = vars.getNumericParameter("inpvolume");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.shelfwidth = vars.getNumericParameter("inpshelfwidth");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.shelfheight = vars.getNumericParameter("inpshelfheight");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.shelfdepth = vars.getNumericParameter("inpshelfdepth");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.unitsperpallet = vars.getNumericParameter("inpunitsperpallet");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.cutoff = vars.getNumericParameter("inpcutoff");  } catch (ServletException paramEx) { ex = paramEx; }     data.isconsumable = vars.getStringParameter("inpisconsumable", "N");     data.issparepart = vars.getStringParameter("inpissparepart", "N");     data.issetitem = vars.getStringParameter("inpissetitem", "N");     data.isfreightproduct = vars.getStringParameter("inpisfreightproduct", "N");     data.production = vars.getStringParameter("inpproduction", "N");     data.isbom = vars.getRequiredInputGlobalVariable("inpisbom", windowId + "|IsBOM", "N");     data.isverified = vars.getStringParameter("inpisverified", "N");     data.buttoncopyitem = vars.getStringParameter("inpbuttoncopyitem");     data.setready4production = vars.getRequestGlobalVariable("inpsetready4production", windowId + "|Setready4production");     data.isactive = vars.getStringParameter("inpisactive", "N");     data.issummary = vars.getStringParameter("inpissummary", "N");     data.manufacturer = vars.getStringParameter("inpmanufacturer");     data.versionno = vars.getStringParameter("inpversionno");     data.cBpartnerId = vars.getStringParameter("inpcBpartnerId");    try {   data.qtymin = vars.getNumericParameter("inpqtymin");  } catch (ServletException paramEx) { ex = paramEx; }     data.issummaryitem = vars.getStringParameter("inpissummaryitem", "N");     data.theme = vars.getStringParameter("inptheme");     data.manufacturernumber = vars.getStringParameter("inpmanufacturernumber");     data.mrpPlanningmethodId = vars.getStringParameter("inpmrpPlanningmethodId");    try {   data.colorcount = vars.getNumericParameter("inpcolorcount");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.stockMin = vars.getNumericParameter("inpstockMin");  } catch (ServletException paramEx) { ex = paramEx; }     data.sku = vars.getStringParameter("inpsku");     data.text = vars.getStringParameter("inptext");    try {   data.length = vars.getNumericParameter("inplength");  } catch (ServletException paramEx) { ex = paramEx; }     data.ispriceprinted = vars.getStringParameter("inpispriceprinted", "N");    try {   data.stockmin = vars.getNumericParameter("inpstockmin");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.coststd = vars.getNumericParameter("inpcoststd");  } catch (ServletException paramEx) { ex = paramEx; }     data.sResourceId = vars.getStringParameter("inpsResourceId");    try {   data.width = vars.getNumericParameter("inpwidth");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.capacity = vars.getNumericParameter("inpcapacity");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.qtymax = vars.getNumericParameter("inpqtymax");  } catch (ServletException paramEx) { ex = paramEx; }     data.maProcessplanId = vars.getStringParameter("inpmaProcessplanId");     data.mFreightcategoryId = vars.getStringParameter("inpmFreightcategoryId");     data.isinvoiceprintdetails = vars.getStringParameter("inpisinvoiceprintdetails", "N");     data.qtytype = vars.getStringParameter("inpqtytype", "N");     data.name2 = vars.getStringParameter("inpname2");     data.calculated = vars.getStringParameter("inpcalculated", "N");    try {   data.guaranteedays = vars.getNumericParameter("inpguaranteedays");  } catch (ServletException paramEx) { ex = paramEx; }     data.ispurchased = vars.getStringParameter("inpispurchased", "N");     data.processing = vars.getStringParameter("inpprocessing");     data.mAttributesetinstanceId = vars.getStringParameter("inpmAttributesetinstanceId");    try {   data.delaymin = vars.getNumericParameter("inpdelaymin");  } catch (ServletException paramEx) { ex = paramEx; }     data.salesrepId = vars.getStringParameter("inpsalesrepId");     data.enforceAttribute = vars.getStringParameter("inpenforceAttribute", "N");     data.sExpensetypeId = vars.getStringParameter("inpsExpensetypeId");     data.ispicklistprintdetails = vars.getStringParameter("inpispicklistprintdetails", "N");    try {   data.corediameter = vars.getNumericParameter("inpcorediameter");  } catch (ServletException paramEx) { ex = paramEx; }     data.help = vars.getStringParameter("inphelp");     data.downloadurl = vars.getStringParameter("inpdownloadurl");     data.palettetype = vars.getStringParameter("inppalettetype");     data.classification = vars.getStringParameter("inpclassification");     data.buttonprintbom = vars.getStringParameter("inpbuttonprintbom");     data.isserviceitem = vars.getStringParameter("inpisserviceitem", "N");     data.vendorproductno = vars.getStringParameter("inpvendorproductno");     data.costtype = vars.getStringParameter("inpcosttype");    try {   data.qtystd = vars.getNumericParameter("inpqtystd");  } catch (ServletException paramEx) { ex = paramEx; }     data.mProductId = vars.getRequestGlobalVariable("inpmProductId", windowId + "|M_Product_ID");     data.mrpPlannerId = vars.getStringParameter("inpmrpPlannerId"); 
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

   private ProductF6A25D6EA3384B0C85679865687E51D4Data[] getRelationData(ProductF6A25D6EA3384B0C85679865687E51D4Data[] data) {
    if (data!=null) {
      for (int i=0;i<data.length;i++) {        data[i].adClientId = FormatUtilities.truncate(data[i].adClientId, 44);        data[i].adOrgId = FormatUtilities.truncate(data[i].adOrgId, 44);        data[i].adImageId = FormatUtilities.truncate(data[i].adImageId, 50);        data[i].imageurl = FormatUtilities.truncate(data[i].imageurl, 40);        data[i].value = FormatUtilities.truncate(data[i].value, 40);        data[i].upc = FormatUtilities.truncate(data[i].upc, 30);        data[i].name = FormatUtilities.truncate(data[i].name, 40);        data[i].descriptionurl = FormatUtilities.truncate(data[i].descriptionurl, 40);        data[i].description = FormatUtilities.truncate(data[i].description, 50);        data[i].documentnote = FormatUtilities.truncate(data[i].documentnote, 50);        data[i].mProductCategoryId = FormatUtilities.truncate(data[i].mProductCategoryId, 37);        data[i].typeofproduct = FormatUtilities.truncate(data[i].typeofproduct, 14);        data[i].cUomId = FormatUtilities.truncate(data[i].cUomId, 44);        data[i].mAttributesetId = FormatUtilities.truncate(data[i].mAttributesetId, 40);        data[i].producttype = FormatUtilities.truncate(data[i].producttype, 21);        data[i].mLocatorId = FormatUtilities.truncate(data[i].mLocatorId, 44);        data[i].cTaxId = FormatUtilities.truncate(data[i].cTaxId, 45);        data[i].customerproductno = FormatUtilities.truncate(data[i].customerproductno, 50);        data[i].customerproducttext = FormatUtilities.truncate(data[i].customerproducttext, 50);        data[i].manufacturer = FormatUtilities.truncate(data[i].manufacturer, 50);        data[i].versionno = FormatUtilities.truncate(data[i].versionno, 20);        data[i].cBpartnerId = FormatUtilities.truncate(data[i].cBpartnerId, 23);        data[i].theme = FormatUtilities.truncate(data[i].theme, 50);        data[i].manufacturernumber = FormatUtilities.truncate(data[i].manufacturernumber, 50);        data[i].mrpPlanningmethodId = FormatUtilities.truncate(data[i].mrpPlanningmethodId, 32);        data[i].sku = FormatUtilities.truncate(data[i].sku, 30);        data[i].text = FormatUtilities.truncate(data[i].text, 50);        data[i].sResourceId = FormatUtilities.truncate(data[i].sResourceId, 44);        data[i].maProcessplanId = FormatUtilities.truncate(data[i].maProcessplanId, 12);        data[i].mFreightcategoryId = FormatUtilities.truncate(data[i].mFreightcategoryId, 22);        data[i].name2 = FormatUtilities.truncate(data[i].name2, 50);        data[i].mAttributesetinstanceId = FormatUtilities.truncate(data[i].mAttributesetinstanceId, 22);        data[i].salesrepId = FormatUtilities.truncate(data[i].salesrepId, 44);        data[i].sExpensetypeId = FormatUtilities.truncate(data[i].sExpensetypeId, 44);        data[i].help = FormatUtilities.truncate(data[i].help, 50);        data[i].downloadurl = FormatUtilities.truncate(data[i].downloadurl, 50);        data[i].palettetype = FormatUtilities.truncate(data[i].palettetype, 50);        data[i].classification = FormatUtilities.truncate(data[i].classification, 1);        data[i].vendorproductno = FormatUtilities.truncate(data[i].vendorproductno, 40);        data[i].costtype = FormatUtilities.truncate(data[i].costtype, 50);        data[i].mProductId = FormatUtilities.truncate(data[i].mProductId, 10);        data[i].mrpPlannerId = FormatUtilities.truncate(data[i].mrpPlannerId, 32);}
    }
    return data;
  }



    private void refreshSessionEdit(VariablesSecureApp vars, FieldProvider[] data) {
      if (data==null || data.length==0) return;
          vars.setSessionValue(windowId + "|AD_Client_ID", data[0].getField("adClientId"));    vars.setSessionValue(windowId + "|AD_Org_ID", data[0].getField("adOrgId"));    vars.setSessionValue(windowId + "|Value", data[0].getField("value"));    vars.setSessionValue(windowId + "|Name", data[0].getField("name"));    vars.setSessionValue(windowId + "|IsBOM", data[0].getField("isbom"));    vars.setSessionValue(windowId + "|Setready4production", data[0].getField("setready4production"));    vars.setSessionValue(windowId + "|M_Product_ID", data[0].getField("mProductId"));
    }

    private void refreshSessionNew(VariablesSecureApp vars) throws IOException,ServletException {
      ProductF6A25D6EA3384B0C85679865687E51D4Data[] data = ProductF6A25D6EA3384B0C85679865687E51D4Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), vars.getStringParameter("inpmProductId", ""), Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
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

  private void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, String strM_Product_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: dataSheet");

    String strParamC_BPartner_ID = vars.getSessionValue(tabId + "|paramC_BPartner_ID");
String strParamValue = vars.getSessionValue(tabId + "|paramValue");
String strParamProduction = vars.getSessionValue(tabId + "|paramProduction");
String strParamName = vars.getSessionValue(tabId + "|paramName");
String strParamM_Product_Category_ID = vars.getSessionValue(tabId + "|paramM_Product_Category_ID");
String strParamProductType = vars.getSessionValue(tabId + "|paramProductType");
String strParamTypeofproduct = vars.getSessionValue(tabId + "|paramTypeofproduct");
String strParamVendorProductNo = vars.getSessionValue(tabId + "|paramVendorProductNo");
String strParamisFreightProduct = vars.getSessionValue(tabId + "|paramisFreightProduct");
String strParamisSetItem = vars.getSessionValue(tabId + "|paramisSetItem");
String strParamIsSerialTracking = vars.getSessionValue(tabId + "|paramIsSerialTracking");
String strParamCustomerProductNo = vars.getSessionValue(tabId + "|paramCustomerProductNo");
String strParamUPC = vars.getSessionValue(tabId + "|paramUPC");
String strParamDescription = vars.getSessionValue(tabId + "|paramDescription");
String strParamDocumentNote = vars.getSessionValue(tabId + "|paramDocumentNote");
String strParamIsStocked = vars.getSessionValue(tabId + "|paramIsStocked");
String strParamIsPurchased = vars.getSessionValue(tabId + "|paramIsPurchased");
String strParamIsSold = vars.getSessionValue(tabId + "|paramIsSold");
String strParamManufacturer = vars.getSessionValue(tabId + "|paramManufacturer");
String strParamManufacturernumber = vars.getSessionValue(tabId + "|paramManufacturernumber");
String strParamAD_Org_ID = vars.getSessionValue(tabId + "|paramAD_Org_ID");

    
    boolean hasSearchCondition=false;
    vars.removeEditionData(tabId);
    if (!(strParamC_BPartner_ID.equals("") && strParamValue.equals("") && strParamProduction.equals("") && strParamName.equals("") && strParamM_Product_Category_ID.equals("") && strParamProductType.equals("") && strParamTypeofproduct.equals("") && strParamVendorProductNo.equals("") && strParamisFreightProduct.equals("") && strParamisSetItem.equals("") && strParamIsSerialTracking.equals("") && strParamCustomerProductNo.equals("") && strParamUPC.equals("") && strParamDescription.equals("") && strParamDocumentNote.equals("") && strParamIsStocked.equals("") && strParamIsPurchased.equals("") && strParamIsSold.equals("") && strParamManufacturer.equals("") && strParamManufacturernumber.equals("") && strParamAD_Org_ID.equals(""))) hasSearchCondition=true;
    String strOffset = "0";
    //vars.getSessionValue(tabId + "|offset");
    String selectedRow = "0";
    if (!strM_Product_ID.equals("")) {
      selectedRow = Integer.toString(getKeyPosition(vars, strM_Product_ID, tableSQL));
    }

    String[] discard={"isNotFiltered","isNotTest"};
    if (hasSearchCondition) discard[0] = new String("isFiltered");
    if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpWindows/com/elreha/sales/SalesProduct/ProductF6A25D6EA3384B0C85679865687E51D4_Relation", discard).createXmlDocument();

    ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "ProductF6A25D6EA3384B0C85679865687E51D4", false, "document.frmMain.inpmProductId", "grid", "..", "".equals("Y"), "SalesProduct", strReplaceWith, false);
    toolbar.prepareRelationTemplate("Y".equals("Y"), hasSearchCondition, !vars.getSessionValue("#ShowTest", "N").equals("Y"), false, Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
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
    xmlDocument.setParameter("KeyName", "mProductId");
    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("theme", vars.getTheme());
    //xmlDocument.setParameter("buttonReference", Utility.messageBD(this, "Reference", vars.getLanguage()));
    try {
      WindowTabs tabs = new WindowTabs(this, vars, tabId, windowId, false);
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "ProductF6A25D6EA3384B0C85679865687E51D4_Relation.html", "SalesProduct", "W", strReplaceWith, tabs.breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "ProductF6A25D6EA3384B0C85679865687E51D4_Relation.html", strReplaceWith);
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

  private void printPageEdit(HttpServletResponse response, HttpServletRequest request, VariablesSecureApp vars,boolean boolNew, String strM_Product_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: edit");
    
    HashMap<String, String> usedButtonShortCuts;
  
    HashMap<String, String> reservedButtonShortCuts;
  
    usedButtonShortCuts = new HashMap<String, String>();
    
    reservedButtonShortCuts = new HashMap<String, String>();
    
    
    
    String strOrderByFilter = vars.getSessionValue(tabId + "|orderby");
    String orderClause = " M_Product.Value";
    if (strOrderByFilter==null || strOrderByFilter.equals("")) strOrderByFilter = orderClause;
    /*{
      if (!strOrderByFilter.equals("") && !orderClause.equals("")) strOrderByFilter += ", ";
      strOrderByFilter += orderClause;
    }*/
    
    
    String strCommand = null;
    ProductF6A25D6EA3384B0C85679865687E51D4Data[] data=null;
    XmlDocument xmlDocument=null;
    FieldProvider dataField = vars.getEditionData(tabId);
    vars.removeEditionData(tabId);
    String strParamC_BPartner_ID = vars.getSessionValue(tabId + "|paramC_BPartner_ID");
String strParamValue = vars.getSessionValue(tabId + "|paramValue");
String strParamProduction = vars.getSessionValue(tabId + "|paramProduction");
String strParamName = vars.getSessionValue(tabId + "|paramName");
String strParamM_Product_Category_ID = vars.getSessionValue(tabId + "|paramM_Product_Category_ID");
String strParamProductType = vars.getSessionValue(tabId + "|paramProductType");
String strParamTypeofproduct = vars.getSessionValue(tabId + "|paramTypeofproduct");
String strParamVendorProductNo = vars.getSessionValue(tabId + "|paramVendorProductNo");
String strParamisFreightProduct = vars.getSessionValue(tabId + "|paramisFreightProduct");
String strParamisSetItem = vars.getSessionValue(tabId + "|paramisSetItem");
String strParamIsSerialTracking = vars.getSessionValue(tabId + "|paramIsSerialTracking");
String strParamCustomerProductNo = vars.getSessionValue(tabId + "|paramCustomerProductNo");
String strParamUPC = vars.getSessionValue(tabId + "|paramUPC");
String strParamDescription = vars.getSessionValue(tabId + "|paramDescription");
String strParamDocumentNote = vars.getSessionValue(tabId + "|paramDocumentNote");
String strParamIsStocked = vars.getSessionValue(tabId + "|paramIsStocked");
String strParamIsPurchased = vars.getSessionValue(tabId + "|paramIsPurchased");
String strParamIsSold = vars.getSessionValue(tabId + "|paramIsSold");
String strParamManufacturer = vars.getSessionValue(tabId + "|paramManufacturer");
String strParamManufacturernumber = vars.getSessionValue(tabId + "|paramManufacturernumber");
String strParamAD_Org_ID = vars.getSessionValue(tabId + "|paramAD_Org_ID");

    boolean hasSearchCondition=false;
    if (!(strParamC_BPartner_ID.equals("") && strParamValue.equals("") && strParamProduction.equals("") && strParamName.equals("") && strParamM_Product_Category_ID.equals("") && strParamProductType.equals("") && strParamTypeofproduct.equals("") && strParamVendorProductNo.equals("") && strParamisFreightProduct.equals("") && strParamisSetItem.equals("") && strParamIsSerialTracking.equals("") && strParamCustomerProductNo.equals("") && strParamUPC.equals("") && strParamDescription.equals("") && strParamDocumentNote.equals("") && strParamIsStocked.equals("") && strParamIsPurchased.equals("") && strParamIsSold.equals("") && strParamManufacturer.equals("") && strParamManufacturernumber.equals("") && strParamAD_Org_ID.equals(""))) hasSearchCondition=true;

       String strParamSessionDate = vars.getGlobalVariable("inpParamSessionDate", Utility.getTransactionalDate(this, vars, windowId), "");
      String buscador = "";
      String[] discard = {"", "isNotTest"};
      
      if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    if (dataField==null) {
      if (!boolNew) {
        discard[0] = new String("newDiscard");
        data = ProductF6A25D6EA3384B0C85679865687E51D4Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), strM_Product_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
  
        if (!strM_Product_ID.equals("") && (data == null || data.length==0)) {
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
          return;
        }
        refreshSessionEdit(vars, data);
        strCommand = "EDIT";
      }

      if (boolNew || data==null || data.length==0) {
        discard[0] = new String ("editDiscard");
        strCommand = "NEW";
        data = new ProductF6A25D6EA3384B0C85679865687E51D4Data[0];
      } else {
        discard[0] = new String ("newDiscard");
      }
    } else {
      if (dataField.getField("mProductId") == null || dataField.getField("mProductId").equals("")) {
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
        data = ProductF6A25D6EA3384B0C85679865687E51D4Data.set(Utility.getDefault(this, vars, "Manufacturer", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "IsSummaryItem", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "CoreDiameter", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "isSetItem", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), "Y", Utility.getDefault(this, vars, "M_Product_Category_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "isVerified", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "Volume", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Stockmin", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "ShelfDepth", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Costtype", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "S_ExpenseType_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "C_Tax_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "DescriptionURL", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "CreatedBy", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), ProductF6A25D6EA3384B0C85679865687E51D4Data.selectDef1407_0(this, Utility.getDefault(this, vars, "CreatedBy", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField)), Utility.getDefault(this, vars, "ImageURL", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), ProductF6A25D6EA3384B0C85679865687E51D4Data.selectDef2011(this, Utility.getContext(this, vars, "AD_ORG_ID", "6614375915A04200ACCE9C693F0651E2")), Utility.getDefault(this, vars, "Theme", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), ProductF6A25D6EA3384B0C85679865687E51D4Data.selectDef1760(this), Utility.getDefault(this, vars, "IsInvoicePrintDetails", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "MRP_Planner_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "UnitsPerPallet", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Setready4production", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "Delaymin", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "VendorProductNo", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "ShelfHeight", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "IsSerialTracking", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "MA_Processplan_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Help", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Production", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "Isbatchtracking", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "Name", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Ispriceprinted", "Y", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), "", Utility.getDefault(this, vars, "SKU", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "isSparePart", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), ProductF6A25D6EA3384B0C85679865687E51D4Data.selectDef2304(this, Utility.getContext(this, vars, "AD_ORG_ID", "6614375915A04200ACCE9C693F0651E2")), Utility.getDefault(this, vars, "AD_Image_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "DownloadURL", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "AD_Client_ID", "@AD_CLIENT_ID@", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "isServiceItem", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "M_Locator_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), ProductF6A25D6EA3384B0C85679865687E51D4Data.selectDef9420_1(this, Utility.getDefault(this, vars, "M_Locator_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField)), Utility.getDefault(this, vars, "IsSummary", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "IsSold", "Y", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "M_AttributeSetInstance_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Classification", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "VersionNo", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Colorcount", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Buttonprintbom", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "Discontinued", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "CustomerProductNo", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Qtystd", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Text", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Calculated", "Y", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "isConsumable", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "Qtymax", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "S_Resource_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Description", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Palettetype", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Typeofproduct", "ST", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Processing", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "Manufacturernumber", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Name2", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Width", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Qtytype", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "Enforce_Attribute", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "DiscontinuedBy", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "IsStocked", "Y", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "AD_Org_ID", "@AD_Org_ID@", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Buttoncopyitem", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "Stock_Min", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Customerproducttext", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "ProductType", "I", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "SalesRep_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "isFreightProduct", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "MRP_Planningmethod_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "IsBOM", "N", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "C_BPartner_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "GuaranteeDays", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "ShelfWidth", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "UpdatedBy", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), ProductF6A25D6EA3384B0C85679865687E51D4Data.selectDef1409_2(this, Utility.getDefault(this, vars, "UpdatedBy", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField)), Utility.getDefault(this, vars, "Capacity", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Cutoff", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Qtymin", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "IsPurchased", "Y", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField), Utility.getDefault(this, vars, "M_FreightCategory_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Weight", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "DocumentNote", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Coststd", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "M_AttributeSet_ID", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "Length", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "", dataField), Utility.getDefault(this, vars, "IsPickListPrintDetails", "", "6614375915A04200ACCE9C693F0651E2", "F6A25D6EA3384B0C85679865687E51D4", "N", dataField));
        
      }
    } else {
      data = new ProductF6A25D6EA3384B0C85679865687E51D4Data[1];
      java.lang.Object  ref1= dataField;
      data[0]=(ProductF6A25D6EA3384B0C85679865687E51D4Data) ref1;
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
    
    ToolBar toolbar = new ToolBar(this, editableTab, vars.getLanguage(), "ProductF6A25D6EA3384B0C85679865687E51D4", (strCommand.equals("NEW") || boolNew || (dataField==null && (data==null || data.length==0))), "document.frmMain.inpmProductId", "", "..", "".equals("Y"), "SalesProduct", strReplaceWith, true, false, false, Utility.hasTabAttachments(this, vars, tabId, strM_Product_ID));
    toolbar.prepareEditionTemplate("Y".equals("Y"), hasSearchCondition, vars.getSessionValue("#ShowTest", "N").equals("Y"), "STD", Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    
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
  
    void printPageButtonSetready4production22DADA01A94140A3947F85DB13CD8555(HttpServletResponse response, VariablesSecureApp vars, String strM_Product_ID, String strsetready4production, String strProcessing)
    throws IOException, ServletException {
     
    Scripthelper script = new Scripthelper();
      Formhelper fh=new Formhelper();
      
      try {
        String name= LocalizationUtils.getProcessTitle(this, "22DADA01A94140A3947F85DB13CD8555",vars.getLanguage());
        String info = LocalizationUtils.getProcessInfo(this, "22DADA01A94140A3947F85DB13CD8555" ,vars.getLanguage());
        if (! info.isEmpty())
          info = ConfigureInfobar.doConfigure(this, vars, script, info, "");
        
        String strFG="<table cellspacing=\"0\" cellpadding=\"0\" class=\"Form_Table\"> <colgroup span=\"4\"></colgroup><tr><td colspan=\"4\"></td></tr><tr><td></td></tr></table>";
        
        strFG=strFG + fh.prepareProcessParameters(this, vars, script,"22DADA01A94140A3947F85DB13CD8555" );
        String isDocAction=UtilsData.isProcessDocAction(this, "22DADA01A94140A3947F85DB13CD8555");
        if (Integer.parseInt(isDocAction)>0) {
            String strdocstatus=UtilsData.getDocStatus(this, "208",strM_Product_ID);
            FieldProvider[] dataDocAction = DocActionWorkflowOptions.docAction(this, vars, "", "", strdocstatus,"N",
            "208", strM_Product_ID);
            
            strFG=strFG + "<table cellspacing=\"0\" cellpadding=\"0\" class=\"Form_Table\"> <colgroup span=\"4\"></colgroup><tr><td colspan=\"4\"></td></tr><tr>";
            
            strFG=strFG + ConfigureSelectBox.doConfigure(this,vars,script,"docaction", 0,3,true,false,"", strsetready4production, dataDocAction, "ID","",true,"");
            
            strFG=strFG + "</tr></table>";
            
        }
        String strSkeleton = ConfigurePopup.doConfigure(this,vars,script,name, "buttonok");
        
            String strActionButtons= "<table cellspacing=\"0\" cellpadding=\"0\" class=\"Form_Table\"> <colgroup span=\"4\"></colgroup><tr><td colspan=\"4\"></td></tr><tr>";
        
        String isJasper=UtilsData.isProcessJasper(this, "22DADA01A94140A3947F85DB13CD8555");
        if (isJasper.equals("N"))
          strActionButtons= strActionButtons + ConfigureButton.doConfigure(this,vars,script,"buttonok",1,1,false, "ok",  "submitThisPage('SAVE_BUTTONSetready4production" + "22DADA01A94140A3947F85DB13CD8555" + "');", "","") + "";
        else
          strActionButtons= strActionButtons + ConfigureButton.doConfigure(this,vars,script,"buttonok",1,1,false, "ok",  "submitThisPageJasper();", "","") + "";
        strActionButtons= strActionButtons + ConfigureButton.doConfigure(this,vars,script,"buttonCancel",0,1,false, "cancel", "closeThisPage();", "","");
        
        strActionButtons= strActionButtons + "</tr></table>";
        
        script.enableshortcuts("POPUP");
        strSkeleton=Replace.replace(strSkeleton,"ActionButton_Responser.html","ProductF6A25D6EA3384B0C85679865687E51D4_Edition.html");
        String strOutput=Replace.replace(strSkeleton, "@CONTENT@",info +  strFG +strActionButtons); 
        script.addSubmitPagePageSripts();
        
        script.addHiddenfield("inpadProcessId", "22DADA01A94140A3947F85DB13CD8555");
        script.addHiddenfield("inpKey",strM_Product_ID);
        script.addHiddenfield("inpprocessing",strProcessing);
        OBError myMessage = vars.getMessage("22DADA01A94140A3947F85DB13CD8555");
        vars.removeMessage("22DADA01A94140A3947F85DB13CD8555");
        if (myMessage!=null) {
          script.addMessage(this, vars, myMessage);
        }
        strOutput = script.doScript(strOutput, "",this,vars);
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(strOutput);
        out.close();
      } catch (Exception ex) {
        throw new ServletException(ex);
      }
    }



    void printPageButtonButtoncopyitem36E59A3C3EB54943B7445D527C5DA380(HttpServletResponse response, VariablesSecureApp vars, String strM_Product_ID, String strbuttoncopyitem, String strProcessing)
    throws IOException, ServletException {
     
    Scripthelper script = new Scripthelper();
      Formhelper fh=new Formhelper();
      
      try {
        String name= LocalizationUtils.getProcessTitle(this, "36E59A3C3EB54943B7445D527C5DA380",vars.getLanguage());
        String info = LocalizationUtils.getProcessInfo(this, "36E59A3C3EB54943B7445D527C5DA380" ,vars.getLanguage());
        if (! info.isEmpty())
          info = ConfigureInfobar.doConfigure(this, vars, script, info, "");
        
        String strFG="<table cellspacing=\"0\" cellpadding=\"0\" class=\"Form_Table\"> <colgroup span=\"4\"></colgroup><tr><td colspan=\"4\"></td></tr><tr><td></td></tr></table>";
        
        strFG=strFG + fh.prepareProcessParameters(this, vars, script,"36E59A3C3EB54943B7445D527C5DA380" );
        String isDocAction=UtilsData.isProcessDocAction(this, "36E59A3C3EB54943B7445D527C5DA380");
        
        String strSkeleton = ConfigurePopup.doConfigure(this,vars,script,name, "buttonok");
        
            String strActionButtons= "<table cellspacing=\"0\" cellpadding=\"0\" class=\"Form_Table\"> <colgroup span=\"4\"></colgroup><tr><td colspan=\"4\"></td></tr><tr>";
        
        String isJasper=UtilsData.isProcessJasper(this, "36E59A3C3EB54943B7445D527C5DA380");
        if (isJasper.equals("N"))
          strActionButtons= strActionButtons + ConfigureButton.doConfigure(this,vars,script,"buttonok",1,1,false, "ok",  "submitThisPage('SAVE_BUTTONButtoncopyitem" + "36E59A3C3EB54943B7445D527C5DA380" + "');", "","") + "";
        else
          strActionButtons= strActionButtons + ConfigureButton.doConfigure(this,vars,script,"buttonok",1,1,false, "ok",  "submitThisPageJasper();", "","") + "";
        strActionButtons= strActionButtons + ConfigureButton.doConfigure(this,vars,script,"buttonCancel",0,1,false, "cancel", "closeThisPage();", "","");
        
        strActionButtons= strActionButtons + "</tr></table>";
        
        script.enableshortcuts("POPUP");
        strSkeleton=Replace.replace(strSkeleton,"ActionButton_Responser.html","ProductF6A25D6EA3384B0C85679865687E51D4_Edition.html");
        String strOutput=Replace.replace(strSkeleton, "@CONTENT@",info +  strFG +strActionButtons); 
        script.addSubmitPagePageSripts();
        
        script.addHiddenfield("inpadProcessId", "36E59A3C3EB54943B7445D527C5DA380");
        script.addHiddenfield("inpKey",strM_Product_ID);
        script.addHiddenfield("inpprocessing",strProcessing);
        OBError myMessage = vars.getMessage("36E59A3C3EB54943B7445D527C5DA380");
        vars.removeMessage("36E59A3C3EB54943B7445D527C5DA380");
        if (myMessage!=null) {
          script.addMessage(this, vars, myMessage);
        }
        strOutput = script.doScript(strOutput, "",this,vars);
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(strOutput);
        out.close();
      } catch (Exception ex) {
        throw new ServletException(ex);
      }
    }



    private String getDisplayLogicContext(VariablesSecureApp vars, boolean isNew) throws IOException, ServletException {
      log4j.debug("Output: Display logic context fields");
      String result = "var strShowAudit=\"" +(isNew?"N":Utility.getContext(this, vars, "ShowAudit", windowId)) + "\";\nvar strPRODUCTVALUEREADONLY=\"" + Utility.getContext(this, vars, "PRODUCTVALUEREADONLY", windowId) + "\";\n";
      return result;
    }


    private String getReadOnlyLogicContext(VariablesSecureApp vars) throws IOException, ServletException {
      log4j.debug("Output: Read Only logic context fields");
      String result = "";
      return result;
    }




 
  private String getShortcutScript( HashMap<String, String> usedButtonShortCuts, HashMap<String, String> reservedButtonShortCuts){
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
    ProductF6A25D6EA3384B0C85679865687E51D4Data data = null;
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
                data.mProductId = strSequence;  
            }
            if (Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),data.adClientId)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),data.adOrgId)){
		     if(type == 'I') {
		       total = data.insert(con, this);
		     } else {
		       //Check the version of the record we are saving is the one in DB
		       if (ProductF6A25D6EA3384B0C85679865687E51D4Data.getCurrentDBTimestamp(this, data.mProductId).equals(
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
          CrudOperations.UpdateCustomFields(tabId, data.mProductId, vars, this);
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
                    data.mProductId = "";
                }
                else {                    
                    
                }
                vars.setEditionData(tabId, data);
            }            	
        }
        else {
            vars.setSessionValue(windowId + "|M_Product_ID", data.mProductId);
        }
    }
    return total;
  }

  public String getServletInfo() {
    return "Servlet ProductF6A25D6EA3384B0C85679865687E51D4. This Servlet was made by Wad constructor";
  } // End of getServletInfo() method
}
