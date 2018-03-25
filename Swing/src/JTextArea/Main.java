package JTextArea;
import java.awt.Color;

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
	public static void main(String[] args)
	{
		JTextArea area;
		JFrame frame;
		frame=new JFrame();
		area=new JTextArea(200,300);
		area.setBounds(15, 50, 200, 200);
		area.setBackground(Color.darkGray);
		area.setForeground(Color.ORANGE);
		frame.add(area);
		frame.setSize(500, 500);
		area.setText("Hello \n hug mee");
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
