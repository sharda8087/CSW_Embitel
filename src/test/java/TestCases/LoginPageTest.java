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
	WebDriver driver;
	LoginPage login = new LoginPage(driver);
	
	
	@BeforeMethod
	public void launchbrowser() throws Exception  {
        login.openurl();
		
/* System.setProperty("browser", "Chrome");
 "D:\Embitel\chromedriver.exe"*/
		
		 setUp();

	browserNav(csw_url);
	  		
	}
	
	@Test (priority = 1)
	public void closepop() {
	login.closepopup.click();
	}
	
	@Test(priority = 2)
	public void LoginPagetitleTest() {
		String title = login.validateloginpageTitle();
		Assert.assertEquals(title, "#1 Shop Online for Womens Clothes, Bags, Shoes, Accessories in India - Cover Story");
		}
	
	@Test(priority = 3)
	public void cswlogoImageTest() {
		boolean flag = login.validatecswImage();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void TearDown() {
	     driver.close();
	}
}
