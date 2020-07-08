package com.msrit.problem8;

public class Circle {
	float radius;

	Circle(float radius) {
		this.radius = radius;
	}

	float calcArea() {
		float area = (float) (3.14 * radius * radius);
		return area;
	}
}

class Sector extends Circle {
	float radian;
	Sector(float radius,float radian) {
		super(radius);
		this.radian = radian;
	}
	
	float calcArea() {
		float area = (float) (0.5 * radian * radius * radius);
		return area;
	}
}

class Segment extends Circle {
	float length;

	Segment(float radius,float length) {
		super(radius);
		this.length = length;
	}

	float calcArea() {
		float area=(float) ((radius*radius)*((radius-length)/length)-(radius-length)*Math.pow((2*radius*length-(length*length)),0.5));
		return area;
	}
}