package orangeHRMTestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import extentListeners.TestNFGListeners;
import utility.ScreenShotM;

public class TestCase4 extends TestNFGListeners
{
	@Test(priority = 1)
	public void verifyAssignLeaves() throws IOException, InterruptedException {
		Thread.sleep(2000);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginbutton();
		q.assignLeaveCTA();
	//	ScreenShotM.TakeShot(driver,"verifyAssignLeavesCTA");
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void verifyLeaveList() throws IOException, InterruptedException {
		q.leaveListCTA();
		//ScreenShotM.TakeShot(driver,"verifyLeaveListCTA");
		Thread.sleep(1000);
	}
	
	@Test(priority = 3)
	public void verifyTimesheets() throws IOException, InterruptedException {
		q.timeSheetCTA();
		//ScreenShotM.TakeShot(driver,"verifyTimesheetsCTA");
		Thread.sleep(1000);
	}
	
	@Test(priority = 4)
	public void verifyApplyLeave() throws IOException, InterruptedException {
		q.applyLeaveCTA();
		//ScreenShotM.TakeShot(driver,"verifyApplyLeaveCTA");
		Thread.sleep(1000);
	}
	
	@Test(priority = 5)
	public void verifyMyLeave	() throws IOException, InterruptedException {
		q.myLeaveCTA();
		//ScreenShotM.TakeShot(driver,"verifyMyLeaveCTA");
		Thread.sleep(1000);
	}
	
	@Test(priority = 6)
	public void verifyMyTimesheets() throws IOException, InterruptedException {
		q.myTimeSheetCTA();
		//ScreenShotM.TakeShot(driver,"verifyMyTimesheetsCTA");
		Thread.sleep(1000);
	}

}
