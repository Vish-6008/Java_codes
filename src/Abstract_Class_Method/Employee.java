/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose: Below code show's the flow of Abstract Keywords and Methods.
 *   Project: Abstract[Class] Person
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/

package Abstract_Class_Method; //Abstract keyword and methods

abstract class Person {
	// Abstract class allows both abstract method and concrete method

	// Abstratc method
	abstract void show();

	// concrete method or normal method
	void display() {
		System.out.println("abstract method....");
	}
}

class Employee extends Person {
	// normal method
	void show() {
		System.out.println("abstract is executes");
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.show();
		emp.display();
		// TODO Auto-generated method stub
	}

}
