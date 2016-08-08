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
package org.openz.modules.customerassets;

import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.currency.Currency;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.enterprise.Warehouse;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.plm.Product;

import java.lang.Boolean;
import java.lang.String;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entity class for entity CA_Assetsstocked (stored in table CA_Assetsstocked).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class ASSETSSTOCKED extends BaseOBObject implements ClientEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "CA_Assetsstocked";
    public static final String ENTITY_NAME = "CA_Assetsstocked";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORG = "org";
    public static final String PROPERTY_ISACTIVE = "isActive";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_BPARTNER = "bPartner";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_QTY = "qty";
    public static final String PROPERTY_PRICE = "price";
    public static final String PROPERTY_CHARGEAMT = "chargeAmt";
    public static final String PROPERTY_STATUSREF = "statusref";
    public static final String PROPERTY_DATEORDERED = "dateOrdered";
    public static final String PROPERTY_DATEDELIVERED = "dateDelivered";
    public static final String PROPERTY_DATEOFSALE = "dateOfSale";
    public static final String PROPERTY_DATESTOCKFEEUNTIL = "dateStockFeeUntil";
    public static final String PROPERTY_ORDERLINE = "orderLine";
    public static final String PROPERTY_SNRMASTERDATA = "sNRMasterdata";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_WAREHOUSE = "warehouse";
    public static final String PROPERTY_PAYMENTDATE = "paymentdate";
    public static final String PROPERTY_AMT = "amt";
    public static final String PROPERTY_QTYSOLD = "qtysold";
    public static final String PROPERTY_ACTUALQTY = "actualqty";
    public static final String PROPERTY_POORDERLINE = "poorderline";
    public static final String PROPERTY_STOCKCHARGE = "stockcharge";
    public static final String PROPERTY_CURRENCY = "currency";
    public static final String PROPERTY_CAASSETSSTOCKEDBOMLIST =
        "cAASSETSSTOCKEDBOMList";
    public static final String PROPERTY_CAASSETSSTOCKEDSALESLIST =
        "cAASSETSSTOCKEDSALESList";

    public ASSETSSTOCKED() {
        setDefaultValue(PROPERTY_ISACTIVE, true);
        setDefaultValue(PROPERTY_PRICE, new BigDecimal(0));
        setDefaultValue(PROPERTY_CHARGEAMT, new BigDecimal(0));
        setDefaultValue(PROPERTY_QTYSOLD, new BigDecimal(0));
        setDefaultValue(PROPERTY_ACTUALQTY, new BigDecimal(0));
        setDefaultValue(PROPERTY_STOCKCHARGE, new BigDecimal(0));
        setDefaultValue(PROPERTY_CAASSETSSTOCKEDBOMLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_CAASSETSSTOCKEDSALESLIST,
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

    public void setActive(Boolean isActive) {
        set(PROPERTY_ISACTIVE, isActive);
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

    public BusinessPartner getBPartner() {
        return (BusinessPartner) get(PROPERTY_BPARTNER);
    }

    public void setBPartner(BusinessPartner bPartner) {
        set(PROPERTY_BPARTNER, bPartner);
    }

    public Product getProduct() {
        return (Product) get(PROPERTY_PRODUCT);
    }

    public void setProduct(Product product) {
        set(PROPERTY_PRODUCT, product);
    }

    public BigDecimal getQty() {
        return (BigDecimal) get(PROPERTY_QTY);
    }

    public void setQty(BigDecimal qty) {
        set(PROPERTY_QTY, qty);
    }

    public BigDecimal getPrice() {
        return (BigDecimal) get(PROPERTY_PRICE);
    }

    public void setPrice(BigDecimal price) {
        set(PROPERTY_PRICE, price);
    }

    public BigDecimal getChargeAmt() {
        return (BigDecimal) get(PROPERTY_CHARGEAMT);
    }

    public void setChargeAmt(BigDecimal chargeAmt) {
        set(PROPERTY_CHARGEAMT, chargeAmt);
    }

    public String getStatusref() {
        return (String) get(PROPERTY_STATUSREF);
    }

    public void setStatusref(String statusref) {
        set(PROPERTY_STATUSREF, statusref);
    }

    public Date getDateOrdered() {
        return (Date) get(PROPERTY_DATEORDERED);
    }

    public void setDateOrdered(Date dateOrdered) {
        set(PROPERTY_DATEORDERED, dateOrdered);
    }

    public Date getDateDelivered() {
        return (Date) get(PROPERTY_DATEDELIVERED);
    }

    public void setDateDelivered(Date dateDelivered) {
        set(PROPERTY_DATEDELIVERED, dateDelivered);
    }

    public Date getDateOfSale() {
        return (Date) get(PROPERTY_DATEOFSALE);
    }

    public void setDateOfSale(Date dateOfSale) {
        set(PROPERTY_DATEOFSALE, dateOfSale);
    }

    public Date getDateStockFeeUntil() {
        return (Date) get(PROPERTY_DATESTOCKFEEUNTIL);
    }

    public void setDateStockFeeUntil(Date dateStockFeeUntil) {
        set(PROPERTY_DATESTOCKFEEUNTIL, dateStockFeeUntil);
    }

    public OrderLine getOrderLine() {
        return (OrderLine) get(PROPERTY_ORDERLINE);
    }

    public void setOrderLine(OrderLine orderLine) {
        set(PROPERTY_ORDERLINE, orderLine);
    }

    public org.zsoft.serial.snr_masterdata getSNRMasterdata() {
        return (org.zsoft.serial.snr_masterdata) get(PROPERTY_SNRMASTERDATA);
    }

    public void setSNRMasterdata(org.zsoft.serial.snr_masterdata sNRMasterdata) {
        set(PROPERTY_SNRMASTERDATA, sNRMasterdata);
    }

    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }

    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    public Warehouse getWarehouse() {
        return (Warehouse) get(PROPERTY_WAREHOUSE);
    }

    public void setWarehouse(Warehouse warehouse) {
        set(PROPERTY_WAREHOUSE, warehouse);
    }

    public Date getPaymentdate() {
        return (Date) get(PROPERTY_PAYMENTDATE);
    }

    public void setPaymentdate(Date paymentdate) {
        set(PROPERTY_PAYMENTDATE, paymentdate);
    }

    public BigDecimal getAmt() {
        return (BigDecimal) get(PROPERTY_AMT);
    }

    public void setAmt(BigDecimal amt) {
        set(PROPERTY_AMT, amt);
    }

    public BigDecimal getQtysold() {
        return (BigDecimal) get(PROPERTY_QTYSOLD);
    }

    public void setQtysold(BigDecimal qtysold) {
        set(PROPERTY_QTYSOLD, qtysold);
    }

    public BigDecimal getActualqty() {
        return (BigDecimal) get(PROPERTY_ACTUALQTY);
    }

    public void setActualqty(BigDecimal actualqty) {
        set(PROPERTY_ACTUALQTY, actualqty);
    }

    public OrderLine getPoorderline() {
        return (OrderLine) get(PROPERTY_POORDERLINE);
    }

    public void setPoorderline(OrderLine poorderline) {
        set(PROPERTY_POORDERLINE, poorderline);
    }

    public BigDecimal getStockcharge() {
        return (BigDecimal) get(PROPERTY_STOCKCHARGE);
    }

    public void setStockcharge(BigDecimal stockcharge) {
        set(PROPERTY_STOCKCHARGE, stockcharge);
    }

    public Currency getCurrency() {
        return (Currency) get(PROPERTY_CURRENCY);
    }

    public void setCurrency(Currency currency) {
        set(PROPERTY_CURRENCY, currency);
    }

    @SuppressWarnings("unchecked")
    public List<org.openz.modules.customerassets.CA_ASSETSSTOCKEDBOM> getCAASSETSSTOCKEDBOMList() {
        return (List<org.openz.modules.customerassets.CA_ASSETSSTOCKEDBOM>) get(PROPERTY_CAASSETSSTOCKEDBOMLIST);
    }

    public void setCAASSETSSTOCKEDBOMList(
        List<org.openz.modules.customerassets.CA_ASSETSSTOCKEDBOM> cAASSETSSTOCKEDBOMList) {
        set(PROPERTY_CAASSETSSTOCKEDBOMLIST, cAASSETSSTOCKEDBOMList);
    }

    @SuppressWarnings("unchecked")
    public List<org.openz.modules.customerassets.CA_ASSETSSTOCKEDSALES> getCAASSETSSTOCKEDSALESList() {
        return (List<org.openz.modules.customerassets.CA_ASSETSSTOCKEDSALES>) get(PROPERTY_CAASSETSSTOCKEDSALESLIST);
    }

    public void setCAASSETSSTOCKEDSALESList(
        List<org.openz.modules.customerassets.CA_ASSETSSTOCKEDSALES> cAASSETSSTOCKEDSALESList) {
        set(PROPERTY_CAASSETSSTOCKEDSALESLIST, cAASSETSSTOCKEDSALESList);
    }
}
