package com.maxurf.cubeSolver.solve;

import com.maxurf.cubeSolver.cube.*;

class SolvePLL1 implements SolveChange {

	public boolean solve(Cube cube) {
		int n = 0;
		while(!test(cube) && n < 8) {
			cube.alg("U");
			if(cube.color('L', 2, 1) == 'g' && cube.color('F', 1, 2) == 'r') cube.alg("R U R' U R U2 R' U");
			if(cube.color('L', 2, 1) == 'o' && cube.color('F', 1, 2) == 'g') cube.alg("R U R' U R U2 R' U");
			if(cube.color('L', 2, 1) == 'b' && cube.color('F', 1, 2) == 'o') cube.alg("R U R' U R U2 R' U");
			if(cube.color('L', 2, 1) == 'r' && cube.color('F', 1, 2) == 'b') cube.alg("R U R' U R U2 R' U");
			n++;
		}
		
		return test(cube);
	}

	public static boolean test(Cube cube) {
		if(SolveYCross.test(cube)
		&& cube.color('F', 1, 2) == 'r'
		&& cube.color('R', 0, 1) == 'g'
		&& cube.color('B', 1, 0) == 'o'
		&& cube.color('L', 2, 1) == 'b')
			return true;

		return false;
	}
}
