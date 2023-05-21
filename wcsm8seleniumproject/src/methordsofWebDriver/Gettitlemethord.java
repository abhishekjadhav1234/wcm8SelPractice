package methordsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gettitlemethord {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver", "drivers/chomedrivers.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.instagram.com/accounts/login/");
		
	    String loginPageTitle = driver.getTitle();
	    System.out.println("logingPage Title");
		

	}

}
