package Exemple1;

class O2
{
	private O1 unO1;
	
	public O2(O1 unO1)
	{
		this.unO1=unO1;
	}
	
	public void finalize()
	{
		System.out.println("O2 est supp");
	}
}
