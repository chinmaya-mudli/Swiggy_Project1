package Script;

import org.testng.annotations.Test;


import Genericlib.Basetest;

import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;
import PAGE.MyAccount;

public class Testcase2 extends Basetest
{
	@Test
	public void test2() throws Exception
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
		h.signout(driver);
		MyAccount m=new MyAccount(driver);
		m.edit(driver);
		m.changeopt();
		m.newpassword("chinu@12345678");
		m.renew("chinu@12345678");
		m.update();
		Thread.sleep(2000);
		m.close(driver);
		
		m.edit(driver);
		m.changeopt();
		m.newpassword("chinu@1234567");
		m.renew("chinu@1234567");
		m.update();
		Thread.sleep(2000);
		
		h.logOut();
		
	}
}
