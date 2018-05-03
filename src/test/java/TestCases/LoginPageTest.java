package TestCases;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Global.Globals;
import PageObjects.LoginPage;
import junit.framework.Assert;

public class LoginPageTest extends Globals{
	
	@BeforeMethod
	public void launchbrowser() throws Exception  {
        openurl();
        deletecookies();
        
		
/* System.setProperty("browser", "Chrome");
 "D:\Embitel\chromedriver.exe"*/
		 /*setUp();
	browserNav(csw_url);*/
	  		}
	
	@Test 
	public void closepop() {
		LoginPage login = new LoginPage(driver);
	login.closepopup.click();
	
	//PageTitle
	String title = login.validateloginpageTitle();
	Assert.assertEquals(title, "Shop Online for Womens Clothes, Bags, Shoes, Accessories in India - Cover Story");
	}
	
	/*@Test(priority = 2)
	public void LoginPagetitleTest() {
		String title = login.validateloginpageTitle();
		Assert.assertEquals(title, "#1 Shop Online for Womens Clothes, Bags, Shoes, Accessories in India - Cover Story");
		}*/
	
	/*@Test(priority = 3)
	public void cswlogoImageTest() {
		boolean flag = login.validatecswImage();
		Assert.assertTrue(flag);
	}*/

	/*@AfterMethod
	public void TearDown() {
		browserClose();
	     //driver.close();
	}*/
	
}