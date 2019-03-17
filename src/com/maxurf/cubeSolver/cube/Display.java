package com.maxurf.cubeSolver.cube;

import java.util.Scanner;

public abstract class Display {
	private static Scanner scan = new Scanner(System.in);
	private static int k = 0;
	public static void dispHelp() {
		for(k=0;k<50;k++)System.out.println();
		System.out.println("\t Aide :\n");
		System.out.print("\t Placez le centre jaune de votre rubik's cube vers le haut et la face rouge face a vous.");
		System.out.println("\n\n");
		System.out.print("\t Appuyez sur Entrée pour continuer...");
		scan.nextLine();
		System.out.println("\n\n\n\n");
	}
	
	public static void dispCube(Cube cube) {
		System.out.println("\n\n");
		System.out.println();
		System.out.println("                   #############");
		System.out.println("                   # "+cube.color('B',0,2)+" # "+cube.color('B',1,2)+" # "+cube.color('B',2,2)+" #");
		System.out.println("                   #############");
		System.out.println("                   # "+cube.color('B',0,1)+" # "+cube.color('B',1,1)+" # "+cube.color('B',2,1)+" #");
		System.out.println("                   #############");
		System.out.println("                   # "+cube.color('B',0,0)+" # "+cube.color('B',1,0)+" # "+cube.color('B',2,0)+" #");
		System.out.println("                   #############");
		
		System.out.println();
		
		System.out.println("    #############  #############  #############  #############");
		System.out.print("    # "+cube.color('L',0,2)+" # "+cube.color('L',1,2)+" # "+cube.color('L',2,2)+" #  ");
		System.out.print("# "+cube.color('U',0,2)+" # "+cube.color('U',1,2)+" # "+cube.color('U',2,2)+" #  ");
		System.out.print("# "+cube.color('R',0,2)+" # "+cube.color('R',1,2)+" # "+cube.color('R',2,2)+" #  ");
		System.out.println("# "+cube.color('D',0,2)+" # "+cube.color('D',1,2)+" # "+cube.color('D',2,2)+" #");
		System.out.println("    #############  #############  #############  #############");		
		System.out.print("    # "+cube.color('L',0,1)+" # "+cube.color('L',1,1)+" # "+cube.color('L',2,1)+" #  ");
		System.out.print("# "+cube.color('U',0,1)+" # "+cube.color('U',1,1)+" # "+cube.color('U',2,1)+" #  ");
		System.out.print("# "+cube.color('R',0,1)+" # "+cube.color('R',1,1)+" # "+cube.color('R',2,1)+" #  ");
		System.out.println("# "+cube.color('D',0,1)+" # "+cube.color('D',1,1)+" # "+cube.color('D',2,1)+" #");
		System.out.println("    #############  #############  #############  #############");		
		System.out.print("    # "+cube.color('L',0,0)+" # "+cube.color('L',1,0)+" # "+cube.color('L',2,0)+" #  ");
		System.out.print("# "+cube.color('U',0,0)+" # "+cube.color('U',1,0)+" # "+cube.color('U',2,0)+" #  ");
		System.out.print("# "+cube.color('R',0,0)+" # "+cube.color('R',1,0)+" # "+cube.color('R',2,0)+" #  ");
		System.out.println("# "+cube.color('D',0,0)+" # "+cube.color('D',1,0)+" # "+cube.color('D',2,0)+" #");
		System.out.println("    #############  #############  #############  #############");
		
		System.out.println();
		
		System.out.println("                   #############");
		System.out.println("                   # "+cube.color('F',0,2)+" # "+cube.color('F',1,2)+" # "+cube.color('F',2,2)+" #");
		System.out.println("                   #############");
		System.out.println("                   # "+cube.color('F',0,1)+" # "+cube.color('F',1,1)+" # "+cube.color('F',2,1)+" #");
		System.out.println("                   #############");
		System.out.println("                   # "+cube.color('F',0,0)+" # "+cube.color('F',1,0)+" # "+cube.color('F',2,0)+" #");
		System.out.println("                   #############");
		
		System.out.println("\n\n");
	}
	
	public static void dispMoves(Cube cube) {
		String moves = cube.getMoves();
		int nb = 0;
		
		for(int i = 0 ; i < moves.length() ; i++) {
			if(moves.charAt(i)=='U'||moves.charAt(i)=='D'||moves.charAt(i)=='R'
			|| moves.charAt(i)=='L'||moves.charAt(i)=='F'||moves.charAt(i)=='B')
				nb++;
		}
		
		for(k=0;k<50;k++)System.out.println();
		System.out.println("\t Voici les mouvements à  effectuer pour résoudre votre rubik's cube :\n");
		System.out.print("\t "+moves);
		System.out.println("\n\n");
		System.out.println("\t Nombre de mouvements à  effectuer : " + nb);
		System.out.println("\n\n");
		System.out.print("\t Appuyez sur Entrée pour continuer...");
		scan.nextLine();
		System.out.println("\n\n\n\n");
	}
	
	public static void dispError() {
		for(k=0;k<50;k++)System.out.println();
		System.out.println("\t Erreur :\n");
		System.out.print("\t Vous avez fait une erreur lors de la saisi des couleurs.");
		System.out.println("\n\n");
		System.out.print("\t Appuyez sur Entrée pour continuer...");
		scan.nextLine();
		System.out.println("\n\n\n\n");
	}
}
