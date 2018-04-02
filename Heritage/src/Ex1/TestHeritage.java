package Ex1;
import java.util.Scanner;
public class TestHeritage 
{
	public static void main(String[] args)
	{
		//Déclarer le tableau
		Personne tab[]=new Personne[6];
		//Presenter Enseignant , Etudiant et Etudiant chercheur 
		Enseignant es1=new Enseignant("Doctor","Salah","Ben Salah");
		Enseignant es2=new Enseignant("Chercheur","Mariem","Ayari");
		Etudiant et1 =new Etudiant(778,"Habib","Aroua");
		Etudiant et2=new Etudiant(896,"Nadia","Ghorbel");
		EtudiantChercheur etCh1=new EtudiantChercheur("Master","Kamel","Ben Salem");
		EtudiantChercheur etCh2=new EtudiantChercheur("Doctora","Manel","Ajmi");
		//Remplir le tableau
		tab[0]=es1;
		tab[1]=es2;
		tab[2]=etCh1;
		tab[3]=etCh2;
		tab[4]=et1;
		tab[5]=et2;
		//Afficher les personne
		System.out.println("Pour afficher les personne");
		afficher(tab);
		//Afficher les grades et les noms des enseignant
		System.out.println("Les enseignant");
		listeEnseignant(tab);
		//Pour afficher un etudiant au domaine
		System.out.println("Chercher le domaine");
		listeDomaineDeRecherche(tab);
		
	}
	
	public static void afficher( Personne tab[])
	{
		for(int i=0 ; i<tab.length ; i++)
		{
			System.out.println(tab[i].toString());
		}
	}
	
	public static void listeEnseignant(Personne tab[])
	{
		for(int i=0 ; i<tab.length ; i++)
		{
			if(tab[i] instanceof  Enseignant)
			{
				System.out.println("Le nom est "+tab[i].getNom()+" La grade est "+((Enseignant)tab[i]).getGrade());
			}
		}
	}
	
	public static void listeDomaineDeRecherche(Personne tab[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Donnez le domaine");
		String domaine=sc.nextLine();
		for(int i=0 ; i<tab.length ; i++)
		{
			if(tab[i] instanceof EtudiantChercheur && domaine.equals(((EtudiantChercheur) tab[i]).getDomaine()))
			{
				System.out.println(tab[i].toString());
			}
		}
	}

}
