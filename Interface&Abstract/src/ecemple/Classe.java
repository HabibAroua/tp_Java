package ecemple;

import java.util.ArrayList;
public class Classe implements Calcul
{
	private int num;
	ArrayList<Etudiant> list;
	
	public Classe(int num)
	{
		this.num=num;
		list=new ArrayList<Etudiant>();
	}
	
	public int getNum()
	{
		return this.num;
	}
	
	public void setNum(int num)
	{
		this.num=num;
	}
	
	public double getMoy()
	{
		double sum=0;
		for(int i=0 ; i<list.size() ; i++)
		{
			sum+=list.get(i).getMoy();
		}
		return sum/(list.size()-1);
	}
	
	public void addEtudiant(Etudiant e)
	{
		list.add(e);
	}
	
	public void deleteEtudiant(Etudiant e )
	{
		int index=0;
		for(int i=0 ; i<list.size() ; i++)
		{
			if(list.get(i)==e)
			{
				index =i;
				break;
			}
			else
			{
				index=-1;
			}
		}
		if(index==-1)
		{
			System.out.println("Etudiant n'existe pas");
		}
		else
		{
			list.remove(index);
		}
	}
	
	public void afficher()
	{
		String ch="";
		for(int i=0 ; i<list.size() ; i++)
		{
			ch=ch+list.get(i)+" \n";
		}
		System.out.println(ch);
	}
}
