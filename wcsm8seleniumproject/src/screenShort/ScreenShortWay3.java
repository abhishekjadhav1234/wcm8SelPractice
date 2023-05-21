package screenShort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShortWay3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		RemoteWebDriver driver1=new ChromeDriver();
		
		File src = driver1.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShort/ss4.png");
		
		Files.copy(src, dest);
		
		
	}

}
