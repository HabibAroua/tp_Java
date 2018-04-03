package Ex2;

public class Participant 
{
	private String nom;
	private String prenom;
	private String affiliation;
	
	public Participant(String nom , String prenom , String affiliation)
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
		return "le nom est "+getNom()+" le prenom est "+getPrenom()+" affiliation est "+getAffiliation();
	}

}
