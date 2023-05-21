package FireFlinkFinder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		    driver.get("https://www.flipkart.com/");
		    Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@name='q']")).sendKeys("iphone");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//DIV[@data-tkid='c6068064-9b03-48a4-9a99-292bd5fe0e53.iphone 14|Mobiles']/A[.='iphone 14in Mobiles']")).click();
		   Thread.sleep(2000);
		   //driver.findElement(By.xpath("//A[@href='/apple-iphone-13-starlight-128-gb/p/itmc9604f122ae7f?pid=MOBG6VF5ADKHKXFX&lid=LSTMOBG6VF5ADKHKXFXQGX7PK&marketplace=FLIPKART&q=iphone+13&store=tyy%2F4io&spotlightTagId=FkPickId_tyy%2F4io&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&fm=organic&iid=600aad72-")).click();

	}

}
