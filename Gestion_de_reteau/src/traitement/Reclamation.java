package traitement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Reclamation 
{
	ArrayList<String> listReclamation;
	public  Reclamation () 
	{
		listReclamation = new ArrayList<>();
		MyFiles f = new MyFiles();
		f.setUrl("C:/projet_java/Reclamation.txt"); //Donnez le schema de fichier avant de le lire 
		try 
		{
			BufferedReader br = f.lire(); //stocker le contenu de fichier dans br
			String st; 
			while ((st = br.readLine()) != null)
			{
			    //System.out.println(st);
			    listReclamation.add(st);
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
	
	public boolean ajouterReclamation(String texte)
	{
		listReclamation.add(texte);
		sauvgarder();
		return true;
	}
	
	public void afficher()
	{
		System.out.println("La liste des reclamations");
		for(int i = 0 ; i<listReclamation.size() ; i++)
		{
			System.out.println(listReclamation.get(i));
		}
	}
	
	//methoses
	public void sauvgarder()//on vas sauvgarder le plat li reserveh etudiant dans user
	{
		String ch = ""; 
		for(int i =0 ; i<listReclamation.size() ; i++)
		{
			ch = ch + listReclamation.get(i)+"\n";
		}
		
		MyFiles f = new MyFiles("C:/projet_java/Reclamation.txt",ch);
		f.ecrire();
	}
}
