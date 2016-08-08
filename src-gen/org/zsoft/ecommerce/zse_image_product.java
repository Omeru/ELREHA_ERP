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
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.common.enterprise.Organization;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

import java.util.Date;

/**
 * Entity class for entity zse_image_product (stored in table zse_image_product).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class zse_image_product extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "zse_image_product";
    public static final String ENTITY_NAME = "zse_image_product";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_SEQNO = "seqno";
    public static final String PROPERTY_ISACTIVE = "isactive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_ZSEPRODUCTSHOP = "zSEProductShop";
    public static final String PROPERTY_IMAGE = "image";
    public static final String PROPERTY_ZSESHOP = "zSEShop";
    public static final String PROPERTY_EXTERNALID = "externalid";
    public static final String PROPERTY_EXTERNALIDPARENT = "externalidparent";
    public static final String PROPERTY_MESSAGE = "message";
    public static final String PROPERTY_URL = "url";

    public zse_image_product() {
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

    public Long getSeqno() {
        return (Long) get(PROPERTY_SEQNO);
    }

    public void setSeqno(Long seqno) {
        set(PROPERTY_SEQNO, seqno);
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

    public Zse_product_shop getZSEProductShop() {
        return (Zse_product_shop) get(PROPERTY_ZSEPRODUCTSHOP);
    }

    public void setZSEProductShop(Zse_product_shop zSEProductShop) {
        set(PROPERTY_ZSEPRODUCTSHOP, zSEProductShop);
    }

    public Image getImage() {
        return (Image) get(PROPERTY_IMAGE);
    }

    public void setImage(Image image) {
        set(PROPERTY_IMAGE, image);
    }

    public org.zsoft.ecommerce.zse_shop getZSEShop() {
        return (org.zsoft.ecommerce.zse_shop) get(PROPERTY_ZSESHOP);
    }

    public void setZSEShop(org.zsoft.ecommerce.zse_shop zSEShop) {
        set(PROPERTY_ZSESHOP, zSEShop);
    }

    public String getExternalid() {
        return (String) get(PROPERTY_EXTERNALID);
    }

    public void setExternalid(String externalid) {
        set(PROPERTY_EXTERNALID, externalid);
    }

    public String getExternalidparent() {
        return (String) get(PROPERTY_EXTERNALIDPARENT);
    }

    public void setExternalidparent(String externalidparent) {
        set(PROPERTY_EXTERNALIDPARENT, externalidparent);
    }

    public String getMessage() {
        return (String) get(PROPERTY_MESSAGE);
    }

    public void setMessage(String message) {
        set(PROPERTY_MESSAGE, message);
    }

    public String getUrl() {
        return (String) get(PROPERTY_URL);
    }

    public void setUrl(String url) {
        set(PROPERTY_URL, url);
    }
}
