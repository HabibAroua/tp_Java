package ex2;

public class Main
{
	public static void main(String[] args) 
	{
		//Pour le personne p1
		Personne p1 = new  Personne("Mourad","Salhi","Célibatire");
		Personne p3=new Personne("Salah","Salhi","Mariee"); //Pere de p1
		Personne p4=new Personne("Halima","Ben yedir","Mariee"); //Mere de p1
		p1.setPere(p3);
		p1.setMere(p4);
		
		//Pour le personne p2
		Personne p2 = new  Personne("Najwa","Ayari","Célibatire");
		Personne p5=new Personne("Ahmed","Ayari","Mariee"); //Pere de p2
		Personne p6=new Personne("Najiba","Rafrafi","Mariee"); //Mere de p2
		p2.setPere(p5);
		p2.setMere(p6);
		
		//Le Mariage entre p1 et p2
		p1.seMarier(p2);
		p2.seMarier(p1);
		System.out.println(p1+" son pére est :"+p1.getPere()+" sa mére est :"+p1.getMere());
		System.out.println(p2+" son pére est :"+p2.getPere()+" sa mére est :"+p2.getMere());
		System.out.println("__________________________________\n");
		//Divorce (-_-)
		p1.divorser();
		p2.divorser();
		System.out.println(p1+" son pére est :"+p1.getPere()+" sa mére est :"+p1.getMere());
		System.out.println(p2+" son pére est :"+p2.getPere()+" sa mére est :"+p2.getMere());
	}
}
