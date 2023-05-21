package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/ABC/Documents/textBox.html");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("abhi");
		
		
		//--------------------------------------------------------------------
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("abhyaa_2803");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("pass");
		Thread.sleep(2000);

	}

}
