import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHoverActionsColns {

	public static void main(String[] args) {
		
	     System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriver.exe");
	     
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.bluestone.com/");

	}

}
