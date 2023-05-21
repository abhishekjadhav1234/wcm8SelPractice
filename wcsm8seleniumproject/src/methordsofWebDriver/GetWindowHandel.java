package methordsofWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetWindowHandel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		System.out.println("Handle of parent Window :"+ parentHandle);
		
		//Click on link and get choild window
		link.click();
		
		//Handle or address of all window
	      Set<String> allHandles = driver.getWindowHandles();
	      for(String wh:allHandles)
	      {
	      System.out.println("wh");
	      }
		
		
		

	}

}
