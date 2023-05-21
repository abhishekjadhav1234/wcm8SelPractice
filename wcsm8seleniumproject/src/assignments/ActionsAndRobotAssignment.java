package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobotAssignment {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
		WebElement watchjewellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(watchjewellery).perform();
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
		WebElement filterby = driver.findElement(By.xpath("//div[text()='Filter by']"));
		
	Thread.sleep(2000);
	for(int i=0;i<=2; i++ )
	{
		
	}
	

	}

}
