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
package org.openbravo.model.dataimport;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;

import java.lang.Boolean;
import java.lang.String;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Entity class for entity i_product_po_v (stored in table i_product_po_v).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class i_product_po_v extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "i_product_po_v";
    public static final String ENTITY_NAME = "i_product_po_v";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_VALUE = "value";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_BPARTNER = "bpartner";
    public static final String PROPERTY_QUALITYRATING = "qualityrating";
    public static final String PROPERTY_ISCURRENTVENDOR = "iscurrentvendor";
    public static final String PROPERTY_UPC = "upc";
    public static final String PROPERTY_CURRENCY = "currency";
    public static final String PROPERTY_UOM = "uom";
    public static final String PROPERTY_PRICELIST = "pricelist";
    public static final String PROPERTY_PRICEPO = "pricepo";
    public static final String PROPERTY_PRICELASTPO = "pricelastpo";
    public static final String PROPERTY_PRICELASTINV = "pricelastinv";
    public static final String PROPERTY_DELIVERYTIMEPROMISED =
        "deliverytimePromised";
    public static final String PROPERTY_VENDORPRODUCTNO = "vendorproductno";
    public static final String PROPERTY_VENDORCATEGORY = "vendorcategory";
    public static final String PROPERTY_MANUFACTURER = "manufacturer";
    public static final String PROPERTY_MANUFACTURERNUMBER =
        "manufacturernumber";
    public static final String PROPERTY_DISCONTINUED = "discontinued";
    public static final String PROPERTY_DISCONTINUEDBY = "discontinuedby";
    public static final String PROPERTY_QTYSTD = "qtystd";
    public static final String PROPERTY_ORDERMIN = "orderMin";
    public static final String PROPERTY_ISMULTIPLEOFMINIMUMQTY =
        "ismultipleofminimumqty";

    public i_product_po_v() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_ISCURRENTVENDOR, false);
        setDefaultValue(PROPERTY_DISCONTINUED, false);
        setDefaultValue(PROPERTY_ISMULTIPLEOFMINIMUMQTY, false);
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

    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }

    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    public Date getCreated() {
        return (Date) get(PROPERTY_CREATED);
    }

    public void setCreated(Date created) {
        set(PROPERTY_CREATED, created);
    }

    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }

    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }

    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ISACTIVE);
    }

    public void setActive(Boolean isactive) {
        set(PROPERTY_ISACTIVE, isactive);
    }

    public String getValue() {
        return (String) get(PROPERTY_VALUE);
    }

    public void setValue(String value) {
        set(PROPERTY_VALUE, value);
    }

    public String getName() {
        return (String) get(PROPERTY_NAME);
    }

    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    public BusinessPartner getBpartner() {
        return (BusinessPartner) get(PROPERTY_BPARTNER);
    }

    public void setBpartner(BusinessPartner bpartner) {
        set(PROPERTY_BPARTNER, bpartner);
    }

    public BigDecimal getQualityrating() {
        return (BigDecimal) get(PROPERTY_QUALITYRATING);
    }

    public void setQualityrating(BigDecimal qualityrating) {
        set(PROPERTY_QUALITYRATING, qualityrating);
    }

    public Boolean isCurrentvendor() {
        return (Boolean) get(PROPERTY_ISCURRENTVENDOR);
    }

    public void setCurrentvendor(Boolean iscurrentvendor) {
        set(PROPERTY_ISCURRENTVENDOR, iscurrentvendor);
    }

    public String getUpc() {
        return (String) get(PROPERTY_UPC);
    }

    public void setUpc(String upc) {
        set(PROPERTY_UPC, upc);
    }

    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }

    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    public org.openbravo.model.common.uom.UOM getUom() {
        return (org.openbravo.model.common.uom.UOM) get(PROPERTY_UOM);
    }

    public void setUom(org.openbravo.model.common.uom.UOM uom) {
        set(PROPERTY_UOM, uom);
    }

    public BigDecimal getPricelist() {
        return (BigDecimal) get(PROPERTY_PRICELIST);
    }

    public void setPricelist(BigDecimal pricelist) {
        set(PROPERTY_PRICELIST, pricelist);
    }

    public BigDecimal getPricepo() {
        return (BigDecimal) get(PROPERTY_PRICEPO);
    }

    public void setPricepo(BigDecimal pricepo) {
        set(PROPERTY_PRICEPO, pricepo);
    }

    public BigDecimal getPricelastpo() {
        return (BigDecimal) get(PROPERTY_PRICELASTPO);
    }

    public void setPricelastpo(BigDecimal pricelastpo) {
        set(PROPERTY_PRICELASTPO, pricelastpo);
    }

    public BigDecimal getPricelastinv() {
        return (BigDecimal) get(PROPERTY_PRICELASTINV);
    }

    public void setPricelastinv(BigDecimal pricelastinv) {
        set(PROPERTY_PRICELASTINV, pricelastinv);
    }

    public BigDecimal getDeliverytimePromised() {
        return (BigDecimal) get(PROPERTY_DELIVERYTIMEPROMISED);
    }

    public void setDeliverytimePromised(BigDecimal deliverytimePromised) {
        set(PROPERTY_DELIVERYTIMEPROMISED, deliverytimePromised);
    }

    public String getVendorproductno() {
        return (String) get(PROPERTY_VENDORPRODUCTNO);
    }

    public void setVendorproductno(String vendorproductno) {
        set(PROPERTY_VENDORPRODUCTNO, vendorproductno);
    }

    public String getVendorcategory() {
        return (String) get(PROPERTY_VENDORCATEGORY);
    }

    public void setVendorcategory(String vendorcategory) {
        set(PROPERTY_VENDORCATEGORY, vendorcategory);
    }

    public org.openbravo.model.common.utility.m_manufacturer getManufacturer() {
        return (org.openbravo.model.common.utility.m_manufacturer) get(PROPERTY_MANUFACTURER);
    }

    public void setManufacturer(
        org.openbravo.model.common.utility.m_manufacturer manufacturer) {
        set(PROPERTY_MANUFACTURER, manufacturer);
    }

    public String getManufacturernumber() {
        return (String) get(PROPERTY_MANUFACTURERNUMBER);
    }

    public void setManufacturernumber(String manufacturernumber) {
        set(PROPERTY_MANUFACTURERNUMBER, manufacturernumber);
    }

    public Boolean isDiscontinued() {
        return (Boolean) get(PROPERTY_DISCONTINUED);
    }

    public void setDiscontinued(Boolean discontinued) {
        set(PROPERTY_DISCONTINUED, discontinued);
    }

    public Date getDiscontinuedby() {
        return (Date) get(PROPERTY_DISCONTINUEDBY);
    }

    public void setDiscontinuedby(Date discontinuedby) {
        set(PROPERTY_DISCONTINUEDBY, discontinuedby);
    }

    public BigDecimal getQtystd() {
        return (BigDecimal) get(PROPERTY_QTYSTD);
    }

    public void setQtystd(BigDecimal qtystd) {
        set(PROPERTY_QTYSTD, qtystd);
    }

    public BigDecimal getOrderMin() {
        return (BigDecimal) get(PROPERTY_ORDERMIN);
    }

    public void setOrderMin(BigDecimal orderMin) {
        set(PROPERTY_ORDERMIN, orderMin);
    }

    public Boolean isMultipleofminimumqty() {
        return (Boolean) get(PROPERTY_ISMULTIPLEOFMINIMUMQTY);
    }

    public void setMultipleofminimumqty(Boolean ismultipleofminimumqty) {
        set(PROPERTY_ISMULTIPLEOFMINIMUMQTY, ismultipleofminimumqty);
    }
}
