/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Performing Exception handling using Throw Keyword.
 *   Project:  EHandling.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/



package Exception_Handling;		//Exception handling using throw keyword

public class EHandling {
	public static void  validate(int age) {
		
		//Here condition applies for the operation.
		if(age<18) {
			throw new ArithmeticException("Not eligible for voting..");
			
		}
		else {
			System.out.println("welcome to voting");
		}
		
	}

	public static void main(String[] args) {
		
		//It validates or checks the age then produce the result.
		
		validate(18);
		// TODO Auto-generated method stub

	}

}
