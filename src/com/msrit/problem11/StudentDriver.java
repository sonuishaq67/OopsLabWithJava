package com.msrit.problem11;

import com.msrit.StudentPackage.RegisterStudent;

public class StudentDriver {

	public static void main(String[] args) {
		RegisterStudent regstud = new RegisterStudent();
		regstud.getStudentDetails();
		try {
			displayStudent(regstud);
		} catch (CreditLimitException e) {
			
			e.printStackTrace();
		} catch (SGPAException e) {
			e.printStackTrace();
		}
	}

	static void displayStudent(RegisterStudent regstud) throws CreditLimitException, SGPAException{
		int creditSum = 0, SGPA = 0;

		System.out.println("Name: " + regstud.Name);
		System.out.println("Branch: " + regstud.Branch);
		System.out.println("Join Date: " + regstud.JoinDate);
		System.out.println("Semester number: " + regstud.Semester);
		System.out.println("Subjects: ");
		for (int i = 0; i < regstud.subjectlist.size(); i++) {
			System.out.println("Subject name: "+regstud.subjectlist.get(i).name);
			creditSum = creditSum + regstud.subjectlist.get(i).credits;
			SGPA=SGPA+regstud.subjectlist.get(i).grade*regstud.subjectlist.get(i).credits;
		}
		if(creditSum>30)
			throw new CreditLimitException(creditSum);
		SGPA=SGPA/creditSum;
		if(SGPA>10)
			throw new SGPAException(SGPA);
	}

}