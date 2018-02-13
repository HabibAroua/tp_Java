package Ex1;

public class TestCompte
{
	public static void main(String[] args) 
	{
		Compte_Bancaire c=new Compte_Bancaire(1,500,"My acount");
		c.Crediter(60);
		System.out.println("Le solde est "+c.getSolde());
		c.Debiter(10);
		System.out.println("Le solde est "+c.getSolde());

	}

}