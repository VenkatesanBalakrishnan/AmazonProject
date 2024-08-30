package TestNGPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.FaceBookLoginPage;
import smokeTesting.TC01_SmokeTesting;
import webDriverFactorypackage.WebDriverFactory;


public class GroupsExample {
	
	 
	WebDriver driver;
	 
@Test(groups="Sanity")
	public void loginfaceBook() throws IOException {
		
		driver= WebDriverFactory.driverLaunch();
		driver.get("https://www.facebook.com/");
		
		FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
		faceBookLoginPage.loginprocess(driver,"jkvjf","jkbgyfdtud");
	}
	
@Test(groups="Regrssion")
public void TC_01() {
		
System.out.println("Welcome Test 1");
	}
@Test(groups="Smoke")
public void testCase02() {
System.out.println("Test case 02");

}
@Test(groups= {"Sanity", "Regrssion"})
public void CaseTest03() {
System.out.println("Vanakkam Test 3");
}

	}
	
	


