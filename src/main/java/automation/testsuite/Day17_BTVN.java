package automation.testsuite;

import org.testng.annotations.*;

import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.MediaMartHomePage;

public class Day17_BTVN extends BaseCommand{
	@BeforeMethod
	public void openBrowser() {
		driver= initChromeDriver(CT_PageURL.MEDIA_MART);
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	@Test
	public void switchToIframeSuccesfully() {
		MediaMartHomePage home = new MediaMartHomePage(driver)
				.AccessZaloIframe()
				.VerifyZaloChatBoxIsDisplayed();
	}
}
