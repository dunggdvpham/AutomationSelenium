package automation.testsuite;

import org.testng.annotations.*;

import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.TeduHomePage;
import automation.pageLocators.TeduLoginPage;
import automation.pageLocators.TeduUpdatePassPage;

public class Day15_BTVN extends BaseCommand{
	private String email = "dungenino+1@gmail.com";
	private String pass1 = "234567";
	private String pass2 = "12345";
	private String course = "asp net";
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURL.TEDU_URL);
		TeduLoginPage login = new TeduLoginPage(driver)
				.LoginFunction(email, pass1);
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	@Test
	(priority = 1)
	public void updatePassUnsuccessfully() {
		TeduHomePage home = new TeduHomePage(driver)
				.AccessUpdatePassLink();
		TeduUpdatePassPage update = new TeduUpdatePassPage(driver)
				.UpdatePass(pass1, pass2);
//				.IsFailedUpdateAlertDisplayed();
	}
	@Test
	(priority = 2)
	public void searchCourceSuccessfully() {
		TeduHomePage home = new TeduHomePage(driver)
				.EnterValueToSearchInput(course)
				.VerifyAllSearchedCourceDisplayed(course);	
	}
}
