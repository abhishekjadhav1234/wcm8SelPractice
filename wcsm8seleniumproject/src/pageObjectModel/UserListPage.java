package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	//@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']") private WebElement userImage;
	@FindBy(xpath="//input[@value='Create New User']") private  WebElement createNewUserButton;
	@FindBy(xpath="//*[@name='username']") private WebElement usernameTB;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath="//input[@name=\"passwordTextRetype\"]") private WebElement passwordRetypeTB;
	@FindBy(xpath="//*[@name='firstName']") private WebElement firstNameTB;
	@FindBy(xpath="//*[@name='lastName']") private WebElement lastNameTB;
	@FindBy(xpath="//input[@type='submit']") private WebElement createUserButton;
	@FindBy(xpath = "//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement cancelButton;
	@FindBy(xpath="//a[.='b, a (ab)']") private WebElement userCreateLink;
	@FindBy(xpath="//input[@value='Delete This User']") private WebElement delectUserButton;
	
	//Intilise
	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	
	
	//Intilise

	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getPasswordRetypeTB() {
		return passwordRetypeTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getUserCreateLink() {
		return userCreateLink;
	}

	public WebElement getDelectUserButton() {
		return delectUserButton;
	}
	
	
	//operation
	
	public void createuser() throws InterruptedException
	{
		createNewUserButton.click();
		Thread.sleep(1000);
		usernameTB.sendKeys(usn);
		Thread.sleep(1000);
		passwordTB.sendKeys(pass);
		passwordRetypeTB.sendKeys(pass);
		
		Thread.sleep(1000);
		firstNameTB.sendKeys(Fn);
		Thread.sleep(1000);
		 lastNameTB.sendKeys(Ln);
		
		Thread.sleep(1000);
		createUserButton.click();
	}
	
	 public void deleteUserMethod() throws InterruptedException
	 {
		 userCreateLink.click();
		 Thread.sleep(1000);
		 DeleteUserButton.click();
	     WorkLib wl = new WorkLib();
	     wl.handleConfirmationPopup();
	 }
		
	}
}
