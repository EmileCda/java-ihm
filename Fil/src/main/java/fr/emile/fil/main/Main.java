package fr.emile.fil.main;

import javax.swing.SwingUtilities;

import fr.emile.fil.control.ComboBoxFrame;
import fr.emile.fil.control.NullLayout;
import fr.emile.fil.entity.BaseFrame;

//https://baptiste-wicht.developpez.com/tutoriels/java/swing/debutant/

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NullLayout myWindow = new NullLayout();
				myWindow.setVisible(true);// On la rend visible
			}

		});
	}

	public static void mainComboBox(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// On crée une nouvelle instance de notre JDialog
				ComboBoxFrame myWindow = new ComboBoxFrame();
				myWindow.setVisible(true);// On la rend visible
			}
		});

	}

	public static void mainBaseFrame(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// On crée une nouvelle instance de notre JDialog
				BaseFrame myWindow = new BaseFrame();
				myWindow.setVisible(true);// On la rend visible
			}
		});

	}

}
