package Script;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Genericlib.Basetest;
import PAGE.ClickOnadd;
import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;
import PAGE.SecurePage;

public class Testcase8 extends Basetest
{
	@Test
	public void test8() throws Exception
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
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,300)");
		h.freeDelivery(driver);
		h.selectResturant();
		ClickOnadd ca=new ClickOnadd(driver);
		ca.freeFoodadd();
		ca.checkout(driver);
		SecurePage sp=new SecurePage(driver);
		sp.deliverhere();
		sp.payon(driver);
		h.signout(driver);
		h.logOut();
		
	}
}
