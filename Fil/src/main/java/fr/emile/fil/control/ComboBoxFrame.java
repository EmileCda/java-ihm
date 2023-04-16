package fr.emile.fil.control;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



import fr.emile.fil.events.ActionButton1;
import fr.emile.fil.events.ActionButton2;
import fr.emile.fil.events.ActionButton3;

public class ComboBoxFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JComboBox<?> myCombo1;
	private JComboBox<?> myCombo2;
	JTextField textFieldCopi;
	//---------------attribut ---------------------

	//---------------conctructor ---------------------
	public ComboBoxFrame() {
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
	//---------------processing methode ---------------------
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
 
		Object[] fruitList = new Object[]{"Orange", "Banane", "Pomme", "Poire", "Pêche"};
 		this.myCombo1 = new JComboBox(fruitList);
 		panel.add(myCombo1);
 		panel.setBackground(Color.decode("#55AA00"));

 		this.textFieldCopi = new JTextField("default text");
 		this.textFieldCopi.setColumns(10); //On lui donne un nombre de colonnes à afficher
 		panel.add(this.textFieldCopi);
 		JButton bouton = new JButton(new ActionButton1(this, "Add"));

		panel.add(bouton);
 		JButton bouton2 = new JButton(new ActionButton2(this, "Delete"));
		panel.add(bouton2);
 
 		JButton bouton3 = new JButton(new ActionButton3(this, "CopieDelete"));
		panel.add(bouton3);
 
 
		return panel;
	}
	//----------- getter-Setter--------------------

	public JComboBox getMyCombo1() {
		return myCombo1;
	}

	public void setMyCombo1(JComboBox myCombo1) {
		this.myCombo1 = myCombo1;
	}

	public JComboBox getMyCombo2() {
		return myCombo2;
	}

	public void setMyCombo2(JComboBox myCombo2) {
		this.myCombo2 = myCombo2;
	}

	public JTextField getTextFieldCopi() {
		return textFieldCopi;
	}

	public void setTextFieldCopi(JTextField textFieldCopi) {
		this.textFieldCopi = textFieldCopi;
	}

}
