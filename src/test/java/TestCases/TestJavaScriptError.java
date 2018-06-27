package TestCases;

import java.sql.Driver;
import java.util.logging.Level;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestJavaScriptError {
	public WebDriver driver; 
	
	
	@BeforeMethod
	public  void SetUp(){
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		LoggingPreferences loggingprefrences = new LoggingPreferences();
		loggingprefrences.enable(LogType.BROWSER, Level.ALL);
		capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingprefrences);
		System.setProperty("Webdriver.chrome.driver", "D://lib//ChromeDriver_Folder//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver(capabilities);		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	public void extractJSlogsInfo(){
		LogEntries logentries = driver.manage().logs().get(LogType.BROWSER);
		for(LogEntry entry: logentries)
			System.out.println(entry.getTimestamp() + "" + entry.getLevel() + "" + entry.getMessage());
	}
	
	@Test
	public void OpenBrowser(){
		driver.get("https://www.coverstory.co.in/");
		extractJSlogsInfo();
	}

}
