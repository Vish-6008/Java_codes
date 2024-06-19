/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code performs the Backend-operation of Bank interface
 *   Project:  class ATM
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 *********************************************************************************************/


package oops;						//Abstraction class 2

/**
 * Here initializing the all methods with respective operations
 */

//Class ATM acquires the properties of interface Bank.
public class ATM implements Bank{
	
	int balance=2000;
	
	public void display() {
		System.out.println("amountttttt");
	}
	public void deposit(int amount) {
		System.out.println("enter the amount to be deposit :"+amount);
		 balance=balance+amount;
		 System.out.println("amount successfully deposited"+balance);
		
	}
	public void withdraw(int amount) {
		System.out.println("enter the amount to be withdrawn :"+amount);
		balance=balance-amount;
		System.out.println("successfully withdrawn");
		
	}
	public void checkBalance() {
		System.out.println("available amount is :"+balance);
		
	}
	

}
