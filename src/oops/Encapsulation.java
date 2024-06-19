/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code combines the data member and member function in single entity.
 *   Project:  Encapsulation.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *   Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 *********************************************************************************************/


package oops;

/**
 * Encapsulation means wrapping the data member and member function in--
 *--a single entity...
 */
public class Encapsulation {
	
	private  String name;
	private int bankId;
	private int pincode;
	private int amount;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int bankId) {
		this.bankId=bankId;
	}
	public int getbankId() {
		return bankId;
	}
	
	public void setpincode(int pincode) {
		this.pincode=pincode;
	}
	
	public int getpincode() {
		return pincode;
	}
	
	
	public static void main(String[] args) {
		//Set's the arguments of every methods in the above class.
		Encapsulation en=new Encapsulation();
		en.setName("vish");
		en.setId(12893);
		en.setpincode(590001);
		
		//calling the arguments 
		System.out.println("name of the person is:" +en.getName());
		System.out.println("BankId:" +en.getbankId());
		System.out.println("pincode is:" +en.getpincode());
		
		


	}

}
