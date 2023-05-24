package testNGpackage3;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void java() {
	  System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		
		
  }
}
