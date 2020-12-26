package models;

public class Etudiant extends Personne
{
	private String idantifiant_universitaire;
	private String universite;
	
	public Etudiant(long numCin, String nom, String prenom, double solde, String idantifiant_universitaire ,String universite) 
	{
		super(numCin,nom, prenom, solde);
		this.idantifiant_universitaire = idantifiant_universitaire;
		this.universite = universite;
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
	
	public String getIdantifiant_universitaire() 
	{
		return idantifiant_universitaire;
	}

	public void setIdantifiant_universitaire(String idantifiant_universitaire)
	{
		this.idantifiant_universitaire = idantifiant_universitaire;
	}

	public String getUniversite() 
	{
		return universite;
	}

	public void setUniversite(String universite) 
	{
		this.universite = universite;
	}
	
	public Etudiant() 
	{
		super();
	}

	public boolean controletemperature() 
	{
		int temperature = 37;
		if (temperature < 38) 	
		{
			System.out.println("la temperature est passable,vous pouvez entrée ");
			return true;
		} 
		else 
		{
			System.out.println("il faut controler votre temperature");
			return false;
		}
	}
	
	public boolean controleMasque() 
	{
		boolean masque = false;
		if (masque) 
		{
			System.out.println("vous pouvez entrez");
			return true;
		} 
		else 
		{
			System.out.println("il faut portez votre masque");
			return false;
		}
	}

	public boolean controleEtudiant() 
	{
		return false;
		/*
		int temperature=37;
		if ((getsolde() < 0.200) && (temperature < 38) && (controleMasque() == true)) 
		{
			System.out.println("vous pouvez entrez");
			return true;
		} 
		else
		{
			System.out.println("repetez le controle");
			return false;
		}
		*/
	}

	@Override
	public String toString() 
	{
		return "Etudiant ["+super.toString()+"idantifiant_universitaire=" + idantifiant_universitaire + ", universite=" + universite
				+ "]";
	}
}
