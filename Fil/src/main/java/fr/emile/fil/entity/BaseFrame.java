package fr.emile.fil.entity;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.emile.fil.events.HereAction;
import fr.emile.fil.events.ThereAction;

public class BaseFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton bouton;
	private JButton bouton2;
	private JLabel resultLabel ;
	JTextField textFieldOriginal;
	JTextField textFieldCopi;


	public BaseFrame() {
		
		
		
		super();
		this.init();
	}

	private void init() {
		setTitle("Calculator"); 
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
	 
		
		this.bouton = new JButton(new HereAction(this,"click Here"));
		panel.add(bouton);
 
		this.bouton2 = new JButton(new ThereAction(this, "click There !"));
		panel.add(bouton2);

		this.resultLabel= new JLabel("no result yet");
		panel.add(this.resultLabel);
		
		this.textFieldOriginal = new JTextField("copy text");
		this.textFieldOriginal.setColumns(10); //On lui donne un nombre de colonnes à afficher
 		panel.add(this.textFieldOriginal);

 		this.textFieldCopi = new JTextField("default text");
 		this.textFieldCopi.setColumns(10); //On lui donne un nombre de colonnes à afficher
 		panel.add(this.textFieldCopi);


		return panel;
	}

	public JButton getBouton() {
		return bouton;
	}

	public void setBouton(JButton bouton) {
		this.bouton = bouton;
	}

	public JButton getBouton2() {
		return bouton2;
	}

	public void setBouton2(JButton bouton2) {
		this.bouton2 = bouton2;
	}

	public JLabel getResultLabel() {
		return resultLabel;
	}

	public void setResultLabel(JLabel resultLabel) {
		this.resultLabel = resultLabel;
	}

	public JTextField getTextFieldOriginal() {
		return textFieldOriginal;
	}

	public void setTextFieldOriginal(JTextField textFieldOriginal) {
		this.textFieldOriginal = textFieldOriginal;
	}

	public JTextField getTextFieldCopi() {
		return textFieldCopi;
	}

	public void setTextFieldCopi(JTextField textFieldCopi) {
		this.textFieldCopi = textFieldCopi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
