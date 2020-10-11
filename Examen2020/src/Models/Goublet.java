package Models;

public class Goublet 
{
	
	private String boisson;
	private String type;
	private double prix_unitaire;
	private int semaine;
	
	public Goublet()
	{
		
	}

	public Goublet(String boisson, String type, double prix_unitaire, int semaine) 
	{
		super();
		this.boisson = boisson;
		this.type = type;
		this.prix_unitaire = prix_unitaire;
		this.semaine = semaine;
	}

	public String getType() 
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public double getPrix_unitaire() 
	{
		return prix_unitaire;
	}
	
	public void setPrix_unitaire(double prix_unitaire) 
	{
		this.prix_unitaire = prix_unitaire;
	}
	
	public Goublet(String type, double prix_unitaire)
	{
		super();
		this.type = type;
		this.prix_unitaire = prix_unitaire;
	}
	
	public String getBoisson() 
	{
		return boisson;
	}

	public void setBoisson(String boisson) 
	{
		this.boisson = boisson;
	}
	
	public int getSemaine() 
	{
		return semaine;
	}

	public void setSemaine(int semaine) 
	{
		this.semaine = semaine;
	}
	
	@Override
	public String toString() 
	{
		return "Goublet [boisson=" + boisson + ", type=" + type + ", prix_unitaire=" + prix_unitaire + "]";
	}
	
}
