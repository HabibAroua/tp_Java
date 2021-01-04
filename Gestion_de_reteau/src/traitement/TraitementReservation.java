package traitement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import models.Repat;
import models.Reservation;

public class TraitementReservation 
{
	private static final int capaciteEtudiant = 50; //final c'est à dire constante 
	private static final int capacitePersonnel = 20;
	ArrayList<Reservation> listEtudiant;
	ArrayList<Reservation> listPersonnel;
	
	public TraitementReservation()
	{
		initPersonnel();
		initEtudiant();
	}
	
	public void initPersonnel()
	{
		listPersonnel = new ArrayList<>();
		MyFiles f = new MyFiles();
		f.setUrl("C:/projet_java/ReservationPersonnel.txt"); //Donnez le schema de fichier avant de le lire 
		try 
		{
			BufferedReader br = f.lire(); //stocker le contenu de fichier dans br
			String st; 
			while ((st = br.readLine()) != null)
			{
			    //System.out.println(st);
				listPersonnel.add(ligne(st));
			}
		} //pour stocker les informations de la fichier dans arrayList 
		catch (FileNotFoundException e)
		{
			System.out.println("Erreur : "+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Erreur : "+e.getMessage());
		}
	}
	
	public void initEtudiant()
	{
		listEtudiant = new ArrayList<>();
		MyFiles f = new MyFiles();
		f.setUrl("C:/projet_java/ReservationEtudiant.txt"); //Donnez le schema de fichier avant de le lire 
		try 
		{
			BufferedReader br = f.lire(); //stocker le contenu de fichier dans br
			String st; 
			while ((st = br.readLine()) != null)
			{
			    //System.out.println(st);
				listEtudiant.add(ligne(st));
			}
		} //pour stocker les informations de la fichier dans arrayList 
		catch (FileNotFoundException e)
		{
			System.out.println("Erreur : "+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Erreur : "+e.getMessage());
		}
	}
	
	public void reserverPersonnel(Reservation r)
	{
		if(capacitePersonnel <= this.listPersonnel.size())
		{
			System.out.println("Toutes les places sont reserver");
		}
		else
		{
			listPersonnel.add(r);
			sauvgarderPersonnel();
			System.out.println("La reservation est effectué avec success");
		}
	}
	
	public void reserverEtudiant(Reservation r)
	{
		if(capaciteEtudiant <= this.listEtudiant.size())
		{
			System.out.println("Toutes les places sont reserver");
		}
		else
		{
			listEtudiant.add(r);
			sauvgarderEtudiant();
			System.out.println("La reservation est effectué avec success");
		}
	}
	
	public void sauvgarder()
	{
		sauvgarderEtudiant();
		sauvgarderPersonnel();
	}
	
	public void sauvgarderPersonnel()
	{
		String ch = ""; 
		for(int i =0 ; i<listPersonnel.size() ; i++)
		{
			ch = ch + listPersonnel.get(i).getCin()+":"+listPersonnel.get(i).getRepat().getPlatprincipale()+":"+listPersonnel.get(i).getRepat().getDesert()+":"+listPersonnel.get(i).getRepat().getSalade()+":"+listPersonnel.get(i).getRepat().getPain()+" \n";
		}
		
		MyFiles f = new MyFiles("C:/projet_java/ReservationPersonnel.txt",ch);
		f.ecrire();
	}
	
	public void sauvgarderEtudiant()
	{
		String ch = ""; 
		for(int i =0 ; i<listEtudiant.size() ; i++)
		{
			ch = ch + listEtudiant.get(i).getCin()+":"+listEtudiant.get(i).getRepat().getPlatprincipale()+":"+listEtudiant.get(i).getRepat().getDesert()+":"+listEtudiant.get(i).getRepat().getSalade()+":"+listEtudiant.get(i).getRepat().getPain()+" \n";
		}
		
		MyFiles f = new MyFiles("C:/projet_java/ReservationEtudiant.txt",ch);
		f.ecrire();
	}
	
	private Reservation ligne(String l)
	{
		String[] data = l.split(":", 5);
		Reservation r = new Reservation();
		r.setCin(Long.parseLong(data[0]));
		Repat repat = new Repat();
		repat.setPlatprincipale(data[1]);
		repat.setDesert(data[2]);
		repat.setSalade(data[3]);
		repat.setPain(data[4]);
		r.setRepat(repat);
		return r;
	}
	
	public boolean cinExitePersonnel(long cin)
	{
		boolean test = false;
		for(int i=0 ; i<listPersonnel.size() ; i++) //size() donner le nombre d'element dans un arrayList
		{
			if(listPersonnel.get(i).getCin() == cin)
			{
				test = true;
				break;
			}
		}
		return test;
	}
	
	public boolean cinExiteEtudiant(long cin)
	{
		boolean test = false;
		for(int i=0 ; i<listEtudiant.size() ; i++) //size() donner le nombre d'element dans un arrayList
		{
			if(listEtudiant.get(i).getCin() == cin)
			{
				test = true;
				break;
			}
		}
		return test;
	}
	
	public void afficherEtudiantReserver()
	{
		TraitementEtudiant te = new TraitementEtudiant();
		for(int i = 0; i<listEtudiant.size() ; i++)
		{
			System.out.println(te.trouver(listEtudiant.get(i).getCin()));
		}
	}
	
	public void afficherPersonnelReserver()
	{
		TraitementPersonnel pe = new TraitementPersonnel();
		for(int i = 0; i<listPersonnel.size() ; i++)
		{
			System.out.println(pe.trouver(listPersonnel.get(i).getCin()));
		}
	}
	
	public void viderPersonnels()
	{
		listPersonnel.clear();
		MyFiles f = new MyFiles("C:/projet_java/ReservationPersonnel.txt","");
		f.ecrire();
	}
	
	public void viderEtudiants()
	{
		listEtudiant.clear();
		MyFiles f = new MyFiles("C:/projet_java/ReservationEtudiant.txt","");
		f.ecrire();
	}
}