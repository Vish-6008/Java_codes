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



package List_Set_Interface;							//ArrayList

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();		//creating new ArrayList
		
		//Adding elements
		al.add(10);
		al.add("crevavi");
		al.add(01);
		al.add(01);  	//Duplicates are allowed
		al.add(10.15);
		al.add(0.05f);
		//al.add();			//So here we can't add null values
		al.add(null);
		al.add(10);
		
		//printing al 
		System.out.println(al+"");
		
		
		//Removing elements by their index
		//al.remove(10);	//we can remove by their index not by elements or address
		
		al.remove(0);    //works fine by index
		System.out.println(al+"");
		
		//isEmpty method results in true or false
		System.out.println(al.isEmpty());
		
		
		//size method show's how many elements are there in ArrayList
		System.out.println(al.size());
		
		//contains method show the given element is contains or not results in true or false
		System.out.println(al.contains(10.15));
		
		
		//clear method removes all the elements in the ArrayList.
		al.clear();
		System.out.println(al+"");

	}

}
