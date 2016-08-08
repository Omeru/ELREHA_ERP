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
import org.openbravo.model.common.plm.Product;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entity class for entity zse_product_shop (stored in table zse_product_shop).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Zse_product_shop extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "zse_product_shop";
    public static final String ENTITY_NAME = "zse_product_shop";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_ZSESHOP = "zSEShop";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_ECCATEGORY = "eccategory";
    public static final String PROPERTY_ECPRIORITY = "ecpriority";
    public static final String PROPERTY_ISORDERABLE = "isorderable";
    public static final String PROPERTY_HIDEONNOSTOCK = "hideonnostock";
    public static final String PROPERTY_ALLWORDERONNOSTOCK =
        "allworderonnostock";
    public static final String PROPERTY_DELIVERYTIMEPROMISED =
        "deliverytimePromised";
    public static final String PROPERTY_MAXSTOCKSHOWN = "maxstockshown";
    public static final String PROPERTY_MINORDERQTY = "minorderqty";
    public static final String PROPERTY_MAXORDERQTY = "maxorderqty";
    public static final String PROPERTY_TITLE = "title";
    public static final String PROPERTY_FULLTITLE = "fulltitle";
    public static final String PROPERTY_CONTENT = "content";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_EXTERNALID = "externalid";
    public static final String PROPERTY_EXTERNALID2 = "externalid2";
    public static final String PROPERTY_ISMASTER = "ismaster";
    public static final String PROPERTY_ZSERELATIONPRODUCTLIST =
        "zseRelationProductList";
    public static final String PROPERTY_ZSETAGPRODUCTLIST = "zseTagProductList";
    public static final String PROPERTY_ZSEPRODUCTSHOPTRLLIST =
        "zseProductShopTrlList";
    public static final String PROPERTY_ZSEIMAGEPRODUCTLIST =
        "zseImageProductList";
    public static final String PROPERTY_ZSEWEBSHOPCATEGORYPRODUCTLIST =
        "zseWebshopcategoryProductList";

    public Zse_product_shop() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_ISORDERABLE, false);
        setDefaultValue(PROPERTY_HIDEONNOSTOCK, false);
        setDefaultValue(PROPERTY_ALLWORDERONNOSTOCK, true);
        setDefaultValue(PROPERTY_ISMASTER, false);
        setDefaultValue(PROPERTY_ZSERELATIONPRODUCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ZSETAGPRODUCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ZSEPRODUCTSHOPTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ZSEIMAGEPRODUCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ZSEWEBSHOPCATEGORYPRODUCTLIST,
            new ArrayList<Object>());
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

    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }

    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    public String getEccategory() {
        return (String) get(PROPERTY_ECCATEGORY);
    }

    public void setEccategory(String eccategory) {
        set(PROPERTY_ECCATEGORY, eccategory);
    }

    public Long getEcpriority() {
        return (Long) get(PROPERTY_ECPRIORITY);
    }

    public void setEcpriority(Long ecpriority) {
        set(PROPERTY_ECPRIORITY, ecpriority);
    }

    public Boolean isOrderable() {
        return (Boolean) get(PROPERTY_ISORDERABLE);
    }

    public void setOrderable(Boolean isorderable) {
        set(PROPERTY_ISORDERABLE, isorderable);
    }

    public Boolean isHideonnostock() {
        return (Boolean) get(PROPERTY_HIDEONNOSTOCK);
    }

    public void setHideonnostock(Boolean hideonnostock) {
        set(PROPERTY_HIDEONNOSTOCK, hideonnostock);
    }

    public Boolean isAllworderonnostock() {
        return (Boolean) get(PROPERTY_ALLWORDERONNOSTOCK);
    }

    public void setAllworderonnostock(Boolean allworderonnostock) {
        set(PROPERTY_ALLWORDERONNOSTOCK, allworderonnostock);
    }

    public Long getDeliverytimePromised() {
        return (Long) get(PROPERTY_DELIVERYTIMEPROMISED);
    }

    public void setDeliverytimePromised(Long deliverytimePromised) {
        set(PROPERTY_DELIVERYTIMEPROMISED, deliverytimePromised);
    }

    public Long getMaxstockshown() {
        return (Long) get(PROPERTY_MAXSTOCKSHOWN);
    }

    public void setMaxstockshown(Long maxstockshown) {
        set(PROPERTY_MAXSTOCKSHOWN, maxstockshown);
    }

    public Long getMinorderqty() {
        return (Long) get(PROPERTY_MINORDERQTY);
    }

    public void setMinorderqty(Long minorderqty) {
        set(PROPERTY_MINORDERQTY, minorderqty);
    }

    public Long getMaxorderqty() {
        return (Long) get(PROPERTY_MAXORDERQTY);
    }

    public void setMaxorderqty(Long maxorderqty) {
        set(PROPERTY_MAXORDERQTY, maxorderqty);
    }

    public String getTitle() {
        return (String) get(PROPERTY_TITLE);
    }

    public void setTitle(String title) {
        set(PROPERTY_TITLE, title);
    }

    public String getFulltitle() {
        return (String) get(PROPERTY_FULLTITLE);
    }

    public void setFulltitle(String fulltitle) {
        set(PROPERTY_FULLTITLE, fulltitle);
    }

    public String getContent() {
        return (String) get(PROPERTY_CONTENT);
    }

    public void setContent(String content) {
        set(PROPERTY_CONTENT, content);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public String getExternalid() {
        return (String) get(PROPERTY_EXTERNALID);
    }

    public void setExternalid(String externalid) {
        set(PROPERTY_EXTERNALID, externalid);
    }

    public String getExternalid2() {
        return (String) get(PROPERTY_EXTERNALID2);
    }

    public void setExternalid2(String externalid2) {
        set(PROPERTY_EXTERNALID2, externalid2);
    }

    public Boolean isMaster() {
        return (Boolean) get(PROPERTY_ISMASTER);
    }

    public void setMaster(Boolean ismaster) {
        set(PROPERTY_ISMASTER, ismaster);
    }

    @SuppressWarnings("unchecked")
    public List<org.zsoft.ecommerce.zse_relation_product> getZseRelationProductList() {
        return (List<org.zsoft.ecommerce.zse_relation_product>) get(PROPERTY_ZSERELATIONPRODUCTLIST);
    }

    public void setZseRelationProductList(
        List<org.zsoft.ecommerce.zse_relation_product> zseRelationProductList) {
        set(PROPERTY_ZSERELATIONPRODUCTLIST, zseRelationProductList);
    }

    @SuppressWarnings("unchecked")
    public List<org.zsoft.ecommerce.zse_tag_product> getZseTagProductList() {
        return (List<org.zsoft.ecommerce.zse_tag_product>) get(PROPERTY_ZSETAGPRODUCTLIST);
    }

    public void setZseTagProductList(
        List<org.zsoft.ecommerce.zse_tag_product> zseTagProductList) {
        set(PROPERTY_ZSETAGPRODUCTLIST, zseTagProductList);
    }

    @SuppressWarnings("unchecked")
    public List<org.zsoft.ecommerce.zse_product_shop_trl> getZseProductShopTrlList() {
        return (List<org.zsoft.ecommerce.zse_product_shop_trl>) get(PROPERTY_ZSEPRODUCTSHOPTRLLIST);
    }

    public void setZseProductShopTrlList(
        List<org.zsoft.ecommerce.zse_product_shop_trl> zseProductShopTrlList) {
        set(PROPERTY_ZSEPRODUCTSHOPTRLLIST, zseProductShopTrlList);
    }

    @SuppressWarnings("unchecked")
    public List<org.zsoft.ecommerce.zse_image_product> getZseImageProductList() {
        return (List<org.zsoft.ecommerce.zse_image_product>) get(PROPERTY_ZSEIMAGEPRODUCTLIST);
    }

    public void setZseImageProductList(
        List<org.zsoft.ecommerce.zse_image_product> zseImageProductList) {
        set(PROPERTY_ZSEIMAGEPRODUCTLIST, zseImageProductList);
    }

    @SuppressWarnings("unchecked")
    public List<org.zsoft.ecommerce.zse_webshopcategory_product> getZseWebshopcategoryProductList() {
        return (List<org.zsoft.ecommerce.zse_webshopcategory_product>) get(PROPERTY_ZSEWEBSHOPCATEGORYPRODUCTLIST);
    }

    public void setZseWebshopcategoryProductList(
        List<org.zsoft.ecommerce.zse_webshopcategory_product> zseWebshopcategoryProductList) {
        set(PROPERTY_ZSEWEBSHOPCATEGORYPRODUCTLIST,
            zseWebshopcategoryProductList);
    }
}
