package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotM {

	
	public static String TakeShot(WebDriver driver,String ssName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String systemPath = System.getProperty("user.dir")+"//ScreenShotCaptures//"+ssName+".jpg";
		File path = new File(systemPath);
		FileHandler.copy(source, path);
		return systemPath;
	}
	public static void main(String[] args) throws IOException {
		
	}
	
	
}
