/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  writing information to the file
 *   Project:  FileInformation
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/



package FileOperation;			//writing information to the file

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		File myObj=new File("C:\\Users\\DELL\\eclipse-workspace\\Crevavi\\src\\FileOperation\\File1.txt");
		if(myObj.exists()) {
			System.out.println("file name : "+myObj.getName());
			System.out.println("absolute path : "+myObj.getAbsolutePath());
			System.out.println("file can write : "+myObj.canWrite());
			System.out.println("file can read : "+myObj.canRead());
			System.out.println("File size in bytes.. : "+myObj.length());
		}else {
			System.out.println("file does not exists");
		}
		
		// TODO Auto-generated method stub

	}

}
