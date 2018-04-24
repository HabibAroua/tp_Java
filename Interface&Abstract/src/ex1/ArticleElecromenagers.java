package ex1;

public class ArticleElecromenagers extends Article implements VenableKilogramme , VenablePiece , VenduSolde 
{
    private int nbrPiece;
    
	public ArticleElecromenagers(double prixAchat , double ventePrix , String nom , String fournissuer , int nbrPiece)
	{
		super(prixAchat, ventePrix, nom, fournissuer);
		this.nbrPiece=nbrPiece;
	}
	
	public int getNbrPiece()
	{
		return this.nbrPiece;
	}
	
	public void remplir(int e)
	{
		this.nbrPiece+=e;
	}
	
	public String toString()
	{
		return super.toString()+" le stock est "+this.nbrPiece;
	}
	
	public void description()
	{
		System.out.println(toString());
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
		return this.nbrPiece-quantite;
	}
	
}
