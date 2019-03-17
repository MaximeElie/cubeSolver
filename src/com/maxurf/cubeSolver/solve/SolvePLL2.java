package com.maxurf.cubeSolver.solve;

import com.maxurf.cubeSolver.cube.*;

class SolvePLL2 implements SolveChange {

	public boolean solve(Cube cube) {
		int simp[][] = simplify(cube);
			
		if(simp[1][0]==3 && simp[1][1]==1 && simp[0][1]==2 && simp[0][0]==4) cube.alg("U' L' U R U' L U R'");
		if(simp[1][0]==1 && simp[1][1]==4 && simp[0][1]==2 && simp[0][0]==3) cube.alg("L' U R U' L U R' U'");
		if(simp[1][0]==4 && simp[1][1]==2 && simp[0][1]==1 && simp[0][0]==3) cube.alg("U L' U R U' L U R' U2");
		if(simp[1][0]==4 && simp[1][1]==1 && simp[0][1]==3 && simp[0][0]==2) cube.alg("U2 L' U R U' L U R' U");
		if(simp[1][0]==2 && simp[1][1]==3 && simp[0][1]==1 && simp[0][0]==4) cube.alg("R U' L' U R' U' L U");
		if(simp[1][0]==1 && simp[1][1]==3 && simp[0][1]==4 && simp[0][0]==2) cube.alg("U R U' L' U R' U' L");
		if(simp[1][0]==3 && simp[1][1]==2 && simp[0][1]==4 && simp[0][0]==1) cube.alg("U2 R U' L' U R' U' L U'");
		if(simp[1][0]==2 && simp[1][1]==4 && simp[0][1]==3 && simp[0][0]==1) cube.alg("U' R U' L' U R' U' L U2");
		if(simp[1][0]==3 && simp[1][1]==4 && simp[0][1]==1 && simp[0][0]==2) cube.alg("R2 U2 R U2 R2 U2 R2 U2 R U2 R2 U2");
		if(simp[1][0]==2 && simp[1][1]==1 && simp[0][1]==4 && simp[0][0]==3) cube.alg("R B' R' F R B R' F' R B R' F R B' R' F'");
		if(simp[1][0]==4 && simp[1][1]==3 && simp[0][1]==2 && simp[0][0]==1) cube.alg("U R B' R' F R B R' F' R B R' F R B' R' F' U'");
		
		return test(cube);
	}

	public static boolean test(Cube cube) {
		int simp[][] = simplify(cube);
		if(SolvePLL1.test(cube)
		&& simp[1][0] == 1
		&& simp[1][1] == 2
		&& simp[0][1] == 3
		&& simp[0][0] == 4)
			return true;

		return false;
	}
	
