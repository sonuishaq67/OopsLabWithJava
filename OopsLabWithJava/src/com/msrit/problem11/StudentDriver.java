package com.msrit.problem11;

import java.util.Scanner;

import com.msrit.StudentPackage.RegisterStudent;

public class StudentDriver implements Student{
	String name,branch;
	Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		RegisterStudent regst=new RegisterStudent();
	}

	@Override
	public void getName() {
		System.out.println("Enter your name ");
		name=scan.nextLine();
	}

	@Override
	public void getBranch() {
		System.out.println("Enter your branch ");
		branch=scan.nextLine();
	}
}
