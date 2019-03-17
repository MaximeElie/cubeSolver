package com.maxurf.cubeSolver.cube;

import java.util.Scanner;

public abstract class SetCube {
	
	public static void set(Cube cube) {
		char color = ' ';
		int k=0;
		
		for(k=0;k<50;k++)System.out.println();
		
		for(int  j = 2 ; j >= 0 ; j--) { for(int i = 0 ; i < 3 ; i++) {
			cube.setColor('B', i, j, '?');
			Display.dispCube(cube);
			do {
				System.out.print("\t couleur : ");
				color = new Scanner(System.in).nextLine().charAt(0);
			}while(color!='g'&&color!='y'&&color!='r'&&color!='b'&&color!='w'&&color!='o');
			cube.setColor('B', i, j, color);
			for(k=0;k<50;k++)System.out.println();
		} }
		for(int  j = 2 ; j >= 0 ; j--) { for(int i = 0 ; i < 3 ; i++) {
			cube.setColor('L', i, j, '?');
			Display.dispCube(cube);
			do {
				System.out.print("\t couleur : ");
				color = new Scanner(System.in).nextLine().charAt(0);
			}while(color!='g'&&color!='y'&&color!='r'&&color!='b'&&color!='w'&&color!='o');
			cube.setColor('L', i, j, color);
			for(k=0;k<50;k++)System.out.println();
		} }
		for(int  j = 2 ; j >= 0 ; j--) { for(int i = 0 ; i < 3 ; i++) {
			cube.setColor('U', i, j, '?');
			Display.dispCube(cube);
			do {
				System.out.print("\t couleur : ");
				color = new Scanner(System.in).nextLine().charAt(0);
			}while(color!='g'&&color!='y'&&color!='r'&&color!='b'&&color!='w'&&color!='o');
			cube.setColor('U', i, j, color);
			for(k=0;k<50;k++)System.out.println();
		} }
		for(int  j = 2 ; j >= 0 ; j--) { for(int i = 0 ; i < 3 ; i++) {
			cube.setColor('R', i, j, '?');
			Display.dispCube(cube);
			do {
				System.out.print("\t couleur : ");
				color = new Scanner(System.in).nextLine().charAt(0);
			}while(color!='g'&&color!='y'&&color!='r'&&color!='b'&&color!='w'&&color!='o');
			cube.setColor('R', i, j, color);
			for(k=0;k<50;k++)System.out.println();
		} }
		for(int  j = 2 ; j >= 0 ; j--) { for(int i = 0 ; i < 3 ; i++) {
			cube.setColor('D', i, j, '?');
			Display.dispCube(cube);
			do {
				System.out.print("\t couleur : ");
				color = new Scanner(System.in).nextLine().charAt(0);
			}while(color!='g'&&color!='y'&&color!='r'&&color!='b'&&color!='w'&&color!='o');
			cube.setColor('D', i, j, color);
			for(k=0;k<50;k++)System.out.println();
		} }
		for(int  j = 2 ; j >= 0 ; j--) { for(int i = 0 ; i < 3 ; i++) {
			cube.setColor('F', i, j, '?');
			Display.dispCube(cube);
			do {
				System.out.print("\t couleur : ");
				color = new Scanner(System.in).nextLine().charAt(0);
			}while(color!='g'&&color!='y'&&color!='r'&&color!='b'&&color!='w'&&color!='o');
			cube.setColor('F', i, j, color);
			for(k=0;k<50;k++)System.out.println();
		} }
	}
	
}