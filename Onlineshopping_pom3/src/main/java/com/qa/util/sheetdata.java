package com.qa.util;

import java.util.ArrayList;



public class sheetdata {

	public static  ArrayList<String[]> get_sheet_data() {
		ArrayList<String[]> Testdata = new ArrayList();
		
		Xls_Reader reader = new Xls_Reader("./src/main/resources/testsheet/Datasheet.xlsx");
		for(int rownum=2;rownum<=reader.getRowCount("Sheet1");rownum++)
			
		{
			String email= reader.getCellData("Sheet1", "email", rownum);
			String f_name= reader.getCellData("Sheet1", "f_name", rownum);
			String l_name= reader.getCellData("Sheet1", "l_name", rownum);
			String password= reader.getCellData("Sheet1", "password", rownum);
			String address= reader.getCellData("Sheet1", "address", rownum);
			String city= reader.getCellData("Sheet1", "city", rownum);
			String pin_code= reader.getCellData("Sheet1", "pin_code", rownum);
			String m_no= reader.getCellData("Sheet1", "m_no", rownum);
			
			String[] obj= {email,f_name,l_name,password,address,city,pin_code,m_no};
			Testdata.add(obj);
			
		}
		return Testdata;
		
	}

}
