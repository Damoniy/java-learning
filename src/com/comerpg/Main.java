package com.comerpg;

import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int[][] matrix = new int[m][n];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		int o = scan.nextInt();
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < n; j++) {
				
				if(matrix[i][j] == o) {
					System.out.printf("%nPosition %d,%d:%n", i, j);
					
					if((j) > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					
					if((++j) < matrix[i].length) {
						System.out.println("Right: " + matrix[i][j]);
					}
									
					if((i) > 0) {
						System.out.println("Top: " + matrix[i - 1][j - 1]);
					}
						
					if((++i) < matrix.length) {
						System.out.println("Down: " + matrix[i][j - 1]);
					}
				}
			}
		}
		scan.close();
	}
}
