package PageObjects;

import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import antlr.collections.List;
import Global.Globals;

public class LoginPage extends Globals {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Finding the Locators

	// Locators for subscription pop-up

	@FindBy(xpath = "//img[contains(@class, 'img-logo')]")
	@CacheLookup
	public WebElement cswlogo;
	
	@FindBy(xpath = ".//*[@id='popup-newsletter-form']/div[3]/img")
	@CacheLookup
	public WebElement closepopup;

	@FindBy(xpath = ".//*[@id='page']/header/div/div/div/div[4]/div/div[3]/span")
	@CacheLookup
	public WebElement clickProfileIcon;
	
	

	// Finding locators for signin_popup
	@FindBy(xpath = ".//*[@id='mini-cart-header']")
	@CacheLookup
	public WebElement minicart;

	@FindBy(xpath = ".//*[@id='loginInput']")
	@CacheLookup
	public WebElement EnterEmailid;

	@FindBy(xpath = ".//*[@id='signPassword']")
	@CacheLookup
	public WebElement EnterPwd;

	@FindBy(xpath = ".//*[@id='stepOneSubmit']")
	@CacheLookup
	public WebElement ClickSigninbutton;

	// Locator for Google+/FB signin
	@FindBy(xpath = ".//*[@class='sign_gplus']")
	@CacheLookup
	public WebElement clickgooglesignin;

	@FindBy(xpath = ".//*[@class='sign_fb']")
	@CacheLookup
	public WebElement clickfbsignin;

	// Locator with otp
	@FindBy(xpath = ".//*[@id='signOtp']")
	@CacheLookup
	public WebElement clickcheckbox;

	@FindBy(xpath = ".//*[@id='stepOneSubmit']")
	@CacheLookup
	public WebElement clicksendotp;

	// Actions:
	public String validateloginpageTitle() {
		return driver.getTitle();
	}

	public boolean validatecswImage() {
		return cswlogo.isDisplayed();
	}

	public void closePopUp() throws Exception {
		Globals.IsClickable(closepopup, 30);
	}
	
	public void BrokenLink()
	{
	
	}

}
