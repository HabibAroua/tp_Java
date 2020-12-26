package test;


public class Resteau 
{
	int places_maximal = 50;
	int placesOccupee ;
				
	public Resteau(int places_maximal, int placesOccupee)
	{
		super();
			this.places_maximal = places_maximal;
			this.placesOccupee = placesOccupee;
	}
	public int nb_etudiant ()
	{
		Etudiant e=new Etudiant();
		if (e.controleEtudiant() == true)
		{
			placesOccupee ++ ;
		}
		return placesOccupee;
	}
	
	public int  affichage ()
	{
		if (places_maximal == placesOccupee )
		{
			System.out.println(" Le restaurant est plein ! ");
			return (50);
		}
		else 
		{
			System.out.println("vous pouvez entrez , le nombre des places libres est : ");
			return (  places_maximal - placesOccupee ) ;
		}
	}
}

