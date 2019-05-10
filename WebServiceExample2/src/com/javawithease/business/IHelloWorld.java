package com.javawithease.business;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Service Endpoint Interface
 * @author javawithease
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface IHelloWorld
{
	@WebMethod String sayHello(String name);
}
