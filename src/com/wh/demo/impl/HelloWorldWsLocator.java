/**
 * HelloWorldWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wh.demo.impl;

public class HelloWorldWsLocator extends org.apache.axis.client.Service implements com.wh.demo.impl.HelloWorldWs {

    public HelloWorldWsLocator() {
    }


    public HelloWorldWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloWorldWsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWordsPort
    private java.lang.String HelloWordsPort_address = "http://127.0.0.1:8080/ws/HelloWorldWs";

    public java.lang.String getHelloWordsPortAddress() {
        return HelloWordsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWordsPortWSDDServiceName = "HelloWordsPort";

    public java.lang.String getHelloWordsPortWSDDServiceName() {
        return HelloWordsPortWSDDServiceName;
    }

    public void setHelloWordsPortWSDDServiceName(java.lang.String name) {
        HelloWordsPortWSDDServiceName = name;
    }

    public com.wh.demo.interfaces.IHelloWorld getHelloWordsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWordsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWordsPort(endpoint);
    }

    public com.wh.demo.interfaces.IHelloWorld getHelloWordsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.wh.demo.impl.HelloWorldWsSoapBindingStub _stub = new com.wh.demo.impl.HelloWorldWsSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloWordsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWordsPortEndpointAddress(java.lang.String address) {
        HelloWordsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.wh.demo.interfaces.IHelloWorld.class.isAssignableFrom(serviceEndpointInterface)) {
                com.wh.demo.impl.HelloWorldWsSoapBindingStub _stub = new com.wh.demo.impl.HelloWorldWsSoapBindingStub(new java.net.URL(HelloWordsPort_address), this);
                _stub.setPortName(getHelloWordsPortWSDDServiceName());
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
        if ("HelloWordsPort".equals(inputPortName)) {
            return getHelloWordsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.demo.wh.com/", "HelloWorldWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.demo.wh.com/", "HelloWordsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWordsPort".equals(portName)) {
            setHelloWordsPortEndpointAddress(address);
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
