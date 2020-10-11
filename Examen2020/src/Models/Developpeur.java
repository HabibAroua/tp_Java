package Models;

import java.util.ArrayList;

public class Developpeur 
{
	private String nom;
	private String prenom;
	private String bureau;
	private double salaire;
	private ArrayList <Goublet> listCafe = new ArrayList<Goublet>();
	
	public Developpeur(){}
	
	public Developpeur(String nom, String prenom, String bureau,double salaire)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.bureau = bureau;
		this.salaire = salaire;
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getPrenom() 
	{
		return prenom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
	public String getBureau() 
	{
		return bureau;
	}
	
	public void setBureau(String bureau) 
	{
		this.bureau = bureau;
	}
	
	public double getSalaire() 
	{
		return salaire;
	}
	
	public void setSalaire(double salaire) 
	{
		this.salaire = salaire;
	}

	@Override
	public String toString() 
	{
		return "Developpeur [nom=" + nom + ", prenom=" + prenom + ", bureau=" + bureau + ", salaire=" + salaire + "]";
	}
}
