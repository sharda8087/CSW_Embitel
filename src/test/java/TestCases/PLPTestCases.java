package TestCases;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.PLPPageObject;
import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Global;

public class PLPTestCases extends Global {
	WebDriver driver;

	PLPPageObject plp;
	LoginPage login;
	
	
	
	@Test
	public void dropdown()
	{
	
		plp.ClickDropdown.click();
		Reporter.log("User clicked on the PLP Sort-Dropdown Arrow button");
	     
	}
	
	public void GetListOfSort()
	{
		plp.ClickDropdown.click();
		
		

}
}