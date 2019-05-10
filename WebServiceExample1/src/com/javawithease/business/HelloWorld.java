package com.javawithease.business;

import javax.jws.WebService;

/**
 * Service Endpoint Implementation
 * @author javawithease
 */
@WebService(endpointInterface = "com.javawithease.business.IHelloWorld")
public class HelloWorld implements IHelloWorld 
{
	@Override
	public String sayHello(String name) 
	{
		return "JAX-WS RCP Style. Hello " + name;
	}
}
