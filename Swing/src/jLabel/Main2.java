package jLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 
{
	public static void main(String[] args) 
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame();
		frame.setTitle("Label test");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label=new JLabel("Your name");
		label.setFont(new Font("Courier new ",Font.BOLD,20));
		label.setForeground(Color.BLUE);
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}
}
