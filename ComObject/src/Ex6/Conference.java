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
	
	public void SuprimerArticle(String titre)
	{
		int indice=-1;
		for(int i=0 ; i<listArticle.size() ; i++)
		{
			if(listArticle.get(i).getTitre().equals(titre))
			{
				indice=i;
				break;
			}
		}
		if(indice>-1)
		{
			listArticle.remove(indice);
		}
		else
		{
			System.out.println("Erreur au niveau de la suppression");
		}
	}
	
}
