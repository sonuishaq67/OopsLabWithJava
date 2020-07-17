/*
  Create a class called account with the data members(Accno – integer, name String,
Phone_No: integer, balance_amt:float), and following methods :
a. getinput() to get input from the user
b. Deposit() method which takes the amount to be deposited in to his/her account and
do the calculation.
c. Withdraw() method which gets the amount to be withdrawn from his/her account.
d. Print the appropriate results.
 */
package com.msrit.problem2;

import java.util.Scanner;

public class AccountDriver {

	public static void main(String[] args) {
		Account account = new Account();
		account.getInput();
		Scanner scan=new Scanner(System.in);
		int i = 0;
		while (i != 3) {
			System.out.println("\n\n\n\nEnter a choice \n1)Withdraw \n2)Deposit\n3)Exit\n");
			i=scan.nextInt();
			if(i==1)
			{
				System.out.println("Enter the amount you want to withdraw\n");
				float withdrawAmount=scan.nextFloat();
				account.withdraw(withdrawAmount);
			}
			else if(i==2)
			{
				System.out.println("Enter the amount you want to deposit\n");
				float depositAmount=scan.nextFloat();
				account.deposit(depositAmount);
			}
		}
		scan.close();
	}

}