/**
 * OrderServiceV100ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.zsoft.ecommerce.order.client;

public class OrderServiceV100ServiceLocator extends org.apache.axis.client.Service implements OrderServiceV100Service {

    public OrderServiceV100ServiceLocator() {
    }


    public OrderServiceV100ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderServiceV100ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OrderServiceV100
    private java.lang.String OrderServiceV100_address = "http://localhost:8080/openz/services/OrderServiceV100";

    public java.lang.String getOrderServiceV100Address() {
        return OrderServiceV100_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OrderServiceV100WSDDServiceName = "OrderServiceV100";

    public java.lang.String getOrderServiceV100WSDDServiceName() {
        return OrderServiceV100WSDDServiceName;
    }

    public void setOrderServiceV100WSDDServiceName(java.lang.String name) {
        OrderServiceV100WSDDServiceName = name;
    }

    public OrderServiceV100 getOrderServiceV100() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OrderServiceV100_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOrderServiceV100(endpoint);
    }

    public OrderServiceV100 getOrderServiceV100(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            OrderServiceV100SoapBindingStub _stub = new OrderServiceV100SoapBindingStub(portAddress, this);
            _stub.setPortName(getOrderServiceV100WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOrderServiceV100EndpointAddress(java.lang.String address) {
        OrderServiceV100_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (OrderServiceV100.class.isAssignableFrom(serviceEndpointInterface)) {
                OrderServiceV100SoapBindingStub _stub = new OrderServiceV100SoapBindingStub(new java.net.URL(OrderServiceV100_address), this);
                _stub.setPortName(getOrderServiceV100WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OrderServiceV100".equals(inputPortName)) {
            return getOrderServiceV100();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/openz/services/OrderServiceV100", "OrderServiceV100Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/openz/services/OrderServiceV100", "OrderServiceV100"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OrderServiceV100".equals(portName)) {
            setOrderServiceV100EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
