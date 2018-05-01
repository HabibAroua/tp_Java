package ex2;

public class Employee 
{
	private String nom;
	private String prenom;
	private int age;
	private String dateEntree;
	
	public Employee(String nom , String prenom , int age , String dateEntree)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.dateEntree=dateEntree;
	}

	public String getNom()
	{
		return this.nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getPrenom() 
	{
		return this.prenom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getDateEntree() 
	{
		return this.dateEntree;
	}

	public void setDateEntree(String dateEntree) 
	{
		this.dateEntree = dateEntree;
	}
	
}
