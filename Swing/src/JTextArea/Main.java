package JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
//JTextArea()
//JTextArea(String s)
//JTextArea(int row , int column)
//JTextArea(String s ,int row , int column)
//public void setRows(int rows)
//public void setColumns(int cols)
//public void setFont(Font f)
//public void insert(String s)
//public void append(String s)

public class Main
{
	JTextArea area;
	JFrame frame;
	Main()
	{
		frame=new JFrame();
		area=new JTextArea(500,500);
		area.setBounds(15, 50, 500, 500);
		Font font =new Font("Verdana",Font.BOLD,16);
		area.setBackground(Color.darkGray);
		area.setForeground(Color.ORANGE);
		area.setFont(font);
		frame.add(area);
		frame.setSize(500, 500);
		area.setText("Hello \n hug mee");
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Main();
	}
}
