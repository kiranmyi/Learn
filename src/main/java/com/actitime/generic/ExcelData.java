package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
	public static String GetData(String filepath,String sheetName,int row,int cell)
	{
		File file=new File(filepath);
		try {
			FileInputStream fis=new FileInputStream(file);
		     Workbook wb=WorkbookFactory.create(fis);
		     Cell c = wb.getSheet(sheetName).getRow(row).getCell(cell);
		     String data = c.toString();
		     return data;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}


}
