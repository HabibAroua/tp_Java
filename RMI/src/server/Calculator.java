package server;

import java.util.Scanner;
public class Calculator implements InterfaceCalculator
{	
	@Override
	public int sum(int x , int y)
	{
		return x+y;
	}
	
	@Override
	public int substraction(int x , int y)
	{
		return x-y;
	}
	
	@Override
	public int div(int x , int y)
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
	
	@Override
	public long multiplication(int x , int y)
	{
		return x*y;
	}
	
	@Override
	public long factorial(int x)
	{
		long aux=1;
		for(int i=2; i<=x ;i++)
		{
			aux*=i;
		}
		return aux;
	}
	
	@Override
	public long power(int a , int b)
	{
		return (long) Math.pow(a, b);
	}
	
}
