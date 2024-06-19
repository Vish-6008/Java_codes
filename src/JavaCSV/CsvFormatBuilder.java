/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  This file Read CSV File With Date And Number Type
 *   Project:  CSV Date-number format
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/



package JavaCSV;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class CsvFormatBuilder {
	public static void main(String[] args) {
		try {
			List<CSVFormatBean>csvBeanList=new CsvToBeanBuilder(new FileReader("C:\\Users\\DELL\\Documents\\format.csv"))
			.withType(CSVFormatBean.class).build().parse();
			
			for(CSVFormatBean cfb:csvBeanList) {
				System.out.println(cfb.getName()+"  "+cfb.getUsername()+"  "+cfb.getDate_of_joining()+"  "+cfb.getSalary());
				
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
