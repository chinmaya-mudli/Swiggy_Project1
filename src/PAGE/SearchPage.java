package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class SearchPage extends Basepage
{
	@FindBy(xpath="//img[@alt='doughnut']")
	private WebElement doughnut;

	@FindBy(xpath="//a[.='Relevance']")
	private WebElement filteroptions;
	
	@FindBy(xpath="//li[.='Rating']")
	private WebElement ratingfilter;
	
	@FindBy(xpath="//input[@class='_2BJMh']")
	private WebElement searchbox;

	@FindBy(xpath="//div[.='Pasta Street']")
	private WebElement resturant;

	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	/*public void image(WebDriver driver) throws InterruptedException
	{
		//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);
		doughnut.click();
	}*/
	public void image()
	{
		doughnut.click();
	}
	
	public void filter()
	{
		filteroptions.click();
	}
	
	public void rating()
	{
		ratingfilter.click();
	}
	public void seachbar(String stext)
	{
		searchbox.sendKeys(stext);
	}
	public void selrestu(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(resturant, driver);
		resturant.click();
	}

}
