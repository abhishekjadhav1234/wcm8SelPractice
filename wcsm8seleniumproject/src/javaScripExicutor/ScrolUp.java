package javaScripExicutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
		//To Perform Scrolling Operator..........
	  JavascriptExecutor tse = (JavascriptExecutor)driver;
	  Thread.sleep(2000);
	  
	  //Scroll down..........
	  tse.executeScript("window.scrollBy(0,350)");
	  Thread.sleep(2000);
	  
	  //Scroll Up........
	  tse.executeScript("window.scrollBy(0,-350)");
	}

}
