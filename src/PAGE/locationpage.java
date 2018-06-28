package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class locationpage extends Basepage
{
	@FindBy(xpath="//span[text()='Locate Me']")
	private WebElement location;

	public locationpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);


	}
	
	public void locationTrack() throws InterruptedException
	{ Thread.sleep(4000);
		location.click();
}
}
