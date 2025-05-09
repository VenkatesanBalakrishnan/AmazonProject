package listners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FaceBookLoginPage;
import webDriverFactorypackage.WebDriverFactory;

public class ListenersSuite {
	
	WebDriver driver;
	
	@BeforeMethod
	public void driverLaunched() throws IOException
	{
		driver=WebDriverFactory.driverLaunch();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void loginFunctinality()
	{
		FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
		faceBookLoginPage.loginprocess(driver, "Venkat", "Test");
		//Assert.fail("Failed");
	}
	
	@AfterMethod
	public void closingDriver()
	{
		driver.quit();
	}
	

}
