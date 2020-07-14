package com.msrit.problem3;

public class Stack {
	int top;
	int a[];
	int MAX;
	Stack(int n) {
		top = -1;
		MAX=n;
		a = new int[MAX];
	}
	

	boolean push(int x) {
		if (top == (MAX - 1)) {
			System.out.println("Stack Overflow hence "+x+" not pushed into Stack");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}
	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			int x = a[top--];
			return x;
		}
	}
	void showStack() {
		System.out.println("The elements of stack are");
		for(int i=0;i<=top;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}