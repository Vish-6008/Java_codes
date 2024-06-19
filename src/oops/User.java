/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code execute and produce the output of[Abstraction] Bank and interface.
 *   Project:  User
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 *   ********************************************************************************************/

package oops;							//Abstraction output

public class User {

	public static void main(String[] args) {
//		ATM obj=new ATM();
//		obj.deposit(1500);
		
		
		//calling sublass properties ad storing in super class reference.
		Bank b=new ATM();
		
		
		b.deposit(250);
		
		b.withdraw(150);
		
		b.checkBalance();
		
		
		

	}

}
