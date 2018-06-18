package TestCases;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Global.Globals;
import PageObjects.PLPPageObject;

public class PLPTestCases extends Globals {

	PLPPageObject plp;

	@BeforeTest
	public void LaunchBrowser() {
		openurl();
	}

	@Test(priority=0)
	public void Mouse_HoverOnL1() throws Exception{
		plp.HoverOnClothingL1.click();
		Thread.sleep(500);
		Reporter.log("User mouse-Houver on the Clothing category");
		
		plp.ClickAllNew.click();
		Reporter.log("user clicked on the All New sub-Category");
		
		
	}
	
	
	
	@Test(priority=1)
	public void dropdown() {
		plp.ClickDropdown.click();

		Reporter.log("User clicked on the PLP Sort-Dropdown Arrow button");

	}

	@Test(priority=3)
	public void GetListOfSort() {
		plp.ClickDropdown.click();

	}
}