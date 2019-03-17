package com.maxurf.cubeSolver.solve;

import com.maxurf.cubeSolver.cube.*;

public abstract class Solve {
	
	public static boolean solve(Cube cube) {
		if(!testCenters(cube)) return false;
		cube.resetMoves();
		SolveChange solveC = new SolveWCross();
		boolean end = false;
		while(!end) {			
			if(SolveWCross.test(cube))
				solveC = new SolveWCorners();
			if(SolveWCorners.test(cube))
				solveC = new SolveLayer2();
			if(SolveLayer2.test(cube))
				solveC = new SolveYCross();
			if(SolveYCross.test(cube))
				solveC = new SolvePLL1();
			if(SolvePLL1.test(cube))
				solveC = new SolvePLL2();
			if(SolvePLL2.test(cube))
				solveC = new SolveOLL();
			if(SolveOLL.test(cube))
				return true;
			
			if(!solveC.solve(cube))
				end=true;
		}
		return false;
	}
	
	static boolean testCenters(Cube cube) {
		if(cube.color('F', 1, 1)=='r'
		&& cube.color('R', 1, 1)=='g'
		&& cube.color('B', 1, 1)=='o'
		&& cube.color('L', 1, 1)=='b'
		&& cube.color('U', 1, 1)=='y'
		&& cube.color('D', 1, 1)=='w')
			return true;
		
		return false;
	}
	
	static boolean test(Cube cube, int step) {
		if(!testCenters(cube)) return false;
		switch(step) {
			case 1: return SolveWCross.test(cube);
			case 2: return SolveWCorners.test(cube);
			case 3: return SolveLayer2.test(cube);
			case 4: return SolveYCross.test(cube);
			case 5: return SolvePLL1.test(cube);
			case 6: return SolvePLL2.test(cube);
			case 7: return SolveOLL.test(cube);
			default: return false;
		}
	}
	
	public static boolean verification(int step) {
		if(step < 1 || step > 7) {
			System.out.println("\n\n\n\n\t Erreur d'argument\n\n\n\n");
			return false;
		}
		
		Cube cube = new Cube(), tmp = new Cube();
		String s = new String("");
		int nb = 0;
		
		System.out.println("\n\n\n\n\t Vérification du solveur (jusqu'à l'étape "+step+"/7)... \n\n\n\n");
		
		do {
			tmp = cube.getCube();
			cube.reset();
			s = cube.scramble(20);
			solve(cube);
			nb++;
		}while(test(cube, step) && nb < 10_000);
		
		if(nb >= 10_000) {
			System.out.println("\t Il semble que le solveur soit fonctionnel jusqu'à l'étape "+step+"/7");
			System.out.println("\t (Aucune erreur après 10_000 tentatives)");
			return true;
		}
		
		System.out.println("\t ERREUR !!!\n\n\n\n");
		System.out.println("\t Scramble : \n\n\t " + s + "\n\n\n\n");
		System.out.println("\t Avant : ");
		Display.dispCube(tmp);
		System.out.println("\n\n\t Après : ");
		Display.dispCube(cube);
		System.out.print("\n\n\t Mouvements effectués : \n\n\t " + cube.getMoves() + "\n\n\n\n");
		System.out.println("\t Tentatives avant l'erreur : \t " + nb + "\n\n\n\n");
		
		return true;
	}
}
