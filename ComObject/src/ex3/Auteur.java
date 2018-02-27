package ex3;

public class Auteur 
{
	private String nom;
	private String adresse;
	private Livre[] Livres;
    private static int nbLivres;
    
    public Auteur()
    {
    	
    }
    
    public Auteur(String nom , String adresse)
    {
    	this.nom=nom;
    	this.adresse=adresse;
    }
    
	public String getAdresse()
	{
		return adresse;
	}
	
	public void setAdresse(String adresse)
	{
		this.adresse = adresse;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public Livre[] getLivres()
	{
		return Livres;
	}
	
	public static int getNbLivres() 
	{
		return nbLivres;
	}
    
	public void nouveauLivre(Livre l)
	{
		Livres[nbLivres++]=l;
	}
}
