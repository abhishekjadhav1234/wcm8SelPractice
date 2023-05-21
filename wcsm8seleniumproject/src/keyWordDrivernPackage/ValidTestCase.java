package keyWordDrivernPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"ValidCreds");
		
		for(int i=1; i<rc; i++)
		{
		String validusername = flib.readExcelData(EXCEL_PATH,"ValidCreds", i, 0);
		String validpassword = flib.readExcelData(EXCEL_PATH, "ValidCreds", i, 1);
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(validusername);
		driver.findElement(By.name("pwd")).sendKeys(validpassword);
		driver.findElement(By.id("loginButton")).click();
		
		
		
		}
	}

}
