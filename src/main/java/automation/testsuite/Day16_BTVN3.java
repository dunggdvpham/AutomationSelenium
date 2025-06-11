package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;


import automation.common.BaseCommand;
import automation.constants.CT_PageURL;
import automation.pageLocators.DemoGuruCustomerPage;

public class Day16_BTVN3 extends BaseCommand{
	private String customerID = String.valueOf(getRandomNumber(5));
	private String alert1Text = "Do you really want to delete this Customer?";
	private String alert2Text = "Customer Successfully Delete!";
	@BeforeMethod
	public void openBrowser() {
		driver= initChromeDriver(CT_PageURL.DEMOGURU_CUSTOMER);
		
	}
//	@AfterMethod
//	public void quitBrowser() {
//		driver.quit();
//	}
	@Test
	public void VerifyAlertDisplay() {
		DemoGuruCustomerPage home = new DemoGuruCustomerPage(driver)
				.InputCustomerID(customerID)
				.VerifyAlertDiplay(alert1Text)
				.VerifyAlertDiplay(alert2Text);
	}
}
