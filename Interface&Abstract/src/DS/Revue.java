package DS;

public class Revue extends Ouvrage
{
	private String periodecite;
	
	public Revue(String titre , int code , String periodecite)
	{
		super(titre,code);
		this.periodecite=periodecite;
	}
	
	public String getPeriodecite()
	{
		return this.periodecite;
	}
	
	public void setPeriodecite(String p)
	{
		this.periodecite=p;
	}
	
	public String toString()
	{
		return super.toString()+" La peridecite est "+getPeriodecite();
	}

}
