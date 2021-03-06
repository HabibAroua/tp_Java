package ex2;

public class Personne 
{
	private String nom;
	private String prenom;
	private String etatCivil;
    private Personne mere;
    private Personne pere;
    private Personne conjoint;
    
    public Personne(String nom , String prenom , String etatCivil)
    {
    	this.nom=nom;
    	this.prenom=prenom;
    	this.etatCivil=etatCivil;
    }
    
    public void setPere(Personne pere)
    {
    	this.pere=pere;
    }
    
    public void setMere(Personne mere)
    {
    	this.mere=mere;
    }
    
    public String getNomPrenom()
    {
    	return this.nom+" "+this.prenom;
    }
    
    public Personne getPere()
    {
    	return this.pere;
    }
    
    public Personne getMere()
    {
    	return this.mere;
    }
    
    public void seMarier(Personne c)
    {
    	conjoint=c;
    	this.etatCivil="Mariee";
    }
    
    public void divorser()
    {
    	this.conjoint=null;
    	this.etatCivil="Divorceé";
    }
    
    public String toString()
    {
    	return "Le nom et prenom :"+getNomPrenom()+" etat civil :"+etatCivil+" ";
    }
}