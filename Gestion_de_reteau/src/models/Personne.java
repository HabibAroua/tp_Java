package models;

public class Personne 
{
	private long numCin;
	private String nom;
	private String prenom;
	private double solde ;
	
	public Personne(long numCin, String nom, String prenom, double solde) 
	{
		super();
		this.numCin = numCin;
		this.nom = nom;
		this.prenom = prenom;
		this.solde = solde;
	}
	
	public Personne()
	{
		
	}

	public long getNumCin() 
	{
		return numCin;
	}
	
	public void setNumCin(long numCin) 
	{
		this.numCin = numCin;
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
	public double getSolde()
	{
		return solde;
	}
	
	public void setSolde(double solde) 
	{
		this.solde = solde;
	}

	@Override
	public String toString() 
	{
		return "Personne [numCin=" + numCin + ", nom=" + nom + ", prenom=" + prenom + ", solde=" + solde + "]";
	}
}
