package DS;

import java.util.ArrayList;

public class Bibliotheque 
{
	private ArrayList<Ouvrage> ouvrages=new ArrayList<Ouvrage>();
	private ArrayList<Adherent> adherents=new ArrayList<Adherent>();

	public Bibliotheque()
	{
		
	}
	
	public void ajouterOuvrage(Ouvrage o)
	{
		ouvrages.add(o);
	}
	
	public void supprimerOuvrage(int indice)
	{
		ouvrages.remove(indice);
	}
	
	public void afficher()
	{
		for(int i=0 ; i<ouvrages.size() ; i++)
		{
			System.out.println(ouvrages.get(i).toString());
		}
	}
	
	public void ajouterAdherent(Adherent o)
	{
		adherents.add(o);
	}
	
	public void supprimerAdherent(int indice)
	{
		adherents.remove(indice);
	}
	
	public void afficherAdherent()
	{
		for(int i=0 ; i<adherents.size() ; i++)
		{
			System.out.println(adherents.get(i).toString());
		}
	}
	
	//cherhcer ouvrage
	
	public void chercherOuvrage()
	{
		int nb=0;
		for(int i=0 ; i<ouvrages.size() ; i++)
		{
			if(ouvrages.get(i).getTitre().indexOf("str")>-1)
			{
				nb++;
			}
		}
		Ouvrage tab[]=new Ouvrage[nb];
		int j=0;
		for(int i=0 ; i<ouvrages.size() ; i++)
		{
			if(ouvrages.get(i).getTitre().indexOf("str")>-1)
			{
				tab[j++]=ouvrages.get(i);
			}
		}
		
		System.out.println("Afficher le tableu");
		for(int i=0 ; i<nb ;i++)
		{
			System.out.print(tab[i]+" ");
		}
	}
}
