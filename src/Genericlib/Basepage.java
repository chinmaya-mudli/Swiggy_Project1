package Genericlib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage
{
	public static void Elementpresent(WebElement element,WebDriver driver)throws Exception
	{
		try
		{
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("pass:Element is displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Fail:Element is not displayed",true);
			Assert.fail();
		}
		
	}
	public static void VerifypageisDisplay(WebDriver driver, String title)
	{
		try
		{
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.titleContains(title));
		Reporter.log("pass:Element is displayed",true);
		}
	catch(Exception e)
		{
		Reporter.log("Fail:Element is not displayed",true);
		Assert.fail();
		}
	}
		public static void Verifytitle(WebDriver driver, String title)
		{
			String actual=driver.getTitle();
			Assert.assertEquals(actual,title);
			
		}
}
