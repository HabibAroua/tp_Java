package Ex4;

public class Main 
{
	public static void main(String args[])
	{
		Robot r=new Robot();
		r.tourterDroit(); // vers W
		r.tourterDroit(); // vers S
		r.tourterDroit(); // vers E
		r.avancer(); // un pas
		r.tourterDroit(); //N
		r.avancer(3); //3 pas
		r.tourterDroit(); //W
		r.afficher();
	}
}
