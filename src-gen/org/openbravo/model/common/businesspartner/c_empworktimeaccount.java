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
package org.openbravo.model.common.businesspartner;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Entity class for entity c_empworktimeaccount (stored in table c_empworktimeaccount).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class c_empworktimeaccount extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "c_empworktimeaccount";
    public static final String ENTITY_NAME = "c_empworktimeaccount";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_USER = "user";
    public static final String PROPERTY_WYEAR = "wyear";
    public static final String PROPERTY_WMONTH = "wmonth";
    public static final String PROPERTY_TARGETHOURS = "targethours";
    public static final String PROPERTY_WORKHOURS = "workhours";
    public static final String PROPERTY_VALUE = "value";
    public static final String PROPERTY_BALANCE = "balance";
    public static final String PROPERTY_HOLIDAYENTITLEMENT =
        "holidayEntitlement";

    public c_empworktimeaccount() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_WYEAR, (long) 0);
        setDefaultValue(PROPERTY_WMONTH, (long) 0);
        setDefaultValue(PROPERTY_TARGETHOURS, new BigDecimal(0));
        setDefaultValue(PROPERTY_WORKHOURS, new BigDecimal(0));
        setDefaultValue(PROPERTY_BALANCE, new BigDecimal(0));
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

    public User getUser() {
        return (User) get(PROPERTY_USER);
    }

    public void setUser(User user) {
        set(PROPERTY_USER, user);
    }

    public Long getWyear() {
        return (Long) get(PROPERTY_WYEAR);
    }

    public void setWyear(Long wyear) {
        set(PROPERTY_WYEAR, wyear);
    }

    public Long getWmonth() {
        return (Long) get(PROPERTY_WMONTH);
    }

    public void setWmonth(Long wmonth) {
        set(PROPERTY_WMONTH, wmonth);
    }

    public BigDecimal getTargethours() {
        return (BigDecimal) get(PROPERTY_TARGETHOURS);
    }

    public void setTargethours(BigDecimal targethours) {
        set(PROPERTY_TARGETHOURS, targethours);
    }

    public BigDecimal getWorkhours() {
        return (BigDecimal) get(PROPERTY_WORKHOURS);
    }

    public void setWorkhours(BigDecimal workhours) {
        set(PROPERTY_WORKHOURS, workhours);
    }

    public String getValue() {
        return (String) get(PROPERTY_VALUE);
    }

    public void setValue(String value) {
        set(PROPERTY_VALUE, value);
    }

    public BigDecimal getBalance() {
        return (BigDecimal) get(PROPERTY_BALANCE);
    }

    public void setBalance(BigDecimal balance) {
        set(PROPERTY_BALANCE, balance);
    }

    public Long getHolidayEntitlement() {
        return (Long) get(PROPERTY_HOLIDAYENTITLEMENT);
    }

    public void setHolidayEntitlement(Long holidayEntitlement) {
        set(PROPERTY_HOLIDAYENTITLEMENT, holidayEntitlement);
    }
}
