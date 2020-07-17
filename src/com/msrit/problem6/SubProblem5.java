/*Compare two strings ignoring case.*/
package com.msrit.problem6;

import java.util.Scanner;

public class SubProblem5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string");
		String firstString = scanner.next();
		System.out.println("Enter the second string ");
		String secondString = scanner.next();
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		if (firstString.equals(secondString))
			System.out.println("Both strings are equal ");
		else
			System.out.println("Strings are not equal");
		scanner.close();
	}
}
