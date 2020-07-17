/*
 * Define a Stack class to implement the stack data structure. Include constructors to perform
initialization, method push to push an element into the stack, method pop to remove an
element from the stack and display method to display the elements of the stack.
 * */


package com.msrit.problem3;

import java.util.Scanner;

class StackDriver { 
    public static void main(String args[]) 
    { 
    	int i=0;
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the max size of the stack");
    	int size=scanner.nextInt();
        Stack s = new Stack(size); 
        System.out.println("Choose an option from below");
        while(i<4)
        {
        	System.out.println("\n\n1)Push to the stack\n2)Pop from the Stack\n3)Show the stack\n4)Exit\n");
        	i=scanner.nextInt();
        	if(i==1) {
        		System.out.println("Enter the element you want to push");
        		s.push(scanner.nextInt());
        	}
        	else if (i==2) {
        		System.out.println(s.pop() + " Popped from stack");
        	}
        	else if (i==3) {
        		s.showStack();
        	}        		
        }
        scanner.close();
        System.out.println("Exitting from the stack class program......");
    } 
} 
