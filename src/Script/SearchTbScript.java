package Script;

import org.testng.annotations.Test;

import Genericlib.Basetest;
import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;
import PAGE.Loginpage;
import PAGE.SearchPage;


public class SearchTbScript extends Basetest 
{
	@Test
	public void search() throws Exception
	{
		Location lc=new Location(driver);
		lc.locate("murugespalya");
		lc.addressDropDown();
		Thread.sleep(2000);
		HomePage h = new HomePage(driver);
		h.signIn(driver);
		Login lg=new Login(driver);
		lg.phone(Genericlib.Excel.ExcelSheet(sheet, 0, 1, path));
		lg.pswd(Genericlib.Excel.ExcelSheet(sheet, 1, 1, path));
		Loginpage l = new Loginpage(driver);
			l.loginbtn1(); 
			
			Thread.sleep(2000);
		
			h.searchtext();
			
			Thread.sleep(3000);
			SearchPage s=new SearchPage(driver);
			s.image();
			s.filter();
			s.rating();
			
			h.logOut();
}
}
