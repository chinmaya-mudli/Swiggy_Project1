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

public class Testcase6 extends Basetest
{
	@Test
	public void test6() throws Exception
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
		Thread.sleep(3000);
		h.srchsymbl();
		SearchPage s=new SearchPage(driver);
		s.seachbar("pasta street");
		Thread.sleep(3000);
		s.selrestu(driver);
		ClickOnadd ca=new ClickOnadd(driver);
		ca.addbutton(driver);
		RestaurentPage rp=new RestaurentPage(driver);
		rp.addditem();
		ca.checkout(driver);
		SecurePage sp=new SecurePage(driver);
		sp.deliverhere();
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,400)");
		sp.lnkaccbtn();
		sp.conyinue();
		h.signout(driver);
		h.logOut();
		
		
		
	}
}
