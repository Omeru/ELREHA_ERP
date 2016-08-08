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
package org.openbravo.model.pricing.priceadjustment;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductCategory;
import org.openbravo.model.pricing.pricelist.PriceList;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Entity class for entity m_offerbpartner_v (stored in table m_offerbpartner_v).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class m_offerbpartner_v extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "m_offerbpartner_v";
    public static final String ENTITY_NAME = "m_offerbpartner_v";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_OFFER = "offer";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_PRIORITY = "priority";
    public static final String PROPERTY_ADDAMT = "addamt";
    public static final String PROPERTY_DISCOUNT = "discount";
    public static final String PROPERTY_FIXED = "fixed";
    public static final String PROPERTY_DATEFROM = "datefrom";
    public static final String PROPERTY_DATETO = "dateto";
    public static final String PROPERTY_BPARTNERSELECTION = "bpartnerSelection";
    public static final String PROPERTY_GROUPSELECTION = "groupSelection";
    public static final String PROPERTY_PRODUCTSELECTION = "productSelection";
    public static final String PROPERTY_PRODCATSELECTION = "prodCatSelection";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_PRICELISTSELECTION =
        "pricelistSelection";
    public static final String PROPERTY_QTYFROM = "qTYFrom";
    public static final String PROPERTY_QTYTO = "qTYTo";
    public static final String PROPERTY_BPARTNER = "bpartner";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_UOM = "uom";
    public static final String PROPERTY_MANUFACTURER = "manufacturer";
    public static final String PROPERTY_PRICELIST = "pricelist";
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    public m_offerbpartner_v() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_BPARTNERSELECTION, false);
        setDefaultValue(PROPERTY_GROUPSELECTION, false);
        setDefaultValue(PROPERTY_PRODUCTSELECTION, false);
        setDefaultValue(PROPERTY_PRODCATSELECTION, false);
        setDefaultValue(PROPERTY_PRICELISTSELECTION, false);
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

    public PriceAdjustment getOffer() {
        return (PriceAdjustment) get(PROPERTY_OFFER);
    }

    public void setOffer(PriceAdjustment offer) {
        set(PROPERTY_OFFER, offer);
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

    public Long getPriority() {
        return (Long) get(PROPERTY_PRIORITY);
    }

    public void setPriority(Long priority) {
        set(PROPERTY_PRIORITY, priority);
    }

    public BigDecimal getAddamt() {
        return (BigDecimal) get(PROPERTY_ADDAMT);
    }

    public void setAddamt(BigDecimal addamt) {
        set(PROPERTY_ADDAMT, addamt);
    }

    public BigDecimal getDiscount() {
        return (BigDecimal) get(PROPERTY_DISCOUNT);
    }

    public void setDiscount(BigDecimal discount) {
        set(PROPERTY_DISCOUNT, discount);
    }

    public BigDecimal getFixed() {
        return (BigDecimal) get(PROPERTY_FIXED);
    }

    public void setFixed(BigDecimal fixed) {
        set(PROPERTY_FIXED, fixed);
    }

    public Date getDatefrom() {
        return (Date) get(PROPERTY_DATEFROM);
    }

    public void setDatefrom(Date datefrom) {
        set(PROPERTY_DATEFROM, datefrom);
    }

    public Date getDateto() {
        return (Date) get(PROPERTY_DATETO);
    }

    public void setDateto(Date dateto) {
        set(PROPERTY_DATETO, dateto);
    }

    public Boolean isBpartnerSelection() {
        return (Boolean) get(PROPERTY_BPARTNERSELECTION);
    }

    public void setBpartnerSelection(Boolean bpartnerSelection) {
        set(PROPERTY_BPARTNERSELECTION, bpartnerSelection);
    }

    public Boolean isGroupSelection() {
        return (Boolean) get(PROPERTY_GROUPSELECTION);
    }

    public void setGroupSelection(Boolean groupSelection) {
        set(PROPERTY_GROUPSELECTION, groupSelection);
    }

    public Boolean isProductSelection() {
        return (Boolean) get(PROPERTY_PRODUCTSELECTION);
    }

    public void setProductSelection(Boolean productSelection) {
        set(PROPERTY_PRODUCTSELECTION, productSelection);
    }

    public Boolean isProdCatSelection() {
        return (Boolean) get(PROPERTY_PRODCATSELECTION);
    }

    public void setProdCatSelection(Boolean prodCatSelection) {
        set(PROPERTY_PRODCATSELECTION, prodCatSelection);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public Boolean isPricelistSelection() {
        return (Boolean) get(PROPERTY_PRICELISTSELECTION);
    }

    public void setPricelistSelection(Boolean pricelistSelection) {
        set(PROPERTY_PRICELISTSELECTION, pricelistSelection);
    }

    public BigDecimal getQTYFrom() {
        return (BigDecimal) get(PROPERTY_QTYFROM);
    }

    public void setQTYFrom(BigDecimal qTYFrom) {
        set(PROPERTY_QTYFROM, qTYFrom);
    }

    public BigDecimal getQTYTo() {
        return (BigDecimal) get(PROPERTY_QTYTO);
    }

    public void setQTYTo(BigDecimal qTYTo) {
        set(PROPERTY_QTYTO, qTYTo);
    }

    public BusinessPartner getBpartner() {
        return (BusinessPartner) get(PROPERTY_BPARTNER);
    }

    public void setBpartner(BusinessPartner bpartner) {
        set(PROPERTY_BPARTNER, bpartner);
    }

    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }

    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    public org.openbravo.model.common.uom.UOM getUom() {
        return (org.openbravo.model.common.uom.UOM) get(PROPERTY_UOM);
    }

    public void setUom(org.openbravo.model.common.uom.UOM uom) {
        set(PROPERTY_UOM, uom);
    }

    public org.openbravo.model.common.utility.m_manufacturer getManufacturer() {
        return (org.openbravo.model.common.utility.m_manufacturer) get(PROPERTY_MANUFACTURER);
    }

    public void setManufacturer(
        org.openbravo.model.common.utility.m_manufacturer manufacturer) {
        set(PROPERTY_MANUFACTURER, manufacturer);
    }

    public PriceList getPricelist() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }

    public void setPricelist(PriceList pricelist) {
        set(PROPERTY_PRICELIST, pricelist);
    }

    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }

    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }
}
