package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirAsia {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.airasia.co.in/");
		
		driver.findElement(By.xpath("//div[text()='Round Trip']")).click();
		
		driver.findElement(By.xpath("//div[text()='Mumbai']")).click();
		driver.findElement(By.xpath("//div[text()='New Delhi']")).click();
		

	}

}
