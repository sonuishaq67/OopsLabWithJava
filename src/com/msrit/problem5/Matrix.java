/*
 Write a java program to read 2 matrices and place the product in a third matrix. Use
constructors and suitable methods.
*/



package com.msrit.problem5;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int sum, rows1, cols1, rows2, cols2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix");
		rows1 = scan.nextInt();
		cols1 = scan.nextInt();
		System.out.println("Enter the number of rows and columns of second matrix");
		rows2 = scan.nextInt();
		cols2 = scan.nextInt();
		int a[][] = new int[rows1][cols1];
		int b[][] = new int[rows2][cols2];
		if (cols1 != rows2) {
			System.out.println("Matrix multiplication not possible");
			System.exit(0);
		}
		System.out.println("Enter the elements of matrix one");
		for (int i = 0; i < rows1; i++)
			for (int j = 0; j < cols1; j++)
				a[i][j] = scan.nextInt();
		System.out.println("Enter the elements of Matrix two");
		for (int i = 0; i < rows2; i++)
			for (int j = 0; j < cols2; j++)
				b[i][j] = scan.nextInt();
		int c[][] = new int[rows1][cols2];
		scan.close();
		System.out.println("The matrix will be of " + rows1 + "*" + cols2);
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				sum = 0;
				for (int k = 0; k < cols1; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols1; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}

}
