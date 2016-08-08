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
package org.zsoft.serial;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;

import java.lang.Boolean;
import java.lang.String;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Entity class for entity snr_batchlocator_v (stored in table snr_batchlocator_v).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class snr_batchlocator_v extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "snr_batchlocator_v";
    public static final String ENTITY_NAME = "snr_batchlocator_v";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_SNRBATCHLOCATOR = "sNRBatchlocator";
    public static final String PROPERTY_SNRBATCHMASTERDATA =
        "sNRBatchmasterdata";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_LOCATOR = "locator";
    public static final String PROPERTY_QTYONHAND = "qtyonhand";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_BATCHNUMBER = "batchnumber";

    public snr_batchlocator_v() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
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

    public org.openbravo.model.materialmgmt.onhandquantity.snr_batchlocator getSNRBatchlocator() {
        return (org.openbravo.model.materialmgmt.onhandquantity.snr_batchlocator) get(PROPERTY_SNRBATCHLOCATOR);
    }

    public void setSNRBatchlocator(
        org.openbravo.model.materialmgmt.onhandquantity.snr_batchlocator sNRBatchlocator) {
        set(PROPERTY_SNRBATCHLOCATOR, sNRBatchlocator);
    }

    public Snr_batchmasterdata getSNRBatchmasterdata() {
        return (Snr_batchmasterdata) get(PROPERTY_SNRBATCHMASTERDATA);
    }

    public void setSNRBatchmasterdata(Snr_batchmasterdata sNRBatchmasterdata) {
        set(PROPERTY_SNRBATCHMASTERDATA, sNRBatchmasterdata);
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

    public Locator getLocator() {
        return (Locator) get(PROPERTY_LOCATOR);
    }

    public void setLocator(Locator locator) {
        set(PROPERTY_LOCATOR, locator);
    }

    public BigDecimal getQtyonhand() {
        return (BigDecimal) get(PROPERTY_QTYONHAND);
    }

    public void setQtyonhand(BigDecimal qtyonhand) {
        set(PROPERTY_QTYONHAND, qtyonhand);
    }

    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }

    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    public String getBatchnumber() {
        return (String) get(PROPERTY_BATCHNUMBER);
    }

    public void setBatchnumber(String batchnumber) {
        set(PROPERTY_BATCHNUMBER, batchnumber);
    }
}
