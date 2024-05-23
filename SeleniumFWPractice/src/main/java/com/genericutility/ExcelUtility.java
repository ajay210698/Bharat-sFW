package com.genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	
	public String GetTheDataFromExcelFile(String sheet, int rownum, int cellnum) throws Throwable {
		FileInputStream fis =new FileInputStream("C:\\Users\\bhara\\OneDrive\\Documents\\seleniumSample.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data= wb.getSheet(sheet).getRow(rownum).getCell(cellnum).getStringCellValue();
	return data;	
	}
	
	
	public void WriteTheDataIntoExcelFile(String sheet, int rownum, int cellnum, String Data) throws Throwable, Throwable {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\bhara\\OneDrive\\Documents\\seleniumSample.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(rownum).createCell(cellnum).setCellValue(Data);;
		FileOutputStream fos= new FileOutputStream("C:\\Users\\bhara\\OneDrive\\Documents\\seleniumSample.xlsx");
		wb.write(fos);
		
	}
	
	public int GetRowNumOfExcelSheet(String sheet) throws Throwable {

		FileInputStream fis =new FileInputStream("C:\\Users\\bhara\\OneDrive\\Documents\\seleniumSample.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		 int num=wb.getSheet(sheet).getLastRowNum();
		return num;
		
	}
	
	
}
