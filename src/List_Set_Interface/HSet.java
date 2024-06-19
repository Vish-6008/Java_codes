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



package List_Set_Interface;					//HashSet 

import java.util.HashSet;
import java.util.Set;

public class HSet {

	public static void main(String[] args) {
		
//Since it is Hetero-Geneous type it store all types of data-types 
		HashSet s=new HashSet();
		//Set hs=new HashSet();
		s.add(10);
		s.add(15.50);
		s.add("HASHSET");
		s.add(0);
		s.add(10);
		s.add(null);		
		System.out.println(s.size()); //duplicates are not allowed so not count them

	}

}
