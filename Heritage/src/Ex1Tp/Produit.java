package Ex1Tp;

public class Produit 
{
	private String nom;
	private int code;
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getCode()
	{
		return this.code;
	}
	
	public Produit(String nom , int code)
	{
		this.nom=nom;
		this.code=code;
	}
	
	public String toString()
	{
		return "Le nom est "+getNom()+" le code est "+getCode();
	}
	//jjjjj
}
