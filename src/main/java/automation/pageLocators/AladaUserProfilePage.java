package automation.pageLocators;

import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;
import automation.common.Type;
import automation.constants.CT_AladaUserProfile;

public class AladaUserProfilePage extends BaseCommand{
	public WebDriver driver;
	public AladaUserProfilePage(WebDriver _driver) {
		this.driver = _driver;
	}
	public AladaUserProfilePage updateNewPass(String currentPass, String newPass) {
		scrollToElement(getElementVisibility(CT_AladaUserProfile.TF_CURRENT_PASS, Type.Id));
		sleepInSecond(2);
		sendKeyToElemet(CT_AladaUserProfile.TF_CURRENT_PASS, Type.Id, currentPass);
		sendKeyToElemet(CT_AladaUserProfile.TF_NEW_PASS, Type.Id, newPass);
		sendKeyToElemet(CT_AladaUserProfile.TF_CONFIRM_PASS, Type.Id, newPass);
		clickOnElement(CT_AladaUserProfile.BTN_SAVE_NEW_PASS, Type.Xpath);
		sleepInSecond(2);
		acceptToAlert();;
		return this;
	}
}
