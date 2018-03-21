package com.wh.demo.test;

import java.rmi.RemoteException;

import com.wh.demo.interfaces.IHelloWorldProxy;

/**
 * @author WH
 * 
 * 2018年3月18日
 */
public class TestService {
	public static void main(String[] args){
		IHelloWorldProxy proxy = new IHelloWorldProxy();
		try {
			String s = proxy.sayHi("cai");
			System.out.println("调用webService:"+s);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
