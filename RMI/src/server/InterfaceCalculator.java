package server;

import java.rmi.Remote;

public interface InterfaceCalculator extends Remote 
{
	public void Calculate();
}
