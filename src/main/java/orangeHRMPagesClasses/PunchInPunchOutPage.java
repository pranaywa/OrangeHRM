package orangeHRMPagesClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PunchInPunchOutPage {

	 static WebDriver driver;
	 WebDriverWait w;
	
	@FindBy(xpath = "//*[@class='oxd-date-wrapper']")
	private WebElement punchInDate;
    @FindBy(xpath = "//*[@class='oxd-time-input']")
    private WebElement punchInTime;
    @FindBy(xpath = "//*[@placeholder='Type here']")
    private WebElement note;
    @FindBy(xpath = "//*[text()=' In ']")
    private WebElement In;
    @FindBy(xpath = "//*[@class='oxd-date-input']")
    private WebElement punchOutDate;
    @FindBy(xpath = "//*[@class='oxd-time-input']")
    private WebElement punchOutTime;
    @FindBy(xpath = "//*[text()=' Out ']")
    private WebElement Out;
    
    public PunchInPunchOutPage(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    	w = new WebDriverWait(driver,Duration.ofSeconds(60));
    }
    
    public void verifyPunchInDate() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    	punchInDate.click();
    }
    public void verifyPunchInTime() {
    	punchInTime.click();
    }
    public void enterPunchInNote() {
    	note.sendKeys("Verify PunchIn Functionality");
    }
    public void clickOnInButton() {
    	In.click();
    }
    public void verifyPunchOutDate() {
    	w.until(ExpectedConditions.visibilityOf(punchOutDate));
        punchOutDate.click();
    }
    public void verifyPunchOutTime() {
    	punchOutTime.click();
    }
    public void enterPunchOutNote() {
    	note.sendKeys("verify PunchOut Functionality");
    }
    public void clickOnOutButton() {
        Out.click();
    }
   
    
    
}
