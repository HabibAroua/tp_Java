package jLabel;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame 
{
	public Main()
	{
		setSize(200,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JLabel label1,label2,label3,label4,label5;
		label1=new JLabel("username",JLabel.RIGHT);
		label2=new JLabel("Password",JLabel.RIGHT);
		label3=new JLabel("Confirm password",JLabel.RIGHT);
		label4=new JLabel("Email",JLabel.LEFT);
		label5=new JLabel("Cell phone",JLabel.CENTER);
	}
	public static void main(String[] args) 
	{
		new Main();
	}

}
