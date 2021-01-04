package view;

import java.util.Scanner;

import models.Etudiant;
import models.Personnel;
import models.Repat;
import models.Reservation;
import traitement.Reclamation;
import traitement.TraitementReservation;
import traitement.TraitementEtudiant;
import traitement.TraitementPersonnel;
import traitement.TraitementRepat;

public class User 
{
	public static String Chaine()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void reserver()
	{
		Scanner sc = new Scanner(System.in);
		TraitementEtudiant te = new TraitementEtudiant();
		TraitementPersonnel tp = new TraitementPersonnel();
		TraitementRepat tr = new TraitementRepat();
		TraitementReservation rt = new TraitementReservation();
		Reservation reservation = new Reservation();
		
		Repat r = tr.getRepatMaintenant();
		Repat repatReserver = new Repat();
		System.out.println("voici le menu d'aujourd'hui \n " + r.getPlatprincipale() + "|"+ r.getSalade() );
		System.out.println("Tapez sur Entrée pour continuer");
		Chaine();
		System.out.println("Vous êtes Personnel ou etudiant (p/e)");
		String user_type = Chaine();
		System.out.println("Donnez ton num cin");
		long cin = sc.nextLong();
		
		if(user_type.equals("p"))
		{
			Personnel p = tp.trouver(cin);
			if(p == null)
			{
				System.out.println("Vous devez s'inscrire au resto");
			}
			else
			{
				if(rt.cinExitePersonnel(cin))
				{
					System.out.println("Vous êtes déjà reservé");
				}
				else
				{
					System.out.println("Vous voulez dessert oui ou non (oui/non) = ");
			        String b="oui";
			        String a= Chaine();
			        if(a.equals(b))
			        {
			        	System.out.println("ok "+r.getDesert());
			        	repatReserver.setDesert(r.getDesert());
			        }
			        else
			        {
			        	System.out.println("ok comme tu veux");
			        }
			        System.out.println("Vous voulez pain  repond que oui/non ");
			        String s= Chaine();
			            
			        if(s.equals(b))
			        {
			        	System.out.println("Ok pour le pain");
			        	repatReserver.setPain("Oui");
			        	
			        }
			        else 
			        {
			        	System.out.println("comme tu veux ");
			        	repatReserver.setPain("Non");
			        }
			        reservation.setCin(cin);
			        repatReserver.setPlatprincipale(r.getPlatprincipale());
					repatReserver.setSalade(r.getSalade());
			        reservation.setRepat(repatReserver);
			        rt.reserverPersonnel(reservation);
				}
			}
		}
		else
		{
			if(user_type.equals("e"))
			{
				Etudiant e = te.trouver(cin);
				if(e == null)
				{
					System.out.println("Vous devez s'inscrire au resto");
				}
				else
				{
					if(rt.cinExiteEtudiant(cin))
					{
						System.out.println("Vous êtes déjà reservé");
					}
					else
					{
						System.out.println("tu veux dessert oui ou non (oui/non) = ");
				        String b="oui";
				        String a= Chaine();
				        if(a.equals(b))
				        {
				        	System.out.println("ok "+r.getDesert());
				        	repatReserver.setDesert(r.getDesert());
				        }
				        else
				        {
				        	System.out.println("ok comme tu veux");
				        }
				        System.out.println("tu veux pain  repond que oui/non ");
				        String s= Chaine();
				            
				        if(s.equals(b))
				        {
				        	System.out.println("Ok pour le pain");
				        	repatReserver.setPain("Oui");
				        	
				        }
				        else 
				        {
				        	System.out.println("comme tu veux ");
				        	repatReserver.setPain("Non");
				        }
				        reservation.setCin(cin);
				        repatReserver.setPlatprincipale(r.getPlatprincipale());
						repatReserver.setSalade(r.getSalade());
				        reservation.setRepat(repatReserver);
				        rt.reserverEtudiant(reservation);
					}
				}
			}
		}
	}
	
	public static void consulter_toute_la_semaine(TraitementRepat tr)
	{
		Scanner sc =new Scanner(System.in);		
		boolean loop = true;
		do
		{
			System.out.println("___Choisir____");
			System.out.println("1)Par midi____|");
			System.out.println("2)Par soir____|");
			System.out.println("3)Retour______|");
			System.out.println("______________|");
			System.out.println("SVP tapez votre choix");
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : tr.menuMidi();
				break;
				case 2 : tr.menuSoir();
				break;
				case 3 : System.out.println("Quitter"); loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 3");
				break;
			}
		}while(loop == true);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n *** Bienvenue au restaurant universitaire de Mahdia *** \n ");
		Scanner sc =new Scanner(System.in);
		TraitementRepat tr = new TraitementRepat();
		boolean loop = true;
		do
		{
			System.out.println("___________________________________________________________________________");
			System.out.println("|___________________________________Menu___________________________________|");
			System.out.println("1)Constuler le plat suivant________________________________________________|");
			System.out.println("2)Constuler les plats de toutes la semaine_________________________________|");
			System.out.println("3)Reserver_________________________________________________________________|");
			System.out.println("4)Recalamtion______________________________________________________________|");
			System.out.println("5)Quitez___________________________________________________________________|");
			System.out.println("|__________________________________________________________________________|");
			System.out.println("SVP Tapez votre choix");
			
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : tr.menu();
				break;
				case 2 : consulter_toute_la_semaine(tr);
				break;
				case 3 : reserver();
				break;
				case 4 : Reclamation r = new Reclamation();
						 System.out.println("Si vous avez une reclamation ?");
						 boolean test = r.ajouterReclamation(Chaine());
						 if(test == true)
						 {
							 System.out.println("Cette reclamation est envoyée");
						 }
						 else
						 {
							 System.out.println("Erreur");
						 }
						
				break;
				case 5 : System.out.println("Vous avez quitté le programme"); loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 4");
				break;
			}
		}while(loop == true);
	}
}