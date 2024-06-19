/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Handling exceptions using Checked-Exception
 *   Project:  FHandling
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/



package Exception_Handling;		//checked exception using FileNotFound exception

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FHandling {

	public static void main(String[] args) {
		
		try {
			//inserting the path as arguments.
			FileReader fl=new FileReader("/Crevavi/src/Exception_Handling/FHandling.jav'a");
			
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
			
		}
		//Finally prints irrespectively
		finally {
			System.out.println("handled...");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
