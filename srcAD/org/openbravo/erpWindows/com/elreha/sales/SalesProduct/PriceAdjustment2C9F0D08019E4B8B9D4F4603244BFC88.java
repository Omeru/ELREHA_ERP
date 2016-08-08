
package org.openbravo.erpWindows.com.elreha.sales.SalesProduct;





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

public class PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88 extends HttpSecureAppServlet {
  private static final long serialVersionUID = 1L;
  
  private static Logger log4j = Logger.getLogger(PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.class);
  
  private static final String windowId = "6614375915A04200ACCE9C693F0651E2";
  private static final String tabId = "2C9F0D08019E4B8B9D4F4603244BFC88";
  private static final String defaultTabView = "EDIT";
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
        String strmOfferplistVId = request.getParameter("inpmOfferplistVId");
        
        if (editableTab) {
          int total = 0;
          
          if(commandType.equalsIgnoreCase("EDIT") && !strmOfferplistVId.equals(""))
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

      String strM_Offerplist_V_ID = vars.getGlobalVariable("inpmOfferplistVId", windowId + "|M_Offerplist_V_ID", "");
      

      String strView = vars.getSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view");
      if (strView.equals("")) {
        strView = defaultTabView;

        if (strView.equals("EDIT")) {
          if (strM_Offerplist_V_ID.equals("")) strM_Offerplist_V_ID = firstElement(vars, tableSQL);
          if (strM_Offerplist_V_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strM_Offerplist_V_ID, tableSQL);

      else printPageDataSheet(response, vars, strM_Offerplist_V_ID, tableSQL);
    } else if (vars.commandIn("DIRECT") || vars.commandIn("DIRECTRELATION")) {
      String strM_Offerplist_V_ID = vars.getStringParameter("inpDirectKey");
      
        
      if (strM_Offerplist_V_ID.equals("")) strM_Offerplist_V_ID = vars.getRequiredGlobalVariable("inpmOfferplistVId", windowId + "|M_Offerplist_V_ID");
      else vars.setSessionValue(windowId + "|M_Offerplist_V_ID", strM_Offerplist_V_ID);
      
      if (vars.commandIn("DIRECT")){
        vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view", "EDIT");

        printPageEdit(response, request, vars, false, strM_Offerplist_V_ID, tableSQL);
      }
      if (vars.commandIn("DIRECTRELATION")){
        vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view", "RELATION");
        printPageDataSheet(response, vars, strM_Offerplist_V_ID, tableSQL);
      }

    } else if (vars.commandIn("TAB")) {


      String strView = vars.getSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view");
      String strM_Offerplist_V_ID = "";
      if (strView.equals("")) {
        strView = defaultTabView;
        if (strView.equals("EDIT")) {
          strM_Offerplist_V_ID = firstElement(vars, tableSQL);
          if (strM_Offerplist_V_ID.equals("")) strView = "RELATION";
        }
      }
      if (strView.equals("EDIT")) {

        if (strM_Offerplist_V_ID.equals("")) strM_Offerplist_V_ID = firstElement(vars, tableSQL);
        printPageEdit(response, request, vars, false, strM_Offerplist_V_ID, tableSQL);

      } else printPageDataSheet(response, vars, "", tableSQL);
    } else if (vars.commandIn("SEARCH")) {
vars.getRequestGlobalVariable("inpParamName", tabId + "|paramName");

      
      
      vars.removeSessionValue(windowId + "|M_Offerplist_V_ID");
      String strM_Offerplist_V_ID="";

      String strView = vars.getSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view");
      if (strView.equals("")) strView=defaultTabView;

      if (strView.equals("EDIT")) {
        strM_Offerplist_V_ID = firstElement(vars, tableSQL);
        if (strM_Offerplist_V_ID.equals("")) {
          // filter returns empty set
          strView = "RELATION";
          // switch to grid permanently until the user changes the view again
          vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view", strView);
        }
      }

      if (strView.equals("EDIT")) 

        printPageEdit(response, request, vars, false, strM_Offerplist_V_ID, tableSQL);

      else printPageDataSheet(response, vars, strM_Offerplist_V_ID, tableSQL);
    } else if (vars.commandIn("RELATION")) {
      

      String strM_Offerplist_V_ID = vars.getGlobalVariable("inpmOfferplistVId", windowId + "|M_Offerplist_V_ID", "");
      vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view", "RELATION");
      printPageDataSheet(response, vars, strM_Offerplist_V_ID, tableSQL);
    } else if (vars.commandIn("NEW")) {


      printPageEdit(response, request, vars, true, "", tableSQL);

    } else if (vars.commandIn("EDIT")) {

      @SuppressWarnings("unused") // In Expense Invoice tab this variable is not used, to be fixed
      String strM_Offerplist_V_ID = vars.getGlobalVariable("inpmOfferplistVId", windowId + "|M_Offerplist_V_ID", "");
      vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view", "EDIT");

      setHistoryCommand(request, "EDIT");
      printPageEdit(response, request, vars, false, strM_Offerplist_V_ID, tableSQL);

    } else if (vars.commandIn("NEXT")) {

      String strM_Offerplist_V_ID = vars.getRequiredStringParameter("inpmOfferplistVId");
      
      String strNext = nextElement(vars, strM_Offerplist_V_ID, tableSQL);

      printPageEdit(response, request, vars, false, strNext, tableSQL);
    } else if (vars.commandIn("PREVIOUS")) {

      String strM_Offerplist_V_ID = vars.getRequiredStringParameter("inpmOfferplistVId");
      
      String strPrevious = previousElement(vars, strM_Offerplist_V_ID, tableSQL);

      printPageEdit(response, request, vars, false, strPrevious, tableSQL);
    } else if (vars.commandIn("FIRST_RELATION")) {

      vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.initRecordNumber", "0");
      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("PREVIOUS_RELATION")) {

      String strInitRecord = vars.getSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      if (strInitRecord.equals("") || strInitRecord.equals("0")) {
        vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.initRecordNumber", "0");
      } else {
        int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
        initRecord -= intRecordRange;
        strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
        vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.initRecordNumber", strInitRecord);
      }
      vars.removeSessionValue(windowId + "|M_Offerplist_V_ID");

      response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
    } else if (vars.commandIn("NEXT_RELATION")) {

      String strInitRecord = vars.getSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.initRecordNumber");
      String strRecordRange = Utility.getContext(this, vars, "#RecordRange", windowId);
      int intRecordRange = strRecordRange.equals("")?0:Integer.parseInt(strRecordRange);
      int initRecord = (strInitRecord.equals("")?0:Integer.parseInt(strInitRecord));
      if (initRecord==0) initRecord=1;
      initRecord += intRecordRange;
      strInitRecord = ((initRecord<0)?"0":Integer.toString(initRecord));
      vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.initRecordNumber", strInitRecord);
      vars.removeSessionValue(windowId + "|M_Offerplist_V_ID");

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

      String strM_Offerplist_V_ID = vars.getRequiredGlobalVariable("inpmOfferplistVId", windowId + "|M_Offerplist_V_ID");
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
          String strNext = nextElement(vars, strM_Offerplist_V_ID, tableSQL);
          vars.setSessionValue(windowId + "|M_Offerplist_V_ID", strNext);
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=EDIT");
        } else response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
      }
/*    } else if (vars.commandIn("DELETE_RELATION")) {

      String strM_Offerplist_V_ID = vars.getRequiredInStringParameter("inpmOfferplistVId");
      String message = deleteRelation(vars, strM_Offerplist_V_ID);
      if (!message.equals("")) {
        bdError(request, response, message, vars.getLanguage());
      } else {
        vars.removeSessionValue(windowId + "|mOfferplistVId");
        vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view", "RELATION");
        response.sendRedirect(strDireccion + request.getServletPath());
      }*/
    } else if (vars.commandIn("DELETE")) {

      String strM_Offerplist_V_ID = vars.getRequiredStringParameter("inpmOfferplistVId");
      //PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data data = getEditVariables(vars);
      int total = 0;
      OBError myError = null;
      if (org.openbravo.erpCommon.utility.WindowAccessData.hasReadOnlyAccess(this, vars.getRole(), tabId)) {
        myError = Utility.translateError(this, vars, vars.getLanguage(), Utility.messageBD(this, "NoWriteAccess", vars.getLanguage()));
        vars.setMessage(tabId, myError);
      } else {
        try {
          total = PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data.delete(this, strM_Offerplist_V_ID, Utility.getContext(this, vars, "#User_Client", windowId, accesslevel), Utility.getContext(this, vars, "#User_Org", windowId, accesslevel));
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
        vars.removeSessionValue(windowId + "|mOfferplistVId");
        vars.setSessionValue(tabId + "|PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88.view", "RELATION");
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
  String deleteRelation(VariablesSecureApp vars, String strM_Offerplist_V_ID) throws IOException, ServletException {
    log4j.debug("Deleting records");
    Connection conn = this.getTransactionConnection();
    try {
      if (strM_Offerplist_V_ID.startsWith("(")) strM_Offerplist_V_ID = strM_Offerplist_V_ID.substring(1, strM_Offerplist_V_ID.length()-1);
      if (!strM_Offerplist_V_ID.equals("")) {
        strM_Offerplist_V_ID = Replace.replace(strM_Offerplist_V_ID, "'", "");
        StringTokenizer st = new StringTokenizer(strM_Offerplist_V_ID, ",", false);
        while (st.hasMoreTokens()) {
          String strKey = st.nextToken();
          if (PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data.deleteTransactional(conn, this, strKey)==0) {
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
  private PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data getEditVariables(Connection con, VariablesSecureApp vars) throws IOException,ServletException {
    PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data data = new PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data();
    ServletException ex = null;
    try {
    data.mProductId = vars.getStringParameter("inpmProductId");     data.mProductIdr = vars.getStringParameter("inpmProductId_R");     data.name = vars.getStringParameter("inpname");     data.isactive = vars.getStringParameter("inpisactive", "N");     data.directpurchasecalc = vars.getStringParameter("inpdirectpurchasecalc", "N");     data.datefrom = vars.getStringParameter("inpdatefrom");     data.dateto = vars.getStringParameter("inpdateto");    try {   data.qtyFrom = vars.getNumericParameter("inpqtyFrom");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.qtyTo = vars.getNumericParameter("inpqtyTo");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.priority = vars.getNumericParameter("inppriority");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.discount = vars.getNumericParameter("inpdiscount");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.addamt = vars.getNumericParameter("inpaddamt");  } catch (ServletException paramEx) { ex = paramEx; }    try {   data.fixed = vars.getNumericParameter("inpfixed");  } catch (ServletException paramEx) { ex = paramEx; }     data.issalesoffer = vars.getStringParameter("inpissalesoffer", "N");     data.mPricelistId = vars.getStringParameter("inpmPricelistId");     data.pricelistSelection = vars.getStringParameter("inppricelistSelection");     data.productSelection = vars.getStringParameter("inpproductSelection");     data.adClientId = vars.getRequestGlobalVariable("inpadClientId", windowId + "|AD_Client_ID");     data.bpGroupSelection = vars.getStringParameter("inpbpGroupSelection");     data.mOfferplistVId = vars.getRequestGlobalVariable("inpmOfferplistVId", windowId + "|M_Offerplist_V_ID");     data.bpartnerSelection = vars.getStringParameter("inpbpartnerSelection");     data.description = vars.getStringParameter("inpdescription");     data.prodCatSelection = vars.getStringParameter("inpprodCatSelection");     data.adOrgId = vars.getRequestGlobalVariable("inpadOrgId", windowId + "|AD_Org_ID"); 
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

   private PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data[] getRelationData(PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data[] data) {
    if (data!=null) {
      for (int i=0;i<data.length;i++) {        data[i].mProductId = FormatUtilities.truncate(data[i].mProductId, 32);        data[i].name = FormatUtilities.truncate(data[i].name, 50);        data[i].mPricelistId = FormatUtilities.truncate(data[i].mPricelistId, 32);        data[i].pricelistSelection = FormatUtilities.truncate(data[i].pricelistSelection, 50);        data[i].productSelection = FormatUtilities.truncate(data[i].productSelection, 50);        data[i].adClientId = FormatUtilities.truncate(data[i].adClientId, 32);        data[i].bpGroupSelection = FormatUtilities.truncate(data[i].bpGroupSelection, 50);        data[i].mOfferplistVId = FormatUtilities.truncate(data[i].mOfferplistVId, 32);        data[i].bpartnerSelection = FormatUtilities.truncate(data[i].bpartnerSelection, 50);        data[i].description = FormatUtilities.truncate(data[i].description, 50);        data[i].prodCatSelection = FormatUtilities.truncate(data[i].prodCatSelection, 50);        data[i].adOrgId = FormatUtilities.truncate(data[i].adOrgId, 32);}
    }
    return data;
  }



    private void refreshSessionEdit(VariablesSecureApp vars, FieldProvider[] data) {
      if (data==null || data.length==0) return;
          vars.setSessionValue(windowId + "|AD_Client_ID", data[0].getField("adClientId"));    vars.setSessionValue(windowId + "|M_Offerplist_V_ID", data[0].getField("mOfferplistVId"));    vars.setSessionValue(windowId + "|AD_Org_ID", data[0].getField("adOrgId"));
    }

    private void refreshSessionNew(VariablesSecureApp vars) throws IOException,ServletException {
      PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data[] data = PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), Utility.getContext(this, vars, "m_pricelist_version_id", windowId), Utility.getContext(this, vars, "m_product_id", windowId), vars.getStringParameter("inpmOfferplistVId", ""), Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
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

  private void printPageDataSheet(HttpServletResponse response, VariablesSecureApp vars, String strM_Offerplist_V_ID, TableSQLData tableSQL)
    throws IOException, ServletException {
    if (log4j.isDebugEnabled()) log4j.debug("Output: dataSheet");

    String strParamName = vars.getSessionValue(tabId + "|paramName");

    if (vars.getSessionValue(windowId +  "|M_ProductPrice_ID").isEmpty()) vars.setSessionValue(windowId + "|M_ProductPrice_ID", vars.getStringParameter("inpmProductpriceId"));
    boolean hasSearchCondition=false;
    vars.removeEditionData(tabId);
    if (!(strParamName.equals(""))) hasSearchCondition=true;
    String strOffset = "0";
    //vars.getSessionValue(tabId + "|offset");
    String selectedRow = "0";
    if (!strM_Offerplist_V_ID.equals("")) {
      selectedRow = Integer.toString(getKeyPosition(vars, strM_Offerplist_V_ID, tableSQL));
    }

    String[] discard={"isNotFiltered","isNotTest"};
    if (hasSearchCondition) discard[0] = new String("isFiltered");
    if (vars.getSessionValue("#ShowTest", "N").equals("Y")) discard[1] = new String("isTest");
    XmlDocument xmlDocument = xmlEngine.readXmlTemplate("org/openbravo/erpWindows/com/elreha/sales/SalesProduct/PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88_Relation", discard).createXmlDocument();

    ToolBar toolbar = new ToolBar(this, vars.getLanguage(), "PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88", false, "document.frmMain.inpmOfferplistVId", "grid", "..", "".equals("Y"), "SalesProduct", strReplaceWith, false);
    toolbar.prepareRelationTemplate("N".equals("Y"), hasSearchCondition, !vars.getSessionValue("#ShowTest", "N").equals("Y"), false, Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
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
    xmlDocument.setParameter("KeyName", "mOfferplistVId");
    xmlDocument.setParameter("language", "defaultLang=\"" + vars.getLanguage() + "\";");
    xmlDocument.setParameter("theme", vars.getTheme());
    //xmlDocument.setParameter("buttonReference", Utility.messageBD(this, "Reference", vars.getLanguage()));
    try {
      WindowTabs tabs = new WindowTabs(this, vars, tabId, windowId, false);
      xmlDocument.setParameter("parentTabContainer", tabs.parentTabs());
      xmlDocument.setParameter("mainTabContainer", tabs.mainTabs());
      xmlDocument.setParameter("childTabContainer", tabs.childTabs());
      NavigationBar nav = new NavigationBar(this, vars.getLanguage(), "PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88_Relation.html", "SalesProduct", "W", strReplaceWith, tabs.breadcrumb());
      xmlDocument.setParameter("navigationBar", nav.toString());
      LeftTabsBar lBar = new LeftTabsBar(this, vars.getLanguage(), "PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88_Relation.html", strReplaceWith);
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

  private void printPageEdit(HttpServletResponse response, HttpServletRequest request, VariablesSecureApp vars,boolean boolNew, String strM_Offerplist_V_ID, TableSQLData tableSQL)
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
    PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data[] data=null;
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
        data = PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data.selectEdit(this, vars.getSessionValue("#AD_SqlDateTimeFormat"), vars.getLanguage(), Utility.getContext(this, vars, "m_pricelist_version_id", windowId), Utility.getContext(this, vars, "m_product_id", windowId), strM_Offerplist_V_ID, Utility.getContext(this, vars, "#User_Client", windowId), Utility.getContext(this, vars, "#AccessibleOrgTree", windowId, accesslevel));
  
        if (!strM_Offerplist_V_ID.equals("") && (data == null || data.length==0)) {
          response.sendRedirect(strDireccion + request.getServletPath() + "?Command=RELATION");
          return;
        }
        refreshSessionEdit(vars, data);
        strCommand = "EDIT";
      }

      if (boolNew || data==null || data.length==0) {
        discard[0] = new String ("editDiscard");
        strCommand = "NEW";
        data = new PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data[0];
      } else {
        discard[0] = new String ("newDiscard");
      }
    } else {
      if (dataField.getField("mOfferplistVId") == null || dataField.getField("mOfferplistVId").equals("")) {
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
        data = PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data.set(Utility.getDefault(this, vars, "Addamt", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Directpurchasecalc", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "N", dataField), Utility.getDefault(this, vars, "QTY_To", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), "", "Y", Utility.getDefault(this, vars, "Priority", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Description", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Dateto", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "QTY_From", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "AD_Client_ID", "@AD_CLIENT_ID@", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "M_Pricelist_ID", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Prod_Cat_Selection", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Product_Selection", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Issalesoffer", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "N", dataField), Utility.getDefault(this, vars, "Name", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Pricelist_Selection", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Discount", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "M_Product_ID", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data.selectDef1961B4AE66DB41DC9AB135ADE09B3410_0(this, Utility.getDefault(this, vars, "M_Product_ID", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField)), Utility.getDefault(this, vars, "Bpartner_Selection", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "AD_Org_ID", "@AD_ORG_ID@", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Updatedby", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data.selectDefEA017F229520407281E0C871872E2C25_1(this, Utility.getDefault(this, vars, "Updatedby", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField)), Utility.getDefault(this, vars, "Createdby", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data.selectDef37E78F935C094F898DE19D100EA855C7_2(this, Utility.getDefault(this, vars, "Createdby", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField)), Utility.getDefault(this, vars, "BP_Group_Selection", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Datefrom", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField), Utility.getDefault(this, vars, "Fixed", "", "6614375915A04200ACCE9C693F0651E2", "2C9F0D08019E4B8B9D4F4603244BFC88", "", dataField));
        
      }
    } else {
      data = new PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data[1];
      java.lang.Object  ref1= dataField;
      data[0]=(PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data) ref1;
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
    
    ToolBar toolbar = new ToolBar(this, editableTab, vars.getLanguage(), "PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88", (strCommand.equals("NEW") || boolNew || (dataField==null && (data==null || data.length==0))), "document.frmMain.inpmOfferplistVId", "", "..", "".equals("Y"), "SalesProduct", strReplaceWith, true, false, false, Utility.hasTabAttachments(this, vars, tabId, strM_Offerplist_V_ID));
    toolbar.prepareEditionTemplate("N".equals("Y"), hasSearchCondition, vars.getSessionValue("#ShowTest", "N").equals("Y"), "STD", Utility.getContext(this, vars, "ShowAudit", windowId).equals("Y"));
    
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
    PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data data = null;
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
                data.mOfferplistVId = strSequence;  
            }
            if (Utility.isElementInList(Utility.getContext(this, vars, "#User_Client", windowId, accesslevel),data.adClientId)  && Utility.isElementInList(Utility.getContext(this, vars, "#User_Org", windowId, accesslevel),data.adOrgId)){
		     if(type == 'I') {
		       total = data.insert(con, this);
		     } else {
		       //Check the version of the record we are saving is the one in DB
		       if (PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88Data.getCurrentDBTimestamp(this, data.mOfferplistVId).equals(
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
          CrudOperations.UpdateCustomFields(tabId, data.mOfferplistVId, vars, this);
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
                    data.mOfferplistVId = "";
                }
                else {                    
                    
                }
                vars.setEditionData(tabId, data);
            }            	
        }
        else {
            vars.setSessionValue(windowId + "|M_Offerplist_V_ID", data.mOfferplistVId);
        }
    }
    return total;
  }

  public String getServletInfo() {
    return "Servlet PriceAdjustment2C9F0D08019E4B8B9D4F4603244BFC88. This Servlet was made by Wad constructor";
  } // End of getServletInfo() method
}
