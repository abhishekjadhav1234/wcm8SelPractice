package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingTextFunctions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://in.puma.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='PUMA White-PUMA White-Pearl Pink-Light Mint']")).click();
		Thread.sleep(2000);
		
		
;
	}
	
	

}
