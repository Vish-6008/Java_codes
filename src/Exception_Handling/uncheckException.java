/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Handling exceptions using UN-Checked-Exception
 *   Project:  UnChecked.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/



package Exception_Handling;							//Unchecked exception.

public class uncheckException {

	public static void main(String[] args) {
		//Creating and initializing array
		int[]a= {1,2,3,4,5};
		try {
			int num=a[4];
		}catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
		}finally {
			System.out.println("handled...");
		}
		// TODO Auto-generated method stub

	}
}
