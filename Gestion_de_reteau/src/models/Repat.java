package models;

public class Repat 
{
	private String platprincipale;
    private String desert ;
    private String salade ;
    private String pain;
    private int day;
    static int temps;
    
	public Repat(String platprincipale, String desert, String salade, String pain) 
    {
        super();
        this.platprincipale = platprincipale;
        this.desert = desert;
        this.salade = salade;
        this.pain = pain;
    }
    
	public Repat()
	{
		
	}
	
    public Repat(int temps) 
    {
        Repat.temps = temps;
    }
    
    public String getPlatprincipale() 
    {
		return platprincipale;
	}

	public void setPlatprincipale(String platprincipale) 
	{
		this.platprincipale = platprincipale;
	}

	public String getDesert() 
	{
		return desert;
	}

	public void setDesert(String desert) 
	{
		this.desert = desert;
	}

	public String getSalade() 
	{
		return salade;
	}

	public void setSalade(String salade) 
	{
		this.salade = salade;
	}

	public String getPain() 
	{
		return pain;
	}

	public void setPain(String pain) 
	{
		this.pain = pain;
	}

	public int getDay() 
	{
		return day;
	}

	public void setDay(int day) 
	{
		this.day = day;
	}
}