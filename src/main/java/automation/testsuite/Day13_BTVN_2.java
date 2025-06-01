package automation.testsuite;

import org.testng.annotations.*;

import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.CRMStartHomePage;
import automation.pageLocators.CRMStartLoginPage;

public class Day13_BTVN_2 extends BaseCommand{
	private String email = "admin@gmail.com";
	private String pass = "12345678";
	@BeforeMethod
	public void openBrowser() {
		driver = initFirefoxDrier(CT_PageURL.CRMSTAR_URL);
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	@Test
	(priority = 1)
	public void LoginSuccessFully() {
		CRMStartLoginPage login = new CRMStartLoginPage(driver)
				.LoginFunction(email, pass);
		CRMStartHomePage home = new CRMStartHomePage(driver)
				.isHomePageDisplayed();
	}
	@Test
	(priority = 2)
	public void LoginWithIncorrectEmail() {
		CRMStartLoginPage login = new CRMStartLoginPage(driver)
				.LoginFunction("vietdung@gmail.com", pass)
				.isErrorToastMessageDisplayed();
		
	}
	@Test
	(priority = 3)
	public void LoginWithIncorrectPassWord() {
		CRMStartLoginPage login = new CRMStartLoginPage(driver)
				.LoginFunction(email, "2345678")
				.isErrorToastMessageDisplayed();
		
	}
	@Test
	(priority = 4)
	public void LoginWithIncorrectEmailAndPass() {
		CRMStartLoginPage login = new CRMStartLoginPage(driver)
				.LoginFunction("vietdung@gmail.com", "2345678")
				.isErrorToastMessageDisplayed();
		
	}
}
