package ex3;

public class Test 
{
	public static void afficher()
	{
		
	}
	
	public static void main(String[] args)
	{
		Auteur a1=new Auteur("Conan Doyale","Piker street");
		Auteur a2=new Auteur("Shikisspeer","London");
		Auteur a3=new Auteur("Najib mahfoudh","Ciaro");
		Auteur a4=new Auteur("Sharlo lapain","Paris");
		
		
		
		Editeur e1=new Editeur("Name1","Paris");
		Editeur e2=new Editeur("Name2","London");
		
		Livre l1=new Livre("Sharlock holmes",1855,19900,e1);
		Livre l2=new Livre("Sharlock holmes1",1888,19850);
		Livre l3=new Livre("Alf laykla w mayla",1920,1966);
		
	}

}
