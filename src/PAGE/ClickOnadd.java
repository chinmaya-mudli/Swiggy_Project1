package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class ClickOnadd extends Basepage
{
	@FindBy(xpath="(//div[@class='pLC0v _3L1X9'])[3]")
	private WebElement addbtn;
	
	@FindBy(xpath="//div[@class='_1ds9T']")
	private WebElement plusbutton;
	
	@FindBy(xpath="//div[@class='_1gPB7']")
	private WebElement checkoutbtn;
	
	@FindBy(xpath="(//div[.='ADD'])[1]")
	private WebElement adbutton;
	
	@FindBy(xpath="(//div[.='ADD'])[2]")
	private WebElement addagain;
	
	@FindBy(xpath="(//div[.='ADD'])[1]")
	private WebElement freeadd;
	
	
	public ClickOnadd(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void addclick()
	{
		addbtn.click();
	}
	
	public void plusbtn() throws InterruptedException
	{
		Thread.sleep(5000);
		plusbutton.click();
	}
	
	public void checkout(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(checkoutbtn, driver);
		checkoutbtn.click();
	}
	public void addbutton(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(adbutton, driver);
		adbutton.click();
	}
	public void addmoreopt(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(addagain, driver);
		addagain.click();
	}
	public void freeFoodadd()
	{
		freeadd.click();
	}
}
