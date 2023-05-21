package screenShort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShortWay4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.airasia.co.in/");
		
		WebDriver driver1=new ChromeDriver();
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShort/ss5.png");
		
		Files.copy(src, dest);
	}

}
