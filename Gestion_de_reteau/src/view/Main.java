package view;

import java.util.Scanner;
import models.Etudiant;
import traitement.TraitementEtudiant;

public class Main 
{
	public static String Chaine()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static Etudiant saisie_etudiant()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez le num de cin");
		long num_cin = sc.nextLong();
		System.out.println("Donnez le nom");
		String nom = Chaine();
		System.out.println("Donnez le prenom");
		String prenom = Chaine();
		System.out.println("Donnez le solde");
		double solde = sc.nextDouble();
		System.out.println("donnez l'idantifiant universitaire");
		String idantifiant_universitaire = Chaine();
		System.out.println("Le nom de son universit�");
		String universite = Chaine();
		Etudiant e = new Etudiant(num_cin,nom,prenom,solde,idantifiant_universitaire,universite);
		return e;
	}
	
	public static void gestion_des_etudiants()
	{
		Scanner sc =new Scanner(System.in);
		TraitementEtudiant te = new TraitementEtudiant();
		boolean test = false; // pour tester les operations
		boolean loop = true;
		do
		{
			System.out.println("______________________________________________");
			System.out.println("|_________Gestion des etudiant________________|");
			System.out.println("1)Ajouter un etudiant_________________________|");
			System.out.println("2)Modifier un etudiant________________________|");
			System.out.println("3)Supprimer un etudiant_______________________|");
			System.out.println("4)Afficher la liste des etudiants_____________|");
			System.out.println("5)retour");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : 	
							Etudiant e = saisie_etudiant();
							test = te.ajouter(e);
							if(test == true)
							{
								System.out.println("L'insertion de l'etudiant effectu� avec success");
							}
							else
							{
								System.out.println("Erreur au niveau de l'insertion");
							}
				break;
				case 2 : 	System.out.println("Donnez le num de cin pour la modification");
							test = te.modifier(sc.nextLong(), saisie_etudiant());
							if(test == true)
							{
								System.out.println("La mise � jour de l'etudiant est effectu� avec success");
							}
							else
							{
								System.out.println("Erreur au niveau de la mise � jour");
							}
				break;
				case 3 : 	System.out.println("Donnez le num de cin pour la suppression");
							test = te.supprimer(sc.nextLong());
							if(test == true)
							{
								System.out.println("Suppression effectu� avec success");
							}
							else
							{
								System.out.println("Erreur au niveau de la suppression");
							}
				break;
				case 4 : 	System.out.println("La Lise des etudiants abonn�es");
							te.afficher();
				break;
				case 5 : loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 5");
				break;
			}
		}while(loop == true);
	}
	
	public static void gestion_des_personnels()
	{
		Scanner sc =new Scanner(System.in);
		
		boolean loop = true;
		do
		{
			System.out.println("_______________________________________________");
			System.out.println("|_________Gestion des personnels_______________|");
			System.out.println("1)Ajouter un personnel_________________________|");
			System.out.println("2)Modifier un personnel________________________|");
			System.out.println("3)Supprimer un personnel_______________________|");
			System.out.println("4)Afficher la liste des personnels_____________|");
			System.out.println("5)retour");
			System.out.println("SVP Tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : System.out.println("Ajouter");
				break;
				case 2 : System.out.println("Modifier");
				break;
				case 3 : System.out.println("Supprimer");
				break;
				case 4 : System.out.println("Afficher");
				break;
				case 5 : loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 5");
				break;
			}
		}while(loop == true);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		boolean loop = true;
		do
		{
			System.out.println("________________________________");
			System.out.println("|_____________Menu______________|");
			System.out.println("1)Gestion des etudiants_________|");
			System.out.println("2)Gestion des Personnels________|");
			System.out.println("3)Gestion des repas_____________|");
			System.out.println("4)Reserver______________________|");
			System.out.println("5)Quitez________________________|");
			System.out.println("|_______________________________|");
			System.out.println("SVP Tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : gestion_des_etudiants();
				break;
				case 2 : gestion_des_personnels();
				break;
				case 3 : System.out.println("Tu choisi gestion des reaps");
				break;
				case 4 : System.out.println("Tu choisi reserver");
				break;
				case 5 : System.out.println("Tu as quitt� le programme"); loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 5");
				break;
			}
		}while(loop == true);
	}
}