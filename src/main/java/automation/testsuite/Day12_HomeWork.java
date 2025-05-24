package automation.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constants.CT_PageURL;
import automation.pageLocators.GlobalsqaPage;

public class Day12_HomeWork extends CommonBase{
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURL.GLOBALSQA_URL);
	}
	
	@Test
	public void SelectCountry() {
		GlobalsqaPage homepage = new GlobalsqaPage(driver);
		homepage.SelectCountry("ARG");
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
 }
