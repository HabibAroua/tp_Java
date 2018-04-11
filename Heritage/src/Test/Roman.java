package Test;

public class Roman extends Livre
{
	private float prixLitt;
	
	public Roman(int numEnreg , String titre , String auteur , int nbrPages , float prixLitt)
	{
		super(numEnreg , titre , auteur , nbrPages );
		this.prixLitt=prixLitt;
	}

	public float getPrixLitt() 
	{
		return this.prixLitt;
	}

	public void setPrixLitt(float prixLitt)
	{
		this.prixLitt = prixLitt;
	}
	
	public String toString()
	{
		return super.toString()+" le prix est "+getPrixLitt();
	}
	

}
