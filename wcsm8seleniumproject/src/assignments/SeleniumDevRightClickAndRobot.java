package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDevRightClickAndRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		WebElement target = driver.findElement(By.xpath("//div[@class='row justify-content-center td-box--100 pt-5']"));
		
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		
		Robot rob = new Robot();
	
		
		Thread.sleep(2000);
		driver.close();

	}

}
