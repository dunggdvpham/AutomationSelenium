package automation.testsuite;

import org.testng.annotations.*;

import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.CRMStartHomePage;
import automation.pageLocators.CRMStartLoginPage;
import automation.pageLocators.CRMStartUserManagement;

public class Day16_BTVN1 extends BaseCommand{
	private String adminEmail = "admin@gmail.com";
	private String pass = "12345678";
//	private String username = "user" + getRandomNumber(3);
//	private String userEmail = "user" + getRandomNumber(2) + "@gmail.com";
//	private String phone = "1" + getRandomNumber(9);
//	private String department = "Công Nghệ";
//	private String role = "Admin/IT";
//	private String area = "KV0097";
//	private String code = String.valueOf(getRandomNumber(7));
	private String workAreaCode = String.valueOf(getRandomNumber(7));
	private String workAreaName = "department " + getRandomNumber(5);
	
	@BeforeMethod
	public void openBrowser() {
		driver= initFirefoxDrier(CT_PageURL.CRMSTAR_URL);
		CRMStartLoginPage login = new CRMStartLoginPage(driver)
				.LoginFunction(adminEmail, pass)
				.isSuccessToastMessageDisplayed();
		
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	@Test
	public void AddNewAndDeleteWorkAreaSuccessFully() {
		CRMStartHomePage home = new CRMStartHomePage(driver)
				.isHomePageDisplayed()
				.AccessWorkAreaManagement()
				.ClickOnAddNew()
				.FillFormAndSaveNewWorkArea(workAreaCode, workAreaName)
				.VerifySuccessToasMessageDisplay()
				.InputValueToSearchBox(workAreaName)
				.DeleteResourceWithName(workAreaName)
				.AcceptAlert()
				.SwitchToDefaultWindow()
				.VerifyNoResultTextDisplay()
				.VerifySuccessToasMessageDisplay();
		
	}

	
}
