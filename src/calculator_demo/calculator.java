/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below java code operating with calculator scenario.
 *   Project:  Calculator
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 * ********************************************************************************************/
 


package calculator_demo;

import java.util.Scanner;
 /**
  * This class does the operations of add,subtract,divide,multiplication
  **/
public class calculator {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the first element :"); 
		
		//Scanner class accepting the input from user
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("Enter the second element :");
		int b=sc.nextInt();
		
		int operation=sc.next().charAt(0);
		
		double result = 0;
		
		//Below switch case does the operations of following
		switch(operation) {
		case '+':
			result =a+b;
			break;
			
		case '-':
			result=a-b;
			break;
			
		case '*':
			result=a*b;
			break;
			
		case '/':
			if(b!=0) {
				result=(double)a/b;
				break;
				
			}
			
			else {
				System.out.println("/by zero.");
			}
			default:System.out.println("invalid operaion");
		}
		
		System.out.println("result ;"+result);
		// TODO Auto-generated method stub

	}

}
