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
package org.openbravo.model.pricing.discount;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.pricing.pricelist.PriceList;

import java.lang.Boolean;
import java.lang.String;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Entity class for entity m_pricelist_overview (stored in table m_pricelist_overview).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class m_pricelist_overview extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "m_pricelist_overview";
    public static final String ENTITY_NAME = "m_pricelist_overview";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_VALIDFROM = "validfrom";
    public static final String PROPERTY_PRICELIST = "pricelist";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_PRICELIST11 = "pricelist11";
    public static final String PROPERTY_PRICESTD = "pricestd";
    public static final String PROPERTY_PRICELIMIT = "pricelimit";

    public m_pricelist_overview() {
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

    public Date getValidfrom() {
        return (Date) get(PROPERTY_VALIDFROM);
    }

    public void setValidfrom(Date validfrom) {
        set(PROPERTY_VALIDFROM, validfrom);
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

    public BigDecimal getPricelist11() {
        return (BigDecimal) get(PROPERTY_PRICELIST11);
    }

    public void setPricelist11(BigDecimal pricelist11) {
        set(PROPERTY_PRICELIST11, pricelist11);
    }

    public BigDecimal getPricestd() {
        return (BigDecimal) get(PROPERTY_PRICESTD);
    }

    public void setPricestd(BigDecimal pricestd) {
        set(PROPERTY_PRICESTD, pricestd);
    }

    public BigDecimal getPricelimit() {
        return (BigDecimal) get(PROPERTY_PRICELIMIT);
    }

    public void setPricelimit(BigDecimal pricelimit) {
        set(PROPERTY_PRICELIMIT, pricelimit);
    }
}
