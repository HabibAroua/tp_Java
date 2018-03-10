package ex3;

public class Editeur 
{
	private String nom;
	private String adresse;
	private Livre[]livres;
	private int nbLivre;
	
	public Editeur()
	{
		
	}
	
	public Editeur(String nom , String adresse)
	{
		this.nom=nom;
		this.adresse=adresse;
		nbLivre=0;
		livres=new Livre[0];
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public String getAdresse()
	{
		return adresse;
	}
	
	public void setAdresse(String adresse) 
	{
		this.adresse = adresse;
	}
	
	
	public  int getNbLivre()
	{
		return nbLivre;
	}
	public String getLivre()
	{
		String ch="";
		for (int i=0 ; i<getNbLivre() ; i++)
		{
			ch=livres[i].toString()+" ";
		}
		return ch;
	}
	
	public void nouveauLivre(Livre l)
	{
		nbLivre++;
		Livre[]t=new Livre[nbLivre];
		for(int i=0 ; i<nbLivre-1 ; i++)
		{
			t[i]=livres[i];
		}
		t[nbLivre-1]=l;
		livres=t;
	}
}