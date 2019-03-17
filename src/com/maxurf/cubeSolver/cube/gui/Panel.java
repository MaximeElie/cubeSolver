package com.maxurf.cubeSolver.cube.gui;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color; 
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

import com.maxurf.cubeSolver.cube.*;
import com.maxurf.cubeSolver.solve.*;
import com.maxurf.cubeSolver.cube.gui.listeners.*;

public class Panel extends JPanel implements MouseWheelListener {
	private Cube cube;
	private char[] colors = {'o','b','y','g','w','r'};
	private JButton b_solve, b_reset, b_scramble;
	private JTextArea text, alg;
	private ActionListener resetListener, scrambleListener, solveListener;
	
	public Panel(JTextArea text, JTextArea alg) {
		cube = new Cube();
		cube.reset();
		
		resetListener = new ResetListener(this);
		scrambleListener = new ScrambleListener(this);
		solveListener = new SolveListener(this);
		
		b_solve = new JButton("solve");
		b_solve.setBounds(275, 600, 200, 50);
		b_solve.addActionListener(solveListener);
		
		b_reset = new JButton("reset");
		b_reset.setBounds(600, 50, 100, 50);
		b_reset.addActionListener(resetListener);
		
		b_scramble = new JButton("scramble");
		b_scramble.setBounds(600, 110, 100, 50);
		b_scramble.addActionListener(scrambleListener);
		
		this.text = text;
		this.alg = alg;
		
		this.setLayout(null);
		this.add(b_solve);
		this.add(b_reset);
		this.add(b_scramble);
		this.addMouseWheelListener(this);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0,0,750,750);
		
		drawFace(g, 'B', 225, 75);
		drawFace(g, 'L', 75, 225);
		drawFace(g, 'U', 225, 225);
		drawFace(g, 'R', 375, 225);
		drawFace(g, 'D', 525, 225);
		drawFace(g, 'F', 225, 375);	
	}
	
	private void setColorDraw(Graphics g, char c) {
		switch(c) {
			case 'o': g.setColor(new Color(255, 150, 40)); break;
			case 'b': g.setColor(new Color(40, 40, 255)); break;
			case 'y': g.setColor(new Color(255, 255, 40)); break;
			case 'g': g.setColor(new Color(40, 255, 40)); break;
			case 'w': g.setColor(Color.white); break;
			case 'r': g.setColor(new Color(255, 40, 40)); break;
		}
	}
	
	private void drawRectangle(Graphics g, int x, int y, int width, int height, int thickness) {
		g.drawRect(x, y, width, height);
		if (thickness > 1) {
			drawRectangle(g, x + 1, y + 1, width - 2, height - 2, thickness - 1);
		}
	}
	
	private void drawFace(Graphics g, char color, int x, int y) {
		for(int i = 0 ; i <= 2 ; i++) {
			for(int j = 2 ; j >= 0 ; j--) {
				setColorDraw(g, cube.color(color,i,2-j));
				g.fillRect(x+(50*i), y+(50*j), 49, 49);
				g.setColor(Color.black);
				g.drawRect(x+(50*i), y+(50*j), 49, 49);
			}
		}
		drawRectangle(g, x-2, y-2, 153, 153, 4);
	}
	
	public void mouseWheelMoved(MouseWheelEvent e) {
		int indexColor;
		int posFaceX, posFaceY;
		int posCaseX, posCaseY;
		char face;
		
		if(e.getX() > 225 && e.getX() < 375 && e.getY() > 75 && e.getY() < 225) { face='B'; posFaceX=225; posFaceY=75; }
		else if(e.getX() > 75 && e.getX() < 225 && e.getY() > 225 && e.getY() < 375) { face='L'; posFaceX=75; posFaceY=225; }
		else if(e.getX() > 225 && e.getX() < 375 && e.getY() > 225 && e.getY() < 375) { face='U'; posFaceX=225; posFaceY=225; }
		else if(e.getX() > 375 && e.getX() < 525 && e.getY() > 225 && e.getY() < 375) { face='R'; posFaceX=375; posFaceY=225; }
		else if(e.getX() > 525 && e.getX() < 675 && e.getY() > 225 && e.getY() < 375) { face='D'; posFaceX=525; posFaceY=225; }
		else if(e.getX() > 225 && e.getX() < 375 && e.getY() > 375 && e.getY() < 525) { face='F'; posFaceX=225; posFaceY=375; }
		else return;
		
		posCaseX = (e.getX()-posFaceX)/50;
		posCaseY = 2-((e.getY()-posFaceY)/50);
		
		if(posCaseX==1 && posCaseY==1) return;
		
		indexColor=-1;
		for(int i = 0 ; i < 6 ; i++) {
			if(colors[i]==cube.color(face,posCaseX,posCaseY)) indexColor = i;
		}
		if(indexColor==-1) { System.out.println("ERROR"); return; }
		
		indexColor -= e.getWheelRotation();
		if(indexColor<0) indexColor=5;
		else if(indexColor>5) indexColor=0;
		
		cube.setColor(face,posCaseX,posCaseY,colors[indexColor]);
		
		repaint();
	}

	public void solve() {
		alg.setText("");
		Cube tmp = cube.getCube();
		if(Solve.solve(tmp)) {
			int nb = 0;
			for(int i = 0 ; i < tmp.getMoves().length() ; i++) {
				if(tmp.getMoves().charAt(i)=='U'||tmp.getMoves().charAt(i)=='D'||tmp.getMoves().charAt(i)=='R'
				|| tmp.getMoves().charAt(i)=='L'||tmp.getMoves().charAt(i)=='F'||tmp.getMoves().charAt(i)=='B')
					nb++;
			}
			
			if(nb>0) {
				text.setText("Voici les mouvements \u00e0 effectuer pour r\u00e9soudre votre rubik's cube ("+nb+"):");
				alg.setText(tmp.getMoves());
			}
			else text.setText("Ce Rubik's cube est d\u00e9j\u00e0 r\u00e9solu !");
		}
		else text.setText("Vous avez fait une erreur lors de la saisi des couleurs.");
		
		repaint();
	}
	
	public void reset() {
		cube.reset();
		text.setText("");
		alg.setText("");
		repaint();
	}
	
	public void scramble() {
		cube.scramble(20);
		text.setText("");
		alg.setText("");
		repaint();
	}
}