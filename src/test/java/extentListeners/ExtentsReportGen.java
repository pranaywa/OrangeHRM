package extentListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentsReportGen {
	
	public static ExtentReports extent; 
	
public static ExtentReports extentReportGenerator() { 
	
     String path = System.getProperty("user.dir")+"//ExtentReport//OrangeHRMRepor.html";	
     ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
     reporter.config().setTheme(Theme.DARK); 
     reporter.config().setReportName("OrangeHRM-WebApplication"); 
     
     extent = new ExtentReports();
     extent.attachReporter(reporter);
     extent.setSystemInfo("Environment","https://opensource-demo.orangehrmlive.com/");
     extent.setSystemInfo("Excecuted BY","Pranay Wane");
     extent.setSystemInfo("Executed On","Chrome Browser");
     return extent;
}
}
