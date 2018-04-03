package Ex1Tp;

public class ProduitCompose extends Produit 
{
	private float fraisFab;
	private float tauxTVA;
	private Composition tabComposition[];
	private static int nb=0;
	public void setFraisFab(float fraisFab)
	{
		this.fraisFab=fraisFab;
	}
	
	public void setTauxTVA(float tauxTVA)
	{
		this.tauxTVA=tauxTVA;
	}
	
	public float getPrixHT()
	{
		float prix=0;
	    for(int i=0 ;i<nb ; i++)
	    {
	    	if(tabComposition[i].getProduit() instanceof ProduitElementaire )
	    	{
	    		prix+=((ProduitElementaire)tabComposition[i].getProduit()).getPrixAchat();
	    	}
	    }
		return prix;
	}
	
	
	//Constructeur
	
	public ProduitCompose(String nom , int code , float fraisFab , float tauxTVA)
	{
		super(nom,code);
		this.fraisFab=fraisFab;
		this.tauxTVA=tauxTVA;
	}
}
