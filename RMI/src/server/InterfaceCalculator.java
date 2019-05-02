package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCalculator extends Remote 
{
	public void Calculate() throws RemoteException;
}
