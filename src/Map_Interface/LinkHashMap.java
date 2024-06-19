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



package Map_Interface;			//Linked HashMap maintains insertion order

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(11,"DEVELOPMENT");
		lhm.put(12,"Testing");
		lhm.put(13,"Database");
		lhm.put(14,"Devops engineer");
		lhm.put(15,"web-developer");
		
		System.out.println(lhm+"");
		
		//System.out.println(lhm.get(13));   //if u want particular value of key
		
		HashMap<String, Integer> hm=new HashMap();
		hm.put("Tom",12);
		hm.put("Jerry",10);
		hm.put("audience",15);
		
		//System.out.println(hm+"");
		
		
		//Using HashMap
		Set<String> ss1=hm.keySet();
		
		
		for(String keyy:ss1) {
			System.out.println(keyy+ " is " +hm.get(keyy)+" year old");
		}
		
		//Using Linked HashMap
		 
		Set<Integer> s=lhm.keySet();
		
		
		System.out.println("-----------------");
		for(int key:s) {
			System.out.println(key+"---->"+lhm.get(key));
			
		}
		
		// TODO Auto-generated method stub

	}

}
