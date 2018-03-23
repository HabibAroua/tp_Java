package JButton;
import javax.swing.*;
//JButton()
//JButton(String s)
//JButton(Icon i)
//public void setText(String s)
//public void getEnabled(boolean b)
//public void setIcon(Icon i)
//public void addActionListener(ActionListener a)
//public Icon getIcon()
//public String getText()

public class Main 
{
	Main()
	{
		JFrame frame=new JFrame();
		JButton button=new JButton(new ImageIcon("Picture/japan.gif"));
		button.setBounds(140, 120, 200, 80);
		frame.add(button);
		frame.setSize(600, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new Main();
	}
}
