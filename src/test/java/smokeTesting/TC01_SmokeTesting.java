package smokeTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.BestSellerPage;
import pages.HeaderPage;
import webDriverFactorypackage.WebDriverFactory;

public class TC01_SmokeTesting extends WebDriverFactory{

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

driver=WebDriverFactory.driverLaunch();
driver.get("https://www.amazon.in/");


//		HeaderPage homepage = new HeaderPage(driver);
//		BestSellerPage bestSeller = homepage.clickBestSeller(driver);
//		bestSeller.verifyRanking(driver);

HeaderPage homepage = new HeaderPage(driver);
homepage.clickBestSeller(driver);


BestSellerPage bestSellerpage = new BestSellerPage(driver);
bestSellerpage.verifyRanking(driver);
bestSellerpage.Colorverify(driver);


	}

}
