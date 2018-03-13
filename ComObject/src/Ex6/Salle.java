package Ex6;

import java.util.ArrayList;

public class Salle 
{
	private String nom;
	private int capacite;
	
	public Salle()
	{
	}
	
	public Salle(String nom , int capacite)
	{
		this.nom=nom;
		this.capacite=capacite;
	}
	
	public Salle(String nom)
	{
		this.nom=nom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getCapacite()
	{
		return this.capacite;
	}
	
	public String toString()
	{
		return "Le nom de salle est "+getNom()+" la capacité est "+getCapacite();
	}
    

}
