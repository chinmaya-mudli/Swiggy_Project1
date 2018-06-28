package PAGE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class HomePage extends Basepage
{
	@FindBy(xpath="//span[.='Sign In']")
	private WebElement signinbtn;
	
	@FindBy(xpath="(//div[text()='Edit profile'])[1]")
	private WebElement editprofile;
	
	@FindBy(xpath="(//div[text()='CHANGE'])[3]")
	private WebElement change;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement enterpass;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement reenterpass;
	
	@FindBy(xpath="//a[text()='UPDATE']")
	private WebElement submit;
	
	@FindBy(xpath="//span[@class='SSFcO icon-close']")
	private WebElement close;
	
	@FindBy(xpath="//span[.='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//span[@class='icon-downArrow kVKTT']")
	private WebElement downArrow;
	
	@FindBy(xpath="//div[.='Get current location']")
	private WebElement getcurrent;
	
	@FindBy(xpath="//div[.='SKIP & ADD LATER']")
	private WebElement skiplink;
	
	@FindBy(xpath="//span[.='Search']")
	private WebElement searchoptn;
	
	@FindBy(xpath="(//div[@class='nA6kb'])[4]")
	private WebElement TheRestra;
	@FindBy(xpath="//span[.='Sign In']")
	private WebElement signinBtn;
	
	@FindBy(xpath="//span[@class='_1qbcC']")
	private WebElement signoutBtn;
	
	
	
	@FindBy(xpath="//span[@class='icon-downArrow kVKTT']")
	private WebElement addbar;
	
	@FindBy(xpath="//div[.='Koramangala 3 Block, Koramangala']")
	private WebElement uradd;
	
	@FindBy(xpath="//span[.='Search']")
	private WebElement serchtbox;
	
	@FindBy(xpath="(//div[.='Free Delivery'])[1]")
	private WebElement freedeliveropt;
	
	@FindBy(xpath="(//div[.='The Bowl Company'])[2]")
	private WebElement selrestu;
	
	@FindBy(xpath="//span[.='Cart']")
	private WebElement cart;

	public HomePage(WebDriver driver) 

	{
		PageFactory.initElements(driver, this);
	}
	
	/*public void profile(WebDriver driver) throws InterruptedException
	{// Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.moveToElement(pname).perform();
		pname.click();*/
	public void signIn(WebDriver driver) throws Exception
	{
		Basepage.Elementpresent(signinBtn, driver);
		signinbtn.click();
	}
	 
	public void edit()
	{
		editprofile.click();
	}
	
	public void changepass() throws InterruptedException
	{
	//	Thread.sleep(4000);
		change.click();
	}
	
	public void pass(String newpass)
	{
	enterpass.sendKeys(newpass);	
	}
	
	public void repass(String renewpass)
	{
	  reenterpass.sendKeys(renewpass);
	}
	
	public void update()
	{
		submit.click();
	}
	
	public void close(WebDriver driver) throws InterruptedException
	{// Thread.sleep(4000);
		Actions act= new Actions(driver);
		act.moveToElement(close).perform();
		close.click();
	}
	
	
	
	public void changeloc(WebDriver driver) throws InterruptedException
	{
	//Thread.sleep(5000);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		downArrow.click();
	}
	
	public void getloc(WebDriver driver) throws InterruptedException
	{ // Thread.sleep(5000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getcurrent.click();
	}
	
	public void skipbtn()
	{
		skiplink.click();
	}
	
	public void searchtext() 
	{// Thread.sleep(5000);
		searchoptn.click();
	}
	
	public void Restaname(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,100)");
		Thread.sleep(4000);
		TheRestra.click();
		
	}
		public void signout(WebDriver driver) throws Exception
		{
			Basepage.Elementpresent(signoutBtn, driver);
			signoutBtn.click();
		}
		public void logOut()
		{
			logout.click();
		}
		public void address(String address)
		{
			addbar.sendKeys(address);
		}
		public void urAddress()
		{
			uradd.click();
		}
		public void srchsymbl()
		{
			serchtbox.click();
		}
		public void freeDelivery(WebDriver driver) throws Exception
		{
			Basepage.Elementpresent(freedeliveropt, driver);
			freedeliveropt.click();
		}
		public void selectResturant()
		{
			selrestu.click();
		}
		public void cartcheck(WebDriver driver) throws Exception
		{
			Basepage.Elementpresent(cart, driver);
			cart.click();
		}
}
