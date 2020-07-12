package com.msrit.problem11;

import com.msrit.StudentPackage.RegisterStudent;

public class StudentDriver {

	public static void main(String[] args) {
		RegisterStudent regstud=new RegisterStudent();
		regstud.getStudentDetails();
		displayStudent(regstud);
	}
	static void displayStudent( RegisterStudent regstud) {
		
		
		
		
		
	}
}
class CreditLimitException extends Exception {

	private int credit;
	CreditLimitException(int credits){
		detail=a;
	}
	public String toString() {
		return "MyException["+detail+"]";
	}
}