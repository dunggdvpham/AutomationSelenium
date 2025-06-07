package automation.pageLocators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import automation.common.BaseCommand;

public class TeduHomePage extends BaseCommand{
	public WebDriver driver;
	private By cat_MyAccount = By.xpath("//li[@id= 'my_account']");
	private By lnk_ChangePass = By.xpath("//a[@title = 'Đổi mật khẩu']");
	private By tf_Search = By.xpath("//input[@class = 'autosearch-input form-control']");
	private By btn_Search = By.xpath("//button[@class = 'button-search btn btn-primary']");
	private By title_Cource = By.xpath("//h3[@class= 'md']//a");
	public TeduHomePage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath = "//li[@id= 'my_account']/a") WebElement cat_MyAccount;
//	@FindBy(xpath = "//a[@title = 'Đổi mật khẩu']") WebElement lnk_ChangePass;
//	public TeduHomePage AccessUpdatePassLink() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", cat_MyAccount);
//		lnk_ChangePass.click();
//		return this;
//	}
	//homework
	public TeduHomePage AccessUpdatePassLink() {
		clickOnElementByJSExecutor(cat_MyAccount);
		sleepInSecond(2);
		clickOnElement(lnk_ChangePass);
		return this;
	}
	public TeduHomePage EnterValueToSearchInput(String value) {
		sendKeyToElemet(tf_Search, value);
		clickOnElement(btn_Search);
		sleepInSecond(3);
		return this;
	}
	public TeduHomePage VerifyAllSearchedCourceDisplayed(String value) {
		verifyAllElementTextContains(title_Cource, value);
		return this;
	}
}
