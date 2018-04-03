package Ex2;

public class TestSeminaire 
{
	public static void main(String args[])
	{
		Seminaire s=new Seminaire("Gcc","printemps","Seoul");
		//Décalrer deux particpants
		Universitaire u=new  Universitaire("Habib","Aroua","aff","GL");
		Industriel in=new Industriel("Bruno","cesaro","aff","ingenieur");
		//inscrire les deux particpants
		s.inscrire(u);
		s.inscrire(in);
		//afficher particpant
		s.afficher();
		//La recette de seminaire 
		System.out.println("______________________________");
		s.recette(30,50);
	}
}
