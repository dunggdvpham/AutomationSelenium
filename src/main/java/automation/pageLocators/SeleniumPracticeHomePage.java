package automation.pageLocators;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.common.BaseCommand;

public class SeleniumPracticeHomePage extends BaseCommand{
	public WebDriver driver;
	public By btn_TryIt = By.xpath("//button[text() = 'Try it']");
	public SeleniumPracticeHomePage (WebDriver _driver) {
		this.driver = _driver;
	}
	public SeleniumPracticeHomePage ClickOnTryIt() {
		clickOnElement(btn_TryIt);
		return this;
	}
	public SeleniumPracticeHomePage VerifyTextFromAlertEqual(String value) {
		assertEquals(getTextFromAlert(), value);
		return this;
	}
 }
