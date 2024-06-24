/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Abstract methods are created.
 *   Project:  Demo2
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *				Version: 2022-02 (4.0.0)
 *  			Build id: 202202
 ********************************************************************************************/


package Abstract_Examples;								//Abstract methods 

public class Demo2 extends Demo1 {
	
	public void show() {
		System.out.println("demo is overridden...");
	}
	
	public void start() {
		System.out.println("demo2 method overridden...");
	}

	public static void main(String[] args) {
		
		Demo2 d2=new Demo2();
		d2.display();
		d2.show(); 
	
		
		
		// TODO Auto-generated method stub

	}

}
