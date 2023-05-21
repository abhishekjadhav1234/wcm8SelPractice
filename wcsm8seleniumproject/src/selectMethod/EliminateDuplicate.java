package selectMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("file:///C:/Users/ABC/Documents/DropDownListMultiple.html");
		  
		  WebElement dropdown = driver.findElement(By.name("n1"));
		  
		  //to handle dropdown create object of select class
		 Select sel = new Select(dropdown);
		 
		 //To get all options from Dropdown
		 List<WebElement> allOptions = sel.getOptions();
		 
		 
	}

}
