package JTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Main
{
	JFrame frame ;
	Main()
	{
		frame = new JFrame();
		String [][] names = { {"1000","Muhammed" , "Java developer"}, 
		                                   {"1002","Habib" , "Web developer"},
		                                   {"1003","Usama" , "Server developer"},
		                                   {"1002","Ahmed" , "Web developer"},
		                                   {"1003","Usama" , "Server developer"},
		                                   {"1002","Ahmed" , "Web developer"},
		                                   {"1003","Usama" , "Server developer"},
		                                   {"1002","Ahmed" , "Web developer"},
		                                   {"1003","Usama" , "Server developer"},
		                                   {"1003","Usama" , "Server developer"},
		                                   {"1002","Ahmed" , "Web developer"},
		                                   {"1003","Usama" , "Server developer"},
		                                   {"1003","Usama" , "Server developer"},
		                                   {"1002","Ahmed" , "Web developer"},
		                                   {"1003","Usama" , "Server developer"}};
		
		String [] header = {"ID" , "Names", "Department"};
		JTable t = new JTable(names,header);
		t.setBounds(30,40,200,300);
		JScrollPane s = new JScrollPane(t);
		frame.add(s);
		frame.setSize(400, 500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Main();
	}
}
