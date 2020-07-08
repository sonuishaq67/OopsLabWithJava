package com.msrit.problem9;

public abstract class Vehicle {
	public int year_of_manufacture=100;

	Vehicle() {
	}

	public abstract void getData();

	public abstract void putData();
}

class TwoWheeler extends Vehicle{

	@Override
	public void getData() {
		
		
	}

	@Override
	public void putData() {
		
		
	}
	TwoWheeler()
	{
		year_of_manufacture=100;
		System.out.println(year_of_manufacture);
	}
	

}
	
final class FourWheeler extends Vehicle{

	@Override
	public void getData() {
		
		
	}

	@Override
	public void putData() {
		
		
	}
	
}