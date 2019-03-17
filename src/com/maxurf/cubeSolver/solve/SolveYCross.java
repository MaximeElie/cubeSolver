package com.maxurf.cubeSolver.solve;

import com.maxurf.cubeSolver.cube.*;

class SolveYCross implements SolveChange {

	public boolean solve(Cube cube) {
		for(int i = 0 ; i < 4 ; i++) {
			cube.alg("U");
			if(cube.color('U', 0, 1) == 'y' && cube.color('U', 1, 2) == 'y'
			&& cube.color('F', 1, 2) == 'y' && cube.color('R', 0, 1) == 'y')
				cube.alg("R' U' F' U F R");
			
			if(cube.color('U', 0, 1) == 'y' && cube.color('U', 2, 1) == 'y'
			&& cube.color('F', 1, 2) == 'y' && cube.color('B', 1, 0) == 'y')
				cube.alg("F R U R' U' F'");
			
			if(cube.color('L', 2, 1) == 'y' && cube.color('R', 0, 1) == 'y'
			&& cube.color('F', 1, 2) == 'y' && cube.color('B', 1, 0) == 'y')
				cube.alg("R' U' F' U F R F R U R' U' F'");
		}
		
		return test(cube);
	}

	public static boolean test(Cube cube) {
		
		if(SolveLayer2.test(cube)
		&& cube.color('U', 1, 0) == 'y'
		&& cube.color('U', 2, 1) == 'y'
		&& cube.color('U', 1, 2) == 'y'
		&& cube.color('U', 0, 1) == 'y')
			return true;
		
		return false;
	}
}