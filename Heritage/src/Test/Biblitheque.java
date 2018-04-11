package Test;

public class Biblitheque 
{
	private Document biblitheque[];
	private int capacite;
	public Biblitheque(int capacite)
	{
		this.capacite=capacite;
		biblitheque=new Document[20];
	}
	
	public void afficherDocument()
	{
		for(int i=0 ; i<capacite ; i++)
		{
			System.out.println(biblitheque[i].toString());
		}
	}
	
	public Document document(int i)
	{
		return biblitheque[i];
	}
	
	public void afficherAuteurs()
	{
		for(int i=0 ;i<capacite ; i++)
		{
			if(biblitheque[i] instanceof Livre)
			{
				System.out.println(((Livre)biblitheque[i]).getAuteur());
			}
		}
	}


}
