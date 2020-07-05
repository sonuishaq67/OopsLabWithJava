package com.msrit.problem4;

import java.util.Scanner;

public class ComplexDriver {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=0;
		Complex complex= new Complex();
		System.out.println("Initialised two complex numbers");
		while (i!=4) {
		System.out.println("Enter one of four options\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Exit");
		i=scan.nextInt();
		if(i==1)
			complex.addComplex();
		else if(i==2)
			complex.subComplex();
		else if(i==3)
			complex.mulComplex();
		}
		scan.close();
		System.out.println("Exitted the Complex Driver Program");
	}

}
 