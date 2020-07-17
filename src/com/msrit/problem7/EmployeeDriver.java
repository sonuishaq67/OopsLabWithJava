/*
 * Create a Personal class to hold the personal details of a person such as name, age, education,
salary-(0basic, da, hra), years of experience, number of loans and loan amount. Write
constructors to assign values to the data members. Include an
a. isEligible() method to indicate whether the person is eligible for loan,
b. taxPay() method to indicate the amount of tax to be paid,
c. isEligiblePromotion() to indicate whether the person is eligible for a promotion.
d. Display () method to display the details.
Enter the details of n employees and indicate their eligibility and the tax to be paid.
 */
package com.msrit.problem7;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of employees to be created");
		int num = scanner.nextInt();
		Employee employees[] = new Employee[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the information for employee number "+(i+1));
			System.out.println("Enter the name");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Enter the age");
			int age = scanner.nextInt();
			System.out.println("Enter Education");
			scanner.nextLine();
			String education = scanner.nextLine();
			System.out.println("Enter years of experience");
			int experienceYears = scanner.nextInt();
			System.out.println("Enter number of Loans");
			int numberOfLoans = scanner.nextInt();
			System.out.println("Enter the basic salary");
			int basic = scanner.nextInt();
			System.out.println("Enter the loan amount");
			int loanAmount = scanner.nextInt();
			employees[i] = new Employee(name, age, education, experienceYears, numberOfLoans, basic, loanAmount);
		}
		for (int j = 0; j < num; j++) {
			System.out.println("This is employee number "+(j+1)+"'s Information");
			employees[j].Display();
			System.out.println("\n\n\n");
		}
		scanner.close();
	}

}
