package TestCases;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Global.Globals;
import PageObjects.LoginPage;
import PageObjects.PLPPageObject;

public class PLPTestCases extends Globals {
	PLPPageObject plp;

	// Launching the Coverstory Browser
	@BeforeTest
	public void LaunchBrowser() throws Exception {

		openurl();
		Reporter.log("Browser open successfully");

	}

	@Test(priority = 0)
	public void closepop() {
		plp = new PLPPageObject(driver);

		// close pop-up
		plp.closepopup_1.click();
		Reporter.log("subscription pop-up is closed successfully");

	}

	@Test(priority = 4)
	public void Mouse_HoverOnL1() throws Exception {

		plp.HoverOnClothingL1.click();
		Thread.sleep(1000);
		Reporter.log("User mouse-Houver on the Clothing category");

		plp.ClickAllNew.click();
		Reporter.log("user clicked on the All New sub-Category");

	}
}