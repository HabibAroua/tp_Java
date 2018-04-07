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
		slider=new JSlider(JSlider.HORIZONTAL,0,100,25);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
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
