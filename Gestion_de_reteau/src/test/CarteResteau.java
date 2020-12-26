package test;

public class CarteResteau 
{
	//constructeur de class resteau qui defini chaque etudiant par son nom prenom...
	//chaque carte etudiant a un solde 
	private double solde ;
	private String nom;
	private String prenom;
	private long numCin;

	// constructeur pour les att d'etudiant
	public CarteResteau (String nom, String prenom, long numCin) 
	{
		this.getNom();
		this.getPrenom();
		this.getNumCin();
	}
	
	public CarteResteau ()
	{}

	private long getNumCin() 
	{
		return numCin;	
	}

	private String getPrenom() 
	{
		return prenom;
	}

	private String getNom()
	{
		return nom;	
	}
	
	public double getsolde()
	{
		return solde;
	}
	
	//constructeur pour controlee le solde de la carte 

	public CarteResteau (double solde) 
	{
		solde = getsolde();
	}
	//verification q'il y'a un montant pour un repas minimum 
	public void ControleSolde ()
	{ 
		if (solde<200)
		{
			System.out.println("vous pouvez entrez");
		}
		else 
		{
			System.out.println("solde insuffisant vous devez charger votre carte");
		}
	}
	
	public  void ajoutSolde(float Montant)
	{
		solde=solde+Montant;
	}
	
	public  void retraitSolde(float Montant) 
	{
		solde = solde - Montant;
	}
}

