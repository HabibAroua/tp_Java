package com.javawithease.business;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldWSClient 
{
	public static void main(String args[])
	{
		try
		{
			URL url = new URL("http://localhost:8080/ws/helloWorldRCP?wsdl");
			QName qname = new QName("http://business.javawithease.com/",
			"HelloWorldService"); 
			Service service = Service.create(url, qname);
			IHelloWorld helloWorld = service.getPort(IHelloWorld.class);  
			System.out.println(helloWorld.sayHello("tutorialspointexamples"));
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
        } 
	}
}