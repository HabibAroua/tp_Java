package JColorChooser;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JButton;


public class Main extends JFrame implements ActionListener
{
	JButton btn;
	Container con;
	Main()
	{
		con=getContentPane();
		btn.setLayout(new FlowLayout());
		btn=new JButton("Colors");
		btn.addActionListener(this);
		
		
	}
	
	public static void main(String[] args)
	{
		new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Color initialColor =Color.BLUE;
		Color colorC=JColorChooser.showDialog(this, "choose a color", initialColor);
		con.setBackground(colorC);
		
	}

}
