package Script;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


import Genericlib.Basetest;
import PAGE.ClickOnadd;
import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;
import PAGE.RestaurentPage;
import PAGE.SearchPage;
import PAGE.SecurePage;

public class Testcase5 extends Basetest
{
	@Test
	public void test5() throws Exception
	{
		
		Location lc=new Location(driver);
		lc.locate("murugeshpalya");
		lc.addressDropDown();
		Thread.sleep(3000);
		HomePage h=new HomePage(driver);
		h.signIn(driver);
		Login l=new Login(driver);
		l.phone(Genericlib.Excel.ExcelSheet(sheet, 0, 1, path));
		l.pswd(Genericlib.Excel.ExcelSheet(sheet, 1, 1, path));
		l.lgBtn();
		JavascriptExecutor je=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		
		h.srchsymbl();
		SearchPage s=new SearchPage(driver);
		s.seachbar("pasta street");
		je.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		s.selrestu(driver);
		
		je.executeScript("window.scrollBy(0,400)");
		ClickOnadd ca=new ClickOnadd(driver);
		ca.addbutton(driver);
		RestaurentPage rp=new RestaurentPage(driver);
		rp.addditem();
		Thread.sleep(2000);
		ca.checkout(driver);
		SecurePage sp=new SecurePage(driver);
		sp.couponopt();
		je.executeScript("window.scrollBy(0,400)");
		sp.cupbutton(driver);
		
		sp.decrease();
		h.signout(driver);
		h.logOut();
		
	}
}
