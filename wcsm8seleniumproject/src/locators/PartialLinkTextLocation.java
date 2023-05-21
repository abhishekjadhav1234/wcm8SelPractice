package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PartialLinkTextLocation {

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   
   ChromeOptions co = new ChromeOptions();
   co.addArguments("--remote-allow-origins=*");
   
   ChromeDriver driver=new ChromeDriver(co);
   driver.manage().window().maximize();
   
   driver.get("file:///C:/Users/ABC/Documents/flipkart.html");
   
   driver.findElement(By.partialLinkText("Flipkart")).click();
   Thread.sleep(2000);
   
   driver.close();

	}

}
