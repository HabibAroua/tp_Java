package Ex1;

public class Compte_Bancaire 
{
	private int num;
	private float solde ;
	private String nom;
	
	public void Crediter(float val)
	{
		this.solde+=val;
	}
	
	public void Debiter(float val)
	{
		this.solde-=val;
	}
	
	public float getSolde()
	{
		return this.solde;
	}
	
	public Compte_Bancaire(int num , float solde , String nom)
	{
		this.num=num;
		this.solde=solde;
		this.nom=nom;
	}
	
}
