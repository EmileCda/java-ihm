package fr.emile.fil.entity;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BaseFrame extends JFrame  implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JButton bouton;
	private JButton bouton2;

	public BaseFrame() {
		super();
		this.init();
	}

	private void init() {
		setTitle("My first window"); 
		setSize(400, 200); // window size
		setLocationRelativeTo(null); // 
		setResizable(true); //  no -resizable 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);
		JLabel label = new JLabel("Welcome to my humble application");
	 
		panel.add(label);
	 
		this.bouton = new JButton("Cliquez ici !");
		bouton.addActionListener(this);
		panel.add(bouton);
 
		this.bouton2 = new JButton("Ou là !");
		bouton2.addActionListener(this);
		panel.add(bouton2);
		return panel;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.printf("Clic\n");
		
		Object source = e.getSource();
		 
		if(source == this.bouton){
			System.out.println("Vous avez cliqué ici.");
		} else if(source == this.bouton2){
			System.out.println("Vous avez cliqué là.");	
		}
		 
	}
}
