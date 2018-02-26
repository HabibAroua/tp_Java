package ex2;

public class Personne 
{
	private String nom;
	private String prenom;
	private String etatCivil;
    private Mere mere;
    private Pere pere;
    private Conjoint conjoint;
    
    public Personne(String nom , String prenom , String etatCivil , Mere mere , Pere pere )
    {
    	this.nom=nom;
    	this.prenom=prenom;
    	this.etatCivil=etatCivil;
    	this.mere=mere;
    	this.pere=pere;
    }
    
    public void setPere(Pere pere)
    {
    	this.pere=pere;
    }
    
    public void setMere(Mere mere)
    {
    	this.mere=mere;
    }
    
    public String getNomPrenom()
    {
    	return this.nom+" "+this.prenom;
    }
    
    public Pere getPere()
    {
    	return this.pere;
    }
    
    public Mere getMere()
    {
    	return this.mere;
    }
    
    public void seMarier(Conjoint c)
    {
    	conjoint=c;
    }
    
    public void divorser()
    {
    	this.conjoint=null;
    }
    
    public String toString()
    {
    	return "Le nom et prenom :"+getNomPrenom()+" etat civil "+etatCivil+" ";
    }
}
