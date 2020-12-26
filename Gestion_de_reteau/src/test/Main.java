package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main 
{
	public static void main(String args[])
	{
		try 
		{
			FileWriter myWriter = new FileWriter("C:/projet_java/Etudiant.txt");
		    myWriter.write("I love Java");
		    myWriter.close();
		    System.out.println("Successfully wrote to the file.");
		}
		catch (IOException e)
		{
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}
}
