package dataDriverFramWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InValidLoginTestData extends Flib{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		    driver.get("http://desktop-g74bmdu/");
		    
		    Flib flib = new Flib();
		  int rc = flib.RowCount("./Data/ActiTimeTestData.xlsx", "InvalidCreds");
		for(int i=1; i<rc;i++)
		   {
			 String invalidusername = flib.ReadExcelData("./Data/ActiTimeTestData.xlsx", "InvalidCreds", i, 0);  
			String invalidpassword= flib.ReadExcelData("./Data/ActiTimeTestData.xlsx", "InvalidCreds", i, 1);
			
			Thread.sleep(2000);
		    driver.findElement(By.name("username")).sendKeys(invalidusername);
		    
		    driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		    
		    driver.findElement(By.id("loginButton")).click();
		    driver.findElement(By.name("username")).clear();
		   }
	}

}
	
