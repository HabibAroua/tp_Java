package ex2;

abstract class Employe 
{
    private String nom;
    private String prenom;
    private int age;
    private String date;
    
    
    public Employe(String prenom, String nom, int age, String date) 
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }

    public abstract double calculerSalaire();

    public String getTitre()
    {
    	return "L'employé :" ;
    }
    
    public String getNom() 
    {
    	return getTitre() + prenom + " " + nom;
    }
    
    public int getAge()
    {
    	return this.age;
    }
    
    public void setAge(int age)
    {
    	this.age=age;
    }
    
    public String getDate()
    {
    	return this.date;
    }
    
    public void setDate(String date)
    {
    	this.date=date;
    }
    
}

abstract class Commercial extends Employe 
{
    private double chiffreAffaire;

    public Commercial(String prenom, String nom, int age, String date, double chiffreAffaire)
    {
    	super(prenom, nom, age, date);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire()
    {
    	return chiffreAffaire;
    }
    
}

class Vendeur extends Commercial
{
    
    public Vendeur(String prenom, String nom , int age , String date , double chiffreAffaire) 
    {
        super(prenom, nom, age, date, chiffreAffaire);
    }

    public double calculerSalaire()
    {
        return (0.2 * getChiffreAffaire()) + 400;
    }

    public String getTitre()
    {
    	return "Le vendeur ";
    }

}

class Representant extends Commercial
{
    
    public Representant(String prenom, String nom, int age, String date, double chiffreAffaire) 
    {
        super(prenom, nom, age, date, chiffreAffaire);
    }

    public double calculerSalaire() 
    {
        return (0.2* getChiffreAffaire()) + 800;
    }

    public String getTitre()
    {
    	return "Le représentant ";
    }
}

class Technicien extends Employe 
{
    private int unites;
    
    public Technicien(String prenom, String nom, int age, String date, int unites)
    {
        super(prenom, nom, age, date);
        this.unites = unites;
    }
    
    public int getUnites()
    {
    	return this.unites;
    }

    public double calculerSalaire() 
    {
        return 5 * unites;
    }

    public String getTitre()
    {
    	return "Le technicien ";
    }
}

class Manutentionnaire extends Employe 
{
    private int heures;

    public Manutentionnaire(String prenom , String nom , int age , String date , int heures) 
    {
        super(prenom, nom, age, date);
        this.heures = heures;
    }
    
    public int getHeures()
    {
    	return this.heures;
    }
    
    public void setHeures(int h)
    {
    	this.heures=h;
    }

    public double calculerSalaire() 
    {
        return 65 * heures;
    }

    public String getTitre()
    {
    	return "Le manut. " ;
    }
}

interface ARisque 
{
    int PRIME = 200;
}

class TechnARisque extends Technicien implements ARisque
{

    public TechnARisque(String prenom, String nom, int age, String date, int unites)
    {
        super(prenom, nom, age, date, unites);
    }

    public double calculerSalaire() 
    {
        return super.calculerSalaire() + PRIME;
    }
}

class ManutARisque extends Manutentionnaire implements ARisque
{
    
    public ManutARisque(String prenom, String nom, int age, String date, int heures) 
    {
        super(prenom, nom, age, date, heures);
    }

    public double calculerSalaire() 
    {
        return super.calculerSalaire() + PRIME;
    }
}

class Personnel 
{
    private Employe[] staff;
    private int nbreEmploye;
    private final static int MAX = 200;

    public Personnel() 
    {
        staff = new Employe[MAX];
        nbreEmploye = 0;
    }

    public void ajouterEmploye(Employe e)
    {
        ++nbreEmploye;
        if (nbreEmploye <= MAX) 
        {
            staff[nbreEmploye - 1] = e;
        } else {
            System.out.println("Pas plus de " + MAX + " employés");
        }
    }

    public double salaireMoyen() 
    {
        double somme = 0.0;
        for (int i = 0; i < nbreEmploye; i++) 
        {
            somme += staff[i].calculerSalaire();
        }
        return somme / nbreEmploye;
    }

    public void afficherSalaires() 
    {
        for (int i = 0; i < nbreEmploye; i++) 
        {
            System.out.println(staff[i].getNom() + " gagne "
                    + staff[i].calculerSalaire() + " francs.");
        }
    }
}


public class Salaires 
{
	public static void main(String args[])
	{
		//tester le main
		Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));
        p.afficherSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");
	}

}
