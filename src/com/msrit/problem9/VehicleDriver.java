/*Write a Java Program that does the following related to Inheritance:
a.
Create an abstract class called Vehicle which contains the
„year_of_manufacture‟ data member and two abstract methods „getData()‟ and
„putData()‟ with a constructor.
b. Create two derived classes “TwoWheeler” and “FourWheeler” and implement
the abstract methods. Make “FourWheeler” as final class.
c.
Create class „MyTwoWheeler‟ which is a sub-class of “TwoWheeler” and
demonstrate the use of super keyword to initialize data members of
“MyTwoWheeler”.*/
package com.msrit.problem9;

public class VehicleDriver {

	public static void main(String[] args) {
		MyTwoWheeler myTwoWheeler=new MyTwoWheeler(2000);
		System.out.println(myTwoWheeler.getData());
	}

}
