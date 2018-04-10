package Ex1Tp;

public class Composition
{
	private Produit p;
	private int quantite;
	
	public Produit getProduit()
	{
		return this.p;
	}
	
	public int getQuantite()
	{
		return this.quantite;
	}
	
	public Composition(Produit p , int quantite)
	{
		this.p=p;
		this.quantite=quantite;
	}	
}