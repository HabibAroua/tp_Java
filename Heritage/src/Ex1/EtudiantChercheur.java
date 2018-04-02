package Ex1;

public class EtudiantChercheur extends Personne 
{
	private String domaine;
	
	public EtudiantChercheur(String domaine , String nom , String prenom)
	{
		super(nom, prenom);
		this.domaine=domaine;
	}
	public String getDomaine()
	{
		return this.domaine;
	}
	
	public String toString()
	{
		return super.toString()+" le domaine est "+getDomaine();
	}

}
