package DS;

public class BD extends Volume
{
	private String nomD;
	
	public BD(String titre , int code , String auteur , String nomD)
	{
		super(titre,code,auteur);
		this.nomD=nomD;
	}
	
	public String getNomD()
	{
		return this.getNomD();
	}
	
	public void setNomD(String nomD)
	{
		this.nomD=nomD;
	}
	
	public String toString()
	{
		return super.toString()+" le nom de dessineur est "+getNomD();
	}

}
