package orangeHRMTestClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import extentListeners.TestNFGListeners;
import utility.ScreenShotM;

public class TestCase1 extends TestNFGListeners
{

	@Test
	public void testNullUsernameAndPassword() throws InterruptedException, IOException {
		Thread.sleep(1000);
		String uservalue = login.enterUsername("");
		assertEquals(uservalue,"");
		String passvalue = login.enterPassword("");
		assertEquals(passvalue,"");
		login.clickOnLoginbutton();
	//	ScreenShotM.TakeShot(driver,"passingNullORBlankValueInUNAndPass");
		Thread.sleep(3000);
		
	}
}
