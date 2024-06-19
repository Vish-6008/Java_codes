/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below java code perform Threads task with priority one's.
 *   Project:  MThreads
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/


package Threads_with_Mutli_Threading;							//Threads with priorities


//set's the priority for threads to which one should get prior.
public class MThread extends Thread 
{
	public MThread(String name) {	 //constructor using class name 
		super(name);
	}
	
	public void run()
	{
							
		
	while(true) {
		System.out.println("thank you :"+this.getName());
		
		}
	}


	public static void main(String[] args) {
		MThread m1=new MThread("king.......... ");
		MThread m2=new MThread("Queen");
		MThread m3=new MThread("Boys");
		MThread m4=new MThread("Girls");
		MThread m5=new MThread("kids");
		System.out.println();
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		m1.setPriority(MAX_PRIORITY); //m1 method has set to priority.
		
		System.out.println(m1.getId());	//optional methods in threads
	
		// TODO Auto-generated method stub

	}

}
