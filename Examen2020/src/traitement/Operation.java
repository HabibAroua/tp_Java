package traitement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Database.Connexion;
import Models.Developpeur;
import Models.Goublet;

public class Operation 
{
	
	public static ArrayList<Developpeur> method1() //Retournez tous les programmeurs ayant consommé le nombre maximum de cafés en une semaine.
	{
		try
		{
			ArrayList<Developpeur> list = new ArrayList<Developpeur>();
			Connection con = Connexion.connect();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select devloppeur.nom , devloppeur.prenom from devloppeur, goublet where devloppeur.id = goublet.id_dev group by devloppeur.id having (count(goublet.id));");  
			while(rs.next())  
			{
				Developpeur d =new Developpeur();
				d.setNom(rs.getString("nom"));
				d.setPrenom(rs.getString("prenom"));
				list.add(d);
			}
				  
			con.close();
			return list;
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			return null;
		}
	}
	
	public static int method2() //Donnez le nombre total de gobelets à café utilisé par l’équipe de jour
	{
		//select count(goublet.id) from goublet, equipe, devloppeur where equipe.types = 'jour' and devloppeur.id_equipe =equipe.id and devloppeur.id = goublet.id_dev; 
		try
		{
			int nb = 0;
			ArrayList<Developpeur> list = new ArrayList<Developpeur>();
			Connection con = Connexion.connect();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select count(goublet.id) as nb from goublet, equipe, devloppeur where equipe.types = 'jour' and devloppeur.id_equipe =equipe.id and devloppeur.id = goublet.id_dev and goublet.semaine = 1 and goublet.boisson = 'cafe'");  
			//System.out.println(rs.getInt("nb"));
			while(rs.next())
			{
				nb = rs.getInt(1);
			}
				  
			con.close();
			System.out.println("Le nombre total de jours "+nb);
			return nb;
			
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			return 0;
		}
	}
	
	public static int method3() //Donnez le nombre total de gobelets (à eau et à café) utilisé par l’équipe de nuit
	{
		//select count(goublet.id) from goublet, equipe, devloppeur where equipe.types = 'jour' and devloppeur.id_equipe =equipe.id and devloppeur.id = goublet.id_dev; 
		try
		{
			int nb = 0;
			ArrayList<Developpeur> list = new ArrayList<Developpeur>();
			Connection con = Connexion.connect();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select count(goublet.id) from goublet, equipe, devloppeur where equipe.types = 'nuit' and devloppeur.id_equipe =equipe.id and devloppeur.id = goublet.id_dev;");  
			while(rs.next())
			{
				nb = rs.getInt(1);
			}
						  
			con.close();
			System.out.println(nb);
			return nb;
			
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			return 0;
		}
	}
	
	public static ArrayList<Developpeur> method4() //Pour une semaine donnée, retournez la liste des programmeurs triée dans l'ordre décroissant selon leur nombre de consommations de café pour l’équipe de jour.
	{
		try
		{
			ArrayList<Developpeur> list = new ArrayList<Developpeur>();
			Connection con = Connexion.connect();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select devloppeur.nom , devloppeur.prenom , count(goublet.id) from devloppeur, goublet , equipe where devloppeur.id = goublet.id_dev and equipe.types='jour' and equipe.id =devloppeur.id_equipe group by devloppeur.id order by (count(goublet.id)) desc");  
			while(rs.next())  
			{
				
				Developpeur d =new Developpeur();
				d.setNom(rs.getString("nom"));
				d.setPrenom(rs.getString("prenom"));
				list.add(d);
			}
				  
			con.close();
			return list;
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			return null;
		}
	}
	
	public static ArrayList<Developpeur> method5() //6-	Cherchez un utilisateur qui n’a pas dépassé les cafés gratuits. Affichez alors son salaire
	{
		try
		{
			ArrayList<Developpeur> list = new ArrayList<Developpeur>();
			Connection con = Connexion.connect();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select devloppeur.salaire , devloppeur.nom , COUNT(goublet.id) FROM devloppeur, goublet , equipe where devloppeur.id = goublet.id_dev and equipe.id = devloppeur.id_equipe GROUP BY devloppeur.id , equipe.types HAVING (count(goublet.id)<=7 and equipe.types='jour') or (COUNT(goublet.id)<=14 or equipe.types='nuit')");
			while(rs.next())
			{
				Developpeur d =new Developpeur();
				d.setSalaire(rs.getDouble(1));
				list.add(d);
			}
						  
			con.close();
			return list;
			
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			return null;
		}
	}
	
	public static double method6() //Retournez un utilisateur de l’équipe de nuit qui a dépassé le nombre de café offerts et calculez son nouveau salaire
	{
		//select devloppeur.salaire , devloppeur.nom , COUNT(goublet.id) as nb FROM devloppeur, goublet , equipe where devloppeur.id = goublet.id_dev and equipe.id = devloppeur.id_equipe and equipe.types = 'nuit' GROUP BY devloppeur.id HAVING (COUNT(goublet.id)>14)
		try
		{
			Developpeur d =new Developpeur();
			Connection con = Connexion.connect();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select devloppeur.salaire -(select sum(goublet.prix_unitaire) from goublet, devloppeur where goublet.id_dev =devloppeur.id)  FROM devloppeur, goublet , equipe where devloppeur.id = goublet.id_dev and equipe.id = devloppeur.id_equipe and equipe.types = 'nuit' GROUP BY devloppeur.id HAVING (COUNT(goublet.id)>14)");
			while(rs.next())
			{
				d.setSalaire(rs.getDouble(1));
			}
						  
			con.close();
			return d.getSalaire();
			
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			return -2;
		}
	}
	
	public static String method7()
	{
		//select DISTINCT goublet.type , COUNT(goublet.type) from goublet, devloppeur where devloppeur.id = goublet.id_dev GROUP by goublet.type HAVING count(goublet.type) ORDER By count(goublet.type) DESC LIMIT 1
		try
		{
			Goublet g = new Goublet();
			Connection con = Connexion.connect();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select DISTINCT goublet.type , COUNT(goublet.type) from goublet, devloppeur where devloppeur.id = goublet.id_dev GROUP by goublet.type HAVING count(goublet.type) ORDER By count(goublet.type) DESC LIMIT 1");
			while(rs.next())
			{
				g.setType(rs.getString(1));
			}
						  
			con.close();
			return g.getType();
			
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			return "Error";
		}
	}
	
	public static Developpeur method8() //Affichez le plus gros consommateur de café dans cette entreprise
	{
		try
		{
			Developpeur d =new Developpeur();
			Connection con = Connexion.connect();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select DISTINCT devloppeur.nom , devloppeur.prenom, COUNT(goublet.type) from goublet, devloppeur where devloppeur.id = goublet.id_dev GROUP by goublet.type HAVING count(devloppeur.id) ORDER By count(goublet.type) DESC LIMIT 1");  
			while(rs.next())  
			{
				d.setNom(rs.getString("nom"));
				d.setPrenom(rs.getString("prenom"));
			}
				  
			con.close();
			return d;
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			return null;
		}
	}
}
