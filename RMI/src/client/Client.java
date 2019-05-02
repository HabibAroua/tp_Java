package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import server.InterfaceCalculator;

public class Client
{
	public static void main(String args[])
	{
		try 
        {
            Registry registry = LocateRegistry.getRegistry(1099);
            InterfaceCalculator stub = (InterfaceCalculator) registry.lookup("Hello");
            stub.Calculate();
        }
        catch (Exception e) 
        {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
	}
}
