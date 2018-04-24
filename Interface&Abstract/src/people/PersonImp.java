package people;

public abstract class  PersonImp implements Person 
{

	private String nom;
	private int age;
	private PersonImp p;
	
	public PersonImp(String nom , int age)
	{
		this.nom=nom;
		this.age=age;
	}
	
	public PersonImp(PersonImp p)
	{
		this.p=p;
	}
	@Override
	public String getNom()
	{
		return this.nom;
	}

	@Override
	public void setAge(int age)
	{
		this.age=age;
	}

	@Override
	public int getAge() 
	{
		return this.age;
	}

	@Override
	public abstract String getUniqueId();
	
	
	public String toString()
	{
		return "Le nom est :"+getNom()+" l'age est "+getAge();
	}
	
}
