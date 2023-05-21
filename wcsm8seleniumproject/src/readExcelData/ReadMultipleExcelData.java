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

public class ReadMultipleExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//Read The Multiple Excel Data
		for(int i=1;i<10;i++)
		{
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");//To Provide The Path Of File
		Workbook wb = WorkbookFactory.create(fis);//Make The File Ready For Read
		Sheet sheet = wb.getSheet("IPL");//get the sheet file
		Row row = sheet.getRow(i);//get to desired row
	    Cell cell = row.getCell(1);//get to desired col/cell
	   String data = cell.getStringCellValue();//read the cell value
	   Thread.sleep(2000);
	   System.out.println(data);
		}

	}

}
