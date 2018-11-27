package control;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

import windows.MenuVentana;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		MenuVentana mv = new MenuVentana();
		mv.setVisible(true);
		
	//Cambia de estilo las pantallas	
//		try{
//			  
//			  JFrame.setDefaultLookAndFeelDecorated(true);
//			  JDialog.setDefaultLookAndFeelDecorated(true);
//			  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//			  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			  UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//			}
//			catch (Exception e)
//			 {
//			  e.printStackTrace();
//			 }
		
		
	}

}
