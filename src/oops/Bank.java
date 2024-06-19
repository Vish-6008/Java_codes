/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Declaring the methods of Bank interface
 *   Project:  Bank
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 *   ********************************************************************************************/


package oops;							//Abstraction class 1
/**
 * ABSTRACTION means the process of Hiding the implementation of--
 * --the class only show's the output
 */

//created an inteface with only method declarations
 public interface Bank {
//	int amount=10000;
	void deposit(int amount);
	void  withdraw(int amount); 
	void checkBalance();
	
	abstract void display(); 

	
}
