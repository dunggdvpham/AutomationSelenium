package automation.testsuite;

import org.testng.annotations.*;

import automation.common.BaseCommand;

import automation.constants.CT_PageURL;
import automation.pageLocators.AladaHomePage;
import automation.pageLocators.AladaLoginPage;
import automation.pageLocators.AladaOnBoardPage;
import automation.pageLocators.AladaUserProfilePage;

public class Day13_BTVN_1 extends BaseCommand{
	private String email = "phamdvdungg@gmail.com";
	private String currentPass = "654321";
	private String newPass = "123456";
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURL.ALADA_URL);
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	@Test
	public void updatePassSuccessfully() {
		// step 1: login with current pass
		AladaLoginPage login1 = new AladaLoginPage(driver)
				.loginFunction(email, currentPass);
		
		// step 2: update new pass
		AladaHomePage home = new AladaHomePage(driver)
				.isHomePageIsDisplayed()
				.clickUserProfile()
				.clickOnChangeProfileLink();
		
		AladaUserProfilePage userProfile = new AladaUserProfilePage(driver)
				.updateNewPass(currentPass, newPass);
		
		AladaHomePage home2 = new AladaHomePage(driver)
				.clickUserProfile()
				.clickOnLogOut();
		
		// step 3 : login with new pass
		AladaOnBoardPage onboard = new AladaOnBoardPage(driver)
				.accessSignInLink();
		AladaLoginPage login2 = new AladaLoginPage(driver)
				.loginFunction(email, newPass);
		AladaHomePage home3 = new AladaHomePage(driver)
				.isHomePageIsDisplayed();
	}
	
}
