/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose: Performing Exception Handling using Try-Catch-Finally block.
 *   Project: ExHandling
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/



package Exception_Handling;					//Using try catch finally blocks 

public class ExHandling {

	public static void main(String[] args) {
		int[]a=new int[5];
		String s=null;
		try {
			//trying to initialize with more numbers
			a[20]=10;
			//System.out.println(a[2]/0);
			//System.out.println(a[5]/0);
			
			System.out.println(s.length());
			System.out.println(a[20 ]);
			
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
//finally block prints the message irrespective of error or exception
		finally{
			System.out.println("over...");
		}
		// TODO Auto-generated method stub

	}

}
