package test;

import java.util.Calendar;


public class Repat 
{
	String platprincipale;
    String desert ;
    String salade ;
    int pain;
    int day;
    static int temps;
       
    public Repat(String platprincipale, String desert, String salade, int pain) 
    {
        super();
        this.platprincipale = platprincipale;
        this.desert = desert;
        this.salade = salade;
        this.pain = pain;
    }
    
    public Repat(int temps) 
    {
        Repat.temps = temps;
    }
    
    public static void main(String args[]) 
    {
    	Repat[] tab;
    	Repat[]tab1;
        tab=new Repat[6];
        tab1=new Repat[6];
             
        System.out.println("\n *** Bienvenue au restaurant universitaire de Mahdia *** \n ");
            
         /* Scanner input = new Scanner (System.in);
			System.out.println("donner l'heure = ");
			int temps  = Integer.parseInt(input.nextLine());*/
    
        Calendar calendar=Calendar.getInstance();
        int jour =  calendar.get(Calendar.DAY_OF_WEEK);
        //  System.out.println(jour);
        if (jour == 2 )
        {
        	System.out.println("  c'est lundi , le restaurant universitaire vous souhaite une bone debut de semaine  "); 
        }
        if (jour == 3 )
        {
        	System.out.println("         C'est Mardi               " ); 
        }
        if (jour == 4 )
        {
        	System.out.println("           C'est Mercredi            " );
        }
        if (jour == 5 )
        {
        	System.out.println("           C'est Jeudi              " );
        }
        if (jour == 6 )
		{
        	System.out.println("           C'est Vendredi            " );
		}
        if (jour == 7 )
        {
        	System.out.println("           C'est Samedi             " );
        }
        Calendar calendar1=Calendar.getInstance();
  		int heure =  calendar1.get(Calendar.AM) ;
  		System.out.println("           *c'est : " + heure + "AM *          ");
		Repat R_lundi_m = new Repat("spagetti", "salade fruit", "cc", 1);
  		Repat R_lundi_s = new Repat("pizza", "salade cesar", "ff",2);
  		Repat R_Mardi_m = new Repat("gruillade", "salade tunisienne", "ii", 2);
  		Repat R_Mardi_s = new Repat("jj", "kk", "ll",5);
  		Repat R_Mercredi_m = new Repat("mm", "nn", "oo", 3);
  		Repat R_Mercredi_s = new Repat("pp", "qq", "rr",6);
  		Repat R_Jeudi_m = new Repat("jeudii", "sbee77", "ss", 4);
  		Repat R_Jeudi_s = new Repat("jeudi", "3chee", "xx",7);
  		Repat R_Vendredi_m = new Repat("xx", "xx", "xx", 5);
  		Repat R_vendredi_s = new Repat("cc", "cc", "cc",8);
  		Repat R_Samedi_m = new Repat("77", "88", "99", 6);
  		Repat R_Samedi_s = new Repat("10", "11", "12",8);
  		tab[0]=R_lundi_m;
  		tab[1]=R_Mardi_m;
  		tab[2]=R_Mercredi_m;
  		tab[3]=R_Jeudi_m;
  		tab[4]=R_Vendredi_m;
  		tab[5]=R_Samedi_m;
  		tab1[0]=R_lundi_s;
  		tab1[1]=R_Mardi_s;
  		tab1[2]=R_Mercredi_s;
  		tab1[3]=R_Jeudi_s;
  		tab1[4]=R_vendredi_s;
  		tab1[5]=R_Samedi_s; 
        if ((heure >= 6) && (heure <= 8) )
        {
        	if(jour==2)
        	{
        		System.out.println("voici le menu de lundi matin \n " + tab1[0].platprincipale + "|"+ tab1[0].desert+ "|"+ tab1[0].salade+ "|"+ tab1[0].pain );
        	}
        	if(jour==3)
        	{
        		System.out.println("voici le menu de mardi matin \n " + tab1[1].platprincipale + "|"+ tab1[1].desert+ "|"+ tab1[1].salade+ "|"+ tab1[1].pain );
        	}
        	if(jour==4)
        	{
        		System.out.println("voici le menu de mercredi matin \n " + tab1[2].platprincipale + "|"+ tab1[2].desert+ "|"+ tab1[2].salade+ "|"+ tab1[2].pain );
        	}
        	if(jour==5)
        	{
        		System.out.println("voici le menu de mercredi matin \n " + tab1[3].platprincipale + "|"+ tab1[2].desert+ "|"+ tab1[2].salade+ "|"+ tab1[2].pain );
        	}
        	if(jour==6)
        	{
        		System.out.println("voici le menu de vendredi soire \n " +tab1[4].platprincipale + "|"+ tab1[3].desert+ "|"+ tab1[3].salade+ "|"+ tab1[3].pain );
        	}
        }
        if((heure >= 0) && (heure <= 3) )    
        {
        	if(jour==2)
        	{
        		System.out.println( "voici le menu de lundi matin \n " + tab[0].platprincipale + "|"+ tab[0].desert+ "|"+ tab[0].salade+ "|"+ tab[0].pain );
        	}
        	else if(jour==3)
        	{
        		System.out.println("voici le menu de mardi matin \n " + tab[1].platprincipale + "|"+ tab[1].desert+ "|"+ tab[1].salade+ "|"+ tab[1].pain );
        	}
        	else if(jour==4)
        	{
        		System.out.println("voici le menu de mercredi matin \n " + tab[2].platprincipale + "|"+ tab[2].desert+ "|"+ tab[2].salade+ "|"+ tab[2].pain );
        	}
        	if(jour==5)
        	{
        		System.out.println("voici le menu de jeudi matin \n " +tab[3].platprincipale + "|"+ tab[3].desert+ "|"+ tab[3].salade+ "|"+ tab[3].pain );
        	}
        	if(jour==6)
        	{
        		System.out.println("voici le menu de vendredi matin \n " + tab[4].platprincipale + "|"+ tab[4].desert+ "|"+ tab[4].salade+ "|"+ tab[4].pain );
        	}
        	if(jour==7)
        	{
        		System.out.println("voici le menu de samedi matin \n " + tab[5].platprincipale + "|"+ tab[5].desert+ "|"+ tab[5].salade+ "|"+ tab[5].pain );
        	}
        }
    }  
}