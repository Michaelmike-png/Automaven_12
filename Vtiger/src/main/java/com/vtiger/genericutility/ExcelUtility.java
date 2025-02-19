package com.vtiger.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getStringDataFromeExcel1(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	 Workbook Workbook = WorkbookFactory.create(fis);
	return Workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	
public boolean getBooleanDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	Workbook Workbook = WorkbookFactory.create(fis);
	return Workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
}
	
public  double getNumberDataFromeExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	Workbook Workbook = WorkbookFactory.create(fis);
	return Workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
}
public LocalDateTime getDataFromelocatdateTime(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	Workbook Workbook = WorkbookFactory.create(fis);
	return Workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
}
			

			
			
			
}

