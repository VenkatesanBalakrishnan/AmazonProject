package TestNGPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.GmailLoginPage;
import webDriverFactorypackage.WebDriverFactory;

public class GmailVerificationLogin {

	WebDriver driver;

	@Test
	public void loginGmail() throws IOException {

		driver= WebDriverFactory.driverLaunch();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();

		GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);

		gmailLoginPage.enterID(driver,"venkateshkrish2596@gmail.com");
		gmailLoginPage.clickBTN(driver);
		gmailLoginPage.enterPWD(driver, "Janani96$$$");
		gmailLoginPage.colorVerification(driver);
		gmailLoginPage.clickBTN(driver);
		gmailLoginPage.inboxmail(driver);				
	}

}
