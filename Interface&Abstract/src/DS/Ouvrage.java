package DS;

public class Ouvrage 
{
	private String titre;
	private int code;
	
	public Ouvrage(String titre , int code)
	{
		this.titre=titre;
		this.code=code;
	}

	public String getTitre() 
	{
		return this.titre;
	}

	public void setTitre(String titre)
	{
		this.titre = titre;
	}

	public int getCode()
	{
		return this.code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}
	
	public String toString()
	{
		return "le titre est "+getTitre()+" le code est "+getCode();
	}

}
