package Ex2Tp;

public class Lettre 
{
	private String adresseDestinatire;
	private String adresseExpediteur;
	private float poids;
	private float affranchissement;
	
	public Lettre()
	{
	}

	public Lettre(String adresseDestinatire, String adresseExpediteur, float poids, float affranchissement) 
	{
		this.adresseDestinatire = adresseDestinatire;
		this.adresseExpediteur = adresseExpediteur;
		this.poids = poids;
		this.affranchissement = affranchissement;
	}

	public String getAdresseDestinatire() 
	{
		return this.adresseDestinatire;
	}

	public void setAdresseDestinatire(String adresseDestinatire)
	{
		this.adresseDestinatire = adresseDestinatire;
	}

	public String getAdresseExpediteur() 
	{
		return this.adresseExpediteur;
	}

	public void setAdresseExpediteur(String adresseExpediteur)
	{
		this.adresseExpediteur = adresseExpediteur;
	}

	public float getPoids() 
	{
		return this.poids;
	}

	public void setPoids(float poids)
	{
		this.poids = poids;
	}

	public float getAffranchissement() 
	{
		this.affranchissement=calculAffranchissement();
		return this.affranchissement;
	}

	public void setAffranchissement(float affranchissement)
	{
		this.affranchissement = affranchissement;
	}
	
	private float calculAffranchissement()
	{
		float aff=0;
		if(getPoids()<=50)
		{
			aff= getPoids()*0.250F;
		}
		else
		{
			if(getPoids()>50)
			{
				aff=getPoids()*0.500F;
			}
			else
			{
				if(getPoids()<=100)
				{
					aff=getPoids();
				}
			}
		}
		return aff;
	}
	
	public String toString()
	{
		return "adresse destinatire est "+getAdresseDestinatire()+" adresse expéditeur est "+getAdresseExpediteur()+" le poids en gamme "+getPoids()+" l'affranchissement est "+getAffranchissement();
	}
}
