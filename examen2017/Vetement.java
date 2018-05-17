package examen2017;

public class Vetement extends Article{
	private int taille;
	
	private static String [] categorie = {"homme","femme"};

	public int getTaille() {
		return taille;
	}

	public static String[] getCategorie() {
		return categorie;
	}

	
	public Vetement(String reference, int prix, String fournisseur,
			int qte_stock, int taille) {
		super(reference, prix, fournisseur, qte_stock);
		this.taille = taille;
	}

	public String toString() {
		return super.toString()+"[taille=" + taille + "]";
	}

	

}
