package pageObjectModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//read the Excel Data
	
	public String readExcelData(String ExcelPath, String SheetName, int RowCount, int CellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(ExcelPath);	//Provide the excel path
		Workbook wb = WorkbookFactory.create(fis);	//make a file readt for read
		Sheet sheet = wb.getSheet(SheetName);	//get the sheet file
		Row row = sheet.getRow(RowCount); 	//get the desider row
		Cell cell = row.getCell(CellCount); 	//get the desider Cell/col
		String data=cell.getStringCellValue();	
		return data;
	}
	
	//RowCount
	public int rowCount(String ExcelPath, String SheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		int rc = sheet.getLastRowNum();
		return rc;
		
		
	}
	
	//Create Excel Data
	
	public void createExcelData(String ExcelPath, String SheetName, int rowCount, int CellCount, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(CellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(ExcelPath);
		wb.write(fos);
		
	}
	
	//Read The Property File
	public String readPropertyData(String PropPath, String key) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(PropPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
		
	}
	

}
