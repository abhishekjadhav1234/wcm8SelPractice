package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingContainsFunction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.ixigo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Trains")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Leaving from']")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Going to']")).sendKeys("Satara");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='depart']")).sendKeys("07 Apr, Fri");
		Thread.sleep(2000);
		
		driver.close();
	}

}
