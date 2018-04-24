package ex1;

public class Magasin 
{
	private double depense;
	private double revenu;
	private Article a1[];
	private Article a2[];
	private int nbr1=0;
	private int nbr2=0;
	public Magasin(double depense , double revenu  )
	{
		this.depense=depense;
		this.revenu=revenu;
		a1=new ArticleElecromenagers[10];
		a2=new Primeurs[10];
	}

	public double getDepense() 
	{
		return this.depense;
	}

	public void setDepense(double depense)
	{
		this.depense = depense;
	}

	public double getRevenu() 
	{
		return this.revenu;
	}

	public void setRevenu(double revenu)
	{
		this.revenu = revenu;
	}
	
	public void addElement1(ArticleElecromenagers e)
	{
		this.a1[nbr1]=e;
		nbr1++;
	}
	
	public void addElemente(Primeurs e)
	{
		this.a2[nbr2]=e;
		nbr2++;
	}
	
	public String allPrimeurs()
	{
		String ch="";
		for(int i=0 ; i<nbr1 ; i++)
		{
			ch=ch+" "+a1[i].toString();
		}
		return ch;
	}
	
	public String allArticleElec()
	{
		String ch="";
		for(int i=0 ; i<nbr2 ; i++)
		{
			ch=ch+" "+a2[i].toString();
		}
		return ch;
	}
	
	public String toString()
	{
		return "depence est "+getDepense()+" le revenu est "+getRevenu()+" les articles sont "+allPrimeurs()+" "+allArticleElec()+" \n";
	}
	
	public void description()
	{
		System.out.println(toString());
	}
	
	public double tauxCalc()
	{
		if((getDepense()<=0)||(getRevenu()<0))
		{
			System.out.println("Erreur \n");
			return 0;
		}
		else
		{
			return (getRevenu()-getDepense())/getDepense();
		}
	}
	
}
