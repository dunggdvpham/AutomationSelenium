package automation.pageLocators;

import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;
import automation.common.Type;
import automation.constants.CT_AladaOnboardPage;

public class AladaOnBoardPage extends BaseCommand{
	public WebDriver driver;
	public AladaOnBoardPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public AladaOnBoardPage accessSignInLink() {
		clickOnElement(CT_AladaOnboardPage.LNK_SIGNIN, Type.Xpath);
		return this;
	}
}
