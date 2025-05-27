package automation.pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.common.BaseCommand;
import automation.common.Type;
import automation.constants.CT_AladaLogin;

public class AladaLoginPage extends BaseCommand{
	public  WebDriver driver;
	public AladaLoginPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public AladaLoginPage loginFunction(String email, String pass) {
		sendKeyToElemet(CT_AladaLogin.TF_EMAIL, Type.Id, email);
		sendKeyToElemet(CT_AladaLogin.TF_PASSWORD, Type.Id, pass);
		clickOnElement(CT_AladaLogin.BTN_LOGIN, Type.Xpath);
		return this;
	}
}
