package p2;

public class Point 
{
	private int x;
	private int y;
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
    
	public void setY(int y)
	{
		this.y=y;
	}
	
	public Point()
	{
		this.x=0;
		this.y=0;
		
	}
	
	public Point(int x , int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void affichage()
	{
		System.out.println("L'abssice est "+getX()+" l'ordonné est "+getY());
	}

	public void deplace(int u , int v)
	{
		this.x+=u;
		this.y+=v;
	}
	
}
