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
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.geography.Country;
import org.openbravo.model.common.plm.AttributeSet;
import org.openbravo.model.common.plm.ProductCategory;
import org.openbravo.model.financialmgmt.tax.TaxRate;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

import java.math.BigDecimal;

import java.util.Date;

/**
 * Entity class for entity i_product_v (stored in table i_product_v).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class i_product_v extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "i_product_v";
    public static final String ENTITY_NAME = "i_product_v";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_IMAGEURL = "imageurl";
    public static final String PROPERTY_VALUE = "value";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_DESCRIPTIONURL = "descriptionurl";
    public static final String PROPERTY_UPC = "upc";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_DOCUMENTNOTE = "documentnote";
    public static final String PROPERTY_UOM = "uom";
    public static final String PROPERTY_ISSTOCKED = "isstocked";
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";
    public static final String PROPERTY_VOLUME = "volume";
    public static final String PROPERTY_WEIGHT = "weight";
    public static final String PROPERTY_SHELFWIDTH = "shelfwidth";
    public static final String PROPERTY_SHELFHEIGHT = "shelfheight";
    public static final String PROPERTY_SHELFDEPTH = "shelfdepth";
    public static final String PROPERTY_UNITSPERPALLET = "unitsperpallet";
    public static final String PROPERTY_DISCONTINUED = "discontinued";
    public static final String PROPERTY_DISCONTINUEDBY = "discontinuedby";
    public static final String PROPERTY_PRODUCTTYPE = "producttype";
    public static final String PROPERTY_ATTRIBUTESET = "attributeset";
    public static final String PROPERTY_LOCATOR = "locator";
    public static final String PROPERTY_ISPURCHASED = "ispurchased";
    public static final String PROPERTY_ISSOLD = "issold";
    public static final String PROPERTY_ISBOM = "isbom";
    public static final String PROPERTY_CALCULATED = "calculated";
    public static final String PROPERTY_PRODUCTION = "production";
    public static final String PROPERTY_TAX = "tax";
    public static final String PROPERTY_TYPEOFPRODUCT = "typeofproduct";
    public static final String PROPERTY_ISSERVICEITEM = "isserviceitem";
    public static final String PROPERTY_ISCONSUMABLE = "isconsumable";
    public static final String PROPERTY_ISSPAREPART = "issparepart";
    public static final String PROPERTY_ISFREIGHTPRODUCT = "isfreightproduct";
    public static final String PROPERTY_ISSETITEM = "issetitem";
    public static final String PROPERTY_ISSERIALTRACKING = "isserialtracking";
    public static final String PROPERTY_ISBATCHTRACKING = "isbatchtracking";
    public static final String PROPERTY_CUSOMSTARIFNO = "cusomstarifno";
    public static final String PROPERTY_COUNTRY = "country";
    public static final String PROPERTY_BASEPRICEUNIT = "basepriceunit";
    public static final String PROPERTY_BASEPRICEMULTIPLICATOR =
        "basepricemultiplicator";
    public static final String PROPERTY_MANUFACTURER = "manufacturer";
    public static final String PROPERTY_MANUFACTURERNUMBER =
        "manufacturernumber";

    public i_product_v() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_ISSTOCKED, false);
        setDefaultValue(PROPERTY_DISCONTINUED, false);
        setDefaultValue(PROPERTY_ISPURCHASED, false);
        setDefaultValue(PROPERTY_ISSOLD, false);
        setDefaultValue(PROPERTY_ISBOM, false);
        setDefaultValue(PROPERTY_CALCULATED, false);
        setDefaultValue(PROPERTY_PRODUCTION, false);
        setDefaultValue(PROPERTY_ISSERVICEITEM, false);
        setDefaultValue(PROPERTY_ISCONSUMABLE, false);
        setDefaultValue(PROPERTY_ISSPAREPART, false);
        setDefaultValue(PROPERTY_ISFREIGHTPRODUCT, false);
        setDefaultValue(PROPERTY_ISSETITEM, false);
        setDefaultValue(PROPERTY_ISSERIALTRACKING, false);
        setDefaultValue(PROPERTY_ISBATCHTRACKING, false);
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

    public String getImageurl() {
        return (String) get(PROPERTY_IMAGEURL);
    }

    public void setImageurl(String imageurl) {
        set(PROPERTY_IMAGEURL, imageurl);
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

    public String getDescriptionurl() {
        return (String) get(PROPERTY_DESCRIPTIONURL);
    }

    public void setDescriptionurl(String descriptionurl) {
        set(PROPERTY_DESCRIPTIONURL, descriptionurl);
    }

    public String getUpc() {
        return (String) get(PROPERTY_UPC);
    }

    public void setUpc(String upc) {
        set(PROPERTY_UPC, upc);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public String getDocumentnote() {
        return (String) get(PROPERTY_DOCUMENTNOTE);
    }

    public void setDocumentnote(String documentnote) {
        set(PROPERTY_DOCUMENTNOTE, documentnote);
    }

    public org.openbravo.model.common.uom.UOM getUom() {
        return (org.openbravo.model.common.uom.UOM) get(PROPERTY_UOM);
    }

    public void setUom(org.openbravo.model.common.uom.UOM uom) {
        set(PROPERTY_UOM, uom);
    }

    public Boolean isStocked() {
        return (Boolean) get(PROPERTY_ISSTOCKED);
    }

    public void setStocked(Boolean isstocked) {
        set(PROPERTY_ISSTOCKED, isstocked);
    }

    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }

    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    public BigDecimal getVolume() {
        return (BigDecimal) get(PROPERTY_VOLUME);
    }

    public void setVolume(BigDecimal volume) {
        set(PROPERTY_VOLUME, volume);
    }

    public BigDecimal getWeight() {
        return (BigDecimal) get(PROPERTY_WEIGHT);
    }

    public void setWeight(BigDecimal weight) {
        set(PROPERTY_WEIGHT, weight);
    }

    public BigDecimal getShelfwidth() {
        return (BigDecimal) get(PROPERTY_SHELFWIDTH);
    }

    public void setShelfwidth(BigDecimal shelfwidth) {
        set(PROPERTY_SHELFWIDTH, shelfwidth);
    }

    public BigDecimal getShelfheight() {
        return (BigDecimal) get(PROPERTY_SHELFHEIGHT);
    }

    public void setShelfheight(BigDecimal shelfheight) {
        set(PROPERTY_SHELFHEIGHT, shelfheight);
    }

    public BigDecimal getShelfdepth() {
        return (BigDecimal) get(PROPERTY_SHELFDEPTH);
    }

    public void setShelfdepth(BigDecimal shelfdepth) {
        set(PROPERTY_SHELFDEPTH, shelfdepth);
    }

    public Long getUnitsperpallet() {
        return (Long) get(PROPERTY_UNITSPERPALLET);
    }

    public void setUnitsperpallet(Long unitsperpallet) {
        set(PROPERTY_UNITSPERPALLET, unitsperpallet);
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

    public String getProducttype() {
        return (String) get(PROPERTY_PRODUCTTYPE);
    }

    public void setProducttype(String producttype) {
        set(PROPERTY_PRODUCTTYPE, producttype);
    }

    public AttributeSet getAttributeset() {
        return (AttributeSet) get(PROPERTY_ATTRIBUTESET);
    }

    public void setAttributeset(AttributeSet attributeset) {
        set(PROPERTY_ATTRIBUTESET, attributeset);
    }

    public Locator getLocator() {
        return (Locator) get(PROPERTY_LOCATOR);
    }

    public void setLocator(Locator locator) {
        set(PROPERTY_LOCATOR, locator);
    }

    public Boolean isPurchased() {
        return (Boolean) get(PROPERTY_ISPURCHASED);
    }

    public void setPurchased(Boolean ispurchased) {
        set(PROPERTY_ISPURCHASED, ispurchased);
    }

    public Boolean isSold() {
        return (Boolean) get(PROPERTY_ISSOLD);
    }

    public void setSold(Boolean issold) {
        set(PROPERTY_ISSOLD, issold);
    }

    public Boolean isBom() {
        return (Boolean) get(PROPERTY_ISBOM);
    }

    public void setBom(Boolean isbom) {
        set(PROPERTY_ISBOM, isbom);
    }

    public Boolean isCalculated() {
        return (Boolean) get(PROPERTY_CALCULATED);
    }

    public void setCalculated(Boolean calculated) {
        set(PROPERTY_CALCULATED, calculated);
    }

    public Boolean isProduction() {
        return (Boolean) get(PROPERTY_PRODUCTION);
    }

    public void setProduction(Boolean production) {
        set(PROPERTY_PRODUCTION, production);
    }

    public TaxRate getTax() {
        return (TaxRate) get(PROPERTY_TAX);
    }

    public void setTax(TaxRate tax) {
        set(PROPERTY_TAX, tax);
    }

    public String getTypeofproduct() {
        return (String) get(PROPERTY_TYPEOFPRODUCT);
    }

    public void setTypeofproduct(String typeofproduct) {
        set(PROPERTY_TYPEOFPRODUCT, typeofproduct);
    }

    public Boolean isServiceitem() {
        return (Boolean) get(PROPERTY_ISSERVICEITEM);
    }

    public void setServiceitem(Boolean isserviceitem) {
        set(PROPERTY_ISSERVICEITEM, isserviceitem);
    }

    public Boolean isConsumable() {
        return (Boolean) get(PROPERTY_ISCONSUMABLE);
    }

    public void setConsumable(Boolean isconsumable) {
        set(PROPERTY_ISCONSUMABLE, isconsumable);
    }

    public Boolean isSparepart() {
        return (Boolean) get(PROPERTY_ISSPAREPART);
    }

    public void setSparepart(Boolean issparepart) {
        set(PROPERTY_ISSPAREPART, issparepart);
    }

    public Boolean isFreightproduct() {
        return (Boolean) get(PROPERTY_ISFREIGHTPRODUCT);
    }

    public void setFreightproduct(Boolean isfreightproduct) {
        set(PROPERTY_ISFREIGHTPRODUCT, isfreightproduct);
    }

    public Boolean isSetitem() {
        return (Boolean) get(PROPERTY_ISSETITEM);
    }

    public void setSetitem(Boolean issetitem) {
        set(PROPERTY_ISSETITEM, issetitem);
    }

    public Boolean isSerialtracking() {
        return (Boolean) get(PROPERTY_ISSERIALTRACKING);
    }

    public void setSerialtracking(Boolean isserialtracking) {
        set(PROPERTY_ISSERIALTRACKING, isserialtracking);
    }

    public Boolean isBatchtracking() {
        return (Boolean) get(PROPERTY_ISBATCHTRACKING);
    }

    public void setBatchtracking(Boolean isbatchtracking) {
        set(PROPERTY_ISBATCHTRACKING, isbatchtracking);
    }

    public String getCusomstarifno() {
        return (String) get(PROPERTY_CUSOMSTARIFNO);
    }

    public void setCusomstarifno(String cusomstarifno) {
        set(PROPERTY_CUSOMSTARIFNO, cusomstarifno);
    }

    public Country getCountry() {
        return (Country) get(PROPERTY_COUNTRY);
    }

    public void setCountry(Country country) {
        set(PROPERTY_COUNTRY, country);
    }

    public String getBasepriceunit() {
        return (String) get(PROPERTY_BASEPRICEUNIT);
    }

    public void setBasepriceunit(String basepriceunit) {
        set(PROPERTY_BASEPRICEUNIT, basepriceunit);
    }

    public BigDecimal getBasepricemultiplicator() {
        return (BigDecimal) get(PROPERTY_BASEPRICEMULTIPLICATOR);
    }

    public void setBasepricemultiplicator(BigDecimal basepricemultiplicator) {
        set(PROPERTY_BASEPRICEMULTIPLICATOR, basepricemultiplicator);
    }

    public String getManufacturer() {
        return (String) get(PROPERTY_MANUFACTURER);
    }

    public void setManufacturer(String manufacturer) {
        set(PROPERTY_MANUFACTURER, manufacturer);
    }

    public String getManufacturernumber() {
        return (String) get(PROPERTY_MANUFACTURERNUMBER);
    }

    public void setManufacturernumber(String manufacturernumber) {
        set(PROPERTY_MANUFACTURERNUMBER, manufacturernumber);
    }
}
