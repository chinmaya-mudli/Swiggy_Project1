package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class MyAccount extends Basepage
{
	@FindBy(xpath="(//div[.='Edit profile'])[1]")
	private WebElement editBtn;
	
	@FindBy(xpath="//div[@class='_3QCnP _3u82i']")
	private WebElement change;
	
	@FindBy(xpath="(//input[@class='_381fS'])[1]")
	private WebElement newpass;
	
	@FindBy(xpath="(//input[@class='_381fS'])[2]")
	private WebElement reenter;
	
	@FindBy(xpath="//a[.='UPDATE']")
	private WebElement updat;
	
	@FindBy(xpath="//span[@class='SSFcO icon-close']")
	private WebElement closebtn;
	
	
	public MyAccount(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void edit(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(editBtn, driver);
		editBtn.click();
	}
	public void changeopt()
	{
		change.click();
	}
	public void newpassword(String newp)
	{
		newpass.sendKeys(newp);
	}
	public void renew(String repass)
	{
		reenter.sendKeys(repass);
	}
	public void update()
	{
		updat.click();
	}
	public void close(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(closebtn, driver);
		closebtn.click();
	}
}
