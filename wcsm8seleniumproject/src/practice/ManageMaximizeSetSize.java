package practice;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageMaximizeSetSize {

	public static void main(String[] args) throws InterruptedException {
		
		//--**Manage - Maximize - SetSize**--
		
				//To avoid illegal exception
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				//To avoid connection field exception
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				
				WebDriver driver=new ChromeDriver(co);
				
				//to maximize browser
				driver.manage().window().maximize();
				
				//To Launch the webapplication
				driver.get("https://www.amazon.in/");
				
				//to set a size
				Dimension targetsize = new Dimension(250,  300);
				driver.manage().window().setSize(targetsize);
				
				//To stop the execution for 2 sec 
				Thread.sleep(2000);
				
				//to close the browser
				driver.close();
				
	}

}
