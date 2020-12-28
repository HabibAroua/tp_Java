package view;

import java.util.Scanner;
import models.Etudiant;
import models.Personnel;
import traitement.TraitementEtudiant;
import traitement.TraitementPersonnel;

public class Admin 
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
		System.out.println("Le nom de son université");
		String universite = Chaine();
		Etudiant e = new Etudiant(num_cin,nom,prenom,solde,idantifiant_universitaire,universite);
		return e;
	}
	
	public static Personnel saisie_personnel()
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
		System.out.println("Donnez la profession");
		String profession = Chaine();
		
		Personnel p = new Personnel(num_cin,nom,prenom,solde,profession);
		return p;
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
								System.out.println("L'insertion de l'etudiant effectué avec success");
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
								System.out.println("La mise à jour de l'etudiant est effectué avec success");
							}
							else
							{
								System.out.println("Erreur au niveau de la mise à jour");
							}
				break;
				case 3 : 	System.out.println("Donnez le num de cin pour la suppression");
							test = te.supprimer(sc.nextLong());
							if(test == true)
							{
								System.out.println("Suppression effectué avec success");
							}
							else
							{
								System.out.println("Erreur au niveau de la suppression");
							}
				break;
				case 4 : 	System.out.println("La Lise des etudiants abonnées");
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
		TraitementPersonnel tp = new TraitementPersonnel();
		boolean test = false; // pour tester les operations
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
			case 1 : 	
				Personnel p = saisie_personnel();
				test = tp.ajouter(p);
				if(test == true)
				{
					System.out.println("L'insertion du personnel est effectué avec success");
				}
				else
				{
					System.out.println("Erreur au niveau de l'insertion");
				}
	break;
	case 2 : 	System.out.println("Donnez le num de cin pour la modification");
				test = tp.modifier(sc.nextLong(), saisie_personnel());
				if(test == true)
				{
					System.out.println("La mise à jour du personnel est effectué avec success");
				}
				else
				{
					System.out.println("Erreur au niveau de la mise à jour");
				}
	break;
	case 3 : 	System.out.println("Donnez le num de cin pour la suppression");
				test = tp.supprimer(sc.nextLong());
				if(test == true)
				{
					System.out.println("Suppression effectué avec success");
				}
				else
				{
					System.out.println("Erreur au niveau de la suppression");
				}
	break;
	case 4 : 	System.out.println("La Lise des personnels abonnées");
				tp.afficher();
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
		System.out.println("\n *** Bienvenue au restaurant universitaire de Mahdia *** \n ");
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
				case 5 : System.out.println("Tu as quitté le programme"); loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 5");
				break;
			}
		}while(loop == true);
	}
}