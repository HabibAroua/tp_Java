package Ex6;

public class Test 
{
	public static void main(String args[])
	{
		//Pour ajouter à une conference un article
		Conference conf=new Conference();
		Article article=new Article(1,"Sharlock homes");
		conf.ajouterArticle(article);
		//Pour creer un auteur
		Auteur auteur=new Auteur("Conan","Doyale","Narrateur");
		//Pour creer une salle
		Salle salle=new Salle();
		//Pour affecter un auteur à un article
		conf.getListArticle().get(0).affecterAuteur(auteur);
		//Pour affecter une salle à un article
		conf.getListArticle().get(0).affecterSalle(new Salle("Free life"));
		//Pour Afficher les nom de toutes les salles
		conf.getListArticle().get(0).afficherNomSalle();
		//Pour afficher les titres de tous les article presentés dans une salle
		System.out.print(conf.getListArticle().get(0).toString());
		//Think of the solution
		
		//supprimer un article
		conf.SuprimerArticle("Sharlock homes");
		
		
	}


}
