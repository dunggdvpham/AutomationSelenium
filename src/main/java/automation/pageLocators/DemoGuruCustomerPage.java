package automation.pageLocators;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;

public class DemoGuruCustomerPage extends BaseCommand{
	public WebDriver driver;
	private By tf_CustomerID = By.name("cusid");
	private By btn_Submit = By.name("submit");
	public DemoGuruCustomerPage (WebDriver _driver) {
		this.driver = _driver;
	}
	public DemoGuruCustomerPage InputCustomerID(String value) {
		sendKeyToElemet(tf_CustomerID, value);
		clickOnElement(btn_Submit);
		return this;
	}
	public DemoGuruCustomerPage VerifyAlertDiplay(String text) {
		assertEquals(getTextFromAlert(), text);
		acceptToAlert();
		sleepInSecond(3);
		return this;
	}
	

}
