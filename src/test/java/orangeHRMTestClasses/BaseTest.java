package orangeHRMTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import orangeHRMPagesClasses.IndexPage;
import orangeHRMPagesClasses.LoginPage;
import orangeHRMPagesClasses.PunchInPunchOutPage;
import orangeHRMPagesClasses.QuickLaunch;

public class BaseTest 
{
public static WebDriver driver;
public static LoginPage login;
public static IndexPage index;
public static PunchInPunchOutPage p;
public static QuickLaunch q;

@BeforeTest
public void launchBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@BeforeClass
public void Objects() {
	login = new LoginPage(driver);
	index = new IndexPage(driver);
	p = new PunchInPunchOutPage(driver);
    q = new QuickLaunch(driver);
}
@AfterTest
public void tearDown() {
	driver.quit();
}


}
