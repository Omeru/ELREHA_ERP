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
package org.openbravo.zsoft.smartui;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Category;
import org.openbravo.model.common.businesspartner.Greeting;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.geography.Country;
import org.openbravo.model.common.geography.Location;

import java.lang.Boolean;
import java.lang.String;

import java.util.Date;

/**
 * Entity class for entity zssi_crm_bpartner_v (stored in table zssi_crm_bpartner_v).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class zssi_crm_bpartner_v extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "zssi_crm_bpartner_v";
    public static final String ENTITY_NAME = "zssi_crm_bpartner_v";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_BPARTNER = "bpartner";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_VALUE = "value";
    public static final String PROPERTY_NAME2 = "name2";
    public static final String PROPERTY_BPGROUP = "bpGroup";
    public static final String PROPERTY_URL = "url";
    public static final String PROPERTY_BPARTNERLOCATION = "bpartnerLocation";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_USER = "user";
    public static final String PROPERTY_EMAIL = "email";
    public static final String PROPERTY_GREETING = "greeting";
    public static final String PROPERTY_FIRSTNAME = "firstname";
    public static final String PROPERTY_LASTNAME = "lastname";
    public static final String PROPERTY_BIRTHDAY = "birthday";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_PHONE = "phone";
    public static final String PROPERTY_FAX = "fax";
    public static final String PROPERTY_COMMENTS = "comments";
    public static final String PROPERTY_INTERESTS = "interests";
    public static final String PROPERTY_ISCUSTOMER = "iscustomer";
    public static final String PROPERTY_ISVENDOR = "isvendor";
    public static final String PROPERTY_ADDRESS1 = "address1";
    public static final String PROPERTY_ADDRESS2 = "address2";
    public static final String PROPERTY_CITY = "city";
    public static final String PROPERTY_POSTAL = "postal";
    public static final String PROPERTY_COUNTRY = "country";

    public zssi_crm_bpartner_v() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_ISCUSTOMER, false);
        setDefaultValue(PROPERTY_ISVENDOR, false);
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

    public Date getCreated() {
        return (Date) get(PROPERTY_CREATED);
    }

    public void setCreated(Date created) {
        set(PROPERTY_CREATED, created);
    }

    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }

    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }

    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }

    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    public BusinessPartner getBpartner() {
        return (BusinessPartner) get(PROPERTY_BPARTNER);
    }

    public void setBpartner(BusinessPartner bpartner) {
        set(PROPERTY_BPARTNER, bpartner);
    }

    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ISACTIVE);
    }

    public void setActive(Boolean isactive) {
        set(PROPERTY_ISACTIVE, isactive);
    }

    public String getName() {
        return (String) get(PROPERTY_NAME);
    }

    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    public String getValue() {
        return (String) get(PROPERTY_VALUE);
    }

    public void setValue(String value) {
        set(PROPERTY_VALUE, value);
    }

    public String getName2() {
        return (String) get(PROPERTY_NAME2);
    }

    public void setName2(String name2) {
        set(PROPERTY_NAME2, name2);
    }

    public Category getBpGroup() {
        return (Category) get(PROPERTY_BPGROUP);
    }

    public void setBpGroup(Category bpGroup) {
        set(PROPERTY_BPGROUP, bpGroup);
    }

    public String getUrl() {
        return (String) get(PROPERTY_URL);
    }

    public void setUrl(String url) {
        set(PROPERTY_URL, url);
    }

    public Location getBpartnerLocation() {
        return (Location) get(PROPERTY_BPARTNERLOCATION);
    }

    public void setBpartnerLocation(Location bpartnerLocation) {
        set(PROPERTY_BPARTNERLOCATION, bpartnerLocation);
    }

    public String getContact() {
        return (String) get(PROPERTY_CONTACT);
    }

    public void setContact(String contact) {
        set(PROPERTY_CONTACT, contact);
    }

    public User getUser() {
        return (User) get(PROPERTY_USER);
    }

    public void setUser(User user) {
        set(PROPERTY_USER, user);
    }

    public String getEmail() {
        return (String) get(PROPERTY_EMAIL);
    }

    public void setEmail(String email) {
        set(PROPERTY_EMAIL, email);
    }

    public Greeting getGreeting() {
        return (Greeting) get(PROPERTY_GREETING);
    }

    public void setGreeting(Greeting greeting) {
        set(PROPERTY_GREETING, greeting);
    }

    public String getFirstname() {
        return (String) get(PROPERTY_FIRSTNAME);
    }

    public void setFirstname(String firstname) {
        set(PROPERTY_FIRSTNAME, firstname);
    }

    public String getLastname() {
        return (String) get(PROPERTY_LASTNAME);
    }

    public void setLastname(String lastname) {
        set(PROPERTY_LASTNAME, lastname);
    }

    public Date getBirthday() {
        return (Date) get(PROPERTY_BIRTHDAY);
    }

    public void setBirthday(Date birthday) {
        set(PROPERTY_BIRTHDAY, birthday);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public String getPhone() {
        return (String) get(PROPERTY_PHONE);
    }

    public void setPhone(String phone) {
        set(PROPERTY_PHONE, phone);
    }

    public String getFax() {
        return (String) get(PROPERTY_FAX);
    }

    public void setFax(String fax) {
        set(PROPERTY_FAX, fax);
    }

    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }

    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    public String getInterests() {
        return (String) get(PROPERTY_INTERESTS);
    }

    public void setInterests(String interests) {
        set(PROPERTY_INTERESTS, interests);
    }

    public Boolean isCustomer() {
        return (Boolean) get(PROPERTY_ISCUSTOMER);
    }

    public void setCustomer(Boolean iscustomer) {
        set(PROPERTY_ISCUSTOMER, iscustomer);
    }

    public Boolean isVendor() {
        return (Boolean) get(PROPERTY_ISVENDOR);
    }

    public void setVendor(Boolean isvendor) {
        set(PROPERTY_ISVENDOR, isvendor);
    }

    public String getAddress1() {
        return (String) get(PROPERTY_ADDRESS1);
    }

    public void setAddress1(String address1) {
        set(PROPERTY_ADDRESS1, address1);
    }

    public String getAddress2() {
        return (String) get(PROPERTY_ADDRESS2);
    }

    public void setAddress2(String address2) {
        set(PROPERTY_ADDRESS2, address2);
    }

    public String getCity() {
        return (String) get(PROPERTY_CITY);
    }

    public void setCity(String city) {
        set(PROPERTY_CITY, city);
    }

    public String getPostal() {
        return (String) get(PROPERTY_POSTAL);
    }

    public void setPostal(String postal) {
        set(PROPERTY_POSTAL, postal);
    }

    public Country getCountry() {
        return (Country) get(PROPERTY_COUNTRY);
    }

    public void setCountry(Country country) {
        set(PROPERTY_COUNTRY, country);
    }
}
