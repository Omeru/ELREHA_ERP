/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.0  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SL
 * All portions are Copyright (C) 2008-2009 Openbravo SL
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
*/
package org.openbravo.model.common.plm;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.coa.AccountingCombination;
import org.openbravo.model.financialmgmt.accounting.coa.AcctSchema;

import java.lang.Boolean;
import java.lang.String;

import java.util.Date;

/**
 * Entity class for entity ProductCategoryAccounts (stored in table M_Product_Category_Acct).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CategoryAccounts extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product_Category_Acct";
    public static final String ENTITY_NAME = "ProductCategoryAccounts";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";
    public static final String PROPERTY_ACCTSCHEMA = "acctSchema";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isActive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_ASSETACCT = "assetAcct";
    public static final String PROPERTY_COGSACCT = "cogsAcct";
    public static final String PROPERTY_PURCHASEPRICEVARIANCEACCT =
        "purchasePriceVarianceAcct";
    public static final String PROPERTY_INVOICEPRICEVARIANCEACCT =
        "invoicePriceVarianceAcct";
    public static final String PROPERTY_TRADEDISCOUNTRECACCT =
        "tradeDiscountRecAcct";
    public static final String PROPERTY_TRADEDISCOUNTGRANTACCT =
        "tradeDiscountGrantAcct";
    public static final String PROPERTY_PROCESSING = "processing";
    public static final String PROPERTY_REVENUEACCT = "revenueAcct";
    public static final String PROPERTY_EXPENSEACCT = "expenseAcct";

    public CategoryAccounts() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_PROCESSING, false);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    public String getId() {
        return (String) get(PROPERTY_ID);
    }

    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }

    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    public AcctSchema getAcctSchema() {
        return (AcctSchema) get(PROPERTY_ACCTSCHEMA);
    }

    public void setAcctSchema(AcctSchema acctSchema) {
        set(PROPERTY_ACCTSCHEMA, acctSchema);
    }

    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }

    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    public Organization getOrg() {
        return (Organization) get(PROPERTY_ORG);
    }

    public void setOrg(Organization org) {
        set(PROPERTY_ORG, org);
    }

    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ISACTIVE);
    }

    public void setActive(Boolean isActive) {
        set(PROPERTY_ISACTIVE, isActive);
    }

    public Date getCreated() {
        return (Date) get(PROPERTY_CREATED);
    }

    public void setCreated(Date created) {
        set(PROPERTY_CREATED, created);
    }

    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }

    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }

    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }

    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    public AccountingCombination getAssetAcct() {
        return (AccountingCombination) get(PROPERTY_ASSETACCT);
    }

    public void setAssetAcct(AccountingCombination assetAcct) {
        set(PROPERTY_ASSETACCT, assetAcct);
    }

    public AccountingCombination getCogsAcct() {
        return (AccountingCombination) get(PROPERTY_COGSACCT);
    }

    public void setCogsAcct(AccountingCombination cogsAcct) {
        set(PROPERTY_COGSACCT, cogsAcct);
    }

    public AccountingCombination getPurchasePriceVarianceAcct() {
        return (AccountingCombination) get(PROPERTY_PURCHASEPRICEVARIANCEACCT);
    }

    public void setPurchasePriceVarianceAcct(
        AccountingCombination purchasePriceVarianceAcct) {
        set(PROPERTY_PURCHASEPRICEVARIANCEACCT, purchasePriceVarianceAcct);
    }

    public AccountingCombination getInvoicePriceVarianceAcct() {
        return (AccountingCombination) get(PROPERTY_INVOICEPRICEVARIANCEACCT);
    }

    public void setInvoicePriceVarianceAcct(
        AccountingCombination invoicePriceVarianceAcct) {
        set(PROPERTY_INVOICEPRICEVARIANCEACCT, invoicePriceVarianceAcct);
    }

    public AccountingCombination getTradeDiscountRecAcct() {
        return (AccountingCombination) get(PROPERTY_TRADEDISCOUNTRECACCT);
    }

    public void setTradeDiscountRecAcct(
        AccountingCombination tradeDiscountRecAcct) {
        set(PROPERTY_TRADEDISCOUNTRECACCT, tradeDiscountRecAcct);
    }

    public AccountingCombination getTradeDiscountGrantAcct() {
        return (AccountingCombination) get(PROPERTY_TRADEDISCOUNTGRANTACCT);
    }

    public void setTradeDiscountGrantAcct(
        AccountingCombination tradeDiscountGrantAcct) {
        set(PROPERTY_TRADEDISCOUNTGRANTACCT, tradeDiscountGrantAcct);
    }

    public Boolean isProcessing() {
        return (Boolean) get(PROPERTY_PROCESSING);
    }

    public void setProcessing(Boolean processing) {
        set(PROPERTY_PROCESSING, processing);
    }

    public AccountingCombination getRevenueAcct() {
        return (AccountingCombination) get(PROPERTY_REVENUEACCT);
    }

    public void setRevenueAcct(AccountingCombination revenueAcct) {
        set(PROPERTY_REVENUEACCT, revenueAcct);
    }

    public AccountingCombination getExpenseAcct() {
        return (AccountingCombination) get(PROPERTY_EXPENSEACCT);
    }

    public void setExpenseAcct(AccountingCombination expenseAcct) {
        set(PROPERTY_EXPENSEACCT, expenseAcct);
    }
}
