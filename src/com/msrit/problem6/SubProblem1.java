package com.msrit.problem6;
import java.util.Scanner;
public class SubProblem1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Input a string");
		String string =scanner.nextLine();
		System.out.println("Input position reference base 1");
		int m=scanner.nextInt();
		System.out.println("Input number of characters");
		int n=scanner.nextInt();
		scanner.close();
		char[] charArray=string.toCharArray();
		char[] extPor=new char[n];
		for(int i=m-1;i<m-1+n;i++)
			extPor[i-m+1]=charArray[i];
		String extPorString=new String(extPor);
					System.out.println(extPorString);
		
	}              
}
