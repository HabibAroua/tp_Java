package Ex5;

public class Contact 
{
	
	private String nom;
	private long num;
	
	public Contact()
	{
		
	}
	
	public Contact(String nom , long num)
	{
		this.nom=nom;
		this.num=num;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public long getNum()
	{
		return this.num;
	}
	
	public String toString()
	{
		return "Le nom est :"+getNom()+" le num est "+getNum();
	}


}
