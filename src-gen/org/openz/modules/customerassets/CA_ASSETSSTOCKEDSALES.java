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
package org.openz.modules.customerassets;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.Product;

import java.lang.Boolean;
import java.lang.String;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Entity class for entity CA_ASSETSSTOCKEDSALES (stored in table CA_ASSETSSTOCKEDSALES).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class CA_ASSETSSTOCKEDSALES extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "CA_ASSETSSTOCKEDSALES";
    public static final String ENTITY_NAME = "CA_ASSETSSTOCKEDSALES";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_ASSETSSTOCKED = "assetsstocked";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_QTY = "qty";
    public static final String PROPERTY_PRICE = "price";
    public static final String PROPERTY_CHARGEAMT = "chargeamt";
    public static final String PROPERTY_DATEOFSALE = "dateofsale";
    public static final String PROPERTY_ORDERLINE = "orderline";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_PAYMENTDATE = "paymentdate";
    public static final String PROPERTY_AMT = "amt";

    public CA_ASSETSSTOCKEDSALES() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_QTY, new BigDecimal(0));
        setDefaultValue(PROPERTY_PRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_CHARGEAMT, new BigDecimal(0));
        setDefaultValue(PROPERTY_AMT, new BigDecimal(0));
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

    public org.openz.modules.customerassets.ASSETSSTOCKED getAssetsstocked() {
        return (org.openz.modules.customerassets.ASSETSSTOCKED) get(PROPERTY_ASSETSSTOCKED);
    }

    public void setAssetsstocked(
        org.openz.modules.customerassets.ASSETSSTOCKED assetsstocked) {
        set(PROPERTY_ASSETSSTOCKED, assetsstocked);
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

    public BigDecimal getQty() {
        return (BigDecimal) get(PROPERTY_QTY);
    }

    public void setQty(BigDecimal qty) {
        set(PROPERTY_QTY, qty);
    }

    public BigDecimal getPrice() {
        return (BigDecimal) get(PROPERTY_PRICE);
    }

    public void setPrice(BigDecimal price) {
        set(PROPERTY_PRICE, price);
    }

    public BigDecimal getChargeamt() {
        return (BigDecimal) get(PROPERTY_CHARGEAMT);
    }

    public void setChargeamt(BigDecimal chargeamt) {
        set(PROPERTY_CHARGEAMT, chargeamt);
    }

    public Date getDateofsale() {
        return (Date) get(PROPERTY_DATEOFSALE);
    }

    public void setDateofsale(Date dateofsale) {
        set(PROPERTY_DATEOFSALE, dateofsale);
    }

    public OrderLine getOrderline() {
        return (OrderLine) get(PROPERTY_ORDERLINE);
    }

    public void setOrderline(OrderLine orderline) {
        set(PROPERTY_ORDERLINE, orderline);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public Date getPaymentdate() {
        return (Date) get(PROPERTY_PAYMENTDATE);
    }

    public void setPaymentdate(Date paymentdate) {
        set(PROPERTY_PAYMENTDATE, paymentdate);
    }

    public BigDecimal getAmt() {
        return (BigDecimal) get(PROPERTY_AMT);
    }

    public void setAmt(BigDecimal amt) {
        set(PROPERTY_AMT, amt);
    }
}
