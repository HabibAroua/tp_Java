package p2;

public class Principal 
{
	public static void main(String[] args) 
	{
		Point p=new Point(5,2);
		p.setX(3);
		p.setY(2);
		p.deplace(-3, 2);
		p.affichage();
	}

}