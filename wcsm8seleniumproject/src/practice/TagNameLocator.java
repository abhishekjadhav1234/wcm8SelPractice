package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
		
		driver.findElement(By.tagName("input")).sendKeys("7744084432");
		
		driver.findElement(By.tagName("input")).sendKeys("abhishekjadhav");
	    Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector("button[class^='_acan _acap']")).click();

	}

}
