package Ex2;

public class Universitaire extends Participant
{
	private String specialite;
	
	public Universitaire(String nom , String prenom ,String affiliation , String specialite)
	{
		super(nom,prenom,affiliation);
		this.specialite=specialite;
	}
	
	public String getSpecialite()
	{
		return this.specialite;
	}
	
	public String toString()
	{
		return super.toString()+" sa specilité est "+getSpecialite();
	}

}
