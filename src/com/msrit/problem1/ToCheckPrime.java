package com.msrit.problem1;
import java.util.*;
public class ToCheckPrime {

	public static void main(String[] args) {
		System.out.println("Enter a number to check if it's Prime or not ");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		scanner.close();
		ToCheckPrime check=new ToCheckPrime();
		if(check.checkPrime(number))
			System.out.println("It's a prime number");
		else
			System.out.println("It's not a prime number");
	}
	public boolean checkPrime(int n)
	{
		boolean flag=true;
		if(n==1)
			{
			System.out.println("It's neither prime nor composite");
			System.out.println("exitting.......");
			System.exit(0); 
			}
		else if(n<=0)
		{
			System.out.println("Not a valid number");
			System.out.println("exitting......");
			System.exit(0);
		}
			
		for(int i=2;i<n;i++)
			{
			if(n%i==0)
				flag=false;
			}
		return flag;
	}

}
