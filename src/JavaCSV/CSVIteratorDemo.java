/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  File can read through iterator method also.
 *   Project:  CSVIteratorDemo
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/


package JavaCSV;     //File can read through Iterator method also

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVIterator;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVIteratorDemo {

	public static void main(String[] args) {
		try {
			CSVIterator csvit=new CSVIterator(new CSVReader(new FileReader("C:\\Users\\DELL\\Documents\\demoo.csv")));
			String[]lines;		//TO each and every line
			while((lines=csvit.next())!=null) {  //to iterate with loop
				for(int i=0;i<lines.length;i++) {
					System.out.print(lines[i]+"--");
				}
				System.out.println();
				 
			}
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
