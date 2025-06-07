package automation.pageLocators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import automation.common.BaseCommand;


public class TeduLoginPage extends BaseCommand{
	public WebDriver driver;
	private By btn_Later = By.xpath("//button[text() = 'Later']");
	private By tf_Username = By.id("UserName");
	private By tf_Pass = By.id("Password");
	private By btn_Login = By.xpath("//button[text() = 'Đăng nhập']");
	private By alert_UpdatePassSuccessfully = By.xpath("//div[@class = 'alert alert-success']");
	public TeduLoginPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(id = "UserName") WebElement tf_Username;
//	@FindBy(id = "Password") WebElement tf_Pass;
//	@FindBy(xpath = "") WebElement btn_Login;
//	@FindBy(xpath = "//div[@class = 'alert alert-success']") WebElement alert_UpdatePassSuccessfully;
//	@FindBy(xpath = "//button[text() = 'Later']") WebElement btn_Later;
//	
//	public TeduLoginPage LoginFunction(String username, String pass) {
//		btn_Later.click();
//		tf_Username.sendKeys(username);
//		tf_Pass.sendKeys(pass);
//		btn_Login.click();
//		return this;
//	}
//	public TeduLoginPage IsUpdatePassSuccessFullyAlerDisplayed() {
//		assertTrue(alert_UpdatePassSuccessfully.isDisplayed());
//		return this;
//	}
	//home work
	public TeduLoginPage LoginFunction(String username, String pass) {
		if(getElementVisibility(btn_Later).isDisplayed()) {
			clickOnElement(btn_Later);
		}
		sendKeyToElemet(tf_Username, username);
		sendKeyToElemet(tf_Pass, pass);
		clickOnElement(btn_Login);
		sleepInSecond(2);
		return this;
	}
	public TeduLoginPage IsUpdatePassSuccessFullyAlerDisplayed() {
		isElementDisplayed(alert_UpdatePassSuccessfully);
		return this;
	}
	
}
