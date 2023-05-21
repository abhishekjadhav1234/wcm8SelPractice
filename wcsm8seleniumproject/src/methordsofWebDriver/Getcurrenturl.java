package methordsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getcurrenturl {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver", "drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
