package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
         
         WebDriver driver = new ChromeDriver(co);
         driver.manage().window().maximize();
         Thread.sleep(2000);
         
         driver.get("https://www.instagram.com/");
         Thread.sleep(2000);
         
         WebElement usernameTextBox = driver.findElement(By.name("username"));
         usernameTextBox.sendKeys("abhi");
         System.out.println(usernameTextBox);
         
	}

}
