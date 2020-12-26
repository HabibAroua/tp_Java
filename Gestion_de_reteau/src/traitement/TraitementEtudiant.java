package traitement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import models.Etudiant;

public class TraitementEtudiant
{
	ArrayList<Etudiant>list;
	
	public TraitementEtudiant() 
	{
		list =new ArrayList<>();
		MyFiles f = new MyFiles();
		f.setUrl("C:/projet_java/Etudiant.txt");
		try 
		{
			BufferedReader br = f.lire();
			String st; 
			while ((st = br.readLine()) != null)
			{
			    //System.out.println(st);
			    this.list.add(ligne(st));
			}
			f.vider();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Erreur : "+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Erreur : "+e.getMessage());
		}
	}
	
	private Etudiant ligne(String l)
	{

		String[] data = l.split(":", 6);
		Etudiant e = new Etudiant();
		e.setNumCin(Long.parseLong(data[0]));
		e.setNom(data[1]);
		e.setPrenom(data[2]);
		e.setSolde(Double.parseDouble(data[3]));
		e.setIdantifiant_universitaire(data[4]);
		e.setUniversite(data[5]);
		return e;
	}
	
	public boolean ajouter(Etudiant e)
	{
		list.add(e);
		return true;
	}
	
	public boolean supprimer(long cin)
	{
		list.remove(1);
		return false;
	}
	
	public boolean modifier(long cin, Etudiant e)
	{
		return false;
	}
	
	public void afficher()
	{
		for(int i=0; i<list.size() ; i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	public void sauvgarder() throws IOException
	{
		String ch = ""; 
		for(int i =0 ; i<list.size() ; i++)
		{
			ch = ch + list.get(i).getNumCin()+":"+list.get(i).getNom()+":"+list.get(i).getPrenom()+":"+list.get(i).getSolde()+":"+list.get(i).getIdantifiant_universitaire()+":"+list.get(i).getUniversite()+" \n";
		}
		
		MyFiles f = new MyFiles("C:/projet_java/Etudiant.txt",ch);
		f.vider();
		f.ecrire();
	}
	
	public Etudiant trouver(long cin)
	{
		return null;
	}
	
	public static void main(String args[]) throws IOException
	{
		Etudiant e1 = new Etudiant(07472324, "Habib", "Aroua", 500, "I255662" ,"Iset Mahdia");
		Etudiant e2 = new Etudiant(07472325, "Souha", "Ben Amor", 500, "I255662" ,"Iset Mahdia");
		Etudiant e3 = new Etudiant(07472326, "Safa", "Miri", 500, "I255662" ,"Iset Mahdia");
		TraitementEtudiant te = new TraitementEtudiant();
		
		//te.ajouter(e1);
		//te.ajouter(e2);
		//te.ajouter(e3);
		te.supprimer(0);
		te.sauvgarder();
		
		te.afficher();
	}
}