/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Performing the operation of Multiple-inheritances.
 *   Project:  Multiple-inheritances
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package inheritances;	//Multiple inheritance is not possible using class.

//created two interfaces with same method name a1
interface A{
	public void a1();
	}
interface  B{
	public  void a1(); 
	
}
//Interfaces cannot extends by classes
public class AB  implements  A, B{	
	
	public void a1() {
		System.out.println("A : Interface is executes...");
	}

	public static void main(String[]args) {
		
		//created objects of class AB in main method		
		AB obj=new AB();
		
		/**called a1 method to execute so ambiguity 
		 *Occured for a1 of which method should call first*/
		obj.a1();
		// TODO Auto-generated method stub

	}
}
