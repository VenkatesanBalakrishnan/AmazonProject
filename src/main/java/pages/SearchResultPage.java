package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 *
 */
public class SearchResultPage {

	WebDriver driver;

	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//span[contains(text(),'headphones')]")
	private WebElement txtResult;
	

	//*****Reusable********//

	public SearchResultPage verifyResult(WebDriver driver)throws Exception
	{
		String str = txtResult.getText();
		if(str.contains("headphone"))
		{
			System.out.println("PASSED EXPECTED TEXT FOUND");
		}
		else
		{
			System.out.println("FAILED EXPECTED TEXT NOT FOUND");
		}
		return this;
	}

}





