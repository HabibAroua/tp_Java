package examen2017;

public class Article 
{
	private String reference;
    private int prix;
    private String fournisseur;
    private int qte_stock;

    public String getReference() 
    {
		return reference;
    }

    public int getPrix() 
    {
		return prix;
    }

    public Article(String reference, int prix, String fournisseur, int qte_stock) 
    {
		super();
	    this.reference = reference;
	    this.prix = prix;
	    this.fournisseur = fournisseur;
	    this.qte_stock = qte_stock;
    }

    public String getFournisseur()
    {
		return fournisseur;
    }

    public int getQte_stock()   
    {
		return qte_stock;
    }
////
    public boolean vendre(int nbr_unite)
    {
		if (nbr_unite<=qte_stock)
	    {
			qte_stock-= nbr_unite;
		    return true;
	    }
	    else
		{
			return false;
		}
    }
///
    public void approvisionner(int nbr_unite)
    {
		qte_stock+=nbr_unite;
    }

	public String toString() 
	{
		return "Article [reference=" + reference + ", prix=" + prix
			+ ", fournisseur=" + fournisseur + ", qte_stock=" + qte_stock + "]
	}
}
