package Script;

import org.testng.annotations.Test;

import Genericlib.Basetest;
import PAGE.ClickOnadd;
import PAGE.HomePage;
import PAGE.Location;
import PAGE.Login;

import PAGE.OrderPage;


public class ApplyCouponScript extends Basetest
{
	@Test()
	public void coupon() throws Exception
	{
		Location lc=new Location(driver);
		lc.locate("murugespalya");
		lc.addressDropDown();
		HomePage h = new HomePage(driver);
		h.signIn(driver);
		/*Loginpage l = new Loginpage(driver);
		l.loginlinke();*/
		Login lg=new Login(driver);
		lg.phone(Genericlib.Excel.ExcelSheet(sheet, 0, 1, path));
		lg.pswd(Genericlib.Excel.ExcelSheet(sheet, 1, 1, path));
		lg.lgBtn(); 
		
		
		/*locationpage p = new locationpage(driver);

		p.locationTrack();*/

		
		h.Restaname(driver);
		
		ClickOnadd c = new ClickOnadd(driver);
		c.addclick();
		c.checkout(driver);
		
		OrderPage o = new OrderPage(driver);
		o.addcoupoun();
		o.applycoupon();
	   o.logout2();
	//	h.profile(driver);
	  // h.logoutbtn();
		h.signout(driver);
		h.logOut();
}
}
