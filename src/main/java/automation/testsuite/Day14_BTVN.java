package automation.testsuite;

import org.testng.annotations.*;

import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.AladaHomePage;
import automation.pageLocators.AladaLoginPage;
import automation.pageLocators.AladaOnBoardPage;
import automation.pageLocators.AladaRegisterPage;
import automation.pageLocators.AladaUserProfilePage;

public class Day14_BTVN extends BaseCommand{
	private String fullname = "Pham Dung";
	private String email = "dung.pham+5@sotatek.com";
	private String pass1 = "123456";
	private String pass2 = "123456";
	private String phone = "0123456789";

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURL.ALADA_REGISTER_URL);
		
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	@Test
	public void signupNewAccountAndChangePassSucessfully() {
		// step 1 sign up new account
		AladaRegisterPage regis = new AladaRegisterPage(driver)
				.SignUpNewAccount(fullname, email, pass1, phone);
		AladaHomePage home = new AladaHomePage(driver)
				.isHomePageIsDisplayed()
				.clickUserProfile()
				.clickOnChangeProfileLink();
		// step 2: update pass
		String temp;
		temp = pass1;
		AladaUserProfilePage userProfile = new AladaUserProfilePage(driver)
				.updateNewPass(pass1, pass2);
		pass1 = pass2;
		pass2 = temp;
		AladaHomePage home2 = new AladaHomePage(driver)
				.clickUserProfile()
				.clickOnLogOut();

		// step 3 : login with new pass
		AladaOnBoardPage onboard = new AladaOnBoardPage(driver)
				.accessSignInLink();
		AladaLoginPage login2 = new AladaLoginPage(driver)
				.loginFunction(email, pass2);
		AladaHomePage home3 = new AladaHomePage(driver)
				.isHomePageIsDisplayed();
	}
}
