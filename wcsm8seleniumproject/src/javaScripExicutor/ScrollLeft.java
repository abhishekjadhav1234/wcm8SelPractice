package javaScripExicutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		//bt Performing Scrolling Operator.......
		JavascriptExecutor tse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		//Scroll Right.....
		tse.executeScript("window.scrollBy(5000,0)");
		Thread.sleep(2000);
		
		//Scroll Left......
		tse.executeScript("window.scrollBy(-5000,0)");
		Thread.sleep(2000);
		
		driver.close();


	}

}
