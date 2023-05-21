package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        
        driver.switchTo().activeElement().sendKeys("iphone");
        Thread.sleep(2000);
        
       List<WebElement> iphoneOptions = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
       
       for(WebElement iphone:iphoneOptions)
       {
    	   System.out.println(iphone.getText());
    	   Thread.sleep(2000);
       }
        
        
	}

}
