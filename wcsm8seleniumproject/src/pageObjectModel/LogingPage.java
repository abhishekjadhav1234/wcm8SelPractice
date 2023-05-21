package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogingPage {

	@FindBy(xpath="//*[@name='username']") private WebElement usernameTB;
	@FindBy(xpath="//*[@name='pwd']") private WebElement passwordTB;
	@FindBy(xpath ="//*[@id='keepLoggedInCheckBox']") private WebElement checkbox;
	@FindBy(xpath="//*[@id='loginButton']") private WebElement lgButton;
	
	
	//Intilization
	public void logingPath(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}


	

	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}


	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getCheckbox() {
		return checkbox;
	}


	public WebElement getLgbutton() {
		return lgButton;
	}
	
	//operational method
	public void validLogin(String validUsername, String validPassword)
	{
		usernameTB.sendKeys(validUsername);
		passwordTB.sendKeys(validPassword);
		lgButton.click();;
		
	}
	
	public void inValidLoging(String inValidUsername, String inValidPassword ) throws InterruptedException
	{
		usernameTB.sendKeys(inValidUsername);
	    passwordTB.sendKeys(inValidPassword);
	    lgButton.click();
	    Thread.sleep(2000);
	    usernameTB.clear();
	}
	
}
