package PAGE;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class Loginpage extends Basepage 
{
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginbtn;

	@FindBy(id="mobile")
	private WebElement usernametb;

	@FindBy(id="password")
	private WebElement passwordtb;

	@FindBy(xpath="(//a[text()='Login'])[1]")
	private WebElement loginbtn1;
	
	@FindBy(xpath="//span[text()='Locate Me']")
	private WebElement location;
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	
	public void loginlinke()
	{
		loginbtn.click();
	}
	
	

	
	public void username(String number)
	{
		usernametb.sendKeys(number);
	}
	
	public void password(String psw)
	{
		passwordtb.sendKeys(psw);
	}
	
	public void loginbtn1()
	{
		loginbtn1.click();
		
	}
	public void locationTrack() throws InterruptedException
	{
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	//	Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		location.click();

}
}

