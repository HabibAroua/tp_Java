package traitement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
	
	public boolean ajouter(Personnel p)
	{
		try
		{
			if(cinExite(p.getNumCin())== true)
			{
				System.out.println("Le num de cin est existe");
				return false;
			}
			else
			{
				if(p.getSolde()<0.200)
				{
					System.out.println("Solde insuffisant");
					return false;
				}
				else
				{
					list.add(p); //pour ajouter personnel dans arrayList
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
			list.remove(chercherIndice(cin));
			sauvgarder();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean modifier(long cin, Personnel p)
	{
		try
		{
			if(cinExite(p.getNumCin())== true)
			{
				System.out.println("Le num de cin est existe");
				return false;
			}
			else
			{
				if(p.getSolde()<0.200)
				{
					System.out.println("Solde insuffisant");
					return false;
				}
				else
				{
					list.set(chercherIndice(cin), p); // list.set(indice ili t7éb tbadlha, el valeur el jdid)
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
			ch = ch + list.get(i).getNumCin()+":"+list.get(i).getNom()+":"+list.get(i).getPrenom()+":"+list.get(i).getSolde()+":"+list.get(i).getProffesion()+" \n";
		}
		
		MyFiles f = new MyFiles("C:/projet_java/Personnel.txt",ch);
		f.ecrire();
	}
	
	public int chercherIndice(long cin)
	{
		int indice = -1;
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
	
	public Personnel trouver(long cin)
	{
		int indice = chercherIndice(cin);
		if(indice == -1)
		{
			return null;
		}
		else
		{
			return list.get(indice);
		}
	}
}