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
	private String email = "dung.pham+3@sotatek.com";
	private String pass = "123456";
	private String changedPass = "123456";
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
				.SignUpNewAccount(fullname, email, pass, phone);
		AladaHomePage home = new AladaHomePage(driver)
				.isHomePageIsDisplayed()
				.clickUserProfile()
				.clickOnChangeProfileLink();
		// step 2: update pass
		AladaUserProfilePage userProfile = new AladaUserProfilePage(driver)
				.updateNewPass(pass, changedPass);

		AladaHomePage home2 = new AladaHomePage(driver)
				.clickUserProfile()
				.clickOnLogOut();

		// step 3 : login with new pass
		AladaOnBoardPage onboard = new AladaOnBoardPage(driver)
				.accessSignInLink();
		AladaLoginPage login2 = new AladaLoginPage(driver)
				.loginFunction(email, changedPass);
		AladaHomePage home3 = new AladaHomePage(driver)
				.isHomePageIsDisplayed();
	}
}
