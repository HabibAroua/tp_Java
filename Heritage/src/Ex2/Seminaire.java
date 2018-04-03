package Ex2;

public class Seminaire 
{
	private String initule;
	private String periode;
	private String lieu;
	private Participant[] list;
	private static int nb=0;
	
	public Seminaire(String initule , String periode , String lieu)
	{
		this.initule=initule;
		this.periode=periode;
		this.lieu=lieu;
		list=new Participant[99];
	}

	public String getInitule() 
	{
		return this.initule;
	}

	public String getPeriode()
	{
		return this.periode;
	}

	public String getLieu()
	{
		return this.lieu;
	}
	
	public void inscrire(Participant p)
	{
	     if(nb==99)
	     {
	    	 System.out.println("Le nombre des participants ne dépasse pas 100 personne !!");
	     }
	     else
	     {
	    	 list[nb++]=p;
	     }
	}
	public void recette(int montantU , int montantF)
	{
		int montant=0;
		for(int i=0 ; i<nb ;i++)
		{
			if(list[i] instanceof Universitaire)
			{
				montant+=montantU;
			}
			else
			{
				montant+=montantF;
			}
		}
		System.out.println("Le montant de la recette est "+montant+"$");
	}
	
	public void afficher()
	{
		System.out.println("Les caractersitique de ce séminiare ");
		System.out.println(toString());
		System.out.println("La liste des participants ");
		for(int i=0 ; i<nb ; i++)
		{
			System.out.println(list[i].toString());
		}
	}

	@Override
	public String toString()
	{
		return "Seminaire [initule=" + initule + ", periode=" + periode + ", lieu=" + lieu + "]";
	}
}
