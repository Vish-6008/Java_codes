/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Read entire data without header part.
 *   Project:  CSV-Iterator with No-Header
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/


//

//
package JavaCSV;
      //Main method of CSVNo-Header class
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class CsvBeanWithNoHeader {
	public static void main(String[] args) {
		List<CsvNoHeader> csvReader;
		try {
			csvReader = new CsvToBeanBuilder(new FileReader("C:\\Users\\DELL\\Documents\\names.csv"))
			.withType(CsvNoHeader.class).build().parse();
			
			
			//iterate entire data through for-each loop
			for(CsvNoHeader ch:csvReader) {
				System.out.println(ch.getName()+"--"+ch.getSurname()+"--"+ch.getSallary());
			}		
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	  
	}
}
