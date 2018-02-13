package Ex4;

public class Robot 
{
	private int x;
	private int y;
	private char orientation;
	
	public void tourterDroit()
	{
		switch(this.orientation)
		{
		    case 'N' : this.orientation='W';
		    break;
		    case 'W' : this.orientation='S';
		    break;
		    case 'S' : this.orientation='E';
		    break;
		    case 'E' : this.orientation='N';
		    break;
		}
	}
	
	public void avancer()
	{
		switch(this.orientation)
		{
		     case  'N' : y++;
		     break;
		     case 'E' : x++;
		     break;
		     case 'W' : x--;
		     break;
		     case 'S' : y--;
		     break;
	 	}
	}
	
	public void avancer(int nbPas)
	{
		switch(this.orientation)
		{
		     case  'N' : y+=nbPas;
		     break;
		     case 'E' : x+=nbPas;
		     break;
		     case 'W' : x-=nbPas;
		     break;
		     case 'S' : y-=nbPas;
		     break;
	 	}
	}
	
	public void afficher()
	{
		System.out.println("La position est "+this.x+" et "+this.y+" et l'orientation est "+this.orientation);
	}
	
	public Robot()
	{
		this.x=0;
		this.y=0;
		this.orientation='N';
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	public void setY(int y)
	{
		this.y=y;
	}
	
}
