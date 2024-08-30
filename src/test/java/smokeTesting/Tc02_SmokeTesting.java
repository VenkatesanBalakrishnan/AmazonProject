package smokeTesting;

import org.openqa.selenium.WebDriver;

import pages.HeaderPage;
import pages.SearchResultPage;
import webDriverFactorypackage.WebDriverFactory;

public class Tc02_SmokeTesting {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver=WebDriverFactory.driverLaunch();
		driver.navigate().to("https://www.amazon.in/");
		HeaderPage headerpage = new HeaderPage(driver);
		headerpage.enterSearchAmazonResultValue(driver, "HeadPhone");
		SearchResultPage searchResultPage = headerpage.clickMagifireSearch(driver);
		searchResultPage.verifyResult(driver);

	}

}
