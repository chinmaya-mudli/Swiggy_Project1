package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class SecurePage extends Basepage
{
	@FindBy(xpath="//div[@class='_2aJip']")
	private WebElement applycoupon;
	
	@FindBy(xpath="(//button[@class='_1KzYF'])[3]")
	private WebElement coupbtn;
	
	@FindBy(xpath="(//div[.='Deliver Here'])[1]")
	private WebElement delherebtn;
	
	@FindBy(xpath="(//div[@class='_2CxV2'])[1]")
	private WebElement linkacntbtn;
	
	@FindBy(xpath="//div[.='CONTINUE']")
	private WebElement continuebtn;
	
	@FindBy(xpath="//span[contains(.,'Pay')]")
	private WebElement paybtn;
	
	@FindBy(xpath="(//div[.='Pay on Delivery'])[1]")
	private WebElement payondelivery;
	
	@FindBy(xpath="//div[@class='_29Y5Z']")
	private WebElement decreament;
	
	public SecurePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void couponopt()
	{
		applycoupon.click();
	}
	public void cupbutton(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(coupbtn, driver);
		coupbtn.click();
	}
	public void deliverhere()
	{
		delherebtn.click();
	}
	public void lnkaccbtn()
	{
		linkacntbtn.click();
	}
	public void conyinue()
	{
		continuebtn.click();
	}
	public void payment(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(paybtn, driver);
		paybtn.click();
	}
	public void payon(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(payondelivery, driver);
		payondelivery.click();
	}
	public void decrease()
	{
		decreament.click();
	}
	
}
