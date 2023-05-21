package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Read data from ipl ecxel sheet
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");      //Provide The Path Of  Excel File
		 Workbook wb = WorkbookFactory.create(fis);     //Make The File Ready for Read
		 Sheet sheet = wb.getSheet("IPL");      //Get Into The Sheet
		Row row = sheet.getRow(1);      //get into disired row
		Cell cell = row.getCell(1);     //get into disired cell or col
		String data = cell.getStringCellValue();    //read the valuem from cell
		System.out.println(data);
		

	}

}
