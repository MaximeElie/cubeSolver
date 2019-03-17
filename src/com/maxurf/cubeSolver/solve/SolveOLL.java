package com.maxurf.cubeSolver.solve;

import com.maxurf.cubeSolver.cube.*;

class SolveOLL implements SolveChange {

	public boolean solve(Cube cube) {
		for(int i = 0 ; i < 4 ; i++) {
			cube.alg("U");
			if(cube.color('R', 0, 0) == 'y') cube.alg("R' D' R D R' D' R D");
			else if(cube.color('F', 2, 2) == 'y') cube.alg("R' D' R D R' D' R D R' D' R D R' D' R D");
		}
		
		return test(cube);
	}

	public static boolean test(Cube cube) {
		if(SolvePLL2.test(cube)
		&& cube.color('F', 2, 2)=='r'
		&& cube.color('R', 0, 0)=='g'
		&& cube.color('U', 2, 0)=='y'
		&& cube.color('R', 0, 2)=='g'
		&& cube.color('B', 2, 0)=='o'
		&& cube.color('U', 2, 2)=='y'
		&& cube.color('B', 0, 0)=='o'
		&& cube.color('L', 2, 2)=='b'
		&& cube.color('U', 0, 2)=='y'
		&& cube.color('L', 2, 0)=='b'
		&& cube.color('F', 0, 2)=='r'
		&& cube.color('U', 0, 0)=='y')
			return true;
		
		return false;
	}
	
}
