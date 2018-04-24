package ex1;

public class Article 
{
	private double prixAchat;
	private double ventePrix;
	private String nom;
	private String fournissuer;
	
	public Article(double prixAchat , double ventePrix , String nom , String fournissuer )
	{
		this.prixAchat=prixAchat;
		this.ventePrix=ventePrix;
		this.nom=nom;
		this.fournissuer=fournissuer;
	}
	
	public double calculateurTaux()
	{
		if((this.prixAchat<=0) || (this.ventePrix<0))
		{
			System.out.println("Erreur 1 \n");
			return 0;
		}
		else
		{
			return (this.ventePrix-this.prixAchat)/this.prixAchat;
		}
	}

	public double getPrixAchat()
	{
		return this.prixAchat;
	}

	public void setPrixAchat(double prixAchat) 
	{
		this.prixAchat = prixAchat;
	}

	public double getVentePrix()
	{
		return this.ventePrix;
	}

	public void setVentePrix(double ventePrix)
	{
		this.ventePrix = ventePrix;
	}

	public String getNom()
	{
		return this.nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getFournissuer()
	{
		return this.fournissuer;
	}

	public void setFournissuer(String fournissuer)
	{
		this.fournissuer = fournissuer;
	}
	
	public String toString()
	{
		return "Les prix sont "+getVentePrix()+" et "+getPrixAchat()+" le fournisseur est "+getFournissuer()+" et le rendememnt est "+calculateurTaux();
	}
	
	public void description()
	{
		System.out.println(toString());
	}

}
