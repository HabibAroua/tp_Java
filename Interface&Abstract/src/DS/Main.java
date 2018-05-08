package DS;

public class Main {

	public static void main(String[] args) 
	{
		Bibliotheque b =new Bibliotheque();
		b.ajouterOuvrage(new Ouvrage("str",1));
		b.ajouterOuvrage(new Ouvrage("strdqdq",2));
		b.ajouterOuvrage(new Ouvrage("strdqd",3));
		b.chercherOuvrage();
		
		Adherent a =new Adherent("Habib","Aroua");
		a.emprunter(new Livre("Holmes",14,"Conan doyle"));
		a.afficherLivres();
		//a.rendre(new Livre("Holmes",14,"Conan doyle"));
		//a.afficherLivres();
	}

}
