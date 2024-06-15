package com.harshainfotech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	
	public static void main(String args[]) throws IOException 
	{
		FileInputStream f=new FileInputStream("C:\\Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(f);
		XSSFSheet sheet;
		
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			System.out.println(i);
			System.out.println(workbook.getSheetName(i));
			sheet=workbook.getSheet("student");
			
			XSSFRow row=sheet.getRow(3);
			XSSFCell cell=row.getCell(2);
			System.out.println(cell);
		}
		}
}

