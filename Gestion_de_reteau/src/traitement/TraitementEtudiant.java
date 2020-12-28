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
		list =new ArrayList<>(); //instancier l'arrayList
		MyFiles f = new MyFiles();
		f.setUrl("C:/projet_java/Etudiant.txt"); //Donnez le schema de fichier avant de le lire 
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
		try
		{
			if(cinExite(e.getNumCin())== true)
			{
				System.out.println("Le num de cin est existe");
				return false;
			}
			else
			{
				if(Identifiant_universite_Exite(e.getIdantifiant_universitaire()) == true)
				{
					System.out.println("L'identifiant de l'etudiant est existe");
					return false;
				}
				else
				{
					list.add(e); //pour ajouter etudiant dans arrayList
					sauvgarder(); //pour ajouter ce contenu dans le fichier
					return true;
				}
			}
			
		}
		catch(Exception ex)
		{
			return false;
		}
	}
	
	public boolean supprimer(long cin)
	{
		try
		{
			if(cinExite(cin)== false)
			{
				System.out.println("Le cin de cet etudiant n'exsite pas");
				return false;
			}
			list.remove(chercherIndice(cin));
			sauvgarder();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean modifier(long cin, Etudiant e)
	{
		try
		{
			if(cinExite(e.getNumCin())== true)
			{
				System.out.println("Le num de cin est existe");
				return false;
			}
			else
			{
				if(Identifiant_universite_Exite(e.getIdantifiant_universitaire()) == true)
				{
					System.out.println("L'identifiant de l'etudiant est existe");
					return false;
				}
				else
				{
					list.set(chercherIndice(cin), e); // list.set(indice ili t7éb tbadlha, el valeur el jdid)
					sauvgarder(); //apres la modification il va sauvgarder
					return true;
				}
			}
			
		} // CRUD (create , read , update , delete )
		catch(Exception ex)
		{
			return false;
		}
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
		//f.vider();
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
		te.afficher();
	}
	
	public int chercherIndice(long cin)
	{
		int indice = 0;
		for(int i=0 ; i<list.size() ; i++) //size() donner le nombre d'element dans un arrayList
		{
			if(list.get(i).getNumCin() == cin)
			{
				indice = i;
				break;
			}
		}
		return indice;
	}
	
	public boolean cinExite(long cin)
	{
		boolean test = false;
		for(int i=0 ; i<list.size() ; i++) //size() donner le nombre d'element dans un arrayList
		{
			if(list.get(i).getNumCin() == cin)
			{
				test = true;
				break;
			}
		}
		return test;
	}
	
	public boolean Identifiant_universite_Exite(String identifiant) //identifcation etudiant dans la carte etudiant
	{
		boolean test = false;
		for(int i=0 ; i<list.size() ; i++) //size() donner le nombre d'element dans un arrayList
		{
			if(list.get(i).getIdantifiant_universitaire().equals(identifiant))
			{
				test = true;
				break;
			}
		}
		return test;
	}
	
}