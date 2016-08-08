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
package org.openbravo.zsoft.finance;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.financialmgmt.accounting.coa.ElementValue;

import java.lang.Boolean;
import java.lang.String;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Entity class for entity zsfi_susadatevaccounts (stored in table zsfi_susadatevaccounts).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class zsfi_susadatevaccounts extends BaseOBObject
    implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "zsfi_susadatevaccounts";
    public static final String ENTITY_NAME = "zsfi_susadatevaccounts";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_ZSFISUSADATEV = "zsfiSusadatev";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_ELEMENTVALUE = "elementvalue";
    public static final String PROPERTY_BEGINNINGBALANCE = "beginningbalance";
    public static final String PROPERTY_ENDINGBALANCE = "endingbalance";
    public static final String PROPERTY_DEBIT = "debit";
    public static final String PROPERTY_CREDIT = "credit";
    public static final String PROPERTY_BEGINNINGBALANCEDATEV =
        "beginningbalancedatev";
    public static final String PROPERTY_ENDINGBALANCEDATEV =
        "endingbalancedatev";
    public static final String PROPERTY_DEBITDATEV = "debitdatev";
    public static final String PROPERTY_CREDITDATEV = "creditdatev";
    public static final String PROPERTY_DIFFERENCE = "difference";
    public static final String PROPERTY_ROWCOLOR = "rowcolor";
    public static final String PROPERTY_ISDIFFERENCE = "isdifference";

    public zsfi_susadatevaccounts() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_ISDIFFERENCE, true);
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

    public org.openbravo.zsoft.finance.zsfi_susadatev getZsfiSusadatev() {
        return (org.openbravo.zsoft.finance.zsfi_susadatev) get(PROPERTY_ZSFISUSADATEV);
    }

    public void setZsfiSusadatev(
        org.openbravo.zsoft.finance.zsfi_susadatev zsfiSusadatev) {
        set(PROPERTY_ZSFISUSADATEV, zsfiSusadatev);
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

    public void setActive(Boolean isactive) {
        set(PROPERTY_ISACTIVE, isactive);
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

    public String getName() {
        return (String) get(PROPERTY_NAME);
    }

    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    public ElementValue getElementvalue() {
        return (ElementValue) get(PROPERTY_ELEMENTVALUE);
    }

    public void setElementvalue(ElementValue elementvalue) {
        set(PROPERTY_ELEMENTVALUE, elementvalue);
    }

    public BigDecimal getBeginningbalance() {
        return (BigDecimal) get(PROPERTY_BEGINNINGBALANCE);
    }

    public void setBeginningbalance(BigDecimal beginningbalance) {
        set(PROPERTY_BEGINNINGBALANCE, beginningbalance);
    }

    public BigDecimal getEndingbalance() {
        return (BigDecimal) get(PROPERTY_ENDINGBALANCE);
    }

    public void setEndingbalance(BigDecimal endingbalance) {
        set(PROPERTY_ENDINGBALANCE, endingbalance);
    }

    public BigDecimal getDebit() {
        return (BigDecimal) get(PROPERTY_DEBIT);
    }

    public void setDebit(BigDecimal debit) {
        set(PROPERTY_DEBIT, debit);
    }

    public BigDecimal getCredit() {
        return (BigDecimal) get(PROPERTY_CREDIT);
    }

    public void setCredit(BigDecimal credit) {
        set(PROPERTY_CREDIT, credit);
    }

    public BigDecimal getBeginningbalancedatev() {
        return (BigDecimal) get(PROPERTY_BEGINNINGBALANCEDATEV);
    }

    public void setBeginningbalancedatev(BigDecimal beginningbalancedatev) {
        set(PROPERTY_BEGINNINGBALANCEDATEV, beginningbalancedatev);
    }

    public BigDecimal getEndingbalancedatev() {
        return (BigDecimal) get(PROPERTY_ENDINGBALANCEDATEV);
    }

    public void setEndingbalancedatev(BigDecimal endingbalancedatev) {
        set(PROPERTY_ENDINGBALANCEDATEV, endingbalancedatev);
    }

    public BigDecimal getDebitdatev() {
        return (BigDecimal) get(PROPERTY_DEBITDATEV);
    }

    public void setDebitdatev(BigDecimal debitdatev) {
        set(PROPERTY_DEBITDATEV, debitdatev);
    }

    public BigDecimal getCreditdatev() {
        return (BigDecimal) get(PROPERTY_CREDITDATEV);
    }

    public void setCreditdatev(BigDecimal creditdatev) {
        set(PROPERTY_CREDITDATEV, creditdatev);
    }

    public BigDecimal getDifference() {
        return (BigDecimal) get(PROPERTY_DIFFERENCE);
    }

    public void setDifference(BigDecimal difference) {
        set(PROPERTY_DIFFERENCE, difference);
    }

    public String getRowcolor() {
        return (String) get(PROPERTY_ROWCOLOR);
    }

    public void setRowcolor(String rowcolor) {
        set(PROPERTY_ROWCOLOR, rowcolor);
    }

    public Boolean isDifference() {
        return (Boolean) get(PROPERTY_ISDIFFERENCE);
    }

    public void setDifference(Boolean isdifference) {
        set(PROPERTY_ISDIFFERENCE, isdifference);
    }
}
