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
package org.zsoft.ecommerce;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.Order;

import java.lang.Boolean;
import java.lang.String;

import java.util.Date;

/**
 * Entity class for entity zse_shoporderstatus (stored in table zse_shoporderstatus).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class zse_shoporderstatus extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "zse_shoporderstatus";
    public static final String ENTITY_NAME = "zse_shoporderstatus";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_ZSESHOP = "zSEShop";
    public static final String PROPERTY_SHOPODERNO = "shopoderno";
    public static final String PROPERTY_EXTERNALID = "externalid";
    public static final String PROPERTY_ORDER = "order";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_MESSAGE = "message";
    public static final String PROPERTY_ISSOTRX = "issotrx";
    public static final String PROPERTY_TRACKINGNO = "trackingno";
    public static final String PROPERTY_SHIPPER = "shipper";
    public static final String PROPERTY_DATEDELIVERED = "datedelivered";

    public zse_shoporderstatus() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_ISSOTRX, true);
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

    public org.zsoft.ecommerce.zse_shop getZSEShop() {
        return (org.zsoft.ecommerce.zse_shop) get(PROPERTY_ZSESHOP);
    }

    public void setZSEShop(org.zsoft.ecommerce.zse_shop zSEShop) {
        set(PROPERTY_ZSESHOP, zSEShop);
    }

    public String getShopoderno() {
        return (String) get(PROPERTY_SHOPODERNO);
    }

    public void setShopoderno(String shopoderno) {
        set(PROPERTY_SHOPODERNO, shopoderno);
    }

    public String getExternalid() {
        return (String) get(PROPERTY_EXTERNALID);
    }

    public void setExternalid(String externalid) {
        set(PROPERTY_EXTERNALID, externalid);
    }

    public Order getOrder() {
        return (Order) get(PROPERTY_ORDER);
    }

    public void setOrder(Order order) {
        set(PROPERTY_ORDER, order);
    }

    public String getStatus() {
        return (String) get(PROPERTY_STATUS);
    }

    public void setStatus(String status) {
        set(PROPERTY_STATUS, status);
    }

    public String getMessage() {
        return (String) get(PROPERTY_MESSAGE);
    }

    public void setMessage(String message) {
        set(PROPERTY_MESSAGE, message);
    }

    public Boolean isSotrx() {
        return (Boolean) get(PROPERTY_ISSOTRX);
    }

    public void setSotrx(Boolean issotrx) {
        set(PROPERTY_ISSOTRX, issotrx);
    }

    public String getTrackingno() {
        return (String) get(PROPERTY_TRACKINGNO);
    }

    public void setTrackingno(String trackingno) {
        set(PROPERTY_TRACKINGNO, trackingno);
    }

    public String getShipper() {
        return (String) get(PROPERTY_SHIPPER);
    }

    public void setShipper(String shipper) {
        set(PROPERTY_SHIPPER, shipper);
    }

    public Date getDatedelivered() {
        return (Date) get(PROPERTY_DATEDELIVERED);
    }

    public void setDatedelivered(Date datedelivered) {
        set(PROPERTY_DATEDELIVERED, datedelivered);
    }
}
