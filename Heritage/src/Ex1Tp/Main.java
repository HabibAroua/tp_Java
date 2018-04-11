package Ex1Tp;

public class Main 
{

	public static void main(String[] args)
	{
		Produit[] p=new Produit[4];
		p[0]=new ProduitElementaire("p1",1,100);
        p[1]=new ProduitElementaire("p2",2,200);
        Composition []c1=new Composition[1];
        c1[0]=new Composition(p[0],2);
        p[2]=new ProduitCompose("pc",11,5, c1);
        Composition []c2=new Composition[2];
        c2[0]=new Composition(p[1],3);
        c2[1]=new Composition(p[2],2);
        //Affichage
	}
}