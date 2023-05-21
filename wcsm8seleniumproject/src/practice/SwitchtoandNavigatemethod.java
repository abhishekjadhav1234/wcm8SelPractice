package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchtoandNavigatemethod {

	public static void main(String[] args) throws InterruptedException {
		
		//--**SwitchTo and navigate method**--
		
		//To avoid illegal exception
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//To avoid connection field exception
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		//to maximize browser
		driver.manage().window().maximize();
		
		//To Launch the webapplication
		driver.get("https://www.amazon.in/");
		
		//To stop the execution for 2 sec 
		 Thread.sleep(2000);
		
		//to back to chrome
		driver.navigate().back();
		 Thread.sleep(2000);
		 
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		//to switch the control to active element
		driver.switchTo().activeElement().sendKeys("Flipkart",Keys.ENTER);
		
		//to back to chrome
		driver.navigate().back();
		Thread.sleep(2000);
		
		//to forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//to refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//to back to chrome
		driver.navigate().back();
		Thread.sleep(2000);
		
		//to switch the control to active element
		driver.switchTo().activeElement().sendKeys("swiggy",Keys.ENTER);
				
		//To stop the execution for 2 sec 
		Thread.sleep(2000);
		
		//to close the browser
		driver.close();

	}

}
