package Ex6;

import java.util.ArrayList;
public class Conference 
{
	private ArrayList<Article>listArticle;
	
	public Conference()
	{
		listArticle=new ArrayList<Article>();
	}
	
	public void ajouterArticle(Article a)
	{
		listArticle.add(a);
	}
	
	public ArrayList<Article> getListArticle()
	{
		return listArticle;
	}
	
}
