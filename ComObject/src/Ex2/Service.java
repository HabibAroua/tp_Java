package Ex2;

import java.util.Vector;

public class Service 
{
	private String nom;
	private int telephone;
	private Employer chefService;
	private Vector listEmployees=new Vector();
	
	public Service()
	{
		
	}
	
	public Service(String nom , int telephone , Employer chefService )
	{
		this.nom=nom;
		this.telephone=telephone;
		this.chefService=chefService;
	}
	
	public int getTelephone()
	{
		return telephone;
	}
	
	public int getNombreEmployer()
	{
		return listEmployees.size();
	}
	
	public void setTelephone(int telephone)
	{
		this.telephone = telephone;
	}
	
	public Employer getChefService()
	{
		return chefService;
	}
	
	public void setChefService(Employer chefService) 
	{
		this.chefService = chefService;
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public String toString()
	{
		String chEm="";
		for(int i=0 ; i<listEmployees.size() ; i++)
		{
			chEm=listEmployees.get(i).toString()+"/";
		}
		return "Le nom de chef:"+chefService.getNom()+" et les Employees sont  "+chEm;
	}
	
	public void affecterEmployer(Employer e)
	{
		listEmployees.addElement(e);
	}
	
	public void eliminerEmployee(Employer e)
	{
	    for(int i=0 ; i<listEmployees.size() ; i++)
	    {
	    	if(e.toString().equals(listEmployees.get(i).toString()))
	    	{
	    		listEmployees.removeElementAt(i);
	    		break;
	    	}
	    }
	    
	}
	
}
