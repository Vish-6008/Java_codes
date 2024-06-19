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



package Map_Interface;		//HashMap interface. It works with keys and value bases. 

import java.util.HashMap;

public class Maap {

	public static void main(String[] args) {
		//object creation with key and value format
		HashMap hm=new HashMap();
		hm.put(12,"samsung");
		hm.put(14,"Apple");
		hm.put(28, null);
		hm.put(16,"Dell");
		
		hm.put(18,"HP");
		hm.put(20,"Sony");
		
		hm.put(28,null);		//prints only one null key or value
		
		
		hm.put(30,"Apple");		//You can have duplicate values but Not Keys
		
		//hm.put(22,"Lenovo");	//if u insert twice but it prints once in O/P.
		System.out.println("initial maps are :"+hm);
		
//		String newvalue=(String)hm.put(12,"ASUS");
//		System.out.println("after adding new key :" +newvalue);
		
		
		hm.put(12, "Asuus"); //this is direct method replacing new value
		
		System.out.println("new key value :"+ hm);
		// TODO Auto-generated method stub
		
		//want to search the value using key 
		System.out.println(hm.get(16));
		
		System.out.println(hm.containsValue("Asuus "));

	}

}
