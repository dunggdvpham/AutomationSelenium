package automation.pageLocators;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;
import automation.common.Type;
import automation.constants.CT_CRMHomePage;

public class CRMStartHomePage extends BaseCommand{
	public WebDriver driver;
	public CRMStartHomePage(WebDriver _driver) {
		this.driver = _driver;
	}
	public CRMStartHomePage isHomePageDisplayed() {
		isElementDisplayed(CT_CRMHomePage.HOMEPAGE_TITLE, Type.Xpath);
		return this;
	}
}
