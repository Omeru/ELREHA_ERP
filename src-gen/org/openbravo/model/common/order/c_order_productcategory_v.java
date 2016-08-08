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
package org.openbravo.model.common.order;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.businesspartner.Location;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.plm.Product;
import org.openbravo.model.common.plm.ProductCategory;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

import java.util.Date;

/**
 * Entity class for entity c_order_overview (stored in table c_order_productcategory_v).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class c_order_productcategory_v extends BaseOBObject
    implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "c_order_productcategory_v";
    public static final String ENTITY_NAME = "c_order_overview";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_ORDERLINE = "orderline";
    public static final String PROPERTY_ORDER = "order";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_BILLTO = "billto";
    public static final String PROPERTY_LINE = "line";
    public static final String PROPERTY_DOCUMENTNO = "documentno";
    public static final String PROPERTY_DATEORDERED = "dateordered";
    public static final String PROPERTY_DOCSTATUS = "docstatus";
    public static final String PROPERTY_INTERNALNOTE = "internalnote";
    public static final String PROPERTY_BPARTNER = "bpartner";
    public static final String PROPERTY_BPARTNERLOCATION = "bpartnerLocation";
    public static final String PROPERTY_USER = "user";
    public static final String PROPERTY_SALESREP = "salesrep";
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_QTYORDERED = "qtyordered";
    public static final String PROPERTY_QTYAVAILABLE = "qtyavailable";
    public static final String PROPERTY_DELIVERYCOMPLETE = "deliverycomplete";
    public static final String PROPERTY_ISCUSTOMER = "iscustomer";
    public static final String PROPERTY_ISVENDOR = "isvendor";

    public c_order_productcategory_v() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_DELIVERYCOMPLETE, false);
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

    public OrderLine getOrderline() {
        return (OrderLine) get(PROPERTY_ORDERLINE);
    }

    public void setOrderline(OrderLine orderline) {
        set(PROPERTY_ORDERLINE, orderline);
    }

    public Order getOrder() {
        return (Order) get(PROPERTY_ORDER);
    }

    public void setOrder(Order order) {
        set(PROPERTY_ORDER, order);
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

    public Location getBillto() {
        return (Location) get(PROPERTY_BILLTO);
    }

    public void setBillto(Location billto) {
        set(PROPERTY_BILLTO, billto);
    }

    public Long getLine() {
        return (Long) get(PROPERTY_LINE);
    }

    public void setLine(Long line) {
        set(PROPERTY_LINE, line);
    }

    public String getDocumentno() {
        return (String) get(PROPERTY_DOCUMENTNO);
    }

    public void setDocumentno(String documentno) {
        set(PROPERTY_DOCUMENTNO, documentno);
    }

    public Date getDateordered() {
        return (Date) get(PROPERTY_DATEORDERED);
    }

    public void setDateordered(Date dateordered) {
        set(PROPERTY_DATEORDERED, dateordered);
    }

    public String getDocstatus() {
        return (String) get(PROPERTY_DOCSTATUS);
    }

    public void setDocstatus(String docstatus) {
        set(PROPERTY_DOCSTATUS, docstatus);
    }

    public String getInternalnote() {
        return (String) get(PROPERTY_INTERNALNOTE);
    }

    public void setInternalnote(String internalnote) {
        set(PROPERTY_INTERNALNOTE, internalnote);
    }

    public BusinessPartner getBpartner() {
        return (BusinessPartner) get(PROPERTY_BPARTNER);
    }

    public void setBpartner(BusinessPartner bpartner) {
        set(PROPERTY_BPARTNER, bpartner);
    }

    public org.openbravo.model.common.geography.Location getBpartnerLocation() {
        return (org.openbravo.model.common.geography.Location) get(PROPERTY_BPARTNERLOCATION);
    }

    public void setBpartnerLocation(
        org.openbravo.model.common.geography.Location bpartnerLocation) {
        set(PROPERTY_BPARTNERLOCATION, bpartnerLocation);
    }

    public User getUser() {
        return (User) get(PROPERTY_USER);
    }

    public void setUser(User user) {
        set(PROPERTY_USER, user);
    }

    public User getSalesrep() {
        return (User) get(PROPERTY_SALESREP);
    }

    public void setSalesrep(User salesrep) {
        set(PROPERTY_SALESREP, salesrep);
    }

    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }

    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }

    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    public Long getQtyordered() {
        return (Long) get(PROPERTY_QTYORDERED);
    }

    public void setQtyordered(Long qtyordered) {
        set(PROPERTY_QTYORDERED, qtyordered);
    }

    public Long getQtyavailable() {
        return (Long) get(PROPERTY_QTYAVAILABLE);
    }

    public void setQtyavailable(Long qtyavailable) {
        set(PROPERTY_QTYAVAILABLE, qtyavailable);
    }

    public Boolean isDeliverycomplete() {
        return (Boolean) get(PROPERTY_DELIVERYCOMPLETE);
    }

    public void setDeliverycomplete(Boolean deliverycomplete) {
        set(PROPERTY_DELIVERYCOMPLETE, deliverycomplete);
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
}
