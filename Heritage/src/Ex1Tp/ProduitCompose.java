package Ex1Tp;

public class ProduitCompose extends Produit 
{
	private float fraisFab;
	private static float tauxTVA=0.18F;
	private Composition tabComposition[];
	private static int nb=0;
	
	public void setFraisFab(float fraisFab)
	{
		this.fraisFab=fraisFab;
	}
	
	public void setTauxTVA(float tauxTVA)
	{
		ProduitCompose.tauxTVA=tauxTVA;
	}
	
	public float getTauxTVA()
	{
		return this.tauxTVA;
	}
	
	public float getPrixHT()
	{
		float prix=0.0F;
	    for(int i=0 ;i<nb ; i++)
	    {
	    	if(tabComposition[i].getProduit() instanceof ProduitElementaire )
	    	{
	    		prix+=((ProduitElementaire)tabComposition[i].getProduit()).getPrixAchat()*tabComposition[i].getQuantite();
	    	}
	    	else
	    	{
	    		if(tabComposition[i].getProduit() instanceof ProduitCompose)
	    		{
	    			prix+=((ProduitCompose)tabComposition[i].getProduit()).getPrixHT()*tabComposition[i].getQuantite();
	    		}
	    	}
	    }
		return prix+fraisFab;
	}
	
	//Constructeur
	public ProduitCompose(String nom , int code , float fraisFab , float tauxTVA)
	{
		super(nom,code);
		this.fraisFab=fraisFab;
		ProduitCompose.tauxTVA=tauxTVA;
	}
	
	public void afficherPrix()
	{
		
	}
}