package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCalculator extends Remote 
{
	public int sum(int x , int y)throws RemoteException;
	public int substraction(int x , int y)throws RemoteException;
	public int div(int x , int y)throws RemoteException;
	public long multiplication(int x , int y)throws RemoteException;
	public long factorial(int x)throws RemoteException;
	public long power(int a , int b)throws RemoteException;
}
