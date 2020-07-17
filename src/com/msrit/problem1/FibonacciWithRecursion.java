//To print Fibonacci series using .(concept of
//loops, data types)
package com.msrit.problem1;
import java.util.*;  
public class FibonacciWithRecursion {

	static int term1=0,term2=1,term3=0;    
		static void printFibonacci(int count){    
		    if(count>0){    
		    	term3 = term1 + term2;    
		    	term1 = term2;    
		    	term2 = term3;    
		         System.out.print("\n"+term3);   
		         printFibonacci(count-1);    
		     }    
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Fibonacci with recursion\n\nEnter the number of fibonacci numbers you want");
		 int count=scanner.nextInt();
		 scanner.close();
		  System.out.print(term1+"\n"+term2);//printing 0 and 1    
		  printFibonacci(count-2);
	}
}
