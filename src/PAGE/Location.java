package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class Location extends Basepage
{
	@FindBy(id="location")
	private WebElement locfield;
	
	@FindBy(xpath="//span[contains(.,'Shiva temple')]")
	private WebElement address;
	
	public Location(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void locate(String loc)
	{
		locfield.sendKeys(loc);
	}
	public void addressDropDown()
	{
		address.click();
	}
}
