package RadioButton;
import javax.swing.*;
//JRadioButton()
//JRadioButton(String s)
//JRadioButton(String s , boolean b)

public class Main 
{
	JFrame frame;
	Main()
	{
		frame=new JFrame();
		JRadioButton r1=new JRadioButton("1-Male");
		JRadioButton r2=new JRadioButton("2-Femael");
		r1.setBounds(40,110,80,40);
		r2.setBounds(40,110, 80, 40);
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		frame.add(r1);
		frame.add(r2);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Main();
	}

}
