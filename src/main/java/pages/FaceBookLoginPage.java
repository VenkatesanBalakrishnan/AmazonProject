package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	
	WebDriver driver;
	
	public FaceBookLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CSS, using="input[name='email']")
	private WebElement TxtboxEmail;
	
	@FindBy(how=How.CSS, using="input[name='pass']")
	private WebElement PWDTEXTBOX;
	
	@FindBy(how=How.CSS, using="button[name='login']")
	private WebElement SubmitBtn;
	
	@FindBy(how=How.XPATH, using="//button[text()='Log in']")
	private WebElement txtLoginmsg;
	
	//********************Reusable**************//
	
	/**
	 * Used to enter the "Text" in the email box
	 * @param driver, Email
	 * @author 612387094
	 */
	public void enterID(WebDriver driver,String email) {
		
		TxtboxEmail.sendKeys(email);	
	}
	
/**
 * Used to enter the "PWD" in the password box
 * @param driver, Password
 * @author 612387094
 */
public void enterPWD(WebDriver driver,String password) 
{	
	PWDTEXTBOX.sendKeys(password);	
	}
/**
 * Used to click on the "Login" Button
 * @author 612387094
 * @param driver
 */
public void clickSubmit(WebDriver driver) {
	
	SubmitBtn.click();	
}

/**
 * Used to verifying Login page is visible or not
 * @author 612387094
 * @param driver
 */
public void verifyLoginHeader(WebDriver driver) {
	
	if(txtLoginmsg.isDisplayed())
	{
		System.out.println("Login Text is visible");
	}
	else
	{
		System.out.println("Expected Text not Visible");
		throw new NullPointerException();
	}

}

/**
 * Used to Proceed the login process
 * Enter the "Text" in the email box
 * Enter the "PWD" in the password box
 * Click on the "Login" Button
 * @param driver,Email,PWD
 * 
 */
public void loginprocess(WebDriver driver,String text,String password) // Merge or Customised method
{
	this.enterID(driver,text);
	this.enterPWD(driver,password);
	this.clickSubmit(driver);
}


	
}


