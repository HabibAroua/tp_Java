package Ex6;

public class Test 
{
	public static void main(String args[])
	{
		//Pour ajouter à une conference un article
		Conference conf=new Conference();
		Article article=new Article(1,"Sharlock homes");
		conf.ajouterArticle(article);
		//Pour creer un article
		Auteur auteur=new Auteur("Conan","Doyale","Narrateur");
		//Pour creer une salle
		Salle salle=new Salle();
		//Pour affecter un auteur à un article
		article.affecterAuteur(auteur);
		//Pour affecter une salle à un article
		article.affecterSalle(new Salle("Free life"));
		//Pour Afficher les nom de toutes les salles
		article.afficherNomSalle();
		//Pour afficher les titres de tous les article presentés dans une salle
		
		
	}


}
