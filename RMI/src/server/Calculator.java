package server;

import java.util.Scanner;
public class Calculator implements InterfaceCalculator
{
	
	public int getINT()
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
	
	@Override
	public void Calculate() 
	{
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
					case  1 : System.out.println("Sum is : "+sum(getINT(),getINT()));
					break;
					case  2 : System.out.println("Substraction is : "+substraction(getINT(),getINT()));
						break;
					case  3 : System.out.println("Division is : "+div(getINT(),getINT()));
						break;
					case  4 : System.out.println("Multiplication is : "+multiplication(getINT(),getINT()));
						break;
					case  5 : System.out.println("Factorial is : "+factorial(getINT()));
						break;
					case  6 : System.out.println("Power is : "+power(getINT(),getINT()));
						break;
					case  7 : System.out.println("You quit the application");
						break;
				}
			}while((choice<=0) && (choice >7));
		}while(choice != 7);
	}
	
	private int sum(int x , int y)
	{
		return x+y;
	}
	
	private int substraction(int x , int y)
	{
		return x-y;
	}
	
	private int div(int x , int y)
	{
		try
		{
			return x/y;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception "+ex.getMessage());
			return -1;
		}
	}
	
	private long multiplication(int x , int y)
	{
		return x*y;
	}
	
	private long factorial(int x)
	{
		long aux=0;
		for(int i=2; i<=x ;i++)
		{
			aux*=i;
		}
		return aux;
	}
	
	private long power(int a , int b)
	{
		return (long) Math.pow(a, b);
	}

}
