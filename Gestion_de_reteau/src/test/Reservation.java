package test;

import java.util.Scanner;
import java.util.Calendar;


public class Reservation 
{

    String platprincipale;
    String desert ;
    String salade ;
    int pain;
    int day;
    static int temps;
         
    public Reservation(String platprincipale, String desert, String salade, int pain)
    {
        super();
        this.platprincipale = platprincipale;
        this.desert = desert;
        this.salade = salade;
        this.pain = pain;
    }
    
    public Reservation(int temps) 
    {
        Repat.temps = temps;
    }
    
    public static void main(String args[]) 
    {
    	Repat[] tab;
    	Repat[]tab1;
        tab=new Repat[6];
        tab1=new Repat[6];
     
        System.out.println("\n * Bienvenue au restaurant universitaire de Mahdia * \n ");
            
         /*   Scanner input = new Scanner (System.in);
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
        Repat R_lundi_m = new Repat("makrouna_djej", "yaghorta ", "salade fruit", 2);
        Repat R_lundi_s = new Repat("chorba_adas", "tofeha ", "salade cesar",2);
        Repat R_Mardi_m = new Repat("loubya", "medarine", "salade tunisienne", 2);
        Repat R_Mardi_s = new Repat("rouz", "banana ", "salade mechouia",2);
        Repat R_Mercredi_m = new Repat("rouz_jrbi", "yaghorta ", "salade de riz ", 2);
        Repat R_Mercredi_s = new Repat("chorba", "tofeha ", "salade omek houria ",2);
        Repat R_Jeudi_m = new Repat("kosksi_hout", "medarine", "salade blankite", 2);
        Repat R_Jeudi_s = new Repat("scalope_panné", "banana ", "salade verte",2);
        Repat R_Vendredi_m = new Repat("makrouna_lham", "tofeha", "salade mechouia ", 2);
        Repat R_vendredi_s = new Repat("makrouna_jerya", "yaghorta ", "salade fruit ",2);
        Repat R_Samedi_m = new Repat("mlokheya", "medarine", "salade de riz ", 2);
        Repat R_Samedi_s = new Repat("mosli_tunsie", "tofeha", "salade omek houria ",2);
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
        	if(jour==1)
            {
        		System.out.print("desolé c'est dimanche   ");
            }
            //222222222222222222222222222222222222222222222222222222222222222222
            else  if(jour==2)
            {
            	System.out.println("voici le menu de lundi matin \n " + tab1[0].platprincipale +  "|"+ tab1[0].salade);
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab1[0].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                if(s.equals(b))
                {
                	System.out.println("tu a "+tab1[0].pain+" de pain");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }     
            }
        	//333333333333333333333333333333333333333333333333333333333333333333333333
            if(jour==3)
            {
            	System.out.println("voici le menu de mardi matin \n " + tab1[1].platprincipale + "|"+ tab1[1].salade );
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab1[1].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();    
                if(s.equals(b))
                {
                	System.out.println("tu a"+tab1[1].pain+" de pain ");
                }
                else 
                {
                	System.out.println("ok comme tu veux ");
                }
            }
            //44444444444444444444444444444444444444444444444444444444444444444444444444
            if(jour==4)
            {
            	System.out.println("voici le menu de mercredi matin \n " + tab1[2].platprincipale + "|"+ tab1[2].salade );
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab1[2].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                    
                if(s.equals(b))
                {
                	System.out.println("tu a "+tab1[2].pain+"de pain ");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }
            }
            //5555555555555555555555555555555555555555555555555555
            if(jour==5)
            {
            	System.out.println("voici le menu de mercredi matin \n " + tab1[3].platprincipale + "|"+  tab1[3].salade);
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab1[3].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                    
                if(s.equals(b))
                {
                	System.out.println("tu a "+tab1[3].pain+"de pain ");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }
            }
            if(jour==6)
            {
            	System.out.println("voici le menu de vendredi soire \n " +tab1[4].platprincipale +  "|"+ tab1[4].salade);
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab1[4].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                    
                if(s.equals(b))
                {
                	System.out.println("tu a de "+tab1[4].pain+"de pain ");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }
                         
            }
            //6666666666666666666666666666666666666666666666666666666666666666666666
            if(jour==7)
            {
            	System.out.println("voici le menu de mercredi matin \n " + tab1[5].platprincipale + "|"+ tab1[5].salade );
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab1[5].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                    
                if(s.equals(b))
                {
                	System.out.println("tu a "+tab1[5].pain+"de pain ");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }

            }
        }
        
        if  ((heure >= 0) && (heure <= 3) )    
        {
        	if(jour==1)
        	{
        		System.out.print("cest dimanche ");
        	}
        	//222222222222222222222222222222222222222222222222222222
			else if(jour==2)
			{
				System.out.println( "voici le menu de lundi matin \n " + tab[0].platprincipale + "|"+ tab[0].salade);
				Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab[0].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                    
                if(s.equals(b))
                {
                	System.out.println("tu a"+tab[0].pain+"de pain");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }
			}
        	//33333333333333333333333333333333333333333333333333333333333333333333333333333
			else if(jour==3)
			{
				System.out.println("voici le menu de mardi matin \n " + tab[1].platprincipale + "|"+ tab[1].salade );
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab[1].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                    
                if(s.equals(b))
                {
                	System.out.println("tu a "+tab[1].pain+"de pain");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }
			}
        	//444444444444444444444444444444444444444444444444444444444444444444444444444
			else if(jour==4)
			{
				System.out.println("voici le menu de mercredi matin \n " + tab[2].platprincipale + "|"+ tab[2].salade );
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab[2].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                    
                if(s.equals(b))
                {
                	System.out.println("tu a"+tab[2].pain+"de pain");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }
			}
        	//555555555555555555555555555555555555555555555555555555555555555555555555
      	    if(jour==5)
            {
      	    	System.out.println("voici le menu de jeudi matin \n " +tab[3].platprincipale + "|"+ tab[3].salade );
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab[3].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                   
                String s=in.nextLine();
                    
                if(s.equals(b))
                {
                	System.out.println("tu a "+tab[3].pain+"de pain");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }
            } 
            //66666666666666666666666666666666666666666666666666666666
			if(jour==6)
			{
				System.out.println("voici le menu de vendredi matin \n " + tab[4].platprincipale + "|"+ tab[4].salade );
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
                String a=input.nextLine();
                if(a.equals(b))
                {
                	System.out.println("ok "+tab[4].desert);
                }
                else
                {
                	System.out.println("ok comme tu veux");
                }
                Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                    
                if(s.equals(b))
                {
                	System.out.println("tu a"+tab[4].pain+"de pain");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }
			}
			//777777777777777777777777777777777777777777777777777777777777777
		   	if(jour==7)
        	{
		   		System.out.println("voici le menu de samedi matin \n " + tab[5].platprincipale + "|" + tab[5].salade  );    
                Scanner input = new Scanner (System.in);
                System.out.println("tu veux dessert oui ou non (oui/non) = ");
                String b="oui";
            	String a=input.nextLine();
            	if(a.equals(b))
                {
            		System.out.println("ok "+tab[5].desert);
                }
            	else
            	{
            		System.out.println("ok comme tu veux");
            	}
            	Scanner in=new Scanner(System.in);
                System.out.println("tu veux pain  repond que oui/non ");
                String s=in.nextLine();
                if(s.equals(b))
                {
                	System.out.println("tu a"+tab[5].pain+"de pain");
                }
                else 
                {
                	System.out.println("comme tu veux ");
                }
        	}
        }
    }
}