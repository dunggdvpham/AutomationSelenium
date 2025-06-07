package automation.testsuite;

import org.testng.annotations.*;


import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.TeduHomePage;
import automation.pageLocators.TeduLoginPage;
import automation.pageLocators.TeduUpdatePassPage;

public class Day_15 extends BaseCommand{
	String email = "dungenino+1@gmail.com";
	String pass1 = "234567";
	String pass2 = "12345";
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURL.TEDU_URL);
		TeduLoginPage login = new TeduLoginPage(driver)
				.LoginFunction(email, pass1);
		TeduHomePage home = new TeduHomePage(driver)
				.AccessUpdatePassLink();
	}
//	@AfterMethod
//	public void quitBrowser() {
//		driver.quit();
//	}
	@Test
	public void updatePass_successfully() {
		TeduHomePage home = new TeduHomePage(driver)
				.AccessUpdatePassLink();
		TeduUpdatePassPage update = new TeduUpdatePassPage(driver)
				.IsUpdatePassScreenDisplayed()
				.UpdatePass(pass2, pass1)
				.IsFailedUpdateAlertDisplayed();
//		String temp;
//		temp = pass1;
//		pass1 = pass2;
//		pass2 = temp;
//		TeduLoginPage login2 = new TeduLoginPage(driver)
//				.IsUpdatePassSuccessFullyAlerDisplayed();
		
	}
	@Test
	public void updatePass_Fail_InvalidEmail() {
		
	}
	@Test
	public void updatePass_Fail_InvalidPass() {
		
	}
}
