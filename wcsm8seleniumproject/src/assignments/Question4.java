package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//How to close only child window
		
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
	
		WebElement link = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		
		Point point = link.getLocation();
		int x = point.getX();
		int y = point.getY();
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+(y-250)+")");
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle();
	                                                                                      //Erorr -
		
		//Click on link and get child window
		link.click();
		Thread.sleep(2000);
		
		//to close  child browser
		driver.close();

		//to handle all windows
		Set<String> allHandle = driver.getWindowHandles();
		
		//to close only child window
		for(String wh:allHandle)
		{
			if(parentHandle.equals(wh))
			{
				driver.switchTo().window(wh).close();
			}
		}
	}



	}


