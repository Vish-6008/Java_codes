/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose: Read the CSV files data Line-by-Line.
 *   Project:  ReadCSVFile
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/

package JavaCSV;			//Reading CSV files

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadCSVFile {

	public static void main(String[] args)throws IOException, CsvValidationException {
		try {
			CSVReader csvReader=new CSVReader(new FileReader("C:\\Users\\DELL\\Documents\\demoo.csv"));
			//String array
			String[]lines;
			
			/*
			 * Iterating with while loop bcz of so many data until nextline should be null or no data.
			 */
			
			//ReadNext means reads line by line from CSV file.
			while((lines=csvReader.readNext())!=null) {
				
				
				for(int i=0;i<lines.length;i++) {
					System.out.print(lines[i]+"-----");
				}
				System.out.println();
			}
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
