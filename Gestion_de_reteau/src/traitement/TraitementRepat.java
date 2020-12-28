package traitement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import models.Repat;

public class TraitementRepat 
{
	public Repat[] tab;
	public Repat[]tab1;
	
	public TraitementRepat()
	{
		tab=new Repat[6];
        tab1=new Repat[6];
        Repat R_lundi_m = ligne(repas_proposer("C:/projet_java/Lundi_m.txt"));
 		Repat R_lundi_s = ligne(repas_proposer("C:/projet_java/Lundi_s.txt"));
 		Repat R_Mardi_m = ligne(repas_proposer("C:/projet_java/Mardi_m.txt"));
 		Repat R_Mardi_s = ligne(repas_proposer("C:/projet_java/Mardi_s.txt"));
 		Repat R_Mercredi_m = ligne(repas_proposer("C:/projet_java/Mercredi_m.txt"));
 		Repat R_Mercredi_s = ligne(repas_proposer("C:/projet_java/Mercredi_s.txt"));
 		Repat R_Jeudi_m = ligne(repas_proposer("C:/projet_java/Jeudi_m.txt"));
 		Repat R_Jeudi_s = ligne(repas_proposer("C:/projet_java/Jeudi_s.txt"));
 		Repat R_Vendredi_m = ligne(repas_proposer("C:/projet_java/Vendredi_m.txt"));
 		Repat R_vendredi_s = ligne(repas_proposer("C:/projet_java/Vendredi_s.txt"));
 		Repat R_Samedi_m = ligne(repas_proposer("C:/projet_java/Samedi_m.txt"));
 		Repat R_Samedi_s = ligne(repas_proposer("C:/projet_java/Samedi_s.txt"));
 		tab[0]=R_lundi_m;
 		tab[1]=R_Mardi_m;
 		tab[2]=R_Mercredi_m;
 		tab[3]=R_Jeudi_m;
 		tab[4]=R_Vendredi_m;
 		tab[5]=R_Samedi_m;
 		tab1[0]=R_lundi_s;
 		tab1[1]=R_Mardi_s;
 		tab1[2]=R_Mercredi_s;
 		tab1[3]=R_Jeudi_s;
 		tab1[4]=R_vendredi_s;
 		tab1[5]=R_Samedi_s;
	}
	
	public void menuMidi()
	{
		System.out.println("voici le menu de lundi matin : " + tab[0].getPlatprincipale() + "|"+ tab[0].getDesert()+ "|"+ tab[0].getSalade()+ "|"+ tab[0].getPain() );
		System.out.println("voici le menu de Mardi matin : " + tab[1].getPlatprincipale() + "|"+ tab[1].getDesert()+ "|"+ tab[1].getSalade()+ "|"+ tab[1].getPain() );
		System.out.println("voici le menu de Mercredi matin : " + tab[2].getPlatprincipale() + "|"+ tab[2].getDesert()+ "|"+ tab[2].getSalade()+ "|"+ tab[2].getPain() );
		System.out.println("voici le menu de Jeudi matin  : "+ tab[3].getPlatprincipale() + "|"+ tab[3].getDesert()+ "|"+ tab[3].getSalade()+ "|"+ tab[3].getPain() );
		System.out.println("voici le menu de Vendredi matin : " + tab[4].getPlatprincipale() + "|"+ tab[4].getDesert()+ "|"+ tab[4].getSalade()+ "|"+ tab[4].getPain() );
		System.out.println("voici le menu de Samedi matin : " + tab[5].getPlatprincipale() + "|"+ tab[5].getDesert()+ "|"+ tab[5].getSalade()+ "|"+ tab[5].getPain() );
	}
	
	public void menuSoir()
	{
		System.out.println("voici le menu de lundi soir : " + tab1[0].getPlatprincipale() + "|"+ tab1[0].getDesert()+ "|"+ tab1[0].getSalade()+ "|"+ tab1[0].getPain() );
		System.out.println("voici le menu de Mardi soir : " + tab1[1].getPlatprincipale() + "|"+ tab1[1].getDesert()+ "|"+ tab1[1].getSalade()+ "|"+ tab1[1].getPain() );
		System.out.println("voici le menu de Mercredi soir : " + tab1[2].getPlatprincipale() + "|"+ tab1[2].getDesert()+ "|"+ tab1[2].getSalade()+ "|"+ tab1[2].getPain() );
		System.out.println("voici le menu de Jeudi soir : " + tab1[3].getPlatprincipale() + "|"+ tab1[3].getDesert()+ "|"+ tab1[3].getSalade()+ "|"+ tab1[3].getPain() );
		System.out.println("voici le menu de Vendredi soir : " + tab1[4].getPlatprincipale() + "|"+ tab1[4].getDesert()+ "|"+ tab1[4].getSalade()+ "|"+ tab1[4].getPain() );
		System.out.println("voici le menu de Samedi soir : " + tab1[5].getPlatprincipale() + "|"+ tab1[5].getDesert()+ "|"+ tab1[5].getSalade()+ "|"+ tab1[5].getPain() );
	}
	
