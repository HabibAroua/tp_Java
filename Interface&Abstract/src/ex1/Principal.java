package ex1;

public class Principal 
{
	public static void main(String[] args)
	{
		Magasin m=new Magasin(75,100);
		ArticleElecromenagers a1=new ArticleElecromenagers(700,800,"Bako","Foulan1",75);
		ArticleElecromenagers a2=new ArticleElecromenagers(900,1600,"Bako1","Foulan2",275);
		a2.setPrixAchat(a2.vendre(60));
		ArticleElecromenagers a3=new ArticleElecromenagers(70,760,"Bako2","Foulan3",305);
		m.addElement1(a1);
		m.addElement1(a2);
		m.addElement1(a3);
		
		Primeurs p1=new Primeurs(600,760,"LG2","Foulan1",140);
		p1.lancerSolde(100);
		Primeurs p2=new Primeurs(70,760,"Nokia2","Foulan2",775);
		Primeurs p3=new Primeurs(70,760,"Samsung","Foulan3",20);
		p3.terminerSolde(80);
		Primeurs p4=new Primeurs(70,760,"Dell","Foulan4",30);
		
		m.addElemente(p1);
		m.addElemente(p2);
		m.addElemente(p3);
		m.addElemente(p4);
		
		m.description();
	}
}
