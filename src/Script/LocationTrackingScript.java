package Script;

import org.testng.annotations.Test;

import Genericlib.Basetest;
import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;



public class LocationTrackingScript extends Basetest
{
	@Test
	public void script2() throws Exception
	{
		Location lc=new Location(driver);
		lc.locate("murugespalya");
		lc.addressDropDown();
		
		HomePage h =new HomePage(driver);
		h.signIn(driver);
		Login lg=new Login(driver);
		lg.phone(Genericlib.Excel.ExcelSheet(sheet, 0, 1, path));
		lg.pswd(Genericlib.Excel.ExcelSheet(sheet, 1, 1, path));
		lg.lgBtn();
		h.changeloc(driver);
		h.getloc(driver);
		h.skipbtn();
	
		h.signIn(driver);
		h.logOut();
}
}
