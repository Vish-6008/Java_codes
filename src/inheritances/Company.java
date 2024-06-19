/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Sub-class acquiring the properties of super class.
 *   Project:  Single inheritances.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
********************************************************************************************/

package inheritances;							//Single inheritances

/**Single inheritance inherits  the properties of--
 * --only one class.
 */

//created class 1 with a name called company1 with 3 methods
class Company1{
	void department() {
		System.out.println("Accounting Department ");
	}
	
	void area() {
		System.out.println("company 1:Gaming area is in different area..");
	}
	void cafe() {
		System.out.println("company 1:cafeteria is outside...");
	}
}

/*created class 2 with a name called company2 that inherits--
 * --the properties of classs 1
 */
class Company2 extends Company1{
	
	void department() {
		
		System.out.println("company 2 :Conference Department..");
	}
	void area() {
		System.out.println("company2 :Gaming area is in same area...");
	}
	
}
public class Company{

	public static void main(String[] args) {
		//objects are created with class names
		Company1 c1=new Company1();
		Company2 c2=new Company2();
		Company1 c3=new Company2();
		
//		c1.area();
//		c2.department();
//		c2.area();
//		c2.cafe();
		
		c3.area();

	}
}
