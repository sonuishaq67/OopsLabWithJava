package com.msrit.problem2;

import java.util.*;

public class Account {
	int accno;
	long phoneNo;
	String name;
	float balanceAmt;
	Scanner scanner = new Scanner(System.in);

	void getInput() {
		System.out.println("Enter the name");
		name = scanner.nextLine();
		System.out.println("Enter the account number");
		accno = scanner.nextInt();
		System.out.println("Enter the phone number");
		phoneNo = scanner.nextLong();
		System.out.println("Enter the current balance amount");
		balanceAmt = scanner.nextFloat();

	}

	void deposit(float amount) {
		balanceAmt += amount;
		System.out.println("Deposited " + amount + " in the account");
		System.out.println("Current balance is " + balanceAmt);
	}

	void withdraw(float amount) {
		if (amount <= balanceAmt) {
			balanceAmt -= amount;
			System.out.println(amount + " was withdrawed from the account");
			System.out.println("Current balance is " + balanceAmt);
		} else {
			System.out.println("Transaction failed");
			System.out.println("Current balance is " + balanceAmt);
		}
	}
}
