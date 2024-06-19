/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Reading All lines at one-time using CSV files.
 *   Project:  Read ALL CSV  data
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/

package JavaCSV; //Read entire lines at once 

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadAllCSV {

	public static void main(String[] args) throws IOException, CsvException {
		try {
			CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\DELL\\Documents\\demoo.csv"));

			// Call or ReadAll the lines and Store in the List
			List<String[]> lines = csvReader.readAll();

			// iterate above declared lines for all the row and columns
			for (String[] line : lines) {

				// dont know how many lines data we have so again will iterate.
				for (int i = 0; i < line.length; i++) {
					System.out.print(line[i] + "  ");
				}
				System.out.println("/n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
