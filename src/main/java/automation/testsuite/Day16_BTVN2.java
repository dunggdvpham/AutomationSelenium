package automation.testsuite;

import org.testng.annotations.*;


import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.CRMStartLoginPage;
import automation.pageLocators.SeleniumPracticeHomePage;

public class Day16_BTVN2 extends BaseCommand{
	private String text = "Welcome to Selenium WebDriver Tutorials";
	@BeforeMethod
	public void openBrowser() {
		driver= initChromeDriver(CT_PageURL.SELENIUM_PRACTICE);
		
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	@Test
	public void VerifyTextOnAlert() {
		SeleniumPracticeHomePage home = new SeleniumPracticeHomePage(driver)
				.ClickOnTryIt()
				.VerifyTextFromAlertEqual(text);
	}
}
