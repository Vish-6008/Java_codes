/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below Test[Thread] class implements using Runnable Interface.
 *   Project:  Test[Runnable Interface].
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/



package Threads_with_Mutli_Threading;							//Threads using runnable interface.

public class Test implements Runnable {
	
	@Override
	public void run() {			//override the run method mandatorily
		System.out.println("guy thread is created using runnable..");
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		//create the object of class and pass it to thread below
		Test t=new Test();		
		
		//create the object of thread and pass argument of above class
		Thread th=new Thread(t);  
		
		th.start();					//start calling thread class.
		

	}
	
}
