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

public class ReadEcxelData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");   //Provide The Path Of file
		Workbook wb = WorkbookFactory.create(fis);     //Make A File Ready for Read
		Sheet sheet = wb.getSheet("IPLCUP");    //goto the sheet file
		Row row = sheet.getRow(1);         //goto the destroid row
		Cell cell = row.getCell(0);        //goto the destiod col/cell
		String data = cell.getStringCellValue();     //read th cell value
		System.out.println(data);
	}

}
