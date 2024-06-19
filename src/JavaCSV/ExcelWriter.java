/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  creating new excel sheet with a data using java-eclipse.
 *   Project:  ExcelWriter
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/



package JavaCSV;		//writing Normal-Excel file in java-eclipse
 
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
    public static void main(String[] args) {
        // Create a new workbook

        Workbook workbook = new XSSFWorkbook(); // for .xlsx format
        /**In the above declared XSSF i,e  XML Spreadsheet Format.
         *It's a part of Apache POI,-a popular Java library-  
         * used for working with Microsoft Office documents-
         *-such as Excel spreadsheets.
         */

        // Create a blank sheet in the excel
        Sheet sheet = workbook.createSheet("Sheet1");

        // Data's to be written into the sheet
        Object[][] data = {
                {"Name", "Age", "City","sallary"},
                {"Abhishek", 27, "Bengaluru",15000},
                {"Vrishabh", 27, "Belagavi",25000},
                {"Amrut", 25, "Hyderabad",35000},
                {"Niranjan",24,"Belagavi",40000}
        };

        // Iterate over the data and write it to the sheet
        int rowNum = 0;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        // Write the workbook to an Excel file
        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\DELL\\Documents\\writedemo.xlsx")) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Excel file created successfully.");
    }
}
