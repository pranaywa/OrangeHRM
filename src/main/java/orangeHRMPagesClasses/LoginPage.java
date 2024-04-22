package orangeHRMPagesClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	static WebDriver driver;
	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbutton;
		
	
	
public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public String enterUsername(String userName) {
	String usernameValue =username.getText();
	username.click();
	username.sendKeys(userName);
	return usernameValue;
}
public String enterPassword(String passWord) {
	String passValue =username.getText();
	password.click();
	password.sendKeys(passWord);
	return passValue;
}
public void clickOnLoginbutton() {
	loginbutton.click();
}

	
	
}
