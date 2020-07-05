package com.msrit.problem7;

class Salary {
	int basic, da, hra;

	void init(int basic) {
		this.basic = basic;
	}

	int total;
}

public class Employee {
	String name;
	int age;
	String education;
	int experienceYears;
	int numberOfLoans;
	int loanAmount;
	Salary salary;

	void isEligible() {
		if (loanAmount <= salary.total / 2)
			System.out.println("Is eligible for loan");
		else
			System.out.println("Not eligible for loan");
	}

	void taxPay() {
		int tax;
		if (salary.total < 250000)
			tax = 0;
		else if ((salary.total > 250000) && (salary.total < 500000))
			tax = (int) (0.1 * salary.total);
		else if ((salary.total > 500000) && (salary.total < 1000000))
			tax = (int) (0.2 * salary.total);
		else if (salary.total > 1000000)
			tax = (int) (0.3 * salary.total);

	}
	void isEligiblePromotion()
	{
		if (experienceYears>10)
			System.out.println(true);
		else
			System.out.println(false);
	}
	void Display()
	{
		System.out.println("name: "+name);
		System.out.println("age :"+age);
		System.out.println("education :"+education);
		System.out.println("Years of Experience: "+experienceYears);
		System.out.println("Number of Loans: "+numberOfLoans);
		System.out.println("Salary: "+salary.total);
	}
}
