package Ex1;

public class Enseignant extends Personne
{
	private String grade;
	
	public Enseignant(String grade , String nom , String prenom)
	{
		super(nom, prenom);
		this.grade=grade;
	}
	
	public String getGrade()
	{
		return this.grade;
	}
	
	public String toString()
	{
		return super.toString()+" le grade est "+getGrade();
	}
	

}
