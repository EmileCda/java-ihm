package fr.emile.fil.entity;

import javax.swing.JFrame;

public class SimpleWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public SimpleWindow() {
		super();
		this.init();
	}

	private void init() {
		setTitle("My first window"); 
		setSize(320, 240); // window size
		setLocationRelativeTo(null); // 
		setResizable(true); //  no -resizable 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
	}
}
