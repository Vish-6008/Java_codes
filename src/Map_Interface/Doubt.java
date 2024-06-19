/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  JiraRestApiUtils.java
 *   Project:  Tonal Logistics
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/


package Map_Interface;				//Hash-Map

import java.util.HashMap;

public class Doubt {

	public static void main(String[] args) {
		//Object creation with adding values
		HashMap hm=new HashMap();
		hm.put(1, "Nokia");
		hm.put(2, "Samsung");
		
		System.out.println(hm+"");
		
		//Now if i want to add onemore value to same key
		
		hm.put(1,"Dell");
		
		System.out.println(hm+""); //will replace 1st value with new one 
		// TODO Auto-generated method stub

	}

}
