package com.msrit.problem8;

import java.util.Scanner;

public class CircleDriver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the the radius of circle");
		float radius=scanner.nextFloat();
		Circle circle=new Circle(radius);
		System.out.println("The area of the circle is "+circle.circleArea());
		System.out.println("Enter the value of radian");
		float radian=scanner.nextFloat();
		Sector sector = new Sector(radius,radian);
		System.out.println("The area of the sector is "+sector.areaSector());
		System.out.println("Enter the value of length");
		float length=scanner.nextFloat();
		Segment segment = new Segment(radius,length);
		System.out.println("The area of the Segment is "+segment.areaSegment());
		scanner.close();
	}
}
