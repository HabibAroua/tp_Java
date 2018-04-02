package Ex1;

public class Etudiant extends Personne
{
	private int matricule;
	
	public Etudiant(int matricule , String nom , String prenom)
	{
		super(nom,prenom);
		this.matricule=matricule;
	}
	
	public int getMatricule()
	{
		return this.matricule;
	}
	
	public String toString()
	{
		return super.toString()+" Le matricule est "+getMatricule();
	}

}
