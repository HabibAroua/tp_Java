package DS;

public class Volume extends Ouvrage
{
	private String auteur;
	
	public Volume(String titre , int code , String auteur)
	{
		super(titre,code);
		this.auteur=auteur;
	}
	
	public String getAuteur()
	{
		return this.auteur;
	}
	
	public void setAuteur(String auteur)
	{
		this.auteur=auteur;
	}
	
	public String toString()
	{
		return super.toString()+" l'auteur est "+getAuteur();
	}

}
