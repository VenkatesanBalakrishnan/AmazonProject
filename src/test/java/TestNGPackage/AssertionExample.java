package TestNGPackage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.FaceBookLoginPage;
import smokeTesting.TC01_SmokeTesting;
import webDriverFactorypackage.WebDriverFactory;


public class AssertionExample {
	
	 
	WebDriver driver;
	 
@Test()
	public void loginfaceBook() throws IOException {
		
		driver= WebDriverFactory.driverLaunch();
		driver.get("https://www.facebook.com/");
		FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
		List<WebElement> txtLoginHeader =driver.findElements(By.xpath("//button[text()='Log in']"));
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertTrue(txtLoginHeader.size()>=2, "Element Size is not met");
		faceBookLoginPage.loginprocess(driver,"jkvjf","jkbgyfdtud");
	}
	


	}
	
	


