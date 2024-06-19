/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Read entire csv with bean class data from eclipse
 *   Project:  ReadEntireCSV
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/



package JavaCSV;    //Read entire csv with bean class data from eclipse

//Main class of CSVRBean class
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class ReadEntireCSV {

	public static void main(String[] args) {
		
		try {
			List<CSVRBean> csvBeanReader= new CsvToBeanBuilder(new FileReader("C:\\Users\\DELL\\Documents\\demo.csv"))
					.withType(CSVRBean.class).build().parse();
		
				
			for(CSVRBean ch:csvBeanReader) {
				//simply take our generated get items
				System.out.println(ch.getName()+"--"+ch.getSurname()+"--"+ch.getSallary()+"--"+ch.getLocation()+"--"+ch.getDesignation());
			}
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
