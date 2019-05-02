package server;

public class Calculator implements InterfaceCalculator
{

	@Override
	public void Calculate() 
	{
		
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
