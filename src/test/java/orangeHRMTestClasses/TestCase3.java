package orangeHRMTestClasses;


import java.io.IOException;

import org.testng.annotations.Test;

import extentListeners.TestNFGListeners;
import utility.ScreenShotM;

public class TestCase3 extends TestNFGListeners {

	@Test(priority = 1)
	public void testPunchIn() throws InterruptedException, IOException {
		Thread.sleep(2000);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginbutton();
		index.clickOnStopwatch();
		Thread.sleep(3000);
		p.verifyPunchInDate();
		p.verifyPunchInTime();
		p.enterPunchInNote();
		ScreenShotM.TakeShot(driver,"VerifyPunchInDateAndTimeMatchWithSystemDateAndTime");
		p.clickOnInButton();
		Thread.sleep(2000);
	//	ScreenShotM.TakeShot(driver,"VerifyPunchInSuccefullySavedMessage");
	}
	@Test(priority = 2)
	public void testPunchOut() throws InterruptedException, IOException {
		Thread.sleep(6000);
		p.verifyPunchOutDate();
		p.verifyPunchInTime();
		p.enterPunchOutNote();
		ScreenShotM.TakeShot(driver,"VerifyPunchOutDateAndTimeMatchWithSystemDateAndTime");
		p.clickOnOutButton();
		Thread.sleep(2000);
	//	ScreenShotM.TakeShot(driver,"VerifyPunchOutSuccefullSavedMessage");
		
	}
	
}
