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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;

import java.lang.Boolean;
import java.lang.String;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entity class for entity snr_batchmasterdata (stored in table snr_batchmasterdata).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Snr_batchmasterdata extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "snr_batchmasterdata";
    public static final String ENTITY_NAME = "snr_batchmasterdata";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_BATCHNUMBER = "batchnumber";
    public static final String PROPERTY_FIRSTSEEN = "firstseen";
    public static final String PROPERTY_GUARANTEEDATE = "guaranteedate";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_AUXFIELD1 = "auxfield1";
    public static final String PROPERTY_AUXFIELD2 = "auxfield2";
    public static final String PROPERTY_AUXFIELD3 = "auxfield3";
    public static final String PROPERTY_QTYONHAND = "qtyonhand";
    public static final String PROPERTY_SNRBATCHLOCATORVLIST =
        "snrBatchlocatorVList";
    public static final String PROPERTY_SNRSERIALNUMBERTRACKINGLIST =
        "snrSerialnumbertrackingList";
    public static final String PROPERTY_SNRBATCHLOCATORLIST =
        "snrBatchlocatorList";

    public Snr_batchmasterdata() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_QTYONHAND, new BigDecimal(0));
        setDefaultValue(PROPERTY_SNRBATCHLOCATORVLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_SNRSERIALNUMBERTRACKINGLIST,
            new ArrayList<Object>());
        setDefaultValue(PROPERTY_SNRBATCHLOCATORLIST, new ArrayList<Object>());
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

    public Date getFirstseen() {
        return (Date) get(PROPERTY_FIRSTSEEN);
    }

    public void setFirstseen(Date firstseen) {
        set(PROPERTY_FIRSTSEEN, firstseen);
    }

    public Date getGuaranteedate() {
        return (Date) get(PROPERTY_GUARANTEEDATE);
    }

    public void setGuaranteedate(Date guaranteedate) {
        set(PROPERTY_GUARANTEEDATE, guaranteedate);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public String getAuxfield1() {
        return (String) get(PROPERTY_AUXFIELD1);
    }

    public void setAuxfield1(String auxfield1) {
        set(PROPERTY_AUXFIELD1, auxfield1);
    }

    public String getAuxfield2() {
        return (String) get(PROPERTY_AUXFIELD2);
    }

    public void setAuxfield2(String auxfield2) {
        set(PROPERTY_AUXFIELD2, auxfield2);
    }

    public String getAuxfield3() {
        return (String) get(PROPERTY_AUXFIELD3);
    }

    public void setAuxfield3(String auxfield3) {
        set(PROPERTY_AUXFIELD3, auxfield3);
    }

    public BigDecimal getQtyonhand() {
        return (BigDecimal) get(PROPERTY_QTYONHAND);
    }

    public void setQtyonhand(BigDecimal qtyonhand) {
        set(PROPERTY_QTYONHAND, qtyonhand);
    }

    @SuppressWarnings("unchecked")
    public List<org.zsoft.serial.snr_batchlocator_v> getSnrBatchlocatorVList() {
        return (List<org.zsoft.serial.snr_batchlocator_v>) get(PROPERTY_SNRBATCHLOCATORVLIST);
    }

    public void setSnrBatchlocatorVList(
        List<org.zsoft.serial.snr_batchlocator_v> snrBatchlocatorVList) {
        set(PROPERTY_SNRBATCHLOCATORVLIST, snrBatchlocatorVList);
    }

    @SuppressWarnings("unchecked")
    public List<Snr_serialnumbertracking> getSnrSerialnumbertrackingList() {
        return (List<Snr_serialnumbertracking>) get(PROPERTY_SNRSERIALNUMBERTRACKINGLIST);
    }

    public void setSnrSerialnumbertrackingList(
        List<Snr_serialnumbertracking> snrSerialnumbertrackingList) {
        set(PROPERTY_SNRSERIALNUMBERTRACKINGLIST, snrSerialnumbertrackingList);
    }

    @SuppressWarnings("unchecked")
    public List<org.openbravo.model.materialmgmt.onhandquantity.snr_batchlocator> getSnrBatchlocatorList() {
        return (List<org.openbravo.model.materialmgmt.onhandquantity.snr_batchlocator>) get(PROPERTY_SNRBATCHLOCATORLIST);
    }

    public void setSnrBatchlocatorList(
        List<org.openbravo.model.materialmgmt.onhandquantity.snr_batchlocator> snrBatchlocatorList) {
        set(PROPERTY_SNRBATCHLOCATORLIST, snrBatchlocatorList);
    }
}
