package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Closemethord {

	public static void main(String[] args) throws InterruptedException {
		
		//**--close method--**
		
		//to avoid Illegal Exception
		System.setProperty("webderiver.chrome.driver", "./drivers/chromedriver.exe");
		
		//to avoid connection field
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		//to maximize browser
		driver.manage().window().maximize();
		
		//to Stop the excution for 2 sec
		Thread.sleep(2000);
		
		//to close the browser
		driver.close();

	}

}
