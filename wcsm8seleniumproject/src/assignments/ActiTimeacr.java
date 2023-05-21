package assignments;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeacr {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//to avoid the Illegal exception
		
		
	 
	    
		ChromeDriver driver = new ChromeDriver(co);
		
		//to maximize browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-g74bmdu/");
		
		if(driver.getTitle().equal-09pop)

	}

}
