package extentListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import orangeHRMTestClasses.BaseTest;
import utility.ScreenShotM;


public class TestNFGListeners extends BaseTest implements ITestListener
{    
	public static ExtentTest test;
	ExtentReports extent = ExtentsReportGen.extentReportGenerator(); 

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName());
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Passed - "+result.getName());
		test.log(Status.PASS, "Test case is passed");
		 try {
				String screenShot= ScreenShotM.TakeShot(driver,result.getName());
				test.addScreenCaptureFromPath(screenShot);
			} catch (IOException e) {
				System.out.println("FileNotFound Exception");
			} 

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed "+result.getName());
		test.fail(result.getThrowable());
	    try {
			String screenShot= ScreenShotM.TakeShot(driver,result.getName());
			test.addScreenCaptureFromPath(screenShot);
		} catch (IOException e) {
			System.out.println("FileNotFound Exception");
		} 
	}
	    
		

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped "+result.getName());
		test = extent.createTest(result.getName());
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush(); 
	}

}
