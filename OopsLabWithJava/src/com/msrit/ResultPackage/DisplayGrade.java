package com.msrit.ResultPackage;

import java.util.Scanner;

public class DisplayGrade {
	Scanner scanner=new Scanner(System.in);
	float SGPA;
	DisplayGrade(){
		System.out.println("Enter your grade");
		SGPA=scanner.nextFloat();
		if(SGPA>10)
		{
			System.out.println("Exception");
		}
	}
}
