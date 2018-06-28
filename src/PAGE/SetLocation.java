package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class SetLocation extends Basepage
{
	

	
	@FindBy(xpath="//span[@class='icon-downArrow kVKTT']")
	private WebElement addbar;
	
	@FindBy(xpath="//input[@placeholder='Search for area, street name..']")
	private WebElement aentrybox;
	
	@FindBy(xpath="//div[.='Koramangala 3 Block, Koramangala']")
	private WebElement uradd;
	
	@FindBy(xpath="//a[@class='_2YJsx']")
	private WebElement addbtn;
	
	@FindBy(id="building")
	private WebElement door;
	
	@FindBy(id="landmark")
	private WebElement landmark;
	
	@FindBy(xpath="//a[.='SAVE ADDRESS & PROCEED']")
	private WebElement addaddbtn;
	
	public SetLocation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void address()
	{
		addbar.click();
	}
	public void addentry(String addentry)
	{
		aentrybox.sendKeys(addentry);
	}
	public void urAddress()
	{
		uradd.click();
	}
	/*public void addMorebtn(WebDriver driver) throws Exception 
	{
		Basepage.Elementpresent(addbtn, driver);
		addbtn.click();
	}*/
	public void addmoreButtom() 
	{
		addbtn.click();
	}
	public void doorbox(String dno)
	{
		door.sendKeys(dno);
	}
	public void landmbox(String lno)
	{
		landmark.sendKeys(lno);
	}
	public void saveaddbtn()
	{
		addaddbtn.click();
	}
}
