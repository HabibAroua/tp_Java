package Ex5;

public class Nombre
{
	private  int valeur;
    static public int nb=0;
	
	public void incermnter()
	{
		nb++;
		this.valeur++;
	}
	
	public void decremnter()
	{
		nb++;
		this.valeur--;
	}
	
	public void afficher()
	{
		System.out.println("La valeur numérique est "+this.valeur);
	}
	
	public void incremnter(int v)
	{
		nb++;
		this.valeur+=v;
	}
	
	public void decremnter(int v)
	{
		nb++;
		this.valeur-=v;
	}

}
