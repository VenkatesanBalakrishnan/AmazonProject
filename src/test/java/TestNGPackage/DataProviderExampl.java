package TestNGPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.FaceBookLoginPage;
import smokeTesting.TC01_SmokeTesting;
import webDriverFactorypackage.WebDriverFactory;


public class DataProviderExampl {
	
	 
	WebDriver driver;
	 
@Test(dataProvider="LoginFacebookDP")
	public void loginfaceBook(String email,String password) throws IOException {
		
		driver= WebDriverFactory.driverLaunch();
		driver.get("https://www.facebook.com/");
		
		FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
		faceBookLoginPage.loginprocess(driver,email,password);
	}
	
	@DataProvider(name="LoginFacebookDP")
	public Object[][] loginCredantial() {
		
		Object data[][]= {{"venkathgjc","giubnj23"},
						  {"godjkhuj","jbhbkn17756"},
						  {"evilukgvy","bhftuvb67857"}};
						  return data;		
}
	
	
	
//	@Test(priority=-1,description="Used to get TC_01")
//	public void TC_01() {
//		
//System.out.println("Welcome Test 1");
//	}
//	@Test(priority=9,timeOut=1000, expectedExceptions = NullPointerException.class)
//	public void testCase02() throws Exception {
//		
//System.out.println("Test case 02");
//throw NullPointerException;
//	}
//@Test(invocationCount=20, invocationTimeOut=100,priority=3,enabled=false)//testTimeout= 10000 // Timeout of 10 seconds.
//public void CaseTest03() {
//		
//	System.out.println("Vanakkam Test 3");
//
//	}
//@Test(dependsOnMethods="testCase02",alwaysRun=true)
//public void loginfunctinality2() {
//	
//	System.out.println("loginfunctinality2");
//
//	}
	
	}
	
	


