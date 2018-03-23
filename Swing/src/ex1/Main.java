package ex1;
import javax.swing.JFrame;
import javax.swing.JButton;
public class Main 
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		JButton button=new JButton("Click");
		button.setBounds(190, 300, 100, 100);
		frame.add(button);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
