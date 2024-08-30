package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage {
	
	WebDriver driver;
	
	public GmailLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//*******WebElement Declaration*************//
	
	@FindBy(how=How.CSS, using="input[type='email']")
	private WebElement MailID;
	
	@FindBy(how=How.CSS, using="//div[text()='venkateshkrish2596@gmail.com']")
	private WebElement clickmagni;
	
	@FindBy(how=How.CSS, using="input[type='password']")
	private WebElement PWD;
	
	@FindBy(how=How.ID, using="//div[@id='identifierNext']")
	private WebElement Nextbtn;
	
	@FindBy(how=How.XPATH, using="//span[text()='Talent.com']")
	private WebElement Inboxmail;
	
	@FindBy(how=How.CSS, using="h2[class='hP']")
	private WebElement title;
	
	//************ Reusable***********//
	
	public void enterID(WebDriver driver, String Email) {
		
		MailID.sendKeys(Email);
		//clickmagni.click();

	}
	
	
public void enterPWD(WebDriver driver, String Password) {
		
	PWD.sendKeys(Password);

	}

public void clickBTN(WebDriver driver) {
	
	Nextbtn.click();
	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
}

public void colorVerification(WebDriver driver) {
	
	String s = Nextbtn.getCssValue("color");
	 Color color=Color.fromString(s);
String hexColor= color.asHex();
if(hexColor.equals("#ffffff"))
{
	 System.out.println(("Text color verifed and color is")+ hexColor);
}
else
{
	 System.out.println("Color not verifed");
	
}
}

public void inboxmail(WebDriver driver) {
	
	Actions action = new Actions(driver);
	
	action.doubleClick(Inboxmail).perform();
	
	String txtmsg = title.getText();
	System.out.println(txtmsg);
}
	
	
	


}
