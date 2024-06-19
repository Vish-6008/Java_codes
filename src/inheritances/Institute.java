/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Trying to access a properties of one super class by--
 *   --two or more sub-classes.
 *   Project:  Hierachical-inheritances.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 * ********************************************************************************************/


package inheritances;					//Hierarchical inheritances

/**AN one super class inherited its properties by--
 * --two or more sub-classes.
 */
class dept3{
	void divA() {
		System.out.println("A div students won Football game...");		
	}
}
class dept2 extends dept3{
	void divB() {
		System.out.println("B div students won Volleyball game...");		
	}
}
class dept1 extends dept3{
	void divC() {
		System.out.println("A div students won cricket game...");		
	}
}

public class Institute {

	public static void main(String[] args) {
		
		//created object of 1st subclass i,e dept2
		
		dept2 d2=new dept2();
		d2.divA();
		d2.divB();
		
		//created object of 2nd subclass i,e dept1
		
		dept1 d1=new dept1();
		d1.divA();
		d1.divC();
//		
		
		// TODO Auto-generated method stub

	}

}
