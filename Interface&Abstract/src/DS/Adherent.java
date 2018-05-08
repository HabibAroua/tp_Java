package DS;

import java.util.ArrayList;

public class Adherent
{
	private String nom;
	private String prenom;
	private static int matricule=0;
	private ArrayList<Livre> livres=new ArrayList<Livre>();
	
	public Adherent(String nom , String prenom)
	{
		this.nom=nom;
		this.prenom=prenom;
		setMatricule(getMatricule() + 1);
	}
	
	public String getNom() 
	{
		return this.nom;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public static int getMatricule() 
	{
		return matricule;
	}

	public static void setMatricule(int matricule)
	{
		Adherent.matricule = matricule;
	}
	
	public String toString()
	{
		return "La matricle est "+this.getMatricule()+" le nom est "+getNom()+" Le prenom est "+getPrenom();
	}
	
	private boolean isExist(Livre l)
	{
		boolean test=false;
		for(int i=0 ; i<livres.size() ; i++)
		{
			if(livres.get(i).getCode()==l.getCode() || livres.get(i).getTitre()==l.getTitre() )
			{
				test=true;
				break;
			}
			else
			{
				test=false;
			}
		}
		return test;
	}
	public void emprunter(Livre l)
	{
		if(isExist(l))
		{
			System.out.println("On ne peut pas ajouter");
		}
		else
		{
			livres.add(l);
		}
	}
	
	public void rendre(Livre l)
	{
		int index=-1;
		for(int i=0 ; i<livres.size() ; i++)
		{
			if(livres.get(i).getCode()==l.getCode() || livres.get(i).getTitre()==l.getTitre() )
			{
				index=i;
				break;
			}
		}
		if(index == -1)
		{
			System.out.println("Livre n'existe pas");
		}
		else
		{
			livres.remove(index);
		}
	}
	
	public void afficherLivres()
	{
		for(int i=0 ; i<livres.size() ; i++)
		{
			System.out.println(livres.get(i));
		}
	}
}
