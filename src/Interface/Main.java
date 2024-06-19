/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Performing Interface with example.
 *   Project:  Drawable_Interface.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 *********************************************************************************************/



package Interface;		//Interface and can't able to create object of interface
interface Drawable{
	void draw();
	
	String DEFAULT_COLOR="BLACK";
	
}
class Sketch implements Drawable {		//class to interface only implements

	@Override
	public void draw() {				//overriding the draw method
		System.out.println("sketch output is in colour shade..");
		// TODO Auto-generated method stub
		
	}
	
}
class Art implements Drawable{		//class to interface only implements

	@Override
	public void draw() {			//override the same draw method.
		// TODO Auto-generated method stub
		System.out.println("art output is in black shade..."); 		
	}	
}
public class Main {

	public static void main(String[] args) {		
		Art a=new Art();		//create the instance of subclasses
		a.draw();
		
		Sketch sk=new Sketch();	//create the instance of subclasses
		sk.draw();
		

	}

}
