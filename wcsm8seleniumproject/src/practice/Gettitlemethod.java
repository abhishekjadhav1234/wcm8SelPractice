package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gettitlemethod {

	public static void main(String[] args) throws InterruptedException {

		//--**Get Title method**--
		
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
		
		//to get the current web page
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		
		//To stop the execution for 2 sec 
		Thread.sleep(2000);
		
		//to close the browser
		driver.close();
		

	}

}
