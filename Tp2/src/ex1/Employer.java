package ex1;

public class Employer 
{
	private static  String nom;
	private static  String garde;
	private static float salaire;
    	
	public static  void setNom(String n)
	{
		nom=n;
	}
	
	public static void setGarde(String g)
	{
		garde=g;
	}
	
	public static void setSalire(float s)
	{
		salaire=s;
	}
	
	public  static String getGarde()
	{
		return garde;
	}
	
	public  static float getSalaire()
	{
		return salaire;
	}
	
	public static String getNom()
	{
		return nom;
	}
	
	public String toString()
	{
		return "le nom est :"+getNom()+" garde est :"+getGarde()+" salaire est :"+getSalaire()+" ";
	}
	
	public static String getAll()
	{
		return "le nom est :"+getNom()+" garde est :"+getGarde()+" salaire est :"+getSalaire()+" ";
	}
	
	//question 3
	public Employer(String nom)
	{
		this.nom=nom;
	}

    //question 7
	public static  boolean comparer(Employer e)
	{
		return getAll().equals(e.toString());
	}
}
