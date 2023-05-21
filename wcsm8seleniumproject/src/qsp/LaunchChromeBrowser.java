package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//to avoid the Illegal exception
		
		
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    
		ChromeDriver driver = new ChromeDriver(co);
		
		//to maximize browser
		driver.manage().window().maximize();
		Thread.sleep(2000); //Stop the exicution of 2 sec
		
		//to close chome browser
		driver.close();
		

	}

}
