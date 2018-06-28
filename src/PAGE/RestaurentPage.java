package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.Basepage;

public class RestaurentPage extends Basepage
{
	@FindBy(xpath="//span[.='Favourite']")
	private WebElement favouritz;
	
	@FindBy(xpath="//span[.='Favourites']")
	private WebElement favouritesoption;
	
	@FindBy(xpath="//span[.='Add Item']")
	private WebElement aditem;
	
	@FindBy(xpath="//span[.='Favourited']")
	private WebElement favorited;
	
	
	
	public RestaurentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void favouritezbox()
	{  
		favouritz.click();
	}
	public void favouritoption()
	{
		favouritesoption.click();
	}
	public void addditem()
	{
		aditem.click();
	}
	public void afterfavo()
	{
		favorited.click();
	}
}
