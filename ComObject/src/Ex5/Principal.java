package Ex5;

import java.util.Scanner;
public class Principal
{

	public static void main(String[] args) 
	{
	      Repertoire rep=new Repertoire();
	      Contact c1=new Contact("Contact1",1);
	      Contact c2=new Contact("Contact2",2);
	      Contact c3=new Contact("Contact3",3);
	      Contact c4=new Contact("Contact4",4);
	      Contact c5=new Contact("Contact5",5);
	      rep.ajouterContact(c1);
	      Contact [] T=new Contact[5];
	      T[0]=c2;
	      T[1]=c3;
	      T[2]=c4;
	      T[3]=c5;
	      rep.AjouterAll(T);
	      
	      //Le menu
	      int choix;
	      String nom="";
	      Scanner sc=new Scanner(System.in);
	      Scanner sc1=new Scanner(System.in);
	      
	      do
	      {
	    	  do
	    	  {
	    		  System.out.println("___________Menu__________");
	    		  System.out.println("1)Afficher le contenu____");
	    		  System.out.println("2)Chercher le numéro tel_");
	    		  System.out.println("3)Quitter________________");
	    		  System.out.println("_________________________");
	    		  
	    		  System.out.println("Donnez votre choix ");
	    		  choix=sc.nextInt();
	    		  switch(choix)
	    		  {
	    		       case 1:rep.Afficher();
	    		       break;
	    		       case 2: System.out.println("Donner le nom");
	    		               nom=sc1.nextLine();
	    		               System.out.println("Le num est "+rep.chercherContact(nom));
	    		       break;
	    		       case 3 : System.out.println("Vous quittez le programme ");
	    		       break;
	    		       default : System.out.println("Choix invalide");
	    		       break;
	    		  }
	    	  }while((choix<1)||(choix>3));
	    	  
	      }while(choix!=3);     
	}
}