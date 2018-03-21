package com.wh.demo.interfaces;

public class IHelloWorldProxy implements com.wh.demo.interfaces.IHelloWorld {
  private String _endpoint = null;
  private com.wh.demo.interfaces.IHelloWorld iHelloWorld = null;
  
  public IHelloWorldProxy() {
    _initIHelloWorldProxy();
  }
  
  public IHelloWorldProxy(String endpoint) {
    _endpoint = endpoint;
    _initIHelloWorldProxy();
  }
  
  private void _initIHelloWorldProxy() {
    try {
      iHelloWorld = (new com.wh.demo.impl.HelloWorldWsLocator()).getHelloWordsPort();
      if (iHelloWorld != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iHelloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iHelloWorld)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iHelloWorld != null)
      ((javax.xml.rpc.Stub)iHelloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.wh.demo.interfaces.IHelloWorld getIHelloWorld() {
    if (iHelloWorld == null)
      _initIHelloWorldProxy();
    return iHelloWorld;
  }
  
  public java.lang.String sayHi(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iHelloWorld == null)
      _initIHelloWorldProxy();
    return iHelloWorld.sayHi(arg0);
  }
  
  
}