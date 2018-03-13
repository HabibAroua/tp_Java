package Ex5;

import java.util.ArrayList;

public class Repertoire 
{
	private ArrayList<Contact> list;
	
	public Repertoire()
	{
		list=new ArrayList<Contact>();
	}
	
   public void ajouterContact(Contact c)
   {
	   list.add(c);
   }
   
   public void AjouterAll(Contact[] T)
   {
	   for(int i=0 ; i<T.length ; i++)
	   {
		   list.add(T[i]);
	   }
   }
   
   public void Afficher()
   {
	   for(int i=0 ; i<list.size() ; i++)
	   {
		   System.out.println(list.get(i));
	   }
   }
   
   public int chercherContact(String nom)
   {
	   int num=0;
	   for(int i=0 ; i<list.size() ; i++)
	   {
		   if(list.get(i).getNom().equals(nom))
		   {
			   num=(int)list.get(i).getNum();
			   break;
		   }
	   }
	   return num;
   }
   
}