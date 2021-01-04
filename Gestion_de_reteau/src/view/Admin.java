package view;

import java.util.Scanner;
import models.Etudiant;
import models.Personnel;
import models.Repat;
import traitement.Reclamation;
import traitement.TraitementEtudiant;
import traitement.TraitementPersonnel;
import traitement.TraitementRepat;
import traitement.TraitementReservation;

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
	
	public static Repat saisie_repat()
	{
		
		System.out.println("Tapez le plat principale");
		String platprincipale = Chaine();
		System.out.println("Tapez le desrt");
		String desert = Chaine();
		System.out.println("Tapez la salade");
		String salade = Chaine();
		System.out.println("Est-ce que le pain existe Oui ou Non");
		String pain = Chaine();
		Repat r = new Repat(platprincipale,desert,salade,pain);
		return r ;
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
			System.out.println("5)Chercher un etudiant________________________|");
			System.out.println("6)retour");
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
				case 5 : 	System.out.println("Tapez le num de cin pour chercher un etudiant");
							Etudiant et = te.trouver(sc.nextLong());
							if(et == null)
							{
								System.out.println("Etudiant n'exsite pas");
							}
							else
							{
								System.out.println(et.toString());
							}
				break;
				case 6 : loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 6");
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
			System.out.println("5)Chercher un Personnel________________________|");
			System.out.println("6)retour");
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
	case 5 : 	System.out.println("Tapez le num de cin pour chercher un personnel");
				Personnel pr = tp.trouver(sc.nextLong());
				if(pr == null)
				{
					System.out.println("Personnel n'exsite pas");
				}
				else
				{
					System.out.println(pr.toString());
				}
				break;
	case 6 : loop = false;
	break;
	default : System.out.println("Vous devez choisir un nombre entre 1 et 5");
	break;
			}
		}while(loop == true);
	}
	
	public static void gestion_des_repas()
	{
		Scanner sc =new Scanner(System.in);
		TraitementPersonnel tp = new TraitementPersonnel();
		boolean loop = true;
		do
		{
			System.out.println("_____________________________________________________");
			System.out.println("|_________Gestion des repat_________________________|");
			System.out.println("1)Gestion de repat par midi_________________________|");
			System.out.println("2)Gestion de repat par soir_________________________|");
			System.out.println("3)retour");
			System.out.println("SVP Tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : 	gestion_des_repas_par_midi(); 	
				break;
				case 2 : 	gestion_des_repas_par_soir();
				break;
				case 3 : 	loop = false;
				break;
				default :	 System.out.println("Vous devez choisir un nombre entre 1 et 3");
				break;
			}
		}while(loop == true);
	}
	
	public static void gestion_des_repas_par_midi()
	{
		TraitementRepat tr = new TraitementRepat();
		Scanner sc =new Scanner(System.in);
		TraitementPersonnel tp = new TraitementPersonnel();
		boolean loop = true;
		do
		{
			System.out.println("______________________________________________________");
			System.out.println("|_________Gestion des repat par Midi_________________|");
			System.out.println("1)Consulter les menu du midi_________________________|");
			System.out.println("2)Modifier les menus_________________________________|");
			System.out.println("3)retour");
			System.out.println("SVP Tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : 	tr.menuMidi();
				break;
				case 2 : 	menu_jour_midi();
				break;
				case 3 : 	loop = false;
				break;
				default :	 System.out.println("Vous devez choisir un nombre entre 1 et 3");
				break;
			}
		}while(loop == true);
	}
	
	public static void gestion_des_repas_par_soir()
	{
		Scanner sc =new Scanner(System.in);
		TraitementRepat tr = new TraitementRepat();
		boolean test = false; // pour tester les operations
		boolean loop = true;
		do
		{
			System.out.println("______________________________________________________");
			System.out.println("|_________Gestion des repat par soir_________________|");
			System.out.println("1)Consulter les menu du soir_________________________|");
			System.out.println("2)Modifier les menus_________________________________|");
			System.out.println("3)retour");
			System.out.println("SVP Tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : 	tr.menuSoir();
				break;
				case 2 : 	menu_jour_soir();
				break;
				case 3 : 	loop = false;
				break;
				default :	 System.out.println("Vous devez choisir un nombre entre 1 et 3");
				break;
			}
		}while(loop == true);
	}
	
	public static void menu_jour_midi()
	{
		Scanner sc =new Scanner(System.in);
		TraitementRepat tr = new TraitementRepat();
		Repat r;
		boolean loop = true;
		do
		{
			System.out.println("______________________________________________________");
			System.out.println("|____________________Jours____________________________|");
			System.out.println("1)Lundi_______________________________________________|");
			System.out.println("2)Mardi_______________________________________________|");
			System.out.println("3)Mercredi____________________________________________|");
			System.out.println("4)Jeudi_______________________________________________|");
			System.out.println("5)Vendredi____________________________________________|");
			System.out.println("6)Samedi______________________________________________|");
			System.out.println("7)Dimanche____________________________________________|");
			System.out.println("8)Retour");
			System.out.println("SVP Tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : 	System.out.println(tr.tab[0]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab[0] = r;
							tr.sauvgarder("C:/projet_java/Lundi_m.txt", r);
				break;
				case 2 : 	System.out.println(tr.tab[1]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab[1] = r;
							tr.sauvgarder("C:/projet_java/Mardi_m.txt", r);
				break;
				case 3 : 	System.out.println(tr.tab[2]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab[2] = r;
							tr.sauvgarder("C:/projet_java/Mercredi_m.txt", r);
				break;
				case 4 : 	System.out.println(tr.tab[3]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab[3] = r;
							tr.sauvgarder("C:/projet_java/Jeudi_m.txt", r);
				break;
				case 5 : 	System.out.println(tr.tab[4]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab[4] = r;
							tr.sauvgarder("C:/projet_java/Vendredi_m.txt", r);
				break;
				case 6 : 	System.out.println(tr.tab[5]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab[5] = r;
							tr.sauvgarder("C:/projet_java/Samedi_m.txt", r);
				break;
				case 7 :	System.out.println("Fermé"); 	
				break;
				case 8 : 	loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 8");	
				break;
			}
		}while(loop == true);
	}
	
	public static void menu_jour_soir()
	{
		Scanner sc =new Scanner(System.in);
		TraitementRepat tr = new TraitementRepat();
		Repat r;
		boolean loop = true;
		do
		{
			System.out.println("______________________________________________________");
			System.out.println("|____________________Jours____________________________|");
			System.out.println("1)Lundi_______________________________________________|");
			System.out.println("2)Mardi_______________________________________________|");
			System.out.println("3)Mercredi____________________________________________|");
			System.out.println("4)Jeudi_______________________________________________|");
			System.out.println("5)Vendredi____________________________________________|");
			System.out.println("6)Samedi______________________________________________|");
			System.out.println("7)Dimanche____________________________________________|");
			System.out.println("8)Retour");
			System.out.println("SVP Tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : 	System.out.println(tr.tab1[0]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab1[0] = r;
							tr.sauvgarder("C:/projet_java/Lundi_s.txt", r);
				break;
				case 2 : 	System.out.println(tr.tab1[1]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab1[1] = r;
							tr.sauvgarder("C:/projet_java/Mardi_s.txt", r);
				break;
				case 3 : 	System.out.println(tr.tab1[2]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab1[2] = r;
							tr.sauvgarder("C:/projet_java/Mercredi_s.txt", r);
				break;
				case 4 : 	System.out.println(tr.tab1[3]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab1[3] = r;
							tr.sauvgarder("C:/projet_java/Jeudi_s.txt", r);
				break;
				case 5 : 	System.out.println(tr.tab1[4]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab1[4] = r;
							tr.sauvgarder("C:/projet_java/Vendredi_s.txt", r);
				break;
				case 6 : 	System.out.println(tr.tab1[5]);
							System.out.println("Modifier ce menu");
							r = saisie_repat();
							tr.tab[5] = r;
							tr.sauvgarder("C:/projet_java/Samedi_s.txt", r);
				break;
				case 7 :	System.out.println("Fermé"); 	
				break;
				case 8 : 	loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 8");	
				break;
			}
		}while(loop == true);
	}
	
	public static void gestion_reservation()
	{
		Scanner sc =new Scanner(System.in);
		TraitementReservation tr = new TraitementReservation();
		boolean loop = true;
		do
		{
			System.out.println("_______________________________________________________________");
			System.out.println("|_________Gestion des reservations____________________________|");
			System.out.println("1)Consulter les personnels reservés___________________________|");
			System.out.println("2)Consulter les étudiants reservés____________________________|");
			System.out.println("3)Vider les reservations des personnels_______________________|");
			System.out.println("4)Vider les reservations des étudiants________________________|");
			System.out.println("5)retour");
			System.out.println("SVP Tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : System.out.println("La liste des personnels reservés"); tr.afficherPersonnelReserver();
				break;
				
				case 2 : System.out.println("La liste des etudiants reservés"); tr.afficherEtudiantReserver();
				break;
				case 3 : tr.viderPersonnels(); System.out.println("La suppression est effectué");
				break;
				case 4 : tr.viderEtudiants(); System.out.println("La suppression est effectué");
				break;
				case 5 : loop = false;
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
			System.out.println("_____________________________________");
			System.out.println("|_____________Menu__________________|");
			System.out.println("1)Gestion des etudiants_____________|");
			System.out.println("2)Gestion des Personnels____________|");
			System.out.println("3)Gestion des repas_________________|");
			System.out.println("4)Reclamation_______________________|");
			System.out.println("5)Gestion des reservations__________|");
			System.out.println("6)Quitez____________________________|");
			System.out.println("|___________________________________|");
			System.out.println("SVP Tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : gestion_des_etudiants();
				break;
				case 2 : gestion_des_personnels();
				break;
				case 3 : gestion_des_repas();
				break;
				case 4 : Reclamation r = new Reclamation();
						 r.afficher();
				break;
				case 5 : gestion_reservation();
				break;
				case 6 : System.out.println("Vous avez quitté le programme"); loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 6");
				break;
			}
		}while(loop == true);
	}
}