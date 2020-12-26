package view;

import java.util.Scanner;

public class Main 
{
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
				case 1 : System.out.println("Tu choisi gestion des etudiants");
				break;
				case 2 : System.out.println("Tu choisi gestion des personnels");
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
