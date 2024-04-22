package orangeHRMPagesClasses;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@class='oxd-userdropdown-tab']")
	private WebElement profileDropDown;
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logoutButton;
	@FindBy(xpath = "//*[@class='oxd-icon bi-stopwatch']")
	private WebElement stopwatch;
	
	public IndexPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public String logoutCTA() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		profileDropDown.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		act.moveToElement(logoutButton).perform();
		Thread.sleep(2000);
		String logoutValue = logoutButton.getText();
		return logoutValue;
	}
	public void clickOnStopwatch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		stopwatch.click();
	}
	
	
	
}
