package fr.emile.fil.main;

import javax.swing.JDialog;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

import fr.emile.fil.entity.BaseFrame;
import fr.emile.fil.entity.SimpleWindow;


public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JDialog
				BaseFrame myWindow = new BaseFrame();
				myWindow.setVisible(true);//On la rend visible
			}
		});
		
	}
	
	public static void jDialogTest() {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JDialog
				JDialog dialog = new JDialog();
				dialog.setSize(300, 200);//On lui donne une taille
				dialog.setTitle("First window"); //On lui donne un titre
				dialog.setVisible(true);//On la rend visible
			}
		});
		
	}
	
	public static void jWindowsTest() {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JWindow
				JWindow window = new JWindow();
				window.setSize(300, 200);//On lui donne une taille pour qu'on puisse la voir
				window.setVisible(true);//On la rend visible
			}
		});
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
		
	}

}
