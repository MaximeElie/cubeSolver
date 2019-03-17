package com.maxurf.cubeSolver.cube;

import java.util.ArrayList;

public class Cube {
	
	private char front[][];
	private char right[][];
	private char back[][];
	private char left[][];
	private char up[][];
	private char down[][];
	
	private String moves;
	
	public Cube() {
		front = new char[3][3];
		right = new char[3][3];
		back = new char[3][3];
		left = new char[3][3];
		up = new char[3][3];
		down = new char[3][3];
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				front[i][j] = ' ';
				right[i][j] = ' ';
				back[i][j] = ' ';
				left[i][j] = ' ';
				up[i][j] = ' ';
				down[i][j] = ' ';
			}
		}
		
		moves = "";
	}
	
	public char color(char face, int x, int y) {
		if(face == 'F')
			return front[x][y];
		else if(face == 'R')
			return right[x][y];
		else if(face == 'B')
			return back[x][y];
		else if(face == 'L')
			return left[x][y];
		else if(face == 'U')
			return up[x][y];
		else if(face == 'D')
			return down[x][y];
		else
			return '0';
	}
	
	public void setColor(char face, int x, int y, char color) {
		if(face == 'F')
			front[x][y] = color;
		else if(face == 'R')
			right[x][y] = color;
		else if(face == 'B')
			back[x][y] = color;
		else if(face == 'L')
			left[x][y] = color;
		else if(face == 'U')
			up[x][y] = color;
		else if(face == 'D')
			down[x][y] = color;
	}
	
	private char[][] rotate(char[][] face, int n) {
		for(int i = 0 ; i < n ; i++) {
			char tmp[][] = getFace(face);
			face[2][2] = tmp[0][2];
			face[2][0] = tmp[2][2];
			face[0][0] = tmp[2][0];
			face[0][2] = tmp[0][0];
			face[1][2] = tmp[0][1];
			face[2][1] = tmp[1][2];
			face[1][0] = tmp[2][1];
			face[0][1] = tmp[1][0];
		}
		return face;
	}
	
	private void z(){
		Cube tmp = new Cube();
		tmp = this.getCube();
		up = tmp.left;
		right = tmp.up;
		down = tmp.right;
		left = tmp.down;
		front = rotate(front, 1);
		back = rotate(back, 3);
	}
	
	private void x() {
		Cube tmp = new Cube();
		tmp = this.getCube();
		up = tmp.front;
		back = tmp.up;
		down = tmp.back;
		down = rotate(down, 2);
		front = tmp.down;
		front = rotate(front, 2);
		right = rotate(right, 1);
		left = rotate(left, 3);
	}
	
	private void F() {
		front = rotate(front, 1);
		
		Cube tmp = new Cube();
		tmp = this.getCube();
		for(int i = 0 ; i < 3 ; i++) { up[i][0] = tmp.color('L', i, 0); }
		for(int i = 0 ; i < 3 ; i++) { right[i][0] = tmp.color('U', i, 0); }
		for(int i = 0 ; i < 3 ; i++) { down[i][0] = tmp.color('R', i, 0); }
		for(int i = 0 ; i < 3 ; i++) { left[i][0] = tmp.color('D', i, 0); }
	}
	
	private void R() { z(); x(); F(); x(); x(); x(); z(); z(); z(); }
	
	private void B() { x(); x(); F(); x(); x(); }
	
	private void L() { z(); x(); x(); x(); F(); x(); z(); z(); z(); }
	
	private void U() { x(); x(); x(); F(); x(); }
	
	private void D() { x(); F(); x(); x(); x(); }
	
	public void alg(String alg) {
		for(int i = 0 ; i < alg.length() ; i++) {
			if(i==0 && i!=alg.length()-1) {
				if(alg.charAt(0)=='F' && alg.charAt(1)==' ') { F(); }
				if(alg.charAt(0)=='F' && alg.charAt(1)=='\'') { F(); F(); F(); }
				if(alg.charAt(0)=='F' && alg.charAt(1)=='2') { F(); F(); }
				if(alg.charAt(0)=='R' && alg.charAt(1)==' ') { R(); }
				if(alg.charAt(0)=='R' && alg.charAt(1)=='\'') { R(); R(); R(); }
				if(alg.charAt(0)=='R' && alg.charAt(1)=='2') { R(); R(); }
				if(alg.charAt(0)=='B' && alg.charAt(1)==' ') { B(); }
				if(alg.charAt(0)=='B' && alg.charAt(1)=='\'') { B(); B(); B(); }
				if(alg.charAt(0)=='B' && alg.charAt(1)=='2') { B(); B(); }
				if(alg.charAt(0)=='L' && alg.charAt(1)==' ') { L(); }
				if(alg.charAt(0)=='L' && alg.charAt(1)=='\'') { L(); L(); L(); }
				if(alg.charAt(0)=='L' && alg.charAt(1)=='2') { L(); L(); }
				if(alg.charAt(0)=='U' && alg.charAt(1)==' ') { U(); }
				if(alg.charAt(0)=='U' && alg.charAt(1)=='\'') { U(); U(); U(); }
				if(alg.charAt(0)=='U' && alg.charAt(1)=='2') { U(); U(); }
				if(alg.charAt(0)=='D' && alg.charAt(1)==' ') { D(); }
				if(alg.charAt(0)=='D' && alg.charAt(1)=='\'') { D(); D(); D(); }
				if(alg.charAt(0)=='D' && alg.charAt(1)=='2') { D(); D(); }
			}
			else if(i==alg.length()-1) {
				if(alg.charAt(i)=='F') { F(); }
				if(alg.charAt(i)=='R') { R(); }
				if(alg.charAt(i)=='B') { B(); }
				if(alg.charAt(i)=='L') { L(); }
				if(alg.charAt(i)=='U') { U(); }
				if(alg.charAt(i)=='D') { D(); }
			}
			else if(alg.charAt(i)==' ' && i+1!=alg.length()-1) {
				if(alg.charAt(i+1)=='F' && alg.charAt(i+2)==' ') { F(); }
				if(alg.charAt(i+1)=='F' && alg.charAt(i+2)=='\'') { F(); F(); F(); }
				if(alg.charAt(i+1)=='F' && alg.charAt(i+2)=='2') { F(); F(); }
				if(alg.charAt(i+1)=='R' && alg.charAt(i+2)==' ') { R(); }
				if(alg.charAt(i+1)=='R' && alg.charAt(i+2)=='\'') { R(); R(); R(); }
				if(alg.charAt(i+1)=='R' && alg.charAt(i+2)=='2') { R(); R(); }
				if(alg.charAt(i+1)=='B' && alg.charAt(i+2)==' ') { B(); }
				if(alg.charAt(i+1)=='B' && alg.charAt(i+2)=='\'') { B(); B(); B(); }
				if(alg.charAt(i+1)=='B' && alg.charAt(i+2)=='2') { B(); B(); }
				if(alg.charAt(i+1)=='L' && alg.charAt(i+2)==' ') { L(); }
				if(alg.charAt(i+1)=='L' && alg.charAt(i+2)=='\'') { L(); L(); L(); }
				if(alg.charAt(i+1)=='L' && alg.charAt(i+2)=='2') { L(); L(); }
				if(alg.charAt(i+1)=='U' && alg.charAt(i+2)==' ') { U(); }
				if(alg.charAt(i+1)=='U' && alg.charAt(i+2)=='\'') { U(); U(); U(); }
				if(alg.charAt(i+1)=='U' && alg.charAt(i+2)=='2') { U(); U(); }
				if(alg.charAt(i+1)=='D' && alg.charAt(i+2)==' ') { D(); }
				if(alg.charAt(i+1)=='D' && alg.charAt(i+2)=='\'') { D(); D(); D(); }
				if(alg.charAt(i+1)=='D' && alg.charAt(i+2)=='2') { D(); D(); }
			}
		}
		
		if(moves == "")
			moves = alg;
		else
			moves += " " + alg;
	}
	
	public String getMoves() {
		reduceMoves();
		return moves;
	}
	
	public void resetMoves() {
		moves = "";
	}
	
	public Cube getCube() {
		Cube cube = new Cube();
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { cube.setColor('B', i, j, this.color('B', i, j)); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { cube.setColor('L', i, j, this.color('L', i, j)); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { cube.setColor('U', i, j, this.color('U', i, j)); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { cube.setColor('R', i, j, this.color('R', i, j)); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { cube.setColor('D', i, j, this.color('D', i, j)); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { cube.setColor('F', i, j, this.color('F', i, j)); } }
		return cube;
	}
	
	private char[][] getFace(char[][] face) {
		char face2[][] = new char[3][3];
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { face2[i][j] = face[i][j]; } }
		return face2;
	}
	
	public String scramble(int n) {		
		String scramble = new String("");
		int x = 0, xTmp = -1;
		for(int i = 0 ; i < n ; i++) {
			do {
				x = (int)(Math.random()*6);
			}while(x == xTmp);
			xTmp = x;
			switch(x) {
				case 0: scramble += "U"; break;
				case 1: scramble += "D"; break;
				case 2: scramble += "R"; break;
				case 3: scramble += "L"; break;
				case 4: scramble += "F"; break;
				case 5: scramble += "B"; break;
			}
			
			x = (int)(Math.random()*3);
			switch(x) {
				case 0: scramble += " "; break;
				case 1: scramble += "' "; break;
				case 2: scramble += "2 "; break;
			}
		}
		
		reset();
		this.alg(scramble);
		this.resetMoves();
		return scramble;
	}
	
	public void reduceMoves() {
		boolean end = false;
		
		while(!end) {
		ArrayList<String> tab = new ArrayList<String>();
		moves+=" ";
		for(int i = 0 ; i < moves.length()-1 ; i++) {
			if(moves.charAt(i)=='U' && moves.charAt(i+1)==' ') tab.add("U");
			if(moves.charAt(i)=='U' && moves.charAt(i+1)=='\'') tab.add("U'");
			if(moves.charAt(i)=='U' && moves.charAt(i+1)=='2') tab.add("U2");
			if(moves.charAt(i)=='D' && moves.charAt(i+1)==' ') tab.add("D");
			if(moves.charAt(i)=='D' && moves.charAt(i+1)=='\'') tab.add("D'");
			if(moves.charAt(i)=='D' && moves.charAt(i+1)=='2') tab.add("D2");
			if(moves.charAt(i)=='R' && moves.charAt(i+1)==' ') tab.add("R");
			if(moves.charAt(i)=='R' && moves.charAt(i+1)=='\'') tab.add("R'");
			if(moves.charAt(i)=='R' && moves.charAt(i+1)=='2') tab.add("R2");
			if(moves.charAt(i)=='L' && moves.charAt(i+1)==' ') tab.add("L");
			if(moves.charAt(i)=='L' && moves.charAt(i+1)=='\'') tab.add("L'");
			if(moves.charAt(i)=='L' && moves.charAt(i+1)=='2') tab.add("L2");
			if(moves.charAt(i)=='F' && moves.charAt(i+1)==' ') tab.add("F");
			if(moves.charAt(i)=='F' && moves.charAt(i+1)=='\'') tab.add("F'");
			if(moves.charAt(i)=='F' && moves.charAt(i+1)=='2') tab.add("F2");
			if(moves.charAt(i)=='B' && moves.charAt(i+1)==' ') tab.add("B");
			if(moves.charAt(i)=='B' && moves.charAt(i+1)=='\'') tab.add("B'");
			if(moves.charAt(i)=='B' && moves.charAt(i+1)=='2') tab.add("B2");
		}
		
		resetMoves();
		end = true;
		
		for(int i = 0 ; i < tab.size() ; i++) {
			if(i < tab.size()-1) {
			if(tab.get(i)=="U" && tab.get(i+1)=="U") { moves+="U2 "; i++; end=false; }
			else if(tab.get(i)=="U'" && tab.get(i+1)=="U'") { moves+="U2 "; i++; end=false; }
			else if(tab.get(i)=="U" && tab.get(i+1)=="U'") { i++; end=false; }
			else if(tab.get(i)=="U'" && tab.get(i+1)=="U") { i++; end=false; }
			else if(tab.get(i)=="U2" && tab.get(i+1)=="U2") { i++; end=false; }
			else if(tab.get(i)=="U2" && tab.get(i+1)=="U") { moves+="U' "; i++; end=false; }
			else if(tab.get(i)=="U" && tab.get(i+1)=="U2") { moves+="U' "; i++; end=false; }
			else if(tab.get(i)=="U2" && tab.get(i+1)=="U'") { moves+="U "; i++; end=false; }
			else if(tab.get(i)=="U'" && tab.get(i+1)=="U2") { moves+="U "; i++; end=false; }
			else if(tab.get(i)=="D" && tab.get(i+1)=="D") { moves+="D2 "; i++; end=false; }
			else if(tab.get(i)=="D'" && tab.get(i+1)=="D'") { moves+="D2 "; i++; end=false; }
			else if(tab.get(i)=="D" && tab.get(i+1)=="D'") { i++; end=false; }
			else if(tab.get(i)=="D'" && tab.get(i+1)=="D") { i++; end=false; }
			else if(tab.get(i)=="D2" && tab.get(i+1)=="D2") { i++; end=false; }
			else if(tab.get(i)=="D2" && tab.get(i+1)=="D") { moves+="D' "; i++; end=false; }
			else if(tab.get(i)=="D" && tab.get(i+1)=="D2") { moves+="D' "; i++; end=false; }
			else if(tab.get(i)=="D2" && tab.get(i+1)=="D'") { moves+="D "; i++; end=false; }
			else if(tab.get(i)=="D'" && tab.get(i+1)=="D2") { moves+="D "; i++; end=false; }
			else if(tab.get(i)=="R" && tab.get(i+1)=="R") { moves+="R2 "; i++; end=false; }
			else if(tab.get(i)=="R'" && tab.get(i+1)=="R'") { moves+="R2 "; i++; end=false; }
			else if(tab.get(i)=="R" && tab.get(i+1)=="R'") { i++; end=false; }
			else if(tab.get(i)=="R'" && tab.get(i+1)=="R") { i++; end=false; }
			else if(tab.get(i)=="R2" && tab.get(i+1)=="R2") { i++; end=false; }
			else if(tab.get(i)=="R2" && tab.get(i+1)=="R") { moves+="R' "; i++; end=false; }
			else if(tab.get(i)=="R" && tab.get(i+1)=="R2") { moves+="R' "; i++; end=false; }
			else if(tab.get(i)=="R2" && tab.get(i+1)=="R'") { moves+="R "; i++; end=false; }
			else if(tab.get(i)=="R'" && tab.get(i+1)=="R2") { moves+="R "; i++; end=false; }
			else if(tab.get(i)=="L" && tab.get(i+1)=="L") { moves+="L2 "; i++; end=false; }
			else if(tab.get(i)=="L'" && tab.get(i+1)=="L'") { moves+="L2 "; i++; end=false; }
			else if(tab.get(i)=="L" && tab.get(i+1)=="L'") { i++; end=false; }
			else if(tab.get(i)=="L'" && tab.get(i+1)=="L") { i++; end=false; }
			else if(tab.get(i)=="L2" && tab.get(i+1)=="L2") { i++; end=false; }
			else if(tab.get(i)=="L2" && tab.get(i+1)=="L") { moves+="L' "; i++; end=false; }
			else if(tab.get(i)=="L" && tab.get(i+1)=="L2") { moves+="L' "; i++; end=false; }
			else if(tab.get(i)=="L2" && tab.get(i+1)=="L'") { moves+="L "; i++; end=false; }
			else if(tab.get(i)=="L'" && tab.get(i+1)=="L2") { moves+="L "; i++; end=false; }
			else if(tab.get(i)=="F" && tab.get(i+1)=="F") { moves+="F2 "; i++; end=false; }
			else if(tab.get(i)=="F'" && tab.get(i+1)=="F'") { moves+="F2 "; i++; end=false; }
			else if(tab.get(i)=="F" && tab.get(i+1)=="F'") { i++; end=false; }
			else if(tab.get(i)=="F'" && tab.get(i+1)=="F") { i++; end=false; }
			else if(tab.get(i)=="F2" && tab.get(i+1)=="F2") { i++; end=false; }
			else if(tab.get(i)=="F2" && tab.get(i+1)=="F") { moves+="F' "; i++; end=false; }
			else if(tab.get(i)=="F" && tab.get(i+1)=="F2") { moves+="F' "; i++; end=false; }
			else if(tab.get(i)=="F2" && tab.get(i+1)=="F'") { moves+="F "; i++; end=false; }
			else if(tab.get(i)=="F'" && tab.get(i+1)=="F2") { moves+="F "; i++; end=false; }
			else if(tab.get(i)=="B" && tab.get(i+1)=="B") { moves+="B2 "; i++; end=false; }
			else if(tab.get(i)=="B'" && tab.get(i+1)=="B'") { moves+="B2 "; i++; end=false; }
			else if(tab.get(i)=="B" && tab.get(i+1)=="B'") { i++; end=false; }
			else if(tab.get(i)=="B'" && tab.get(i+1)=="B") { i++; end=false; }
			else if(tab.get(i)=="B2" && tab.get(i+1)=="B2") { i++; end=false; }
			else if(tab.get(i)=="B2" && tab.get(i+1)=="B") { moves+="B' "; i++; end=false; }
			else if(tab.get(i)=="B" && tab.get(i+1)=="B2") { moves+="B' "; i++; end=false; }
			else if(tab.get(i)=="B2" && tab.get(i+1)=="B'") { moves+="B "; i++; end=false; }
			else if(tab.get(i)=="B'" && tab.get(i+1)=="B2") { moves+="B "; i++; end=false; }
			else moves+=(tab.get(i)+" ");
			}
			else moves+=(tab.get(i)+" ");
		}
		}
	}
	
	public void reset() {
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { this.setColor('B', i, j, 'o'); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { this.setColor('L', i, j, 'b'); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { this.setColor('U', i, j, 'y'); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { this.setColor('R', i, j, 'g'); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { this.setColor('D', i, j, 'w'); } }
		for(int i = 0 ; i < 3 ; i++) { for(int j = 0 ; j < 3 ; j++) { this.setColor('F', i, j, 'r'); } }
		
		resetMoves();
	}
}
