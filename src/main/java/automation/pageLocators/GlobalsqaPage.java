package automation.pageLocators;

import org.openqa.selenium.WebDriver;

import automation.common.CommonBase;
import automation.common.Type;
import automation.constants.CT_GlobalsqaHomeScreen;

public class GlobalsqaPage extends CommonBase{
	public WebDriver driver;
	public GlobalsqaPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public GlobalsqaPage SelectCountry(String country) {
		selectOptionFromDropdownByValue(CT_GlobalsqaHomeScreen.ele_ddCountry, Type.TagName, country);
		sleepInSecond(3);
		return this;
	}
	public GlobalsqaPage VerifySelectedValueDisplayInCountryDropdown(String expectedResult) {
		VerifySelectedDisplayInDropdown(CT_GlobalsqaHomeScreen.ele_ddCountry, Type.TagName, expectedResult);
		return this;
	}
}
