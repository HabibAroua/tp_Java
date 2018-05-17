package examen2017;

public class Magasin { 
	static Article [] stock  = new Article [100];
    
     
   public  static int calculArticle(){
	    int nbr_article = 0;
     for (int i =0; i<stock.length ; i++)
	 { if (stock[i]!=null) {nbr_article++ ;}
	 else break;}
     return nbr_article; }
     ///
	public static void approvisionner(Article ar) {
		int nb=calculArticle();
		if(nb<100)
		 stock[nb]=ar;}
	 ///////
	
	public static String afficherTout() {
		int nbr= calculArticle();
String s=" ";
		for (int i=0; i<nbr; i++) {
			 s+= stock[i].toString();}
		return s;
}


	public static void main (String [] args){
		Article v = new Vetement( "Vetement" ,400,"four1",10,36) ;
		Article a = new ProduitAlimentaire("produitALimentaite",200,"four",5,2019);
		
		approvisionner(v);
		approvisionner(a);
	System.out.println(afficherTout());
	
	 VetementRecyclable vet =  new VetementRecyclable( "Vetement" ,400,"four1",10,36);
	
	 // les meme caractéritiques de v sauf le prix est divisé sur 2 
System.out.println( vet.Recycler());
	
	
		}

}
