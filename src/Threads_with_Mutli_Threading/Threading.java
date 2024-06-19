/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below Normal Thread by extending Thread class.
 *   Project:  Thread-Class.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/



package Threads_with_Mutli_Threading;			//normal thread by extending thread class
//Rule-1 public non-abstract class
public class Threading extends Thread {
	
	//Rule-2Overriding the run method
    @Override
    public void run() {
    	System.out.println("hey vishwa.. thread is created");
        
    }

    public static void main(String[] args) {
    	//Rule-3 create the object of thread class
        Threading t1 = new Threading();
        
        //Rule-4 start calling run method or start method.
       // t1.run();			//if u call run method directly Fine it works but does not separate call stack
        t1.start();	//if u use start method then internally it calls run method
    }

   
}
