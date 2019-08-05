package p1;

public class Main 
{
	public static void main(String[] args) 
	{
		SendEmail s=new SendEmail("Write your email","Write your passowrd here","mail reciver","Write your subject","Write a text here");
		Boolean test=s.send();
		if(test==true)
		{
			System.out.println("Mail sent");
		}
		else
		{
			System.out.println("Error");
		}
	}
}