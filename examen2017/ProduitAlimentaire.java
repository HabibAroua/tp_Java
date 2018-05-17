package examen2017;

public class ProduitAlimentaire extends Article{
private int date_exp;

	
	
	public int getDate_exp() {
		return date_exp;
	}



	public ProduitAlimentaire(String reference, int prix, String fournisseur,
			int qte_stock, int date_exp) {
		super(reference, prix, fournisseur, qte_stock);
		this.date_exp = date_exp;
	}




	public String toString() {
		return super.toString()+" [date_exp=" + date_exp + "]";
	}
	
	
	
}
