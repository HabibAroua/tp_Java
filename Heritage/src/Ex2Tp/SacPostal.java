package Ex2Tp;

public class SacPostal 
{
	private final int NB_MAX=100;
	private Lettre[] Sac;
	private int nbSac;
	
	public SacPostal()
	{
		Sac=new Lettre[NB_MAX];
		this.nbSac=0;
	}
	
	private float convertGrammeToKilo(float p)
	{
		return p*0.001F;
	}
	
	private float poidsActuel()
	{
		float p=0;
		for(int i=0 ; i<nbSac ;i++)
		{
			p+=Sac[i].getPoids();
		}
		return convertGrammeToKilo(p);
	}
	
	public void ajouterLettre(Lettre l)
	{
		if(poidsActuel()+convertGrammeToKilo(l.getPoids())>5)
		{
			System.out.println("On ne peut pas ajouter une lettre dans la sac ");
		}
		else
		{
			Sac[nbSac]=l;
			nbSac++;
			System.out.println("L'ajout d'une lettre est effectué avec succes ");
		}
	}
	
	public float getAllAffranchissement()
	{
		float aff=0;
		for(int i=0 ; i<nbSac ; i++)
		{
			aff+=Sac[i].getAffranchissement();
		}
		return aff;
	}
	
	public void afficheCaractéristiqueSac()
	{
		System.out.println("Les caractéristique des lettres dans cette sac :");
		for(int i=0 ; i<nbSac ; i++)
		{
			System.out.println(Sac[i].toString());
		}
	}

}
