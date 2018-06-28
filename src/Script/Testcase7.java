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

public class Testcase7 extends Basetest
{
	@Test
	public void test7() throws Exception
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
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,400)");
		s.selrestu(driver);
		ClickOnadd ca=new ClickOnadd(driver);
		
		je.executeScript("window.scrollBy(0,500)");
		ca.addbutton(driver);
		RestaurentPage rp=new RestaurentPage(driver);
		rp.addditem();
		Thread.sleep(3000);
		ca.addmoreopt(driver);
		rp.addditem();
		Thread.sleep(3000);
		ca.checkout(driver);
		Thread.sleep(2000);
		SecurePage sp=new SecurePage(driver);
		sp.deliverhere();
		sp.payon(driver);
		sp.payment(driver);
	h.signout(driver);
		h.logOut();
	
		
	}
}
