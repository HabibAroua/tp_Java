package traitement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import models.Etudiant;
import models.Personnel;;

public class TraitementPersonnel 
{
	ArrayList<Personnel>list;
	
	public TraitementPersonnel()
	{
		list = new ArrayList<>();
		MyFiles f = new MyFiles();
		f.setUrl("C:/projet_java/Personnel.txt"); //Donnez le schema de fichier avant de le lire
		try 
		{
			BufferedReader br = f.lire(); //stocker le contenu de fichier dans br
			String st; 
			while ((st = br.readLine()) != null)
			{
			    //System.out.println(st);
			    list.add(ligne(st));
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
	
	private Personnel ligne(String l)
	{
		String[] data = l.split(":", 5);
		Personnel p = new Personnel();
		p.setNumCin(Long.parseLong(data[0]));
		p.setNom(data[1]);
		p.setPrenom(data[2]);
		p.setSolde(Double.parseDouble(data[3]));
		p.setProffesion(data[4]);
		return p;
	}
	
	public boolean ajouter(Etudiant e)
	{
		return false;
	}
	
	public boolean supprimer(long cin)
	{
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
}