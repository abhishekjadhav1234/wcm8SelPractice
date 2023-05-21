package qsp;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the browser which you want to open");
		String browserValue=sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			ChromeDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else
			if(browserValue.equalsIgnoreCase("firefox"))
			{
				System.setProperty("driver.gecko.driver", "./drivers/geckoriver.exe");
				
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
			}
			else
			{
				System.out.println("Select valid browser");
			}
	

	}

}
