package principal;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import traitement.Operation;

public class Main 
{
	public static void main(String[] args) throws Exception 
	{
		int choice=0;
		Scanner scannerChoice=new Scanner(System.in);
		do
		{
			do
			{
				System.out.println("________________________________________Menu_________________________________________________________________________________________________");
				System.out.println("1)programmeurs ayant consommé le nombre maximum de cafés en une semaine");
				System.out.println("2)le nombre total de gobelets à café utilisé par l’équipe de jour");
				System.out.println("3)le nombre total de gobelets (à eau et à café) utilisé par l’équipe de nuit");
				System.out.println("4)une semaine donnée, retournez la liste des programmeurs triée dans l'ordre décroissant selon leur nombre de consommations de café pour l’équipe de jour.");
				System.out.println("5)Affichez le salaire de developpeur qui n’a pas dépassé les cafés gratuits");
				System.out.println("6)Retournez un utilisateur de l’équipe de nuit qui a dépassé le nombre de café offerts et calculez son nouveau salaire");
				System.out.println("7)Affichez le café le plus consommé par les développeurs de cette entreprise");
				System.out.println("8)Affichez le plus gros consommateur de café dans cette entreprise");
				System.out.println("9)Quitter");
				System.out.println("__________________________________________________________________________________________________________________________________________________________");
				System.out.println("SVP donnez votre choix");
				choice =scannerChoice.nextInt();
				switch(choice)
				{
					case  1 : 	for(int i=0; i<Operation.method1().size(); i++)
								{
									System.out.println(Operation.method1().get(i).getNom()+" "+Operation.method1().get(i).getPrenom());
								}
								TimeUnit.SECONDS.sleep(2);
						break;
					case  2 : 	Operation.method2();
								TimeUnit.SECONDS.sleep(2);
						break;
					case  3 : 	Operation.method3(); 
								TimeUnit.SECONDS.sleep(2);
						break;
					case  4 : 	Operation.method4();
								TimeUnit.SECONDS.sleep(2);
						break;
					case  5 : 	for(int i=0; i<Operation.method5().size(); i++)
								{
									System.out.println(Operation.method5().get(i).getSalaire()+" ");
								}
								TimeUnit.SECONDS.sleep(2);
						break;
					case  6 : 	System.out.println("Salaire modifié est "+Operation.method6());
								TimeUnit.SECONDS.sleep(2);
						break;
					case  7 : 	System.out.println("Cafe plus consomé est "+Operation.method7());
								TimeUnit.SECONDS.sleep(2);
						break;
					case 8 : 	System.out.print("Le plus consomateur de l'entreprise est "+Operation.method8().getNom()+" "+Operation.method8().getPrenom());
								TimeUnit.SECONDS.sleep(2);
						break;
					case 9 : System.out.println("Vous quittez l'application");
					break;
				}
			}while((choice<=0) && (choice >9));
		}while(choice != 9);
	}

}
