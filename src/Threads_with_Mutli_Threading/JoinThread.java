/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose: Join thread makes wait one thread to finish execution--
 *		-- of current thread. 
 *   Project:  Join_Thread
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
********************************************************************************************/


package Threads_with_Mutli_Threading;		
/*/join thread makes wait one thread to finish execution--
 *-- of current thread
 */

 public class JoinThread extends Thread{
	public void run() {
		
		for(int i=0;i<=5;i++) {
			try {
				
				
//Sleep methods stops the execution for prticular time in mili-seconds
				Thread.sleep(3000);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}System.out.println("i am readyy :"+i);
		}
		
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws InterruptedException {
		JoinThread JT1=new JoinThread();
		JoinThread JT2=new JoinThread();
		
		
		JT1.join();
		JT1.start();
		JT2.join();
		JT2.start();
		
		// TODO Auto-generated method stub

	}


	

}
