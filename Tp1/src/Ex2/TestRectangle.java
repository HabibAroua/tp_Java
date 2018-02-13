package Ex2;

public class TestRectangle 
{

	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.modifierCotes(7, 5);
		System.out.println("La surface est "+r.surface());
		System.out.println("Le perimetre est "+r.perimetre());
	}

}
