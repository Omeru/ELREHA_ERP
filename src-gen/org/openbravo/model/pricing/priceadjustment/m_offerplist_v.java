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
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.pricing.pricelist.PriceList;
import org.openbravo.model.pricing.pricelist.ProductPrice;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Entity class for entity m_offerplist_v (stored in table m_offerplist_v).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class m_offerplist_v extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "m_offerplist_v";
    public static final String ENTITY_NAME = "m_offerplist_v";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_PRODUCTPRICE = "productprice";
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
    public static final String PROPERTY_ISSALESOFFER = "issalesoffer";
    public static final String PROPERTY_DIRECTPURCHASECALC =
        "directpurchasecalc";
    public static final String PROPERTY_PRICELIST = "pricelist";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_UOM = "uom";

    public m_offerplist_v() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_ISSALESOFFER, false);
        setDefaultValue(PROPERTY_DIRECTPURCHASECALC, false);
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

    public ProductPrice getProductprice() {
        return (ProductPrice) get(PROPERTY_PRODUCTPRICE);
    }

    public void setProductprice(ProductPrice productprice) {
        set(PROPERTY_PRODUCTPRICE, productprice);
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

    public String getBpartnerSelection() {
        return (String) get(PROPERTY_BPARTNERSELECTION);
    }

    public void setBpartnerSelection(String bpartnerSelection) {
        set(PROPERTY_BPARTNERSELECTION, bpartnerSelection);
    }

    public String getGroupSelection() {
        return (String) get(PROPERTY_GROUPSELECTION);
    }

    public void setGroupSelection(String groupSelection) {
        set(PROPERTY_GROUPSELECTION, groupSelection);
    }

    public String getProductSelection() {
        return (String) get(PROPERTY_PRODUCTSELECTION);
    }

    public void setProductSelection(String productSelection) {
        set(PROPERTY_PRODUCTSELECTION, productSelection);
    }

    public String getProdCatSelection() {
        return (String) get(PROPERTY_PRODCATSELECTION);
    }

    public void setProdCatSelection(String prodCatSelection) {
        set(PROPERTY_PRODCATSELECTION, prodCatSelection);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public String getPricelistSelection() {
        return (String) get(PROPERTY_PRICELISTSELECTION);
    }

    public void setPricelistSelection(String pricelistSelection) {
        set(PROPERTY_PRICELISTSELECTION, pricelistSelection);
    }

    public Long getQTYFrom() {
        return (Long) get(PROPERTY_QTYFROM);
    }

    public void setQTYFrom(Long qTYFrom) {
        set(PROPERTY_QTYFROM, qTYFrom);
    }

    public Long getQTYTo() {
        return (Long) get(PROPERTY_QTYTO);
    }

    public void setQTYTo(Long qTYTo) {
        set(PROPERTY_QTYTO, qTYTo);
    }

    public Boolean isSalesoffer() {
        return (Boolean) get(PROPERTY_ISSALESOFFER);
    }

    public void setSalesoffer(Boolean issalesoffer) {
        set(PROPERTY_ISSALESOFFER, issalesoffer);
    }

    public Boolean isDirectpurchasecalc() {
        return (Boolean) get(PROPERTY_DIRECTPURCHASECALC);
    }

    public void setDirectpurchasecalc(Boolean directpurchasecalc) {
        set(PROPERTY_DIRECTPURCHASECALC, directpurchasecalc);
    }

    public PriceList getPricelist() {
        return (PriceList) get(PROPERTY_PRICELIST);
    }

    public void setPricelist(PriceList pricelist) {
        set(PROPERTY_PRICELIST, pricelist);
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
}
