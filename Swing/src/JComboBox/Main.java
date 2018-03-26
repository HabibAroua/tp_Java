package JComboBox;
import javax.swing.*;
public class Main 
{
	JFrame frame;
	JComboBox c;
	Main()
	{
		frame=new JFrame("ComboBox");
		String name[]={"Habib","Salah","Nada"};
		c=new JComboBox(name);
		c.setBounds(60,60,100,30);
		frame.setSize(500, 500);
		frame.add(c);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Main();
	}
}
