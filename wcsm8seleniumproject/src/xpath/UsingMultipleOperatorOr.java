package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingMultipleOperatorOr {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://in.puma.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Men']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='PUMA Black-PUMA White-Cool Dark Gray']")).click();
		Thread.sleep(2000);

	}

}
