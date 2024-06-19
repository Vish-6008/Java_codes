/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  performing the operation of Multi-Level inheritances 
 *   Project:  Multi-Level inheritances
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/

package inheritances; //Multi-Level inheritances

/**
 * Multi-Level means where a class extends another class,-- -- and then another
 * class extends that subclass
 */
class University3 {
	void div() {
		System.out.println("u3 :divisions are in same building but different floors..");
	}

	void garden() {
		System.out.println("garden is in entry point...");
	}

	void clas() {
		// super.clas();
		System.out.println("U3 :classes are moderate...!");
	}

//	void clas() {
//		System.out.println("classes are cool...!");
//	}
}

/**
 * created 2nd Super class Unversity2 that inherits the-- properties of class
 * University3
 **/

class University2 extends University3 {

//	void div() {
//		super.div();
//		System.out.println("divisions are in same floors..");
//	}	
	void clas() {
		System.out.println("u2:classes are not cool...!");
	}

	void garden() {
		System.out.println("u2 :garden is in entry point...");
	}

}

/**
 * created 3rd Super class Unversity1 that inherits the-- properties of class
 * University2
 **/

class University1 extends University2 {

//	void div() {
//		super.div();		
//		System.out.println("divisions are not there..");		
//	}	
//	void clas() {
//		//super.clas();
//		System.out.println("u1 :classes are moderate...!");
//	}
//	void garden() {
//		System.out.println("u1 :garden is in entry point...");
//	}
}

public class University {

	public static void main(String[] args) {
		University3 u3 = new University3();
		University2 u2 = new University2();

		University1 u1 = new University1();

		University3 u4 = new University1();
//		
//		u1.div();
//		u1.clas();
//		u1.garden();
//		

		u4.div();
		u4.clas();
		u4.garden();
		// TODO Auto-generated method stub

	}

}
