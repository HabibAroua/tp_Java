package ex1;

public class Primeurs extends Article implements VenableKilogramme , VenablePiece , VenduSolde
{

	private double stock;
	public Primeurs(double prixAchat, double ventePrix, String nom, String fournissuer , double stock) 
	{
		super(prixAchat, ventePrix, nom, fournissuer);
		this.stock=stock;
	}
	
	public double getStock()
	{
		return this.stock;
	}
	
	public void setStock(double stock)
	{
		this.stock=stock;
	}

	@Override
	public void lancerSolde(double prix)
	{
		setPrixAchat(getPrixAchat()-prix);
	}

	@Override
	public void terminerSolde(double prix)
	{
		setPrixAchat(getPrixAchat()+prix);
	}

	@Override
	public double vendre(double quantite)
	{
		return this.stock-quantite;
	}
	
}
