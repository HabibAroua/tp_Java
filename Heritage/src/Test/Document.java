package Test;

public class Document 
{
	private int numEnreg;
	private String titre;
	
	public Document(int numEnreg , String titre)
	{
		this.numEnreg=numEnreg;
		this.titre=titre;
	}
	
	public int getNumEnrg()
	{
		return this.numEnreg;
	}
	
	public String getTitre()
	{
		return this.titre;
	}
	
	public void setTitre(String titre)
	{
		this.titre=titre;
	}
	
	public void setNumEnrg( int num)
	{
		numEnreg=num;
	}
	
	public String toString()
	{
		return "numéro est "+getNumEnrg()+" le titre est "+getTitre();
	}

}
