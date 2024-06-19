/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  creating the new file to write n read information.
 *   Project:  CreateFile
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/



package FileOperation;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File myObj=new File("C:\\Users\\DELL\\eclipse-workspace\\Crevavi\\src\\FileOperation\\File1.txt");
			
			//using reference variable creating the file for above path
			if(myObj.createNewFile()) {
				System.out.println("file created :"+myObj.getName());
			}else {
				System.out.println("file already exists....");
			}
		}
		catch(IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
			
		}
		// TODO Auto-generated method stub

	}

}
