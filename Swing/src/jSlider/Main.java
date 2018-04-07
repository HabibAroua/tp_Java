package jSlider;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Main extends JFrame
{
	JSlider slider;
	JPanel panel;
	Main()
	{
		slider=new JSlider(JSlider.HORIZONTAL,0,70,25);
	    panel=new JPanel();
	    panel.add(slider);
	    add(panel);
	}
	
	public static void main(String[] args) 
	{
		Main m=new Main();
		m.pack();
		m.setVisible(true);
	}

}
