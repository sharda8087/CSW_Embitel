package TestCases;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Global.Globals;
import PageObjects.LoginPage;
import PageObjects.PLPPageObject;

public class PLPTestCases extends Globals {

	PLPPageObject plp;

	@BeforeTest
	public void LaunchBrowser() {
		driver.get(csw_url);
	}

	@Test(priority = 0)
	public void closepop1() {

		// close pop-up
		plp.closepopup.click();
		Reporter.log("subscription pop-up is closed successfully");

	}

	@Test(priority = 2)
	public void dropdown() {
		plp.ClickDropdown.click();

		Reporter.log("User clicked on the PLP Sort-Dropdown Arrow button");

	}

	@Test(priority = 3)
	public void GetListOfSort() {
		plp.ClickDropdown.click();

	}
}