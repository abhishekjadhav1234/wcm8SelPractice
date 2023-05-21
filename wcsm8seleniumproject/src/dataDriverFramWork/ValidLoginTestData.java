package dataDriverFramWork;

import java.io.FileInputStream;
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

public class ValidLoginTestData extends Flib {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		    driver.get("http://desktop-g74bmdu/");
		    
		    Flib flib = new Flib();
		  int rc = flib.RowCount("./Data/ActiTimeTestData.xlsx", "ValidCreds");
		for(int i=1; i<rc;i++)
		   {
			 String validusername = flib.ReadExcelData("./Data/ActiTimeTestData.xlsx", "ValidCreds", i, 0);  
			String validpassword= flib.ReadExcelData("./Data/ActiTimeTestData.xlsx", "ValidCreds", i, 1);
			
			Thread.sleep(2000);
		    driver.findElement(By.name("username")).sendKeys(validusername);
		    Thread.sleep(2000);
		    driver.findElement(By.name("pwd")).sendKeys(validpassword);
		    Thread.sleep(2000);
		    driver.findElement(By.id("loginButton")).click();

		   }
		
	}

}
