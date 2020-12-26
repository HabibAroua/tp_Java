package test;

public class Etudiant extends CarteResteau 
{
	public CarteResteau carte;
	public Etudiant(String nom, String prenom, long numCin, CarteResteau carte) 
	{
		super(nom, prenom, numCin);
		this.carte=carte;
	}
	
	public Etudiant(double solde)
    { 
		super (solde);
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
	}
	//methode reservation	
}