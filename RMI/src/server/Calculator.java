package server;

import java.util.Scanner;
public class Calculator implements InterfaceCalculator
{

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
