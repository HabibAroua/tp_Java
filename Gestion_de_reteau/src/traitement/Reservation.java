package traitement;

public class Reservation 
{
	public static final int capaciteEtudiant = 50;
	public static final int capacitePersonnel = 20;
	
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

	public boolean controleEtudiant(double solde) 
	{
		int temperature=37;
		if ((solde < 0.200) && (temperature < 38) && (controleMasque() == true)) 
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
}