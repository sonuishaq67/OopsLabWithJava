package com.msrit.problem5;

import java.util.Scanner;

public class Matrix { 
	int rows,cols;
	Matrix()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		rows=scan.nextInt();
		cols=scan.nextInt();
		scan.close();
	}

}
