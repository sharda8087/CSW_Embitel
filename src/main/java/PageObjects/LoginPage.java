package PageObjects;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Global.Globals;

public class LoginPage extends Globals  {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =".//*[@id='popup-newsletter-form']/div[3]/img") 
	@CacheLookup
	public WebElement closepopup;
	
	@FindBy(xpath = "/html/body/div[2]/header/div/div/div/div[4]/div/div[3]/span")
	@CacheLookup 
	WebElement clickProfileIcon;
	
	@FindBy(xpath = "//img[contains(@class, 'img-logo')]")
	@CacheLookup
	WebElement cswlogo;
	
	
	//Actions:
		public String validateloginpageTitle() {
			return driver.getTitle();
		}
		
		public boolean validatecswImage() {
			return cswlogo.isDisplayed();
		}
		
		public void closePopUp() throws Exception{
			Globals.IsClickable(closepopup, 30);
		}
		
		
	
	
	

}
