/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Writing the information in the file.
 *   Project:  WriteToFile
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/



package FileOperation;			//Writing the information in the file

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\Crevavi\\src\\FileOperation\\File1.txt");
			fw.write("---java is an platform independent language---");
			fw.close();
			System.out.println("file wrote successfully..");
		} catch (IOException e) {
			System.out.println("an error occured..");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
