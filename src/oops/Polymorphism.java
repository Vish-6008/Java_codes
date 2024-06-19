/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code performs one entity show dfferent behaviour when different objects--
 *   --are acting upon it. [Animal object can make sound of Lion and Dog also. 
 *   Project:  [Class]Animal-Polymorphism.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 *********************************************************************************************/


 

//

//
package oops;				//Polymorphism


class Animal{
	public void sound() {
		System.out.println("animal make sound in different styles..");
	}
}
class Lion extends Animal{
	public void sound() {
		System.out.println("Lion Roars always...");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("dog barks everytime...");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		
		
		//Up-casting process.
		Animal a1=new Lion();
		
		Animal a2=new Dog();
		
				//Animal can make sound of lion and dog as well.
		a1.sound();
		a2.sound();
		
		// TODO Auto-generated method stub
	}
}
