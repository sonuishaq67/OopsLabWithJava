/*Read a text and count all the occurrences of a particular word.*/
package com.msrit.problem6;

import java.util.Scanner;

public class SubProblem2 {

	static int countOccurences(String str, String word) {

		String a[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i]))
				count++;
		}

		return count;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a string ");
		String str = scanner.nextLine();
		System.out.println("Input the word to be found");
		String word = scanner.next();
		scanner.close();
		System.out.println("The number of times the word occurs in String is " + countOccurences(str, word));
	}
}
