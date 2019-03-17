package com.maxurf.cubeSolver.solve;

import com.maxurf.cubeSolver.cube.*;

class SolveLayer2 implements SolveChange {

	public boolean solve(Cube cube) {
		if(cube.color('F', 2, 1)=='g' && cube.color('R', 1, 0)=='r') cube.alg("R U' R' U' F' U F");
		if(cube.color('R', 1, 2)=='r' && cube.color('B', 2, 1)=='g') cube.alg("B U' B' U' R' U R");
		if(cube.color('R', 1, 2)=='g' && cube.color('B', 2, 1)=='r') cube.alg("B U' B' U' R' U R");
		if(cube.color('B', 0, 1)=='r' && cube.color('L', 1, 2)=='g') cube.alg("L U' L' U' B' U B");
		if(cube.color('B', 0, 1)=='g' && cube.color('L', 1, 2)=='r') cube.alg("L U' L' U' B' U B");
		if(cube.color('L', 1, 0)=='r' && cube.color('F', 0, 1)=='g') cube.alg("F U' F' U' L' U L");
		if(cube.color('L', 1, 0)=='g' && cube.color('F', 0, 1)=='r') cube.alg("F U' F' U' L' U L");
		for(int i = 0 ; i < 4 ; i++) {
			cube.alg("U");
			if(cube.color('F', 1, 2)=='r' && cube.color('U', 1, 0)=='g') cube.alg("U R U' R' U' F' U F");
			if(cube.color('R', 0, 1)=='g' && cube.color('U', 2, 1)=='r') cube.alg("U' F' U F U R U' R'");
		}
		
		
		if(cube.color('F', 2, 1)=='g' && cube.color('R', 1, 0)=='o') cube.alg("R U' R' U' F' U F");
		if(cube.color('F', 2, 1)=='o' && cube.color('R', 1, 0)=='g') cube.alg("R U' R' U' F' U F");
		if(cube.color('R', 1, 2)=='o' && cube.color('B', 2, 1)=='g') cube.alg("B U' B' U' R' U R");
		if(cube.color('B', 0, 1)=='g' && cube.color('L', 1, 2)=='o') cube.alg("L U' L' U' B' U B");
		if(cube.color('B', 0, 1)=='o' && cube.color('L', 1, 2)=='g') cube.alg("L U' L' U' B' U B");
		if(cube.color('L', 1, 0)=='g' && cube.color('F', 0, 1)=='o') cube.alg("F U' F' U' L' U L");
		if(cube.color('L', 1, 0)=='o' && cube.color('F', 0, 1)=='g') cube.alg("F U' F' U' L' U L");
		for(int i = 0 ; i < 4 ; i++) {
			cube.alg("U");
			if(cube.color('R', 0, 1)=='g' && cube.color('U', 2, 1)=='o') cube.alg("U B U' B' U' R' U R");
			if(cube.color('B', 1, 0)=='o' && cube.color('U', 1, 2)=='g') cube.alg("U' R' U R U B U' B'");
		}
		
		
		if(cube.color('F', 2, 1)=='o' && cube.color('R', 1, 0)=='b') cube.alg("R U' R' U' F' U F");
		if(cube.color('F', 2, 1)=='b' && cube.color('R', 1, 0)=='o') cube.alg("R U' R' U' F' U F");
		if(cube.color('R', 1, 2)=='o' && cube.color('B', 2, 1)=='b') cube.alg("B U' B' U' R' U R");
		if(cube.color('R', 1, 2)=='b' && cube.color('B', 2, 1)=='o') cube.alg("B U' B' U' R' U R");
		if(cube.color('B', 0, 1)=='b' && cube.color('L', 1, 2)=='o') cube.alg("L U' L' U' B' U B");
		if(cube.color('L', 1, 0)=='o' && cube.color('F', 0, 1)=='b') cube.alg("F U' F' U' L' U L");
		if(cube.color('L', 1, 0)=='b' && cube.color('F', 0, 1)=='o') cube.alg("F U' F' U' L' U L");
		for(int i = 0 ; i < 4 ; i++) {
			cube.alg("U");
			if(cube.color('B', 1, 0)=='o' && cube.color('U', 1, 2)=='b') cube.alg("U L U' L' U' B' U B");
			if(cube.color('L', 2, 1)=='b' && cube.color('U', 0, 1)=='o') cube.alg("U' B' U B U L U' L' ");
		}
		
		
		if(cube.color('F', 2, 1)=='b' && cube.color('R', 1, 0)=='r') cube.alg("R U' R' U' F' U F");
		if(cube.color('F', 2, 1)=='r' && cube.color('R', 1, 0)=='b') cube.alg("R U' R' U' F' U F");
		if(cube.color('R', 1, 2)=='b' && cube.color('B', 2, 1)=='r') cube.alg("B U' B' U' R' U R");
		if(cube.color('R', 1, 2)=='r' && cube.color('B', 2, 1)=='b') cube.alg("B U' B' U' R' U R");
		if(cube.color('B', 0, 1)=='b' && cube.color('L', 1, 2)=='r') cube.alg("L U' L' U' B' U B");
		if(cube.color('B', 0, 1)=='r' && cube.color('L', 1, 2)=='b') cube.alg("L U' L' U' B' U B");
		if(cube.color('L', 1, 0)=='r' && cube.color('F', 0, 1)=='b') cube.alg("F U' F' U' L' U L");
		for(int i = 0 ; i < 4 ; i++) {
			cube.alg("U");
			if(cube.color('L', 2, 1)=='b' && cube.color('U', 0, 1)=='r') cube.alg("U F U' F' U' L' U L");
			if(cube.color('F', 1, 2)=='r' && cube.color('U', 1, 0)=='b') cube.alg("U' L' U L U F U' F'");
		}
		
		return test(cube);
	}

	public static boolean test(Cube cube) {
		if(SolveWCorners.test(cube)
		&& cube.color('F', 0, 1) == 'r'
		&& cube.color('F', 2, 1) == 'r'
		&& cube.color('R', 1, 0) == 'g'
		&& cube.color('R', 1, 2) == 'g'
		&& cube.color('B', 2, 1) == 'o'
		&& cube.color('B', 0, 1) == 'o'
		&& cube.color('L', 1, 2) == 'b'
		&& cube.color('L', 1, 0) == 'b')
			return true;
		
		return false;
	}

}
