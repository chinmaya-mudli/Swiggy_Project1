package Genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(GECKO_key,GECKO_value);
		driver=new FirefoxDriver();
		 driver.get("https://www.swiggy.com");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeapp() throws Throwable
	{
		Thread.sleep(5000);
		driver.close();
	}

}

