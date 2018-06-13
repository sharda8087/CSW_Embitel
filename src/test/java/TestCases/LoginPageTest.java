package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Global.Globals;
import PageObjects.LoginPage;
import junit.framework.Assert;

public class LoginPageTest extends Globals{
	LoginPage login;
	
	
	@BeforeTest
	public void launchbrowser() throws Exception  {
        openurl();
        //deletecookies();
        Reporter.log("Browser open successfully");
        
/* System.setProperty("browser", "Chrome");
 "D:\Embitel\chromedriver.exe"*/
		 /*setUp();
	browserNav(csw_url);*/
	  		}
	
	@Test(priority = 1)
	public void closepop() {
		login = new LoginPage(driver);
		
		//close pop-up
		login.closepopup.click();
		Reporter.log("subscription pop-up is closed successfully");
		
	}	  
	
	
	
	@Test(priority = 2)
	public void LoggedIn() throws Exception{
	     login.clickProfileIcon.click();
	     login.minicart.click();
         Thread.sleep(1000);
         login.EnterEmailid.sendKeys("9986335848");
	     login.EnterPwd.sendKeys("123456");
	     login.ClickSigninbutton.click();
	     
	    Reporter.log("Logged In successfully");
	    
	}
	
	/*@Test(priority = 3)
	public void HandleMultipleWindow() throws Exception{
		getWindowHandles();
		login.ClickReloadPage.click();
		Thread.sleep(1000);
		login.closepopup1.click();
		
	}*/
	
	
	@Test(priority = 3)
	public void LoginPagetitleTest() {
		String title = login.validateloginpageTitle();
		Assert.assertEquals(title, "Shop Online for Women's Clothes, Bags, Shoes, Accessories in India - Cover Story");
		Reporter.log("successfully Title is verified");
		}
	
	
	@Test(priority = 4)
	public void cswlogoImageTest() {
		boolean flag = login.validatecswImage();
		Assert.assertTrue(flag);
		Reporter.log("coverstory logo is verified");
	}

	
/*    @Test(priority = 5)
    public void FindBrokenLink(){
	//Used tagName method to collect the list of items with tagName "a"
    //findElements - to find all the elements with in the current page. It returns a list of all webelements or an empty list if nothing matches
	java.util.List<WebElement> links = driver.findElements(By.tagName("a"));  
     System.out.println("Total Links are " +links.size());
      // used for loop to   
     for (int i =0; i < links.size(); i++)
        {
        	WebElement element = links.get(i);
        	  String url = element.getAttribute("href");
        	//calling verifyLink() method here. Passing the parameter as url which we collected in the above link
              //See the detailed functionality of the verifyLink(url) method below
              VerifyBrokenLink(url);       
          Reporter.log("Successfully all broken link is collected");    
              
}
}*/
              
        

	
	/*@AfterMethod
	public void TearDown() {
		browserClose();
	     //driver.close();
	}*/
	
}


