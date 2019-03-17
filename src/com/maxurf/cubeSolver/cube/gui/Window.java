package com.maxurf.cubeSolver.cube.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Window extends JFrame {
	
	public Window() {
		this.setTitle("Cube solver");
		this.setSize(750, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JTextArea text = new JTextArea(1, 67);
		JTextArea alg = new JTextArea(6, 67);
		alg.setLineWrap(true);
		alg.setWrapStyleWord(true);
		
		JPanel textArea = new JPanel();
		Panel pan = new Panel(text, alg);
		
		this.getContentPane().add(pan);
		this.getContentPane().add(textArea, "South");
		textArea.add(text);
		textArea.add(new JScrollPane(alg));
		
		this.setVisible(true);
	}
}