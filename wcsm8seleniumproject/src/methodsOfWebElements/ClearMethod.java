package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
		WebElement Username = driver.findElement(By.name("username"));
	
		WebElement Password = driver.findElement(By.name("password"));
		
		Username.sendKeys("__abhyaa__2803__");
		Password.sendKeys("12345");
		
		Thread.sleep(2000);
		Username.clear();
		Thread.sleep(1000);
		Password.clear();
	
		
		

	}

}
