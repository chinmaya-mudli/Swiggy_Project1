package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class OrderPage extends Basepage
{
	@FindBy(xpath="//div[@role='button']")
	private WebElement applycoupon;
	
	@FindBy(xpath="(//button[text()='APPLY COUPON'])[1]")
	private WebElement coupon;
	
	@FindBy(xpath="//span[@class='_1qbcC']")
	private WebElement profilename;
	
	public OrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addcoupoun()
	{
		applycoupon.click();
	}
	
	public void applycoupon() throws InterruptedException
	{
		Thread.sleep(4000);
		coupon.click();
	}
	
	public void logout2() throws InterruptedException
	{   Thread.sleep(4000);
		profilename.click();
	}
}
