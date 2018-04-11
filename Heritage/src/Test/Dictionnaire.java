package Test;

public class Dictionnaire extends Document 
{
	private String langue;
	
	public Dictionnaire(int numEnreg , String titre ,String langue)
	{
		super(numEnreg ,titre);
		this.langue=langue;
	}

	public String getLangue() 
	{
		return this.langue;
	}

	public void setLangue(String langue)
	{
		this.langue = langue;
	}
	
	public String toString()
	{
		return super.toString()+" langue est "+getLangue();
	}

}
