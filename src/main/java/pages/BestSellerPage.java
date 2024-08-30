package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class BestSellerPage {

	 WebDriver driver;

	public BestSellerPage(WebDriver driver)
	{
		this.driver=driver;
	}

	/*************Web Element Declaration*********/

	WebElement btnOrderNo;

	/************Reusable***********/

	/**
	 * Used to click "Best Seller in home page"
	 * @author 612387094
	 * @param driver
	 */
	public void verifyRanking(WebDriver driver)

	{

		System.out.println("Test Case 01");

		ArrayList<Object> list = new ArrayList<>();

		for(int i=1; i<=3;i++)
		{
			btnOrderNo =driver.findElement(By.xpath("//span[contains(text(),'#"+ i +"')]"));
			String text =btnOrderNo.getText();
			list.add(text);
		}


		System.out.println(list);

		if(list.contains("#1") && list.contains("#2")&& list.contains("#3"))
		{
			System.out.println("Orders are verified");
		}
		else
		{
			System.out.println("Orders are not verfied");
		}
	}


public void Colorverify(WebDriver driver)

	{

	System.out.println("Color verification");

	WebElement colr = driver.findElement(By.xpath("//span[contains(text(),'#')]"));
	 String s = colr.getCssValue("color");
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
	 WebElement backcolr = driver.findElement(By.xpath("//div[@class='a-section zg-bdg-body zg-bdg-clr-body aok-float-left']"));
	 String b = backcolr.getCssValue("background-color");
	 Color color2=Color.fromString(b);
	 String hexColor2= color2.asHex();

	 if(hexColor2.equals("#c45500"))
	 {
		 System.out.println(("Text color verifed and color is")+ hexColor2);
	 }
	 else
	 {
		 System.out.println("Color not verifed");
	 }

	}

}
