package com.maxurf.cubeSolver.solve;

import com.maxurf.cubeSolver.cube.*;

class SolveWCorners implements SolveChange {

	public boolean solve(Cube cube) {
		
		if(!(cube.color('F',2,0)=='r'&&cube.color('R',2,0)=='g'&&cube.color('D',0,0)=='w')) {
		for(int i = 0 ; i < 4 ; i++) { cube.alg("D");
			if(cube.color('F',2,0)=='w'&&cube.color('R',2,0)=='r'&&cube.color('D',0,0)=='g') cube.alg("R U R' U'");
			if(cube.color('F',2,0)=='g'&&cube.color('R',2,0)=='w'&&cube.color('D',0,0)=='r') cube.alg("R U R' U'");
			if(cube.color('F',2,0)=='r'&&cube.color('R',2,0)=='g'&&cube.color('D',0,0)=='w') cube.alg("R U R' U'");
		} 
		for(int i = 0 ; i < 4 ; i++) { cube.alg("U");
			if(cube.color('F',2,2)=='r'&&cube.color('R',0,0)=='w'&&cube.color('U',2,0)=='g') cube.alg("R U R' U'");
			if(cube.color('F',2,2)=='g'&&cube.color('R',0,0)=='r'&&cube.color('U',2,0)=='w') cube.alg("R U R' U' R U R' U' R U R' U'");
			if(cube.color('F',2,2)=='w'&&cube.color('R',0,0)=='g'&&cube.color('U',2,0)=='r') cube.alg("R U R' U' R U R' U' R U R' U' R U R' U' R U R' U'");
		} }
		
		
		if(!(cube.color('R',2,2)=='g'&&cube.color('B',2,2)=='o'&&cube.color('D',0,2)=='w')) {
		for(int i = 0 ; i < 4 ; i++) { cube.alg("D");
			if(cube.color('F',2,0)=='w'&&cube.color('R',2,0)=='g'&&cube.color('D',0,0)=='o') cube.alg("R U R' U'");
			if(cube.color('F',2,0)=='o'&&cube.color('R',2,0)=='w'&&cube.color('D',0,0)=='g') cube.alg("R U R' U'");
			if(cube.color('F',2,0)=='g'&&cube.color('R',2,0)=='o'&&cube.color('D',0,0)=='w') cube.alg("R U R' U'");
		}
		cube.alg("D'");
		for(int i = 0 ; i < 4 ; i++) { cube.alg("U");
			if(cube.color('F',2,2)=='g'&&cube.color('R',0,0)=='w'&&cube.color('U',2,0)=='o') cube.alg("R U R' U'");
			if(cube.color('F',2,2)=='o'&&cube.color('R',0,0)=='g'&&cube.color('U',2,0)=='w') cube.alg("R U R' U' R U R' U' R U R' U'");
			if(cube.color('F',2,2)=='w'&&cube.color('R',0,0)=='o'&&cube.color('U',2,0)=='g') cube.alg("R U R' U' R U R' U' R U R' U' R U R' U' R U R' U'");
		}
		cube.alg("D"); }
		

		if(!(cube.color('B',0,2)=='o'&&cube.color('L',0,2)=='b'&&cube.color('D',2,2)=='w')) {
		for(int i = 0 ; i < 4 ; i++) { cube.alg("D");
			if(cube.color('F',2,0)=='w'&&cube.color('R',2,0)=='o'&&cube.color('D',0,0)=='b') cube.alg("R U R' U'");
			if(cube.color('F',2,0)=='b'&&cube.color('R',2,0)=='w'&&cube.color('D',0,0)=='o') cube.alg("R U R' U'");
			if(cube.color('F',2,0)=='o'&&cube.color('R',2,0)=='b'&&cube.color('D',0,0)=='w') cube.alg("R U R' U'");
		}
		cube.alg("D2");
		for(int i = 0 ; i < 4 ; i++) { cube.alg("U");
			if(cube.color('F',2,2)=='o'&&cube.color('R',0,0)=='w'&&cube.color('U',2,0)=='b') cube.alg("R U R' U'");
			if(cube.color('F',2,2)=='b'&&cube.color('R',0,0)=='o'&&cube.color('U',2,0)=='w') cube.alg("R U R' U' R U R' U' R U R' U'");
			if(cube.color('F',2,2)=='w'&&cube.color('R',0,0)=='b'&&cube.color('U',2,0)=='o') cube.alg("R U R' U' R U R' U' R U R' U' R U R' U' R U R' U'");
		}
		cube.alg("D2"); }
		
		
		if(!(cube.color('L',0,0)=='b'&&cube.color('F',0,0)=='r'&&cube.color('D',2,0)=='w')) {
		for(int i = 0 ; i < 4 ; i++) { cube.alg("D");
			if(cube.color('F',2,0)=='w'&&cube.color('R',2,0)=='b'&&cube.color('D',0,0)=='r') cube.alg("R U R' U'");
			if(cube.color('F',2,0)=='r'&&cube.color('R',2,0)=='w'&&cube.color('D',0,0)=='b') cube.alg("R U R' U'");
			if(cube.color('F',2,0)=='b'&&cube.color('R',2,0)=='r'&&cube.color('D',0,0)=='w') cube.alg("R U R' U'");
		}
		cube.alg("D");
		for(int i = 0 ; i < 4 ; i++) { cube.alg("U");
			if(cube.color('F',2,2)=='b'&&cube.color('R',0,0)=='w'&&cube.color('U',2,0)=='r') cube.alg("R U R' U'");
			if(cube.color('F',2,2)=='r'&&cube.color('R',0,0)=='b'&&cube.color('U',2,0)=='w') cube.alg("R U R' U' R U R' U' R U R' U'");
			if(cube.color('F',2,2)=='w'&&cube.color('R',0,0)=='r'&&cube.color('U',2,0)=='b') cube.alg("R U R' U' R U R' U' R U R' U' R U R' U' R U R' U'");
		}
		cube.alg("D'"); }
		
		return test(cube);
	}

	public static boolean test(Cube cube) {
		
		if(SolveWCross.test(cube)
		&& cube.color('D', 0, 0)=='w'
		&& cube.color('D', 2, 0)=='w'
		&& cube.color('D', 2, 2)=='w'
		&& cube.color('D', 0, 2)=='w'
		&& cube.color('F', 0, 0)=='r'
		&& cube.color('F', 2, 0)=='r'
		&& cube.color('R', 2, 0)=='g'
		&& cube.color('R', 2, 2)=='g'
		&& cube.color('B', 2, 2)=='o'
		&& cube.color('B', 0, 2)=='o'
		&& cube.color('L', 0, 2)=='b'
		&& cube.color('L', 0, 0)=='b')
			return true;
		
		return false;
	}
}
