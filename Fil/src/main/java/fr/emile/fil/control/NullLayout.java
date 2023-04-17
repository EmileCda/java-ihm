package fr.emile.fil.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class NullLayout extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField textResult;
	private NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
	private double operande1 ; 
	private double operande2 ; 
	private char operation ; 


	private JButton buttonList[][] = { { new JButton("AC"), new JButton("+/-"), new JButton("%"), new JButton("/") },
			{ new JButton("7"), new JButton("8"), new JButton("9"), new JButton("*") },
			{ new JButton("4"), new JButton("5"), new JButton("6"), new JButton("-") },
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

		String stringList[][] = { { "AC", "+/-", "%", "/" }, { "7", "8", "9", "*" }, { "4", "5", "6", "-" },
				{ "1", "2", "3", "+" }, { "0", "", ",", "=" } };

		JPanel panel = new JPanel();
		this.textResult = new JTextField();
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
	public void actionPerformed(ActionEvent actionEvent) {

		switch (actionEvent.getActionCommand()) {
		case "AC":
			this.textResult.setText("");
			break;
		case "+/-":
			Number number;
			try {
				number = this.format.parse(this.textResult.getText());
				this.textResult.setText(String.format("%f", -number.doubleValue()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "%":
			this.getOperande1();
			this.setOperation('%');
			System.out.println("%");
			break;
		case "/":
			this.getOperande1();
			this.setOperation('/');
			System.out.println("/");
			break;
		case "*":
			this.getOperande1();
			this.setOperation('*');
			System.out.println("*");
			break;
		case "-":
			this.getOperande1();
			this.setOperation('-');
			System.out.println("-");
			break;
		case "+":
			this.getOperande1();
			this.setOperation('+');
			System.out.println("+");
			break;
		case "=":
			this.getOperande2();
			this.setOperation('=');
			System.out.printf("%f %c %f = ?", this.getOperande1(),this.getOperation(),this.getOperande2());
			double result = this.calculate();
			this.textResult.setText(String.format("%f", result));
			System.out.printf("%f %c %f = %f", this.getOperande1(),this.getOperation(),this.getOperande2(),result);
			
			break;
		default:
			this.textResult.setText(this.textResult.getText() + actionEvent.getActionCommand());
			break;

		}

	}
	public void getOperand1() {
			String result = this.getTextResult().getText();
			System.out.println(result);
			Double number=  Double.parseDouble(this.textResult.getText());
			System.out.println(number);
			this.setOperande1( number);
			
	}

	public double calculate() {
		
		double result = 0 ; 
		switch (this.getOperation()) {
		case '+':  result = this.getOperande1() + this.getOperande2() ;
		break;
		case '-':  result = this.getOperande1() - this.getOperande2();
		break;
		case '/':  result = this.getOperande1() / this.getOperande2();
		break;
		case '*':  result = this.getOperande1() *  this.getOperande2();
		break;
		case '%':  result = this.getOperande1() %  this.getOperande2();
		break;

		default:
			break;
		}
		this.setOperande1(0);
		this.setOperande2(0);
		this.setOperation('=');
		return result;
	}

	public double getOperande1() {
		System.out.println("getOperande1");
		String result = this.getTextResult().getText();
		System.out.println(result);
		Double number=  Double.parseDouble(this.textResult.getText());
		
		this.setOperande1( number);
		this.getTextResult().setText("");
		return operande1;
	}

	public void setOperande1(double operande1) {
		System.out.println(operande1);
		this.operande1 = operande1;
	}

	public double getOperande2() {
		System.out.println("getOperande2");
		String result = this.getTextResult().getText();
		System.out.println(result);
		Double number=  Double.parseDouble(this.textResult.getText());
		
		this.setOperande2( number);
		this.getTextResult().setText("");
		return operande2;
	}

	public void setOperande2(double operande2) {
		this.operande2 = operande2;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		System.out.println("setOperation");
		this.operation = operation;
	}

	public JTextField getTextResult() {
		return textResult;
	}

	public void setTextResult(JTextField textResult) {
		this.textResult = textResult;
	}

}
