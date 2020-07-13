package com.msrit.StudentPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.msrit.problem11.Student;

public class RegisterStudent implements Student {
	public String Name, Branch, JoinDate;
	public int Semester;
	Scanner scan = new Scanner(System.in);
	public List<Subject> subjectlist = new ArrayList<Subject>();
	Scanner scanner = new Scanner(System.in);

	public void getStudentDetails() {
		System.out.println("Enter the name");
		Name = scan.nextLine();
		System.out.println("Enter your branch");
		Branch = scan.nextLine();
		System.out.println("Enter join date");
		JoinDate = scan.nextLine();// change it to date format
		System.out.println("Enter Semester");
		Semester = scan.nextInt();
		System.out.println("Enter the number of subjects ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			Subject subject = new Subject();
			System.out.println("Enter the name of " + (i + 1) + " subject");
			scan.nextLine();
			subject.name = scan.nextLine();
			System.out.println("Enter the Credits of subject");
			subject.credits = scan.nextInt();
			System.out.println("Enter the grade of subject");
			subject.grade = scan.nextInt();
			subjectlist.add(subject);
		}

	}
}


