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



package List_Set_Interface;					//Linked-list

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		
		//object creation with inserting values.
		LinkedList ll=new LinkedList();
		
		
		ll.add(010);
		ll.add(023);
		ll.add(27);
		ll.add(28);		
		ll.add(12);
		ll.add("crevavi");
		
		//LL follows insertion order so will add one by one
				
		ll.addFirst(202);
		ll.addFirst(133);	
		ll.add("crevavi technology");
		ll.add(14);
		ll.add("crevavi engineering");
		
		ll.addLast(210);		//Adding element in the last index
		
		
		//want to get the first element
		System.out.println(ll.getFirst());
		
		
		//to know the index of any elements
		System.out.println(ll.indexOf(14));
		
		System.out.println(ll+" ");
		
		
		
		LinkedList l2=new LinkedList();
		l2.add(111);
		l2.add(112);
		l2.add(113);
		
		
		//System.out.println(l2+"");
		System.out.println(ll.addAll(l2));
		
		
		// TODO Auto-generated method stub

	}

}
