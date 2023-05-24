package testNGpackage1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest2 {
  @Test
  public void sql() {
	  
	  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
			
			driver.quit();
  }
}
