/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below java code performing combination of multiple inheritances.
 *   Project:  Hybrid-inheritances
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 *********************************************************************************************/


package inheritances;					//Hybrid inheritances 

/**
 * Hybrid means combination of multiple inheritances
 */

//created two interfaces with following names
interface Flyable{				//behaviour of flying					
	void fly();
}

interface Swimming{				//behaviour of swimming
void swim();
}

//created class of Animal.
class Animal{
	void eat() {
		System.out.println("animals eats...");
	}
}

/**here created subclass called bird that inherits the--
 * --properties of Animal class as well as Flyable class.
 **/
class Bird extends Animal implements Flyable{
	public void fly() {
		System.out.println("birds are flying...");
	}
}

/*
 * Here new class created with name of Duck that acquire the--
 * --properties of Class Bird and Swimming interface also.
 */
class Duck extends Bird implements Swimming{
	public void swim() {System.out.println("duck is swimmable...");
	}
}
public class School {

	public static void main(String[] args) {
		
		Duck d=new Duck();
		d.eat();			//duck inherits the prop of bird and animal also
		d.fly();
		d.swim();
		
		System.out.println("-----------------------");
		
		
		Bird b=new Bird();
		b.eat();
		b.fly();
	}

}
