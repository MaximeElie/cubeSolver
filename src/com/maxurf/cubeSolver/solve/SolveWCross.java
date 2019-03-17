package com.maxurf.cubeSolver.solve;

import com.maxurf.cubeSolver.cube.*;

class SolveWCross implements SolveChange {

	public boolean solve(Cube cube) {
		
		if(cube.color('D', 1, 0)=='r' && cube.color('F', 1, 0)=='w') cube.alg("F' R' D'");
		else if(cube.color('D', 0, 1)=='w' && cube.color('R', 2, 1)=='r') cube.alg("D'");
		else if(cube.color('D', 0, 1)=='r' && cube.color('R', 2, 1)=='w') cube.alg("R F");
		else if(cube.color('D', 1, 2)=='w' && cube.color('B', 1, 2)=='r') cube.alg("D2");
		else if(cube.color('D', 1, 2)=='r' && cube.color('B', 1, 2)=='w') cube.alg("D' R F");
		else if(cube.color('D', 2, 1)=='w' && cube.color('L', 0, 1)=='r') cube.alg("D");
		else if(cube.color('D', 2, 1)=='r' && cube.color('L', 0, 1)=='w') cube.alg("L' F'");
		else if(cube.color('F', 2, 1)=='w' && cube.color('R', 1, 0)=='r') cube.alg("R' D'");
		else if(cube.color('F', 2, 1)=='r' && cube.color('R', 1, 0)=='w') cube.alg("F");
		else if(cube.color('R', 1, 2)=='w' && cube.color('B', 2, 1)=='r') cube.alg("R2 F");
		else if(cube.color('R', 1, 2)=='r' && cube.color('B', 2, 1)=='w') cube.alg("R D'");
		else if(cube.color('B', 0, 1)=='w' && cube.color('L', 1, 2)=='r') cube.alg("L' D");
		else if(cube.color('B', 0, 1)=='r' && cube.color('L', 1, 2)=='w') cube.alg("L2 F'");
		else if(cube.color('L', 1, 0)=='w' && cube.color('F', 0, 1)=='r') cube.alg("F'");
		else if(cube.color('L', 1, 0)=='r' && cube.color('F', 0, 1)=='w') cube.alg("L D");
		else if(cube.color('F', 1, 2)=='w' && cube.color('U', 1, 0)=='r') cube.alg("U' R' F");
		else if(cube.color('F', 1, 2)=='r' && cube.color('U', 1, 0)=='w') cube.alg("F2");
		else if(cube.color('R', 0, 1)=='w' && cube.color('U', 2, 1)=='r') cube.alg("R' F");
		else if(cube.color('R', 0, 1)=='r' && cube.color('U', 2, 1)=='w') cube.alg("U F2");
		else if(cube.color('B', 1, 0)=='w' && cube.color('U', 1, 2)=='r') cube.alg("U R' F");
		else if(cube.color('B', 1, 0)=='r' && cube.color('U', 1, 2)=='w') cube.alg("U2 F2");
		else if(cube.color('L', 2, 1)=='w' && cube.color('U', 0, 1)=='r') cube.alg("L F'");
		else if(cube.color('L', 2, 1)=='r' && cube.color('U', 0, 1)=='w') cube.alg("U' F2");
		

		if(cube.color('D', 0, 1)=='g' && cube.color('R', 2, 1)=='w') cube.alg("R F D F'");
		else if(cube.color('D', 1, 2)=='w' && cube.color('B', 1, 2)=='g') cube.alg("F D' F'");
		else if(cube.color('D', 1, 2)=='g' && cube.color('B', 1, 2)=='w') cube.alg("B R");
		else if(cube.color('D', 2, 1)=='w' && cube.color('L', 0, 1)=='g') cube.alg("F D2 F'");
		else if(cube.color('D', 2, 1)=='g' && cube.color('L', 0, 1)=='w') cube.alg("L' D' F' D");
		else if(cube.color('F', 2, 1)=='w' && cube.color('R', 1, 0)=='g') cube.alg("R'");
		else if(cube.color('F', 2, 1)=='g' && cube.color('R', 1, 0)=='w') cube.alg("D' F D");
		else if(cube.color('R', 1, 2)=='w' && cube.color('B', 2, 1)=='g') cube.alg("B U R2");
		else if(cube.color('R', 1, 2)=='g' && cube.color('B', 2, 1)=='w') cube.alg("R");
		else if(cube.color('B', 0, 1)=='w' && cube.color('L', 1, 2)=='g') cube.alg("B2 R");
		else if(cube.color('B', 0, 1)=='g' && cube.color('L', 1, 2)=='w') cube.alg("D B D'");
		else if(cube.color('L', 1, 0)=='w' && cube.color('F', 0, 1)=='g') cube.alg("D' F' D");
		else if(cube.color('L', 1, 0)=='g' && cube.color('F', 0, 1)=='w') cube.alg("D2 L D2");
		else if(cube.color('F', 1, 2)=='w' && cube.color('U', 1, 0)=='g') cube.alg("F R' F'");
		else if(cube.color('F', 1, 2)=='g' && cube.color('U', 1, 0)=='w') cube.alg("U' R2");
		else if(cube.color('R', 0, 1)=='w' && cube.color('U', 2, 1)=='g') cube.alg("R' D' F D");
		else if(cube.color('R', 0, 1)=='g' && cube.color('U', 2, 1)=='w') cube.alg("R2");
		else if(cube.color('B', 1, 0)=='w' && cube.color('U', 1, 2)=='g') cube.alg("B' R");
		else if(cube.color('B', 1, 0)=='g' && cube.color('U', 1, 2)=='w') cube.alg("U R2");
		else if(cube.color('L', 2, 1)=='w' && cube.color('U', 0, 1)=='g') cube.alg("L D' F' D");
		else if(cube.color('L', 2, 1)=='g' && cube.color('U', 0, 1)=='w') cube.alg("U2 R2");
		
		
		if(cube.color('D', 1, 2)=='o' && cube.color('B', 1, 2)=='w') cube.alg("B D' R D");
		else if(cube.color('D', 2, 1)=='w' && cube.color('L', 0, 1)=='o') cube.alg("L2 U B2");
		else if(cube.color('D', 2, 1)=='o' && cube.color('L', 0, 1)=='w') cube.alg("L' D2 F' D2");
		else if(cube.color('F', 2, 1)=='w' && cube.color('R', 1, 0)=='o') cube.alg("D' R' D");
		else if(cube.color('F', 2, 1)=='o' && cube.color('R', 1, 0)=='w') cube.alg("D2 F D2");
		else if(cube.color('R', 1, 2)=='w' && cube.color('B', 2, 1)=='o') cube.alg("B'");
		else if(cube.color('R', 1, 2)=='o' && cube.color('B', 2, 1)=='w') cube.alg("D' R D");
		else if(cube.color('B', 0, 1)=='w' && cube.color('L', 1, 2)=='o') cube.alg("D L' D'");
		else if(cube.color('B', 0, 1)=='o' && cube.color('L', 1, 2)=='w') cube.alg("B");
		else if(cube.color('L', 1, 0)=='w' && cube.color('F', 0, 1)=='o') cube.alg("D2 F' D2");
		else if(cube.color('L', 1, 0)=='o' && cube.color('F', 0, 1)=='w') cube.alg("D L D'");
		else if(cube.color('F', 1, 2)=='w' && cube.color('U', 1, 0)=='o') cube.alg("D F' L D'");
		else if(cube.color('F', 1, 2)=='o' && cube.color('U', 1, 0)=='w') cube.alg("U2 B2");
		else if(cube.color('R', 0, 1)=='w' && cube.color('U', 2, 1)=='o') cube.alg("D2 R' F D2");
		else if(cube.color('R', 0, 1)=='o' && cube.color('U', 2, 1)=='w') cube.alg("U' B2");
		else if(cube.color('B', 1, 0)=='w' && cube.color('U', 1, 2)=='o') cube.alg("B D L' D'");
		else if(cube.color('B', 1, 0)=='o' && cube.color('U', 1, 2)=='w') cube.alg("B2");
		else if(cube.color('L', 2, 1)=='w' && cube.color('U', 0, 1)=='o') cube.alg("L' B");
		else if(cube.color('L', 2, 1)=='o' && cube.color('U', 0, 1)=='w') cube.alg("U B2");
		
		
		if(cube.color('D', 2, 1)=='b' && cube.color('L', 0, 1)=='w') cube.alg("L' D F' D'");
		else if(cube.color('F', 2, 1)=='w' && cube.color('R', 1, 0)=='b') cube.alg("D2 R' D2");
		else if(cube.color('F', 2, 1)=='b' && cube.color('R', 1, 0)=='w') cube.alg("D F D'");
		else if(cube.color('R', 1, 2)=='w' && cube.color('B', 2, 1)=='b') cube.alg("D' B' D");
		else if(cube.color('R', 1, 2)=='b' && cube.color('B', 2, 1)=='w') cube.alg("D2 R D2");
		else if(cube.color('B', 0, 1)=='w' && cube.color('L', 1, 2)=='b') cube.alg("L'");
		else if(cube.color('B', 0, 1)=='b' && cube.color('L', 1, 2)=='w') cube.alg("D' B D");
		else if(cube.color('L', 1, 0)=='w' && cube.color('F', 0, 1)=='b') cube.alg("D F' D'");
		else if(cube.color('L', 1, 0)=='b' && cube.color('F', 0, 1)=='w') cube.alg("L");
		else if(cube.color('F', 1, 2)=='w' && cube.color('U', 1, 0)=='b') cube.alg("F' L F");
		else if(cube.color('F', 1, 2)=='b' && cube.color('U', 1, 0)=='w') cube.alg("U L2");
		else if(cube.color('R', 0, 1)=='w' && cube.color('U', 2, 1)=='b') cube.alg("U F' L F");
		else if(cube.color('R', 0, 1)=='b' && cube.color('U', 2, 1)=='w') cube.alg("U2 L2");
		else if(cube.color('B', 1, 0)=='w' && cube.color('U', 1, 2)=='b') cube.alg("B L' B'");
		else if(cube.color('B', 1, 0)=='b' && cube.color('U', 1, 2)=='w') cube.alg("U' L2");
		else if(cube.color('L', 2, 1)=='w' && cube.color('U', 0, 1)=='b') cube.alg("U' F' L F");
		else if(cube.color('L', 2, 1)=='b' && cube.color('U', 0, 1)=='w') cube.alg("L2");
		
		return test(cube);
	}

	public static boolean test(Cube cube) {
		if(cube.color('D', 0, 1)=='w'
		&& cube.color('D', 1, 2)=='w'
		&& cube.color('D', 2, 1)=='w'
		&& cube.color('D', 1, 0)=='w'
		&& cube.color('F', 1, 0)=='r'
		&& cube.color('R', 2, 1)=='g'
		&& cube.color('B', 1, 2)=='o'
		&& cube.color('L', 0, 1)=='b')
			return true;
		
		return false;
	}
}
