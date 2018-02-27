package Ex2;

public class Test 
{

	public static void main(String[] args) 
	{
		Service s1=new Service("it",215966,new Employer("Salah","G1",50000,new Service()));
		Service s2=new Service("Al",215966,new Employer("Mohamed","G2",80000,new Service()));
		
		Employer e1=new Employer("Salah","e",600,new Service());
		Employer e2=new Employer("Ahmed","e",700,new Service());
		Employer e3=new Employer("Salouha","e",552,new Service());
		Employer e4=new Employer("Saida","e",1000,new Service());
		
		s1.affecterEmployer(e1);
		s1.affecterEmployer(e2);
		s2.affecterEmployer(e3);
		s2.affecterEmployer(e4);
		
		s1.setChefService(e1);
		s2.setChefService(e3);
		
	

	}

}