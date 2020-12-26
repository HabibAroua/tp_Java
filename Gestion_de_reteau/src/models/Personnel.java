package models;

public class Personnel extends Personne
{
	private String proffesion;
	
	public Personnel(long numCin, String nom, String prenom, double solde, String proffesion)
	{
		super(numCin,nom, prenom, solde);
		this.proffesion = proffesion;
	}
	
	public Personnel()
	{
		super();
	}
	
	@Override
	public long getNumCin()
	{
		return super.getNumCin();
	}
	
	@Override
	public void setNumCin(long numCin)
	{
		super.setNumCin(numCin);
	}
	
	@Override
	public String getNom()
	{
		return super.getNom();
	}
	
	@Override
	public void setNom(String nom)
	{
		super.setNom(nom);
	}
	
	@Override
	public String getPrenom()
	{
		return super.getPrenom();
	}
	
	@Override
	public void setPrenom(String prenom)
	{
		super.setPrenom(prenom);
	}
	
	@Override
	public double getSolde()
	{
		return super.getSolde();
	}
	
	@Override
	public void setSolde(double solde)
	{
		super.setSolde(solde);
	}

	public String getProffesion() 
	{
		return proffesion;
	}

	public void setProffesion(String proffesion) 
	{
		this.proffesion = proffesion;
	}

	@Override
	public String toString() 
	{
		return "Personnel ["+ super.toString() +"proffesion = "+proffesion+ "]";
	}
}