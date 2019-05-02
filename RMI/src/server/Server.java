package server;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server 
{
	public static void main(String args[])
	{
		try 
        {
            Calculator calc = new Calculator();
            InterfaceCalculator stub = (InterfaceCalculator) UnicastRemoteObject.exportObject(calc, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("InterfaceCalculator", stub);

            System.err.println("Server ready");
        }
        catch (Exception e) 
        {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
	}

}
