package JavaCSV;			//Read excel file similar as csv files

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;

public class xlRead {
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
		//Mandatory to use $ symbol at last 
		@CsvNumber("####$")
		private int Salary;
		
		@CsvBindByName(column="Location")
		private String Location;


}
