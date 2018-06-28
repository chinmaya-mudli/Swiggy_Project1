package Script;

import org.testng.annotations.Test;

import Genericlib.Basetest;
import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;
import PAGE.RestaurentPage;
import PAGE.SearchPage;

public class Testcase4 
{
	public class Testcase1 extends Basetest
	{
		@Test
		public void test1() throws Exception
		{
			
			Location lc=new Location(driver);
			lc.locate("murugeshpalya");
			lc.addressDropDown();
			Thread.sleep(6000);
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
			RestaurentPage rp=new RestaurentPage(driver);
			rp.favouritezbox();
			h.signout(driver);
			rp.favouritoption();
			/*s.seachbar("pasta street");
			Thread.sleep(3000);*/
			s.selrestu(driver);
			
			rp.afterfavo();
			h.signout(driver);
			//rp.favouritoption();
			
			h.logOut();
		}
	}
}
