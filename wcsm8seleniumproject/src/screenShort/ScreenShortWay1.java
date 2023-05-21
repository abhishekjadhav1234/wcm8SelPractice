package screenShort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShortWay1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://atcbhor.com/");
		
		ChromeDriver driver1 = new ChromeDriver();
		
		File src = driver1.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShort/ss2.png");
		
		Files.copy(src, dest);
		
		
		
		
	}

}
