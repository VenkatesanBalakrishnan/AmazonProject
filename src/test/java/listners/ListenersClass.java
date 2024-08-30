package listners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener{
	
	WebDriver driver;
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot takeScreenshot =(TakesScreenshot)driver;
		
		File src=takeScreenshot.getScreenshotAs(OutputType.FILE);
		File des= new File("./ScreenShot/Screen_"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyDirectory(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test STARTED");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test SKIPPED");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Completed");
	}

}
