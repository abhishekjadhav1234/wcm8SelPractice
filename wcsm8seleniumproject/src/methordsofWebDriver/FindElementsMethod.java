package methordsofWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		//getText()=we are reading each option
		List<WebElement> pohaOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		//for(int a=1; a<pohaOptions.size();a++);
		//{
			
			//String poha=pohaOptions.get(i).getText();
			//System.out.println(poha);
			//Thread.sleep(2000);
		//}
//		
		
		
		for (WebElement poha:pohaOptions)
		{
			System.out.println(poha.getText());
			Thread.sleep(2000);
		}
	}

	}


