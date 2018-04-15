package Ex2Tp;

public class LettreRecommandeAccuse extends Lettre
{
	private String adresseRetour;
	private float montantRelative;
	
	public LettreRecommandeAccuse()
	{
		super();
	}
	
	public LettreRecommandeAccuse(String adresseDestinatire, String adresseExpediteur, float poids, float affranchissement , String adresseRetour , float montantRelative)
	{
		super(adresseDestinatire,adresseExpediteur,poids,affranchissement);
		this.adresseRetour=adresseRetour;
		this.montantRelative=montantRelative;
	}
	
	public String getAdresseRetour()
	{
		return this.adresseRetour;
	}
	
	public void setAdresseRetour(String adresseRetour)
	{
		this.adresseRetour=adresseRetour;
	}
	
	public float getMontantRelative()
	{
		return this.montantRelative;
	}
	
	public void setMontantRelative(float montantRelative)
	{
		this.montantRelative=montantRelative;
	}
	
	public String toString()
	{
		return super.toString()+" le montant est "+getMontantRelative()+" l'adresse de retour est "+getAdresseRetour();
	}
	
}
