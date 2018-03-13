package Ex6;

public class Auteur
{
	private String nom;
	private String prenom;
	private String affiliation;
	
	public Auteur(String nom , String prenomp , String affiliation)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.affiliation=affiliation;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public String getAffiliation()
	{
		return this.affiliation;
	}
	
	public String toString()
	{
		return "nom est "+getNom()+" le prenom est "+getPrenom()+" Affiliation est "+getAffiliation();
	}

}
