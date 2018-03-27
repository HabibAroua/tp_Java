package JTable;
import javax.swing.*;
public class Main 
{
	JFrame frame;
	Main()
	{
		frame=new JFrame();
		frame.setBounds(40, 50, 300, 400);
		String name[][]={ 
				{"1000","Habib","Aroua", "Java Devlopper" },
				{"1000","Anas","Najjar", "Java Devlopper" },
				{"1000","Mohamed","Chihi", "Web Designer" }
		                };
		String header[]={"ID", "First name", "Last name","Rule"};
		JTable table=new JTable(name,header);
		JScrollPane s=new JScrollPane();
		frame.add(table);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new Main();
	}
}
