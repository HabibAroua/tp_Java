package Test;
//Habib Aroua 3 ING A
public class TestDocuments 
{
	public static void main(String[] args)
	{
		Document d1=new Livre(1,"Sharlock holmes","Conan Doyle",500);
		Document d2=new Revue(2,"NN",3,2000);
		Document d3=new Dictionnaire(3,"Katakana","Japonais");
		System.out.println("L'affichage de tous les Document "+d1.toString()+" "+d2.toString()+" "+d3.toString());
		//Document Biblitheque[]=new Document[20];
		//Biblitheque[0]=d1;
		//Biblitheque[1]=d2;
		//Biblitheque[2]=d3;
	}

}
