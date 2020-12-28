package view;

import java.util.Scanner;
import traitement.TraitementRepat;

public class User 
{
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
			System.out.println("3)Reserver ou confirmer sa présence________________________________________|");
			System.out.println("4)Quitez___________________________________________________________________|");
			System.out.println("|__________________________________________________________________________|");
			System.out.println("SVP Tapez votre choix");
			
			int choix = sc.nextInt();
			switch(choix)
			{
				case 1 : tr.menu();
				break;
				case 2 : consulter_toute_la_semaine(tr);
				break;
				case 3 : System.out.println("Reservation");
				break;
				case 4 : System.out.println("Tu as quitté le programme"); loop = false;
				break;
				default : System.out.println("Vous devez choisir un nombre entre 1 et 4");
				break;
			}
		}while(loop == true);
	}
}