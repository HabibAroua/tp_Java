package JProgressBar;
import javax.swing.JProgressBar;
import javax.swing.JFrame;
//JProgressBar()
//JProgressBar(int min , int max)
//JProgressBar(int orient)
//JProgressBar(int orient , int min , int max)

//public void setStringPainted(boolean b)
//public void setString(String s)
//public void setOrientation(int orientation)
//public void setValue(int value)
public class Main extends JFrame
{
	JProgressBar jProgressBar;
	int i=0;
	int num=0;
	
	Main()
	{
		jProgressBar=new JProgressBar(0,1000);
		jProgressBar.setBounds(30, 30, 300, 40);
		jProgressBar.setValue(0);
		jProgressBar.setStringPainted(true);
		add(jProgressBar);
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		count();
	}
	
	public void count() 
	{
		try
		{
			while(i<1000)
		    {
				jProgressBar.setValue(i);
			    i++;
		 	    Thread.sleep(150);
		    }
		}
		catch(Exception e)
		{
		     System.out.println("The error is "+e.getMessage());	
		}
	}
	
	public static void main(String[] args) 
	{
		new Main();
	}
}
