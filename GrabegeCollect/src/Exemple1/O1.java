package Exemple1;

public class O1
{
	private O3 unO3;
	
	public O1()
	{
		unO3=new O3(this);
	}
	
	public void finalize()
	{
		System.out.println("O1 est supp");
	}

	
}




