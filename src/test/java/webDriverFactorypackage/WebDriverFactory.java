package webDriverFactorypackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {

	static WebDriver driver;

	public static WebDriver driverLaunch() throws IOException
	{

		FileInputStream FileInputStream = new FileInputStream("C:\\Users\\612387094\\eclipse-workspace\\AmazonProject1\\src\\test\\java\\utilities\\config.properties");

		Properties Properties = new Properties();

		Properties.load(FileInputStream);

		String browserName = Properties.getProperty("browser");


		System.out.println("Browser Name is "+ browserName);


		if((browserName.toLowerCase()).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if((browserName.toLowerCase()).equals("edge"))
		{

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else
		{
			System.out.println("Default browser is Edge");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		return driver;

	}


		}




