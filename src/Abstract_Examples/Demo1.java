/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Acquiring the Demo class  properties using this Demo1 class.
 *   Project:  Demo1[Abstract] class
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *	 Build id: 20240307-1437
 ********************************************************************************************/

 

package Abstract_Examples;								//Abstract methods

public abstract class Demo1  extends Demo{
	abstract void start();
	
	void stop() {
		System.out.println("demo1 is overriden...");
	}

}
