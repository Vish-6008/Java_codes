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

package JavaCSV;

import com.opencsv.bean.CsvBindByPosition;

public class CsvNoHeader {
	@CsvBindByPosition(position = 0)
	private String Name;

	@CsvBindByPosition(position = 1)
	private String Surname;

	@CsvBindByPosition(position = 2)
	private String Sallary;

	/**
	 * Above declaration of all the data's are private so using-- setter and getter
	 * methods. Setter method set or Update the data. Getter method will retun the
	 * data.
	 * 
	 * @return
	 */

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getSallary() {
		return Sallary;
	}

	public void setSallary(String sallary) {
		Sallary = sallary;
	}

}
