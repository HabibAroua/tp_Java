package Test;

public class Revue extends Document
{
	private int mois;
	private int annee;
	
	public Revue(int numEnreg , String titre , int mois , int annee)
	{
		super(numEnreg ,titre);
		this.mois=mois;
		this.annee=annee;
	}

	public int getMois() 
	{
		return this.mois;
	}

	public void setMois(int mois)
	{
		this.mois = mois;
	}

	public int getAnnee() 
	{
		return this.annee;
	}

	public void setAnnee(int annee) 
	{
		this.annee = annee;
	}
	
	public String toString()
	{
		return super.toString()+" le mois est "+getMois()+" l'annee est "+getAnnee();
	}

}
