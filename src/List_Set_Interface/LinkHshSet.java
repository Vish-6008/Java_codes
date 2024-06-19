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



package List_Set_Interface;
//Importing from util packages.
import java.util.LinkedHashSet;

public class LinkHshSet {

	public static void main(String[] args) {
		
		//Creating new LinkedHashSet object and inserting values
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("crevavi");
		lhs.add("crevavi engineer");
		lhs.add("crevavi embeded");
		lhs.add("crevavi archtechture");
		lhs.add("crevavi automation");
		
		String getElement="crevavi embededeeeee";
		
		//For-Each loop for traversing purpose
		for(String s : lhs) {
			if(getElement.equals(s)) {
				System.out.println("found :"+s);
				break;
			}else {
					System.out.println("no such string");
					break;
			}
				
			}
		
			
		}
		
		// TODO Auto-generated method stub

	}


