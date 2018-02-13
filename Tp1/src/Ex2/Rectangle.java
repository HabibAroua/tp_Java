package Ex2;

public class Rectangle
{
	private float longeur;
	private float largeur;
	
	public float perimetre()
	{
		return (this.largeur+this.longeur)*2;
	}
	
	public float surface()
	{
		return (this.largeur*this.longeur);
	}
	
	public void modifierCotes(float longeur , float largeur)
	{
		this.longeur=longeur;
		this.largeur=largeur;
	}
	
	public Rectangle()
	{
		this.longeur=5;
		this.largeur=2;
	}


}
