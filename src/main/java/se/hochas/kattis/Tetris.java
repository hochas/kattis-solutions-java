package se.hochas.kattis;

import java.util.Scanner;

public class Tetris {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] pieceRepresentations = createPieceRepresentations();
		
		int c = sc.nextInt();
		int p = sc.nextInt();
		
		int[][] grid = new int[c][100];
		
		for (int i = 0; i < c; i++) {
			int h = sc.nextInt();
			for (int k = 0; k < h; k++) {
				grid[i][k] = 1;
			}
		}
	}

	private static int[] createPieceRepresentations() {
		int[] pieces = new int[7];
		
		
		
		return pieces;
	}
}
