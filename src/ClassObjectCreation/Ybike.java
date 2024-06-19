/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Class and Object Creation.
 *   Project:  YBIKE-->Class name
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/


package ClassObjectCreation;

public class Ybike {					//class  creation
	int cost;							//behaviours of properties and behaviours
	String name;						//class do not consume any memory spaces
	String behave;
	
	public  Ybike(int cost,String name,String behave) {
		this.cost=cost;
		this.name=name;
		this.behave=behave;
	}
	
	public void start() {
		System.out.println("successfully started...");
	}
	public static void main(String[] args) {
		
		//objects consumes memory spaces but class does not.
		Ybike yb=new Ybike(2000,"duke","runs very fast");	//object creates
		System.out.println("cost of bike is :"+yb.cost);
		System.out.println("name of bike is :"+yb.name);
		System.out.println("behave of the bike is "+yb.behave);
		
		yb.start();
		}
	

}