	private static int[][] simplify(Cube cube) {
		int simp[][] = {{0,0},{0,0}};
		
		if(cube.color('F', 2, 2)=='r'&&cube.color('R', 0, 0)=='g'&&cube.color('U', 2, 0)=='y') simp[1][0]=1;
		if(cube.color('F', 2, 2)=='g'&&cube.color('R', 0, 0)=='y'&&cube.color('U', 2, 0)=='r') simp[1][0]=1;
		if(cube.color('F', 2, 2)=='y'&&cube.color('R', 0, 0)=='r'&&cube.color('U', 2, 0)=='g') simp[1][0]=1;
		if(cube.color('R', 0, 2)=='r'&&cube.color('B', 2, 0)=='g'&&cube.color('U', 2, 2)=='y') simp[1][1]=1;
		if(cube.color('R', 0, 2)=='g'&&cube.color('B', 2, 0)=='y'&&cube.color('U', 2, 2)=='r') simp[1][1]=1;
		if(cube.color('R', 0, 2)=='y'&&cube.color('B', 2, 0)=='r'&&cube.color('U', 2, 2)=='g') simp[1][1]=1;
		if(cube.color('B', 0, 0)=='r'&&cube.color('L', 2, 2)=='g'&&cube.color('U', 0, 2)=='y') simp[0][1]=1;
		if(cube.color('B', 0, 0)=='g'&&cube.color('L', 2, 2)=='y'&&cube.color('U', 0, 2)=='r') simp[0][1]=1;
		if(cube.color('B', 0, 0)=='y'&&cube.color('L', 2, 2)=='r'&&cube.color('U', 0, 2)=='g') simp[0][1]=1;
		if(cube.color('L', 2, 0)=='r'&&cube.color('F', 0, 2)=='g'&&cube.color('U', 0, 0)=='y') simp[0][0]=1;
		if(cube.color('L', 2, 0)=='g'&&cube.color('F', 0, 2)=='y'&&cube.color('U', 0, 0)=='r') simp[0][0]=1;
		if(cube.color('L', 2, 0)=='y'&&cube.color('F', 0, 2)=='r'&&cube.color('U', 0, 0)=='g') simp[0][0]=1;
		
		if(cube.color('F', 2, 2)=='g'&&cube.color('R', 0, 0)=='o'&&cube.color('U', 2, 0)=='y') simp[1][0]=2;
		if(cube.color('F', 2, 2)=='o'&&cube.color('R', 0, 0)=='y'&&cube.color('U', 2, 0)=='g') simp[1][0]=2;
		if(cube.color('F', 2, 2)=='y'&&cube.color('R', 0, 0)=='g'&&cube.color('U', 2, 0)=='o') simp[1][0]=2;
		if(cube.color('R', 0, 2)=='g'&&cube.color('B', 2, 0)=='o'&&cube.color('U', 2, 2)=='y') simp[1][1]=2;
		if(cube.color('R', 0, 2)=='o'&&cube.color('B', 2, 0)=='y'&&cube.color('U', 2, 2)=='g') simp[1][1]=2;
		if(cube.color('R', 0, 2)=='y'&&cube.color('B', 2, 0)=='g'&&cube.color('U', 2, 2)=='o') simp[1][1]=2;
		if(cube.color('B', 0, 0)=='g'&&cube.color('L', 2, 2)=='o'&&cube.color('U', 0, 2)=='y') simp[0][1]=2;
		if(cube.color('B', 0, 0)=='o'&&cube.color('L', 2, 2)=='y'&&cube.color('U', 0, 2)=='g') simp[0][1]=2;
		if(cube.color('B', 0, 0)=='y'&&cube.color('L', 2, 2)=='g'&&cube.color('U', 0, 2)=='o') simp[0][1]=2;
		if(cube.color('L', 2, 0)=='g'&&cube.color('F', 0, 2)=='o'&&cube.color('U', 0, 0)=='y') simp[0][0]=2;
		if(cube.color('L', 2, 0)=='o'&&cube.color('F', 0, 2)=='y'&&cube.color('U', 0, 0)=='g') simp[0][0]=2;
		if(cube.color('L', 2, 0)=='y'&&cube.color('F', 0, 2)=='g'&&cube.color('U', 0, 0)=='o') simp[0][0]=2;
		
		if(cube.color('F', 2, 2)=='o'&&cube.color('R', 0, 0)=='b'&&cube.color('U', 2, 0)=='y') simp[1][0]=3;
		if(cube.color('F', 2, 2)=='b'&&cube.color('R', 0, 0)=='y'&&cube.color('U', 2, 0)=='o') simp[1][0]=3;
		if(cube.color('F', 2, 2)=='y'&&cube.color('R', 0, 0)=='o'&&cube.color('U', 2, 0)=='b') simp[1][0]=3;
		if(cube.color('R', 0, 2)=='o'&&cube.color('B', 2, 0)=='b'&&cube.color('U', 2, 2)=='y') simp[1][1]=3;
		if(cube.color('R', 0, 2)=='b'&&cube.color('B', 2, 0)=='y'&&cube.color('U', 2, 2)=='o') simp[1][1]=3;
		if(cube.color('R', 0, 2)=='y'&&cube.color('B', 2, 0)=='o'&&cube.color('U', 2, 2)=='b') simp[1][1]=3;
		if(cube.color('B', 0, 0)=='o'&&cube.color('L', 2, 2)=='b'&&cube.color('U', 0, 2)=='y') simp[0][1]=3;
		if(cube.color('B', 0, 0)=='b'&&cube.color('L', 2, 2)=='y'&&cube.color('U', 0, 2)=='o') simp[0][1]=3;
		if(cube.color('B', 0, 0)=='y'&&cube.color('L', 2, 2)=='o'&&cube.color('U', 0, 2)=='b') simp[0][1]=3;
		if(cube.color('L', 2, 0)=='o'&&cube.color('F', 0, 2)=='b'&&cube.color('U', 0, 0)=='y') simp[0][0]=3;
		if(cube.color('L', 2, 0)=='b'&&cube.color('F', 0, 2)=='y'&&cube.color('U', 0, 0)=='o') simp[0][0]=3;
		if(cube.color('L', 2, 0)=='y'&&cube.color('F', 0, 2)=='o'&&cube.color('U', 0, 0)=='b') simp[0][0]=3;
		
		if(cube.color('F', 2, 2)=='b'&&cube.color('R', 0, 0)=='r'&&cube.color('U', 2, 0)=='y') simp[1][0]=4;
		if(cube.color('F', 2, 2)=='r'&&cube.color('R', 0, 0)=='y'&&cube.color('U', 2, 0)=='b') simp[1][0]=4;
		if(cube.color('F', 2, 2)=='y'&&cube.color('R', 0, 0)=='b'&&cube.color('U', 2, 0)=='r') simp[1][0]=4;
		if(cube.color('R', 0, 2)=='b'&&cube.color('B', 2, 0)=='r'&&cube.color('U', 2, 2)=='y') simp[1][1]=4;
		if(cube.color('R', 0, 2)=='r'&&cube.color('B', 2, 0)=='y'&&cube.color('U', 2, 2)=='b') simp[1][1]=4;
		if(cube.color('R', 0, 2)=='y'&&cube.color('B', 2, 0)=='b'&&cube.color('U', 2, 2)=='r') simp[1][1]=4;
		if(cube.color('B', 0, 0)=='b'&&cube.color('L', 2, 2)=='r'&&cube.color('U', 0, 2)=='y') simp[0][1]=4;
		if(cube.color('B', 0, 0)=='r'&&cube.color('L', 2, 2)=='y'&&cube.color('U', 0, 2)=='b') simp[0][1]=4;
		if(cube.color('B', 0, 0)=='y'&&cube.color('L', 2, 2)=='b'&&cube.color('U', 0, 2)=='r') simp[0][1]=4;
		if(cube.color('L', 2, 0)=='b'&&cube.color('F', 0, 2)=='r'&&cube.color('U', 0, 0)=='y') simp[0][0]=4;
		if(cube.color('L', 2, 0)=='r'&&cube.color('F', 0, 2)=='y'&&cube.color('U', 0, 0)=='b') simp[0][0]=4;
		if(cube.color('L', 2, 0)=='y'&&cube.color('F', 0, 2)=='b'&&cube.color('U', 0, 0)=='r') simp[0][0]=4;
		
		return simp;
	}
}
