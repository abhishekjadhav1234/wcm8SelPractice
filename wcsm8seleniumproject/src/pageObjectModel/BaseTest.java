package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant{
	
	static WebDriver driver;
	
	public void setUp() throws EncryptedDocumentException, IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData("PROP_PATH", "browser");
		String url = flib.readPropertyData("PROP_PATH", "url");
		
		if(browserValue.equals("chrome"))
		{
			System.setProperty("CHROME_KEY", "CHROME_PATH");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(url);
		}
		
		else if(browserValue.equals("Firefox"))
		{
			System.setProperty("GECKO_KEY", "GECKO_PATH");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(url);
		}
		
		else if(browserValue.equals("edge"))
		{
			System.setProperty("EDGE_KEY","EDGE_PATH");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(url);
			
			
		}
		
		else
		{
			System.out.println("Browser is InValid");
		}
		
		
	}
	
	public void tearDown()
	{
		driver.quit();
		
	}

}
