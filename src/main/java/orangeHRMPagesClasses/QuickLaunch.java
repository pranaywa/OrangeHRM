package orangeHRMPagesClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickLaunch {

	WebDriver driver;
	Actions act;
	@FindBy(xpath = "//*[@title='Assign Leave']")
	private WebElement assignLeave;
	@FindBy(xpath = "//*[@title='Leave List']")
	private WebElement leaveList;
	@FindBy(xpath = "//*[@title='Timesheets']")
	private WebElement timeSheet;
	@FindBy(xpath = "//*[@title='Apply Leave']")
	private WebElement applyLeave;
	@FindBy(xpath = "//*[@title='My Leave']")
	private WebElement myLeave;
	@FindBy(xpath = "//*[@title='My Timesheet']")
	private WebElement myTimesheet;
	
public QuickLaunch(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	act = new Actions(driver);
}

public void assignLeaveCTA() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	act.moveToElement(assignLeave).perform();
}
public void leaveListCTA() {
	act.moveToElement(leaveList).perform();
}
public void timeSheetCTA() {
	act.moveToElement(timeSheet).perform();
}
public void applyLeaveCTA() {
	act.moveToElement(applyLeave).perform();
}
public void myLeaveCTA() {
	act.moveToElement(myLeave).perform();
}
public void myTimeSheetCTA() {
	act.moveToElement(myTimesheet).perform();
}


	
}
