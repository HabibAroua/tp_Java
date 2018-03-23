package ex2;

import javax.swing.*;
public class Frame extends JFrame
{
	JFrame jframe;
	
	public Frame()
	{
		JButton button=new JButton("Habib Aroua");
		button.setBounds(120,120,250,60);
		add(button);
		setSize(600,500);
		setLayout(null);
		setVisible(true);
	}
}