package Ex1;

public class Personne 
{
	private String nom;
	private String prenom;
	
	public Personne()
	{
		
	}
	
	public Personne(String nom , String prenom)
	{
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public String toString()
	{
		return "Le nom est "+getNom()+" le prenom est "+getPrenom();
	}

}
