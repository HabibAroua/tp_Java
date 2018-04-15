package Ex2Tp;

public class LettreRecommande extends Lettre
{
	private float montant;
	
	public LettreRecommande()
	{
		super();
	}
	
	public LettreRecommande(String adresseDestinatire, String adresseExpediteur, float poids, float affranchissement , float montant )
	{
		super(adresseDestinatire,adresseExpediteur,poids,affranchissement);
		this.montant=montant;
	}
	
	public void setMontant(float montant)
	{
		this.montant=montant;
	}
	
	public float getMontant()
	{
		return this.montant;
	}
	
	public String toString()
	{
		return super.toString()+" le montant est "+getMontant();
	}
}
