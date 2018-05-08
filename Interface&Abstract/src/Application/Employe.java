package Application;

import java.util.Date;

public abstract class Employe implements IEmploye
{
	protected static int matricule=0;
	protected String nom;
	protected int dateNaissance;
	protected int dateEmbauche;
	protected float salaireBase;
	
	public int getDateNaissance()
	{
		return this.dateNaissance;
	}
	
	public int getDateEmbauche() 
	{
		return this.dateEmbauche;
	}
	
	public Employe()
	{
		matricule++;
	}
	
	public Employe(String nom , int dateNaissance , int dateEmbauche , float salaireBase)
	{
		matricule++;
		this.nom=nom;
		this.dateNaissance=dateNaissance;
		this.dateEmbauche=dateEmbauche;
		this.salaireBase=salaireBase;
	}
	
	public abstract float SalaireAPayer();
	
	@SuppressWarnings("deprecation")
	public int Age()
	{
		Date d=new Date();
		return d.getYear()-this.dateNaissance;
	}
	public int Anciennete()
	{
		return 60-this.dateEmbauche;
	}
	public int DateRetraire()
	{
		return this.dateNaissance+60;
	}
}
