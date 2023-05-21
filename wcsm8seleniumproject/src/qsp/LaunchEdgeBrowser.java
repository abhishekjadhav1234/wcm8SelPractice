package qsp;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,.edge.drivers", "./driver/msedgedrivers.exe");
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		
		 EdgeDriver driver = new EdgeDriver(eo);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.close();

	}

}
