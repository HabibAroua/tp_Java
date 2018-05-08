package ecemple;

public class Main 
{
	public static void main(String[] args) 
	{
		Personne p1=new Etudiant("123","Habib","Aroua",23,1547,15);
		Personne p2=new Etudiant("124","xx","Aroua",23,1547,2);
		Personne p3=new Etudiant("125","yy","Aroua",23,1547,3);
		Personne p4=new Etudiant("126","zz","Aroua",23,1547,19);
		Classe c1=new Classe(1);
		c1.addEtudiant((Etudiant) p1);
		c1.addEtudiant((Etudiant) p2);
		c1.addEtudiant((Etudiant) p3);
		c1.addEtudiant((Etudiant) p4);
		c1.afficher();
		
		System.out.println("La moyanne de classe est "+c1.getMoy());
		
		c1.deleteEtudiant((Etudiant)p2);
		c1.afficher();
	}
}
