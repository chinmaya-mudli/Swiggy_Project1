package Script;




import org.testng.annotations.Test;


import Genericlib.Basetest;

import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;



public class Testcase1 extends Basetest
{
	
	
	
	@Test
	public void test1() throws Exception
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
		h.signout(driver);
		h.logOut();
		
	}
	
	

}
