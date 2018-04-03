package Ex2;

public class Industriel extends Participant
{
	private String fonction;
	
	public Industriel(String nom , String prenom , String affiliation , String fonction)
	{
		super(nom,prenom,affiliation);
		this.fonction=fonction;
	}
	
	public String getFonction()
	{
		return this.fonction;
	}
	
	public String toString()
	{
		return super.toString()+" et sa fonction est "+getFonction();
	}
}
