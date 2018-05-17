package examen2017;

public class VetementRecyclable  extends Vetement implements Recyclable{

	
	
	


	public  Article Recycler() {
Vetement v = new Vetement (this.getReference(),this.getPrix()/2,this.getFournisseur(),this.getQte_stock(),this.getTaille());
return v;
	}

	public VetementRecyclable(String reference, int prix, String fournisseur,
			int qte_stock, int taille) {
		super(reference, prix, fournisseur, qte_stock, taille);
		// TODO Auto-generated constructor stub
	}



}
