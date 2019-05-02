package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import server.InterfaceCalculator;

public class Client
{
	public static int getINT()
	{
		try
		{
			Scanner scanner=new Scanner(System.in);
			return scanner.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e.getMessage());
			return 0;
		}
	}
	
	public static void main(String args[])
	{
		try 
        {
            Registry registry = LocateRegistry.getRegistry(1099);
            InterfaceCalculator stub = (InterfaceCalculator) registry.lookup("InterfaceCalculator");
            int choice=0;
    		Scanner scannerChoice=new Scanner(System.in);
    		do
    		{
    			do
    			{
    				System.out.println("_________________________Menu___________________________");
    				System.out.println("1)Sum___________________________________________________");
    				System.out.println("2)Substraction__________________________________________");
    				System.out.println("3)Division______________________________________________");
    				System.out.println("4)Multiplication________________________________________");
    				System.out.println("5)Factorial_____________________________________________");
    				System.out.println("6)Power_________________________________________________");
    				System.out.println("7)Exit__________________________________________________");
    				System.out.println("________________________________________________________");
    				System.out.println("Please enter your choice");
    				choice =scannerChoice.nextInt();
    				switch(choice)
    				{
    					case  1 : System.out.println("Sum is : "+stub.sum(getINT(),getINT()));
    						break;
    					case  2 : System.out.println("Substraction is : "+stub.substraction(getINT(),getINT()));
    						break;
    					case  3 : System.out.println("Division is : "+stub.div(getINT(),getINT()));
    						break;
    					case  4 : System.out.println("Multiplication is : "+stub.multiplication(getINT(),getINT()));
    						break;
    					case  5 : System.out.println("Factorial is : "+stub.factorial(getINT()));
    						break;
    					case  6 : System.out.println("Power is : "+stub.power(getINT(),getINT()));
    						break;
    					case  7 : System.out.println("You quit the application");
    						break;
    				}
    			}while((choice<=0) && (choice >7));
    		}while(choice != 7);
        }
        catch (Exception e) 
        {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
	}
}
