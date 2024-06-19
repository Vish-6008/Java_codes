/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Read the information from the file.
 *   Project:  ReadFromFile
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/



package FileOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		File myObj=new File("C:\\Users\\DELL\\eclipse-workspace\\Crevavi\\src\\FileOperation\\File1.txt");;
		try {
			Scanner myReader=new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data=myReader.nextLine();
				System.out.println(data);
			}myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("error occured so plz check the code once again");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
