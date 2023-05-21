package dataDriverFramWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String  ReadExcelData(String Filepath,String SheetNmae, int RowCount, int CellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(Filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetNmae);
		Row row = sheet.getRow(RowCount);
		Cell cell = row.getCell(CellCount);
		String data = cell.getStringCellValue();
		return data;
		
	}
	
	public int RowCount(String Filepath, String SheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(Filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}

}
