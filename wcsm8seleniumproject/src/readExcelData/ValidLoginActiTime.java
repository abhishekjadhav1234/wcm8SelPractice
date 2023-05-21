package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginActiTime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//To Open the chrome browser
		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		     
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		    driver.get("http://desktop-g74bmdu/");
		    
		    //for Valid Username
		   FileInputStream fis = new FileInputStream("./Data/ActiTimeTestData.xlsx"); //to provide the path of file
		   Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
		   Sheet sheet = wb.getSheet("Validcreds"); //get the excel sheet
		  Row row = sheet.getRow(1);//get the desied row
		  Cell cell = row.getCell(0);//get the desied cell/col
		  String validusername = cell.getStringCellValue();
		    
		  //for valid Password
		  FileInputStream fis2 = new FileInputStream("/Data/ActiTimeTestData.xlsx");
		 Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet(validusername);
		Row row2 = sheet2.getRow(1);
		Cell cell2 = row2.getCell(1);
		String validpassword = cell2.getStringCellValue();
		  
		Thread.sleep(2000);
		    driver.findElement(By.name("username")).sendKeys(validusername);
		    Thread.sleep(2000);
		    driver.findElement(By.name("pwd")).sendKeys(validpassword);
		    Thread.sleep(2000);
		    driver.findElement(By.id("loginButton")).click();


	}

}
