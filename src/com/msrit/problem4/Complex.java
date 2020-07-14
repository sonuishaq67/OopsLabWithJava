package com.msrit.problem4;

import java.util.Scanner;

public class Complex {
	float x1,x2,y1,y2,real,imag;
	Scanner scanner=new Scanner(System.in);
	Complex()
	{
	 System.out.println("enter the real and imaginary parts of first number");
	 x1=scanner.nextFloat();
	 y1=scanner.nextFloat();
	 System.out.println("enter the real and imaginary parts of second number");
	 x2=scanner.nextFloat();
	 y2=scanner.nextFloat();
	}
	void addComplex()
	{
	real=x1+x2;
	imag=y1+y2;
	System.out.println("The result of Addition is "+real+"+i("+imag+")");
	}
	void subComplex()
	{
	real=x1-x2;
	imag=y1-y2;
	System.out.println("The result of Subtraction is "+real+"+i("+imag+")");
	}
	void mulComplex()
	{
	real=x1*x2-y1*y2;
	imag=x1*y2+x2*y1;
	System.out.println("The result of multiplication is "+real+"+i("+imag+")");
	}
}