	public  void menu()
	{
        /* Scanner input = new Scanner (System.in);
			System.out.println("donner l'heure = ");
			int temps  = Integer.parseInt(input.nextLine());*/
   
		Calendar calendar=Calendar.getInstance();
		int jour =  calendar.get(Calendar.DAY_OF_WEEK);
		//  System.out.println(jour);
		if (jour == 2 )
		{
			System.out.println("  c'est lundi , le restaurant universitaire vous souhaite une bone debut de semaine  "); 
		}
		if (jour == 3 )
		{
			System.out.println("         C'est Mardi               " ); 
		}
		if (jour == 4 )
		{
			System.out.println("           C'est Mercredi            " );
		}
		if (jour == 5 )
		{
			System.out.println("           C'est Jeudi              " );
		}
		if (jour == 6 )
		{
			System.out.println("           C'est Vendredi            " );
		}
		if (jour == 7 )
		{
			System.out.println("           C'est Samedi             " );
		}
		Calendar calendar1=Calendar.getInstance();
 		int heure =  calendar1.get(Calendar.AM) ;
 		System.out.println("           *c'est : " + heure + "AM *          "); 
 		if ((heure >= 6) && (heure <= 8) )
 		{
 			if(jour==2)
 			{
 				System.out.println("voici le menu de lundi matin \n " + tab1[0].getPlatprincipale() + "|"+ tab1[0].getDesert()+ "|"+ tab1[0].getSalade()+ "|"+ tab1[0].getPain() );
 			}
 			if(jour==3)
 			{
 				System.out.println("voici le menu de mardi matin \n " + tab1[1].getPlatprincipale() + "|"+ tab1[1].getDesert()+ "|"+ tab1[1].getSalade()+ "|"+ tab1[1].getPain() );
 			}
 			if(jour==4)
 			{
 				System.out.println("voici le menu de mercredi matin \n " + tab1[2].getPlatprincipale() + "|"+ tab1[2].getDesert()+ "|"+ tab1[2].getSalade()+ "|"+ tab1[2].getPain() );
 			}
 			if(jour==5)
 			{
 				System.out.println("voici le menu de mercredi matin \n " + tab1[3].getPlatprincipale() + "|"+ tab1[2].getDesert()+ "|"+ tab1[2].getSalade()+ "|"+ tab1[2].getPain() );
 			}
 			if(jour==6)
 			{
 				System.out.println("voici le menu de vendredi soire \n " +tab1[4].getPlatprincipale() + "|"+ tab1[3].getDesert()+ "|"+ tab1[3].getSalade()+ "|"+ tab1[3].getPain() );
 			}
 		}
 		if((heure >= 0) && (heure <= 3) )    
       {
 			if(jour==2)
 			{
 				System.out.println( "voici le menu de lundi matin \n " + tab[0].getPlatprincipale() + "|"+ tab[0].getDesert()+ "|"+ tab[0].getSalade()+ "|"+ tab[0].getPain() );
 			}
 			else if(jour==3)
 			{
 				System.out.println("voici le menu de mardi matin \n " + tab[1].getPlatprincipale() + "|"+ tab[1].getDesert()+ "|"+ tab[1].getSalade()+ "|"+ tab[1].getPain() );
 			}
 			else if(jour==4)
 			{
 				System.out.println("voici le menu de mercredi matin \n " + tab[2].getPlatprincipale() + "|"+ tab[2].getDesert()+ "|"+ tab[2].getSalade()+ "|"+ tab[2].getPain() );
 			}
 			if(jour==5)
 			{
 				System.out.println("voici le menu de jeudi matin \n " +tab[3].getPlatprincipale() + "|"+ tab[3].getDesert()+ "|"+ tab[3].getSalade()+ "|"+ tab[3].getPain() );
 			}
 			if(jour==6)
 			{
 				System.out.println("voici le menu de vendredi matin \n " + tab[4].getPlatprincipale() + "|"+ tab[4].getDesert()+ "|"+ tab[4].getSalade()+ "|"+ tab[4].getPain() );
 			}
 			if(jour==7)
 			{
 				System.out.println("voici le menu de samedi matin \n " + tab[5].getPlatprincipale() + "|"+ tab[5].getDesert()+ "|"+ tab[5].getSalade()+ "|"+ tab[5].getPain() );
 			}
       }
	}
	
	public String repas_proposer(String url)
	{
		MyFiles f = new MyFiles();
		f.setUrl(url); //Donnez le schema de fichier avant de le lire 
		try 
		{
			BufferedReader br = f.lire(); //stocker le contenu de fichier dans br
			String st = br.readLine();
			return st;
		} //pour stocker les informations de la fichier dans arrayList 
		catch (FileNotFoundException e)
		{
			System.out.println("Erreur : "+e.getMessage());
			return "";
		}
		catch(IOException e)
		{
			System.out.println("Erreur : "+e.getMessage());
			return "";
		}
	}
	
	private  Repat ligne(String l)
	{
		String[] data = l.split(":", 4);
		Repat r = new Repat();
		r.setPlatprincipale(data[0]);
		r.setDesert(data[1]);
		r.setSalade(data[2]);
		r.setPain(data[3]);
		return r;
	}
	
	public void sauvgarder(String url, Repat r)
	{		
		MyFiles f = new MyFiles(url,r.getPlatprincipale()+":"+r.getDesert()+":"+r.getSalade()+":"+r.getPain());
		f.ecrire();
		System.out.println("Vous avez modifier ce menu");
	}
}