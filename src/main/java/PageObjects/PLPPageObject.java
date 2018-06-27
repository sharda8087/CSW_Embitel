package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Global;

public class PLPPageObject extends Global {

	public PLPPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Get all the Element from the Sort-Dropdown List

	@FindBy(xpath = ".//*[@id='content']/div[4]/div/div[3]/div[3]/div[2]/div/a/div/b")
	@CacheLookup
	public WebElement ClickDropdown;

	@FindBy(xpath = ".//*[@id='content']/div[4]/div/div[3]/div[3]/div[2]/div/div/ul")
	@CacheLookup
	public WebElement GetListOfSortDropDown;

	// Close Pop-up
	@FindBy(xpath = ".//*[@id='popup-newsletter-form']/div[3]/img")
	@CacheLookup
	public WebElement closepopup_1;

	// Mouse-Over on the L1 category

	@FindBy(xpath = "//span[contains(text(),'Clothing')]")
	@CacheLookup
	public WebElement HoverOnClothingL1;

	@FindBy(xpath = "//h3[contains(text(),'All New')]")
	@CacheLookup
	public WebElement ClickAllNew;

}
