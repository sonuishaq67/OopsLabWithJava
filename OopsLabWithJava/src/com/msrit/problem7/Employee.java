package com.msrit.problem7;

class Salary {
	float basic, da, hra, total;

	Salary(float basic) {
		this.basic = basic;
		hra = (float) (basic * 0.4);
		da = (float) (basic * 0.6);
		total = (basic + hra + da);
	}

}

public class Employee {
	String name, education;
	int age, experienceYears, basic, numberOfLoans, loanAmount, tax;
	Salary salary;

	Employee(String name, int age, String education, int experienceYears, int numberOfLoans, int basic,
			int loanAmount) {

		this.name = name;
		this.age = age;
		this.education = education;
		this.experienceYears = experienceYears;
		this.numberOfLoans = numberOfLoans;
		this.basic = basic;
		this.loanAmount = loanAmount;
		salary = new Salary(basic);

	}

	void isEligible() {
		if ((loanAmount <= salary.total / 2) && (numberOfLoans < 5))
			System.out.println("Is eligible for loan");
		else
			System.out.println("Not eligible for loan");
	}

	void taxPay() {
		if (salary.total < 250000)
			tax = 0;
		else if ((salary.total > 250000) && (salary.total < 500000))
			tax = (int) (0.1 * salary.total);
		else if ((salary.total > 500000) && (salary.total < 1000000))
			tax = (int) (0.2 * salary.total);
		else if (salary.total > 1000000)
			tax = (int) (0.3 * salary.total);

	}

	void isEligiblePromotion() {
		if (experienceYears > 10)
			System.out.println("Eligible for promotion ");
		else
			System.out.println("Not eligible for promotion");
	}

	void Display() {
		System.out.println("name: " + name);
		System.out.println("age :" + age);
		System.out.println("education :" + education);
		System.out.println("Years of Experience: " + experienceYears);
		System.out.println("Number of Loans: " + numberOfLoans);
		System.out.println("Salary: " + salary.total);
		isEligible();
		System.out.println("The tax to be paid is " + tax);
		isEligiblePromotion();
		System.out.println("\n\n\n");
	}
}
