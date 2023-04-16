package fr.emile.fil.control;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class NullLayout extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton buttonList[][]= { { new JButton("AC"), new JButton("+/-"), new JButton("%"),new JButton( "/") },
			{ new JButton("7"), new JButton("8"), new JButton("9"),new JButton( "x") }, 
			{ new JButton("4"), new JButton("5"),new JButton( "6"), new JButton("-") },
			{ new JButton("1"), new JButton("2"), new JButton("3"), new JButton("+") }, 
			{ new JButton("0"), new JButton("0"), new JButton(","), new JButton("=") } };
			
	public NullLayout() {
		super();
		this.init();
	}

	private void init() {
		setTitle("Calculator");
		setSize(240, 217); // window size
		setLocationRelativeTo(null); //
		setResizable(true); // no -resizable
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}

	private JPanel buildContentPane() {

		String stringList[][] = { { "AC", "+/-", "%", "/" }, { "7", "8", "9", "x" }, { "4", "5", "6", "-" },
				{ "1", "2", "3", "+" }, { "0", "", ",", "=" } };

		JPanel panel = new JPanel();
		JTextField textResult = new JTextField("0");
		textResult.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(textResult);
		textResult.setBounds(0, 0, 240, 30);
		textResult.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume(); // if it's not a number, ignore the event
				}
			}
		});

		// pas de layout manager pour cette fenêtre :
		// on positionnera les composants à la min
		panel.setLayout(null);
		int width = 60;
		int height = 30;

		int posXInit = 0;
		int posYInit = height;
		int posX = posXInit;
		int posY = posYInit;

		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 4; column++) {

				panel.add(buttonList[row][column]);
				buttonList[row][column].addActionListener(this);
				posX = posXInit + (column * width);
				posY = posYInit + (row * height);

				if (stringList[row][column].equals("0")) {
					buttonList[row][column].setBounds(posX, posY, width * 2, height);
				} else {
					buttonList[row][column].setBounds(posX, posY, width, height);

				}
			}
		}

		// dimensionnement en affichage de la fenêtre
		panel.setVisible(true);

		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getActionCommand();
		System.out.printf("button Clic %s\n", source);

	}

}
