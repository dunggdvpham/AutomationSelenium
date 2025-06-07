package automation.pageLocators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import automation.common.BaseCommand;

public class TeduUpdatePassPage extends BaseCommand{
	public WebDriver driver;
	private By tf_OldPass = By.id("OldPassword");
	private By tf_NewPass = By.id("NewPassword");
	private By tf_ConfirmPass = By.id("ConfirmNewPassword");
	private By btn_Update = By.xpath("//input[@value = 'Cập nhật']");
	private By tile_UpdatePass = By.id("//li[text() = 'Đổi mật khẩu']");
	private By tile_FaileUpdate = By.id("//li[text() ='Có lỗi khi đổi mật khẩu. Liên hệ quản trị để được hỗ trợ.']");
	public TeduUpdatePassPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(id = "OldPassword") WebElement tf_OldPass;
//	@FindBy(id = "NewPassword") WebElement tf_NewPass;
//	@FindBy(id = "ConfirmNewPassword") WebElement tf_ConfirmPass;
//	@FindBy(xpath = "//input[@value = 'Cập nhật']") WebElement btn_Update;
//	@FindBy(xpath = "//li[text() = 'Đổi mật khẩu']") WebElement tile_UpdatePass;
//	@FindBy(xpath = "//li[text() ='Có lỗi khi đổi mật khẩu. Liên hệ quản trị để được hỗ trợ.']") WebElement tile_FaileUpdate;
	
//	public TeduUpdatePassPage UpdatePass(String oldPass, String newPass) {
//		tf_OldPass.sendKeys(oldPass);
//		tf_NewPass.sendKeys(newPass);
//		tf_ConfirmPass.sendKeys(newPass);
//		sleepInSecond(2);
//		btn_Update.click();
//		return this;
//	}
//	public TeduUpdatePassPage IsUpdatePassScreenDisplayed() {
//		assertTrue(tile_UpdatePass.isDisplayed());
//		return this;
//	}
//	public TeduUpdatePassPage IsFailedUpdateAlertDisplayed() {
//		assertTrue(tile_FaileUpdate.isDisplayed());
//		return this;
//	}
	//home work
	public TeduUpdatePassPage UpdatePass(String oldPass, String newPass) {
		sendKeyToElemet(tf_OldPass, oldPass);
		sendKeyToElemet(tf_NewPass, newPass);
		sendKeyToElemet(tf_ConfirmPass, newPass);
		sleepInSecond(2);
		clickOnElement(btn_Update);
		return this;
	}
	public TeduUpdatePassPage IsUpdatePassScreenDisplayed() {
		isElementDisplayed(tile_UpdatePass);;
		return this;
	}
	public TeduUpdatePassPage IsFailedUpdateAlertDisplayed() {
		isElementDisplayed(tile_FaileUpdate);;
		return this;
}
}
