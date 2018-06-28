package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class Login extends Basepage
{
	@FindBy(id="mobile")
	private WebElement phnum;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//a[.='Login']")
	private WebElement loginBtn;
	
	/*public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}*/
	
	public Login(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public void phone(String number)
	{
		phnum.sendKeys(number);
	}
	public void pswd(String pass)
	{
		password.sendKeys(pass);
	}
	public void lgBtn()
	{
		loginBtn.click();
	}
}
