package mainEx1;
import ex1.Employer;
import java.util.Scanner;
public class TestEmployer
{
	public static void main(String[] args) 
	{
		Employer e=new Employer("Habib");
		System.out.println(e.toString());
		//e.setNom("Habib");
		e.setGarde("5Etoile");
		e.setSalire(1700);
		System.out.println("L'affichage est "+e);
		//Question 6
		Scanner sc=new Scanner(System.in);
		System.out.println("Donner le nom de employer 1");
		String nomE1=sc.next();
		Employer e1=new Employer("Salah");
		Employer e2=new Employer("Salah");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		if(e1.comparer(e2)==true)
		{
			System.out.println("Sont egaux ");
		}
		else
		{
			System.out.println("Ne sont pas egaux");
		}
	}
}
