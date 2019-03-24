package Test;

public class Manuel 
{
	private String niveau;
	
	public Manuel(String niveau)
	{
		this.niveau=niveau;
	}
	
	public String toString()
	{
		return "le niveau est "+getNiveau();
	}
	
	public String getNiveau()
	{
		return this.niveau;
	}
	
	public void setNiveau(String niveau)
	{
		this.niveau=niveau;
	}
}