package com.msrit.problem6;

import java.util.Arrays;
import java.util.Scanner;

public class SubProblem4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc.nextLine();
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		sc.close();
		System.out.println(new String(charArray));
	}
}
