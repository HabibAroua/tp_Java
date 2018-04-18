package Exemple1;

class O4
{
	private O1 unO1;
	
	public O4()
	{
		unO1=new O1();
	}
	
	public void finalize()
	{
		System.out.println("O4 est supp");
	}
}