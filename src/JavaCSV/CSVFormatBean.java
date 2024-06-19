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

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;

public class CSVFormatBean {
	
	
	//Declare the parameters with column names.
	@CsvBindByName(column="Name")
	private String Name;
	
	@CsvBindByName(column="username")
	private String username;
	
	@CsvBindByName(column="Date of joining")
	@CsvDate("dd-MM-yyyy")
	
	//Date data type for Date separately.
	private Date Date_of_joining;
	
	
	@CsvBindByName(column="Salary")
	//Mandatory to use $ symbol at last in csv files as well.
	@CsvNumber("####$")
	private int Salary;

/**
 * Above declaration of all the data's are private so using--
 * setter and getter methods.
 * Setter method set or Update the data.
 * Getter method will retun the data.
 * @return
 */
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Date getDate_of_joining() {
		return Date_of_joining;
	}


	public void setDate_of_joining(Date date_of_joining) {
		Date_of_joining = date_of_joining;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}

}
