/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below java code performs Multi-Threading tasks.
 *   Project:  My-Thread
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
********************************************************************************************/


package Threads_with_Mutli_Threading;					//MultiThreading tasks.

class MyThread extends Thread{
	
	//overriding the run method.
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread :" +Thread.currentThread()+ " is "+i);
			try {
				
				//waits for 5-seconds during execution.
				Thread.sleep(5000);
			}catch(Exception ex) {
				System.out.println(ex);
			}			
		}		
	}	
}

//main method where execution starts from-
public class Main {

	public static void main(String[]args) {
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		m1.start();
		m2.start();
		// TODO Auto-generated method stub

	}

}
