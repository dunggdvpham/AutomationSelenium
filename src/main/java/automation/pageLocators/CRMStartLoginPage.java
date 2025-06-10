package automation.pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;
import automation.common.Type;
import automation.constants.CT_CrmStartLoginPage;

public class CRMStartLoginPage extends BaseCommand{
	public WebDriver driver;
	private By tf_Email = By.id("email");
	private By tf_Pass = By.id("password");
	private By btn_Login = By.xpath("//button[text() = 'Đăng nhập']");
	private By ele_lbl_SuccessToastMessage = By.id("toast-container");
	public CRMStartLoginPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public CRMStartLoginPage LoginFunction(String email, String pass) {
		sendKeyToElemet(tf_Email, email);
		sendKeyToElemet(tf_Pass, pass);
		clickOnElement(btn_Login);
		return this;
	}
	public CRMStartLoginPage isErrorToastMessageDisplayed() {
		isElementDisplayed(CT_CrmStartLoginPage.ERROR_TOAST_MESSAGE, Type.Xpath);
		return this;
	}
	public CRMStartLoginPage isSuccessToastMessageDisplayed() {
		isElementDisplayed(ele_lbl_SuccessToastMessage);
		return this;
	}
}
