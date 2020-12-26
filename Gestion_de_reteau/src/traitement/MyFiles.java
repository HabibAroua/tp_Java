package traitement;

import java.io.BufferedReader; //pour lire le contenu du fichier
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFiles 
{
	private String url;
	private String texte;
	
	public MyFiles(String url, String texte) 
	{
		super();
		this.url = url;
		this.texte = texte;
	}
	
	public MyFiles()
	{
		
	}

	public String getUrl() 
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getTexte()
	{
		return texte;
	}

	public void setTexte(String texte) 
	{
		this.texte = texte;
	}
	
	public boolean ecrire()
	{
		try 
		{
			FileWriter myWriter = new FileWriter(this.url); //Communiquer avec le fichier et ouvrir
		    myWriter.write(this.texte); //Ecrire un texte dans ce fichier
		    myWriter.close(); // La sauvgarde et la fermuture
		    //System.out.println("Successfully wrote to the file.");
		    return true;
		}
		catch (IOException e)
		{
			System.out.println("An error occurred.");
		    return false;
		}
	}
	
	public BufferedReader lire() throws FileNotFoundException // hiya nafssha try catch
	{
		File file = new File(url);   
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		return br;
	}
}
