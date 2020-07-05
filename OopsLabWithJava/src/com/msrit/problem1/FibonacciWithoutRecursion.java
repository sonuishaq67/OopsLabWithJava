package com.msrit.problem1;
import java.util.*;  
public class FibonacciWithoutRecursion {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);  
		FibonacciWithoutRecursion fib=new FibonacciWithoutRecursion();
		System.out.println("Fibonacci without recursion\n\nEnter the number of fibonacci numbers you want");
		int n=scanner.nextInt();
		scanner.close();
		fib.fibonacciWithoutRecursion(n);
	}

	public void fibonacciWithoutRecursion(int n) {
		int term1 = 0, term2 = 1;
		System.out.print("The First " + n + " terms are ");

		for (int i = 1; i <= n; ++i) {
			System.out.print( "\n"+ term1);

			int sum = term1 + term2;
			term1 = term2;
			term2 = sum;
		}
	}
}
