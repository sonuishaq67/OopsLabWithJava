package com.msrit.problem6;

import java.util.Scanner;

public class SubProblem3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		System.out.println("Enter the string to be replaced ");
		String old_str = sc.nextLine();
		System.out.println("Enter the new string ");
		String new_str = sc.nextLine();
		sc.close();
		String replaced = str.replace(old_str, new_str);
		System.out.println("replaced string: " + replaced);
	}
}