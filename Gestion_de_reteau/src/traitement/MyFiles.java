package traitement;

import java.io.BufferedReader;
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
			FileWriter myWriter = new FileWriter(this.url);
		    myWriter.write(this.texte);
		    myWriter.close();
		    //System.out.println("Successfully wrote to the file.");
		    return true;
		}
		catch (IOException e)
		{
			//System.out.println("An error occurred.");
		    e.printStackTrace();
		    return false;
		}
	}
	
	public BufferedReader lire() throws FileNotFoundException
	{
		File file = new File(url);   
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		return br;
	}
	
	public void vider() throws IOException
	{
		File file = new File(url);
		if(file.exists())
		{
		    file.delete();
		}
		
		file.createNewFile();
	}
}
