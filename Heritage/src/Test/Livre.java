package Test;

public class Livre extends Document 
{
	private String auteur;
	private int nbrPages;
	
	public Livre(int numEnreg , String titre , String auteur , int nbrPages )
	{
		super(numEnreg,titre);
		this.auteur=auteur;
		this.nbrPages=nbrPages;
	}

	public String getAuteur()
	{
		return this.auteur;
	}

	public void setAuteur(String auteur)
	{
		this.auteur = auteur;
	}

	public int getNbrPages() 
	{
		return this.nbrPages;
	}

	public void setNbrPages(int nbrPages) 
	{
		this.nbrPages = nbrPages;
	}
	
	public String toString()
	{
		return super.toString()+" l'auteur est "+getAuteur()+" nombre des pages "+getNbrPages();
	}
	
	

}
