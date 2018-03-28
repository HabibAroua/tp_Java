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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btn;
	Container con;
	Main()
	{
		con=getContentPane();
		btn=new JButton("Colors");
		btn.setSize(20, 5);
		con.setLayout(new FlowLayout());
		btn.addActionListener(this);
		con.add(btn);
	}
	
	public static void main(String[] args)
	{
		Main m=new Main();
		m.setSize(500,500);
		m.setVisible(true);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Color initialColor =Color.BLUE;
		Color colorC=JColorChooser.showDialog(this, "choose a color", initialColor);
		con.setBackground(colorC);
	}
}
