package automation.pageLocators;

import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;
import automation.common.Type;
import automation.constants.CT_AladaHome;

public class AladaHomePage extends BaseCommand{
	public WebDriver driver;
	public AladaHomePage(WebDriver _driver) {
		this.driver = driver;
	}
	public AladaHomePage isHomePageIsDisplayed() {
		verifyElementIsDisplay(CT_AladaHome.LNK_MY_COURSE, Type.Xpath);
		return this;
	}
	public AladaHomePage clickUserProfile() {
		clickOnElement(CT_AladaHome.LNK_USER_PROFILE, Type.Id);
		return this;
	}
	public AladaHomePage clickOnChangeProfileLink() {
		clickOnElement(CT_AladaHome.LNK_EDIT_PROFILE, Type.Xpath);
		return this;
	}
	public AladaHomePage clickOnLogOut() {
		clickOnElement(CT_AladaHome.BTN_LOGOUT, Type.Xpath);
		return this;
	}
	
	
}
