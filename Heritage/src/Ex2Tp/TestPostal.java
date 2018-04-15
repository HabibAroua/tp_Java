package Ex2Tp;

public class TestPostal 
{
	public static void main(String[] args) 
	{
		SacPostal s=new SacPostal();
		LettreRecommande l1=new LettreRecommande("Tunis","Sousse",500,3,5);
		LettreRecommandeAccuse l2=new LettreRecommandeAccuse("Nabeul","Sfax",600,7,"Tunis",10);
		l1.setMontant(30);
		l2.setMontantRelative(66);
		s.ajouterLettre(l1);
		s.ajouterLettre(l2);
		s.afficheCaractéristiqueSac();

	}

}
