package RadioButton;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//JRadioButton()
//JRadioButton(String s)
//JRadioButton(String s , boolean b)

public class Main extends JFrame implements ActionListener
{
	JFrame frame;
	JRadioButton r1,r2;
	Main()
	{
		frame=new JFrame();
		r1=new JRadioButton("1-Male");
		r2=new JRadioButton("2-Femael");
		r1.setBounds(40,110,80,40);
		r2.setBounds(120,110, 80, 40);
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		JButton bt=new JButton("Click");
		bt.setBounds(190, 110, 80, 40);
		frame.add(r1);
		frame.add(r2);
		frame.add(bt);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		//add the event
		bt.addActionListener(this);
	}
	public static void main(String[] args) 
	{
		new Main();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(r1.isSelected())
		{
			JOptionPane.showMessageDialog(this, "You are a male");
		}
		else
		{
			if(r2.isSelected())
			{
				JOptionPane.showMessageDialog(this, "You are female");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Hello world");
			}
		}
	}
	
}
