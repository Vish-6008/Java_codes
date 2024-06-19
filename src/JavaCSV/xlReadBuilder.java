/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Read the excel file data's 
 *   Project:  xlReadBuilder
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/



package JavaCSV;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlReadBuilder {

	public static void main(String[] args) throws IOException {
		File xlfile=new File("C:\\Users\\DELL\\Documents\\exeldemo.xlsx");
		FileInputStream fis=new FileInputStream(xlfile);
		
		//we create xssf workbook object for our xlsx excel file
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//we get first sheet
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//Iterate on rows
		Iterator<Row> rowIt=sheet.iterator();
		
		while(rowIt.hasNext()) {
			Row row=rowIt.next();
			
			//iterate on cells for current row
			Iterator<Cell> cellIterator=row.cellIterator();
			
			while(cellIterator.hasNext()) {
				Cell cell=cellIterator.next();
				System.out.print(cell.toString()+"");
			}
			System.out.println();
			
		}
		workbook.close();
		fis.close();

	}

}
