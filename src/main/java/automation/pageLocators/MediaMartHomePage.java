package automation.pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;

public class MediaMartHomePage extends BaseCommand{
	public WebDriver driver;
	private By iframe_Zalo = By.xpath("//iframe[contains(@src , 'zalo')]");
	private By lnk_Zalo = By.xpath("//div[@class = 'za-chat']");
	private By ele_lbl_ChatByZalo = By.xpath("//div[text() = 'Chat bằng Zalo']");
	public MediaMartHomePage(WebDriver _driver) {
		this.driver = _driver;
	}
	public MediaMartHomePage AccessZaloIframe() {
		switchToIframeByXpath(iframe_Zalo);
		sleepInSecond(2);
		clickOnElement(lnk_Zalo);
		return this;
	}
	public MediaMartHomePage VerifyZaloChatBoxIsDisplayed() {
		isElementDisplayed(ele_lbl_ChatByZalo);
		return this;
	}
	
	
}
