package ecemple;

public class Etudiant extends Personne
{
	private int numIns;
	private double moy;
	
	public Etudiant(String cin ,String nom , String prenom ,int age , int numIns , double moy)
	{
		super(cin,nom, prenom,age);
		this.numIns=numIns;
		this.moy=moy;
	}
	
	public int getNumIns()
	{
		return this.numIns;
	}
	
	public void setNumIns(int numIns)
	{
		this.numIns=numIns;
	}
	
	public double getMoy()
	{
		return this.moy;
	}
	
	public void setMoy(double moy)
	{
		this.moy=moy;
	}
	
	public String toString()
	{
		return super.toString()+" le numéro d'insccription  est "+getNumIns()+" la moyenne est "+getMoy();
	}

}
