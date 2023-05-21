package webBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/ABC/Documents/Alert.html");
		
		//generate Alert PopUp
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click me!']")).click();
		
		//Handel Alert PopUp
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al.getText());
		al.accept();
		
	}

}
