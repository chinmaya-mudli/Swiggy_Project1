package Script;

import org.testng.annotations.Test;

import Genericlib.Basetest;
import PAGE.ClickOnadd;
import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;

import PAGE.RestaurentPage;
import PAGE.SecurePage;


public class AddScenario extends Basetest
{
	@Test
	public void add() throws Exception
	{
		Location lc=new Location(driver);
		lc.locate("murugespalya");
		lc.addressDropDown();
		HomePage h = new HomePage(driver);
		h.signIn(driver);
		
		Login lg=new Login(driver);
		
		lg.phone(Genericlib.Excel.ExcelSheet(sheet, 0, 1, path));
		lg.pswd(Genericlib.Excel.ExcelSheet(sheet, 1, 1, path));
		lg.lgBtn(); 	
		h.Restaname(driver);
		
		ClickOnadd c = new ClickOnadd(driver);
		c.addclick();
		RestaurentPage rp=new RestaurentPage(driver);
		rp.addditem();
		Thread.sleep(2000);
		c.checkout(driver);
		Thread.sleep(2000);
		SecurePage sp=new SecurePage(driver);
		sp.decrease();
		h.signIn(driver);
		h.logOut();
}
}

