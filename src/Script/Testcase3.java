package Script;


import org.testng.annotations.Test;


import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;
import PAGE.SetLocation;

import Genericlib.Basetest;

public class Testcase3 extends Basetest
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
		SetLocation sl=new SetLocation(driver);
		Thread.sleep(3000);
		sl.address();
		sl.addentry("kormangla");
		Thread.sleep(3000);
		sl.urAddress();
		Thread.sleep(8000);
		sl.addmoreButtom();
		sl.doorbox("545");
		sl.landmbox("watertank");
		sl.saveaddbtn();
		Thread.sleep(2000);
		h.signout(driver);
		h.logOut();
		
	}
}
