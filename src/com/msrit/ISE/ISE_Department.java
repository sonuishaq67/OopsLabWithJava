package com.msrit.ISE;

import java.util.*;

import com.msrit.problem10.*;

public class ISE_Department implements Department {
	Scanner scanner = new Scanner(System.in);
	List<Faculty> facultylist = new ArrayList<Faculty>();
	@Override
	public void readData() {
		System.out.println("Enter the number of faculty");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			Faculty faculty = new Faculty();
			System.out.println("Details of " + (i + 1));
			System.out.println("Enter the name of faculty member");
			faculty.name = scanner.nextLine();
			System.out.println("Enter the age");
			faculty.age = scanner.nextInt();
			System.out.println("Enter the years of experience");
			faculty.years_of_experience = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the designation");
			faculty.designation = scanner.nextLine();
			System.out.println("Enter the joining date");
			faculty.joiningDate = scanner.nextLine();
			System.out.println("Enter the subjects handled with spaces ");
			faculty.subjectsHandled = scanner.nextLine();
			facultylist.add(faculty);
		}
	}

	@Override
	public void printData() {
		for(int i=0;i<facultylist.size();i++) {
			System.out.print("Name: "+facultylist.get(i).name);
			System.out.println("Age: "+facultylist.get(i).age);
			System.out.println("Years of Experience: "+facultylist.get(i).years_of_experience);
			System.out.println("Designation: "+facultylist.get(i).designation);
			System.out.println("Joining Date"+facultylist.get(i).joiningDate);
			System.out.println("Subjects Handled"+facultylist.get(i).subjectsHandled);
		}
	}

	@Override
	public void print_number_designations() {

	}

	@Override
	public void number_research_consultancy_projs() {

	}
}

class AgeException extends Exception {
	private static final long serialVersionUID = 1L;
	private int detail;

	AgeException(int a) {
		detail = a;
	}

	public String toString() {
		return "Age is greater than [" + detail + "]";
	}
}
