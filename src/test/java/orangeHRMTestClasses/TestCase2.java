package orangeHRMTestClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import extentListeners.TestNFGListeners;
import utility.ScreenShotM;

public class TestCase2 extends TestNFGListeners {

	@Test(priority = 1)
	public void testLoginFunctionality() throws InterruptedException {
		Thread.sleep(2000);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginbutton();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void testLogoutFunctionalityHoverOnLogout() throws InterruptedException, IOException {
		String logout = index.logoutCTA();
		assertEquals(logout,"Logout");
		//ScreenShotM.TakeShot(driver,"VerifyLogoutCTA");
		Thread.sleep(4000);
	}
	
}
