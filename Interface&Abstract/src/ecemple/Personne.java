package ecemple;

public class Personne 
{
	private String cin;
	private String nom;
	private String prenom;
	private int age;
	
	protected Personne(String cin , String nom , String prenom , int age)
	{
		this.cin=cin;
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	
	protected String getCin()
	{
		return this.cin;
	}
	
	protected String getNom()
	{
		return this.nom;
	}
	
	protected String getPrenom()
	{
		return this.prenom;
	}
	
	protected int getAge()
	{
		return this.age;
	}
	
	protected void setCin(String cin)
	{
		this.cin=cin;
	}
	
	protected void setNom(String nom)
	{
		this.nom=nom;
	}
	
	protected void setPrenom(String prenom)
	{
		this.prenom=prenom;
	}
	
	protected void setAge(int age)
	{
		this.age=age;
	}
	
	public  String toString()
	{
		return "Le cin est "+getCin()+" le nom est "+getNom()+" le prenom "+getPrenom()+" l'age est "+getAge();
	}
	
	protected void affichage()
	{
		System.out.println(toString());
	}
	
}
