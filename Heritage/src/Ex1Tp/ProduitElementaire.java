package Ex1Tp;

public class ProduitElementaire extends Produit 
{
	private float prixAchat;
	
	public float getPrixAchat()
	{
		return this.prixAchat;
	}
	
	public ProduitElementaire(String nom , int code , float prix)
	{
		super(nom,code);
		prixAchat=prix;
	}
	
	public String toString()
	{
		return super.toString()+" le prix d'achat est "+getPrixAchat();
	}

}
