package com.maxurf.cubeSolver;

import com.maxurf.cubeSolver.cube.*;
import com.maxurf.cubeSolver.solve.*;
import com.maxurf.cubeSolver.cube.gui.Window;

public class CubeSolver {

	public static void main(String[] args) {
		if(args.length>0) {
			if(args[0].equals("cl")) {
				Display.dispHelp();
				Cube cube = new Cube();
				SetCube.set(cube);
				if(Solve.solve(cube)) Display.dispMoves(cube);
				else Display.dispError();
			}
		}
		else {
			Window window = new Window();
		}
	}
	
}
