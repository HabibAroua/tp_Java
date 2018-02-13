package p1;
import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Donner une chaine");
		String ch=s.nextLine();
		String chI="";
		for(int i=0 ; i<ch.length() ; i++)
		{
			chI=ch.charAt(i)+chI;
		}
		
		if(ch.equals(chI))
		{
			System.out.println("Cette chaine est palindrome");
		}
		else
		{
			System.out.println("Cette chaine est non Palindromme");
		}

	}
}
