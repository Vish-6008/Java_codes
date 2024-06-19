/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Read entire csv with bean class data from eclipse
 *   Project:  CSVRBean
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/


package JavaCSV;			//Read entire csv with bean class data from eclipse

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class CSVRBean {
	
	
	@CsvBindByName(column="Name")
	private String name;
	
	@CsvBindByName(column="Surname")
	private String surname;
	
	@CsvBindByName()
	private String Sallary;  //need to mention same name as column so dat it works-- 
							//--without parameters..
	@CsvBindByName()
	private String Location;
	
	@CsvBindByName()
	private String Designation;
	


	
		//Generating setter and getter methods.
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSallary() {
		return Sallary;
	}

	public void setSallary(String sallary) {
		Sallary = sallary;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	
//	@Override
//	public String toString() {
//		return "CSVRBean [name="+name + ", surname=" + surname + ", Sallary=" + Sallary
//				+ ", Location=" + Location + ", Designation=" + Designation + ", DesignationData=" + DesignationData
//				+ "]";
//	}

}
	
	

	

