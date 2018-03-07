package p1;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Principal 
{

	public static void main(String[] args) 
	{
		AppletApplication applet = new AppletApplication();
	      Frame fenetre = new Frame("Applet");
	      fenetre.addWindowListener(applet);
	      fenetre.add("Center", applet);
	      fenetre.setSize(50, 50);
	      fenetre.show();
	      applet.init();
	      applet.start();

	}
	 public void paint(Graphics g) {
	      super.paint(g);
	      g.drawString("Bonjour le monde", 10, 10);	// Coin en haut à gauche de la fenêtre
	   }

	   public void windowClosing(WindowEvent e) {
	      System.exit(0);	// Ferme l'application si on clique sur la croix en haut à droite
	   }
	   
	   // Méthodes obligatoires même vides
	   public void windowActivated(WindowEvent e) { }
	   public void windowClosed(WindowEvent e) { }
	   public void windowDeactivated(WindowEvent e) { }
	   public void windowDeiconified(WindowEvent e) { }
	   public void windowIconified(WindowEvent e) { }
	   public void windowOpened(WindowEvent e) { }

}
