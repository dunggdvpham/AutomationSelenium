package automation.pageLocators;

import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;
import automation.common.Type;
import automation.constants.CT_CrmStartLoginPage;

public class CRMStartLoginPage extends BaseCommand{
	public WebDriver driver;
	public CRMStartLoginPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public CRMStartLoginPage LoginFunction(String email, String pass) {
		sendKeyToElemet(CT_CrmStartLoginPage.TF_EMAIL, Type.Id, email);
		sendKeyToElemet(CT_CrmStartLoginPage.TF_PASSWORD, Type.Id, pass);
		clickOnElement(CT_CrmStartLoginPage.BTN_LOGIN, Type.Xpath);
		return this;
	}
	public CRMStartLoginPage isErrorToastMessageDisplayed() {
		isElementDisplayed(CT_CrmStartLoginPage.ERROR_TOAST_MESSAGE, Type.Xpath);
		return this;
	}
}
