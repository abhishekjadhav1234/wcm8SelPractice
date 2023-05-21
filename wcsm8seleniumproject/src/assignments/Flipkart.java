package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//driver.switchTo().activeElement().sendKeys("Hp Laptop",Keys.ENTER);
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='14 inch - 14.9 inch')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='8 GB')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("//div[@class='_3879cV' and (text()='256 GB')]")).click();
		Thread.sleep(3000);
		
		String price=driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
         System.out.println(price);
         
	}

}
