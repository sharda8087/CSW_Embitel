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
	
	// Finding the Locators
	
	@FindBy(xpath =".//*[@id='popup-newsletter-form']/div[3]/img") 
	@CacheLookup
	public WebElement closepopup;
	
	@FindBy(xpath = "/html/body/div[2]/header/div/div/div/div[4]/div/div[3]/span")
	@CacheLookup 
	WebElement clickProfileIcon;
	
	@FindBy(xpath = "//img[contains(@class, 'img-logo')]")
	@CacheLookup
	WebElement cswlogo;
	
	// Finding locators for signin_popup
	@FindBy(xpath = ".//*[@id='mini-cart-header']")
	@CacheLookup
	public WebElement minicart;
	
	@FindBy(xpath = ".//*[@id='Signin-popup']")
	@CacheLookup
	public WebElement clicksignin;
	
	@FindBy(xpath= ".//*[@name='LoginForm[number]']")
    @CacheLookup
    public WebElement EnterEmailid;
    
    @FindBy(xpath= ".//*[@name='LoginForm[password]']")
    @CacheLookup
    public WebElement EnterPwd;
    
    @FindBy(xpath= ".//*[@class='sign_in_btnbtns green_btn']")
    @CacheLookup
    public WebElement ClickSignin;
	
    //Locator for Google+/FB signin
    @FindBy(xpath = ".//*[@class='sign_gplus']")
    @CacheLookup
    public WebElement clickgooglesignin;
    
    @FindBy(xpath = ".//*[@class='sign_fb']")
    @CacheLookup
    public WebElement clickfbsignin;
    
    //Locator with otp
    @FindBy(xpath = ".//*[@id='signOtp']")
    @CacheLookup
    public WebElement clickcheckbox;
    
    @FindBy(xpath = ".//*[@id='stepOneSubmit']")
    @CacheLookup
    public WebElement clicksendotp;
	
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
