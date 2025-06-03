package automation.pageLocators;

import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;
import automation.common.Type;
import automation.constants.CT_AladaRegister;

public class AladaRegisterPage extends BaseCommand{
	public WebDriver driver;
	public AladaRegisterPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public AladaRegisterPage SignUpNewAccount(String fullname, String email, String pass, String phone) {	
		sendKeyToElemet(CT_AladaRegister.TF_FULLNAME, Type.Id, fullname);
		sendKeyToElemet(CT_AladaRegister.TF_EMAIL, Type.Id, email);
		sendKeyToElemet(CT_AladaRegister.TF_REEMAIL, Type.Id, email);
		sendKeyToElemet(CT_AladaRegister.TF_PASS, Type.Id, pass);
		sendKeyToElemet(CT_AladaRegister.TF_REPASS, Type.Id, pass);
		sendKeyToElemet(CT_AladaRegister.TF_PHONE, Type.Id, phone);
		clickToCheckbox(CT_AladaRegister.CHK_ACCEPT_TERM, Type.Id);
		clickOnElement(CT_AladaRegister.BTN_SIGNUP, Type.Xpath);
		return this;
	}
}
