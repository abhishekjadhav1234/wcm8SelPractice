package webBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelConfirationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("file:///C:/Users/ABC/Documents/ConfirmationPopUp.html");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			
			Alert al = driver.switchTo().alert();
			Thread.sleep(2000);
			al.accept();
			
			String text = al.getText();
			System.out.println(text);;
			
		

	}

}
