package Exemple1;

public class O3
{
	private O2 unO2;
	
	public O3(O1 unO1)
	{
		unO2=new O2(unO1);
	}
	
	public void finalize()
	{
		System.out.println("O3 est supp");
	}
}
