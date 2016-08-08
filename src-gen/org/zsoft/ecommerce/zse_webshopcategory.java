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

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entity class for entity zse_webshopcategory (stored in table zse_webshopcategory).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class zse_webshopcategory extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "zse_webshopcategory";
    public static final String ENTITY_NAME = "zse_webshopcategory";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ZSESHOP = "zSEShop";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_EXTERNALID = "externalid";
    public static final String PROPERTY_TYP = "typ";
    public static final String PROPERTY_SORTORDER = "sortorder";
    public static final String PROPERTY_URL = "url";
    public static final String PROPERTY_TITLE = "title";
    public static final String PROPERTY_FULLTITLE = "fulltitle";
    public static final String PROPERTY_CONTENT = "content";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_COMMONNAME = "commonname";
    public static final String PROPERTY_ZSEWEBSHOPCATEGORYTRLLIST =
        "zseWebshopcategoryTrlList";
    public static final String PROPERTY_ZSEWEBSHOPCATEGORYPRODUCTLIST =
        "zseWebshopcategoryProductList";

    public zse_webshopcategory() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_ZSEWEBSHOPCATEGORYTRLLIST,
            new ArrayList<Object>());
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

    public org.zsoft.ecommerce.zse_shop getZSEShop() {
        return (org.zsoft.ecommerce.zse_shop) get(PROPERTY_ZSESHOP);
    }

    public void setZSEShop(org.zsoft.ecommerce.zse_shop zSEShop) {
        set(PROPERTY_ZSESHOP, zSEShop);
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

    public String getExternalid() {
        return (String) get(PROPERTY_EXTERNALID);
    }

    public void setExternalid(String externalid) {
        set(PROPERTY_EXTERNALID, externalid);
    }

    public String getTyp() {
        return (String) get(PROPERTY_TYP);
    }

    public void setTyp(String typ) {
        set(PROPERTY_TYP, typ);
    }

    public Long getSortorder() {
        return (Long) get(PROPERTY_SORTORDER);
    }

    public void setSortorder(Long sortorder) {
        set(PROPERTY_SORTORDER, sortorder);
    }

    public String getUrl() {
        return (String) get(PROPERTY_URL);
    }

    public void setUrl(String url) {
        set(PROPERTY_URL, url);
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

    public String getCommonname() {
        return (String) get(PROPERTY_COMMONNAME);
    }

    public void setCommonname(String commonname) {
        set(PROPERTY_COMMONNAME, commonname);
    }

    @SuppressWarnings("unchecked")
    public List<org.zsoft.ecommerce.zse_webshopcategory_trl> getZseWebshopcategoryTrlList() {
        return (List<org.zsoft.ecommerce.zse_webshopcategory_trl>) get(PROPERTY_ZSEWEBSHOPCATEGORYTRLLIST);
    }

    public void setZseWebshopcategoryTrlList(
        List<org.zsoft.ecommerce.zse_webshopcategory_trl> zseWebshopcategoryTrlList) {
        set(PROPERTY_ZSEWEBSHOPCATEGORYTRLLIST, zseWebshopcategoryTrlList);
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
